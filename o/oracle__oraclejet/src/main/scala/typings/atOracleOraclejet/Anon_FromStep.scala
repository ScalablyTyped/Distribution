package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromStep
  extends /* propName */ StringDictionary[js.Any] {
  var fromStep: String
  var toStep: String
}

object Anon_FromStep {
  @scala.inline
  def apply(fromStep: String, toStep: String, StringDictionary: /* propName */ StringDictionary[js.Any] = null): Anon_FromStep = {
    val __obj = js.Dynamic.literal(fromStep = fromStep, toStep = toStep)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_FromStep]
  }
}

