package typings.mobxDashRemotedev.mobxDashRemotedevMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteDevConfig extends js.Object {
  /**map of arrays named whitelist or blacklist to filter action types. You can also set it globally in the extension settings.
    */
  var filters: js.UndefOr[js.Object] = js.undefined
  /**set it to true in order to assign dispatching of all unhandled actions to this store. Useful for nested classes /
    *  observables or when having async actions without specifying the scope explicitly. */
  var global: js.UndefOr[Boolean] = js.undefined
  /**use to specify host for remotedev-server. If port is specified, default value is localhost. */
  var hostname: js.UndefOr[String] = js.undefined
  /**the instance name to be showed on the monitor page. Default value is document.title. */
  var name: js.UndefOr[String] = js.undefined
  /**set it to true to have a clear log only with actions. If MobX is in strict mode, it is true by default. Don't forget about async actions. */
  var onlyActions: js.UndefOr[Boolean] = js.undefined
  /**use to specify host's port for remotedev-server. */
  var port: js.UndefOr[Double] = js.undefined
  /** set it to true to have remote monitoring via the local or remotedev.io server. remote: false is used for the extension or react-native-debugger */
  var remote: js.UndefOr[Boolean] = js.undefined
}

object RemoteDevConfig {
  @scala.inline
  def apply(
    filters: js.Object = null,
    global: js.UndefOr[Boolean] = js.undefined,
    hostname: String = null,
    name: String = null,
    onlyActions: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    remote: js.UndefOr[Boolean] = js.undefined
  ): RemoteDevConfig = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyActions)) __obj.updateDynamic("onlyActions")(onlyActions.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(remote)) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDevConfig]
  }
}

