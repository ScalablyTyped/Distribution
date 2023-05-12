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
  
  inline def apply(destroy: () => Unit, meshInstance: MeshInstance, skyLayer: Layer): Sky = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), meshInstance = meshInstance.asInstanceOf[js.Any], skyLayer = skyLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sky]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sky] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setMeshInstance(value: MeshInstance): Self = StObject.set(x, "meshInstance", value.asInstanceOf[js.Any])
    
    inline def setSkyLayer(value: Layer): Self = StObject.set(x, "skyLayer", value.asInstanceOf[js.Any])
  }
}
