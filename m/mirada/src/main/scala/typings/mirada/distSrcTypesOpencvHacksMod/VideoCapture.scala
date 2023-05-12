package typings.mirada.distSrcTypesOpencvHacksMod

import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_hacks", "VideoCapture")
@js.native
open class VideoCapture protected () extends StObject {
  def this(videoSource: String) = this()
  def this(videoSource: HTMLVideoElement) = this()
  
  def read(m: typings.mirada.distSrcTypesOpencvMod.Mat): Any = js.native
  
  var video: HTMLVideoElement = js.native
}
