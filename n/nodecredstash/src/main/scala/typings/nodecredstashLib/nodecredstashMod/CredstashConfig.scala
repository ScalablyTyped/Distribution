package typings
package nodecredstashLib.nodecredstashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CredstashConfig extends js.Object {
  var awsOpts: js.UndefOr[awsDashSdkLib.clientsKmsMod.KMSNs.ClientConfiguration] = js.undefined
  var dynamoOpts: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.ClientConfiguration] = js.undefined
  var kmsKey: js.UndefOr[java.lang.String] = js.undefined
  var kmsOpts: js.UndefOr[awsDashSdkLib.clientsKmsMod.KMSNs.ClientConfiguration] = js.undefined
  var table: js.UndefOr[java.lang.String] = js.undefined
}

