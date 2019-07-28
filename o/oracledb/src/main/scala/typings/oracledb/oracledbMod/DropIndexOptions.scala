package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which may be passed to SODA collection.dropIndex().
  */
trait DropIndexOptions extends js.Object {
  /**
    * Setting force to true forces dropping of a JSON Search index or Spatial index if the
    * underlying Oracle Database domain index does not permit normal dropping.
    *
    * @see https://www.oracle.com/pls/topic/lookup?ctx=dblatest&id=GUID-F60F75DF-2866-4F93-BB7F-8FCE64BF67B6
    */
  var force: js.UndefOr[Boolean] = js.undefined
}

object DropIndexOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): DropIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[DropIndexOptions]
  }
}

