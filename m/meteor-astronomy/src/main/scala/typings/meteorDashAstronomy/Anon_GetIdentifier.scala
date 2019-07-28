package typings.meteorDashAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetIdentifier extends js.Object {
  def getIdentifier(identifier: js.Any): String
  def getValues(): js.Array[_]
}

object Anon_GetIdentifier {
  @scala.inline
  def apply(getIdentifier: js.Any => String, getValues: () => js.Array[_]): Anon_GetIdentifier = {
    val __obj = js.Dynamic.literal(getIdentifier = js.Any.fromFunction1(getIdentifier), getValues = js.Any.fromFunction0(getValues))
  
    __obj.asInstanceOf[Anon_GetIdentifier]
  }
}

