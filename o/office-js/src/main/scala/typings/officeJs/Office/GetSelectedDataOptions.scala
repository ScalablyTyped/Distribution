package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for customizing what data is returned and how it is formatted.
  */
@js.native
trait GetSelectedDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Specify whether to get only the visible (that is, filtered-in) data or all the data. Useful when filtering data. 
    * Use {@link Office.FilterType} or string equivalent. This parameter is ignored in Word documents.
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /**
    * Specify whether the data is formatted. Use Office.ValueFormat or string equivalent.
    */
  var valueFormat: js.UndefOr[ValueFormat | String] = js.native
}

object GetSelectedDataOptions {
  @scala.inline
  def apply(): GetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSelectedDataOptions]
  }
  @scala.inline
  implicit class GetSelectedDataOptionsOps[Self <: GetSelectedDataOptions] (val x: Self) extends AnyVal {
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setFilterType(value: FilterType | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setValueFormat(value: ValueFormat | String): Self = this.set("valueFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
  }
  
}

