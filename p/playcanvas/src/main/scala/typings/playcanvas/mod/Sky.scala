package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A visual representation of the sky.
  *
  * @ignore
  */
trait Sky extends StObject {
  
  /** @type {Mat3} */
  var _rotationMat3: Mat3
  
  def destroy(): Unit
  
  /**
    * Mesh instance representing the visuals of the sky.
    *
    * @type {MeshInstance}
    */
  var meshInstance: MeshInstance
  
  var skyLayer: Layer
}
object Sky {
  
  inline def apply(_rotationMat3: Mat3, destroy: () => Unit, meshInstance: MeshInstance, skyLayer: Layer): Sky = {
    val __obj = js.Dynamic.literal(_rotationMat3 = _rotationMat3.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), meshInstance = meshInstance.asInstanceOf[js.Any], skyLayer = skyLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sky]
  }
  
  extension [Self <: Sky](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setMeshInstance(value: MeshInstance): Self = StObject.set(x, "meshInstance", value.asInstanceOf[js.Any])
    
    inline def setSkyLayer(value: Layer): Self = StObject.set(x, "skyLayer", value.asInstanceOf[js.Any])
    
    inline def set_rotationMat3(value: Mat3): Self = StObject.set(x, "_rotationMat3", value.asInstanceOf[js.Any])
  }
}
