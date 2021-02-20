package typings.phoenix

import typings.phoenix.mod.BinaryType
import typings.phoenix.mod.ConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoenixStrings {
  
  @js.native
  sealed trait arraybuffer extends BinaryType
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait blob extends BinaryType
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait closed extends ConnectionState
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closing extends ConnectionState
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait connecting extends ConnectionState
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait open extends ConnectionState
  @scala.inline
  def open: open = "open".asInstanceOf[open]
}
