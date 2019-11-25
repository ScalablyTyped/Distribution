package typings.neffosDotJs.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  var reconnnect: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(headers: Headers = null, protocols: js.Array[String] = null, reconnnect: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (reconnnect != null) __obj.updateDynamic("reconnnect")(reconnnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

