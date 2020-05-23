package typings.motionSensorsPolyfill

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventHandler = js.Function1[/* event */ typings.std.Event, scala.Unit]
  type RotationMatrixType = typings.std.Float32Array | typings.std.Float64Array | typings.std.DOMMatrix
}
