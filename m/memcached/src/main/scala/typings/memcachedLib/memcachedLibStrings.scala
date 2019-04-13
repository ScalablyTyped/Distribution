package typings
package memcachedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object memcachedLibStrings {
  @js.native
  sealed trait failure
    extends memcachedLib.memcachedMod.EventNames
  
  @js.native
  sealed trait issue
    extends memcachedLib.memcachedMod.EventNames
  
  @js.native
  sealed trait reconnect
    extends memcachedLib.memcachedMod.EventNames
  
  @js.native
  sealed trait reconnecting
    extends memcachedLib.memcachedMod.EventNames
  
  @js.native
  sealed trait remove
    extends memcachedLib.memcachedMod.EventNames
  
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

