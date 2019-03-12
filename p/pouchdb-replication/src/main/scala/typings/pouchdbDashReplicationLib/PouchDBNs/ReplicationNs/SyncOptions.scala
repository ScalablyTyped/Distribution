package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends ReplicateOptions {
  var pull: js.UndefOr[ReplicateOptions] = js.undefined
  var push: js.UndefOr[ReplicateOptions] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    back_off_function: /* delay */ scala.Double => scala.Double = null,
    batch_size: scala.Int | scala.Double = null,
    batches_limit: scala.Int | scala.Double = null,
    checkpoint: scala.Boolean | pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.target | pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.source = null,
    doc_ids: js.Array[java.lang.String] = null,
    filter: java.lang.String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _]) = null,
    heartbeat: js.Any = null,
    live: js.UndefOr[scala.Boolean] = js.undefined,
    pull: ReplicateOptions = null,
    push: ReplicateOptions = null,
    query_params: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    retry: js.UndefOr[scala.Boolean] = js.undefined,
    selector: pouchdbDashFindLib.PouchDBNs.FindNs.Selector = null,
    since: js.Any = null,
    timeout: scala.Double | pouchdbDashReplicationLib.pouchdbDashReplicationLibNumbers.`false` = null,
    view: java.lang.String = null
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (back_off_function != null) __obj.updateDynamic("back_off_function")(js.Any.fromFunction1(back_off_function))
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (batches_limit != null) __obj.updateDynamic("batches_limit")(batches_limit.asInstanceOf[js.Any])
    if (checkpoint != null) __obj.updateDynamic("checkpoint")(checkpoint.asInstanceOf[js.Any])
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat)
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live)
    if (pull != null) __obj.updateDynamic("pull")(pull)
    if (push != null) __obj.updateDynamic("push")(push)
    if (query_params != null) __obj.updateDynamic("query_params")(query_params)
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (since != null) __obj.updateDynamic("since")(since)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SyncOptions]
  }
}

