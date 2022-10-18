package typings.playcanvas.global.pc

import typings.playcanvas.mod.ForwardRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The lightmapper is used to bake scene lights into textures.
  */
@JSGlobal("pc.Lightmapper")
@js.native
open class Lightmapper protected ()
  extends typings.playcanvas.mod.Lightmapper {
  /**
    * Create a new Lightmapper instance.
    *
    * @param {GraphicsDevice} device - The graphics device used by the lightmapper.
    * @param {Entity} root - The root entity of the scene.
    * @param {Scene} scene - The scene to lightmap.
    * @param {ForwardRenderer} renderer - The renderer.
    * @param {AssetRegistry} assets - Registry of assets to lightmap.
    * @hideconstructor
    */
  def this(
    device: typings.playcanvas.mod.GraphicsDevice,
    root: typings.playcanvas.mod.Entity,
    scene: typings.playcanvas.mod.Scene_,
    renderer: ForwardRenderer,
    assets: typings.playcanvas.mod.AssetRegistry
  ) = this()
}
