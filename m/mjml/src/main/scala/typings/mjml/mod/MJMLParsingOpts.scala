package typings.mjml.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mjml.mjmlStrings.skip
import typings.mjml.mjmlStrings.soft
import typings.mjml.mjmlStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MJMLParsingOpts extends js.Object {
  var beautify: js.UndefOr[Boolean] = js.native
  var filePath: js.UndefOr[String] = js.native
  var fonts: js.UndefOr[StringDictionary[String]] = js.native
  var keepComments: js.UndefOr[Boolean] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var minifyOptions: js.UndefOr[MJMLMinifyOptions] = js.native
  var validationLevel: js.UndefOr[strict | soft | skip] = js.native
}

object MJMLParsingOpts {
  @scala.inline
  def apply(): MJMLParsingOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MJMLParsingOpts]
  }
  @scala.inline
  implicit class MJMLParsingOptsOps[Self <: MJMLParsingOpts] (val x: Self) extends AnyVal {
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
    def setBeautify(value: Boolean): Self = this.set("beautify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeautify: Self = this.set("beautify", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setFonts(value: StringDictionary[String]): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setKeepComments(value: Boolean): Self = this.set("keepComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepComments: Self = this.set("keepComments", js.undefined)
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setMinifyOptions(value: MJMLMinifyOptions): Self = this.set("minifyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinifyOptions: Self = this.set("minifyOptions", js.undefined)
    @scala.inline
    def setValidationLevel(value: strict | soft | skip): Self = this.set("validationLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationLevel: Self = this.set("validationLevel", js.undefined)
  }
  
}

