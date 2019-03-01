package typings
package mitmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mitmLibStrings {
  @js.native
  sealed trait connect
    extends mitmLib.mitmMod.Event
  
  @js.native
  sealed trait connection
    extends mitmLib.mitmMod.Event
  
  @js.native
  sealed trait request
    extends mitmLib.mitmMod.Event
  
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
}

