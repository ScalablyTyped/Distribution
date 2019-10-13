package typings.parse.reactDashNativeMod

import typings.parse.Parse.ScopeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Parse.Schema object is for handling schema data from Parse.
  * All the schemas methods require MasterKey.
  *
  * @param {String} className Parse Class string
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
@JSImport("parse/react-native", "Schema")
@js.native
class Schema protected ()
  extends typings.parse.nodeMod.Schema {
  def this(className: String) = this()
}

/* static members */
@JSImport("parse/react-native", "Schema")
@js.native
object Schema extends js.Object {
  /**
    * Static method to get all schemas
    * @param options Valid options are:
    * - useMasterKey: In Cloud Code and Node only, causes the Master Key to be used for this request.
    * - sessionToken: A valid session token, used for making a request on behalf of a specific user.
    */
  def all(): js.Promise[js.Array[typings.parse.Parse.Schema]] = js.native
  def all(options: ScopeOptions): js.Promise[js.Array[typings.parse.Parse.Schema]] = js.native
}

