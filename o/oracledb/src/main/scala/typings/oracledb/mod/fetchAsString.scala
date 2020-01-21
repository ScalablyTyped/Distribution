package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of node-oracledb types. The valid types are oracledb.DATE, oracledb.NUMBER, oracledb.BUFFER, and oracledb.CLOB.
  * When any column having one of the specified types is queried with execute() or queryStream(), the column data is returned as a string instead of the default representation.
  *
  * By default in node-oracledb, all columns are returned as native types or as Lob instances, in the case of CLOB and BLOB types.
  *
  * This property helps avoid situations where using JavaScript types can lead to numeric precision loss, or where date conversion is unwanted.
  *
  * For raw data returned as a string, Oracle returns the data as a hex-encoded string.
  * For dates and numbers returned as a string, the maximum length of a string created by this mapping is 200 bytes.
  * Strings created for CLOB columns will generally be limited by Node.js and V8 memory restrictions.
  *
  * Individual query columns in execute() or queryStream() calls can override the fetchAsString global setting by using fetchInfo.
  *
  * For non-CLOB types, the conversion to string is handled by Oracle client libraries and is often referred to as defining the fetch type.
  */
@JSImport("oracledb", "fetchAsString")
@js.native
object fetchAsString
  extends TopLevel[js.Array[Double]]

