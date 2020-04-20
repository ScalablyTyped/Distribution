package typings.pgProtocol

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/testing/test-buffers", JSImport.Namespace)
@js.native
object testBuffersMod extends js.Object {
  @js.native
  object default extends js.Object {
    def authenticationCleartextPassword(): Buffer = js.native
    def authenticationMD5Password(): Buffer = js.native
    def authenticationOk(): Buffer = js.native
    def authenticationSASL(): Buffer = js.native
    def authenticationSASLContinue(): Buffer = js.native
    def authenticationSASLFinal(): Buffer = js.native
    def backendKeyData(processID: Double, secretKey: Double): Buffer = js.native
    def bindComplete(): Buffer = js.native
    def closeComplete(): Buffer = js.native
    def commandComplete(string: String): Buffer = js.native
    def copyData(bytes: Buffer): Buffer = js.native
    def copyDone(): Buffer = js.native
    def copyIn(cols: Double): Buffer = js.native
    def copyOut(cols: Double): Buffer = js.native
    def dataRow(columns: js.Array[_]): Buffer = js.native
    def emptyQuery(): Buffer = js.native
    def error(fields: js.Any): Buffer = js.native
    def errorOrNotice(fields: js.Any): typings.pgProtocol.bufferListMod.default = js.native
    def notice(fields: js.Any): Buffer = js.native
    def notification(id: Double, channel: String, payload: String): Buffer = js.native
    def parameterStatus(name: String, value: String): Buffer = js.native
    def parseComplete(): Buffer = js.native
    def portalSuspended(): Buffer = js.native
    def readyForQuery(): Buffer = js.native
    def rowDescription(fields: js.Array[_]): Buffer = js.native
  }
  
}

