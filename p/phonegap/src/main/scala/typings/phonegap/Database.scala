package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends StObject {
  
  def changeVersion(var1: String, var2: String): Unit = js.native
  
  def transaction(): Unit = js.native
  def transaction(populateDB: js.Function1[/* tx */ SQLTransaction, js.Any]): Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, js.Any],
    errorCB: js.Function1[/* err */ js.Any, js.Any]
  ): Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, js.Any],
    errorCB: js.Function1[/* err */ js.Any, js.Any],
    successCB: js.Function0[js.Any]
  ): Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, js.Any],
    errorCB: Unit,
    successCB: js.Function0[js.Any]
  ): Unit = js.native
  def transaction(populateDB: Unit, errorCB: js.Function1[/* err */ js.Any, js.Any]): Unit = js.native
  def transaction(populateDB: Unit, errorCB: js.Function1[/* err */ js.Any, js.Any], successCB: js.Function0[js.Any]): Unit = js.native
  def transaction(populateDB: Unit, errorCB: Unit, successCB: js.Function0[js.Any]): Unit = js.native
}
