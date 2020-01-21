package typings.memcached

import typings.memcached.mod.EventNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object memcachedStrings {
  @js.native
  sealed trait failure extends EventNames
  
  @js.native
  sealed trait issue extends EventNames
  
  @js.native
  sealed trait reconnect extends EventNames
  
  @js.native
  sealed trait reconnecting extends EventNames
  
  @js.native
  sealed trait remove extends EventNames
  
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def issue: issue = "issue".asInstanceOf[issue]
  @scala.inline
  def reconnect: reconnect = "reconnect".asInstanceOf[reconnect]
  @scala.inline
  def reconnecting: reconnecting = "reconnecting".asInstanceOf[reconnecting]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
}

