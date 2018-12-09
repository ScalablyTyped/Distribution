package typings
package pouchdbDashCoreLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */]
  extends pouchdbDashCoreLib.EventEmitter {
  /** The name passed to the PouchDB constructor and unique identifier of the database. */
  var name: java.lang.String = js.native
  /** Fetch all documents matching the given options. */
  def allDocs[Model](): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsResponse[Content with Model]] = js.native
  /** Fetch all documents matching the given options. */
  def allDocs[Model](options: pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsOptions): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsResponse[Content with Model]] = js.native
  /** Fetch all documents matching the given options. */
  def allDocs[Model](options: pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsWithKeyOptions): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsResponse[Content with Model]] = js.native
  /** Fetch all documents matching the given options. */
  def allDocs[Model](options: pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsWithKeysOptions): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsResponse[Content with Model]] = js.native
  /** Fetch all documents matching the given options. */
  def allDocs[Model](options: pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsWithinRangeOptions): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.AllDocsResponse[Content with Model]] = js.native
  /**
           * Create, update or delete multiple documents. The docs argument is an array of documents.
           * If you omit an _id parameter on a given document, the database will create a new document and assign the ID for you.
           * To update a document, you must include both an _id parameter and a _rev parameter,
           * which should match the ID and revision of the document on which to base your updates.
           * Finally, to delete a document, include a _deleted parameter with the value true.
           */
  def bulkDocs[Model](docs: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model]]): js.Promise[
    js.Array[
      pouchdbDashCoreLib.PouchDBNs.CoreNs.Response | pouchdbDashCoreLib.PouchDBNs.CoreNs.Error
    ]
  ] = js.native
  /**
           * Create, update or delete multiple documents. The docs argument is an array of documents.
           * If you omit an _id parameter on a given document, the database will create a new document and assign the ID for you.
           * To update a document, you must include both an _id parameter and a _rev parameter,
           * which should match the ID and revision of the document on which to base your updates.
           * Finally, to delete a document, include a _deleted parameter with the value true.
           */
  def bulkDocs[Model](
    docs: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model]],
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.BulkDocsOptions
  ): js.Promise[
    js.Array[
      pouchdbDashCoreLib.PouchDBNs.CoreNs.Response | pouchdbDashCoreLib.PouchDBNs.CoreNs.Error
    ]
  ] = js.native
  /**
           * Create, update or delete multiple documents. The docs argument is an array of documents.
           * If you omit an _id parameter on a given document, the database will create a new document and assign the ID for you.
           * To update a document, you must include both an _id parameter and a _rev parameter,
           * which should match the ID and revision of the document on which to base your updates.
           * Finally, to delete a document, include a _deleted parameter with the value true.
           */
  def bulkDocs[Model](
    docs: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model]],
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.BulkDocsOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      js.Array[
        pouchdbDashCoreLib.PouchDBNs.CoreNs.Response | pouchdbDashCoreLib.PouchDBNs.CoreNs.Error
      ]
    ]
  ): scala.Unit = js.native
  /**
           * Create, update or delete multiple documents. The docs argument is an array of documents.
           * If you omit an _id parameter on a given document, the database will create a new document and assign the ID for you.
           * To update a document, you must include both an _id parameter and a _rev parameter,
           * which should match the ID and revision of the document on which to base your updates.
           * Finally, to delete a document, include a _deleted parameter with the value true.
           */
  def bulkDocs[Model](
    docs: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model]],
    options: scala.Null,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      js.Array[
        pouchdbDashCoreLib.PouchDBNs.CoreNs.Response | pouchdbDashCoreLib.PouchDBNs.CoreNs.Error
      ]
    ]
  ): scala.Unit = js.native
  /** Given a set of document/revision IDs, returns the document bodies (and, optionally, attachment data) for each ID/revision pair specified. */
  def bulkGet[Model](options: pouchdbDashCoreLib.PouchDBNs.CoreNs.BulkGetOptions): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.BulkGetResponse[Content with Model]] = js.native
  /** Given a set of document/revision IDs, returns the document bodies (and, optionally, attachment data) for each ID/revision pair specified. */
  def bulkGet[Model](
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.BulkGetOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.BulkGetResponse[Content with Model]]
  ): scala.Unit = js.native
  /**
           * A list of changes made to documents in the database, in the order they were made.
           * It returns an object with the method cancel(), which you call if you don’t want to listen to new changes anymore.
           *
           * It is an event emitter and will emit a 'change' event on each document change,
           * a 'complete' event when all the changes have been processed, and an 'error' event when an error occurs.
           * Calling cancel() will unsubscribe all event listeners automatically.
           */
  def changes[Model](): pouchdbDashCoreLib.PouchDBNs.CoreNs.Changes[Content with Model] = js.native
  /**
           * A list of changes made to documents in the database, in the order they were made.
           * It returns an object with the method cancel(), which you call if you don’t want to listen to new changes anymore.
           *
           * It is an event emitter and will emit a 'change' event on each document change,
           * a 'complete' event when all the changes have been processed, and an 'error' event when an error occurs.
           * Calling cancel() will unsubscribe all event listeners automatically.
           */
  def changes[Model](options: pouchdbDashCoreLib.PouchDBNs.CoreNs.ChangesOptions): pouchdbDashCoreLib.PouchDBNs.CoreNs.Changes[Content with Model] = js.native
  /**
           * A list of changes made to documents in the database, in the order they were made.
           * It returns an object with the method cancel(), which you call if you don’t want to listen to new changes anymore.
           *
           * It is an event emitter and will emit a 'change' event on each document change,
           * a 'complete' event when all the changes have been processed, and an 'error' event when an error occurs.
           * Calling cancel() will unsubscribe all event listeners automatically.
           */
  def changes[Model](
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.ChangesOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Changes[Content with Model]]
  ): scala.Unit = js.native
  /**
           * A list of changes made to documents in the database, in the order they were made.
           * It returns an object with the method cancel(), which you call if you don’t want to listen to new changes anymore.
           *
           * It is an event emitter and will emit a 'change' event on each document change,
           * a 'complete' event when all the changes have been processed, and an 'error' event when an error occurs.
           * Calling cancel() will unsubscribe all event listeners automatically.
           */
  def changes[Model](
    options: scala.Null,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Changes[Content with Model]]
  ): scala.Unit = js.native
  /** Close the database */
  def close(): js.Promise[scala.Unit] = js.native
  /** Close the database */
  def close(callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[_]): scala.Unit = js.native
  /** Compact the database */
  def compact(): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /** Compact the database */
  def compact(options: pouchdbDashCoreLib.PouchDBNs.CoreNs.CompactOptions): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /** Compact the database */
  def compact(
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.CompactOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /** Destroy the database */
  def destroy(): js.Promise[scala.Unit] = js.native
  /** Destroy the database */
  def destroy(options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options): js.Promise[scala.Unit] = js.native
  /** Destroy the database */
  def destroy(
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[_]
  ): scala.Unit = js.native
  /** Destroy the database */
  def destroy(options: scala.Null, callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[_]): scala.Unit = js.native
  /** Fetch a document */
  def get[Model](docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId): js.Promise[
    (pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content with Model]) with pouchdbDashCoreLib.PouchDBNs.CoreNs.GetMeta
  ] = js.native
  /** Fetch a document */
  def get[Model](
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.GetOpenRevisions
  ): js.Promise[js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.Revision[Content with Model]]] = js.native
  /** Fetch a document */
  def get[Model](
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.GetOpenRevisions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.Revision[Content with Model]]]
  ): scala.Unit = js.native
  /** Fetch a document */
  def get[Model](
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.GetOptions
  ): js.Promise[
    (pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content with Model]) with pouchdbDashCoreLib.PouchDBNs.CoreNs.GetMeta
  ] = js.native
  /** Fetch a document */
  def get[Model](
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.GetOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      (pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content with Model]) with pouchdbDashCoreLib.PouchDBNs.CoreNs.GetMeta
    ]
  ): scala.Unit = js.native
  /** Fetch a document */
  def get[Model](
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    options: scala.Null,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[
      (pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content with Model]) with pouchdbDashCoreLib.PouchDBNs.CoreNs.GetMeta
    ]
  ): scala.Unit = js.native
  /** Get attachment data */
  def getAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId
  ): js.Promise[pouchdbDashCoreLib.Blob | pouchdbDashCoreLib.Buffer] = js.native
  /** Get attachment data */
  def getAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.Blob | pouchdbDashCoreLib.Buffer]
  ): scala.Unit = js.native
  /** Get attachment data */
  def getAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    options: pouchdbDashCoreLib.Anon_Rev
  ): js.Promise[pouchdbDashCoreLib.Blob | pouchdbDashCoreLib.Buffer] = js.native
  /** Get attachment data */
  def getAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    options: pouchdbDashCoreLib.Anon_Rev,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.Blob | pouchdbDashCoreLib.Buffer]
  ): scala.Unit = js.native
  /** Get database information */
  def info(): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.DatabaseInfo] = js.native
  /** Get database information */
  def info(
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.DatabaseInfo]
  ): scala.Unit = js.native
  /**
           * Create a new document without providing an id.
           *
           * You should prefer put() to post(), because when you post(), you are
           * missing an opportunity to use allDocs() to sort documents by _id
           * (because your _ids are random).
           *
           * @see {@link https://pouchdb.com/2014/06/17/12-pro-tips-for-better-code-with-pouchdb.html|PouchDB Pro Tips}
           */
  def post[Model](doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PostDocument[Content with Model]): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /**
           * Create a new document without providing an id.
           *
           * You should prefer put() to post(), because when you post(), you are
           * missing an opportunity to use allDocs() to sort documents by _id
           * (because your _ids are random).
           *
           * @see {@link https://pouchdb.com/2014/06/17/12-pro-tips-for-better-code-with-pouchdb.html|PouchDB Pro Tips}
           */
  def post[Model](
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PostDocument[Content with Model],
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /**
           * Create a new document without providing an id.
           *
           * You should prefer put() to post(), because when you post(), you are
           * missing an opportunity to use allDocs() to sort documents by _id
           * (because your _ids are random).
           *
           * @see {@link https://pouchdb.com/2014/06/17/12-pro-tips-for-better-code-with-pouchdb.html|PouchDB Pro Tips}
           */
  def post[Model](
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PostDocument[Content with Model],
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /**
           * Create a new document without providing an id.
           *
           * You should prefer put() to post(), because when you post(), you are
           * missing an opportunity to use allDocs() to sort documents by _id
           * (because your _ids are random).
           *
           * @see {@link https://pouchdb.com/2014/06/17/12-pro-tips-for-better-code-with-pouchdb.html|PouchDB Pro Tips}
           */
  def post[Model](
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PostDocument[Content with Model],
    options: scala.Null,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /**
           * Create a new document or update an existing document.
           *
           * If the document already exists, you must specify its revision _rev,
           * otherwise a conflict will occur.
           * There are some restrictions on valid property names of the documents.
           * If you try to store non-JSON data (for instance Date objects) you may
           * see inconsistent results.
           */
  def put[Model](doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model]): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /**
           * Create a new document or update an existing document.
           *
           * If the document already exists, you must specify its revision _rev,
           * otherwise a conflict will occur.
           * There are some restrictions on valid property names of the documents.
           * If you try to store non-JSON data (for instance Date objects) you may
           * see inconsistent results.
           */
  def put[Model](
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model],
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.PutOptions
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /**
           * Create a new document or update an existing document.
           *
           * If the document already exists, you must specify its revision _rev,
           * otherwise a conflict will occur.
           * There are some restrictions on valid property names of the documents.
           * If you try to store non-JSON data (for instance Date objects) you may
           * see inconsistent results.
           */
  def put[Model](
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model],
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.PutOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /**
           * Create a new document or update an existing document.
           *
           * If the document already exists, you must specify its revision _rev,
           * otherwise a conflict will occur.
           * There are some restrictions on valid property names of the documents.
           * If you try to store non-JSON data (for instance Date objects) you may
           * see inconsistent results.
           */
  def put[Model](
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.PutDocument[Content with Model],
    options: scala.Null,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /**
            * Attaches a binary object to a document.
            * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
            * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
            */
  def putAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    attachment: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentData,
    `type`: java.lang.String
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /**
            * Attaches a binary object to a document.
            * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
            * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
            */
  def putAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    attachment: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentData,
    `type`: java.lang.String,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /**
            * Attaches a binary object to a document.
            * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
            * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
            */
  def putAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId,
    attachment: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentData,
    `type`: java.lang.String
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /**
           * Attaches a binary object to a document.
           * This method will update an existing document to add the attachment, so it requires a rev if the document already exists.
           * If the document doesn’t already exist, then this method will create an empty document containing the attachment.
           */
  def putAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId,
    attachment: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentData,
    `type`: java.lang.String,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /** Remove a doc from the database */
  def remove(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    revision: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /** Remove a doc from the database */
  def remove(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    revision: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /** Remove a doc from the database */
  def remove(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    revision: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /** Remove a doc from the database */
  def remove(doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.RemoveDocument): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /** Remove a doc from the database */
  def remove(
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.RemoveDocument,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response] = js.native
  /** Remove a doc from the database */
  def remove(
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.RemoveDocument,
    options: pouchdbDashCoreLib.PouchDBNs.CoreNs.Options,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.Response]
  ): scala.Unit = js.native
  /** Delete an attachment from a doc. You must supply the rev of the existing doc. */
  def removeAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId
  ): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.RemoveAttachmentResponse] = js.native
  /** Delete an attachment from a doc. You must supply the rev of the existing doc. */
  def removeAttachment(
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    attachmentId: pouchdbDashCoreLib.PouchDBNs.CoreNs.AttachmentId,
    rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.RemoveAttachmentResponse]
  ): scala.Unit = js.native
  /** Given a set of document/revision IDs, returns the subset of those that do not correspond to revisions stored in the database */
  def revsDiff(diff: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionDiffOptions): js.Promise[pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionDiffResponse] = js.native
  /** Given a set of document/revision IDs, returns the subset of those that do not correspond to revisions stored in the database */
  def revsDiff(
    diff: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionDiffOptions,
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionDiffResponse]
  ): scala.Unit = js.native
}

