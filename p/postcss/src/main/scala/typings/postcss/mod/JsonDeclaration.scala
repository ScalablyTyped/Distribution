package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDeclaration
  extends StObject
     with JsonNode {
  
  /**
    * True if the declaration has an !important annotation.
    */
  var important: js.UndefOr[Boolean] = js.undefined
}
object JsonDeclaration {
  
  inline def apply(): JsonDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonDeclaration]
  }
  
  extension [Self <: JsonDeclaration](x: Self) {
    
    inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
  }
}
