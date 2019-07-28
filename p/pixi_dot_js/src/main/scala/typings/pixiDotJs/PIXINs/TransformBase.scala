package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TransformBase")
@js.native
class TransformBase () extends js.Object {
  var _parentID: Double = js.native
  var _worldID: Double = js.native
  var localTransform: Matrix = js.native
  var worldTransform: Matrix = js.native
  def updateLocalTransform(): Unit = js.native
  def updateTransform(parentTransform: TransformBase): Unit = js.native
  def updateWorldTransform(parentTransform: TransformBase): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.TransformBase")
@js.native
object TransformBase extends js.Object {
  var IDENTITY: TransformBase = js.native
}

