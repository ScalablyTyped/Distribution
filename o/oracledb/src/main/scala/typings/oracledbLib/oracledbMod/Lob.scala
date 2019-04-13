package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable-next-line:interface-name */
@js.native
trait Lob
  extends nodeLib.streamMod.Duplex {
  /** This corresponds to the size used by the Oracle LOB layer when accessing or modifying the LOB value. */
  var chunkSize: scala.Double = js.native
  var iLob: ILob = js.native
  /** Length of a queried LOB in bytes (for BLOBs) or characters (for CLOBs). */
  var length: scala.Double = js.native
  /**
  		 * he number of bytes (for BLOBs) or characters (for CLOBs) to read for each Stream 'data' event of a queried LOB.
  		 * The default value is chunkSize.
  		 * For efficiency, it is recommended that pieceSize be a multiple of chunkSize.
  		 * The maximum value for pieceSize is limited to the value of UINT_MAX.
  		 */
  var pieceSize: scala.Double = js.native
  /**
  		 * This read-only attribute shows the type of Lob being used. It will have the value of one of the constants Oracledb.BLOB or Oracledb.CLOB. The value is derived from the bind type when using LOB bind variables, or from the column type when a LOB is returned by a query.
  		 */
  var `type`: scala.Double = js.native
  def close(): scala.Unit = js.native
  /**
  		 * Closes the current LOB.
  		 * @param  {(err: any) => void} callback? When passed, is called after the release.
  		 * @returns void
  		 */
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

