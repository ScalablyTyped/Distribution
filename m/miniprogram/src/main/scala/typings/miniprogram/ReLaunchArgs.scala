package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReLaunchArgs extends AsyncCallback[Unit] {
  
  /**
    * Page path If the page is not a tabbar page, the path can be
    * followed by parameters. Rules for the parameters: The path and
    *  parameter are separated with ?, the parameter key and the
    * parameter value are connected with =, and different parameters
    *  must be separated with &, such as path?key1=value1&key2=value2.
    */
  var url: String = js.native
}
object ReLaunchArgs {
  
  @scala.inline
  def apply(url: String): ReLaunchArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReLaunchArgs]
  }
  
  @scala.inline
  implicit class ReLaunchArgsOps[Self <: ReLaunchArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
