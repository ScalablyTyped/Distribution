package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOfGroupInfo extends StObject {
  
  /**
    * The UUID of the application this window entry belongs to.
    */
  var appUuid: String = js.native
  
  /**
    * The name of this window entry.
    */
  var windowName: String = js.native
}
object WindowOfGroupInfo {
  
  @scala.inline
  def apply(appUuid: String, windowName: String): WindowOfGroupInfo = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOfGroupInfo]
  }
  
  @scala.inline
  implicit class WindowOfGroupInfoMutableBuilder[Self <: WindowOfGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUuid(value: String): Self = StObject.set(x, "appUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
  }
}
