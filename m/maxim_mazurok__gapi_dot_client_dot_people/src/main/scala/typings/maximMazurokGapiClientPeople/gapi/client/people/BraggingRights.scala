package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BraggingRights extends StObject {
  
  /** Metadata about the bragging rights. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The bragging rights; for example, `climbed mount everest`. */
  var value: js.UndefOr[String] = js.native
}
object BraggingRights {
  
  @scala.inline
  def apply(): BraggingRights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BraggingRights]
  }
  
  @scala.inline
  implicit class BraggingRightsMutableBuilder[Self <: BraggingRights] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
