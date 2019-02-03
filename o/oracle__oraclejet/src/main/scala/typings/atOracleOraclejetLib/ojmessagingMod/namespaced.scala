package typings
package atOracleOraclejetLib.ojmessagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
@js.native
class namespaced protected () extends Message {
  def this(summary: java.lang.String, detail: java.lang.String) = this()
  def this(summary: java.lang.String, detail: java.lang.String, severity: atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL | atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE) = this()
  /* CompleteClass */
  override var detail: java.lang.String = js.native
  /* CompleteClass */
  override var severity: atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE | atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL = js.native
  /* CompleteClass */
  override var summary: java.lang.String = js.native
}

/* static members */
@JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def getMaxSeverity(): atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`-1` = js.native
  def getMaxSeverity(messages: js.Array[atOracleOraclejetLib.ojmessagingMod.Message]): atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`-1` = js.native
  def getSeverityLevel(): atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL = js.native
  def getSeverityLevel(
    severity: atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL | atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE
  ): atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL = js.native
  def getSeverityType(): atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE = js.native
  def getSeverityType(
    level: atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_LEVEL | atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE
  ): atOracleOraclejetLib.ojmessagingMod.MessageNs.SEVERITY_TYPE = js.native
  def isValid(messages: js.Array[atOracleOraclejetLib.ojmessagingMod.Message]): scala.Boolean = js.native
}

