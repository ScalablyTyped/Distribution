package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionInsertOneOptions extends CommonOptions {
  //Allow driver to bypass schema validation in MongoDB 3.2 or higher.
  var bypassDocumentValidation: js.UndefOr[scala.Boolean] = js.undefined
  //Force server to assign _id values instead of driver.
  var forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
}

