package typings
package neffosDotJsLib.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reconnnect: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    headers: Headers = null,
    protocols: js.Array[java.lang.String] = null,
    reconnnect: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (reconnnect != null) __obj.updateDynamic("reconnnect")(reconnnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

