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
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @js.native
trait Error_ extends js.Object {
  // "MongooseError" for instances of the current class,
  // an other string for instances of derived classes.
  var name: MongooseError | String = js.native
}

object Error_ {
  @scala.inline
  def apply(name: MongooseError | String): Error_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error_]
  }
  @scala.inline
  implicit class Error_Ops[Self <: Error_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: MongooseError | String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

