package typings
package msgpackDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Preset extends js.Object {
  /**
    * The default built-in codec
    */
  var preset: msgpackDashLiteLib.msgpackDashLiteMod.Codec
}

object Anon_Preset {
  @scala.inline
  def apply(preset: msgpackDashLiteLib.msgpackDashLiteMod.Codec): Anon_Preset = {
    val __obj = js.Dynamic.literal(preset = preset)
  
    __obj.asInstanceOf[Anon_Preset]
  }
}

