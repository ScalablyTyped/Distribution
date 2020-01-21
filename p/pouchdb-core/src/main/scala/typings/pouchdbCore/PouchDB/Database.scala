package typings.pouchdbCore.PouchDB

import typings.pouchdbCore.AnonRevRevisionId
import typings.pouchdbCore.Blob
import typings.pouchdbCore.Buffer
import typings.pouchdbCore.EventEmitter
import typings.pouchdbCore.PouchDB.Core.AllDocsOptions
import typings.pouchdbCore.PouchDB.Core.AllDocsResponse
import typings.pouchdbCore.PouchDB.Core.AllDocsWithKeyOptions
import typings.pouchdbCore.PouchDB.Core.AllDocsWithKeysOptions
import typings.pouchdbCore.PouchDB.Core.AllDocsWithinRangeOptions
import typings.pouchdbCore.PouchDB.Core.AttachmentData
import typings.pouchdbCore.PouchDB.Core.AttachmentId
import typings.pouchdbCore.PouchDB.Core.BulkDocsOptions
import typings.pouchdbCore.PouchDB.Core.BulkGetOptions
import typings.pouchdbCore.PouchDB.Core.BulkGetResponse
import typings.pouchdbCore.PouchDB.Core.Callback
import typings.pouchdbCore.PouchDB.Core.Changes
import typings.pouchdbCore.PouchDB.Core.ChangesOptions
import typings.pouchdbCore.PouchDB.Core.CompactOptions
import typings.pouchdbCore.PouchDB.Core.DatabaseInfo
import typings.pouchdbCore.PouchDB.Core.Document
import typings.pouchdbCore.PouchDB.Core.DocumentId
import typings.pouchdbCore.PouchDB.Core.Error
import typings.pouchdbCore.PouchDB.Core.GetMeta
import typings.pouchdbCore.PouchDB.Core.GetOpenRevisions
import typings.pouchdbCore.PouchDB.Core.GetOptions
import typings.pouchdbCore.PouchDB.Core.Options
import typings.pouchdbCore.PouchDB.Core.PostDocument
import typings.pouchdbCore.PouchDB.Core.PutDocument
import typings.pouchdbCore.PouchDB.Core.PutOptions
import typings.pouchdbCore.PouchDB.Core.RemoveAttachmentResponse
import typings.pouchdbCore.PouchDB.Core.RemoveDocument
import typings.pouchdbCore.PouchDB.Core.Response
import typings.pouchdbCore.PouchDB.Core.Revision
import typings.pouchdbCore.PouchDB.Core.RevisionDiffOptions
import typings.pouchdbCore.PouchDB.Core.RevisionDiffResponse
import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends EventEmitter {
  /** The name passed to the PouchDB constructor and unique identifier of the database. */
  var name: String = js.native
  /** Fetch all documents matching the given options. */
  def allDocs[Model](): js.Promise[AllDocsResponse[Content with Model]] = js.native
  def allDocs[Model](options: AllDocsOptions): js.Promise[AllDocsResponse[Content with Model]] = js.native
  def allDocs[Model](options: AllDocsWithKeyOptions): js.Promise[AllDocsResponse[Content with Model]] = js.native
  def allDocs[Model](options: AllDocsWithKeysOptions): js.Promise[AllDocsResponse[Content with Model]] = js.native
  def allDocs[Model](options: AllDocsWithinRangeOptions): js.Promise[AllDocsResponse[Content with Model]] = js.native
  /**
    * Create, update or delete multiple documents. The docs argument is an array of documents.
    * If you omit an _id parameter on a given document, the database will create a new document and assign the ID for you.
    * To update a document, you must include both an _id parameter and a _rev parameter,
    * which should match the ID and revision of the document on which to base your updates.
    * Finally, to delete a document, include a _deleted parameter with the value true.
    */
  def bulkDocs[Model](docs: js.Array[PutDocument[Content with Model]]): js.Promise[js.Array[Response | Error]] = js.native
  def bulkDocs[Model](
    docs: js.Array[PutDocument[Content with Model]],
    options: Null,
    callback: Callback[js.Array[Response | Error]]
  ): Unit = js.native
  def bulkDocs[Model](docs: js.Array[PutDocument[Content with Model]], options: BulkDocsOptions): js.Promise[js.Array[Response | Error]] = js.native
  /**
    * Create, update or delete multiple documents. The docs argument is an array of documents.
    * If you omit an _id parameter on a given document, the database will create a new document and assign the ID for you.
    * To update a document, you must include both an _id parameter and a _rev parameter,
    * which should match the ID and revision of the document on which to base your updates.
    * Finally, to delete a document, include a _deleted parameter with the value true.
    */
  def bulkDocs[Model](
    docs: js.Array[PutDocument[Content with Model]],
    options: BulkDocsOptions,
    callback: Callback[js.Array[Response | Error]]
  ): Unit = js.native
  /** Given a set of document/revision IDs, returns the document bodies (and, optionally, attachment data) for each ID/revision pair specified. */
  def bulkGet[Model](options: BulkGetOptions): js.Promise[BulkGetResponse[Content with Model]] = js.native
  /** Given a set of document/revision IDs, returns the document bodies (and, optionally, attachment data) for each ID/revision pair specified. */
  def bulkGet[Model](options: BulkGetOptions, callback: Callback[BulkGetResponse[Content with Model]]): Unit = js.native
  /**
    * A list of changes made to documents in the database, in the order they were made.
    * It returns an object with the method cancel(), which you call if you don’t want to listen to new changes anymore.
    *
    * It is an event emitter and will emit a 'change' event on each document change,
    * a 'complete' event when all the changes have been processed, and an 'error' event when an error occurs.
    * Calling cancel() will unsubscribe all event listeners automatically.
    */
  def changes[Model](): Changes[Content with Model] = js.native
  def changes[Model](options: Null, callback: Callback[Changes[Content with Model]]): Unit = js.native
  def changes[Model](options: ChangesOptions): Changes[Content with Model] = js.native
  /**
    * A list of changes made to documents in the database, in the order they were made.
    * It returns an object with the method cancel(), which you call if you don’t want to listen to new changes anymore.
    *
    * It is an event emitter and will emit a 'change' event on each document change,
    * a 'complete' event when all the changes have been processed, and an 'error' event when an error occurs.
    * Calling cancel() will unsubscribe all event listeners automatically.
    */
  def changes[Model](options: ChangesOptions, callback: Callback[Changes[Content with Model]]): Unit = js.native
  /** Close the database */
  def close(): js.Promise[Unit] = js.native
  /** Close the database */
  def close(callback: Callback[_]): Unit = js.native
  /** Compact the database */
  def compact(): js.Promise[Response] = js.native
  def compact(options: CompactOptions): js.Promise[Response] = js.native
  /** Compact the database */
  def compact(options: CompactOptions, callback: Callback[Response]): Unit = js.native
  /** Destroy the database */
  def destroy(): js.Promise[Unit] = js.native
  def destroy(options: Null, callback: Callback[_]): Unit = js.native
  def destroy(options: Options): js.Promise[Unit] = js.native
  /** Destroy the database */
  def destroy(options: Options, callback: Callback[_]): Unit = js.native
  /** Fetch a document */
  def get[Model](docId: DocumentId): js.Promise[(Document[Content with Model]) with GetMeta] = js.native
  def get[Model](docId: DocumentId, options: Null, callback: Callback[(Document[Content with Model]) with GetMeta]): Unit = js.native
  /** Fetch a document */
  def get[Model](docId: DocumentId, options: GetOpenRevisions): js.Promise[js.Array[Revision[Content with Model]]] = js.native
  /** Fetch a document */
  def get[Model](
    docId: DocumentId,
    options: GetOpenRevisions,
    callback: Callback[js.Array[Revision[Content with Model]]]
  ): Unit = js.native
  def get[Model](docId: DocumentId, options: GetOptions): js.Promise[(Document[Content with Model]) with GetMeta] = js.native
  /** Fetch a document */
  def get[Model](
    docId: DocumentId,
    options: GetOptions,
    callback: Callback[(Document[Content with Model]) with GetMeta]
  ): Unit = js.native
  /** Get attachment data */
  def getAttachment(docId: DocumentId, attachmentId: AttachmentId): js.Promise[Blob | Buffer] = js.native
  /** Get attachment data */
  def getAttachment(docId: DocumentId, attachmentId: AttachmentId, callback: Callback[Blob | Buffer]): Unit = js.native
  def getAttachment(docId: DocumentId, attachmentId: AttachmentId, options: AnonRevRevisionId): js.Promise[Blob | Buffer] = js.native
  /** Get attachment data */
  def getAttachment(
    docId: DocumentId,
    attachmentId: AttachmentId,
    options: AnonRevRevisionId,
    callback: Callback[Blob | Buffer]
  ): Unit = js.native
  /** Get database information */
  def info(): js.Promise[DatabaseInfo] = js.native
  /** Get database information */
  def info(callback: Callback[DatabaseInfo]): Unit = js.native
  /**
    * Create a new document without providing an id.
    *
    * You should prefer put() to post(), because when you post(), you are
    * missing an opportunity to use allDocs() to sort documents by _id
    * (because your _ids are random).
    *
    * @see {@link https://pouchdb.com/2014/06/17/12-pro-tips-for-better-code-with-pouchdb.html|PouchDB Pro Tips}
    */
  def post[Model](doc: PostDocument[Content with Model]): js.Promise[Response] = js.native
  def post[Model](doc: PostDocument[Content with Model], options: Null, callback: Callback[Response]): Unit = js.native
  def post[Model](doc: PostDocument[Content with Model], options: Options): js.Promise[Response] = js.native
  /**
    * Create a new document without providing an id.
    *
    * You should prefer put() to post(), because when you post(), you are
    * missing an opportunity to use allDocs() to sort documents by _id
    * (because your _ids are random).
    *
    * @see {@link https://pouchdb.com/2014/06/17/12-pro-tips-for-better-code-with-pouchdb.html|PouchDB Pro Tips}
    */
  def post[Model](doc: PostDocument[Content with Model], options: Options, callback: Callback[Response]): Unit = js.native
  /**
    * Create a new document or update an existing document.
    *
    * If the document already exists, you must specify its revision _rev,
    * otherwise a conflict will occur.
    * There are some restrictions on valid property names of the documents.
    * If you try to store non-JSON data (for instance Date objects) you may
    * see inconsistent results.
    */
  def put[Model](doc: PutDocument[Content with Model]): js.Promise[Response] = js.native
  def put[Model](doc: PutDocument[Content with Model], options: Null, callback: Callback[Response]): Unit = js.native
  def put[Model](doc: PutDocument[Content with Model], options: PutOptions): js.Promise[Response] = js.native
  /**
    * Create a new document or update an existing document.
    *
    * If the document already exists, you must specify its revision _rev,
    * otherwise a conflict will occur.
    * There are some restrictions on valid property names of the documents.
    * If you try to store non-JSON data (for instance Date objects) you may
    * see inconsistent results.
    */
  def put[Model](doc: PutDocument[Content with Model], options: PutOptions, callback: Callback[Response]): Unit = js.native
  /**
    * Attaches a binary object to a document.
    * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
    * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
    */
  def putAttachment(docId: DocumentId, attachmentId: AttachmentId, attachment: AttachmentData, `type`: String): js.Promise[Response] = js.native
  /**
    * Attaches a binary object to a document.
    * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
    * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
    */
  def putAttachment(
    docId: DocumentId,
    attachmentId: AttachmentId,
    attachment: AttachmentData,
    `type`: String,
    callback: Callback[Response]
  ): Unit = js.native
  /**
    * Attaches a binary object to a document.
    * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
    * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
    */
  def putAttachment(
    docId: DocumentId,
    attachmentId: AttachmentId,
    rev: RevisionId,
    attachment: AttachmentData,
    `type`: String
  ): js.Promise[Response] = js.native
  /**
    * Attaches a binary object to a document.
    * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
    * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
    */
  def putAttachment(
    docId: DocumentId,
    attachmentId: AttachmentId,
    rev: RevisionId,
    attachment: AttachmentData,
    `type`: String,
    callback: Callback[Response]
  ): Unit = js.native
  /** Remove a doc from the database */
  def remove(docId: DocumentId, revision: RevisionId): js.Promise[Response] = js.native
  def remove(docId: DocumentId, revision: RevisionId, options: Options): js.Promise[Response] = js.native
  /** Remove a doc from the database */
  def remove(docId: DocumentId, revision: RevisionId, options: Options, callback: Callback[Response]): Unit = js.native
  /** Remove a doc from the database */
  def remove(doc: RemoveDocument): js.Promise[Response] = js.native
  def remove(doc: RemoveDocument, options: Options): js.Promise[Response] = js.native
  /** Remove a doc from the database */
  def remove(doc: RemoveDocument, options: Options, callback: Callback[Response]): Unit = js.native
  /** Delete an attachment from a doc. You must supply the rev of the existing doc. */
  def removeAttachment(docId: DocumentId, attachmentId: AttachmentId, rev: RevisionId): js.Promise[RemoveAttachmentResponse] = js.native
  /** Delete an attachment from a doc. You must supply the rev of the existing doc. */
  def removeAttachment(
    docId: DocumentId,
    attachmentId: AttachmentId,
    rev: RevisionId,
    callback: Callback[RemoveAttachmentResponse]
  ): Unit = js.native
  /** Given a set of document/revision IDs, returns the subset of those that do not correspond to revisions stored in the database */
  def revsDiff(diff: RevisionDiffOptions): js.Promise[RevisionDiffResponse] = js.native
  /** Given a set of document/revision IDs, returns the subset of those that do not correspond to revisions stored in the database */
  def revsDiff(diff: RevisionDiffOptions, callback: Callback[RevisionDiffResponse]): Unit = js.native
}

