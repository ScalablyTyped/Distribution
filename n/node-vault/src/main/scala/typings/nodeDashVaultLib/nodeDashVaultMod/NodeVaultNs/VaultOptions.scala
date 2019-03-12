package typings
package nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultOptions extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var commands: js.UndefOr[js.Array[nodeDashVaultLib.Anon_Method]] = js.undefined
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var mustache: js.UndefOr[mustacheLib.mustacheMod.MustacheStatic] = js.undefined
  var `request-promise`: js.UndefOr[js.Any] = js.undefined
  var requestOptions: js.UndefOr[requestLib.requestMod.requestNs.CoreOptions] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var tv4: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object VaultOptions {
  @scala.inline
  def apply(
    Promise: stdLib.PromiseConstructor = null,
    apiVersion: java.lang.String = null,
    commands: js.Array[nodeDashVaultLib.Anon_Method] = null,
    debug: /* repeated */ js.Any => _ = null,
    endpoint: java.lang.String = null,
    mustache: mustacheLib.mustacheMod.MustacheStatic = null,
    `request-promise`: js.Any = null,
    requestOptions: requestLib.requestMod.requestNs.CoreOptions = null,
    token: java.lang.String = null,
    tv4: /* repeated */ js.Any => _ = null
  ): VaultOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (mustache != null) __obj.updateDynamic("mustache")(mustache)
    if (`request-promise` != null) __obj.updateDynamic("request-promise")(`request-promise`)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (token != null) __obj.updateDynamic("token")(token)
    if (tv4 != null) __obj.updateDynamic("tv4")(js.Any.fromFunction1(tv4))
    __obj.asInstanceOf[VaultOptions]
  }
}

