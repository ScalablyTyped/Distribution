package typings.minio.mod

import org.scalablytyped.runtime.StringDictionary
import typings.minio.anon.ListObjectsV2WithMetadata
import typings.node.bufferMod.global.Buffer
import typings.node.httpsMod.RequestOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "Client")
@js.native
open class Client protected () extends StObject {
  def this(options: ClientOptions) = this()
  
  def bucketExists(bucketName: String): js.Promise[Boolean] = js.native
  def bucketExists(bucketName: String, callback: ResultCallback[Boolean]): Unit = js.native
  
  def composeObject(destObjConfig: CopyDestinationOptions, sourceObjList: js.Array[CopySourceOptions]): js.Promise[SourceObjectStats] = js.native
  def composeObject(
    destObjConfig: CopyDestinationOptions,
    sourceObjList: js.Array[CopySourceOptions],
    callback: ResultCallback[SourceObjectStats]
  ): Unit = js.native
  
  def copyObject(bucketName: String, objectName: String, sourceObject: String, conditions: CopyConditions): js.Promise[BucketItemCopy] = js.native
  def copyObject(
    bucketName: String,
    objectName: String,
    sourceObject: String,
    conditions: CopyConditions,
    callback: ResultCallback[BucketItemCopy]
  ): Unit = js.native
  
  // Minio extensions that aren't necessary present for Amazon S3 compatible storage servers
  var extensions: ListObjectsV2WithMetadata = js.native
  
  def fGetObject(bucketName: String, objectName: String, filePath: String): js.Promise[Unit] = js.native
  def fGetObject(bucketName: String, objectName: String, filePath: String, callback: NoResultCallback): Unit = js.native
  
  def fPutObject(bucketName: String, objectName: String, filePath: String): js.Promise[UploadedObjectInfo] = js.native
  def fPutObject(bucketName: String, objectName: String, filePath: String, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def fPutObject(
    bucketName: String,
    objectName: String,
    filePath: String,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  
  def getBucketEncryption(bucketName: String): js.Promise[Encryption] = js.native
  def getBucketEncryption(bucketName: String, callback: ResultCallback[Encryption]): Unit = js.native
  
  def getBucketLifecycle(bucketName: String): js.Promise[Lifecycle] = js.native
  def getBucketLifecycle(bucketName: String, callback: ResultCallback[Lifecycle]): Unit = js.native
  
  def getBucketNotification(bucketName: String): js.Promise[NotificationConfig] = js.native
  // Bucket Policy & Notification operations
  def getBucketNotification(bucketName: String, callback: ResultCallback[NotificationConfig]): Unit = js.native
  
  def getBucketPolicy(bucketName: String): js.Promise[String] = js.native
  def getBucketPolicy(bucketName: String, callback: ResultCallback[String]): Unit = js.native
  
  def getBucketReplication(bucketName: String): js.Promise[ReplicationConfig] = js.native
  def getBucketReplication(bucketName: String, callback: ResultCallback[ReplicationConfig]): Unit = js.native
  
  def getBucketTagging(bucketName: String): js.Promise[js.Array[Tag]] = js.native
  def getBucketTagging(bucketName: String, callback: ResultCallback[js.Array[Tag]]): Unit = js.native
  
  def getBucketVersioning(bucketName: String): js.Promise[VersioningConfig] = js.native
  def getBucketVersioning(bucketName: String, callback: ResultCallback[VersioningConfig]): Unit = js.native
  
  def getObject(bucketName: String, objectName: String): js.Promise[Readable] = js.native
  // Object operations
  def getObject(bucketName: String, objectName: String, callback: ResultCallback[Readable]): Unit = js.native
  
  def getObjectLegalHold(bucketName: String, objectName: String): js.Promise[LegalHoldOptions] = js.native
  def getObjectLegalHold(bucketName: String, objectName: String, callback: ResultCallback[LegalHoldOptions]): Unit = js.native
  def getObjectLegalHold(bucketName: String, objectName: String, getOptions: VersionIdentificator): js.Promise[LegalHoldOptions] = js.native
  def getObjectLegalHold(
    bucketName: String,
    objectName: String,
    getOptions: VersionIdentificator,
    callback: ResultCallback[LegalHoldOptions]
  ): Unit = js.native
  
  def getObjectLockConfig(bucketName: String): js.Promise[Lock] = js.native
  def getObjectLockConfig(bucketName: String, callback: ResultCallback[Lock]): Unit = js.native
  
  def getObjectRetention(bucketName: String, objectName: String, options: VersionIdentificator): js.Promise[Retention] = js.native
  def getObjectRetention(
    bucketName: String,
    objectName: String,
    options: VersionIdentificator,
    callback: ResultCallback[Retention]
  ): Unit = js.native
  
  def getObjectTagging(bucketName: String, objectName: String): js.Promise[js.Array[Tag]] = js.native
  def getObjectTagging(bucketName: String, objectName: String, callback: ResultCallback[js.Array[Tag]]): Unit = js.native
  def getObjectTagging(bucketName: String, objectName: String, getOptions: VersionIdentificator): js.Promise[js.Array[Tag]] = js.native
  def getObjectTagging(
    bucketName: String,
    objectName: String,
    getOptions: VersionIdentificator,
    callback: ResultCallback[js.Array[Tag]]
  ): Unit = js.native
  
  def getPartialObject(bucketName: String, objectName: String, offset: Double): js.Promise[Readable] = js.native
  def getPartialObject(bucketName: String, objectName: String, offset: Double, callback: ResultCallback[Readable]): Unit = js.native
  def getPartialObject(bucketName: String, objectName: String, offset: Double, length: Double): js.Promise[Readable] = js.native
  def getPartialObject(
    bucketName: String,
    objectName: String,
    offset: Double,
    length: Double,
    callback: ResultCallback[Readable]
  ): Unit = js.native
  
  def listBuckets(): js.Promise[js.Array[BucketItemFromList]] = js.native
  def listBuckets(callback: ResultCallback[js.Array[BucketItemFromList]]): Unit = js.native
  
  def listIncompleteUploads(bucketName: String): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: String, prefix: String): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: String, prefix: String, recursive: Boolean): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: String, prefix: Unit, recursive: Boolean): BucketStream[IncompleteUploadedBucketItem] = js.native
  
  def listObjects(bucketName: String): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: String, prefix: String): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: String, prefix: String, recursive: Boolean): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: String, prefix: Unit, recursive: Boolean): BucketStream[BucketItem] = js.native
  
  def listObjectsV2(bucketName: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String, recursive: Boolean): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String, recursive: Boolean, startAfter: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String, recursive: Unit, startAfter: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: Unit, recursive: Boolean): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: Unit, recursive: Boolean, startAfter: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: Unit, recursive: Unit, startAfter: String): BucketStream[BucketItem] = js.native
  
  def listenBucketNotification(bucketName: String, prefix: String, suffix: String, events: js.Array[NotificationEvent]): NotificationPoller = js.native
  
  def makeBucket(bucketName: String): js.Promise[Unit] = js.native
  def makeBucket(bucketName: String, callback: NoResultCallback): Unit = js.native
  def makeBucket(bucketName: String, region: Unit, makeOpts: MakeBucketOpt): js.Promise[Unit] = js.native
  def makeBucket(bucketName: String, region: Region): js.Promise[Unit] = js.native
  def makeBucket(bucketName: String, region: Region, callback: NoResultCallback): Unit = js.native
  def makeBucket(bucketName: String, region: Region, makeOpts: MakeBucketOpt): js.Promise[Unit] = js.native
  // Bucket operations
  def makeBucket(bucketName: String, region: Region, makeOpts: MakeBucketOpt, callback: NoResultCallback): Unit = js.native
  
  // Other
  def newPostPolicy(): PostPolicy = js.native
  
  def presignedGetObject(bucketName: String, objectName: String): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Double, callback: ResultCallback[String]): Unit = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Double, respHeaders: StringDictionary[Any]): js.Promise[String] = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Double,
    respHeaders: StringDictionary[Any],
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Double,
    respHeaders: StringDictionary[Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Double,
    respHeaders: StringDictionary[Any],
    requestDate: js.Date,
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Double, respHeaders: Unit, requestDate: js.Date): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Unit, respHeaders: StringDictionary[Any]): js.Promise[String] = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Unit,
    respHeaders: StringDictionary[Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Unit, respHeaders: Unit, requestDate: js.Date): js.Promise[String] = js.native
  
  def presignedPostPolicy(policy: PostPolicy): js.Promise[PostPolicyResult] = js.native
  def presignedPostPolicy(policy: PostPolicy, callback: ResultCallback[PostPolicyResult]): Unit = js.native
  
  def presignedPutObject(bucketName: String, objectName: String): js.Promise[String] = js.native
  def presignedPutObject(bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
  def presignedPutObject(bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
  def presignedPutObject(bucketName: String, objectName: String, expiry: Double, callback: ResultCallback[String]): Unit = js.native
  
  def presignedUrl(httpMethod: String, bucketName: String, objectName: String): js.Promise[String] = js.native
  // Presigned operations
  def presignedUrl(httpMethod: String, bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
  def presignedUrl(httpMethod: String, bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[Any]
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[Any],
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[Any],
    requestDate: js.Date,
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: Unit,
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Unit,
    reqParams: StringDictionary[Any]
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Unit,
    reqParams: StringDictionary[Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Unit,
    reqParams: Unit,
    requestDate: js.Date
  ): js.Promise[String] = js.native
  
  def putObject(bucketName: String, objectName: String, stream: String): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: String,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: String, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def putObject(bucketName: String, objectName: String, stream: String, size: Double): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: String,
    size: Double,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: String, size: Double, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: String,
    size: Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: String, size: Unit, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Buffer,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, size: Double): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Buffer,
    size: Double,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, size: Double, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Buffer,
    size: Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, size: Unit, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable, size: Double): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    size: Double,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    size: Double,
    metaData: ItemBucketMetadata
  ): js.Promise[UploadedObjectInfo] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    size: Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[UploadedObjectInfo]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable, size: Unit, metaData: ItemBucketMetadata): js.Promise[UploadedObjectInfo] = js.native
  
  def putObjectRetention(bucketName: String, objectName: String): js.Promise[Unit] = js.native
  def putObjectRetention(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
  def putObjectRetention(bucketName: String, objectName: String, retentionOptions: Retention): js.Promise[Unit] = js.native
  def putObjectRetention(bucketName: String, objectName: String, retentionOptions: Retention, callback: NoResultCallback): Unit = js.native
  
  /**
    * @deprecated Use setObjectTagging instead.
    */
  def putObjectTagging(bucketName: String, objectName: String, tags: TagList): js.Promise[Unit] = js.native
  // It seems, putObjectTagging is deprecated in favor or setObjectTagging - there is no such a method in the library source code
  /**
    * @deprecated Use setObjectTagging instead.
    */
  def putObjectTagging(bucketName: String, objectName: String, tags: TagList, callback: NoResultCallback): Unit = js.native
  def putObjectTagging(bucketName: String, objectName: String, tags: TagList, putOptions: VersionIdentificator): js.Promise[Unit] = js.native
  /**
    * @deprecated Use setObjectTagging instead.
    */
  def putObjectTagging(
    bucketName: String,
    objectName: String,
    tags: TagList,
    putOptions: VersionIdentificator,
    callback: NoResultCallback
  ): Unit = js.native
  
  def removeAllBucketNotification(bucketName: String): js.Promise[Unit] = js.native
  def removeAllBucketNotification(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeBucket(bucketName: String): js.Promise[Unit] = js.native
  def removeBucket(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeBucketEncryption(bucketName: String): js.Promise[Unit] = js.native
  def removeBucketEncryption(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeBucketLifecycle(bucketName: String): js.Promise[Unit] = js.native
  def removeBucketLifecycle(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeBucketReplication(bucketName: String): js.Promise[Unit] = js.native
  def removeBucketReplication(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeBucketTagging(bucketName: String): js.Promise[Unit] = js.native
  def removeBucketTagging(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeIncompleteUpload(bucketName: String, objectName: String): js.Promise[Unit] = js.native
  def removeIncompleteUpload(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
  
  def removeObject(bucketName: String, objectName: String): js.Promise[Unit] = js.native
  def removeObject(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
  def removeObject(bucketName: String, objectName: String, removeOpts: RemoveOptions): js.Promise[Unit] = js.native
  def removeObject(bucketName: String, objectName: String, removeOpts: RemoveOptions, callback: NoResultCallback): Unit = js.native
  
  def removeObjectTagging(bucketName: String, objectName: String): js.Promise[Unit] = js.native
  def removeObjectTagging(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
  def removeObjectTagging(bucketName: String, objectName: String, removeOptions: VersionIdentificator): js.Promise[Unit] = js.native
  def removeObjectTagging(
    bucketName: String,
    objectName: String,
    removeOptions: VersionIdentificator,
    callback: NoResultCallback
  ): Unit = js.native
  
  def removeObjects(bucketName: String, objectsList: js.Array[String]): js.Promise[Unit] = js.native
  def removeObjects(bucketName: String, objectsList: js.Array[String], callback: NoResultCallback): Unit = js.native
  
  def selectObjectContent(bucketName: String, objectName: String, selectOpts: SelectOptions): js.Promise[Unit] = js.native
  def selectObjectContent(bucketName: String, objectName: String, selectOpts: SelectOptions, callback: NoResultCallback): Unit = js.native
  
  def setBucketEncryption(bucketName: String, encryptionConfig: Encryption): js.Promise[Unit] = js.native
  def setBucketEncryption(bucketName: String, encryptionConfig: Encryption, callback: NoResultCallback): Unit = js.native
  
  def setBucketLifecycle(bucketName: String, lifecycleConfig: Lifecycle): js.Promise[Unit] = js.native
  def setBucketLifecycle(bucketName: String, lifecycleConfig: Lifecycle, callback: NoResultCallback): Unit = js.native
  
  def setBucketNotification(bucketName: String, bucketNotificationConfig: NotificationConfig): js.Promise[Unit] = js.native
  def setBucketNotification(bucketName: String, bucketNotificationConfig: NotificationConfig, callback: NoResultCallback): Unit = js.native
  
  def setBucketPolicy(bucketName: String, bucketPolicy: String): js.Promise[Unit] = js.native
  def setBucketPolicy(bucketName: String, bucketPolicy: String, callback: NoResultCallback): Unit = js.native
  
  def setBucketReplication(bucketName: String, replicationConfig: ReplicationConfig): js.Promise[Unit] = js.native
  def setBucketReplication(bucketName: String, replicationConfig: ReplicationConfig, callback: NoResultCallback): Unit = js.native
  
  def setBucketTagging(bucketName: String, tags: TagList): js.Promise[Unit] = js.native
  def setBucketTagging(bucketName: String, tags: TagList, callback: NoResultCallback): Unit = js.native
  
  def setBucketVersioning(bucketName: String, versioningConfig: Any): js.Promise[Unit] = js.native
  def setBucketVersioning(bucketName: String, versioningConfig: Any, callback: NoResultCallback): Unit = js.native
  
  def setObjectLegalHold(bucketName: String, objectName: String): js.Promise[Unit] = js.native
  def setObjectLegalHold(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
  def setObjectLegalHold(bucketName: String, objectName: String, setOptions: LegalHoldOptions): js.Promise[Unit] = js.native
  def setObjectLegalHold(bucketName: String, objectName: String, setOptions: LegalHoldOptions, callback: NoResultCallback): Unit = js.native
  
  def setObjectLockConfig(bucketName: String): js.Promise[Unit] = js.native
  def setObjectLockConfig(bucketName: String, callback: NoResultCallback): Unit = js.native
  def setObjectLockConfig(bucketName: String, lockConfig: Lock): js.Promise[Unit] = js.native
  def setObjectLockConfig(bucketName: String, lockConfig: Lock, callback: NoResultCallback): Unit = js.native
  
  def setObjectTagging(bucketName: String, objectName: String, tags: TagList): js.Promise[Unit] = js.native
  def setObjectTagging(bucketName: String, objectName: String, tags: TagList, callback: NoResultCallback): Unit = js.native
  def setObjectTagging(bucketName: String, objectName: String, tags: TagList, putOptions: VersionIdentificator): js.Promise[Unit] = js.native
  def setObjectTagging(
    bucketName: String,
    objectName: String,
    tags: TagList,
    putOptions: VersionIdentificator,
    callback: NoResultCallback
  ): Unit = js.native
  
  def setRequestOptions(options: RequestOptions): Unit = js.native
  
  // Custom Settings
  def setS3TransferAccelerate(endpoint: String): Unit = js.native
  
  def statObject(bucketName: String, objectName: String): js.Promise[BucketItemStat] = js.native
  def statObject(bucketName: String, objectName: String, callback: ResultCallback[BucketItemStat]): Unit = js.native
}
