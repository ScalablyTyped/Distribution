package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesheetOption extends js.Object {
  var nameMapping: js.UndefOr[js.Function0[String]] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var spritePath: js.UndefOr[String] = js.undefined
}

object StylesheetOption {
  @scala.inline
  def apply(
    nameMapping: () => String = null,
    pixelRatio: Int | Double = null,
    prefix: String = null,
    spritePath: String = null
  ): StylesheetOption = {
    val __obj = js.Dynamic.literal()
    if (nameMapping != null) __obj.updateDynamic("nameMapping")(js.Any.fromFunction0(nameMapping))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (spritePath != null) __obj.updateDynamic("spritePath")(spritePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetOption]
  }
}

