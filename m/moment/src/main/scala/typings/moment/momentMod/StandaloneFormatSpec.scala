package typings.moment.momentMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandaloneFormatSpec extends js.Object {
  var format: js.Array[String] = js.native
  var isFormat: js.UndefOr[RegExp] = js.native
  var standalone: js.Array[String] = js.native
}

object StandaloneFormatSpec {
  @scala.inline
  def apply(format: js.Array[String], standalone: js.Array[String]): StandaloneFormatSpec = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandaloneFormatSpec]
  }
  @scala.inline
  implicit class StandaloneFormatSpecOps[Self <: StandaloneFormatSpec] (val x: Self) extends AnyVal {
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
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandaloneVarargs(value: String*): Self = this.set("standalone", js.Array(value :_*))
    @scala.inline
    def setStandalone(value: js.Array[String]): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFormat(value: RegExp): Self = this.set("isFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFormat: Self = this.set("isFormat", js.undefined)
  }
  
}

