package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../graphics/render-target.js').RenderTarget} RenderTarget */
/** @typedef {import('../graphics/graphics-device.js').GraphicsDevice} GraphicsDevice */
trait ColorAttachmentOps extends StObject {
  
  /**
    * True if the attachment should be cleared before rendering, false to preserve
    * the existing content.
    */
  var clear: Boolean
  
  /**
    * A color used to clear the color attachment when the clear is enabled.
    */
  var clearValue: Color
  
  /**
    * True if the attachment needs to have mipmaps generated.
    *
    * @type {boolean}
    */
  var mipmaps: Boolean
  
  /**
    * True if the attachment needs to be resolved.
    *
    * @type {boolean}
    */
  var resolve: Boolean
  
  /**
    * True if the attachment needs to be stored after the render pass. False
    * if it can be discarded.
    * Note: This relates to the surface that is getting rendered to, and can be either
    * single or multi-sampled. Further, if a multi-sampled surface is used, the resolve
    * flag further specifies if this gets resolved to a single-sampled surface. This
    * behavior matches the WebGPU specification.
    *
    * @type {boolean}
    */
  var store: Boolean
}
object ColorAttachmentOps {
  
  inline def apply(clear: Boolean, clearValue: Color, mipmaps: Boolean, resolve: Boolean, store: Boolean): ColorAttachmentOps = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], clearValue = clearValue.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAttachmentOps]
  }
  
  extension [Self <: ColorAttachmentOps](x: Self) {
    
    inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearValue(value: Color): Self = StObject.set(x, "clearValue", value.asInstanceOf[js.Any])
    
    inline def setMipmaps(value: Boolean): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
