package typings
package atPostlightMercuryDashParserLib.atPostlightMercuryDashParserMod.MercuryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var contentType: js.UndefOr[
    atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.html | atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.markdown | atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.text
  ] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    contentType: atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.html | atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.markdown | atPostlightMercuryDashParserLib.atPostlightMercuryDashParserLibStrings.text = null,
    headers: js.Object = null,
    html: java.lang.String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (html != null) __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[ParseOptions]
  }
}

