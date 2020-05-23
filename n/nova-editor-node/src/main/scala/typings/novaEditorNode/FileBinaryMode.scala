package typings.novaEditorNode

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBinaryMode extends File {
  def read(): ArrayBuffer | Null = js.native
  def read(size: String): ArrayBuffer | Null = js.native
}

