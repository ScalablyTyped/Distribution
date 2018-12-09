package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "Client")
@js.native
class Client protected () extends js.Object {
  def this(options: ClientOptions) = this()
  def bucketExists(bucketName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def bucketExists(bucketName: java.lang.String, callback: ResultCallback[scala.Boolean]): scala.Unit = js.native
  def copyObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    sourceObject: java.lang.String,
    conditions: CopyConditions
  ): js.Promise[BucketItemCopy] = js.native
  def copyObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    sourceObject: java.lang.String,
    conditions: CopyConditions,
    callback: ResultCallback[BucketItemCopy]
  ): scala.Unit = js.native
  def fGetObject(bucketName: java.lang.String, objectName: java.lang.String, filePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def fGetObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    filePath: java.lang.String,
    callback: NoResultCallback
  ): scala.Unit = js.native
  def fPutObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    filePath: java.lang.String,
    metaData: ItemBucketMetadata
  ): js.Promise[java.lang.String] = js.native
  def fPutObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    filePath: java.lang.String,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def getBucketNotification(bucketName: java.lang.String): js.Promise[NotificationConfig] = js.native
  // Bucket Policy & Notification operations
  def getBucketNotification(bucketName: java.lang.String, callback: ResultCallback[NotificationConfig]): scala.Unit = js.native
  def getBucketPolicy(bucketName: java.lang.String): js.Promise[java.lang.String] = js.native
  def getBucketPolicy(bucketName: java.lang.String, callback: ResultCallback[java.lang.String]): scala.Unit = js.native
  def getObject(bucketName: java.lang.String, objectName: java.lang.String): js.Promise[nodeLib.streamMod.Stream] = js.native
  // Object operations
  def getObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    callback: ResultCallback[nodeLib.streamMod.Stream]
  ): scala.Unit = js.native
  def getPartialObject(bucketName: java.lang.String, objectName: java.lang.String, offset: scala.Double): js.Promise[nodeLib.streamMod.Stream] = js.native
  def getPartialObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    offset: scala.Double,
    callback: ResultCallback[nodeLib.streamMod.Stream]
  ): scala.Unit = js.native
  def getPartialObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    offset: scala.Double,
    length: scala.Double
  ): js.Promise[nodeLib.streamMod.Stream] = js.native
  def getPartialObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    callback: ResultCallback[nodeLib.streamMod.Stream]
  ): scala.Unit = js.native
  def listBuckets(): js.Promise[js.Array[BucketItemFromList]] = js.native
  def listBuckets(callback: ResultCallback[js.Array[BucketItemFromList]]): scala.Unit = js.native
  def listIncompleteUploads(bucketName: java.lang.String): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: java.lang.String, prefix: java.lang.String): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: java.lang.String, prefix: java.lang.String, recursive: scala.Boolean): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listObjects(bucketName: java.lang.String): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: java.lang.String, prefix: java.lang.String): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: java.lang.String, prefix: java.lang.String, recursive: scala.Boolean): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: java.lang.String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: java.lang.String, prefix: java.lang.String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: java.lang.String, prefix: java.lang.String, recursive: scala.Boolean): BucketStream[BucketItem] = js.native
  // todo #low Specify events
  def listenBucketNotification(
    bucketName: java.lang.String,
    prefix: java.lang.String,
    suffix: java.lang.String,
    events: js.Array[java.lang.String]
  ): nodeLib.NodeJSNs.EventEmitter = js.native
  def makeBucket(bucketName: java.lang.String, region: Region): js.Promise[scala.Unit] = js.native
  // Bucket operations
  def makeBucket(bucketName: java.lang.String, region: Region, callback: NoResultCallback): scala.Unit = js.native
  // Other
  def newPostPolicy(): PostPolicy = js.native
  def presignedGetObject(bucketName: java.lang.String, objectName: java.lang.String): js.Promise[java.lang.String] = js.native
  def presignedGetObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def presignedGetObject(bucketName: java.lang.String, objectName: java.lang.String, expiry: scala.Double): js.Promise[java.lang.String] = js.native
  def presignedGetObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    expiry: scala.Double,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def presignedPostPolicy(policy: PostPolicy): js.Promise[PostPolicyResult] = js.native
  def presignedPostPolicy(policy: PostPolicy, callback: ResultCallback[PostPolicyResult]): scala.Unit = js.native
  def presignedPutObject(bucketName: java.lang.String, objectName: java.lang.String): js.Promise[java.lang.String] = js.native
  def presignedPutObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def presignedPutObject(bucketName: java.lang.String, objectName: java.lang.String, expiry: scala.Double): js.Promise[java.lang.String] = js.native
  def presignedPutObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    expiry: scala.Double,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def presignedUrl(httpMethod: java.lang.String, bucketName: java.lang.String, objectName: java.lang.String): js.Promise[java.lang.String] = js.native
  // Presigned operations
  def presignedUrl(
    httpMethod: java.lang.String,
    bucketName: java.lang.String,
    objectName: java.lang.String,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def presignedUrl(
    httpMethod: java.lang.String,
    bucketName: java.lang.String,
    objectName: java.lang.String,
    expiry: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def presignedUrl(
    httpMethod: java.lang.String,
    bucketName: java.lang.String,
    objectName: java.lang.String,
    expiry: scala.Double,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def presignedUrl(
    httpMethod: java.lang.String,
    bucketName: java.lang.String,
    objectName: java.lang.String,
    expiry: scala.Double,
    reqParams: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Promise[java.lang.String] = js.native
  def presignedUrl(
    httpMethod: java.lang.String,
    bucketName: java.lang.String,
    objectName: java.lang.String,
    expiry: scala.Double,
    reqParams: ScalablyTyped.runtime.StringDictionary[js.Any],
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(bucketName: java.lang.String, objectName: java.lang.String, stream: java.lang.String): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: java.lang.String,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: java.lang.String,
    size: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: java.lang.String,
    size: scala.Double,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: java.lang.String,
    size: scala.Double,
    metaData: ItemBucketMetadata
  ): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: java.lang.String,
    size: scala.Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(bucketName: java.lang.String, objectName: java.lang.String, stream: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.Buffer,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.Buffer,
    size: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.Buffer,
    size: scala.Double,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.Buffer,
    size: scala.Double,
    metaData: ItemBucketMetadata
  ): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.Buffer,
    size: scala.Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(bucketName: java.lang.String, objectName: java.lang.String, stream: nodeLib.streamMod.Stream): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    size: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    size: scala.Double,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    size: scala.Double,
    metaData: ItemBucketMetadata
  ): js.Promise[java.lang.String] = js.native
  def putObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    size: scala.Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[java.lang.String]
  ): scala.Unit = js.native
  def removeAllBucketNotification(bucketName: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeAllBucketNotification(bucketName: java.lang.String, callback: NoResultCallback): scala.Unit = js.native
  def removeBucket(bucketName: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeBucket(bucketName: java.lang.String, callback: NoResultCallback): scala.Unit = js.native
  def removeIncompleteUpload(bucketName: java.lang.String, objectName: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeIncompleteUpload(bucketName: java.lang.String, objectName: java.lang.String, callback: NoResultCallback): scala.Unit = js.native
  def removeObject(bucketName: java.lang.String, objectName: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeObject(bucketName: java.lang.String, objectName: java.lang.String, callback: NoResultCallback): scala.Unit = js.native
  def removeObjects(bucketName: java.lang.String, objectsList: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def removeObjects(bucketName: java.lang.String, objectsList: js.Array[java.lang.String], callback: NoResultCallback): scala.Unit = js.native
  def setBucketNotification(bucketName: java.lang.String, bucketNotificationConfig: NotificationConfig): js.Promise[scala.Unit] = js.native
  def setBucketNotification(
    bucketName: java.lang.String,
    bucketNotificationConfig: NotificationConfig,
    callback: NoResultCallback
  ): scala.Unit = js.native
  def setBucketPolicy(bucketName: java.lang.String, bucketPolicy: java.lang.String): js.Promise[scala.Unit] = js.native
  def setBucketPolicy(bucketName: java.lang.String, bucketPolicy: java.lang.String, callback: NoResultCallback): scala.Unit = js.native
  def statObject(bucketName: java.lang.String, objectName: java.lang.String): js.Promise[BucketItemStat] = js.native
  def statObject(
    bucketName: java.lang.String,
    objectName: java.lang.String,
    callback: ResultCallback[BucketItemStat]
  ): scala.Unit = js.native
}

