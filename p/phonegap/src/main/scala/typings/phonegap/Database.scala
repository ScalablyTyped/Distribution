package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  def changeVersion(var1: String, var2: String): Unit = js.native
  
  def transaction(): Unit = js.native
  def transaction(
    populateDB: js.UndefOr[scala.Nothing],
    errorCB: js.UndefOr[scala.Nothing],
    successCB: js.Function0[_]
  ): Unit = js.native
  def transaction(populateDB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* err */ js.Any, _]): Unit = js.native
  def transaction(
    populateDB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* err */ js.Any, _],
    successCB: js.Function0[_]
  ): Unit = js.native
  def transaction(populateDB: js.Function1[/* tx */ SQLTransaction, _]): Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, _],
    errorCB: js.UndefOr[scala.Nothing],
    successCB: js.Function0[_]
  ): Unit = js.native
  def transaction(populateDB: js.Function1[/* tx */ SQLTransaction, _], errorCB: js.Function1[/* err */ js.Any, _]): Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, _],
    errorCB: js.Function1[/* err */ js.Any, _],
    successCB: js.Function0[_]
  ): Unit = js.native
}
