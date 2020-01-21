package typings.pgPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pgPoolStrings {
  @js.native
  sealed trait acquire extends js.Object
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @scala.inline
  def acquire: acquire = "acquire".asInstanceOf[acquire]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
}

