package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transform that takes care about its versions
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Transform extends js.Object {
  
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
    * Called when a value changes.
    *
    * @protected
    */
  /* protected */ def onChange(): Unit = js.native
  
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
    * Decomposes a matrix and sets the transforms properties based on it.
    *
    * @param {PIXI.Matrix} matrix - The matrix to decompose
    */
  def setFromMatrix(matrix: Matrix): Unit = js.native
  
  /**
    * The skew amount, on the x and y axis.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#skew
    */
  var skew: ObservablePoint = js.native
  
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
  
  /**
    * The world transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#worldTransform
    */
  var worldTransform: Matrix = js.native
}
object Transform {
  
  @scala.inline
  def apply(
    _currentLocalID: Double,
    _cx: Double,
    _cy: Double,
    _localID: Double,
    _parentID: Double,
    _rotation: Double,
    _sx: Double,
    _sy: Double,
    _worldID: Double,
    localTransform: Matrix,
    onChange: () => Unit,
    pivot: ObservablePoint,
    position: ObservablePoint,
    rotation: Double,
    scale: ObservablePoint,
    setFromMatrix: Matrix => Unit,
    skew: ObservablePoint,
    updateLocalTransform: () => Unit,
    updateSkew: () => Unit,
    updateTransform: Transform => Unit,
    worldTransform: Matrix
  ): Transform = {
    val __obj = js.Dynamic.literal(_currentLocalID = _currentLocalID.asInstanceOf[js.Any], _cx = _cx.asInstanceOf[js.Any], _cy = _cy.asInstanceOf[js.Any], _localID = _localID.asInstanceOf[js.Any], _parentID = _parentID.asInstanceOf[js.Any], _rotation = _rotation.asInstanceOf[js.Any], _sx = _sx.asInstanceOf[js.Any], _sy = _sy.asInstanceOf[js.Any], _worldID = _worldID.asInstanceOf[js.Any], localTransform = localTransform.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), pivot = pivot.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setFromMatrix = js.Any.fromFunction1(setFromMatrix), skew = skew.asInstanceOf[js.Any], updateLocalTransform = js.Any.fromFunction0(updateLocalTransform), updateSkew = js.Any.fromFunction0(updateSkew), updateTransform = js.Any.fromFunction1(updateTransform), worldTransform = worldTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_currentLocalID(value: Double): Self = this.set("_currentLocalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cx(value: Double): Self = this.set("_cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cy(value: Double): Self = this.set("_cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_localID(value: Double): Self = this.set("_localID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parentID(value: Double): Self = this.set("_parentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rotation(value: Double): Self = this.set("_rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sx(value: Double): Self = this.set("_sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sy(value: Double): Self = this.set("_sy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_worldID(value: Double): Self = this.set("_worldID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTransform(value: Matrix): Self = this.set("localTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPivot(value: ObservablePoint): Self = this.set("pivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: ObservablePoint): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: ObservablePoint): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFromMatrix(value: Matrix => Unit): Self = this.set("setFromMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkew(value: ObservablePoint): Self = this.set("skew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLocalTransform(value: () => Unit): Self = this.set("updateLocalTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateSkew(value: () => Unit): Self = this.set("updateSkew", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateTransform(value: Transform => Unit): Self = this.set("updateTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWorldTransform(value: Matrix): Self = this.set("worldTransform", value.asInstanceOf[js.Any])
  }
}
