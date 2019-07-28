package typings.nodecredstash.nodecredstashMod

import typings.awsDashSdk.clientsKmsMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredstashConfig extends js.Object {
  var awsOpts: js.UndefOr[ClientConfiguration] = js.undefined
  var dynamoOpts: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ClientConfiguration] = js.undefined
  var kmsKey: js.UndefOr[String] = js.undefined
  var kmsOpts: js.UndefOr[ClientConfiguration] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object CredstashConfig {
  @scala.inline
  def apply(
    awsOpts: ClientConfiguration = null,
    dynamoOpts: typings.awsDashSdk.clientsDynamodbMod.ClientConfiguration = null,
    kmsKey: String = null,
    kmsOpts: ClientConfiguration = null,
    table: String = null
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

