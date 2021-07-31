package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transform that takes care about its versions
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Transform")
@js.native
class Transform ()
  extends StObject
     with typings.pixiJs.PIXI.Transform {
  
  /**
    * The locally unique ID of the local transform
    * used to calculate the current local transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_currentLocalID
    */
  /* CompleteClass */
  var _currentLocalID: Double = js.native
  
  /**
    * The X-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cx
    */
  /* CompleteClass */
  var _cx: Double = js.native
  
  /**
    * The X-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cy
    */
  /* CompleteClass */
  var _cy: Double = js.native
  
  /**
    * The locally unique ID of the local transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_localID
    */
  /* CompleteClass */
  var _localID: Double = js.native
  
  /**
    * The locally unique ID of the parent's world transform
    * used to calculate the current world transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_parentID
    */
  /* CompleteClass */
  var _parentID: Double = js.native
  
  /**
    * The rotation amount.
    *
    * @protected
    * @member {number} PIXI.Transform#_rotation
    */
  /* CompleteClass */
  var _rotation: Double = js.native
  
  /**
    * The Y-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sx
    */
  /* CompleteClass */
  var _sx: Double = js.native
  
  /**
    * The Y-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sy
    */
  /* CompleteClass */
  var _sy: Double = js.native
  
  /**
    * The locally unique ID of the world transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_worldID
    */
  /* CompleteClass */
  var _worldID: Double = js.native
  
  /**
    * The local transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#localTransform
    */
  /* CompleteClass */
  var localTransform: typings.pixiJs.PIXI.Matrix = js.native
  
  /**
    * Called when a value changes.
    *
    * @protected
    */
  /* CompleteClass */
  /* protected */ override def onChange(): Unit = js.native
  
  /**
    * The pivot point of the displayObject that it rotates around.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#pivot
    */
  /* CompleteClass */
  var pivot: typings.pixiJs.PIXI.ObservablePoint = js.native
  
  /**
    * The coordinate of the object relative to the local coordinates of the parent.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#position
    */
  /* CompleteClass */
  var position: typings.pixiJs.PIXI.ObservablePoint = js.native
  
  /**
    * The rotation of the object in radians.
    *
    * @member {number}
    */
  /* CompleteClass */
  var rotation: Double = js.native
  
  /**
    * The scale factor of the object.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#scale
    */
  /* CompleteClass */
  var scale: typings.pixiJs.PIXI.ObservablePoint = js.native
  
  /**
    * Decomposes a matrix and sets the transforms properties based on it.
    *
    * @param {PIXI.Matrix} matrix - The matrix to decompose
    */
  /* CompleteClass */
  override def setFromMatrix(matrix: typings.pixiJs.PIXI.Matrix): Unit = js.native
  
  /**
    * The skew amount, on the x and y axis.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#skew
    */
  /* CompleteClass */
  var skew: typings.pixiJs.PIXI.ObservablePoint = js.native
  
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
  
  /**
    * The world transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#worldTransform
    */
  /* CompleteClass */
  var worldTransform: typings.pixiJs.PIXI.Matrix = js.native
}
object Transform {
  
  @JSImport("pixi.js", "Transform")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A default (identity) transform
    *
    * @static
    * @constant
    * @member {PIXI.Transform}
    */
  /* static member */
  @JSImport("pixi.js", "Transform.IDENTITY")
  @js.native
  def IDENTITY: typings.pixiJs.PIXI.Transform = js.native
  @scala.inline
  def IDENTITY_=(x: typings.pixiJs.PIXI.Transform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
}
