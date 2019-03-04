package typings
package oracledbLib.oracledbMod.oracledbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILob extends js.Object {
  var chunkSize: scala.Double
  var length: scala.Double
  var offset: js.UndefOr[scala.Double] = js.undefined
  var pieceSize: scala.Double
  /**
  		 * Read method on ILob class.
  		 * @param {(err : any, chunk: string | Buffer) => void} callback Callback to recive the data from lob.
  		 * @remarks CLobs send strings while BLobs send Buffer object.
  		 */
  var read: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* chunk */ java.lang.String | nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * Release method on ILob class.
  		 * @remarks The cleanup() called by Release() only frees OCI error handle and Lob
  		 *          locator.  These calls acquire mutex on OCI environment handle very briefly.
  		 */
  var release: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var `type`: java.lang.String
  /**
  		 * Read method on ILob class.
  		 * @param {Buffer} data Data write into Lob.
  		 * @param {(err: any) => void} callback Callback executed when writ is finished or when some error occured.
  		 * @remarks CLobs send strings while BLobs send Buffer object.
  		 */
  var write: js.UndefOr[
    js.Function2[
      /* data */ nodeLib.Buffer, 
      /* callback */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

object ILob {
  @scala.inline
  def apply(
    chunkSize: scala.Double,
    length: scala.Double,
    pieceSize: scala.Double,
    `type`: java.lang.String,
    offset: scala.Int | scala.Double = null,
    read: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* chunk */ java.lang.String | nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ] = null,
    release: js.Function0[scala.Unit] = null,
    write: js.Function2[
      /* data */ nodeLib.Buffer, 
      /* callback */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ] = null
  ): ILob = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize, length = length, pieceSize = pieceSize)
    __obj.updateDynamic("type")(`type`)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read)
    if (release != null) __obj.updateDynamic("release")(release)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[ILob]
  }
}

