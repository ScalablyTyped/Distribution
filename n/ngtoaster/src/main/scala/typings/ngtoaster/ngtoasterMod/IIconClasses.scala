package typings.ngtoaster.ngtoasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconClasses extends js.Object {
  var error: String
  var info: String
  var success: String
  @JSName("wait")
  var wait_FIIconClasses: String
  var warning: String
}

object IIconClasses {
  @scala.inline
  def apply(error: String, info: String, success: String, wait: String, warning: String): IIconClasses = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIconClasses]
  }
}

