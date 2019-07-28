package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SodaCollectionOptions extends js.Object {
  /**
    * Metadata specifying various details about the collection, such as its database storage, whether it should
    * track version and time stamp document components, how such components are generated, and what document
    * types are.
    *
    * If undefined or null, then a default collection metadata description will be used. The default
    * metadata specifies that the collection contains only JSON documents, and is recommend for most SODA users.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaclientkeys
    * @see https://www.oracle.com/pls/topic/lookup?ctx=dblatest&id=GUID-49EFF3D3-9FAB-4DA6-BDE2-2650383566A3
    */
  var metaData: js.UndefOr[SodaMetadata] = js.undefined
  /**
    * If mode is SODA_COLL_MAP_MODE, the collection will be stored in an externally,
    * previously created table. A future sodaCollection.drop() will not drop the collection table.
    * It will simply unmap it, making it inaccessible to SODA operations.
    *
    * Most users will leave mode undefined.
    */
  var mode: js.UndefOr[Double] = js.undefined
}

object SodaCollectionOptions {
  @scala.inline
  def apply(metaData: SodaMetadata = null, mode: Int | Double = null): SodaCollectionOptions = {
    val __obj = js.Dynamic.literal()
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaCollectionOptions]
  }
}

