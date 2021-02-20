package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmaSettingStringXml extends OmaSetting {
  
  // File name associated with the Value property (.xml).
  var fileName: js.UndefOr[NullableOption[String]] = js.native
  
  // Value. (UTF8 encoded byte array)
  var value: js.UndefOr[Double] = js.native
}
object OmaSettingStringXml {
  
  @scala.inline
  def apply(): OmaSettingStringXml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingStringXml]
  }
  
  @scala.inline
  implicit class OmaSettingStringXmlMutableBuilder[Self <: OmaSettingStringXml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
