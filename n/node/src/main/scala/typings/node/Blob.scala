package typings.node

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blob extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  val size: Double = js.native
  
  def slice(): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
  def slice(start: Double, end: Unit, contentType: String): Blob = js.native
  def slice(start: Unit, end: Double): Blob = js.native
  def slice(start: Unit, end: Double, contentType: String): Blob = js.native
  def slice(start: Unit, end: Unit, contentType: String): Blob = js.native
  
  def stream(): ReadableStream[Any] = js.native
  
  def text(): js.Promise[String] = js.native
  
  val `type`: String = js.native
}
