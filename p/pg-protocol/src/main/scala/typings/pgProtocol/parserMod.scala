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
  
  trait Packet extends StObject {
    
    var code: Double
    
    var packet: Buffer
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
  
  trait StreamOptions
    extends StObject
       with TransformOptions {
    
    var mode: Mode
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
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
