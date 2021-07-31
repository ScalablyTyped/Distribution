package typings.novaEditorNode

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/file/
@js.native
trait File extends StObject {
  
  def close(): Unit = js.native
  
  val closed: Boolean = js.native
  
  val path: String = js.native
  
  def seek(offset: Double): Unit = js.native
  def seek(offset: Double, from: Double): Unit = js.native
  
  def tell(): Double = js.native
  
  def write(value: String): Unit = js.native
  def write(value: String, encoding: String): Unit = js.native
  def write(value: ArrayBuffer): Unit = js.native
  def write(value: ArrayBuffer, encoding: String): Unit = js.native
}
