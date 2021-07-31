package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Syntax extends StObject {
  
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[Parser] = js.undefined
  
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringifier] = js.undefined
}
object Syntax {
  
  @scala.inline
  def apply(): Syntax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Syntax]
  }
  
  @scala.inline
  implicit class SyntaxMutableBuilder[Self <: Syntax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setStringify(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringify", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
  }
}
