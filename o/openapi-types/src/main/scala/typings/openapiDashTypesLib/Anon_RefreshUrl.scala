package typings
package openapiDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RefreshUrl extends js.Object {
  var refreshUrl: js.UndefOr[java.lang.String] = js.undefined
  var scopes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var tokenUrl: java.lang.String
}

object Anon_RefreshUrl {
  @scala.inline
  def apply(
    scopes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    tokenUrl: java.lang.String,
    refreshUrl: java.lang.String = null
  ): Anon_RefreshUrl = {
    val __obj = js.Dynamic.literal(scopes = scopes, tokenUrl = tokenUrl)
    if (refreshUrl != null) __obj.updateDynamic("refreshUrl")(refreshUrl)
    __obj.asInstanceOf[Anon_RefreshUrl]
  }
}

