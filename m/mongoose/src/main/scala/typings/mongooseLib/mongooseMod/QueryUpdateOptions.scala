package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryUpdateOptions extends ModelUpdateOptions {
  /**
       * if set to 'query' and runValidators is on, this will refer to the query
       * in customvalidator functions that update validation runs. Does nothing
       * if runValidators is false.
       */
  var context: js.UndefOr[java.lang.String] = js.undefined
}

