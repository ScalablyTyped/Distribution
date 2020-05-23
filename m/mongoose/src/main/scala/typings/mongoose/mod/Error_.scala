package typings.mongoose.mod

import typings.mongoose.mongooseStrings.MongooseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section error.js
  * http://mongoosejs.com/docs/api.html#error-js
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ trait Error_ extends js.Object {
  // "MongooseError" for instances of the current class,
  // an other string for instances of derived classes.
  var name: MongooseError | String
}

object Error_ {
  @scala.inline
  def apply(name: MongooseError | String): Error_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error_]
  }
}

