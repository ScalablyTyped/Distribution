package typings.nano.mod

import typings.node.processMod.global.NodeJS.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Documents scope */
@js.native
trait DocumentScope[D] extends StObject {
  
  /** Executes an update function on the server side for the supplied document id.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid} */
  def atomic[R](designname: String, updatename: String, docname: String): js.Promise[R] = js.native
  /** Executes an update function on the server side for the supplied document id with body.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid} */
  def atomic[R](designname: String, updatename: String, docname: String, body: Any): js.Promise[R] = js.native
  def atomic[R](designname: String, updatename: String, docname: String, body: Any, callback: Callback[R]): js.Promise[R] = js.native
  def atomic[R](designname: String, updatename: String, docname: String, callback: Callback[R]): js.Promise[R] = js.native
  
  /** Attachment functions */
  var attachment: Attachment = js.native
  
  /** Initiates new session for specified user credentials by providing Cookie value.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication} */
  def auth(username: String, userpass: String): js.Promise[DatabaseAuthResponse] = js.native
  def auth(username: String, userpass: String, callback: Callback[DatabaseAuthResponse]): js.Promise[DatabaseAuthResponse] = js.native
  
  /** Low-level wrapper that executes a view from a Design Document.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view} */
  def baseView[V](designname: String, viewname: String, meta: Any): js.Promise[Any] = js.native
  def baseView[V](designname: String, viewname: String, meta: Any, params: Any): js.Promise[Any] = js.native
  def baseView[V](designname: String, viewname: String, meta: Any, params: Any, callback: Callback[Any]): js.Promise[Any] = js.native
  def baseView[V](designname: String, viewname: String, meta: Any, params: Unit, callback: Callback[Any]): js.Promise[Any] = js.native
  
  /** Bulk insert/update/delete multiple documents in this database.
    * @see Docs: {@link https://docs.couchdb.org/en/stable/api/database/bulk-api.html#db-bulk-docs} */
  def bulk(docs: BulkModifyDocsWrapper): js.Promise[js.Array[DocumentBulkResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, callback: Callback[js.Array[DocumentBulkResponse]]): js.Promise[js.Array[DocumentBulkResponse]] = js.native
  /** Bulk insert/update/delete multiple documents in this database, with options.
    * @see Docs: {@link https://docs.couchdb.org/en/stable/api/database/bulk-api.html#db-bulk-docs} */
  def bulk(docs: BulkModifyDocsWrapper, params: Any): js.Promise[js.Array[DocumentInsertResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, params: Any, callback: Callback[js.Array[DocumentInsertResponse]]): js.Promise[js.Array[DocumentInsertResponse]] = js.native
  
  /** Return sorted list of changes to this database.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes} */
  def changes(): js.Promise[DatabaseChangesResponse] = js.native
  def changes(callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  /** Return sorted list of changes to this database with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes} */
  def changes(params: DatabaseChangesParams): js.Promise[DatabaseChangesResponse] = js.native
  def changes(params: DatabaseChangesParams, callback: Callback[DatabaseChangesResponse]): js.Promise[DatabaseChangesResponse] = js.native
  
  /**  Changes feed follower. 
    * @see README: {@link https://www.npmjs.com/package/nano#reading-changes-feed} */
  var changesReader: ChangesReaderScope = js.native
  
  /** Request compaction on this database.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact} */
  def compact(): js.Promise[OkResponse] = js.native
  def compact(callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  
  /**
    * An object containing the nano configurations.
    * @see README: {@link https://www.npmjs.com/package/nano#nanoconfig} */
  val config: ServerConfig = js.native
  
  /** Create a Mango index.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/find.html#db-index} */
  def createIndex(indexDef: CreateIndexRequest): js.Promise[CreateIndexResponse] = js.native
  def createIndex(indexDef: CreateIndexRequest, callback: Callback[CreateIndexResponse]): js.Promise[CreateIndexResponse] = js.native
  
  /** Delete a document from this database.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#delete--db-docid} */
  def destroy(docname: String, rev: String): js.Promise[DocumentDestroyResponse] = js.native
  def destroy(docname: String, rev: String, callback: Callback[DocumentDestroyResponse]): js.Promise[DocumentDestroyResponse] = js.native
  
  /** Fetch a list of documents by _id.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs} */
  def fetch(docnames: BulkFetchDocsWrapper): js.Promise[DocumentFetchResponse[D]] = js.native
  def fetch(docnames: BulkFetchDocsWrapper, callback: Callback[DocumentFetchResponse[D]]): js.Promise[DocumentFetchResponse[D]] = js.native
  /** Fetch a list of documents by _id with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs} */
  def fetch(docnames: BulkFetchDocsWrapper, params: DocumentFetchParams): js.Promise[DocumentFetchResponse[D]] = js.native
  def fetch(
    docnames: BulkFetchDocsWrapper,
    params: DocumentFetchParams,
    callback: Callback[DocumentFetchResponse[D]]
  ): js.Promise[DocumentFetchResponse[D]] = js.native
  
  /** Fetch revisions of a list of document _ids.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs} */
  def fetchRevs(docnames: BulkFetchDocsWrapper): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  def fetchRevs(docnames: BulkFetchDocsWrapper, callback: Callback[DocumentFetchRevsResponse[D]]): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  /** Fetch revisions of a list of document _ids with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs} */
  def fetchRevs(docnames: BulkFetchDocsWrapper, params: DocumentFetchParams): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  def fetchRevs(
    docnames: BulkFetchDocsWrapper,
    params: DocumentFetchParams,
    callback: Callback[DocumentFetchRevsResponse[D]]
  ): js.Promise[DocumentFetchRevsResponse[D]] = js.native
  
  /** Run Mango query.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/find.html#db-find} */
  def find(query: MangoQuery): js.Promise[MangoResponse[D]] = js.native
  def find(query: MangoQuery, callback: Callback[MangoResponse[D]]): js.Promise[MangoResponse[D]] = js.native
  
  /** Fetch a document from this database.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid} */
  def get(docname: String): js.Promise[DocumentGetResponse & D] = js.native
  def get(docname: String, callback: Callback[DocumentGetResponse & D]): js.Promise[DocumentGetResponse & D] = js.native
  def get(docname: String, params: Unit, callback: Callback[DocumentGetResponse & D]): js.Promise[DocumentGetResponse & D] = js.native
  def get(docname: String, params: DocumentGetParams): js.Promise[DocumentGetResponse & D] = js.native
  def get(docname: String, params: DocumentGetParams, callback: Callback[DocumentGetResponse & D]): js.Promise[DocumentGetResponse & D] = js.native
  
  /** Fetch document meta data, useful for fetching a document's current revision.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#head--db-docid} */
  def head(docname: String): js.Promise[DocumentHeadResponseHeaders] = js.native
  def head(docname: String, callback: Callback[DocumentHeadResponseHeaders]): js.Promise[DocumentHeadResponseHeaders] = js.native
  
  /** Get database info
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/common.html#get--db} */
  def info(): js.Promise[DatabaseGetResponse] = js.native
  def info(callback: Callback[DatabaseGetResponse]): js.Promise[DatabaseGetResponse] = js.native
  
  def insert(document: D & MaybeDocument): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D & MaybeDocument, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D & MaybeDocument, params: String): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D & MaybeDocument, params: String, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D & MaybeDocument, params: Null, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: D & MaybeDocument, params: DocumentInsertParams): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    document: D & MaybeDocument,
    params: DocumentInsertParams,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  /** Insert a document into this database.
    * @see POST Docs: {@link http://docs.couchdb.org/en/latest/api/database/common.html#post--db}
    * @see PUT Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid} */
  def insert(document: ViewDocument[D]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], params: String): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], params: String, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], params: Null, callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  def insert(document: ViewDocument[D], params: DocumentInsertParams): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    document: ViewDocument[D],
    params: DocumentInsertParams,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  
  /** List documents from this database.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs} */
  def list(): js.Promise[DocumentListResponse[D]] = js.native
  def list(callback: Callback[DocumentListResponse[D]]): js.Promise[DocumentListResponse[D]] = js.native
  /** List documents from this database with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs} */
  def list(params: DocumentListParams): js.Promise[DocumentListResponse[D]] = js.native
  def list(params: DocumentListParams, callback: Callback[DocumentListResponse[D]]): js.Promise[DocumentListResponse[D]] = js.native
  
  /** List document from this database as a stream.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs} */
  def listAsStream(): ReadStream = js.native
  /** List document from this database as a stream with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs} */
  def listAsStream(params: DocumentListParams): ReadStream = js.native
  
  /** Multipart HTTP functions */
  var multipart: Multipart[D] = js.native
  
  /** Fetch information about a single partition in this database.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/partitioned-dbs.html#db-partition-partition} */
  def partitionInfo(partitionKey: String): js.Promise[PartitionInfoResponse] = js.native
  def partitionInfo(partitionKey: String, callback: Callback[PartitionInfoResponse]): js.Promise[PartitionInfoResponse] = js.native
  
  /** Run Mango query a single partition in this database.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/partitioned-dbs.html#db-partition-partition-id-find} */
  def partitionedFind(partitionKey: String, query: MangoQuery): js.Promise[MangoResponse[D]] = js.native
  def partitionedFind(partitionKey: String, query: MangoQuery, callback: Callback[MangoResponse[D]]): js.Promise[MangoResponse[D]] = js.native
  
  /** Run Mango query a single partition in this database, as a stream.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/partitioned-dbs.html#db-partition-partition-id-find} */
  def partitionedFindAsStream(partitionKey: String, query: MangoQuery): ReadStream = js.native
  
  /** List documents in a single partition in this database.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/partitioned-dbs.html#db-partition-partition-all-docs} */
  def partitionedList(partitionKey: String): js.Promise[DocumentListResponse[D]] = js.native
  def partitionedList(partitionKey: String, params: Unit, callback: Callback[DocumentListResponse[D]]): js.Promise[DocumentListResponse[D]] = js.native
  def partitionedList(partitionKey: String, params: DocumentFetchParams): js.Promise[DocumentListResponse[D]] = js.native
  def partitionedList(partitionKey: String, params: DocumentFetchParams, callback: Callback[DocumentListResponse[D]]): js.Promise[DocumentListResponse[D]] = js.native
  
  /** List documents in a single partition in this database as a stream.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/partitioned-dbs.html#db-partition-partition-all-docs} */
  def partitionedListAsStream(partitionKey: String): ReadStream = js.native
  def partitionedListAsStream(partitionKey: String, params: DocumentFetchParams): ReadStream = js.native
  
  /** Run a full-text search in a single partition in this database. */
  def partitionedSearch[V](partitionKey: String, designname: String, searchname: String, params: DocumentSearchParams): js.Promise[DocumentSearchResponse[V]] = js.native
  def partitionedSearch[V](
    partitionKey: String,
    designname: String,
    searchname: String,
    params: DocumentSearchParams,
    callback: Callback[DocumentSearchResponse[V]]
  ): js.Promise[DocumentSearchResponse[V]] = js.native
  
  /** Run a full-text search in a single partition in this database, as a stream. */
  def partitionedSearchAsStream(partitionKey: String, designname: String, searchname: String, params: DocumentSearchParams): ReadStream = js.native
  
  /** Executes the specified view function in a single partition from the specified design document.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/partitioned-dbs.html#db-partition-partition-design-design-doc-view-view-name} */
  def partitionedView[V](partitionKey: String, designname: String, viewname: String, params: DocumentViewParams): js.Promise[DocumentViewResponse[V, D]] = js.native
  def partitionedView[V](
    partitionKey: String,
    designname: String,
    viewname: String,
    params: DocumentViewParams,
    callback: Callback[DocumentViewResponse[V, D]]
  ): js.Promise[DocumentViewResponse[V, D]] = js.native
  
  /** Executes the specified view function in a single partition from the specified design document, as a stream
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/partitioned-dbs.html#db-partition-partition-design-design-doc-view-view-name} */
  def partitionedViewAsStream[V](partitionKey: String, designname: String, viewname: String, params: DocumentViewParams): ReadStream = js.native
  
  /** Request a replication opertation with this datbase as the target with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate} */
  def replicate(target: String, options: Any): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate(target: String, options: Any, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate(target: DocumentScope[D], options: Any): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate(target: DocumentScope[D], options: Any, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  /** Request a replication opertation with this datbase as the target.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate} */
  def replicate[D](target: String): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](target: String, callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](target: DocumentScope[D]): js.Promise[DatabaseReplicateResponse] = js.native
  def replicate[D](target: DocumentScope[D], callback: Callback[DatabaseReplicateResponse]): js.Promise[DatabaseReplicateResponse] = js.native
  
  /** Executes a search request against the named index.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/ddoc/search.html#db-design-design-doc-search-index-name} */
  def search[V](designname: String, searchname: String, params: DocumentSearchParams): js.Promise[DocumentSearchResponse[V]] = js.native
  def search[V](
    designname: String,
    searchname: String,
    params: DocumentSearchParams,
    callback: Callback[DocumentSearchResponse[V]]
  ): js.Promise[DocumentSearchResponse[V]] = js.native
  
  /** Executes a search request against the named index as a stream.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/ddoc/search.html#db-design-design-doc-search-index-name} */
  def searchAsStream[V](designname: String, searchname: String, params: DocumentSearchParams): ReadStream = js.native
  
  /** Server scope */
  var server: ServerScope = js.native
  
  /** Returns information about the authenticated user, including a User Context Object, the authentication method and database that were used, and a list of configured authentication handlers on the server.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session} */
  def session(): js.Promise[DatabaseSessionResponse] = js.native
  def session(callback: Callback[DatabaseSessionResponse]): js.Promise[DatabaseSessionResponse] = js.native
  
  /** Apply a show function to a document.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func} */
  def show(designname: String, showname: String, doc_id: String): js.Promise[Any] = js.native
  def show(designname: String, showname: String, doc_id: String, callback: Callback[Any]): js.Promise[Any] = js.native
  /** Apply a show function to a document.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func} */
  def show(designname: String, showname: String, doc_id: String, params: Any): js.Promise[Any] = js.native
  def show(designname: String, showname: String, doc_id: String, params: Any, callback: Callback[Any]): js.Promise[Any] = js.native
  
  /** Executes an update function on the server side for the supplied document id.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid} */
  def updateWithHandler(designname: String, updatename: String, docname: String): js.Promise[OkResponse] = js.native
  /** Executes an update function on the server side for the supplied document id with body.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid} */
  def updateWithHandler(designname: String, updatename: String, docname: String, body: Any): js.Promise[OkResponse] = js.native
  def updateWithHandler(designname: String, updatename: String, docname: String, body: Any, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  def updateWithHandler(designname: String, updatename: String, docname: String, callback: Callback[OkResponse]): js.Promise[OkResponse] = js.native
  
  /** Executes a view from a Design Document.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view} */
  def view[V](designname: String, viewname: String): js.Promise[DocumentViewResponse[V, D]] = js.native
  def view[V](designname: String, viewname: String, callback: Callback[DocumentViewResponse[V, D]]): js.Promise[DocumentViewResponse[V, D]] = js.native
  /**  Executes a view from a Design Document, with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view} */
  def view[V](designname: String, viewname: String, params: DocumentViewParams): js.Promise[DocumentViewResponse[V, D]] = js.native
  def view[V](
    designname: String,
    viewname: String,
    params: DocumentViewParams,
    callback: Callback[DocumentViewResponse[V, D]]
  ): js.Promise[DocumentViewResponse[V, D]] = js.native
  
  /** Executes a view from a Design Document as a stream
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view} */
  def viewAsStream[V](designname: String, viewname: String): ReadStream = js.native
  /** Executes a view from a Design Document, with options as a stream
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view} */
  def viewAsStream[V](designname: String, viewname: String, params: DocumentViewParams): ReadStream = js.native
  
  /** Applies a list function to a view.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name} */
  def viewWithList(designname: String, viewname: String, listname: String): js.Promise[Any] = js.native
  def viewWithList(designname: String, viewname: String, listname: String, callback: Callback[Any]): js.Promise[Any] = js.native
  /** Applies a list function to a view with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name} */
  def viewWithList(designname: String, viewname: String, listname: String, params: DocumentViewParams): js.Promise[Any] = js.native
  def viewWithList(
    designname: String,
    viewname: String,
    listname: String,
    params: DocumentViewParams,
    callback: Callback[Any]
  ): js.Promise[Any] = js.native
  
  /** Applies a list function to a view as a stream.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name} */
  def viewWithListAsStream(designname: String, viewname: String, listname: String): ReadStream = js.native
  def viewWithListAsStream(designname: String, viewname: String, listname: String, callback: Callback[Any]): ReadStream = js.native
  /** Applies a list function to a view with options as a stream.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name} */
  def viewWithListAsStream(designname: String, viewname: String, listname: String, params: DocumentViewParams): ReadStream = js.native
  def viewWithListAsStream(
    designname: String,
    viewname: String,
    listname: String,
    params: DocumentViewParams,
    callback: Callback[Any]
  ): ReadStream = js.native
}
