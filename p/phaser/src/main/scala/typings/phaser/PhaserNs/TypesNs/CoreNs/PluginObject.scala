package typings.phaser.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginObject extends js.Object {
  /**
    * The default set of scene plugins (names).
    */
  var default: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Plugins to *add* to the default set of scene plugins.
    */
  var defaultMerge: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Global plugins to install.
    */
  var global: js.UndefOr[js.Array[PluginObjectItem]] = js.undefined
  /**
    * Scene plugins to install.
    */
  var scene: js.UndefOr[js.Array[PluginObjectItem]] = js.undefined
}

object PluginObject {
  @scala.inline
  def apply(
    default: js.Array[String] = null,
    defaultMerge: js.Array[String] = null,
    global: js.Array[PluginObjectItem] = null,
    scene: js.Array[PluginObjectItem] = null
  ): PluginObject = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (defaultMerge != null) __obj.updateDynamic("defaultMerge")(defaultMerge)
    if (global != null) __obj.updateDynamic("global")(global)
    if (scene != null) __obj.updateDynamic("scene")(scene)
    __obj.asInstanceOf[PluginObject]
  }
}

