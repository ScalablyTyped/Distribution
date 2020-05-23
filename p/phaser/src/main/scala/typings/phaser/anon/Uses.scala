package typings.phaser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.MatterJS.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uses
  extends /* _ */ StringDictionary[js.Any] {
  var uses: js.UndefOr[js.Array[Plugin | String]] = js.undefined
}

object Uses {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    uses: js.Array[Plugin | String] = null
  ): Uses = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uses]
  }
}

