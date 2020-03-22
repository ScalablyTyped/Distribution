package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform that takes care about its versions
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Transform")
@js.native
class Transform () extends js.Object {
  /**
    * The locally unique ID of the local transform
    * used to calculate the current local transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_currentLocalID
    */
  var _currentLocalID: Double = js.native
  /**
    * The X-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cx
    */
  var _cx: Double = js.native
  /**
    * The X-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cy
    */
  var _cy: Double = js.native
  /**
    * The locally unique ID of the local transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_localID
    */
  var _localID: Double = js.native
  /**
    * The locally unique ID of the parent's world transform
    * used to calculate the current world transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_parentID
    */
  var _parentID: Double = js.native
  /**
    * The rotation amount.
    *
    * @protected
    * @member {number} PIXI.Transform#_rotation
    */
  var _rotation: Double = js.native
  /**
    * The Y-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sx
    */
  var _sx: Double = js.native
  /**
    * The Y-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sy
    */
  var _sy: Double = js.native
  /**
    * The locally unique ID of the world transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_worldID
    */
  var _worldID: Double = js.native
  /**
    * The local transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#localTransform
    */
  var localTransform: Matrix = js.native
  /**
    * The pivot point of the displayObject that it rotates around.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#pivot
    */
  var pivot: ObservablePoint = js.native
  /**
    * The coordinate of the object relative to the local coordinates of the parent.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#position
    */
  var position: ObservablePoint = js.native
  /**
    * The rotation of the object in radians.
    *
    * @member {number}
    */
  var rotation: Double = js.native
  /**
    * The scale factor of the object.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#scale
    */
  var scale: ObservablePoint = js.native
  /**
    * The skew amount, on the x and y axis.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#skew
    */
  var skew: ObservablePoint = js.native
  /**
    * The world transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#worldTransform
    */
  var worldTransform: Matrix = js.native
  /**
    * Called when a value changes.
    *
    * @protected
    */
  /* protected */ def onChange(): Unit = js.native
  /**
    * Decomposes a matrix and sets the transforms properties based on it.
    *
    * @param {PIXI.Matrix} matrix - The matrix to decompose
    */
  def setFromMatrix(matrix: Matrix): Unit = js.native
  /**
    * Updates the local transformation matrix.
    */
  def updateLocalTransform(): Unit = js.native
  /**
    * Called when the skew or the rotation changes.
    *
    * @protected
    */
  /* protected */ def updateSkew(): Unit = js.native
  /**
    * Updates the local and the world transformation matrices.
    *
    * @param {PIXI.Transform} parentTransform - The parent transform
    */
  def updateTransform(parentTransform: Transform): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Transform")
@js.native
object Transform extends js.Object {
  /**
    * A default (identity) transform
    *
    * @static
    * @constant
    * @member {PIXI.Transform}
    */
  var IDENTITY: Transform = js.native
}

