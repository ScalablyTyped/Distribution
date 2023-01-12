package typings.ow

import typings.ow.anon.KinkeyofPredicatesOptiona
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModifiersMod {
  
  @JSImport("ow/dist/modifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](`object`: T): T & Modifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[T & Modifiers]
  
  trait Modifiers extends StObject {
    
    /**
      Make the following predicate optional so it doesn't fail when the value is `undefined`.
      */
    val optional: KinkeyofPredicatesOptiona
  }
  object Modifiers {
    
    inline def apply(optional: KinkeyofPredicatesOptiona): Modifiers = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifiers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Modifiers] (val x: Self) extends AnyVal {
      
      inline def setOptional(value: KinkeyofPredicatesOptiona): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends ow.ow/dist/predicates/base-predicate.BasePredicate<infer X> ? P & ow.ow/dist/predicates/base-predicate.BasePredicate<X | undefined> : P
    }}}
    */
  type Optionalify[P] = P
}
