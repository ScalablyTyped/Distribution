package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizedLabel extends StObject {
  
  var HasChanged: Boolean = js.native
  
  var IsManaged: Boolean = js.native
  
  var Label: String = js.native
  
  var LangaugeCode: Double = js.native
  
  var MetadataId: String = js.native
}
object LocalizedLabel {
  
  @scala.inline
  def apply(HasChanged: Boolean, IsManaged: Boolean, Label: String, LangaugeCode: Double, MetadataId: String): LocalizedLabel = {
    val __obj = js.Dynamic.literal(HasChanged = HasChanged.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], LangaugeCode = LangaugeCode.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedLabel]
  }
  
  @scala.inline
  implicit class LocalizedLabelMutableBuilder[Self <: LocalizedLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasChanged(value: Boolean): Self = StObject.set(x, "HasChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangaugeCode(value: Double): Self = StObject.set(x, "LangaugeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
  }
}
