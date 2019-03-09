package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBFactory extends js.Object {
  /**
    * Compares two values as keys. Returns -1 if key1 precedes key2, 1 if key2 precedes key1, and 0 if
    * the keys are equal.
    * Throws a "DataError" DOMException if either input is not a valid key.
    */
  def cmp(first: js.Any, second: js.Any): scala.Double = js.native
  /**
    * Attempts to delete the named database. If the
    * database already exists and there are open connections that don't close in response to a versionchange event, the request will be blocked until all they close. If the request
    * is successful request's result will be null.
    */
  def deleteDatabase(name: java.lang.String): IDBOpenDBRequest = js.native
  /**
    * Attempts to open a connection to the named database with the specified version. If the database already exists
    * with a lower version and there are open connections that don't close in response to a versionchange event, the request will be blocked until all they close, then an upgrade
    * will occur. If the database already exists with a higher
    * version the request will fail. If the request is
    * successful request's result will
    * be the connection.
    */
  def open(name: java.lang.String): IDBOpenDBRequest = js.native
  def open(name: java.lang.String, version: scala.Double): IDBOpenDBRequest = js.native
}

@JSGlobal("IDBFactory")
@js.native
object IDBFactory
  extends org.scalablytyped.runtime.Instantiable0[IDBFactory]

