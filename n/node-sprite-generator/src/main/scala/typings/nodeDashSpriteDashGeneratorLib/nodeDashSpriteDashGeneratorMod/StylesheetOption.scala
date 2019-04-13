package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesheetOption extends js.Object {
  var nameMapping: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var spritePath: js.UndefOr[java.lang.String] = js.undefined
}

object StylesheetOption {
  @scala.inline
  def apply(
    nameMapping: () => java.lang.String = null,
    pixelRatio: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    spritePath: java.lang.String = null
  ): StylesheetOption = {
    val __obj = js.Dynamic.literal()
    if (nameMapping != null) __obj.updateDynamic("nameMapping")(js.Any.fromFunction0(nameMapping))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (spritePath != null) __obj.updateDynamic("spritePath")(spritePath)
    __obj.asInstanceOf[StylesheetOption]
  }
}

