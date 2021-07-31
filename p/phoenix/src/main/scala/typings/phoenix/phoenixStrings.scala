package typings.phoenix

import typings.phoenix.mod.BinaryType
import typings.phoenix.mod.ConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoenixStrings {
  
  @js.native
  sealed trait arraybuffer
    extends StObject
       with BinaryType
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait blob
    extends StObject
       with BinaryType
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait closed
    extends StObject
       with ConnectionState
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closing
    extends StObject
       with ConnectionState
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ConnectionState
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait open
    extends StObject
       with ConnectionState
  @scala.inline
  def open: open = "open".asInstanceOf[open]
}
