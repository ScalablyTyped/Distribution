package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which may be specified when getting an instance of the Advanced Queue class.
  */
trait GetAdvancedQueueOptions extends js.Object {
  /**
    * Name of an Oracle Database object type, or a DbObject Class earlier acquired from connection.getDbObjectClass().
    * If the name of an object type is used, it is recommended that a fully qualified name be used.
    */
  var payloadType: js.UndefOr[String] = js.undefined
}

object GetAdvancedQueueOptions {
  @scala.inline
  def apply(payloadType: String = null): GetAdvancedQueueOptions = {
    val __obj = js.Dynamic.literal()
    if (payloadType != null) __obj.updateDynamic("payloadType")(payloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdvancedQueueOptions]
  }
}

