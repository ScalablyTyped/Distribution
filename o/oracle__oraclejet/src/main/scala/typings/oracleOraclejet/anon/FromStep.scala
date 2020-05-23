package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromStep
  extends /* key */ StringDictionary[js.Any] {
  var fromStep: String
  var toStep: String
}

object FromStep {
  @scala.inline
  def apply(fromStep: String, toStep: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): FromStep = {
    val __obj = js.Dynamic.literal(fromStep = fromStep.asInstanceOf[js.Any], toStep = toStep.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FromStep]
  }
}

