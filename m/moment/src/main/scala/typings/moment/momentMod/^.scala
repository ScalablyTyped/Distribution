package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment/ts3.1-typings/moment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ISO_8601: MomentBuiltinFormat = js.native
  var RFC_2822: MomentBuiltinFormat = js.native
  var defaultFormat: String = js.native
  var defaultFormatUtc: String = js.native
  var fn: Moment = js.native
  var version: String = js.native
  def apply(): Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
}

