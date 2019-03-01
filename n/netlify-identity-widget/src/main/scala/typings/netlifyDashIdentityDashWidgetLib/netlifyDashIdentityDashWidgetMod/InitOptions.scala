package typings
package netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  // Absolute url to endpoint. ONLY USE IN SPECIAL CASES!
  // e.g. https://www.example.com/.netlify/functions/identity
  // Generally avoid setting the APIUrl. You should only set this when
  // your app is served from a domain that differs from where the
  // identity endpoint is served.This is common for Cordova or Electron
  // apps where you host from localhost or a file.
  var APIUrl: js.UndefOr[java.lang.String] = js.undefined
  // The container to attach to. e.g.: '#some-query-selector'
  var container: js.UndefOr[java.lang.String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(APIUrl: java.lang.String = null, container: java.lang.String = null): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (APIUrl != null) __obj.updateDynamic("APIUrl")(APIUrl)
    if (container != null) __obj.updateDynamic("container")(container)
    __obj.asInstanceOf[InitOptions]
  }
}

