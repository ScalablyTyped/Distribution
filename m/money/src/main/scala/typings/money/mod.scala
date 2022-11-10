package typings.money

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.money.anon.From
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("money", JSImport.Namespace)
  @js.native
  open class ^[T_VAL /* <: Value */] protected ()
    extends StObject
       with Wrapper[T_VAL] {
    def this(`val`: T_VAL) = this()
  }
  @JSImport("money", JSImport.Namespace)
  @js.native
  val ^ : FX = js.native
  
  type Currency = String
  
  @js.native
  trait FX
    extends StObject
       with Instantiable1[/* val */ Value, Wrapper[Value]] {
    
    /**
      * If fx(val) is called as a function, it returns a wrapped object that can be used OO-style
      */
    def apply(`val`: String): Wrapper[String] = js.native
    def apply(`val`: js.Array[Double | String]): Wrapper[js.Array[String]] = js.native
    def apply(`val`: Double): Wrapper[Double] = js.native
    
    /**
      * Default exchange rate base currency (eg "USD"), which all the exchange rates are relative to
      */
    var base: Currency = js.native
    
    /**
      * Converts a value from one currency to another
      */
    def convert(`val`: String): Result[String] = js.native
    def convert(`val`: String, opts: Options): Result[String] = js.native
    def convert(`val`: js.Array[Double | String]): Result[js.Array[String]] = js.native
    def convert(`val`: js.Array[Double | String], opts: Options): Result[js.Array[String]] = js.native
    def convert(`val`: Double): Result[Double] = js.native
    def convert(`val`: Double, opts: Options): Result[Double] = js.native
    
    /**
      * Object containing exchange rates relative to the fx.base currency, eg { "GBP" : "0.64" }
      */
    var rates: Rates = js.native
    
    /**
      * Default from / to currencies for conversion via `convert()`
      */
    var settings: From = js.native
    
    /**
      * Current version
      */
    var version: String = js.native
  }
  
  trait Options extends StObject {
    
    var from: js.UndefOr[Currency] = js.undefined
    
    var to: js.UndefOr[Currency] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFrom(value: Currency): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Currency): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type Rates = Record[String, Double | String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T_VAL extends string | number ? number : std.Array<number>
    }}}
    */
  type Result[T_VAL /* <: Value */] = Double
  
  type Value = String | Double | (js.Array[Double | String])
  
  @js.native
  trait Wrapper[T_VAL /* <: Value */] extends StObject {
    
    def convert(): Result[T_VAL] = js.native
    def convert(opts: Options): Result[T_VAL] = js.native
    
    def from(currency: Currency): Wrapper[T_VAL] = js.native
    
    def to(currency: Currency): Result[T_VAL] = js.native
  }
  
  type _To = FX
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FX = ^
}
