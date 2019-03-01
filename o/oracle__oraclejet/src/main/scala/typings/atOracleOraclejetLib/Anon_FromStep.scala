package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromStep
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var fromStep: java.lang.String
  var toStep: java.lang.String
}

object Anon_FromStep {
  @scala.inline
  def apply(
    fromStep: java.lang.String,
    toStep: java.lang.String,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_FromStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromStep")(fromStep)
    __obj.updateDynamic("toStep")(toStep)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_FromStep]
  }
}

