package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultController[R] extends StObject {
  
  def close(): Unit = js.native
  
  val desiredSize: Double | Null = js.native
  
  def enqueue(): Unit = js.native
  def enqueue(chunk: R): Unit = js.native
  
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}
