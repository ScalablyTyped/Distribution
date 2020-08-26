package typings.oracleOraclejet.ojtimeaxisMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.oracleOraclejetStrings.days
import typings.oracleOraclejet.oracleOraclejetStrings.hours
import typings.oracleOraclejet.oracleOraclejetStrings.minutes
import typings.oracleOraclejet.oracleOraclejetStrings.months
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.quarters
import typings.oracleOraclejet.oracleOraclejetStrings.seconds
import typings.oracleOraclejet.oracleOraclejetStrings.weeks
import typings.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtimeaxis.ojTimeAxisSettableProperties> */
@js.native
trait ojTimeAxisSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var converter: js.UndefOr[Converters | Converter[String]] = js.native
  var end: js.UndefOr[String] = js.native
  var scale: js.UndefOr[seconds | minutes | hours | days | weeks | months | quarters | years] = js.native
  var start: js.UndefOr[String] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelAndValue] = js.native
}

object ojTimeAxisSettablePropertiesLenient {
  @scala.inline
  def apply(): ojTimeAxisSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTimeAxisSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojTimeAxisSettablePropertiesLenientOps[Self <: ojTimeAxisSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setConverter(value: Converters | Converter[String]): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

