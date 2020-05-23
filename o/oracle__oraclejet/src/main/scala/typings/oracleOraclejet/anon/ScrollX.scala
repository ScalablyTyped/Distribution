package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollX
  extends /* key */ StringDictionary[js.Any] {
  var scrollX: Double
  var scrollY: Double
}

object ScrollX {
  @scala.inline
  def apply(scrollX: Double, scrollY: Double, StringDictionary: /* name */ StringDictionary[js.Any] = null): ScrollX = {
    val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ScrollX]
  }
}

