package typings.nano.mod

import typings.request.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentScope[D] extends js.Object {
  var attachment: Attachment = js.native
  val config: ServerConfig = js.native
  var multipart: Multipart[D] = js.native
  var server: ServerScope = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def atomic[R](designname: String, updatename: String, docname: String): js.Promise[R] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def atomic[R](designname: String, updatename: String, docname: String, body: js.Any): js.Promise[R] = js.native
  def atomic[R](designname: String, updatename: String, docname: String, body: js.Any, callback: Callback[R]): js.Promise[R] = js.native
  def atomic[R](designname: String, updatename: String, docname: String, callback: Callback[R]): js.Promise[R] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: String, userpass: String): js.Promise[DatabaseAuthResponse] = js.native
  def auth(username: String, userpass: String, callback: Callback[DatabaseAuthResponse]): js.Promise[DatabaseAuthResponse] = js.native
  def baseView[V](designname: String, viewname: String, meta: js.Any): js.Promise[_] = js.native
  def baseView[V](designname: String, viewname: String, meta: js.Any, params: js.Any): js.Promise[_] = js.native
  def baseView[V](designname: String, viewname: String, meta: js.Any, params: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  def bulk(docs: BulkModifyDocsWrapper): js.Promise[js.Array[DocumentBulkResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, callback: Callback[js.Array[DocumentBulkResponse]]): js.Promise[js.Array[DocumentBulkResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, params: js.Any): js.Promise[js.Array[DocumentInsertResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, params: js.Any, callback: Callback[js.Array[DocumentInsertResponse]]): js.Promise[js.Array[DocumentInsertResponse]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(): js.Promise[DatabaseChangesResponse] = js.native
  def changes(callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(params: DatabaseChangesParams): js.Promise[DatabaseChangesResponse] = js.native
  def changes(params: DatabaseChangesParams, callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def compact(): js.Promise[OkResponse] = js.native
  def compact(callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
  def copy(src_document: String, dst_document: String): js.Promise[DocumentCopyResponse] = js.native
  def copy(src_document: String, dst_document: String, callback: Callback[DocumentCopyResponse]): js.Promise[DocumentCopyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
  def copy(src_document: String, dst_document: String, options: DocumentCopyOptions): js.Promise[DocumentCopyResponse] = js.native
  def copy(
    src_document: String,
    dst_document: String,
    options: DocumentCopyOptions,
    callback: Callback[DocumentCopyResponse]
  ): js.Promise[DocumentCopyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/find.html#db-index
  def createIndex(indexDef: CreateIndexRequest): js.Promise[CreateIndexResponse] = js.native
  def createIndex(indexDef: CreateIndexRequest, callback: Callback[CreateIndexResponse]): js.Promise[CreateIndexResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#delete--db-docid
  def destroy(docname: String, rev: String): js.Promise[DocumentDestroyResponse] = js.native
  def destroy(docname: String, rev: String, callback: Callback[DocumentDestroyResponse]): js.Promise[DocumentDestroyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetch(docnames: BulkFetchDocsWrapper): js.Promise[DocumentFetchResponse[D]] = js.native
  def fetch(docnames: BulkFetchDocsWrapper, callback: Callback[DocumentFetchResponse[D]]): js.Promise[DocumentFetchResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetch(docnames: BulkFetchDocsWrapper, params: DocumentFetchParams): js.Promise[DocumentFetchResponse[D]] = js.native
  def fetch(
    docnames: BulkFetchDocsWrapper,
    params: DocumentFetchParams,
    callback: Callback[DocumentFetchResponse[D]]
  ): js.Promise[DocumentFetchResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetchRevs(docnames: BulkFetchDocsWrapper): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  def fetchRevs(docnames: BulkFetchDocsWrapper, callback: Callback[DocumentFetchRevsResponse[D]]): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetchRevs(docnames: BulkFetchDocsWrapper, params: DocumentFetchParams): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  def fetchRevs(
    docnames: BulkFetchDocsWrapper,
    params: DocumentFetchParams,
    callback: Callback[DocumentFetchRevsResponse[D]]
  ): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/find.html#db-find
  def find(query: MangoQuery): js.Promise[MangoResponse[D]] = js.native
  def find(query: MangoQuery, callback: Callback[MangoResponse[D]]): js.Promise[MangoResponse[D]] = js.native
  def follow(): FollowEmitter = js.native
  def follow(callback: Callback[_]): Unit = js.native
  def follow(params: DocumentScopeFollowUpdatesParams): FollowEmitter = js.native
  def follow(params: DocumentScopeFollowUpdatesParams, callback: Callback[_]): Unit = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
  def get(docname: String): js.Promise[DocumentGetResponse with D] = js.native
  def get(docname: String, callback: Callback[DocumentGetResponse with D]): js.Promise[DocumentGetResponse with D] = js.native
  def get(docname: String, params: DocumentGetParams): js.Promise[DocumentGetResponse with D] = js.native
  def get(docname: String, params: DocumentGetParams, callback: Callback[DocumentGetResponse with D]): js.Promise[DocumentGetResponse with D] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#head--db-docid
  def head(docname: String): js.Promise[_] = js.native
  def head(docname: String, callback: Callback[_]): js.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#get--db
  def info(): js.Promise[DatabaseGetResponse] = js.native
  def info(callback: Callback[DatabaseGetResponse]): js.Promise[DatabaseGetResponse] = js.native
  def insert(document: D with MaybeDocument): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D with MaybeDocument, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D with MaybeDocument, params: String): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D with MaybeDocument, params: String, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D with MaybeDocument, params: Null, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D with MaybeDocument, params: DocumentInsertParams): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    document: D with MaybeDocument,
    params: DocumentInsertParams,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(document: ViewDocument[D]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], params: String): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], params: String, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], params: Null, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(document: ViewDocument[D], params: DocumentInsertParams): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    document: ViewDocument[D],
    params: DocumentInsertParams,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def list(): js.Promise[DocumentListResponse[D]] = js.native
  def list(callback: Callback[DocumentListResponse[D]]): js.Promise[DocumentListResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def list(params: DocumentListParams): js.Promise[DocumentListResponse[D]] = js.native
  def list(params: DocumentListParams, callback: Callback[DocumentListResponse[D]]): js.Promise[DocumentListResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def listAsStream(): Request = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def listAsStream(params: DocumentListParams): Request = js.native
  //https://docs.couchdb.org/en/latest/partitioned-dbs/index.html
  def partitionInfo(partitionKey: String): js.Promise[PartitionInfoResponse] = js.native
  def partitionInfo(partitionKey: String, callback: Callback[PartitionInfoResponse]): js.Promise[PartitionInfoResponse] = js.native
  def partitionedFind(partitionKey: String, query: MangoQuery): js.Promise[MangoResponse[D]] = js.native
  def partitionedFind(partitionKey: String, query: MangoQuery, callback: Callback[MangoResponse[D]]): js.Promise[MangoResponse[D]] = js.native
  def partitionedFindAsStream(partitionKey: String, query: MangoQuery): Request = js.native
  def partitionedList(partitionKey: String): js.Promise[DocumentListResponse[D]] = js.native
  def partitionedList(partitionKey: String, params: DocumentFetchParams): js.Promise[DocumentListResponse[D]] = js.native
  def partitionedList(partitionKey: String, params: DocumentFetchParams, callback: Callback[DocumentListResponse[D]]): js.Promise[DocumentListResponse[D]] = js.native
  def partitionedListAsStream(partitionKey: String): Request = js.native
  def partitionedListAsStream(partitionKey: String, params: DocumentFetchParams): Request = js.native
  def partitionedSearchAsStream(partitionKey: String, designname: String, searchname: String, params: DocumentSearchParams): Request = js.native
  def partitionedView[V](partitionKey: String, designname: String, viewname: String, params: DocumentViewParams): js.Promise[DocumentViewResponse[V, D]] = js.native
  def partitionedView[V](
    partitionKey: String,
    designname: String,
    viewname: String,
    params: DocumentViewParams,
    callback: Callback[DocumentViewResponse[V, D]]
  ): js.Promise[DocumentViewResponse[V, D]] = js.native
  def partitionedViewAsStream[V](partitionKey: String, designname: String, viewname: String, params: DocumentViewParams): Request = js.native
  def partitionedViewpartitionedSearch[V](partitionKey: String, designname: String, searchname: String, params: DocumentSearchParams): js.Promise[DocumentSearchResponse[V]] = js.native
  def partitionedViewpartitionedSearch[V](
    partitionKey: String,
    designname: String,
    searchname: String,
    params: DocumentSearchParams,
    callback: Callback[DocumentSearchResponse[V]]
  ): js.Promise[DocumentSearchResponse[V]] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate(target: String, options: js.Any): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate(target: String, options: js.Any, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate(target: DocumentScope[D], options: js.Any): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate(target: DocumentScope[D], options: js.Any, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](target: String): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](target: String, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](target: DocumentScope[D]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](target: DocumentScope[D], callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def search[V](designname: String, searchname: String, params: DocumentSearchParams): js.Promise[DocumentSearchResponse[V]] = js.native
  def search[V](
    designname: String,
    searchname: String,
    params: DocumentSearchParams,
    callback: Callback[DocumentSearchResponse[V]]
  ): js.Promise[DocumentSearchResponse[V]] = js.native
  def searchAsStream[V](designname: String, searchname: String, params: DocumentSearchParams): Request = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(): js.Promise[DatabaseSessionResponse] = js.native
  def session(callback: Callback[DatabaseSessionResponse]): js.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func
  def show(designname: String, showname: String, doc_id: String): js.Promise[_] = js.native
  def show(designname: String, showname: String, doc_id: String, callback: Callback[_]): js.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func
  def show(designname: String, showname: String, doc_id: String, params: js.Any): js.Promise[_] = js.native
  def show(designname: String, showname: String, doc_id: String, params: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def updateWithHandler(designname: String, updatename: String, docname: String): js.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def updateWithHandler(designname: String, updatename: String, docname: String, body: js.Any): js.Promise[OkResponse] = js.native
  def updateWithHandler(
    designname: String,
    updatename: String,
    docname: String,
    body: js.Any,
    callback: Callback[OkResponse]
  ): js.Promise[OkResponse] = js.native
  def updateWithHandler(designname: String, updatename: String, docname: String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def view[V](designname: String, viewname: String): js.Promise[DocumentViewResponse[V, D]] = js.native
  def view[V](designname: String, viewname: String, callback: Callback[DocumentViewResponse[V, D]]): js.Promise[DocumentViewResponse[V, D]] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def view[V](designname: String, viewname: String, params: DocumentViewParams): js.Promise[DocumentViewResponse[V, D]] = js.native
  def view[V](
    designname: String,
    viewname: String,
    params: DocumentViewParams,
    callback: Callback[DocumentViewResponse[V, D]]
  ): js.Promise[DocumentViewResponse[V, D]] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def viewAsStream[V](designname: String, viewname: String): Request = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def viewAsStream[V](designname: String, viewname: String, params: DocumentViewParams): Request = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name
  def viewWithList(designname: String, viewname: String, listname: String): js.Promise[_] = js.native
  def viewWithList(designname: String, viewname: String, listname: String, callback: Callback[_]): js.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name
  def viewWithList(designname: String, viewname: String, listname: String, params: DocumentViewParams): js.Promise[_] = js.native
  def viewWithList(
    designname: String,
    viewname: String,
    listname: String,
    params: DocumentViewParams,
    callback: Callback[_]
  ): js.Promise[_] = js.native
}

