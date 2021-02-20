package typings.portscanner

import typings.portscanner.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portscannerStrings {
  
  @js.native
  sealed trait closed extends Status
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait open extends Status
  @scala.inline
  def open: open = "open".asInstanceOf[open]
}
