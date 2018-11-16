package typings
package pgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pgLibStrings {
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
  
  def acquire: acquire = "acquire".asInstanceOf[acquire]
  def array: array = "array".asInstanceOf[array]
  def connect: connect = "connect".asInstanceOf[connect]
  def drain: drain = "drain".asInstanceOf[drain]
  def end: end = "end".asInstanceOf[end]
  def error: error = "error".asInstanceOf[error]
  def notice: notice = "notice".asInstanceOf[notice]
  def notification: notification = "notification".asInstanceOf[notification]
  def remove: remove = "remove".asInstanceOf[remove]
  def row: row = "row".asInstanceOf[row]
}

