package typings.pixiJs.global.PIXI

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal texture for WebGL context
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.GLTexture")
@js.native
class GLTexture ()
  extends StObject
     with typings.pixiJs.PIXI.GLTexture {
  
  /**
    * Texture contents dirty flag
    * @member {number} PIXI.GLTexture#dirtyId
    */
  /* CompleteClass */
  var dirtyId: Double = js.native
  
  /**
    * Texture style dirty flag
    * @member {number} PIXI.GLTexture#dirtyStyleId
    */
  /* CompleteClass */
  var dirtyStyleId: Double = js.native
  
  /**
    * Height of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#height
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#internalFormat
    */
  /* CompleteClass */
  var internalFormat: Double = js.native
  
  /**
    * Whether mip levels has to be generated
    * @member {boolean} PIXI.GLTexture#mipmap
    */
  /* CompleteClass */
  var mipmap: Boolean = js.native
  
  /**
    * The WebGL texture
    * @member {WebGLTexture} PIXI.GLTexture#texture
    */
  /* CompleteClass */
  var texture: WebGLTexture = js.native
  
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#type
    */
  /* CompleteClass */
  var `type`: Double = js.native
  
  /**
    * Width of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#width
    */
  /* CompleteClass */
  var width: Double = js.native
  
  /**
    * WrapMode copied from baseTexture
    * @member {number} PIXI.GLTexture#wrapMode
    */
  /* CompleteClass */
  var wrapMode: Double = js.native
}
