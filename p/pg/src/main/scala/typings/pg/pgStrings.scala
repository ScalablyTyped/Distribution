package typings.pg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pgStrings {
  @js.native
  sealed trait acquire extends js.Object
  
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait notice extends js.Object
  
  @js.native
  sealed trait notification extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait row extends js.Object
  
  @scala.inline
  def acquire: acquire = "acquire".asInstanceOf[acquire]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
}

