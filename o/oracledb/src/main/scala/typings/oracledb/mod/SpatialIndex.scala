package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure to configure the properties of a Spatial Index.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-index-specifications-reference.html#GUID-00C06941-6FFD-4CEB-81B6-9A7FBD577A2C
  */
@js.native
trait SpatialIndex extends js.Object {
  /** Specifies that the targeted field need not be present or have a GeoJSON geometry object as its value. */
  var lax: js.UndefOr[Boolean] = js.native
  /** Name of the index. */
  var name: String = js.native
  /** Specifies that the targeted field must be present and have a GeoJSON geometry object as its value. */
  var scalarRequired: js.UndefOr[Boolean] = js.native
  /** Specifies the path to the JSON field to be indexed. */
  var spatial: String = js.native
}

object SpatialIndex {
  @scala.inline
  def apply(name: String, spatial: String): SpatialIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialIndex]
  }
  @scala.inline
  implicit class SpatialIndexOps[Self <: SpatialIndex] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpatial(value: String): Self = this.set("spatial", value.asInstanceOf[js.Any])
    @scala.inline
    def setLax(value: Boolean): Self = this.set("lax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLax: Self = this.set("lax", js.undefined)
    @scala.inline
    def setScalarRequired(value: Boolean): Self = this.set("scalarRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalarRequired: Self = this.set("scalarRequired", js.undefined)
  }
  
}

