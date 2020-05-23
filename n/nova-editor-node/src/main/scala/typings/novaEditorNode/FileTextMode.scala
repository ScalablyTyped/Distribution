package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTextMode extends File {
  def read(): String | Null = js.native
  def read(size: String): String | Null = js.native
  def readline(): String = js.native
  def readlines(): js.Array[String] = js.native
}

