package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcUseDisposablesMod.DisposableFunction
import typings.std.FrameRequestCallback
import typings.std.TimerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  def add(callback: DisposableFunction): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def nextFrame(callback: FrameRequestCallback): Unit = js.native
  
  def requestAnimationFrame(callback: FrameRequestCallback): Unit = js.native
  
  def setTimeout(handler: TimerHandler, timeout: Double, args: Any*): Unit = js.native
  def setTimeout(handler: TimerHandler, timeout: Unit, args: Any*): Unit = js.native
}
