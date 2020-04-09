package typings.mongoose.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.bson.mod.ObjectId
import typings.mongodb.mod.MongoCallback
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import typings.mongoose.TypeofBinary
import typings.mongoose.TypeofDecimal128Instantiable
import typings.mongoose.TypeofLogger
import typings.mongoose.TypeofLong
import typings.mongoose.TypeofMongoClient
import typings.mongoose.TypeofMongoError
import typings.mongoose.TypeofObjectID_
import typings.mongoose.TypeofObjectIdInstantiable
import typings.mongoose.TypeofReadPreference
import typings.mongoose.TypeofTimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "mongo")
@js.native
object mongo extends js.Object {
  @js.native
  class AggregationCursor[T] ()
    extends typings.mongodb.mod.AggregationCursor[T]
  
  @js.native
  class ChangeStream[TSchema /* <: StringDictionary[js.Any] */] protected ()
    extends typings.mongodb.mod.ChangeStream[TSchema] {
    def this(parent: MongoClient, pipeline: js.Array[js.Object]) = this()
  }
  
  @js.native
  class Code protected ()
    extends typings.mongodb.mod.Code {
    def this(code: String) = this()
  }
  
  @js.native
  class CommandCursor ()
    extends typings.mongodb.mod.CommandCursor
  
  @js.native
  class Cursor[T] ()
    extends typings.mongodb.mod.Cursor[T]
  
  @js.native
  class DBRef protected ()
    extends typings.mongodb.mod.DBRef {
    /**
      * @param namespace The collection name.
      * @param oid The reference ObjectId.
      * @param db Optional db name, if omitted the reference is local to the current db
      */
    def this(namespace: String, oid: ObjectId) = this()
  }
  
  @js.native
  class Db protected ()
    extends typings.mongodb.mod.Db {
    def this(databaseName: String, serverConfig: typings.mongodb.mod.Server) = this()
  }
  
  @js.native
  class Double protected ()
    extends typings.mongodb.mod.Double {
    /**
      * @param value The number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class GridFSBucket protected ()
    extends typings.mongodb.mod.GridFSBucket {
    def this(db: typings.mongodb.mod.Db) = this()
  }
  
  @js.native
  class GridFSBucketReadStream protected ()
    extends typings.mongodb.mod.GridFSBucketReadStream {
    def this(
      chunks: typings.mongodb.mod.Collection[_],
      files: typings.mongodb.mod.Collection[_],
      readPreference: js.Object,
      filter: js.Object
    ) = this()
  }
  
  @js.native
  class GridFSBucketWriteStream protected ()
    extends typings.mongodb.mod.GridFSBucketWriteStream {
    def this(bucket: typings.mongodb.mod.GridFSBucket, filename: String) = this()
  }
  
  @js.native
  class Int32 protected ()
    extends typings.mongodb.mod.Int32 {
    /**
      * @param value The number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  
  @js.native
  class MaxKey ()
    extends typings.mongodb.mod.MaxKey
  
  @js.native
  class MinKey ()
    extends typings.mongodb.mod.MinKey
  
  @js.native
  class MongoNetworkError protected ()
    extends typings.mongodb.mod.MongoNetworkError {
    def this(message: String) = this()
  }
  
  @js.native
  class MongoParseError protected ()
    extends typings.mongodb.mod.MongoParseError {
    def this(message: String) = this()
  }
  
  @js.native
  class Mongos protected ()
    extends typings.mongodb.mod.Mongos {
    def this(servers: js.Array[typings.mongodb.mod.Server]) = this()
  }
  
  @js.native
  class ReplSet protected ()
    extends typings.mongodb.mod.ReplSet {
    def this(servers: js.Array[typings.mongodb.mod.Server]) = this()
  }
  
  @js.native
  class ResumeToken ()
    extends typings.mongodb.mod.ResumeToken
  
  @js.native
  class Server protected ()
    extends typings.mongodb.mod.Server {
    def this(host: String, port: scala.Double) = this()
  }
  
  var Binary: TypeofBinary = js.native
  var Decimal128: TypeofDecimal128Instantiable = js.native
  var Logger: TypeofLogger = js.native
  var Long: TypeofLong = js.native
  var MongoClient: TypeofMongoClient = js.native
  var MongoError: TypeofMongoError = js.native
  var ObjectID: TypeofObjectID_ = js.native
  var ObjectId: TypeofObjectIdInstantiable = js.native
  var ReadPreference: TypeofReadPreference = js.native
  var Timestamp: TypeofTimestamp = js.native
  def connect(uri: String): js.Promise[MongoClient] = js.native
  def connect(uri: String, callback: MongoCallback[MongoClient]): Unit = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  def connect(uri: String, options: MongoClientOptions, callback: MongoCallback[MongoClient]): Unit = js.native
  @js.native
  object AggregationCursor
    extends TopLevel[Instantiable0[typings.mongodb.mod.AggregationCursor[js.Object]]]
  
  @js.native
  object ChangeStream
    extends TopLevel[
          Instantiable2[
            /* parent */ MongoClient, 
            /* pipeline */ js.Array[js.Object], 
            typings.mongodb.mod.ChangeStream[StringDictionary[js.Any]]
          ]
        ]
  
  @js.native
  object Code
    extends TopLevel[Instantiable1[/* code */ String, typings.mongodb.mod.Code]]
  
  @js.native
  object CommandCursor
    extends TopLevel[Instantiable0[typings.mongodb.mod.CommandCursor]]
  
  @js.native
  object Cursor
    extends TopLevel[Instantiable0[typings.mongodb.mod.Cursor[js.Object]]]
  
  @js.native
  object DBRef
    extends TopLevel[
          Instantiable2[/* namespace */ String, /* oid */ ObjectId, typings.mongodb.mod.DBRef]
        ]
  
  @js.native
  object Db
    extends TopLevel[
          Instantiable2[
            /* databaseName */ String, 
            /* serverConfig */ typings.mongodb.mod.Server, 
            typings.mongodb.mod.Db
          ]
        ]
  
  @js.native
  object Double
    extends TopLevel[Instantiable1[/* value */ scala.Double, typings.mongodb.mod.Double]]
  
  @js.native
  object GridFSBucket
    extends TopLevel[Instantiable1[/* db */ typings.mongodb.mod.Db, typings.mongodb.mod.GridFSBucket]]
  
  @js.native
  object GridFSBucketReadStream
    extends TopLevel[
          Instantiable4[
            /* chunks */ typings.mongodb.mod.Collection[js.Any], 
            /* files */ typings.mongodb.mod.Collection[js.Any], 
            /* readPreference */ js.Object, 
            /* filter */ js.Object, 
            typings.mongodb.mod.GridFSBucketReadStream
          ]
        ]
  
  @js.native
  object GridFSBucketWriteStream
    extends TopLevel[
          Instantiable2[
            /* bucket */ typings.mongodb.mod.GridFSBucket, 
            /* filename */ String, 
            typings.mongodb.mod.GridFSBucketWriteStream
          ]
        ]
  
  @js.native
  object Int32
    extends TopLevel[Instantiable1[/* value */ scala.Double, typings.mongodb.mod.Int32]]
  
  @js.native
  object MaxKey
    extends TopLevel[Instantiable0[typings.mongodb.mod.MaxKey]]
  
  @js.native
  object MinKey
    extends TopLevel[Instantiable0[typings.mongodb.mod.MinKey]]
  
  @js.native
  object MongoNetworkError
    extends TopLevel[Instantiable1[/* message */ String, typings.mongodb.mod.MongoNetworkError]]
  
  @js.native
  object MongoParseError
    extends TopLevel[Instantiable1[/* message */ String, typings.mongodb.mod.MongoParseError]]
  
  @js.native
  object Mongos
    extends TopLevel[
          Instantiable1[/* servers */ js.Array[typings.mongodb.mod.Server], typings.mongodb.mod.Mongos]
        ]
  
  @js.native
  object ReplSet
    extends TopLevel[
          Instantiable1[/* servers */ js.Array[typings.mongodb.mod.Server], typings.mongodb.mod.ReplSet]
        ]
  
  @js.native
  object ResumeToken
    extends TopLevel[Instantiable0[typings.mongodb.mod.ResumeToken]]
  
  @js.native
  object Server
    extends TopLevel[
          Instantiable2[/* host */ String, /* port */ scala.Double, typings.mongodb.mod.Server]
        ]
  
}

