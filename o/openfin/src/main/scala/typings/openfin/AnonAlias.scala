package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlias extends js.Object {
  var alias: String
  var args: String
  var src: String
  var target: String
  var version: String
}

object AnonAlias {
  @scala.inline
  def apply(alias: String, args: String, src: String, target: String, version: String): AnonAlias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlias]
  }
}

