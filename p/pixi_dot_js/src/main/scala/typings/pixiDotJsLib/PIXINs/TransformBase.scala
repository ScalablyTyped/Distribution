package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TransformBase")
@js.native
class TransformBase () extends js.Object {
  var _parentID: scala.Double = js.native
  var _worldID: scala.Double = js.native
  var localTransform: Matrix = js.native
  var worldTransform: Matrix = js.native
  def updateLocalTransform(): scala.Unit = js.native
  def updateTransform(parentTransform: TransformBase): scala.Unit = js.native
  def updateWorldTransform(parentTransform: TransformBase): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.TransformBase")
@js.native
object TransformBase extends js.Object {
  var IDENTITY: pixiDotJsLib.PIXINs.TransformBase = js.native
}

