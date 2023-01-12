package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGL implementation of the Texture.
  *
  * @ignore
  */
trait WebglTexture extends StObject {
  
  var _glFormat: Any
  
  var _glInternalFormat: Any
  
  var _glPixelType: Any
  
  var _glTarget: Any
  
  var _glTexture: Any
  
  def destroy(device: Any): Unit
  
  def initialize(device: Any, texture: Any): Unit
  
  def loseContext(): Unit
  
  def upload(device: Any, texture: Any): Unit
}
object WebglTexture {
  
  inline def apply(
    _glFormat: Any,
    _glInternalFormat: Any,
    _glPixelType: Any,
    _glTarget: Any,
    _glTexture: Any,
    destroy: Any => Unit,
    initialize: (Any, Any) => Unit,
    loseContext: () => Unit,
    upload: (Any, Any) => Unit
  ): WebglTexture = {
    val __obj = js.Dynamic.literal(_glFormat = _glFormat.asInstanceOf[js.Any], _glInternalFormat = _glInternalFormat.asInstanceOf[js.Any], _glPixelType = _glPixelType.asInstanceOf[js.Any], _glTarget = _glTarget.asInstanceOf[js.Any], _glTexture = _glTexture.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), initialize = js.Any.fromFunction2(initialize), loseContext = js.Any.fromFunction0(loseContext), upload = js.Any.fromFunction2(upload))
    __obj.asInstanceOf[WebglTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebglTexture] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: Any => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: (Any, Any) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    inline def setUpload(value: (Any, Any) => Unit): Self = StObject.set(x, "upload", js.Any.fromFunction2(value))
    
    inline def set_glFormat(value: Any): Self = StObject.set(x, "_glFormat", value.asInstanceOf[js.Any])
    
    inline def set_glInternalFormat(value: Any): Self = StObject.set(x, "_glInternalFormat", value.asInstanceOf[js.Any])
    
    inline def set_glPixelType(value: Any): Self = StObject.set(x, "_glPixelType", value.asInstanceOf[js.Any])
    
    inline def set_glTarget(value: Any): Self = StObject.set(x, "_glTarget", value.asInstanceOf[js.Any])
    
    inline def set_glTexture(value: Any): Self = StObject.set(x, "_glTexture", value.asInstanceOf[js.Any])
  }
}
