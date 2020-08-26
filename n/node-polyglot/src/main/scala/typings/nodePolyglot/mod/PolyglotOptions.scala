package typings.nodePolyglot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyglotOptions extends js.Object {
  var allowMissing: js.UndefOr[Boolean] = js.native
  var interpolation: js.UndefOr[InterpolationTokenOptions] = js.native
  var locale: js.UndefOr[String] = js.native
  var onMissingKey: js.UndefOr[
    js.Function3[/* key */ String, /* options */ InterpolationOptions, /* locale */ String, String]
  ] = js.native
  var phrases: js.UndefOr[js.Any] = js.native
  var pluralRules: js.UndefOr[PluralRules] = js.native
  var warn: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
}

object PolyglotOptions {
  @scala.inline
  def apply(): PolyglotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolyglotOptions]
  }
  @scala.inline
  implicit class PolyglotOptionsOps[Self <: PolyglotOptions] (val x: Self) extends AnyVal {
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
    def setAllowMissing(value: Boolean): Self = this.set("allowMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMissing: Self = this.set("allowMissing", js.undefined)
    @scala.inline
    def setInterpolation(value: InterpolationTokenOptions): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOnMissingKey(value: (/* key */ String, /* options */ InterpolationOptions, /* locale */ String) => String): Self = this.set("onMissingKey", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnMissingKey: Self = this.set("onMissingKey", js.undefined)
    @scala.inline
    def setPhrases(value: js.Any): Self = this.set("phrases", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    @scala.inline
    def setPluralRules(value: PluralRules): Self = this.set("pluralRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluralRules: Self = this.set("pluralRules", js.undefined)
    @scala.inline
    def setWarn(value: /* message */ String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

