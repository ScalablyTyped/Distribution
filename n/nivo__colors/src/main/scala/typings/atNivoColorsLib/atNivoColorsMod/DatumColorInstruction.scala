package typings
package atNivoColorsLib.atNivoColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatumColorInstruction
  extends _OrdinalColorsInstruction[js.Any] {
  var datum: java.lang.String
}

object DatumColorInstruction {
  @scala.inline
  def apply(datum: java.lang.String): DatumColorInstruction = {
    val __obj = js.Dynamic.literal(datum = datum)
  
    __obj.asInstanceOf[DatumColorInstruction]
  }
}

