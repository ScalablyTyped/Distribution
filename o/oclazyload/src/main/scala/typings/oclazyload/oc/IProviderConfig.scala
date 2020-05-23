package typings.oclazyload.oc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProviderConfig extends js.Object {
  /**
    * If true, all errors will be logged to the console, in addition to rejecting a promise. Defaults to false.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, an event will be broadcast whenever a module, component or file is loaded. Events that can be broadcast are: ocLazyLoad.moduleLoaded,
    * ocLazyLoad.moduleReloaded, ocLazyLoad.componentLoaded, ocLazyLoad.fileLoaded. Defaults to false.
    */
  var events: js.UndefOr[Boolean] = js.undefined
  /**
    * Predefines a set of module configurations for later use. A name must be provided for each module so that it can be retrieved later.
    */
  var modules: js.UndefOr[js.Array[IModuleConfig]] = js.undefined
}

object IProviderConfig {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    events: js.UndefOr[Boolean] = js.undefined,
    modules: js.Array[IModuleConfig] = null
  ): IProviderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.get.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProviderConfig]
  }
}

