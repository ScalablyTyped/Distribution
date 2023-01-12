package typings.pkijs.anon

import typings.pkijs.mod.ExtensionsSchema
import typings.pkijs.mod.RelativeDistinguishedNamesSchema
import typings.pkijs.mod.SingleResponseSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducedAt extends StObject {
  
  var ResponseDataByKey: js.UndefOr[String] = js.undefined
  
  var ResponseDataByName: js.UndefOr[RelativeDistinguishedNamesSchema] = js.undefined
  
  var extensions: js.UndefOr[ExtensionsSchema] = js.undefined
  
  var producedAt: js.UndefOr[String] = js.undefined
  
  var responderID: js.UndefOr[String] = js.undefined
  
  var response: js.UndefOr[SingleResponseSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object ProducedAt {
  
  inline def apply(): ProducedAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducedAt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProducedAt] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: ExtensionsSchema): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setProducedAt(value: String): Self = StObject.set(x, "producedAt", value.asInstanceOf[js.Any])
    
    inline def setProducedAtUndefined: Self = StObject.set(x, "producedAt", js.undefined)
    
    inline def setResponderID(value: String): Self = StObject.set(x, "responderID", value.asInstanceOf[js.Any])
    
    inline def setResponderIDUndefined: Self = StObject.set(x, "responderID", js.undefined)
    
    inline def setResponse(value: SingleResponseSchema): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseDataByKey(value: String): Self = StObject.set(x, "ResponseDataByKey", value.asInstanceOf[js.Any])
    
    inline def setResponseDataByKeyUndefined: Self = StObject.set(x, "ResponseDataByKey", js.undefined)
    
    inline def setResponseDataByName(value: RelativeDistinguishedNamesSchema): Self = StObject.set(x, "ResponseDataByName", value.asInstanceOf[js.Any])
    
    inline def setResponseDataByNameUndefined: Self = StObject.set(x, "ResponseDataByName", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
