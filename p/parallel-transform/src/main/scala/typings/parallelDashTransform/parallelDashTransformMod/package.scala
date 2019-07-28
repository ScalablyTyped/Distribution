package typings.parallelDashTransform

import typings.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parallelDashTransformMod {
  type OnTransform = js.Function2[/* chunk */ js.Any, /* callback */ TransformCallback, Unit]
}
