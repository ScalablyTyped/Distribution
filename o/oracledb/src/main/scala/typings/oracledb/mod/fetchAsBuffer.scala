package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configure data types to be returned as a Buffer instead of the default representation when queried with execute() or queryStream().
  *
  * Currently the only valid type is oracledb.BLOB.
  *
  * By default in node-oracledb, all columns are returned as native types or as Lob instances, in the case of CLOB and BLOB types.
  *
  * Individual query columns in execute() or queryStream() calls can override the fetchAsBuffer global setting by using fetchInfo.
  *
  * @since 1.13
  */
@JSImport("oracledb", "fetchAsBuffer")
@js.native
object fetchAsBuffer
  extends TopLevel[js.Array[Double]]
