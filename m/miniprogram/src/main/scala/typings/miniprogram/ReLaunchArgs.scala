package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReLaunchArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  /**
    * Page path If the page is not a tabbar page, the path can be
    * followed by parameters. Rules for the parameters: The path and
    *  parameter are separated with ?, the parameter key and the
    * parameter value are connected with =, and different parameters
    *  must be separated with &, such as path?key1=value1&key2=value2.
    */
  var url: String
}
object ReLaunchArgs {
  
  @scala.inline
  def apply(url: String): ReLaunchArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReLaunchArgs]
  }
  
  @scala.inline
  implicit class ReLaunchArgsMutableBuilder[Self <: ReLaunchArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
