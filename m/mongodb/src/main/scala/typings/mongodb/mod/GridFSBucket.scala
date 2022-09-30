package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.mongodbStrings.index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "GridFSBucket")
@js.native
open class GridFSBucket protected () extends TypedEventEmitter[GridFSBucketEvents] {
  def this(db: Db) = this()
  def this(db: Db, options: GridFSBucketOptions) = this()
  
  /**
    * Deletes a file with the given id
    *
    * @param id - The id of the file doc
    */
  def delete(id: typings.bson.mod.ObjectId): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def delete(id: typings.bson.mod.ObjectId, callback: Callback[Unit]): Unit = js.native
  
  /** Removes this bucket's files collection, followed by its chunks collection. */
  def drop(): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def drop(callback: Callback[Unit]): Unit = js.native
  
  /** Convenience wrapper around find on the files collection */
  def find(): FindCursor[GridFSFile] = js.native
  def find(filter: Unit, options: FindOptions[Document]): FindCursor[GridFSFile] = js.native
  def find(filter: Filter[GridFSFile]): FindCursor[GridFSFile] = js.native
  def find(filter: Filter[GridFSFile], options: FindOptions[Document]): FindCursor[GridFSFile] = js.native
  
  /** Get the Db scoped logger. */
  def getLogger(): Logger = js.native
  
  /** Returns a readable stream (GridFSBucketReadStream) for streaming file data from GridFS. */
  def openDownloadStream(id: typings.bson.mod.ObjectId): GridFSBucketReadStream = js.native
  def openDownloadStream(id: typings.bson.mod.ObjectId, options: GridFSBucketReadStreamOptions): GridFSBucketReadStream = js.native
  
  /**
    * Returns a readable stream (GridFSBucketReadStream) for streaming the
    * file with the given name from GridFS. If there are multiple files with
    * the same name, this will stream the most recent file with the given name
    * (as determined by the `uploadDate` field). You can set the `revision`
    * option to change this behavior.
    */
  def openDownloadStreamByName(filename: String): GridFSBucketReadStream = js.native
  def openDownloadStreamByName(filename: String, options: GridFSBucketReadStreamOptionsWithRevision): GridFSBucketReadStream = js.native
  
  /**
    * Returns a writable stream (GridFSBucketWriteStream) for writing
    * buffers to GridFS. The stream's 'id' property contains the resulting
    * file's id.
    *
    * @param filename - The value of the 'filename' key in the files doc
    * @param options - Optional settings.
    */
  def openUploadStream(filename: String): GridFSBucketWriteStream = js.native
  def openUploadStream(filename: String, options: GridFSBucketWriteStreamOptions): GridFSBucketWriteStream = js.native
  
  /**
    * Returns a writable stream (GridFSBucketWriteStream) for writing
    * buffers to GridFS for a custom file id. The stream's 'id' property contains the resulting
    * file's id.
    */
  def openUploadStreamWithId(id: typings.bson.mod.ObjectId, filename: String): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(id: typings.bson.mod.ObjectId, filename: String, options: GridFSBucketWriteStreamOptions): GridFSBucketWriteStream = js.native
  
  /**
    * Renames the file with the given _id to the given string
    *
    * @param id - the id of the file to rename
    * @param filename - new name for the file
    */
  def rename(id: typings.bson.mod.ObjectId, filename: String): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def rename(id: typings.bson.mod.ObjectId, filename: String, callback: Callback[Unit]): Unit = js.native
}
/* static members */
object GridFSBucket {
  
  /* Excluded from this release type: s */
  /**
    * When the first call to openUploadStream is made, the upload stream will
    * check to see if it needs to create the proper indexes on the chunks and
    * files collections. This event is fired either when 1) it determines that
    * no index creation is necessary, 2) when it successfully creates the
    * necessary indexes.
    * @event
    */
  @JSImport("mongodb", "GridFSBucket.INDEX")
  @js.native
  val INDEX: index = js.native
}
