package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.pouchdbCoreStrings.all
import typings.std.Request
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenRevisions extends Options {
  /**
    * Fetch all leaf revisions if open_revs="all" or fetch all leaf
    * revisions specified in open_revs array. Leaves will be returned
    * in the same order as specified in input array.
    */
  var open_revs: all | js.Array[RevisionId]
  /** Include revision history of the document. */
  var revs: js.UndefOr[Boolean] = js.undefined
}

object GetOpenRevisions {
  @scala.inline
  def apply(
    open_revs: all | js.Array[RevisionId],
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[typings.std.Response] = null,
    revs: js.UndefOr[Boolean] = js.undefined
  ): GetOpenRevisions = {
    val __obj = js.Dynamic.literal(open_revs = open_revs.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenRevisions]
  }
}

