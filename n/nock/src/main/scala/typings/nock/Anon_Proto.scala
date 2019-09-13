package typings.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Proto extends js.Object {
  var proto: js.UndefOr[String] = js.undefined
}

object Anon_Proto {
  @scala.inline
  def apply(proto: String = null): Anon_Proto = {
    val __obj = js.Dynamic.literal()
    if (proto != null) __obj.updateDynamic("proto")(proto)
    __obj.asInstanceOf[Anon_Proto]
  }
}

