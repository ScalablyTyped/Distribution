package typings.openfin.layoutMod

import typings.openfin.GoldenLayout.Config
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/platform/layout", "Layout")
@js.native
class Layout protected () extends js.Object {
  def this(identity: Identity) = this()
  
  /**
    * Replaces a Platform window's layout with a preset layout arrangement using the existing Views attached to the window.
    * The preset options are `columns`, `grid`, `rows`, and `tabs`.
    * @param { PresetLayoutOptions } options Mandatory object with `presetType` property that sets which preset layout arrangement to use.
    * The preset options are `columns`, `grid`, `rows`, and `tabs`.
    * @return { Promise<void> }
    * @tutorial Layout.applyPreset
    */
  def applyPreset(options: PresetLayoutOptions): js.Promise[Unit] = js.native
  
  /**
    * Returns the configuration of the window's layout.  Returns the same information that is returned for all windows in getSnapshot.
    * @return { Promise<LayoutConfig> }
    * @tutorial Layout.getConfig
    */
  def getConfig(): js.Promise[Config] = js.native
  
  var identity: Identity = js.native
  
  def init(): js.Promise[Layout] = js.native
  def init(options: InitLayoutOptions): js.Promise[Layout] = js.native
  
  var platform: js.Any = js.native
  
  /**
    * Replaces a Platform window's layout with a new layout.  Any views that were in the old layout but not the new layout
    * will be destroyed.
    * @param { LayoutConfig } layout New layout to implement in the target window.
    * Please see explanation of a layout {@link https://developers.openfin.co/docs/platform-api#section-layout here}.
    * @return { Promise<void> }
    * @tutorial Layout.replace
    */
  def replace(layout: Config): js.Promise[Unit] = js.native
}
