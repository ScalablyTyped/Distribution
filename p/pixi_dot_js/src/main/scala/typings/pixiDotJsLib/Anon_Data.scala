package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Data
  extends org.scalablytyped.runtime.Instantiable1[/* gl */ stdLib.WebGLRenderingContext, pixiDotJsLib.PIXINs.glCoreNs.GLTexture]
     with org.scalablytyped.runtime.Instantiable2[
      /* gl */ stdLib.WebGLRenderingContext, 
      /* width */ scala.Double, 
      pixiDotJsLib.PIXINs.glCoreNs.GLTexture
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* gl */ stdLib.WebGLRenderingContext, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      pixiDotJsLib.PIXINs.glCoreNs.GLTexture
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* gl */ stdLib.WebGLRenderingContext, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* format */ scala.Double, 
      pixiDotJsLib.PIXINs.glCoreNs.GLTexture
    ]
     with org.scalablytyped.runtime.Instantiable5[
      /* gl */ stdLib.WebGLRenderingContext, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* format */ scala.Double, 
      /* type */ scala.Double, 
      pixiDotJsLib.PIXINs.glCoreNs.GLTexture
    ] {
  def fromData(
    gl: stdLib.WebGLRenderingContext,
    data: js.Array[scala.Double],
    width: scala.Double,
    height: scala.Double
  ): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(
    gl: stdLib.WebGLRenderingContext,
    source: stdLib.HTMLCanvasElement,
    premultipleAlpha: scala.Boolean
  ): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLImageElement, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLVideoElement, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.ImageData): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.ImageData, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
}

