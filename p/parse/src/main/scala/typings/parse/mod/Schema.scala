package typings.parse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Parse.Schema object is for handling schema data from Parse.
  * All the schemas methods require MasterKey.
  *
  * @param className Parse Class string
  *
  * https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Schema.html
  *
  * ```
  * const schema = new Parse.Schema('MyClass');
  * schema.addString('field');
  * schema.addIndex('index_name', { field: 1 });
  * schema.save();
  * ```
  */
@JSImport("parse", "Schema")
@js.native
class Schema protected ()
  extends typings.parse.mod.global.Parse.Schema {
  def this(className: String) = this()
}

/* static members */
@JSImport("parse", "Schema")
@js.native
object Schema extends js.Object {
  /**
    * Static method to get all schemas
    *
    * @return A promise that is resolved with the result when
    * the query completes.
    */
  def all(): js.Promise[js.Array[typings.parse.mod.global.Parse.Schema]] = js.native
}

