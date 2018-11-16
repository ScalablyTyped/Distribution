package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultReducer extends js.Object {
  @JSName("fields")
  var fields_Original: Reducer[js.Object] = js.native
  @JSName("unset")
  var unset_Original: Reducer[js.Array[java.lang.String]] = js.native
  def fields(state: js.Object, action: Action): Reducer[_] = js.native
  def unset(state: js.Array[java.lang.String], action: Action): Reducer[_] = js.native
}

