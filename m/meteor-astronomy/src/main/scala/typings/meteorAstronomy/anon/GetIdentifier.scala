package typings.meteorAstronomy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentifier extends js.Object {
  def getIdentifier(identifier: js.Any): String
  def getValues(): js.Array[_]
}

object GetIdentifier {
  @scala.inline
  def apply(getIdentifier: js.Any => String, getValues: () => js.Array[_]): GetIdentifier = {
    val __obj = js.Dynamic.literal(getIdentifier = js.Any.fromFunction1(getIdentifier), getValues = js.Any.fromFunction0(getValues))
    __obj.asInstanceOf[GetIdentifier]
  }
}

