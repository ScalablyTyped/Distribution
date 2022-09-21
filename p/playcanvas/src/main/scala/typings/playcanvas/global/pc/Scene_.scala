package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/entity.js').Entity} Entity */
/** @typedef {import('../graphics/graphics-device.js').GraphicsDevice} GraphicsDevice */
/** @typedef {import('../graphics/texture.js').Texture} Texture */
/** @typedef {import('./composition/layer-composition.js').LayerComposition} LayerComposition */
/** @typedef {import('./layer.js').Layer} Layer */
/**
  * A scene is graphical representation of an environment. It manages the scene hierarchy, all
  * graphical objects, lights, and scene-wide properties.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.Scene")
@js.native
open class Scene_ protected ()
  extends typings.playcanvas.mod.Scene_ {
  /**
    * Create a new Scene instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this scene.
    * @hideconstructor
    */
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice) = this()
}
