package typings.mongooseDashSeeder.mongooseDashSeederMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var dropCollections: js.UndefOr[Boolean] = js.undefined
  var dropDatabase: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    dropCollections: js.UndefOr[Boolean] = js.undefined,
    dropDatabase: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropCollections)) __obj.updateDynamic("dropCollections")(dropCollections)
    if (!js.isUndefined(dropDatabase)) __obj.updateDynamic("dropDatabase")(dropDatabase)
    __obj.asInstanceOf[IOptions]
  }
}

