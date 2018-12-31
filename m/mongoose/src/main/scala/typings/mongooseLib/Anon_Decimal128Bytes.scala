package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Decimal128Bytes extends js.Object {
  var AggregationCursor: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.AggregationCursor[mongodbLib.Default]] = js.native
  var Binary: org.scalablytyped.runtime.Instantiable1[/* buffer */ nodeLib.Buffer, mongodbLib.mongodbMod.Binary] = js.native
  var ChangeStream: org.scalablytyped.runtime.Instantiable2[
    /* changeDomain */ mongodbLib.mongodbMod.Db, 
    /* pipeline */ js.Array[js.Object], 
    mongodbLib.mongodbMod.ChangeStream
  ] = js.native
  var Code: org.scalablytyped.runtime.Instantiable1[/* code */ java.lang.String, mongodbLib.mongodbMod.Code] = js.native
  var CommandCursor: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.CommandCursor] = js.native
  var Cursor: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.Cursor[mongodbLib.Default]] = js.native
  var DBRef: org.scalablytyped.runtime.Instantiable2[
    /* namespace */ java.lang.String, 
    /* oid */ bsonLib.bsonMod.ObjectID, 
    mongodbLib.mongodbMod.DBRef
  ] = js.native
  var Db: org.scalablytyped.runtime.Instantiable2[
    /* databaseName */ java.lang.String, 
    /* serverConfig */ mongodbLib.mongodbMod.Server, 
    mongodbLib.mongodbMod.Db
  ] = js.native
  var Decimal128: org.scalablytyped.runtime.Instantiable1[/* bytes */ nodeLib.Buffer, mongodbLib.mongodbMod.Decimal128] = js.native
  var Double: org.scalablytyped.runtime.Instantiable1[/* value */ scala.Double, mongodbLib.mongodbMod.Double] = js.native
  var GridFSBucket: org.scalablytyped.runtime.Instantiable1[/* db */ mongodbLib.mongodbMod.Db, mongodbLib.mongodbMod.GridFSBucket] = js.native
  var GridFSBucketReadStream: org.scalablytyped.runtime.Instantiable4[
    /* chunks */ mongodbLib.mongodbMod.Collection[js.Any], 
    /* files */ mongodbLib.mongodbMod.Collection[js.Any], 
    /* readPreference */ js.Object, 
    /* filter */ js.Object, 
    mongodbLib.mongodbMod.GridFSBucketReadStream
  ] = js.native
  var GridFSBucketWriteStream: org.scalablytyped.runtime.Instantiable2[
    /* bucket */ mongodbLib.mongodbMod.GridFSBucket, 
    /* filename */ java.lang.String, 
    mongodbLib.mongodbMod.GridFSBucketWriteStream
  ] = js.native
  var Logger: org.scalablytyped.runtime.Instantiable1[/* className */ java.lang.String, mongodbLib.mongodbMod.Logger] = js.native
  var Long: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.Long] = js.native
  var MaxKey: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.MaxKey] = js.native
  var MinKey: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.MinKey] = js.native
  var MongoClient: org.scalablytyped.runtime.Instantiable1[/* uri */ java.lang.String, mongodbLib.mongodbMod.MongoClient] = js.native
  var MongoError: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, mongodbLib.mongodbMod.MongoError] = js.native
  var Mongos: org.scalablytyped.runtime.Instantiable1[/* servers */ js.Array[mongodbLib.mongodbMod.Server], mongodbLib.mongodbMod.Mongos] = js.native
  var ObjectID: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.ObjectID] = js.native
  var ObjectId: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.ObjectId] = js.native
  var ReadPreference: org.scalablytyped.runtime.Instantiable2[
    /* mode */ java.lang.String, 
    /* tags */ js.Object, 
    mongodbLib.mongodbMod.ReadPreference
  ] = js.native
  var ReplSet: org.scalablytyped.runtime.Instantiable1[
    /* servers */ js.Array[mongodbLib.mongodbMod.Server], 
    mongodbLib.mongodbMod.ReplSet
  ] = js.native
  var Server: org.scalablytyped.runtime.Instantiable2[/* host */ java.lang.String, /* port */ scala.Double, mongodbLib.mongodbMod.Server] = js.native
  var Timestamp: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.Timestamp] = js.native
  def connect(uri: java.lang.String): js.Promise[mongodbLib.mongodbMod.MongoClient] = js.native
  def connect(
    uri: java.lang.String,
    callback: mongodbLib.mongodbMod.MongoCallback[mongodbLib.mongodbMod.MongoClient]
  ): scala.Unit = js.native
  def connect(uri: java.lang.String, options: mongodbLib.mongodbMod.MongoClientOptions): js.Promise[mongodbLib.mongodbMod.MongoClient] = js.native
  def connect(
    uri: java.lang.String,
    options: mongodbLib.mongodbMod.MongoClientOptions,
    callback: mongodbLib.mongodbMod.MongoCallback[mongodbLib.mongodbMod.MongoClient]
  ): scala.Unit = js.native
}

