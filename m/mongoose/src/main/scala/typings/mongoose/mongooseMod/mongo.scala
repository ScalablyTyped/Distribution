package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.bson.bsonMod.ObjectId
import typings.mongodb.mongodbMod.Db
import typings.mongodb.mongodbMod.GridFSBucket
import typings.mongodb.mongodbMod.MongoCallback
import typings.mongodb.mongodbMod.MongoClient
import typings.mongodb.mongodbMod.MongoClientOptions
import typings.mongodb.mongodbMod.Server
import typings.mongoose.TypeofClassBinary
import typings.mongoose.TypeofClassDecimal128Bytes
import typings.mongoose.TypeofClassLogger
import typings.mongoose.TypeofClassLong
import typings.mongoose.TypeofClassMongoClient
import typings.mongoose.TypeofClassMongoError
import typings.mongoose.TypeofClassObjectID
import typings.mongoose.TypeofClassObjectIdCacheHexString
import typings.mongoose.TypeofClassReadPreference
import typings.mongoose.TypeofClassTimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in mongoNs */
@JSImport("mongoose", "mongo")
@js.native
object mongo extends js.Object {
  var AggregationCursor: Instantiable0[typings.mongodb.mongodbMod.AggregationCursor[js.Object]] = js.native
  var Binary: TypeofClassBinary = js.native
  var ChangeStream: Instantiable2[
    /* changeDomain */ Db, 
    /* pipeline */ js.Array[js.Object], 
    typings.mongodb.mongodbMod.ChangeStream
  ] = js.native
  var Code: Instantiable1[/* code */ String, typings.mongodb.mongodbMod.Code] = js.native
  var CommandCursor: Instantiable0[typings.mongodb.mongodbMod.CommandCursor] = js.native
  var Cursor: Instantiable0[typings.mongodb.mongodbMod.Cursor[js.Object]] = js.native
  var DBRef: Instantiable2[/* namespace */ String, /* oid */ ObjectId, typings.mongodb.mongodbMod.DBRef] = js.native
  var Db: Instantiable2[/* databaseName */ String, /* serverConfig */ Server, typings.mongodb.mongodbMod.Db] = js.native
  var Decimal128: TypeofClassDecimal128Bytes = js.native
  var Double: Instantiable1[/* value */ scala.Double, typings.mongodb.mongodbMod.Double] = js.native
  var GridFSBucket: Instantiable1[/* db */ Db, typings.mongodb.mongodbMod.GridFSBucket] = js.native
  var GridFSBucketReadStream: Instantiable4[
    /* chunks */ typings.mongodb.mongodbMod.Collection[js.Any], 
    /* files */ typings.mongodb.mongodbMod.Collection[js.Any], 
    /* readPreference */ js.Object, 
    /* filter */ js.Object, 
    typings.mongodb.mongodbMod.GridFSBucketReadStream
  ] = js.native
  var GridFSBucketWriteStream: Instantiable2[
    /* bucket */ GridFSBucket, 
    /* filename */ String, 
    typings.mongodb.mongodbMod.GridFSBucketWriteStream
  ] = js.native
  var Int32: Instantiable1[/* value */ Double, typings.mongodb.mongodbMod.Int32] = js.native
  var Logger: TypeofClassLogger = js.native
  var Long: TypeofClassLong = js.native
  var MaxKey: Instantiable0[typings.mongodb.mongodbMod.MaxKey] = js.native
  var MinKey: Instantiable0[typings.mongodb.mongodbMod.MinKey] = js.native
  var MongoClient: TypeofClassMongoClient = js.native
  var MongoError: TypeofClassMongoError = js.native
  var MongoNetworkError: Instantiable1[/* message */ String, typings.mongodb.mongodbMod.MongoNetworkError] = js.native
  var MongoParseError: Instantiable1[/* message */ String, typings.mongodb.mongodbMod.MongoParseError] = js.native
  var Mongos: Instantiable1[/* servers */ js.Array[Server], typings.mongodb.mongodbMod.Mongos] = js.native
  var ObjectID: TypeofClassObjectID = js.native
  var ObjectId: TypeofClassObjectIdCacheHexString = js.native
  var ReadPreference: TypeofClassReadPreference = js.native
  var ReplSet: Instantiable1[/* servers */ js.Array[Server], typings.mongodb.mongodbMod.ReplSet] = js.native
  var Server: Instantiable2[/* host */ String, /* port */ Double, typings.mongodb.mongodbMod.Server] = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  def connect(uri: String): js.Promise[MongoClient] = js.native
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
}

