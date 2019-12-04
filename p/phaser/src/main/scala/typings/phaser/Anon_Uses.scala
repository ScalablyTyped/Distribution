package typings.phaser

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.typesMatterMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Uses
  extends /* _ */ StringDictionary[js.Any] {
  var uses: js.UndefOr[js.Array[Plugin | String]] = js.undefined
}

object Anon_Uses {
  @scala.inline
  def apply(StringDictionary: /* _ */ StringDictionary[js.Any] = null, uses: js.Array[Plugin | String] = null): Anon_Uses = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Uses]
  }
}

