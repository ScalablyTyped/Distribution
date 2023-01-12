package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferSpec extends StObject {
  
  /** An AWS S3 compatible data source. */
  var awsS3CompatibleDataSource: js.UndefOr[AwsS3CompatibleData] = js.undefined
  
  /** An AWS S3 data source. */
  var awsS3DataSource: js.UndefOr[AwsS3Data] = js.undefined
  
  /** An Azure Blob Storage data source. */
  var azureBlobStorageDataSource: js.UndefOr[AzureBlobStorageData] = js.undefined
  
  /** A Cloud Storage data sink. */
  var gcsDataSink: js.UndefOr[GcsData] = js.undefined
  
  /** A Cloud Storage data source. */
  var gcsDataSource: js.UndefOr[GcsData] = js.undefined
  
  /** Cloud Storage intermediate data location. */
  var gcsIntermediateDataLocation: js.UndefOr[GcsData] = js.undefined
  
  /** An HTTP URL data source. */
  var httpDataSource: js.UndefOr[HttpData] = js.undefined
  
  /**
    * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' "last modification time" do not
    * exclude objects in a data sink.
    */
  var objectConditions: js.UndefOr[ObjectConditions] = js.undefined
  
  /** A POSIX Filesystem data sink. */
  var posixDataSink: js.UndefOr[PosixFilesystem] = js.undefined
  
  /** A POSIX Filesystem data source. */
  var posixDataSource: js.UndefOr[PosixFilesystem] = js.undefined
  
  /** Specifies the agent pool name associated with the posix data sink. When unspecified, the default name is used. */
  var sinkAgentPoolName: js.UndefOr[String] = js.undefined
  
  /** Specifies the agent pool name associated with the posix data source. When unspecified, the default name is used. */
  var sourceAgentPoolName: js.UndefOr[String] = js.undefined
  
  /**
    * A manifest file provides a list of objects to be transferred from the data source. This field points to the location of the manifest file. Otherwise, the entire source bucket is
    * used. ObjectConditions still apply.
    */
  var transferManifest: js.UndefOr[TransferManifest] = js.undefined
  
  /**
    * If the option delete_objects_unique_in_sink is `true` and time-based object conditions such as 'last modification time' are specified, the request fails with an INVALID_ARGUMENT
    * error.
    */
  var transferOptions: js.UndefOr[TransferOptions] = js.undefined
}
object TransferSpec {
  
  inline def apply(): TransferSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferSpec] (val x: Self) extends AnyVal {
    
    inline def setAwsS3CompatibleDataSource(value: AwsS3CompatibleData): Self = StObject.set(x, "awsS3CompatibleDataSource", value.asInstanceOf[js.Any])
    
    inline def setAwsS3CompatibleDataSourceUndefined: Self = StObject.set(x, "awsS3CompatibleDataSource", js.undefined)
    
    inline def setAwsS3DataSource(value: AwsS3Data): Self = StObject.set(x, "awsS3DataSource", value.asInstanceOf[js.Any])
    
    inline def setAwsS3DataSourceUndefined: Self = StObject.set(x, "awsS3DataSource", js.undefined)
    
    inline def setAzureBlobStorageDataSource(value: AzureBlobStorageData): Self = StObject.set(x, "azureBlobStorageDataSource", value.asInstanceOf[js.Any])
    
    inline def setAzureBlobStorageDataSourceUndefined: Self = StObject.set(x, "azureBlobStorageDataSource", js.undefined)
    
    inline def setGcsDataSink(value: GcsData): Self = StObject.set(x, "gcsDataSink", value.asInstanceOf[js.Any])
    
    inline def setGcsDataSinkUndefined: Self = StObject.set(x, "gcsDataSink", js.undefined)
    
    inline def setGcsDataSource(value: GcsData): Self = StObject.set(x, "gcsDataSource", value.asInstanceOf[js.Any])
    
    inline def setGcsDataSourceUndefined: Self = StObject.set(x, "gcsDataSource", js.undefined)
    
    inline def setGcsIntermediateDataLocation(value: GcsData): Self = StObject.set(x, "gcsIntermediateDataLocation", value.asInstanceOf[js.Any])
    
    inline def setGcsIntermediateDataLocationUndefined: Self = StObject.set(x, "gcsIntermediateDataLocation", js.undefined)
    
    inline def setHttpDataSource(value: HttpData): Self = StObject.set(x, "httpDataSource", value.asInstanceOf[js.Any])
    
    inline def setHttpDataSourceUndefined: Self = StObject.set(x, "httpDataSource", js.undefined)
    
    inline def setObjectConditions(value: ObjectConditions): Self = StObject.set(x, "objectConditions", value.asInstanceOf[js.Any])
    
    inline def setObjectConditionsUndefined: Self = StObject.set(x, "objectConditions", js.undefined)
    
    inline def setPosixDataSink(value: PosixFilesystem): Self = StObject.set(x, "posixDataSink", value.asInstanceOf[js.Any])
    
    inline def setPosixDataSinkUndefined: Self = StObject.set(x, "posixDataSink", js.undefined)
    
    inline def setPosixDataSource(value: PosixFilesystem): Self = StObject.set(x, "posixDataSource", value.asInstanceOf[js.Any])
    
    inline def setPosixDataSourceUndefined: Self = StObject.set(x, "posixDataSource", js.undefined)
    
    inline def setSinkAgentPoolName(value: String): Self = StObject.set(x, "sinkAgentPoolName", value.asInstanceOf[js.Any])
    
    inline def setSinkAgentPoolNameUndefined: Self = StObject.set(x, "sinkAgentPoolName", js.undefined)
    
    inline def setSourceAgentPoolName(value: String): Self = StObject.set(x, "sourceAgentPoolName", value.asInstanceOf[js.Any])
    
    inline def setSourceAgentPoolNameUndefined: Self = StObject.set(x, "sourceAgentPoolName", js.undefined)
    
    inline def setTransferManifest(value: TransferManifest): Self = StObject.set(x, "transferManifest", value.asInstanceOf[js.Any])
    
    inline def setTransferManifestUndefined: Self = StObject.set(x, "transferManifest", js.undefined)
    
    inline def setTransferOptions(value: TransferOptions): Self = StObject.set(x, "transferOptions", value.asInstanceOf[js.Any])
    
    inline def setTransferOptionsUndefined: Self = StObject.set(x, "transferOptions", js.undefined)
  }
}
