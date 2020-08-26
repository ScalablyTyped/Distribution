package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var metaData: js.UndefOr[SodaMetadata] = js.native
  /**
    * If mode is SODA_COLL_MAP_MODE, the collection will be stored in an externally,
    * previously created table. A future sodaCollection.drop() will not drop the collection table.
    * It will simply unmap it, making it inaccessible to SODA operations.
    *
    * Most users will leave mode undefined.
    */
  var mode: js.UndefOr[Double] = js.native
}

object SodaCollectionOptions {
  @scala.inline
  def apply(): SodaCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaCollectionOptions]
  }
  @scala.inline
  implicit class SodaCollectionOptionsOps[Self <: SodaCollectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetaData(value: SodaMetadata): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

