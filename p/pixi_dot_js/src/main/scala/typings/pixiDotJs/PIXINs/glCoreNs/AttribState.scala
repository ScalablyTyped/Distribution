package typings.pixiDotJs.PIXINs.glCoreNs

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
    val __obj = js.Dynamic.literal(attribState = attribState, tempAttribState = tempAttribState)
  
    __obj.asInstanceOf[AttribState]
  }
}

