package typings.mitm

import typings.mitm.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mitmStrings {
  
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait connect extends Event
  
  @js.native
  sealed trait connection extends Event
  
  @js.native
  sealed trait request extends Event
}
