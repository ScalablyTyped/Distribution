package typings.phaser.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dict
  extends /* _ */ StringDictionary[js.Any] {
  var name: js.UndefOr[String] = js.undefined
}

object Dict {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, name: String = null): Dict = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dict]
  }
}

