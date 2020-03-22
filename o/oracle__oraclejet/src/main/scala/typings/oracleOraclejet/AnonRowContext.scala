package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowContext
  extends /* propName */ StringDictionary[js.Any] {
  var rowContext: js.Object
}

object AnonRowContext {
  @scala.inline
  def apply(rowContext: js.Object, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonRowContext = {
    val __obj = js.Dynamic.literal(rowContext = rowContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonRowContext]
  }
}

