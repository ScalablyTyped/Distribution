package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppUuid extends StObject {
  
  var appUuid: String = js.native
  
  var windowName: String = js.native
}
object AppUuid {
  
  @scala.inline
  def apply(appUuid: String, windowName: String): AppUuid = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUuid]
  }
  
  @scala.inline
  implicit class AppUuidMutableBuilder[Self <: AppUuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUuid(value: String): Self = StObject.set(x, "appUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
  }
}
