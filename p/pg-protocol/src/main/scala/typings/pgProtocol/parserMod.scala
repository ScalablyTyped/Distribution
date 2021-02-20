package typings.pgProtocol

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.Chunk
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.pgProtocol.messagesMod.BackendMessage
import typings.pgProtocol.messagesMod.Mode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("pg-protocol/dist/parser", "Parser")
  @js.native
  class Parser () extends StObject {
    def this(opts: StreamOptions) = this()
    
    var buffer: js.Any = js.native
    
    var bufferLength: js.Any = js.native
    
    var bufferOffset: js.Any = js.native
    
    var handlePacket: js.Any = js.native
    
    var mergeBuffer: js.Any = js.native
    
    var mode: js.Any = js.native
    
    def parse(buffer: Buffer, callback: MessageCallback): Unit = js.native
    
    def parseAuthenticationResponse(offset: Double, length: Double, bytes: Buffer): js.Any = js.native
    
    var parseBackendKeyData: js.Any = js.native
    
    var parseCommandCompleteMessage: js.Any = js.native
    
    var parseCopyData: js.Any = js.native
    
    var parseCopyInMessage: js.Any = js.native
    
    var parseCopyMessage: js.Any = js.native
    
    var parseCopyOutMessage: js.Any = js.native
    
    var parseDataRowMessage: js.Any = js.native
    
    var parseErrorMessage: js.Any = js.native
    
    var parseField: js.Any = js.native
    
    var parseNotificationMessage: js.Any = js.native
    
    var parseParameterStatusMessage: js.Any = js.native
    
    var parseReadyForQueryMessage: js.Any = js.native
    
    var parseRowDescriptionMessage: js.Any = js.native
    
    var reader: js.Any = js.native
  }
  
  type MessageCallback = js.Function1[/* msg */ BackendMessage, Unit]
  
  @js.native
  trait Packet extends StObject {
    
    var code: Double = js.native
    
    var packet: Buffer = js.native
  }
  object Packet {
    
    @scala.inline
    def apply(code: Double, packet: Buffer): Packet = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    @scala.inline
    implicit class PacketMutableBuilder[Self <: Packet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacket(value: Buffer): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined node.stream.TransformOptions & {  mode :pg-protocol.pg-protocol/dist/messages.Mode} */
  @js.native
  trait StreamOptions extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.native
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var decodeStrings: js.UndefOr[Boolean] = js.native
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var emitClose: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var mode: Mode = js.native
    
    var objectMode: js.UndefOr[Boolean] = js.native
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.native
    
    var readableHighWaterMark: js.UndefOr[Double] = js.native
    
    var readableObjectMode: js.UndefOr[Boolean] = js.native
    
    var transform: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ TransformCallback, 
          Unit
        ]
      ] = js.native
    
    var writableCorked: js.UndefOr[Double] = js.native
    
    var writableHighWaterMark: js.UndefOr[Double] = js.native
    
    var writableObjectMode: js.UndefOr[Boolean] = js.native
    
    var write: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
  }
  object StreamOptions {
    
    @scala.inline
    def apply(mode: Mode): StreamOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit class StreamOptionsMutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* error */ Error | Null, 
              /* callback */ js.Function1[/* error */ Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      @scala.inline
      def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      @scala.inline
      def setTransform(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ TransformCallback, 
              Unit
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setWritableCorked(value: Double): Self = StObject.set(x, "writableCorked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableCorkedUndefined: Self = StObject.set(x, "writableCorked", js.undefined)
      
      @scala.inline
      def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
      
      @scala.inline
      def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
}
