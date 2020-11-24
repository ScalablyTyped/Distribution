package typings.portscanner

import typings.portscanner.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portscannerStrings {
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait closed extends Status
  
  @js.native
  sealed trait open extends Status
}
