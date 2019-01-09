package typings
package pouchdbDashFindLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  def createIndex(): js.Promise[pouchdbDashFindLib.PouchDBNs.FindNs.CreateIndexResponse[Content]] = js.native
  def createIndex(index: pouchdbDashFindLib.PouchDBNs.FindNs.CreateIndexOptions): js.Promise[pouchdbDashFindLib.PouchDBNs.FindNs.CreateIndexResponse[Content]] = js.native
  /** Create an index if it doesn't exist, or do nothing if it already exists. */
  def createIndex(
    index: pouchdbDashFindLib.PouchDBNs.FindNs.CreateIndexOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Core.Callback<Find.CreateIndexResponse<Content>> */ js.Any
  ): scala.Unit = js.native
  def deleteIndex(): js.Promise[pouchdbDashFindLib.PouchDBNs.FindNs.DeleteIndexResponse[Content]] = js.native
  def deleteIndex(index: pouchdbDashFindLib.PouchDBNs.FindNs.DeleteIndexOptions): js.Promise[pouchdbDashFindLib.PouchDBNs.FindNs.DeleteIndexResponse[Content]] = js.native
  /** Delete an index and clean up any leftover data on the disk. */
  def deleteIndex(
    index: pouchdbDashFindLib.PouchDBNs.FindNs.DeleteIndexOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Core.Callback<Find.DeleteIndexResponse<Content>> */ js.Any
  ): scala.Unit = js.native
  def find(): js.Promise[pouchdbDashFindLib.PouchDBNs.FindNs.FindResponse[Content]] = js.native
  def find(request: pouchdbDashFindLib.PouchDBNs.FindNs.FindRequest[Content]): js.Promise[pouchdbDashFindLib.PouchDBNs.FindNs.FindResponse[Content]] = js.native
  /** Query the API to find some documents. */
  def find(
    request: pouchdbDashFindLib.PouchDBNs.FindNs.FindRequest[Content],
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Core.Callback<Find.FindResponse<Content>> */ js.Any
  ): scala.Unit = js.native
  def getIndexes(): js.Promise[pouchdbDashFindLib.PouchDBNs.FindNs.GetIndexesResponse[Content]] = js.native
  /** Get a list of all the indexes you've created. Also tells you about the special _all_docs index, i.e. the default index on the _id field. */
  def getIndexes(
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Core.Callback<Find.GetIndexesResponse<Content>> */ js.Any
  ): scala.Unit = js.native
}

