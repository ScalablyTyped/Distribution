package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure to configure the properties of a Spatial Index.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-index-specifications-reference.html#GUID-00C06941-6FFD-4CEB-81B6-9A7FBD577A2C
  */
trait SpatialIndex extends js.Object {
  /** Specifies that the targeted field need not be present or have a GeoJSON geometry object as its value. */
  var lax: js.UndefOr[Boolean] = js.undefined
  /** Name of the index. */
  var name: String
  /** Specifies that the targeted field must be present and have a GeoJSON geometry object as its value. */
  var scalarRequired: js.UndefOr[Boolean] = js.undefined
  /** Specifies the path to the JSON field to be indexed. */
  var spatial: String
}

object SpatialIndex {
  @scala.inline
  def apply(
    name: String,
    spatial: String,
    lax: js.UndefOr[Boolean] = js.undefined,
    scalarRequired: js.UndefOr[Boolean] = js.undefined
  ): SpatialIndex = {
    val __obj = js.Dynamic.literal(name = name, spatial = spatial)
    if (!js.isUndefined(lax)) __obj.updateDynamic("lax")(lax)
    if (!js.isUndefined(scalarRequired)) __obj.updateDynamic("scalarRequired")(scalarRequired)
    __obj.asInstanceOf[SpatialIndex]
  }
}

