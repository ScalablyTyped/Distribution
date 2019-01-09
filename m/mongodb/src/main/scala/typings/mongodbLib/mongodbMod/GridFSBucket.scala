package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "GridFSBucket")
@js.native
class GridFSBucket protected () extends js.Object {
  def this(db: Db) = this()
  def this(db: Db, options: GridFSBucketOptions) = this()
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#delete */
  def delete(id: bsonLib.bsonMod.ObjectID): scala.Unit = js.native
  def delete(id: bsonLib.bsonMod.ObjectID, callback: GridFSBucketErrorCallback): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#drop */
  def drop(): scala.Unit = js.native
  def drop(callback: GridFSBucketErrorCallback): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#find */
  def find(): Cursor[_] = js.native
  def find(filter: js.Object): Cursor[_] = js.native
  def find(filter: js.Object, options: GridFSBucketFindOptions): Cursor[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openDownloadStream */
  def openDownloadStream(id: bsonLib.bsonMod.ObjectID): GridFSBucketReadStream = js.native
  def openDownloadStream(id: bsonLib.bsonMod.ObjectID, options: mongodbLib.Anon_End): GridFSBucketReadStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openDownloadStreamByName */
  def openDownloadStreamByName(filename: java.lang.String): GridFSBucketReadStream = js.native
  def openDownloadStreamByName(filename: java.lang.String, options: mongodbLib.Anon_EndRevision): GridFSBucketReadStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openUploadStream */
  def openUploadStream(filename: java.lang.String): GridFSBucketWriteStream = js.native
  def openUploadStream(filename: java.lang.String, options: GridFSBucketOpenUploadStreamOptions): GridFSBucketWriteStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openUploadStreamWithId */
  def openUploadStreamWithId(id: mongodbLib.GridFSBucketWriteStreamId, filename: java.lang.String): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(
    id: mongodbLib.GridFSBucketWriteStreamId,
    filename: java.lang.String,
    options: GridFSBucketOpenUploadStreamOptions
  ): GridFSBucketWriteStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#rename */
  def rename(id: bsonLib.bsonMod.ObjectID, filename: java.lang.String): scala.Unit = js.native
  def rename(id: bsonLib.bsonMod.ObjectID, filename: java.lang.String, callback: GridFSBucketErrorCallback): scala.Unit = js.native
}

