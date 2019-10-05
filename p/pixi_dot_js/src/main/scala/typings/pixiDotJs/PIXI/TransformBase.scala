package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic class to deal with traditional 2D matrix transforms
  */
@JSGlobal("PIXI.TransformBase")
@js.native
class TransformBase () extends js.Object {
  var _parentID: Double = js.native
  var _worldID: Double = js.native
  var localTransform: Matrix = js.native
  var worldTransform: Matrix = js.native
  /**
    * Updates only local matrix
    */
  def updateLocalTransform(): Unit = js.native
  /**
    * Updates the values of the object and applies the parent"s transform.
    *
    * @param parentTransform - The transform of the parent of this object
    */
  def updateTransform(parentTransform: TransformBase): Unit = js.native
  def updateWorldTransform(parentTransform: TransformBase): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.TransformBase")
@js.native
object TransformBase extends js.Object {
  var IDENTITY: TransformBase = js.native
}

