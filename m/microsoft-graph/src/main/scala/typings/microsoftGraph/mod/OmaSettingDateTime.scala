package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmaSettingDateTime extends OmaSetting {
  
  // Value.
  var value: js.UndefOr[String] = js.native
}
object OmaSettingDateTime {
  
  @scala.inline
  def apply(): OmaSettingDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingDateTime]
  }
  
  @scala.inline
  implicit class OmaSettingDateTimeMutableBuilder[Self <: OmaSettingDateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
