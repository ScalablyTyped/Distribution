package typings.mosca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object moscaStrings {
  @js.native
  sealed trait clientConnected extends js.Object
  
  @js.native
  sealed trait clientDisconnected extends js.Object
  
  @js.native
  sealed trait clientDisconnecting extends js.Object
  
  @js.native
  sealed trait published extends js.Object
  
  @js.native
  sealed trait subscribed extends js.Object
  
  @js.native
  sealed trait unsubscribed extends js.Object
  
  @scala.inline
  def clientConnected: clientConnected = "clientConnected".asInstanceOf[clientConnected]
  @scala.inline
  def clientDisconnected: clientDisconnected = "clientDisconnected".asInstanceOf[clientDisconnected]
  @scala.inline
  def clientDisconnecting: clientDisconnecting = "clientDisconnecting".asInstanceOf[clientDisconnecting]
  @scala.inline
  def published: published = "published".asInstanceOf[published]
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}

