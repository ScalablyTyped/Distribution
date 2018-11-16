package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WriteError extends js.Object {
  //Write concern error code.
  var code: scala.Double
  //Write concern error message.
  var errmsg: java.lang.String
  //Write concern error original bulk operation index.
  var index: scala.Double
}

