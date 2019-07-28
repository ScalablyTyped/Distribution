package typings.pixiDotJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.pixiDotJs.PIXINs.glCoreNs.GLTexture
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassGLTexture
  extends Instantiable1[/* gl */ WebGLRenderingContext, GLTexture]
     with Instantiable2[/* gl */ WebGLRenderingContext, /* width */ Double, GLTexture]
     with Instantiable3[/* gl */ WebGLRenderingContext, /* width */ Double, /* height */ Double, GLTexture]
     with Instantiable4[
      /* gl */ WebGLRenderingContext, 
      /* width */ Double, 
      /* height */ Double, 
      /* format */ Double, 
      GLTexture
    ]
     with Instantiable5[
      /* gl */ WebGLRenderingContext, 
      /* width */ Double, 
      /* height */ Double, 
      /* format */ Double, 
      /* type */ Double, 
      GLTexture
    ] {
  def fromData(gl: WebGLRenderingContext, data: js.Array[Double], width: Double, height: Double): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLCanvasElement): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLCanvasElement, premultipleAlpha: Boolean): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLImageElement): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLImageElement, premultipleAlpha: Boolean): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLVideoElement): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLVideoElement, premultipleAlpha: Boolean): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: ImageData): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: ImageData, premultipleAlpha: Boolean): GLTexture = js.native
}

