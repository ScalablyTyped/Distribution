package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDocComment extends StObject {
  
  /**
    * The string that appears on the last line and closes the doc comment (e.g. ' * /').
    */
  var close: js.UndefOr[String] = js.undefined
  
  /**
    * The string that starts a doc comment (e.g. '/ **')
    */
  var open: String
}
object IDocComment {
  
  inline def apply(open: String): IDocComment = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocComment]
  }
  
  extension [Self <: IDocComment](x: Self) {
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
