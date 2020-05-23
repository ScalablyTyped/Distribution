package typings.openfin.mod.fin

import typings.openfin.GoldenLayout.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinLayout extends js.Object {
  // init: (options?: InitLayoutOptions) => Promise<Layout>;
  var identity: Identity
  /**
    * Replaces a Platform window's layout with a preset layout arrangement using the existing Views attached to the window.
    * The preset options are `columns`, `grid`, `rows`, and `tabs`.
    * @param { PresetLayoutOptions } options Mandatory object with `presetType` property that sets which preset layout arrangement to use.
    * The preset options are `columns`, `grid`, `rows`, and `tabs`.
    * @return { Promise<void> }
    * @tutorial Layout.applyPreset
    */
  def applyPreset(options: PresetLayoutOptions): js.Promise[Unit]
  /**
    * Returns the configuration of the window's layout.  Returns the same information that is returned for all windows in getSnapshot.
    * @return { Promise<LayoutConfig> }
    * @tutorial Layout.getConfig
    */
  def getConfig(): js.Promise[Config]
  /**
    * Replaces a Platform window's layout with a new layout.  Any views that were in the old layout but not the new layout
    * will be destroyed.
    * @param { LayoutConfig } layout New layout to implement in the target window.
    * Please see explanation of a layout {@link https://developers.openfin.co/docs/platform-api#section-layout here}.
    * @return { Promise<void> }
    * @tutorial Layout.replace
    */
  def replace(layout: Config): js.Promise[Unit]
}

object OpenFinLayout {
  @scala.inline
  def apply(
    applyPreset: PresetLayoutOptions => js.Promise[Unit],
    getConfig: () => js.Promise[Config],
    identity: Identity,
    replace: Config => js.Promise[Unit]
  ): OpenFinLayout = {
    val __obj = js.Dynamic.literal(applyPreset = js.Any.fromFunction1(applyPreset), getConfig = js.Any.fromFunction0(getConfig), identity = identity.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace))
    __obj.asInstanceOf[OpenFinLayout]
  }
}

