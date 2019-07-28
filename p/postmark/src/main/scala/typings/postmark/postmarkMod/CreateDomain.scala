package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomain extends js.Object {
  var Name: String
  var ReturnPathDomain: js.UndefOr[String] = js.undefined
}

object CreateDomain {
  @scala.inline
  def apply(Name: String, ReturnPathDomain: String = null): CreateDomain = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ReturnPathDomain != null) __obj.updateDynamic("ReturnPathDomain")(ReturnPathDomain)
    __obj.asInstanceOf[CreateDomain]
  }
}

