package typings
package pouchdbDashLiveDashFindLib.PouchDBNs.LiveFindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveFeed[Content /* <: js.Object */]
  extends pouchdbDashCoreLib.EventEmitter {
  // stops the query and removes all listeners
  def cancel(): scala.Unit = js.native
  def `catch`(callbackFailure: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_cancelled(
    event: pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.cancelled,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.error,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ready(
    event: pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.ready,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_update(
    event: pouchdbDashLiveDashFindLib.pouchdbDashLiveDashFindLibStrings.update,
    listener: js.Function2[/* event */ UpdateEvent, /* list */ js.Any, scala.Unit]
  ): this.type = js.native
  // updates the pagination and sorting of the aggregate list and immediately returns the updated list. Available options are sort, skip, and limit.
  def paginate(options: PaginateOptions[Content]): js.Array[js.Any] = js.native
  // a convenience function to sort any list in place by the sort order you provided. (This will mutate the Array.)
  def sort(list: js.Array[js.Any]): js.Array[js.Any] = js.native
  def `then`(callbackSuccess: js.Function0[_]): scala.Unit = js.native
}

