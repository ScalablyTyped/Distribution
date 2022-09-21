package typings.phoenix

import typings.phoenix.mod.BinaryType
import typings.phoenix.mod.ChannelState
import typings.phoenix.mod.ConnectionState
import typings.phoenix.mod.PushStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoenixStrings {
  
  @js.native
  sealed trait arraybuffer
    extends StObject
       with BinaryType
  inline def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait blob
    extends StObject
       with BinaryType
  inline def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait closed
    extends StObject
       with ChannelState
       with ConnectionState
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closing
    extends StObject
       with ConnectionState
  inline def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ConnectionState
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait error
    extends StObject
       with PushStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errored
    extends StObject
       with ChannelState
  inline def errored: errored = "errored".asInstanceOf[errored]
  
  @js.native
  sealed trait joined
    extends StObject
       with ChannelState
  inline def joined: joined = "joined".asInstanceOf[joined]
  
  @js.native
  sealed trait joining
    extends StObject
       with ChannelState
  inline def joining: joining = "joining".asInstanceOf[joining]
  
  @js.native
  sealed trait leaving
    extends StObject
       with ChannelState
  inline def leaving: leaving = "leaving".asInstanceOf[leaving]
  
  @js.native
  sealed trait ok
    extends StObject
       with PushStatus
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait open
    extends StObject
       with ConnectionState
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait timeout
    extends StObject
       with PushStatus
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
}
