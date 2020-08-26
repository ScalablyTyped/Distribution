package typings.netflixNerror.mod

import typings.netflixNerror.mod.VError.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@netflix/nerror", "VError")
@js.native
class VError_ protected () extends Error {
  def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
  def this(message: String, params: js.Any*) = this()
  def this(options: Options, message: String, params: js.Any*) = this()
  def this(options: Error, message: String, params: js.Any*) = this()
  def cause(): js.UndefOr[Error] = js.native
}

