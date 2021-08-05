package typings.pgProtocol

import typings.node.Buffer
import typings.node.streamMod.TransformOptions
import typings.pgProtocol.messagesMod.BackendMessage
import typings.pgProtocol.messagesMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("pg-protocol/dist/parser", "Parser")
  @js.native
  class Parser () extends StObject {
    def this(opts: StreamOptions) = this()
    
    /* private */ var buffer: js.Any = js.native
    
    /* private */ var bufferLength: js.Any = js.native
    
    /* private */ var bufferOffset: js.Any = js.native
    
    /* private */ var handlePacket: js.Any = js.native
    
    /* private */ var mergeBuffer: js.Any = js.native
    
    /* private */ var mode: js.Any = js.native
    
    def parse(buffer: Buffer, callback: MessageCallback): Unit = js.native
    
    def parseAuthenticationResponse(offset: Double, length: Double, bytes: Buffer): js.Any = js.native
    
    /* private */ var parseBackendKeyData: js.Any = js.native
    
    /* private */ var parseCommandCompleteMessage: js.Any = js.native
    
    /* private */ var parseCopyData: js.Any = js.native
    
    /* private */ var parseCopyInMessage: js.Any = js.native
    
    /* private */ var parseCopyMessage: js.Any = js.native
    
    /* private */ var parseCopyOutMessage: js.Any = js.native
    
    /* private */ var parseDataRowMessage: js.Any = js.native
    
    /* private */ var parseErrorMessage: js.Any = js.native
    
    /* private */ var parseField: js.Any = js.native
    
    /* private */ var parseNotificationMessage: js.Any = js.native
    
    /* private */ var parseParameterStatusMessage: js.Any = js.native
    
    /* private */ var parseReadyForQueryMessage: js.Any = js.native
    
    /* private */ var parseRowDescriptionMessage: js.Any = js.native
    
    /* private */ var reader: js.Any = js.native
  }
  
  type MessageCallback = js.Function1[/* msg */ BackendMessage, Unit]
  
  trait Packet extends StObject {
    
    var code: Double
    
    var packet: Buffer
  }
  object Packet {
    
    inline def apply(code: Double, packet: Buffer): Packet = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
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
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
