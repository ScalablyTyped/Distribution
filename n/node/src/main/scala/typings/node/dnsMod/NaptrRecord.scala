package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NaptrRecord extends js.Object {
  var flags: java.lang.String
  var order: Double
  var preference: Double
  var regexp: java.lang.String
  var replacement: java.lang.String
  var service: java.lang.String
}

object NaptrRecord {
  @scala.inline
  def apply(
    flags: java.lang.String,
    order: Double,
    preference: Double,
    regexp: java.lang.String,
    replacement: java.lang.String,
    service: java.lang.String
  ): NaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NaptrRecord]
  }
}

