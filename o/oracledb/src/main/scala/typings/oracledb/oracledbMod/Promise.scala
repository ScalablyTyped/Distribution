package typings.oracledb.oracledbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node-oracledb supports Promises on all methods. The standard Promise library is used.
  *
  * This property can be set to override or disable the Promise implementation.
  *
  * Promises can be disabled by setting this property to null.
  *
  * Example:
  *
  *      const myLib = require('myFavouritePromiseImplementation');
  *      oracledb.Promise = myLib;
  */
@JSImport("oracledb", "Promise")
@js.native
object Promise
  extends TopLevel[js.Promise[js.Any]]

