package typings.pgPacketStream

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.node.streamMod.TransformOptions
import typings.pgPacketStream.distMessagesMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-packet-stream", "PgPacketStream")
  @js.native
  open class PgPacketStream () extends Transform {
    def this(opts: StreamOptions) = this()
    
    def _transform(buffer: Buffer, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ var handlePacket: Any = js.native
    
    /* private */ var mode: Any = js.native
    
    def parseAuthenticationResponse(offset: Double, length: Double, bytes: Buffer): Any = js.native
    
    /* private */ var parseBackendKeyData: Any = js.native
    
    /* private */ var parseCommandCompleteMessage: Any = js.native
    
    /* private */ var parseCopyData: Any = js.native
    
    /* private */ var parseCopyInMessage: Any = js.native
    
    /* private */ var parseCopyMessage: Any = js.native
    
    /* private */ var parseCopyOutMessage: Any = js.native
    
    /* private */ var parseDataRowMessage: Any = js.native
    
    /* private */ var parseErrorMessage: Any = js.native
    
    /* private */ var parseField: Any = js.native
    
    /* private */ var parseNotificationMessage: Any = js.native
    
    /* private */ var parseParameterStatusMessage: Any = js.native
    
    /* private */ var parseReadyForQueryMessage: Any = js.native
    
    /* private */ var parseRowDescriptionMessage: Any = js.native
    
    /* private */ var reader: Any = js.native
    
    /* private */ var remainingBuffer: Any = js.native
  }
  
  trait Packet extends StObject {
    
    var code: Double
    
    var packet: Buffer
  }
  object Packet {
    
    inline def apply(code: Double, packet: Buffer): Packet = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Packet] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setPacket(value: Buffer): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamOptions
    extends StObject
       with TransformOptions {
    
    var mode: Mode
  }
  object StreamOptions {
    
    inline def apply(mode: Mode): StreamOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamOptions] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
