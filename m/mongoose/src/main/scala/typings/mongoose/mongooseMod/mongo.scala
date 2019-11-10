package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.bson.bsonMod.ObjectId
import typings.mongodb.mongodbMod.MongoCallback
import typings.mongodb.mongodbMod.MongoClient
import typings.mongodb.mongodbMod.MongoClientOptions
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

@JSImport("mongoose", "mongo")
@js.native
object mongo extends js.Object {
  @js.native
  class AggregationCursor[T] ()
    extends typings.mongodb.mongodbMod.AggregationCursor[T]
  
  @js.native
  class ChangeStream protected ()
    extends typings.mongodb.mongodbMod.ChangeStream {
    def this(changeDomain: typings.mongodb.mongodbMod.Db, pipeline: js.Array[js.Object]) = this()
  }
  
  @js.native
  class Code protected ()
    extends typings.mongodb.mongodbMod.Code {
    def this(code: String) = this()
  }
  
  @js.native
  class CommandCursor ()
    extends typings.mongodb.mongodbMod.CommandCursor
  
  @js.native
  class Cursor[T] ()
    extends typings.mongodb.mongodbMod.Cursor[T]
  
  @js.native
  class DBRef protected ()
    extends typings.mongodb.mongodbMod.DBRef {
    /**
      * @param namespace The collection name.
      * @param oid The reference ObjectId.
      * @param db Optional db name, if omitted the reference is local to the current db
      */
    def this(namespace: String, oid: ObjectId) = this()
  }
  
  @js.native
  class Db protected ()
    extends typings.mongodb.mongodbMod.Db {
    def this(databaseName: String, serverConfig: typings.mongodb.mongodbMod.Server) = this()
  }
  
  @js.native
  class Double protected ()
    extends typings.mongodb.mongodbMod.Double {
    /**
      * @param value The number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class GridFSBucket protected ()
    extends typings.mongodb.mongodbMod.GridFSBucket {
    def this(db: typings.mongodb.mongodbMod.Db) = this()
  }
  
  @js.native
  class GridFSBucketReadStream protected ()
    extends typings.mongodb.mongodbMod.GridFSBucketReadStream {
    def this(
      chunks: typings.mongodb.mongodbMod.Collection[_],
      files: typings.mongodb.mongodbMod.Collection[_],
      readPreference: js.Object,
      filter: js.Object
    ) = this()
  }
  
  @js.native
  class GridFSBucketWriteStream protected ()
    extends typings.mongodb.mongodbMod.GridFSBucketWriteStream {
    def this(bucket: typings.mongodb.mongodbMod.GridFSBucket, filename: String) = this()
  }
  
  @js.native
  class Int32 protected ()
    extends typings.mongodb.mongodbMod.Int32 {
    /**
      * @param value The number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class MaxKey ()
    extends typings.mongodb.mongodbMod.MaxKey
  
  @js.native
  class MinKey ()
    extends typings.mongodb.mongodbMod.MinKey
  
  @js.native
  class MongoNetworkError protected ()
    extends typings.mongodb.mongodbMod.MongoNetworkError {
    def this(message: String) = this()
  }
  
  @js.native
  class MongoParseError protected ()
    extends typings.mongodb.mongodbMod.MongoParseError {
    def this(message: String) = this()
  }
  
  @js.native
  class Mongos protected ()
    extends typings.mongodb.mongodbMod.Mongos {
    def this(servers: js.Array[typings.mongodb.mongodbMod.Server]) = this()
  }
  
  @js.native
  class ReplSet protected ()
    extends typings.mongodb.mongodbMod.ReplSet {
    def this(servers: js.Array[typings.mongodb.mongodbMod.Server]) = this()
  }
  
  @js.native
  class ResumeToken ()
    extends typings.mongodb.mongodbMod.ResumeToken
  
  @js.native
  class Server protected ()
    extends typings.mongodb.mongodbMod.Server {
    def this(host: String, port: scala.Double) = this()
  }
  
  var AggregationCursor: Instantiable0[typings.mongodb.mongodbMod.AggregationCursor[js.Object]] = js.native
  var Binary: TypeofClassBinary = js.native
  var ChangeStream: Instantiable2[
    /* changeDomain */ typings.mongodb.mongodbMod.Db, 
    /* pipeline */ js.Array[js.Object], 
    typings.mongodb.mongodbMod.ChangeStream
  ] = js.native
  var Code: Instantiable1[/* code */ String, typings.mongodb.mongodbMod.Code] = js.native
  var CommandCursor: Instantiable0[typings.mongodb.mongodbMod.CommandCursor] = js.native
  var Cursor: Instantiable0[typings.mongodb.mongodbMod.Cursor[js.Object]] = js.native
  var DBRef: Instantiable2[/* namespace */ String, /* oid */ ObjectId, typings.mongodb.mongodbMod.DBRef] = js.native
  var Db: Instantiable2[
    /* databaseName */ String, 
    /* serverConfig */ typings.mongodb.mongodbMod.Server, 
    typings.mongodb.mongodbMod.Db
  ] = js.native
  var Decimal128: TypeofClassDecimal128Bytes = js.native
  var Double: Instantiable1[/* value */ scala.Double, typings.mongodb.mongodbMod.Double] = js.native
  var GridFSBucket: Instantiable1[/* db */ typings.mongodb.mongodbMod.Db, typings.mongodb.mongodbMod.GridFSBucket] = js.native
  var GridFSBucketReadStream: Instantiable4[
    /* chunks */ typings.mongodb.mongodbMod.Collection[js.Any], 
    /* files */ typings.mongodb.mongodbMod.Collection[js.Any], 
    /* readPreference */ js.Object, 
    /* filter */ js.Object, 
    typings.mongodb.mongodbMod.GridFSBucketReadStream
  ] = js.native
  var GridFSBucketWriteStream: Instantiable2[
    /* bucket */ typings.mongodb.mongodbMod.GridFSBucket, 
    /* filename */ String, 
    typings.mongodb.mongodbMod.GridFSBucketWriteStream
  ] = js.native
  var Int32: Instantiable1[/* value */ scala.Double, typings.mongodb.mongodbMod.Int32] = js.native
  var Logger: TypeofClassLogger = js.native
  var Long: TypeofClassLong = js.native
  var MaxKey: Instantiable0[typings.mongodb.mongodbMod.MaxKey] = js.native
  var MinKey: Instantiable0[typings.mongodb.mongodbMod.MinKey] = js.native
  var MongoClient: TypeofClassMongoClient = js.native
  var MongoError: TypeofClassMongoError = js.native
  var MongoNetworkError: Instantiable1[/* message */ String, typings.mongodb.mongodbMod.MongoNetworkError] = js.native
  var MongoParseError: Instantiable1[/* message */ String, typings.mongodb.mongodbMod.MongoParseError] = js.native
  var Mongos: Instantiable1[
    /* servers */ js.Array[typings.mongodb.mongodbMod.Server], 
    typings.mongodb.mongodbMod.Mongos
  ] = js.native
  var ObjectID: TypeofClassObjectID = js.native
  var ObjectId: TypeofClassObjectIdCacheHexString = js.native
  var ReadPreference: TypeofClassReadPreference = js.native
  var ReplSet: Instantiable1[
    /* servers */ js.Array[typings.mongodb.mongodbMod.Server], 
    typings.mongodb.mongodbMod.ReplSet
  ] = js.native
  var ResumeToken: Instantiable0[typings.mongodb.mongodbMod.ResumeToken] = js.native
  var Server: Instantiable2[/* host */ String, /* port */ scala.Double, typings.mongodb.mongodbMod.Server] = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  def connect(uri: String): js.Promise[MongoClient] = js.native
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
}

