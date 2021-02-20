package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OmaSettingInteger extends OmaSetting {
  
  // Value.
  var value: js.UndefOr[Double] = js.native
}
object OmaSettingInteger {
  
  @scala.inline
  def apply(): OmaSettingInteger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmaSettingInteger]
  }
  
  @scala.inline
  implicit class OmaSettingIntegerMutableBuilder[Self <: OmaSettingInteger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
