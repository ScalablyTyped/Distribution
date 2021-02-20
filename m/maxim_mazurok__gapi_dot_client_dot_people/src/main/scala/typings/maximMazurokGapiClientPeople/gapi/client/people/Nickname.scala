package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nickname extends StObject {
  
  /** Metadata about the nickname. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The type of the nickname. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The nickname. */
  var value: js.UndefOr[String] = js.native
}
object Nickname {
  
  @scala.inline
  def apply(): Nickname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nickname]
  }
  
  @scala.inline
  implicit class NicknameMutableBuilder[Self <: Nickname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
