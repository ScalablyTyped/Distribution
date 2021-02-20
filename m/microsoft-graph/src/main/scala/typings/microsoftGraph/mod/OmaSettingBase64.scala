package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmaSettingBase64 extends OmaSetting {
  
  // File name associated with the Value property (.cer
  var fileName: js.UndefOr[NullableOption[String]] = js.native
  
  // Value. (Base64 encoded string)
  var value: js.UndefOr[String] = js.native
}
object OmaSettingBase64 {
  
  @scala.inline
  def apply(): OmaSettingBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingBase64]
  }
  
  @scala.inline
  implicit class OmaSettingBase64MutableBuilder[Self <: OmaSettingBase64] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
