package typings.nodecredstash.nodecredstashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredstashConfig extends js.Object {
  var awsOpts: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.KMS.ClientConfiguration */ js.Any
  ] = js.undefined
  var dynamoOpts: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ClientConfiguration */ js.Any
  ] = js.undefined
  var kmsKey: js.UndefOr[String] = js.undefined
  var kmsOpts: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.KMS.ClientConfiguration */ js.Any
  ] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object CredstashConfig {
  @scala.inline
  def apply(
    awsOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.KMS.ClientConfiguration */ js.Any = null,
    dynamoOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.ClientConfiguration */ js.Any = null,
    kmsKey: String = null,
    kmsOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.KMS.ClientConfiguration */ js.Any = null,
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

