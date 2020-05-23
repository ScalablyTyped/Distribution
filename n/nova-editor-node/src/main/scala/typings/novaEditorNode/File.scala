package typings.novaEditorNode

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/file/
@js.native
trait File extends js.Object {
  val closed: Boolean = js.native
  val path: String = js.native
  def close(): Unit = js.native
  def seek(offset: Double): Unit = js.native
  def seek(offset: Double, from: Double): Unit = js.native
  def tell(): Double = js.native
  def write(value: String): Unit = js.native
  def write(value: String, encoding: String): Unit = js.native
  def write(value: ArrayBuffer): Unit = js.native
  def write(value: ArrayBuffer, encoding: String): Unit = js.native
}

