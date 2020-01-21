package typings.mithril.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRec
  extends // Ideally, it'd be this:
// `[key: string | number]: Params | !symbol & !object`
/* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | Params]]

object ParamsRec {
  @scala.inline
  def apply(
    StringDictionary: // Ideally, it'd be this:
  // `[key: string | number]: Params | !symbol & !object`
  /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | Params]] = null
  ): ParamsRec = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParamsRec]
  }
}

