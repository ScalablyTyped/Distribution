package typings.minio

import typings.minio.mod.LegalHoldStatus
import typings.minio.mod.LockUnit
import typings.minio.mod.Mode
import typings.minio.mod._Lifecycle
import typings.minio.mod._NotificationEvent
import typings.minio.mod._Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minioStrings {
  
  @js.native
  sealed trait BZIP2 extends StObject
  inline def BZIP2: BZIP2 = "BZIP2".asInstanceOf[BZIP2]
  
  @js.native
  sealed trait COMPLIANCE
    extends StObject
       with Mode
  inline def COMPLIANCE: COMPLIANCE = "COMPLIANCE".asInstanceOf[COMPLIANCE]
  
  @js.native
  sealed trait DOCUMENT extends StObject
  inline def DOCUMENT: DOCUMENT = "DOCUMENT".asInstanceOf[DOCUMENT]
  
  @js.native
  sealed trait Days
    extends StObject
       with LockUnit
  inline def Days: Days = "Days".asInstanceOf[Days]
  
  @js.native
  sealed trait GOVERNANCE
    extends StObject
       with Mode
  inline def GOVERNANCE: GOVERNANCE = "GOVERNANCE".asInstanceOf[GOVERNANCE]
  
  @js.native
  sealed trait GZIP extends StObject
  inline def GZIP: GZIP = "GZIP".asInstanceOf[GZIP]
  
  @js.native
  sealed trait IGNORE extends StObject
  inline def IGNORE: IGNORE = "IGNORE".asInstanceOf[IGNORE]
  
  @js.native
  sealed trait LINES extends StObject
  inline def LINES: LINES = "LINES".asInstanceOf[LINES]
  
  @js.native
  sealed trait NONE extends StObject
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait OFF
    extends StObject
       with LegalHoldStatus
  inline def OFF: OFF = "OFF".asInstanceOf[OFF]
  
  @js.native
  sealed trait ON
    extends StObject
       with LegalHoldStatus
  inline def ON: ON = "ON".asInstanceOf[ON]
  
  @js.native
  sealed trait USE extends StObject
  inline def USE: USE = "USE".asInstanceOf[USE]
  
  @js.native
  sealed trait Years
    extends StObject
       with LockUnit
  inline def Years: Years = "Years".asInstanceOf[Years]
  
  @js.native
  sealed trait _empty
    extends StObject
       with _Lifecycle
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `ap-northeast-1`
    extends StObject
       with _Region
  inline def `ap-northeast-1`: `ap-northeast-1` = "ap-northeast-1".asInstanceOf[`ap-northeast-1`]
  
  @js.native
  sealed trait `ap-southeast-1`
    extends StObject
       with _Region
  inline def `ap-southeast-1`: `ap-southeast-1` = "ap-southeast-1".asInstanceOf[`ap-southeast-1`]
  
  @js.native
  sealed trait `ap-southeast-2`
    extends StObject
       with _Region
  inline def `ap-southeast-2`: `ap-southeast-2` = "ap-southeast-2".asInstanceOf[`ap-southeast-2`]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait `cn-north-1`
    extends StObject
       with _Region
  inline def `cn-north-1`: `cn-north-1` = "cn-north-1".asInstanceOf[`cn-north-1`]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait `eu-central-1`
    extends StObject
       with _Region
  inline def `eu-central-1`: `eu-central-1` = "eu-central-1".asInstanceOf[`eu-central-1`]
  
  @js.native
  sealed trait `eu-west-1`
    extends StObject
       with _Region
  inline def `eu-west-1`: `eu-west-1` = "eu-west-1".asInstanceOf[`eu-west-1`]
  
  @js.native
  sealed trait none_ extends StObject
  inline def none_ : none_ = "none".asInstanceOf[none_]
  
  @js.native
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait readable extends StObject
  inline def readable: readable = "readable".asInstanceOf[readable]
  
  @js.native
  sealed trait readonly extends StObject
  inline def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait readwrite extends StObject
  inline def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  
  @js.native
  sealed trait resume extends StObject
  inline def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait s3ColonObjectCreatedColonAsterisk
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectCreatedColonAsterisk: s3ColonObjectCreatedColonAsterisk = "s3:ObjectCreated:*".asInstanceOf[s3ColonObjectCreatedColonAsterisk]
  
  @js.native
  sealed trait s3ColonObjectCreatedColonCompleteMultipartUpload
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectCreatedColonCompleteMultipartUpload: s3ColonObjectCreatedColonCompleteMultipartUpload = "s3:ObjectCreated:CompleteMultipartUpload".asInstanceOf[s3ColonObjectCreatedColonCompleteMultipartUpload]
  
  @js.native
  sealed trait s3ColonObjectCreatedColonCopy
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectCreatedColonCopy: s3ColonObjectCreatedColonCopy = "s3:ObjectCreated:Copy".asInstanceOf[s3ColonObjectCreatedColonCopy]
  
  @js.native
  sealed trait s3ColonObjectCreatedColonPost
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectCreatedColonPost: s3ColonObjectCreatedColonPost = "s3:ObjectCreated:Post".asInstanceOf[s3ColonObjectCreatedColonPost]
  
  @js.native
  sealed trait s3ColonObjectCreatedColonPut
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectCreatedColonPut: s3ColonObjectCreatedColonPut = "s3:ObjectCreated:Put".asInstanceOf[s3ColonObjectCreatedColonPut]
  
  @js.native
  sealed trait s3ColonObjectRemovedColonAsterisk
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectRemovedColonAsterisk: s3ColonObjectRemovedColonAsterisk = "s3:ObjectRemoved:*".asInstanceOf[s3ColonObjectRemovedColonAsterisk]
  
  @js.native
  sealed trait s3ColonObjectRemovedColonDelete
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectRemovedColonDelete: s3ColonObjectRemovedColonDelete = "s3:ObjectRemoved:Delete".asInstanceOf[s3ColonObjectRemovedColonDelete]
  
  @js.native
  sealed trait s3ColonObjectRemovedColonDeleteMarkerCreated
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectRemovedColonDeleteMarkerCreated: s3ColonObjectRemovedColonDeleteMarkerCreated = "s3:ObjectRemoved:DeleteMarkerCreated".asInstanceOf[s3ColonObjectRemovedColonDeleteMarkerCreated]
  
  @js.native
  sealed trait s3ColonObjectRestoreColonCompleted
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectRestoreColonCompleted: s3ColonObjectRestoreColonCompleted = "s3:ObjectRestore:Completed".asInstanceOf[s3ColonObjectRestoreColonCompleted]
  
  @js.native
  sealed trait s3ColonObjectRestoreColonPost
    extends StObject
       with _NotificationEvent
  inline def s3ColonObjectRestoreColonPost: s3ColonObjectRestoreColonPost = "s3:ObjectRestore:Post".asInstanceOf[s3ColonObjectRestoreColonPost]
  
  @js.native
  sealed trait s3ColonReducedRedundancyLostObject
    extends StObject
       with _NotificationEvent
  inline def s3ColonReducedRedundancyLostObject: s3ColonReducedRedundancyLostObject = "s3:ReducedRedundancyLostObject".asInstanceOf[s3ColonReducedRedundancyLostObject]
  
  @js.native
  sealed trait s3ColonReplicationColonOperationFailedReplication
    extends StObject
       with _NotificationEvent
  inline def s3ColonReplicationColonOperationFailedReplication: s3ColonReplicationColonOperationFailedReplication = "s3:Replication:OperationFailedReplication".asInstanceOf[s3ColonReplicationColonOperationFailedReplication]
  
  @js.native
  sealed trait s3ColonReplicationColonOperationMissedThreshold
    extends StObject
       with _NotificationEvent
  inline def s3ColonReplicationColonOperationMissedThreshold: s3ColonReplicationColonOperationMissedThreshold = "s3:Replication:OperationMissedThreshold".asInstanceOf[s3ColonReplicationColonOperationMissedThreshold]
  
  @js.native
  sealed trait s3ColonReplicationColonOperationNotTracked
    extends StObject
       with _NotificationEvent
  inline def s3ColonReplicationColonOperationNotTracked: s3ColonReplicationColonOperationNotTracked = "s3:Replication:OperationNotTracked".asInstanceOf[s3ColonReplicationColonOperationNotTracked]
  
  @js.native
  sealed trait s3ColonReplicationColonOperationReplicatedAfterThreshold
    extends StObject
       with _NotificationEvent
  inline def s3ColonReplicationColonOperationReplicatedAfterThreshold: s3ColonReplicationColonOperationReplicatedAfterThreshold = "s3:Replication:OperationReplicatedAfterThreshold".asInstanceOf[s3ColonReplicationColonOperationReplicatedAfterThreshold]
  
  @js.native
  sealed trait s3ColonTestEvent
    extends StObject
       with _NotificationEvent
  inline def s3ColonTestEvent: s3ColonTestEvent = "s3:TestEvent".asInstanceOf[s3ColonTestEvent]
  
  @js.native
  sealed trait `sa-east-1`
    extends StObject
       with _Region
  inline def `sa-east-1`: `sa-east-1` = "sa-east-1".asInstanceOf[`sa-east-1`]
  
  @js.native
  sealed trait `us-east-1`
    extends StObject
       with _Region
  inline def `us-east-1`: `us-east-1` = "us-east-1".asInstanceOf[`us-east-1`]
  
  @js.native
  sealed trait `us-west-1`
    extends StObject
       with _Region
  inline def `us-west-1`: `us-west-1` = "us-west-1".asInstanceOf[`us-west-1`]
  
  @js.native
  sealed trait `us-west-2`
    extends StObject
       with _Region
  inline def `us-west-2`: `us-west-2` = "us-west-2".asInstanceOf[`us-west-2`]
  
  @js.native
  sealed trait writeonly extends StObject
  inline def writeonly: writeonly = "writeonly".asInstanceOf[writeonly]
}
