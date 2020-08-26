package typings.nodecredstash.mod

import typings.awsSdk.kmsMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredstashConfig extends js.Object {
  var awsOpts: js.UndefOr[ClientConfiguration] = js.native
  var dynamoOpts: js.UndefOr[typings.awsSdk.dynamodbMod.ClientConfiguration] = js.native
  var kmsKey: js.UndefOr[String] = js.native
  var kmsOpts: js.UndefOr[ClientConfiguration] = js.native
  var table: js.UndefOr[String] = js.native
}

object CredstashConfig {
  @scala.inline
  def apply(): CredstashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredstashConfig]
  }
  @scala.inline
  implicit class CredstashConfigOps[Self <: CredstashConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsOpts(value: ClientConfiguration): Self = this.set("awsOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsOpts: Self = this.set("awsOpts", js.undefined)
    @scala.inline
    def setDynamoOpts(value: typings.awsSdk.dynamodbMod.ClientConfiguration): Self = this.set("dynamoOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamoOpts: Self = this.set("dynamoOpts", js.undefined)
    @scala.inline
    def setKmsKey(value: String): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKey: Self = this.set("kmsKey", js.undefined)
    @scala.inline
    def setKmsOpts(value: ClientConfiguration): Self = this.set("kmsOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsOpts: Self = this.set("kmsOpts", js.undefined)
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

