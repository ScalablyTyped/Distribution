package typings.nodeVault.mod

import typings.nodeVault.anon.Method
import typings.request.mod.CoreOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultOptions extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  var apiVersion: js.UndefOr[String] = js.undefined
  var commands: js.UndefOr[js.Array[Method]] = js.undefined
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var mustache: js.UndefOr[js.Any] = js.undefined
  var `request-promise`: js.UndefOr[js.Any] = js.undefined
  var requestOptions: js.UndefOr[CoreOptions] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var tv4: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object VaultOptions {
  @scala.inline
  def apply(
    Promise: PromiseConstructor = null,
    apiVersion: String = null,
    commands: js.Array[Method] = null,
    debug: /* repeated */ js.Any => _ = null,
    endpoint: String = null,
    mustache: js.Any = null,
    `request-promise`: js.Any = null,
    requestOptions: CoreOptions = null,
    token: String = null,
    tv4: /* repeated */ js.Any => _ = null
  ): VaultOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (mustache != null) __obj.updateDynamic("mustache")(mustache.asInstanceOf[js.Any])
    if (`request-promise` != null) __obj.updateDynamic("request-promise")(`request-promise`.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (tv4 != null) __obj.updateDynamic("tv4")(js.Any.fromFunction1(tv4))
    __obj.asInstanceOf[VaultOptions]
  }
}

