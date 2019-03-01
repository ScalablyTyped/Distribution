package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeferredPropName
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var deferred: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DeferredPropName {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deferred: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DeferredPropName = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    __obj.asInstanceOf[Anon_DeferredPropName]
  }
}

