package typings.msDashRestDashAzure.msDashRestDashAzureMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify adal.TokenResponse * / any */ trait TokenResponse
  extends /* x */ StringDictionary[js.Any] {
  /**
    * @property {number} [notBefore] The time from which the access token becomes usable.
    * The date is represented as the number of seconds from 1970-01-01T0:0:0Z UTC until time of validity for the token.
    */
  var notBefore: js.UndefOr[Double] = js.undefined
}

object TokenResponse {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.Any] = null, notBefore: Int | Double = null): TokenResponse = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
}

