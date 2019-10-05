package typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", "wrapErrorSerializer")
@js.native
object wrapErrorSerializer extends js.Object {
  def apply(customSerializer: CustomErrorSerializer): js.Function1[/* err */ Error, Record[String, _]] = js.native
}

