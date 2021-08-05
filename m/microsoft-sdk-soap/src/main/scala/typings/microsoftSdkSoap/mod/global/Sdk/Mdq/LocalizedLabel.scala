package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedLabel extends StObject {
  
  var HasChanged: Boolean
  
  var IsManaged: Boolean
  
  var Label: String
  
  var LangaugeCode: Double
  
  var MetadataId: String
}
object LocalizedLabel {
  
  inline def apply(HasChanged: Boolean, IsManaged: Boolean, Label: String, LangaugeCode: Double, MetadataId: String): LocalizedLabel = {
    val __obj = js.Dynamic.literal(HasChanged = HasChanged.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], LangaugeCode = LangaugeCode.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedLabel]
  }
  
  extension [Self <: LocalizedLabel](x: Self) {
    
    inline def setHasChanged(value: Boolean): Self = StObject.set(x, "HasChanged", value.asInstanceOf[js.Any])
    
    inline def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLangaugeCode(value: Double): Self = StObject.set(x, "LangaugeCode", value.asInstanceOf[js.Any])
    
    inline def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
  }
}
