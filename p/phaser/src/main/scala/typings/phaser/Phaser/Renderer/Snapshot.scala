package typings.phaser.Phaser.Renderer

import typings.phaser.Phaser.Types.Renderer.Snapshot.SnapshotState
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Renderer.Snapshot")
@js.native
object Snapshot extends js.Object {
  /**
    * Takes a snapshot of an area from the current frame displayed by a canvas.
    * 
    * This is then copied to an Image object. When this loads, the results are sent
    * to the callback provided in the Snapshot Configuration object.
    * @param sourceCanvas The canvas to take a snapshot of.
    * @param config The snapshot configuration object.
    */
  def Canvas(sourceCanvas: HTMLCanvasElement, config: SnapshotState): Unit = js.native
  /**
    * Takes a snapshot of an area from the current frame displayed by a WebGL canvas.
    * 
    * This is then copied to an Image object. When this loads, the results are sent
    * to the callback provided in the Snapshot Configuration object.
    * @param sourceCanvas The canvas to take a snapshot of.
    * @param config The snapshot configuration object.
    */
  def WebGL(sourceCanvas: HTMLCanvasElement, config: SnapshotState): Unit = js.native
}

