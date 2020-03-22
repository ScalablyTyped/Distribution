package typings.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetIdentifier extends js.Object {
  def getIdentifier(identifier: js.Any): String
  def getValues(): js.Array[_]
}

object AnonGetIdentifier {
  @scala.inline
  def apply(getIdentifier: js.Any => String, getValues: () => js.Array[_]): AnonGetIdentifier = {
    val __obj = js.Dynamic.literal(getIdentifier = js.Any.fromFunction1(getIdentifier), getValues = js.Any.fromFunction0(getValues))
  
    __obj.asInstanceOf[AnonGetIdentifier]
  }
}

