package typings.momentDashShortformat.momentDashShortformatMod

import typings.moment.momentMod.Moment
import typings.moment.momentMod.MomentBuiltinFormat
import typings.moment.momentMod.MomentFormatSpecification
import typings.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-shortformat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ISO_8601: MomentBuiltinFormat = js.native
  var RFC_2822: MomentBuiltinFormat = js.native
  var defaultFormat: String = js.native
  var defaultFormatUtc: String = js.native
  var fn: Moment = js.native
  var version: String = js.native
  def apply(): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
}

