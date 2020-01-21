package typings.pouchdbFind.PouchDB

import typings.pouchdbFind.PouchDB.Find.CreateIndexOptions
import typings.pouchdbFind.PouchDB.Find.CreateIndexResponse
import typings.pouchdbFind.PouchDB.Find.DeleteIndexOptions
import typings.pouchdbFind.PouchDB.Find.DeleteIndexResponse
import typings.pouchdbFind.PouchDB.Find.FindRequest
import typings.pouchdbFind.PouchDB.Find.FindResponse
import typings.pouchdbFind.PouchDB.Find.GetIndexesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  def createIndex(): js.Promise[CreateIndexResponse[Content]] = js.native
  def createIndex(index: CreateIndexOptions): js.Promise[CreateIndexResponse[Content]] = js.native
  /** Create an index if it doesn't exist, or do nothing if it already exists. */
  def createIndex(
    index: CreateIndexOptions,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.CreateIndexResponse<Content>> */ js.Any
  ): Unit = js.native
  def deleteIndex(): js.Promise[DeleteIndexResponse[Content]] = js.native
  def deleteIndex(index: DeleteIndexOptions): js.Promise[DeleteIndexResponse[Content]] = js.native
  /** Delete an index and clean up any leftover data on the disk. */
  def deleteIndex(
    index: DeleteIndexOptions,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.DeleteIndexResponse<Content>> */ js.Any
  ): Unit = js.native
  def find(): js.Promise[FindResponse[Content]] = js.native
  def find(request: FindRequest[Content]): js.Promise[FindResponse[Content]] = js.native
  /** Query the API to find some documents. */
  def find(
    request: FindRequest[Content],
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.FindResponse<Content>> */ js.Any
  ): Unit = js.native
  def getIndexes(): js.Promise[GetIndexesResponse[Content]] = js.native
  /** Get a list of all the indexes you've created. Also tells you about the special _all_docs index, i.e. the default index on the _id field. */
  def getIndexes(
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.GetIndexesResponse<Content>> */ js.Any
  ): Unit = js.native
}

