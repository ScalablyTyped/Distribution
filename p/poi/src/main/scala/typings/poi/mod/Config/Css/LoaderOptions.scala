package typings.poi.mod.Config.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var css: js.UndefOr[js.Any] = js.undefined
  var less: js.UndefOr[js.Any] = js.undefined
  var postcss: js.UndefOr[js.Any] = js.undefined
  var sass: js.UndefOr[js.Any] = js.undefined
  var stylus: js.UndefOr[js.Any] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    css: js.Any = null,
    less: js.Any = null,
    postcss: js.Any = null,
    sass: js.Any = null,
    stylus: js.Any = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (less != null) __obj.updateDynamic("less")(less.asInstanceOf[js.Any])
    if (postcss != null) __obj.updateDynamic("postcss")(postcss.asInstanceOf[js.Any])
    if (sass != null) __obj.updateDynamic("sass")(sass.asInstanceOf[js.Any])
    if (stylus != null) __obj.updateDynamic("stylus")(stylus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
}

