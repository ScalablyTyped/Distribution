package typings.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProto extends js.Object {
  var proto: js.UndefOr[String] = js.undefined
}

object AnonProto {
  @scala.inline
  def apply(proto: String = null): AnonProto = {
    val __obj = js.Dynamic.literal()
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProto]
  }
}

