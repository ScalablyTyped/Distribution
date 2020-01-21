package typings.pouchdbReplication.PouchDB.Replication

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.PouchDB.Find.Selector
import typings.pouchdbReplication.pouchdbReplicationBooleans.`false`
import typings.pouchdbReplication.pouchdbReplicationStrings.source
import typings.pouchdbReplication.pouchdbReplicationStrings.target
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
    back_off_function: /* delay */ Double => Double = null,
    batch_size: Int | Double = null,
    batches_limit: Int | Double = null,
    checkpoint: Boolean | target | source = null,
    doc_ids: js.Array[String] = null,
    filter: String | (js.Function2[/* doc */ js.Any, /* params */ js.Any, _]) = null,
    heartbeat: js.Any = null,
    live: js.UndefOr[Boolean] = js.undefined,
    pull: ReplicateOptions = null,
    push: ReplicateOptions = null,
    query_params: StringDictionary[js.Any] = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    selector: Selector = null,
    since: js.Any = null,
    timeout: Double | `false` = null,
    view: String = null
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (back_off_function != null) __obj.updateDynamic("back_off_function")(js.Any.fromFunction1(back_off_function))
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (batches_limit != null) __obj.updateDynamic("batches_limit")(batches_limit.asInstanceOf[js.Any])
    if (checkpoint != null) __obj.updateDynamic("checkpoint")(checkpoint.asInstanceOf[js.Any])
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (query_params != null) __obj.updateDynamic("query_params")(query_params.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncOptions]
  }
}

