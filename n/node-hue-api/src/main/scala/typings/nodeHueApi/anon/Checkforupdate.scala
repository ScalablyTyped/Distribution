package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkforupdate extends StObject {
  
  var checkforupdate: Boolean = js.native
  
  var devicetypes: Bridge = js.native
  
  @JSName("notify")
  var notify_FCheckforupdate: Boolean = js.native
  
  var text: String = js.native
  
  var updatestate: Double = js.native
  
  var url: String = js.native
}
object Checkforupdate {
  
  @scala.inline
  def apply(
    checkforupdate: Boolean,
    devicetypes: Bridge,
    notify_ : Boolean,
    text: String,
    updatestate: Double,
    url: String
  ): Checkforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate.asInstanceOf[js.Any], devicetypes = devicetypes.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatestate = updatestate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkforupdate]
  }
  
  @scala.inline
  implicit class CheckforupdateMutableBuilder[Self <: Checkforupdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckforupdate(value: Boolean): Self = StObject.set(x, "checkforupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicetypes(value: Bridge): Self = StObject.set(x, "devicetypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatestate(value: Double): Self = StObject.set(x, "updatestate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
