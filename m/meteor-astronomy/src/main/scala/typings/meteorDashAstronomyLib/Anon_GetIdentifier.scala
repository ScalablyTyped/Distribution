package typings
package meteorDashAstronomyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetIdentifier extends js.Object {
  def getIdentifier(identifier: js.Any): java.lang.String
  def getValues(): js.Array[_]
}

object Anon_GetIdentifier {
  @scala.inline
  def apply(getIdentifier: js.Function1[js.Any, java.lang.String], getValues: js.Function0[js.Array[_]]): Anon_GetIdentifier = {
    val __obj = js.Dynamic.literal(getIdentifier = getIdentifier, getValues = getValues)
  
    __obj.asInstanceOf[Anon_GetIdentifier]
  }
}

