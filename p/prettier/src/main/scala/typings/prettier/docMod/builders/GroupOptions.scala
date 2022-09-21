package typings.prettier.docMod.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions extends StObject {
  
  var id: js.UndefOr[js.Symbol] = js.undefined
  
  var shouldBreak: js.UndefOr[Boolean] = js.undefined
}
object GroupOptions {
  
  inline def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  extension [Self <: GroupOptions](x: Self) {
    
    inline def setId(value: js.Symbol): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setShouldBreak(value: Boolean): Self = StObject.set(x, "shouldBreak", value.asInstanceOf[js.Any])
    
    inline def setShouldBreakUndefined: Self = StObject.set(x, "shouldBreak", js.undefined)
  }
}
