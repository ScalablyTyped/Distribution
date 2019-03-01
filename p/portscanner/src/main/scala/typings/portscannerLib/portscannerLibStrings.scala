package typings
package portscannerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object portscannerLibStrings {
  @js.native
  sealed trait closed
    extends portscannerLib.portscannerMod.Status
  
  @js.native
  sealed trait open
    extends portscannerLib.portscannerMod.Status
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
}

