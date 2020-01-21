package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromStep
  extends /* propName */ StringDictionary[js.Any] {
  var fromStep: String
  var toStep: String
}

object AnonFromStep {
  @scala.inline
  def apply(fromStep: String, toStep: String, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonFromStep = {
    val __obj = js.Dynamic.literal(fromStep = fromStep.asInstanceOf[js.Any], toStep = toStep.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFromStep]
  }
}

