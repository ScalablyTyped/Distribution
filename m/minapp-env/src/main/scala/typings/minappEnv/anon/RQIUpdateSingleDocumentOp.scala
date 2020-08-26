package typings.minappEnv.anon

import typings.minappEnv.DB.IUpdateCondition
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IUpdateSingleDocumentOptions> */
@js.native
trait RQIUpdateSingleDocumentOp extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
  var data: IUpdateCondition = js.native
}

object RQIUpdateSingleDocumentOp {
  @scala.inline
  def apply(data: IUpdateCondition): RQIUpdateSingleDocumentOp = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIUpdateSingleDocumentOp]
  }
  @scala.inline
  implicit class RQIUpdateSingleDocumentOpOps[Self <: RQIUpdateSingleDocumentOp] (val x: Self) extends AnyVal {
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
    def setData(value: IUpdateCondition): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
  
}

