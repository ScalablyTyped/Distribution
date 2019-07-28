package typings.mongoose.mongooseMod

import typings.mongoose.mongooseStrings.MongooseError
import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section error.js
  * http://mongoosejs.com/docs/api.html#error-js
  */
@js.native
trait Error extends ErrorConstructor {
  // "MongooseError" for instances of the current class,
  // an other string for instances of derived classes.
  var name: MongooseError | String = js.native
}

