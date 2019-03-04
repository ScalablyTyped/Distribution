package typings
package ngtoasterLib.ngtoasterMod.ngtoasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconClasses extends js.Object {
  var error: java.lang.String
  var info: java.lang.String
  var success: java.lang.String
  @JSName("wait")
  var wait_FIIconClasses: java.lang.String
  var warning: java.lang.String
}

object IIconClasses {
  @scala.inline
  def apply(
    error: java.lang.String,
    info: java.lang.String,
    success: java.lang.String,
    wait: java.lang.String,
    warning: java.lang.String
  ): IIconClasses = {
    val __obj = js.Dynamic.literal(error = error, info = info, success = success, wait = wait, warning = warning)
  
    __obj.asInstanceOf[IIconClasses]
  }
}

