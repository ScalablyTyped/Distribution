package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  /**
    * `json` by default. Can be `raw`, `text`, `html`, `full`, `diff`, `patch`, `sha`, `base64`. Depending on endpoint
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Custom media type names of {@link https://developer.github.com/v3/media/|API Previews} without the `-preview` suffix.
    * Example for single preview: `['squirrel-girl']`.
    * Example for multiple previews: `['squirrel-girl', 'mister-fantastic']`.
    */
  var previews: js.UndefOr[js.Array[String]] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPreviewsVarargs(value: String*): Self = this.set("previews", js.Array(value :_*))
    @scala.inline
    def setPreviews(value: js.Array[String]): Self = this.set("previews", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviews: Self = this.set("previews", js.undefined)
  }
  
}

