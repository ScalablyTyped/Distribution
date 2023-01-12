package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineObjectProperties extends StObject {
  
  /** The embedded object of this inline object. */
  var embeddedObject: js.UndefOr[EmbeddedObject] = js.undefined
}
object InlineObjectProperties {
  
  inline def apply(): InlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineObjectProperties] (val x: Self) extends AnyVal {
    
    inline def setEmbeddedObject(value: EmbeddedObject): Self = StObject.set(x, "embeddedObject", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectUndefined: Self = StObject.set(x, "embeddedObject", js.undefined)
  }
}
