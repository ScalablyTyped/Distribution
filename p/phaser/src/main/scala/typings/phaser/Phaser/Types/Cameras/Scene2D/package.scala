package typings.phaser.Phaser.Types.Cameras

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Scene2D {
  type CameraFadeCallback = js.Function2[
    /* camera */ typings.phaser.Phaser.Cameras.Scene2D.Camera, 
    /* progress */ scala.Double, 
    scala.Unit
  ]
  type CameraFlashCallback = js.Function2[
    /* camera */ typings.phaser.Phaser.Cameras.Scene2D.Camera, 
    /* progress */ scala.Double, 
    scala.Unit
  ]
  type CameraPanCallback = js.Function4[
    /* camera */ typings.phaser.Phaser.Cameras.Scene2D.Camera, 
    /* progress */ scala.Double, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    scala.Unit
  ]
  type CameraShakeCallback = js.Function2[
    /* camera */ typings.phaser.Phaser.Cameras.Scene2D.Camera, 
    /* progress */ scala.Double, 
    scala.Unit
  ]
  type CameraZoomCallback = js.Function3[
    /* camera */ typings.phaser.Phaser.Cameras.Scene2D.Camera, 
    /* progress */ scala.Double, 
    /* zoom */ scala.Double, 
    scala.Unit
  ]
}
