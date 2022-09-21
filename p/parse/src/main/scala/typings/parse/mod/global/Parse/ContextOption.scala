package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextOption extends StObject {
  
  var context: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ContextOption {
  
  inline def apply(): ContextOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOption]
  }
  
  extension [Self <: ContextOption](x: Self) {
    
    inline def setContext(value: StringDictionary[Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
