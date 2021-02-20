package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of an AssetRegistry.
  * Note: PlayCanvas scripts are provided with an AssetRegistry instance as 'app.assets'.
  * @property prefix - A URL prefix that will be added to all asset loading requests.
  * @param loader - The ResourceLoader used to load the asset files.
  */
@JSGlobal("pc.AssetRegistry")
@js.native
class AssetRegistry protected ()
  extends typings.playcanvas.pc.AssetRegistry {
  def this(loader: typings.playcanvas.pc.ResourceLoader) = this()
}
