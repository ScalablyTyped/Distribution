package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.AssetRegistry
  * @extends pc.EventHandler
  * @classdesc Container for all assets that are available to this application
  * @description Create an instance of an AssetRegistry.
  * Note: PlayCanvas scripts are provided with an AssetRegistry instance as 'app.assets'.
  * @param {pc.ResourceLoader} loader The ResourceLoader used to load the asset files.
  * @property {String} prefix A URL prefix that will be added to all asset loading requests.
  */
@JSImport("playcanvas", "AssetRegistry")
@js.native
class AssetRegistry protected ()
  extends typings.playcanvas.pcNs.AssetRegistry {
  def this(loader: typings.playcanvas.pcNs.ResourceLoader) = this()
}

