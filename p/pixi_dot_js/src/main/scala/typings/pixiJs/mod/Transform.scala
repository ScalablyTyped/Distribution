package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform that takes care about its versions
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Transform")
@js.native
class Transform ()
  extends typings.pixiJs.PIXI.Transform {
  /**
    * The locally unique ID of the local transform
    * used to calculate the current local transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_currentLocalID
    */
  /* CompleteClass */
  override var _currentLocalID: Double = js.native
  /**
    * The X-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cx
    */
  /* CompleteClass */
  override var _cx: Double = js.native
  /**
    * The X-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cy
    */
  /* CompleteClass */
  override var _cy: Double = js.native
  /**
    * The locally unique ID of the local transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_localID
    */
  /* CompleteClass */
  override var _localID: Double = js.native
  /**
    * The locally unique ID of the parent's world transform
    * used to calculate the current world transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_parentID
    */
  /* CompleteClass */
  override var _parentID: Double = js.native
  /**
    * The rotation amount.
    *
    * @protected
    * @member {number} PIXI.Transform#_rotation
    */
  /* CompleteClass */
  override var _rotation: Double = js.native
  /**
    * The Y-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sx
    */
  /* CompleteClass */
  override var _sx: Double = js.native
  /**
    * The Y-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sy
    */
  /* CompleteClass */
  override var _sy: Double = js.native
  /**
    * The locally unique ID of the world transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_worldID
    */
  /* CompleteClass */
  override var _worldID: Double = js.native
  /**
    * The local transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#localTransform
    */
  /* CompleteClass */
  override var localTransform: typings.pixiJs.PIXI.Matrix = js.native
  /**
    * The pivot point of the displayObject that it rotates around.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#pivot
    */
  /* CompleteClass */
  override var pivot: typings.pixiJs.PIXI.ObservablePoint = js.native
  /**
    * The coordinate of the object relative to the local coordinates of the parent.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#position
    */
  /* CompleteClass */
  override var position: typings.pixiJs.PIXI.ObservablePoint = js.native
  /**
    * The rotation of the object in radians.
    *
    * @member {number}
    */
  /* CompleteClass */
  override var rotation: Double = js.native
  /**
    * The scale factor of the object.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#scale
    */
  /* CompleteClass */
  override var scale: typings.pixiJs.PIXI.ObservablePoint = js.native
  /**
    * The skew amount, on the x and y axis.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#skew
    */
  /* CompleteClass */
  override var skew: typings.pixiJs.PIXI.ObservablePoint = js.native
  /**
    * The world transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#worldTransform
    */
  /* CompleteClass */
  override var worldTransform: typings.pixiJs.PIXI.Matrix = js.native
  /**
    * Called when a value changes.
    *
    * @protected
    */
  /* CompleteClass */
  /* protected */ override def onChange(): Unit = js.native
  /**
    * Decomposes a matrix and sets the transforms properties based on it.
    *
    * @param {PIXI.Matrix} matrix - The matrix to decompose
    */
  /* CompleteClass */
  override def setFromMatrix(matrix: typings.pixiJs.PIXI.Matrix): Unit = js.native
  /**
    * Updates the local transformation matrix.
    */
  /* CompleteClass */
  override def updateLocalTransform(): Unit = js.native
  /**
    * Called when the skew or the rotation changes.
    *
    * @protected
    */
  /* CompleteClass */
  /* protected */ override def updateSkew(): Unit = js.native
  /**
    * Updates the local and the world transformation matrices.
    *
    * @param {PIXI.Transform} parentTransform - The parent transform
    */
  /* CompleteClass */
  override def updateTransform(parentTransform: typings.pixiJs.PIXI.Transform): Unit = js.native
}

/* static members */
@JSImport("pixi.js", "Transform")
@js.native
object Transform extends js.Object {
  /**
    * A default (identity) transform
    *
    * @static
    * @constant
    * @member {PIXI.Transform}
    */
  var IDENTITY: typings.pixiJs.PIXI.Transform = js.native
}

