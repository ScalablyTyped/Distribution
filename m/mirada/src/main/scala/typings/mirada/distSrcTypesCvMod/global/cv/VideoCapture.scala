package typings.mirada.distSrcTypesCvMod.global.cv

import org.scalablytyped.runtime.Instantiable1
import typings.mirada.distSrcTypesCvMod.global.cv.^
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.VideoCapture")
@js.native
open class VideoCapture protected ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.VideoCapture {
  def this(videoSource: String) = this()
  def this(videoSource: HTMLVideoElement) = this()
}
object VideoCapture {
  
  inline def apply: Instantiable1[
    /* videoSource */ HTMLVideoElement | String, 
    typings.mirada.distSrcTypesOpencvTypesMod.VideoCapture
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("VideoCapture").asInstanceOf[Instantiable1[
    /* videoSource */ HTMLVideoElement | String, 
    typings.mirada.distSrcTypesOpencvTypesMod.VideoCapture
  ]]
}
