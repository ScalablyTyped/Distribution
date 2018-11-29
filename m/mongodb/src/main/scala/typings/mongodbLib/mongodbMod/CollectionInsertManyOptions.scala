package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectionInsertManyOptions extends CommonOptions {
  /**
       * Allow driver to bypass schema validation in MongoDB 3.2 or higher.
       */
  var bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Force server to assign _id values instead of driver.
       */
  var forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, when an insert fails, don't execute the remaining writes. If false, continue with remaining inserts when one fails.
       */
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Serialize functions on any object.
       */
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
}

