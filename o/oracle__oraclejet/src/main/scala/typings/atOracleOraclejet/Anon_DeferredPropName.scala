package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeferredPropName
  extends /* propName */ StringDictionary[js.Any] {
  var deferred: js.UndefOr[Boolean] = js.undefined
}

object Anon_DeferredPropName {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    deferred: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeferredPropName = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    __obj.asInstanceOf[Anon_DeferredPropName]
  }
}

