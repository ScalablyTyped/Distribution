package typings.pgPacketStream

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestingTestBuffersMod {
  
  object default {
    
    @JSImport("pg-packet-stream/dist/testing/test-buffers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def authenticationCleartextPassword(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticationCleartextPassword")().asInstanceOf[Buffer]
    
    inline def authenticationMD5Password(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticationMD5Password")().asInstanceOf[Buffer]
    
    inline def authenticationOk(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticationOk")().asInstanceOf[Buffer]
    
    inline def authenticationSASL(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticationSASL")().asInstanceOf[Buffer]
    
    inline def authenticationSASLContinue(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticationSASLContinue")().asInstanceOf[Buffer]
    
    inline def authenticationSASLFinal(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticationSASLFinal")().asInstanceOf[Buffer]
    
    inline def backendKeyData(processID: Double, secretKey: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("backendKeyData")(processID.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def bindComplete(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bindComplete")().asInstanceOf[Buffer]
    
    inline def closeComplete(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("closeComplete")().asInstanceOf[Buffer]
    
    inline def commandComplete(string: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("commandComplete")(string.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def copyData(bytes: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyData")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def copyDone(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyDone")().asInstanceOf[Buffer]
    
    inline def copyIn(cols: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyIn")(cols.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def copyOut(cols: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyOut")(cols.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def dataRow(columns: js.Array[Any]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dataRow")(columns.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def emptyQuery(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyQuery")().asInstanceOf[Buffer]
    
    inline def error(fields: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(fields.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def errorOrNotice(fields: Any): typings.pgPacketStream.distTestingBufferListMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("errorOrNotice")(fields.asInstanceOf[js.Any]).asInstanceOf[typings.pgPacketStream.distTestingBufferListMod.default]
    
    inline def notice(fields: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("notice")(fields.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def notification(id: Double, channel: String, payload: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("notification")(id.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def parameterStatus(name: String, value: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parameterStatus")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def parseComplete(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseComplete")().asInstanceOf[Buffer]
    
    inline def portalSuspended(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("portalSuspended")().asInstanceOf[Buffer]
    
    inline def readyForQuery(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readyForQuery")().asInstanceOf[Buffer]
    
    inline def rowDescription(fields: js.Array[Any]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("rowDescription")(fields.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
}
