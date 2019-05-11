package typings
package phaserLib.PhaserNs.TypesNs.CamerasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Scene2DNs {
  type CameraFadeCallback = js.Function2[
    /* camera */ phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, 
    /* progress */ scala.Double, 
    scala.Unit
  ]
  type CameraFlashCallback = js.Function2[
    /* camera */ phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, 
    /* progress */ scala.Double, 
    scala.Unit
  ]
  type CameraPanCallback = js.Function4[
    /* camera */ phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, 
    /* progress */ scala.Double, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    scala.Unit
  ]
  type CameraShakeCallback = js.Function2[
    /* camera */ phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, 
    /* progress */ scala.Double, 
    scala.Unit
  ]
  type CameraZoomCallback = js.Function3[
    /* camera */ phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, 
    /* progress */ scala.Double, 
    /* zoom */ scala.Double, 
    scala.Unit
  ]
}
