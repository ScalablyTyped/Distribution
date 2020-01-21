package typings.phaser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon
  extends /* _ */ StringDictionary[js.Any] {
  var name: js.UndefOr[String] = js.undefined
}

object Anon {
  @scala.inline
  def apply(StringDictionary: /* _ */ StringDictionary[js.Any] = null, name: String = null): Anon = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
}

