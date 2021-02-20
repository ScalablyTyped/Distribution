package typings.minio

import org.scalablytyped.runtime.StringDictionary
import typings.minio.minioStrings.close
import typings.minio.minioStrings.data
import typings.minio.minioStrings.end
import typings.minio.minioStrings.error
import typings.minio.minioStrings.none
import typings.minio.minioStrings.pause
import typings.minio.minioStrings.readable
import typings.minio.minioStrings.readonly
import typings.minio.minioStrings.readwrite
import typings.minio.minioStrings.resume
import typings.minio.minioStrings.writeonly
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpsMod.AgentOptions
import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minio", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(options: ClientOptions) = this()
    
    def bucketExists(bucketName: String): js.Promise[Boolean] = js.native
    def bucketExists(bucketName: String, callback: ResultCallback[Boolean]): Unit = js.native
    
    def copyObject(bucketName: String, objectName: String, sourceObject: String, conditions: CopyConditions): js.Promise[BucketItemCopy] = js.native
    def copyObject(
      bucketName: String,
      objectName: String,
      sourceObject: String,
      conditions: CopyConditions,
      callback: ResultCallback[BucketItemCopy]
    ): Unit = js.native
    
    def fGetObject(bucketName: String, objectName: String, filePath: String): js.Promise[Unit] = js.native
    def fGetObject(bucketName: String, objectName: String, filePath: String, callback: NoResultCallback): Unit = js.native
    
    def fPutObject(bucketName: String, objectName: String, filePath: String, metaData: ItemBucketMetadata): js.Promise[String] = js.native
    def fPutObject(
      bucketName: String,
      objectName: String,
      filePath: String,
      metaData: ItemBucketMetadata,
      callback: ResultCallback[String]
    ): Unit = js.native
    
    def getBucketNotification(bucketName: String): js.Promise[NotificationConfig] = js.native
    // Bucket Policy & Notification operations
    def getBucketNotification(bucketName: String, callback: ResultCallback[NotificationConfig]): Unit = js.native
    
    def getBucketPolicy(bucketName: String): js.Promise[String] = js.native
    def getBucketPolicy(bucketName: String, callback: ResultCallback[String]): Unit = js.native
    
    def getObject(bucketName: String, objectName: String): js.Promise[Readable] = js.native
    // Object operations
    def getObject(bucketName: String, objectName: String, callback: ResultCallback[Readable]): Unit = js.native
    
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
    def listIncompleteUploads(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean): BucketStream[IncompleteUploadedBucketItem] = js.native
    def listIncompleteUploads(bucketName: String, prefix: String): BucketStream[IncompleteUploadedBucketItem] = js.native
    def listIncompleteUploads(bucketName: String, prefix: String, recursive: Boolean): BucketStream[IncompleteUploadedBucketItem] = js.native
    
    def listObjects(bucketName: String): BucketStream[BucketItem] = js.native
    def listObjects(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean): BucketStream[BucketItem] = js.native
    def listObjects(bucketName: String, prefix: String): BucketStream[BucketItem] = js.native
    def listObjects(bucketName: String, prefix: String, recursive: Boolean): BucketStream[BucketItem] = js.native
    
    def listObjectsV2(bucketName: String): BucketStream[BucketItem] = js.native
    def listObjectsV2(
      bucketName: String,
      prefix: js.UndefOr[scala.Nothing],
      recursive: js.UndefOr[scala.Nothing],
      startAfter: String
    ): BucketStream[BucketItem] = js.native
    def listObjectsV2(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean): BucketStream[BucketItem] = js.native
    def listObjectsV2(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean, startAfter: String): BucketStream[BucketItem] = js.native
    def listObjectsV2(bucketName: String, prefix: String): BucketStream[BucketItem] = js.native
    def listObjectsV2(bucketName: String, prefix: String, recursive: js.UndefOr[scala.Nothing], startAfter: String): BucketStream[BucketItem] = js.native
    def listObjectsV2(bucketName: String, prefix: String, recursive: Boolean): BucketStream[BucketItem] = js.native
    def listObjectsV2(bucketName: String, prefix: String, recursive: Boolean, startAfter: String): BucketStream[BucketItem] = js.native
    
    // todo #low Specify events
    def listenBucketNotification(bucketName: String, prefix: String, suffix: String, events: js.Array[String]): EventEmitter = js.native
    
    def makeBucket(bucketName: String, region: Region): js.Promise[Unit] = js.native
    // Bucket operations
    def makeBucket(bucketName: String, region: Region, callback: NoResultCallback): Unit = js.native
    
    // Other
    def newPostPolicy(): PostPolicy = js.native
    
    def presignedGetObject(bucketName: String, objectName: String): js.Promise[String] = js.native
    def presignedGetObject(bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
    def presignedGetObject(
      bucketName: String,
      objectName: String,
      expiry: js.UndefOr[scala.Nothing],
      respHeaders: js.UndefOr[scala.Nothing],
      requestDate: Date
    ): js.Promise[String] = js.native
    def presignedGetObject(
      bucketName: String,
      objectName: String,
      expiry: js.UndefOr[scala.Nothing],
      respHeaders: StringDictionary[js.Any]
    ): js.Promise[String] = js.native
    def presignedGetObject(
      bucketName: String,
      objectName: String,
      expiry: js.UndefOr[scala.Nothing],
      respHeaders: StringDictionary[js.Any],
      requestDate: Date
    ): js.Promise[String] = js.native
    def presignedGetObject(bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
    def presignedGetObject(bucketName: String, objectName: String, expiry: Double, callback: ResultCallback[String]): Unit = js.native
    def presignedGetObject(
      bucketName: String,
      objectName: String,
      expiry: Double,
      respHeaders: js.UndefOr[scala.Nothing],
      requestDate: Date
    ): js.Promise[String] = js.native
    def presignedGetObject(bucketName: String, objectName: String, expiry: Double, respHeaders: StringDictionary[js.Any]): js.Promise[String] = js.native
    def presignedGetObject(
      bucketName: String,
      objectName: String,
      expiry: Double,
      respHeaders: StringDictionary[js.Any],
      callback: ResultCallback[String]
    ): Unit = js.native
    def presignedGetObject(
      bucketName: String,
      objectName: String,
      expiry: Double,
      respHeaders: StringDictionary[js.Any],
      requestDate: Date
    ): js.Promise[String] = js.native
    def presignedGetObject(
      bucketName: String,
      objectName: String,
      expiry: Double,
      respHeaders: StringDictionary[js.Any],
      requestDate: Date,
      callback: ResultCallback[String]
    ): Unit = js.native
    
    def presignedPostPolicy(policy: PostPolicy): js.Promise[PostPolicyResult] = js.native
    def presignedPostPolicy(policy: PostPolicy, callback: ResultCallback[PostPolicyResult]): Unit = js.native
    
    def presignedPutObject(bucketName: String, objectName: String): js.Promise[String] = js.native
    def presignedPutObject(bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
    def presignedPutObject(bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
    def presignedPutObject(bucketName: String, objectName: String, expiry: Double, callback: ResultCallback[String]): Unit = js.native
    
    def presignedUrl(httpMethod: String, bucketName: String, objectName: String): js.Promise[String] = js.native
    // Presigned operations
    def presignedUrl(httpMethod: String, bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
    def presignedUrl(
      httpMethod: String,
      bucketName: String,
      objectName: String,
      expiry: js.UndefOr[scala.Nothing],
      reqParams: js.UndefOr[scala.Nothing],
      requestDate: Date
    ): js.Promise[String] = js.native
    def presignedUrl(
      httpMethod: String,
      bucketName: String,
      objectName: String,
      expiry: js.UndefOr[scala.Nothing],
      reqParams: StringDictionary[js.Any]
    ): js.Promise[String] = js.native
    def presignedUrl(
      httpMethod: String,
      bucketName: String,
      objectName: String,
      expiry: js.UndefOr[scala.Nothing],
      reqParams: StringDictionary[js.Any],
      requestDate: Date
    ): js.Promise[String] = js.native
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
      reqParams: js.UndefOr[scala.Nothing],
      requestDate: Date
    ): js.Promise[String] = js.native
    def presignedUrl(
      httpMethod: String,
      bucketName: String,
      objectName: String,
      expiry: Double,
      reqParams: StringDictionary[js.Any]
    ): js.Promise[String] = js.native
    def presignedUrl(
      httpMethod: String,
      bucketName: String,
      objectName: String,
      expiry: Double,
      reqParams: StringDictionary[js.Any],
      callback: ResultCallback[String]
    ): Unit = js.native
    def presignedUrl(
      httpMethod: String,
      bucketName: String,
      objectName: String,
      expiry: Double,
      reqParams: StringDictionary[js.Any],
      requestDate: Date
    ): js.Promise[String] = js.native
    def presignedUrl(
      httpMethod: String,
      bucketName: String,
      objectName: String,
      expiry: Double,
      reqParams: StringDictionary[js.Any],
      requestDate: Date,
      callback: ResultCallback[String]
    ): Unit = js.native
    
    def putObject(bucketName: String, objectName: String, stream: String): js.Promise[String] = js.native
    def putObject(bucketName: String, objectName: String, stream: String, callback: ResultCallback[String]): Unit = js.native
    def putObject(bucketName: String, objectName: String, stream: String, metaData: ItemBucketMetadata): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: String,
      size: js.UndefOr[scala.Nothing],
      metaData: ItemBucketMetadata
    ): js.Promise[String] = js.native
    def putObject(bucketName: String, objectName: String, stream: String, size: Double): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: String,
      size: Double,
      callback: ResultCallback[String]
    ): Unit = js.native
    def putObject(bucketName: String, objectName: String, stream: String, size: Double, metaData: ItemBucketMetadata): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: String,
      size: Double,
      metaData: ItemBucketMetadata,
      callback: ResultCallback[String]
    ): Unit = js.native
    def putObject(bucketName: String, objectName: String, stream: Buffer): js.Promise[String] = js.native
    def putObject(bucketName: String, objectName: String, stream: Buffer, callback: ResultCallback[String]): Unit = js.native
    def putObject(bucketName: String, objectName: String, stream: Buffer, metaData: ItemBucketMetadata): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: Buffer,
      size: js.UndefOr[scala.Nothing],
      metaData: ItemBucketMetadata
    ): js.Promise[String] = js.native
    def putObject(bucketName: String, objectName: String, stream: Buffer, size: Double): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: Buffer,
      size: Double,
      callback: ResultCallback[String]
    ): Unit = js.native
    def putObject(bucketName: String, objectName: String, stream: Buffer, size: Double, metaData: ItemBucketMetadata): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: Buffer,
      size: Double,
      metaData: ItemBucketMetadata,
      callback: ResultCallback[String]
    ): Unit = js.native
    def putObject(bucketName: String, objectName: String, stream: Readable): js.Promise[String] = js.native
    def putObject(bucketName: String, objectName: String, stream: Readable, callback: ResultCallback[String]): Unit = js.native
    def putObject(bucketName: String, objectName: String, stream: Readable, metaData: ItemBucketMetadata): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: Readable,
      size: js.UndefOr[scala.Nothing],
      metaData: ItemBucketMetadata
    ): js.Promise[String] = js.native
    def putObject(bucketName: String, objectName: String, stream: Readable, size: Double): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: Readable,
      size: Double,
      callback: ResultCallback[String]
    ): Unit = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: Readable,
      size: Double,
      metaData: ItemBucketMetadata
    ): js.Promise[String] = js.native
    def putObject(
      bucketName: String,
      objectName: String,
      stream: Readable,
      size: Double,
      metaData: ItemBucketMetadata,
      callback: ResultCallback[String]
    ): Unit = js.native
    
    def removeAllBucketNotification(bucketName: String): js.Promise[Unit] = js.native
    def removeAllBucketNotification(bucketName: String, callback: NoResultCallback): Unit = js.native
    
    def removeBucket(bucketName: String): js.Promise[Unit] = js.native
    def removeBucket(bucketName: String, callback: NoResultCallback): Unit = js.native
    
    def removeIncompleteUpload(bucketName: String, objectName: String): js.Promise[Unit] = js.native
    def removeIncompleteUpload(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
    
    def removeObject(bucketName: String, objectName: String): js.Promise[Unit] = js.native
    def removeObject(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
    
    def removeObjects(bucketName: String, objectsList: js.Array[String]): js.Promise[Unit] = js.native
    def removeObjects(bucketName: String, objectsList: js.Array[String], callback: NoResultCallback): Unit = js.native
    
    def setBucketNotification(bucketName: String, bucketNotificationConfig: NotificationConfig): js.Promise[Unit] = js.native
    def setBucketNotification(bucketName: String, bucketNotificationConfig: NotificationConfig, callback: NoResultCallback): Unit = js.native
    
    def setBucketPolicy(bucketName: String, bucketPolicy: String): js.Promise[Unit] = js.native
    def setBucketPolicy(bucketName: String, bucketPolicy: String, callback: NoResultCallback): Unit = js.native
    
    def setRequestOptions(otpions: AgentOptions): Unit = js.native
    
    def statObject(bucketName: String, objectName: String): js.Promise[BucketItemStat] = js.native
    def statObject(bucketName: String, objectName: String, callback: ResultCallback[BucketItemStat]): Unit = js.native
  }
  
  @JSImport("minio", "CloudFunctionConfig")
  @js.native
  class CloudFunctionConfig protected () extends TargetConfig {
    def this(arn: String) = this()
  }
  
  @JSImport("minio", "CopyConditions")
  @js.native
  class CopyConditions () extends StObject {
    
    def setMatchETag(etag: String): Unit = js.native
    
    def setMatchETagExcept(etag: String): Unit = js.native
    
    def setModified(date: Date): Unit = js.native
    
    def setUnmodified(date: Date): Unit = js.native
  }
  
  @JSImport("minio", "NotificationConfig")
  @js.native
  class NotificationConfig () extends StObject {
    
    def add(target: CloudFunctionConfig): Unit = js.native
    def add(target: QueueConfig): Unit = js.native
    def add(target: TopicConfig): Unit = js.native
  }
  
  @JSImport("minio", "NotificationPoller")
  @js.native
  class NotificationPoller () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    // must to be public?
    def checkForChanges(): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("minio", "ObjectCreatedAll")
  @js.native
  val ObjectCreatedAll: String = js.native
  
  @JSImport("minio", "ObjectCreatedCompleteMultipartUpload")
  @js.native
  val ObjectCreatedCompleteMultipartUpload: String = js.native
  
  @JSImport("minio", "ObjectCreatedCopy")
  @js.native
  val ObjectCreatedCopy: String = js.native
  
  @JSImport("minio", "ObjectCreatedPost")
  @js.native
  val ObjectCreatedPost: String = js.native
  
  @JSImport("minio", "ObjectCreatedPut")
  @js.native
  val ObjectCreatedPut: String = js.native
  
  @JSImport("minio", "ObjectReducedRedundancyLostObject")
  @js.native
  val ObjectReducedRedundancyLostObject: String = js.native
  
  @JSImport("minio", "ObjectRemovedAll")
  @js.native
  val ObjectRemovedAll: String = js.native
  
  @JSImport("minio", "ObjectRemovedDelete")
  @js.native
  val ObjectRemovedDelete: String = js.native
  
  @JSImport("minio", "ObjectRemovedDeleteMarkerCreated")
  @js.native
  val ObjectRemovedDeleteMarkerCreated: String = js.native
  
  object Policy {
    
    @JSImport("minio", "Policy.NONE")
    @js.native
    val NONE: none = js.native
    
    @JSImport("minio", "Policy.READONLY")
    @js.native
    val READONLY: readonly = js.native
    
    @JSImport("minio", "Policy.READWRITE")
    @js.native
    val READWRITE: readwrite = js.native
    
    @JSImport("minio", "Policy.WRITEONLY")
    @js.native
    val WRITEONLY: writeonly = js.native
  }
  
  @JSImport("minio", "PostPolicy")
  @js.native
  class PostPolicy () extends StObject {
    
    def setBucket(bucketName: String): Unit = js.native
    
    def setContentLengthRange(min: Double, max: Double): Unit = js.native
    
    def setContentType(`type`: String): Unit = js.native
    
    def setExpires(date: Date): Unit = js.native
    
    def setKey(objectName: String): Unit = js.native
    
    def setKeyStartsWith(prefix: String): Unit = js.native
  }
  
  @JSImport("minio", "QueueConfig")
  @js.native
  class QueueConfig protected () extends TargetConfig {
    def this(arn: String) = this()
  }
  
  @JSImport("minio", "TargetConfig")
  @js.native
  class TargetConfig () extends StObject {
    
    def addEvent(newEvent: js.Any): Unit = js.native
    
    def addFilterPrefix(prefix: js.Any): Unit = js.native
    
    def addFilterSuffix(suffix: js.Any): Unit = js.native
    
    def setId(id: js.Any): Unit = js.native
  }
  
  @JSImport("minio", "TopicConfig")
  @js.native
  class TopicConfig protected () extends TargetConfig {
    def this(arn: String) = this()
  }
  
  @JSImport("minio", "buildARN")
  @js.native
  def buildARN(partition: String, service: String, region: String, accountId: String, resource: String): String = js.native
  
  @js.native
  trait BucketItem extends StObject {
    
    var etag: String = js.native
    
    var lastModified: Date = js.native
    
    var name: String = js.native
    
    var prefix: String = js.native
    
    var size: Double = js.native
  }
  object BucketItem {
    
    @scala.inline
    def apply(etag: String, lastModified: Date, name: String, prefix: String, size: Double): BucketItem = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketItem]
    }
    
    @scala.inline
    implicit class BucketItemMutableBuilder[Self <: BucketItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketItemCopy extends StObject {
    
    var etag: String = js.native
    
    var lastModified: Date = js.native
  }
  object BucketItemCopy {
    
    @scala.inline
    def apply(etag: String, lastModified: Date): BucketItemCopy = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketItemCopy]
    }
    
    @scala.inline
    implicit class BucketItemCopyMutableBuilder[Self <: BucketItemCopy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketItemFromList extends StObject {
    
    var creationDate: Date = js.native
    
    var name: String = js.native
  }
  object BucketItemFromList {
    
    @scala.inline
    def apply(creationDate: Date, name: String): BucketItemFromList = {
      val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketItemFromList]
    }
    
    @scala.inline
    implicit class BucketItemFromListMutableBuilder[Self <: BucketItemFromList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketItemStat extends StObject {
    
    var etag: String = js.native
    
    var lastModified: Date = js.native
    
    var metaData: ItemBucketMetadata = js.native
    
    var size: Double = js.native
  }
  object BucketItemStat {
    
    @scala.inline
    def apply(etag: String, lastModified: Date, metaData: ItemBucketMetadata, size: Double): BucketItemStat = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketItemStat]
    }
    
    @scala.inline
    implicit class BucketItemStatMutableBuilder[Self <: BucketItemStat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaData(value: ItemBucketMetadata): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketStream[T] extends Readable {
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* item */ T, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    var accessKey: String = js.native
    
    var endPoint: String = js.native
    
    var partSize: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var region: js.UndefOr[Region] = js.native
    
    var secretKey: String = js.native
    
    var sessionToken: js.UndefOr[String] = js.native
    
    var transport: js.UndefOr[js.Any] = js.native
    
    var useSSL: js.UndefOr[Boolean] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(accessKey: String, endPoint: String, secretKey: String): ClientOptions = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndPoint(value: String): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      @scala.inline
      def setTransport(value: js.Any): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setUseSSL(value: Boolean): Self = StObject.set(x, "useSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSSLUndefined: Self = StObject.set(x, "useSSL", js.undefined)
    }
  }
  
  @js.native
  trait IncompleteUploadedBucketItem extends StObject {
    
    var key: String = js.native
    
    var size: Double = js.native
    
    var uploadId: String = js.native
  }
  object IncompleteUploadedBucketItem {
    
    @scala.inline
    def apply(key: String, size: Double, uploadId: String): IncompleteUploadedBucketItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncompleteUploadedBucketItem]
    }
    
    @scala.inline
    implicit class IncompleteUploadedBucketItemMutableBuilder[Self <: IncompleteUploadedBucketItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    }
  }
  
  type ItemBucketMetadata = StringDictionary[js.Any]
  
  type NoResultCallback = js.Function1[/* error */ Error | Null, Unit]
  
  @js.native
  trait PostPolicyResult extends StObject {
    
    var formData: StringDictionary[js.Any] = js.native
    
    var postURL: String = js.native
  }
  object PostPolicyResult {
    
    @scala.inline
    def apply(formData: StringDictionary[js.Any], postURL: String): PostPolicyResult = {
      val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], postURL = postURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostPolicyResult]
    }
    
    @scala.inline
    implicit class PostPolicyResultMutableBuilder[Self <: PostPolicyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormData(value: StringDictionary[js.Any]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostURL(value: String): Self = StObject.set(x, "postURL", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.minio.minioStrings.`us-east-1`
    - typings.minio.minioStrings.`us-west-1`
    - typings.minio.minioStrings.`us-west-2`
    - typings.minio.minioStrings.`eu-west-1`
    - typings.minio.minioStrings.`eu-central-1`
    - typings.minio.minioStrings.`ap-southeast-1`
    - typings.minio.minioStrings.`ap-northeast-1`
    - typings.minio.minioStrings.`ap-southeast-2`
    - typings.minio.minioStrings.`sa-east-1`
    - typings.minio.minioStrings.`cn-north-1`
    - java.lang.String
  */
  type Region = _Region | String
  
  type ResultCallback[T] = js.Function2[/* error */ Error | Null, /* result */ T, Unit]
  
  trait _Region extends StObject
}
