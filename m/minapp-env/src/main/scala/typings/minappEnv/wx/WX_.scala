package typings.minappEnv.wx

import typings.minappEnv.anon.CallFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WX_ extends StObject {
  
  var cloud: CallFunction = js.native
}
object WX_ {
  
  @scala.inline
  def apply(cloud: CallFunction): WX_ = {
    val __obj = js.Dynamic.literal(cloud = cloud.asInstanceOf[js.Any])
    __obj.asInstanceOf[WX_]
  }
  
  @scala.inline
  implicit class WX_MutableBuilder[Self <: WX_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloud(value: CallFunction): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
  }
}
