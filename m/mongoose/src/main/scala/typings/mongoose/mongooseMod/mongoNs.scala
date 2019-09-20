package typings.mongoose.mongooseMod

import typings.bson.bsonMod.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "mongo")
@js.native
object mongoNs extends js.Object {
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
  class Server protected ()
    extends typings.mongodb.mongodbMod.Server {
    def this(host: String, port: scala.Double) = this()
  }
  
}

