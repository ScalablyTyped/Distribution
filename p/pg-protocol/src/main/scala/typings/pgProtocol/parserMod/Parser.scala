package typings.pgProtocol.parserMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/parser", "Parser")
@js.native
class Parser () extends js.Object {
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
