package typings.playcanvas.mod

import typings.playcanvas.anon.Cameras
import typings.playcanvas.anon.CompileTime
import typings.playcanvas.anon.Forward
import typings.playcanvas.anon.FrameTime
import typings.playcanvas.anon.Ib
import typings.playcanvas.anon.RenderTargetCreationTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Records performance-related statistics related to the application.
  *
  * @ignore
  */
@js.native
trait ApplicationStats extends StObject {
  
  def batcher: Any = js.native
  
  var drawCalls: Forward = js.native
  
  var frame: Cameras = js.native
  
  def lightmapper: Any = js.native
  
  var misc: RenderTargetCreationTime = js.native
  
  var particles: FrameTime = js.native
  
  def scene: Any = js.native
  
  var shaders: CompileTime = js.native
  
  var vram: Ib = js.native
}
