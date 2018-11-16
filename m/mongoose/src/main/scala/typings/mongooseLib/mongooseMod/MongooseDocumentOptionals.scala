package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MongooseDocumentOptionals extends js.Object {
  /**
       * Virtual getter that by default returns the document's _id field cast to a string,
       * or in the case of ObjectIds, its hexString. This id getter may be disabled by
       * passing the option { id: false } at schema construction time. If disabled, id
       * behaves like any other field on a document and can be assigned any value.
       */
  var id: js.UndefOr[js.Any] = js.undefined
}

