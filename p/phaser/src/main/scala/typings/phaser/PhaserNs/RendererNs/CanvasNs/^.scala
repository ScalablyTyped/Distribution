package typings.phaser.PhaserNs.RendererNs.CanvasNs

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.TransformMatrix
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Renderer.Canvas")
@js.native
object ^ extends js.Object {
  /**
    * Returns an array which maps the default blend modes to supported Canvas blend modes.
    * 
    * If the browser doesn't support a blend mode, it will default to the normal `source-over` blend mode.
    */
  def GetBlendModes(): js.Array[_] = js.native
  /**
    * Takes a reference to the Canvas Renderer, a Canvas Rendering Context, a Game Object, a Camera and a parent matrix
    * and then performs the following steps:
    * 
    * 1. Checks the alpha of the source combined with the Camera alpha. If 0 or less it aborts.
    * 2. Takes the Camera and Game Object matrix and multiplies them, combined with the parent matrix if given.
    * 3. Sets the blend mode of the context to be that used by the Game Object.
    * 4. Sets the alpha value of the context to be that used by the Game Object combined with the Camera.
    * 5. Saves the context state.
    * 6. Sets the final matrix values into the context via setTransform.
    * 
    * This function is only meant to be used internally. Most of the Canvas Renderer classes use it.
    * @param renderer A reference to the current active Canvas renderer.
    * @param ctx The canvas context to set the transform on.
    * @param src The Game Object being rendered. Can be any type that extends the base class.
    * @param camera The Camera that is rendering the Game Object.
    * @param parentMatrix A parent transform matrix to apply to the Game Object before rendering.
    */
  def SetTransform(renderer: CanvasRenderer, ctx: CanvasRenderingContext2D, src: GameObject, camera: Camera): Boolean = js.native
  def SetTransform(
    renderer: CanvasRenderer,
    ctx: CanvasRenderingContext2D,
    src: GameObject,
    camera: Camera,
    parentMatrix: TransformMatrix
  ): Boolean = js.native
}

