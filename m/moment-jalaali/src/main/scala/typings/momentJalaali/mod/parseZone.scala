package typings.momentJalaali.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-jalaali", "parseZone")
@js.native
object parseZone extends js.Object {
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

