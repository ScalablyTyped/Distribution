package typings
package nodecredstashLib.nodecredstashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredstashConfig extends js.Object {
  var awsOpts: js.UndefOr[awsDashSdkLib.clientsKmsMod.ClientConfiguration] = js.undefined
  var dynamoOpts: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ClientConfiguration] = js.undefined
  var kmsKey: js.UndefOr[java.lang.String] = js.undefined
  var kmsOpts: js.UndefOr[awsDashSdkLib.clientsKmsMod.ClientConfiguration] = js.undefined
  var table: js.UndefOr[java.lang.String] = js.undefined
}

object CredstashConfig {
  @scala.inline
  def apply(
    awsOpts: awsDashSdkLib.clientsKmsMod.ClientConfiguration = null,
    dynamoOpts: awsDashSdkLib.clientsDynamodbMod.ClientConfiguration = null,
    kmsKey: java.lang.String = null,
    kmsOpts: awsDashSdkLib.clientsKmsMod.ClientConfiguration = null,
    table: java.lang.String = null
  ): CredstashConfig = {
    val __obj = js.Dynamic.literal()
    if (awsOpts != null) __obj.updateDynamic("awsOpts")(awsOpts)
    if (dynamoOpts != null) __obj.updateDynamic("dynamoOpts")(dynamoOpts)
    if (kmsKey != null) __obj.updateDynamic("kmsKey")(kmsKey)
    if (kmsOpts != null) __obj.updateDynamic("kmsOpts")(kmsOpts)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[CredstashConfig]
  }
}

