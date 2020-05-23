package typings.pdfParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var pagerender: js.UndefOr[js.Function1[/* pageData */ js.Any, String]] = js.undefined
  var version: js.UndefOr[Version] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    max: js.UndefOr[Double] = js.undefined,
    pagerender: /* pageData */ js.Any => String = null,
    version: Version = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (pagerender != null) __obj.updateDynamic("pagerender")(js.Any.fromFunction1(pagerender))
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

