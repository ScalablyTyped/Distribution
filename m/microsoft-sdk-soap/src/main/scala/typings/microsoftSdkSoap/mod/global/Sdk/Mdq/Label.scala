package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var LocalizedLabels: js.Array[LocalizedLabel]
  
  var UserLocalizedLabel: LocalizedLabel
}
object Label {
  
  inline def apply(LocalizedLabels: js.Array[LocalizedLabel], UserLocalizedLabel: LocalizedLabel): Label = {
    val __obj = js.Dynamic.literal(LocalizedLabels = LocalizedLabels.asInstanceOf[js.Any], UserLocalizedLabel = UserLocalizedLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setLocalizedLabels(value: js.Array[LocalizedLabel]): Self = StObject.set(x, "LocalizedLabels", value.asInstanceOf[js.Any])
    
    inline def setLocalizedLabelsVarargs(value: LocalizedLabel*): Self = StObject.set(x, "LocalizedLabels", js.Array(value :_*))
    
    inline def setUserLocalizedLabel(value: LocalizedLabel): Self = StObject.set(x, "UserLocalizedLabel", value.asInstanceOf[js.Any])
  }
}
