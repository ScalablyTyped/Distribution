package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpenOptions
  extends /* propName */ StringDictionary[js.Any] {
  var openOptions: OpenOptions
}

object AnonOpenOptions {
  @scala.inline
  def apply(openOptions: OpenOptions, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonOpenOptions = {
    val __obj = js.Dynamic.literal(openOptions = openOptions.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonOpenOptions]
  }
}

