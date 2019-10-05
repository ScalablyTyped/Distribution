package typings.phaser.Phaser.Types.Cameras

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Scene2D {
  import typings.phaser.Phaser.Cameras.Scene2D.Camera

  type CameraFadeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
  type CameraFlashCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
  type CameraPanCallback = js.Function4[/* camera */ Camera, /* progress */ Double, /* x */ Double, /* y */ Double, Unit]
  type CameraShakeCallback = js.Function2[/* camera */ Camera, /* progress */ Double, Unit]
  type CameraZoomCallback = js.Function3[/* camera */ Camera, /* progress */ Double, /* zoom */ Double, Unit]
}
