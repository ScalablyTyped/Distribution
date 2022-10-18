package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "LoopbackPort")
@js.native
open class LoopbackPort () extends StObject {
  
  var _deferred: js.Promise[Unit] = js.native
  
  var _listeners: js.Array[Any] = js.native
  
  def addEventListener(name: Any, listener: Any): Unit = js.native
  
  def postMessage(obj: Any, transfers: Any): Unit = js.native
  
  def removeEventListener(name: Any, listener: Any): Unit = js.native
  
  def terminate(): Unit = js.native
}
