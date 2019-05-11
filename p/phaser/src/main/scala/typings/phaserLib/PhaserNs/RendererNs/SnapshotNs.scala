package typings
package phaserLib.PhaserNs.RendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Renderer.Snapshot")
@js.native
object SnapshotNs extends js.Object {
  /**
    * Takes a snapshot of an area from the current frame displayed by a canvas.
    * 
    * This is then copied to an Image object. When this loads, the results are sent
    * to the callback provided in the Snapshot Configuration object.
    * @param sourceCanvas The canvas to take a snapshot of.
    * @param config The snapshot configuration object.
    */
  def Canvas(
    sourceCanvas: stdLib.HTMLCanvasElement,
    config: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotState
  ): scala.Unit = js.native
  /**
    * Takes a snapshot of an area from the current frame displayed by a WebGL canvas.
    * 
    * This is then copied to an Image object. When this loads, the results are sent
    * to the callback provided in the Snapshot Configuration object.
    * @param sourceCanvas The canvas to take a snapshot of.
    * @param config The snapshot configuration object.
    */
  def WebGL(
    sourceCanvas: stdLib.HTMLCanvasElement,
    config: phaserLib.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotState
  ): scala.Unit = js.native
}

