package typings
package phoenixLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object phoenixLibStrings {
  @js.native
  sealed trait closed
    extends phoenixLib.phoenixMod.ConnectionState
  
  @js.native
  sealed trait closing
    extends phoenixLib.phoenixMod.ConnectionState
  
  @js.native
  sealed trait connecting
    extends phoenixLib.phoenixMod.ConnectionState
  
  @js.native
  sealed trait open
    extends phoenixLib.phoenixMod.ConnectionState
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
}

