package typings
package pinoDashMultiDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: js.UndefOr[pinoDashMultiDashStreamLib.pinoDashMultiDashStreamMod.Level] = js.undefined
  var stream: nodeLib.NodeJSNs.WritableStream
}

object Anon_Level {
  @scala.inline
  def apply(
    stream: nodeLib.NodeJSNs.WritableStream,
    level: pinoDashMultiDashStreamLib.pinoDashMultiDashStreamMod.Level = null
  ): Anon_Level = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[Anon_Level]
  }
}

