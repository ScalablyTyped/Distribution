package typings.mosca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moscaStrings {
  
  @scala.inline
  def clientConnected: clientConnected = "clientConnected".asInstanceOf[clientConnected]
  
  @scala.inline
  def clientDisconnected: clientDisconnected = "clientDisconnected".asInstanceOf[clientDisconnected]
  
  @scala.inline
  def clientDisconnecting: clientDisconnecting = "clientDisconnecting".asInstanceOf[clientDisconnecting]
  
  @scala.inline
  def published: published = "published".asInstanceOf[published]
  
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
  
  @js.native
  sealed trait clientConnected extends js.Object
  
  @js.native
  sealed trait clientDisconnected extends js.Object
  
  @js.native
  sealed trait clientDisconnecting extends js.Object
  
  @js.native
  sealed trait published extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait subscribed extends js.Object
  
  @js.native
  sealed trait unsubscribed extends js.Object
}
