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
    val __obj = js.Dynamic.literal(error = error, info = info, success = success, wait = wait, warning = warning)
  
    __obj.asInstanceOf[IIconClasses]
  }
}

