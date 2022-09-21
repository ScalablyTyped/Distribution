package typings.offscreencanvas

import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePort extends StObject {
  
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
}
