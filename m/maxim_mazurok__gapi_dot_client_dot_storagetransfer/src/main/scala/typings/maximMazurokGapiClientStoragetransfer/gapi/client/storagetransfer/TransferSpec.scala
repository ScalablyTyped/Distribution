package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferSpec extends StObject {
  
  /** An AWS S3 data source. */
  var awsS3DataSource: js.UndefOr[AwsS3Data] = js.undefined
  
  /** An Azure Blob Storage data source. */
  var azureBlobStorageDataSource: js.UndefOr[AzureBlobStorageData] = js.undefined
  
  /** A Cloud Storage data sink. */
  var gcsDataSink: js.UndefOr[GcsData] = js.undefined
  
  /** A Cloud Storage data source. */
  var gcsDataSource: js.UndefOr[GcsData] = js.undefined
  
  /** An HTTP URL data source. */
  var httpDataSource: js.UndefOr[HttpData] = js.undefined
  
  /**
    * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' "last modification time" do not
    * exclude objects in a data sink.
    */
  var objectConditions: js.UndefOr[ObjectConditions] = js.undefined
  
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
  
  extension [Self <: TransferSpec](x: Self) {
    
    inline def setAwsS3DataSource(value: AwsS3Data): Self = StObject.set(x, "awsS3DataSource", value.asInstanceOf[js.Any])
    
    inline def setAwsS3DataSourceUndefined: Self = StObject.set(x, "awsS3DataSource", js.undefined)
    
    inline def setAzureBlobStorageDataSource(value: AzureBlobStorageData): Self = StObject.set(x, "azureBlobStorageDataSource", value.asInstanceOf[js.Any])
    
    inline def setAzureBlobStorageDataSourceUndefined: Self = StObject.set(x, "azureBlobStorageDataSource", js.undefined)
    
    inline def setGcsDataSink(value: GcsData): Self = StObject.set(x, "gcsDataSink", value.asInstanceOf[js.Any])
    
    inline def setGcsDataSinkUndefined: Self = StObject.set(x, "gcsDataSink", js.undefined)
    
    inline def setGcsDataSource(value: GcsData): Self = StObject.set(x, "gcsDataSource", value.asInstanceOf[js.Any])
    
    inline def setGcsDataSourceUndefined: Self = StObject.set(x, "gcsDataSource", js.undefined)
    
    inline def setHttpDataSource(value: HttpData): Self = StObject.set(x, "httpDataSource", value.asInstanceOf[js.Any])
    
    inline def setHttpDataSourceUndefined: Self = StObject.set(x, "httpDataSource", js.undefined)
    
    inline def setObjectConditions(value: ObjectConditions): Self = StObject.set(x, "objectConditions", value.asInstanceOf[js.Any])
    
    inline def setObjectConditionsUndefined: Self = StObject.set(x, "objectConditions", js.undefined)
    
    inline def setTransferOptions(value: TransferOptions): Self = StObject.set(x, "transferOptions", value.asInstanceOf[js.Any])
    
    inline def setTransferOptionsUndefined: Self = StObject.set(x, "transferOptions", js.undefined)
  }
}
