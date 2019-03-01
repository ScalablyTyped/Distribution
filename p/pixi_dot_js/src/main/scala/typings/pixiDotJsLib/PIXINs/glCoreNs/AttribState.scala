package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttribState extends js.Object {
  var attribState: js.Array[Attrib]
  var tempAttribState: js.Array[Attrib]
}

object AttribState {
  @scala.inline
  def apply(attribState: js.Array[Attrib], tempAttribState: js.Array[Attrib]): AttribState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attribState")(attribState)
    __obj.updateDynamic("tempAttribState")(tempAttribState)
    __obj.asInstanceOf[AttribState]
  }
}

