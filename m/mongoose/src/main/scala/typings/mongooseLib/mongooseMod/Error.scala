package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section error.js
  * http://mongoosejs.com/docs/api.html#error-js
  */
@js.native
trait Error
  extends stdLib.ErrorConstructor {
  // "MongooseError" for instances of the current class,
  // an other string for instances of derived classes.
  var name: mongooseLib.mongooseLibStrings.MongooseError | java.lang.String = js.native
}

