package typings.oracleOraclejet.ojprogressMod

import typings.oracleOraclejet.anon.AriaIndeterminateProgressText
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojProgressSettableProperties extends baseComponentSettableProperties {
  var max: Double = js.native
  @JSName("translations")
  var translations_ojProgressSettableProperties: AriaIndeterminateProgressText = js.native
  var `type`: bar | circle = js.native
  var value: Double = js.native
}

object ojProgressSettableProperties {
  @scala.inline
  def apply(max: Double, translations: AriaIndeterminateProgressText, `type`: bar | circle, value: Double): ojProgressSettableProperties = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressSettableProperties]
  }
  @scala.inline
  implicit class ojProgressSettablePropertiesOps[Self <: ojProgressSettableProperties] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: AriaIndeterminateProgressText): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: bar | circle): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

