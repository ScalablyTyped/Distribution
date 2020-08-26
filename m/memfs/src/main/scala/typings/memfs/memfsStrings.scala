package typings.memfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object memfsStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait string extends js.Object
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

