package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of an AssetRegistry.
  * Note: PlayCanvas scripts are provided with an AssetRegistry instance as 'app.assets'.
  * @property prefix - A URL prefix that will be added to all asset loading requests.
  * @param loader - The ResourceLoader used to load the asset files.
  */
@JSImport("playcanvas", "AssetRegistry")
@js.native
class AssetRegistry protected ()
  extends StObject
     with typings.playcanvas.pc.AssetRegistry {
  def this(loader: typings.playcanvas.pc.ResourceLoader) = this()
}
