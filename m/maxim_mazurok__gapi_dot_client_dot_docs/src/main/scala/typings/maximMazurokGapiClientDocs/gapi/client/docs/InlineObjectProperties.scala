package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineObjectProperties extends StObject {
  
  /** The embedded object of this inline object. */
  var embeddedObject: js.UndefOr[EmbeddedObject] = js.native
}
object InlineObjectProperties {
  
  @scala.inline
  def apply(): InlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectProperties]
  }
  
  @scala.inline
  implicit class InlineObjectPropertiesMutableBuilder[Self <: InlineObjectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddedObject(value: EmbeddedObject): Self = StObject.set(x, "embeddedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectUndefined: Self = StObject.set(x, "embeddedObject", js.undefined)
  }
}
