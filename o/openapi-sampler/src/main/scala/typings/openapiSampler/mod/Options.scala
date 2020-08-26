package typings.openapiSampler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Don't log console warning messages
    */
  val quiet: js.UndefOr[Boolean] = js.native
  /**
    * Don't include non-required object properties not specified in `required` property of the schema object
    */
  val skipNonRequired: js.UndefOr[Boolean] = js.native
  /**
    * Don't include readOnly object properties
    */
  val skipReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * Don't include writeOnly object properties
    */
  val skipWriteOnly: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setSkipNonRequired(value: Boolean): Self = this.set("skipNonRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipNonRequired: Self = this.set("skipNonRequired", js.undefined)
    @scala.inline
    def setSkipReadOnly(value: Boolean): Self = this.set("skipReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipReadOnly: Self = this.set("skipReadOnly", js.undefined)
    @scala.inline
    def setSkipWriteOnly(value: Boolean): Self = this.set("skipWriteOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipWriteOnly: Self = this.set("skipWriteOnly", js.undefined)
  }
  
}

