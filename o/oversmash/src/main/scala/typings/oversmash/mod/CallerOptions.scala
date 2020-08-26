package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallerOptions extends js.Object {
  var defaultPlatform: String = js.native
  var normalizeNames: Boolean = js.native
  var normalizeNamesAs: NormalizeNamesAs = js.native
  var normalizeValues: Boolean = js.native
  var percentsToInts: Boolean = js.native
  var portraitUrlTemplate: String = js.native
  var requestOptions: RequestOptions = js.native
}

object CallerOptions {
  @scala.inline
  def apply(
    defaultPlatform: String,
    normalizeNames: Boolean,
    normalizeNamesAs: NormalizeNamesAs,
    normalizeValues: Boolean,
    percentsToInts: Boolean,
    portraitUrlTemplate: String,
    requestOptions: RequestOptions
  ): CallerOptions = {
    val __obj = js.Dynamic.literal(defaultPlatform = defaultPlatform.asInstanceOf[js.Any], normalizeNames = normalizeNames.asInstanceOf[js.Any], normalizeNamesAs = normalizeNamesAs.asInstanceOf[js.Any], normalizeValues = normalizeValues.asInstanceOf[js.Any], percentsToInts = percentsToInts.asInstanceOf[js.Any], portraitUrlTemplate = portraitUrlTemplate.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerOptions]
  }
  @scala.inline
  implicit class CallerOptionsOps[Self <: CallerOptions] (val x: Self) extends AnyVal {
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
    def setDefaultPlatform(value: String): Self = this.set("defaultPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizeNames(value: Boolean): Self = this.set("normalizeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizeNamesAs(value: NormalizeNamesAs): Self = this.set("normalizeNamesAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizeValues(value: Boolean): Self = this.set("normalizeValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentsToInts(value: Boolean): Self = this.set("percentsToInts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortraitUrlTemplate(value: String): Self = this.set("portraitUrlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
  }
  
}

