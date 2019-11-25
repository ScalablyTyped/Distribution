package typings.atNivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  domain  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>}>,   ticks  :std.Partial<{  line  :std.Partial<react.react.CSSProperties>,   text  :std.Partial<react.react.CSSProperties>}>,   legend  :std.Partial<{  text  :std.Partial<react.react.CSSProperties>}>}> */
trait PartialdomainPartiallinePartialCSSPropertiesticksP extends js.Object {
  var domain: js.UndefOr[PartiallinePartialCSSProperties] = js.undefined
  var legend: js.UndefOr[PartialtextPartialCSSProperties] = js.undefined
  var ticks: js.UndefOr[PartiallinePartialCSSPropertiestextPartialCSSPrope] = js.undefined
}

object PartialdomainPartiallinePartialCSSPropertiesticksP {
  @scala.inline
  def apply(
    domain: PartiallinePartialCSSProperties = null,
    legend: PartialtextPartialCSSProperties = null,
    ticks: PartiallinePartialCSSPropertiestextPartialCSSPrope = null
  ): PartialdomainPartiallinePartialCSSPropertiesticksP = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialdomainPartiallinePartialCSSPropertiesticksP]
  }
}

