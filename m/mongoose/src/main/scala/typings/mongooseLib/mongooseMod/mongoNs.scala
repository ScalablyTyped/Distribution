package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "mongo")
@js.native
object mongoNs extends js.Object {
  @js.native
  class AggregationCursor[T] ()
    extends mongodbLib.mongodbMod.AggregationCursor[T]
  
  @js.native
  class ChangeStream protected ()
    extends mongodbLib.mongodbMod.ChangeStream {
    def this(changeDomain: mongodbLib.mongodbMod.Db, pipeline: js.Array[js.Object]) = this()
  }
  
  @js.native
  class Code protected ()
    extends mongodbLib.mongodbMod.Code {
    def this(code: java.lang.String) = this()
  }
  
  @js.native
  class CommandCursor ()
    extends mongodbLib.mongodbMod.CommandCursor
  
  @js.native
  class Cursor[T] ()
    extends mongodbLib.mongodbMod.Cursor[T]
  
  @js.native
  class DBRef protected ()
    extends mongodbLib.mongodbMod.DBRef {
    /**
      * @param namespace The collection name.
      * @param oid The reference ObjectId.
      * @param db Optional db name, if omitted the reference is local to the current db
      */
    def this(namespace: java.lang.String, oid: bsonLib.bsonMod.ObjectId) = this()
  }
  
  @js.native
  class Db protected ()
    extends mongodbLib.mongodbMod.Db {
    def this(databaseName: java.lang.String, serverConfig: mongodbLib.mongodbMod.Server) = this()
  }
  
  @js.native
  class Double protected ()
    extends mongodbLib.mongodbMod.Double {
    /**
      * @param value The number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class GridFSBucket protected ()
    extends mongodbLib.mongodbMod.GridFSBucket {
    def this(db: mongodbLib.mongodbMod.Db) = this()
  }
  
  @js.native
  class GridFSBucketReadStream protected ()
    extends mongodbLib.mongodbMod.GridFSBucketReadStream {
    def this(chunks: mongodbLib.mongodbMod.Collection[_], files: mongodbLib.mongodbMod.Collection[_], readPreference: js.Object, filter: js.Object) = this()
  }
  
  @js.native
  class GridFSBucketWriteStream protected ()
    extends mongodbLib.mongodbMod.GridFSBucketWriteStream {
    def this(bucket: mongodbLib.mongodbMod.GridFSBucket, filename: java.lang.String) = this()
  }
  
  @js.native
  class MaxKey ()
    extends mongodbLib.mongodbMod.MaxKey
  
  @js.native
  class MinKey ()
    extends mongodbLib.mongodbMod.MinKey
  
  @js.native
  class MongoNetworkError protected ()
    extends mongodbLib.mongodbMod.MongoNetworkError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class MongoParseError protected ()
    extends mongodbLib.mongodbMod.MongoParseError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class Mongos protected ()
    extends mongodbLib.mongodbMod.Mongos {
    def this(servers: js.Array[mongodbLib.mongodbMod.Server]) = this()
  }
  
  @js.native
  class ReplSet protected ()
    extends mongodbLib.mongodbMod.ReplSet {
    def this(servers: js.Array[mongodbLib.mongodbMod.Server]) = this()
  }
  
  @js.native
  class Server protected ()
    extends mongodbLib.mongodbMod.Server {
    def this(host: java.lang.String, port: scala.Double) = this()
  }
  
}

