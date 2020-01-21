package typings.objtools.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncObjectOptions extends js.Object {
  /**
    * Optional function to be called when a value changes.
    */
  @JSName("onChange")
  var onChange_Original: OnFieldHook = js.native
  /**
    * An optional callback to call whenever a field is traversed during this
    * function.  If it returns a boolean `false`, any modification is prevented
    * and further subfields will not be traversed.
    */
  @JSName("onField")
  var onField_Original: OnFieldHook = js.native
  /**
    * Optional function to be called when a value changes.
    */
  def onChange(field: String, toVal: js.Any, fromVal: js.Any, parentObj: Record[String, _]): js.Any = js.native
  /**
    * An optional callback to call whenever a field is traversed during this
    * function.  If it returns a boolean `false`, any modification is prevented
    * and further subfields will not be traversed.
    */
  def onField(field: String, toVal: js.Any, fromVal: js.Any, parentObj: Record[String, _]): js.Any = js.native
}

