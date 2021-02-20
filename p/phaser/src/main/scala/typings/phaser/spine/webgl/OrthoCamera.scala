package typings.phaser.spine.webgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrthoCamera extends StObject {
  
  var direction: Vector3 = js.native
  
  var far: Double = js.native
  
  var inverseProjectionView: Matrix4 = js.native
  
  var near: Double = js.native
  
  var position: Vector3 = js.native
  
  var projection: Matrix4 = js.native
  
  var projectionView: Matrix4 = js.native
  
  def screenToWorld(screenCoords: Vector3, screenWidth: Double, screenHeight: Double): Vector3 = js.native
  
  def setViewport(viewportWidth: Double, viewportHeight: Double): Unit = js.native
  
  var tmp: js.Any = js.native
  
  var up: Vector3 = js.native
  
  def update(): Unit = js.native
  
  var view: Matrix4 = js.native
  
  var viewportHeight: Double = js.native
  
  var viewportWidth: Double = js.native
  
  var zoom: Double = js.native
}
object OrthoCamera {
  
  @scala.inline
  def apply(
    direction: Vector3,
    far: Double,
    inverseProjectionView: Matrix4,
    near: Double,
    position: Vector3,
    projection: Matrix4,
    projectionView: Matrix4,
    screenToWorld: (Vector3, Double, Double) => Vector3,
    setViewport: (Double, Double) => Unit,
    tmp: js.Any,
    up: Vector3,
    update: () => Unit,
    view: Matrix4,
    viewportHeight: Double,
    viewportWidth: Double,
    zoom: Double
  ): OrthoCamera = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], inverseProjectionView = inverseProjectionView.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], projectionView = projectionView.asInstanceOf[js.Any], screenToWorld = js.Any.fromFunction3(screenToWorld), setViewport = js.Any.fromFunction2(setViewport), tmp = tmp.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), view = view.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthoCamera]
  }
  
  @scala.inline
  implicit class OrthoCameraMutableBuilder[Self <: OrthoCamera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Vector3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseProjectionView(value: Matrix4): Self = StObject.set(x, "inverseProjectionView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: Matrix4): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionView(value: Matrix4): Self = StObject.set(x, "projectionView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenToWorld(value: (Vector3, Double, Double) => Vector3): Self = StObject.set(x, "screenToWorld", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetViewport(value: (Double, Double) => Unit): Self = StObject.set(x, "setViewport", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTmp(value: js.Any): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setView(value: Matrix4): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
