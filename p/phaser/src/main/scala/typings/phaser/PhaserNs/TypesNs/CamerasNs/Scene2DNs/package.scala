package typings.phaser.PhaserNs.TypesNs.CamerasNs

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Scene2DNs {
  type CameraFadeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
  type CameraFlashCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
  type CameraPanCallback = js.Function4[/* camera */ Camera, /* progress */ Double, /* x */ Double, /* y */ Double, Unit]
  type CameraShakeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
  type CameraZoomCallback = js.Function3[/* camera */ Camera, /* progress */ Double, /* zoom */ Double, Unit]
}
