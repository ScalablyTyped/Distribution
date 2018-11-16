package typings
package memcachedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object memcachedLibStrings {
  @js.native
  sealed trait failure extends js.Object
  
  @js.native
  sealed trait issue extends js.Object
  
  @js.native
  sealed trait reconnect extends js.Object
  
  @js.native
  sealed trait reconnecting extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  def failure: failure = "failure".asInstanceOf[failure]
  def issue: issue = "issue".asInstanceOf[issue]
  def reconnect: reconnect = "reconnect".asInstanceOf[reconnect]
  def reconnecting: reconnecting = "reconnecting".asInstanceOf[reconnecting]
  def remove: remove = "remove".asInstanceOf[remove]
}

