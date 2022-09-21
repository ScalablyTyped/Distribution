package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends StObject {
  
  def changeVersion(var1: String, var2: String): Unit = js.native
  
  def transaction(): Unit = js.native
  def transaction(populateDB: js.Function1[/* tx */ SQLTransaction, Any]): Unit = js.native
  def transaction(populateDB: js.Function1[/* tx */ SQLTransaction, Any], errorCB: js.Function1[/* err */ Any, Any]): Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, Any],
    errorCB: js.Function1[/* err */ Any, Any],
    successCB: js.Function0[Any]
  ): Unit = js.native
  def transaction(
    populateDB: js.Function1[/* tx */ SQLTransaction, Any],
    errorCB: Unit,
    successCB: js.Function0[Any]
  ): Unit = js.native
  def transaction(populateDB: Unit, errorCB: js.Function1[/* err */ Any, Any]): Unit = js.native
  def transaction(populateDB: Unit, errorCB: js.Function1[/* err */ Any, Any], successCB: js.Function0[Any]): Unit = js.native
  def transaction(populateDB: Unit, errorCB: Unit, successCB: js.Function0[Any]): Unit = js.native
}
