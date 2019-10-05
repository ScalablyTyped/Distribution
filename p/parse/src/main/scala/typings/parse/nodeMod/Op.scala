package typings.parse.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * A Parse.Op is an atomic operation that can be applied to a field in a
  * Parse.Object. For example, calling <code>object.set("foo", "bar")</code>
  * is an example of a Parse.Op.Set. Calling <code>object.unset("foo")</code>
  * is a Parse.Op.Unset. These operations are stored in a Parse.Object and
  * sent to the server as part of <code>object.save()</code> operations.
  * Instances of Parse.Op should be immutable.
  *
  * You should not create subclasses of Parse.Op or instantiate Parse.Op
  * directly.
  */
@JSImport("parse/node", "Op")
@js.native
object Op extends js.Object

