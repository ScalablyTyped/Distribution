package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gender extends StObject {
  
  /** The type of pronouns that should be used to address the person. The value can be custom or one of these predefined values: * `male` * `female` * `other` */
  var addressMeAs: js.UndefOr[String] = js.native
  
  /**
    * Output only. The value of the gender translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. Unspecified or custom value are not
    * localized.
    */
  var formattedValue: js.UndefOr[String] = js.native
  
  /** Metadata about the gender. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The gender for the person. The gender can be custom or one of these predefined values: * `male` * `female` * `unspecified` */
  var value: js.UndefOr[String] = js.native
}
object Gender {
  
  @scala.inline
  def apply(): Gender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gender]
  }
  
  @scala.inline
  implicit class GenderMutableBuilder[Self <: Gender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressMeAs(value: String): Self = StObject.set(x, "addressMeAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressMeAsUndefined: Self = StObject.set(x, "addressMeAs", js.undefined)
    
    @scala.inline
    def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
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
