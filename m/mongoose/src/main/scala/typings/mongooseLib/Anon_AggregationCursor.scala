package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AggregationCursor extends js.Object {
  var AggregationCursor: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.AggregationCursor[js.Object]] = js.native
  var Binary: Anon_Buffer = js.native
  var ChangeStream: org.scalablytyped.runtime.Instantiable2[
    /* changeDomain */ mongodbLib.mongodbMod.Db, 
    /* pipeline */ js.Array[js.Object], 
    mongodbLib.mongodbMod.ChangeStream
  ] = js.native
  var Code: org.scalablytyped.runtime.Instantiable1[/* code */ java.lang.String, mongodbLib.mongodbMod.Code] = js.native
  var CommandCursor: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.CommandCursor] = js.native
  var Cursor: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.Cursor[js.Object]] = js.native
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
  var Decimal128: Anon_Bytes = js.native
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
  var Logger: Anon_ClassName = js.native
  var Long: Anon_FromBits = js.native
  var MaxKey: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.MaxKey] = js.native
  var MinKey: org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.MinKey] = js.native
  var MongoClient: Anon_Callback = js.native
  var MongoError: Anon_Create = js.native
  var Mongos: org.scalablytyped.runtime.Instantiable1[/* servers */ js.Array[mongodbLib.mongodbMod.Server], mongodbLib.mongodbMod.Mongos] = js.native
  var ObjectID: Anon_CacheHexString = js.native
  var ObjectId: Anon_CacheHexStringCreateFromHexString = js.native
  var ReadPreference: Anon_IsValid = js.native
  var ReplSet: org.scalablytyped.runtime.Instantiable1[
    /* servers */ js.Array[mongodbLib.mongodbMod.Server], 
    mongodbLib.mongodbMod.ReplSet
  ] = js.native
  var Server: org.scalablytyped.runtime.Instantiable2[/* host */ java.lang.String, /* port */ scala.Double, mongodbLib.mongodbMod.Server] = js.native
  var Timestamp: Anon_FromBitsFromInt = js.native
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

