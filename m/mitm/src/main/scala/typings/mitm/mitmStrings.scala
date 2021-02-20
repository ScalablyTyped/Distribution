package typings.mitm

import typings.mitm.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mitmStrings {
  
  @js.native
  sealed trait connect extends Event
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait connection extends Event
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  
  @js.native
  sealed trait request extends Event
  @scala.inline
  def request: request = "request".asInstanceOf[request]
}
