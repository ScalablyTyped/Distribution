package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessRelease extends js.Object {
  var headersUrl: js.UndefOr[java.lang.String] = js.undefined
  var libUrl: js.UndefOr[java.lang.String] = js.undefined
  var lts: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var sourceUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ProcessRelease {
  @scala.inline
  def apply(
    name: java.lang.String,
    headersUrl: java.lang.String = null,
    libUrl: java.lang.String = null,
    lts: java.lang.String = null,
    sourceUrl: java.lang.String = null
  ): ProcessRelease = {
    val __obj = js.Dynamic.literal(name = name)
    if (headersUrl != null) __obj.updateDynamic("headersUrl")(headersUrl)
    if (libUrl != null) __obj.updateDynamic("libUrl")(libUrl)
    if (lts != null) __obj.updateDynamic("lts")(lts)
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl)
    __obj.asInstanceOf[ProcessRelease]
  }
}

