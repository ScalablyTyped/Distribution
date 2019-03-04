package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomain extends js.Object {
  var Name: java.lang.String
  var ReturnPathDomain: js.UndefOr[java.lang.String] = js.undefined
}

object CreateDomain {
  @scala.inline
  def apply(Name: java.lang.String, ReturnPathDomain: java.lang.String = null): CreateDomain = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ReturnPathDomain != null) __obj.updateDynamic("ReturnPathDomain")(ReturnPathDomain)
    __obj.asInstanceOf[CreateDomain]
  }
}

