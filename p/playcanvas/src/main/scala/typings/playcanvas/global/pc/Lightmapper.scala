package typings.playcanvas.global.pc

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
    * @param {import('../../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device used by the lightmapper.
    * @param {import('../entity.js').Entity} root - The root entity of the scene.
    * @param {import('../../scene/scene.js').Scene} scene - The scene to lightmap.
    * @param {import('../../scene/renderer/forward-renderer.js').ForwardRenderer} renderer - The
    * renderer.
    * @param {import('../asset/asset-registry.js').AssetRegistry} assets - Registry of assets to
    * lightmap.
    * @hideconstructor
    */
  def this(
    device: typings.playcanvas.mod.GraphicsDevice,
    root: typings.playcanvas.mod.Entity,
    scene: typings.playcanvas.mod.Scene_,
    renderer: typings.playcanvas.mod.ForwardRenderer,
    assets: typings.playcanvas.mod.AssetRegistry
  ) = this()
}
