package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def changeVersion(var1: java.lang.String, var2: java.lang.String): scala.Unit = js.native
  def transaction(): scala.Unit = js.native
  def transaction(populateDB: js.Function1[/* tx */ SQLTransaction, _]): scala.Unit = js.native
  def transaction(populateDB: js.Function1[/* tx */ SQLTransaction, _], errorCB: js.Function1[/* err */ js.Any, _]): scala.Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, _],
    errorCB: js.Function1[/* err */ js.Any, _],
    successCB: js.Function0[_]
  ): scala.Unit = js.native
}

