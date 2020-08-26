package typings.miniprogramWxs.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedCollatorOptions extends js.Object {
  var caseFirst: String = js.native
  var collation: String = js.native
  var ignorePunctuation: Boolean = js.native
  var locale: String = js.native
  var numeric: Boolean = js.native
  var sensitivity: String = js.native
  var usage: String = js.native
}

object ResolvedCollatorOptions {
  @scala.inline
  def apply(
    caseFirst: String,
    collation: String,
    ignorePunctuation: Boolean,
    locale: String,
    numeric: Boolean,
    sensitivity: String,
    usage: String
  ): ResolvedCollatorOptions = {
    val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedCollatorOptions]
  }
  @scala.inline
  implicit class ResolvedCollatorOptionsOps[Self <: ResolvedCollatorOptions] (val x: Self) extends AnyVal {
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
    def setCaseFirst(value: String): Self = this.set("caseFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollation(value: String): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnorePunctuation(value: Boolean): Self = this.set("ignorePunctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def setSensitivity(value: String): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
  }
  
}

