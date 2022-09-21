package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.nodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Syntax extends StObject {
  
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[Parser[typings.postcss.rootMod.default | typings.postcss.documentMod.default]] = js.undefined
  
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringifier] = js.undefined
}
object Syntax {
  
  inline def apply(): Syntax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Syntax]
  }
  
  extension [Self <: Syntax](x: Self) {
    
    inline def setParse(
      value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => typings.postcss.rootMod.default | typings.postcss.documentMod.default
    ): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setStringify(value: (/* node */ AnyNode, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringify", js.Any.fromFunction2(value))
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
  }
}
