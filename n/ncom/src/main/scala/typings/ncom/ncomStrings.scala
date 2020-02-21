package typings.ncom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ncomStrings {
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

