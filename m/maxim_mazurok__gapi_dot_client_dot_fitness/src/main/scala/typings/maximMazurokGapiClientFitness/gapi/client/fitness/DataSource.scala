package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /** Information about an application which feeds sensor data into the platform. */
  var application: js.UndefOr[Application] = js.undefined
  
  /** DO NOT POPULATE THIS FIELD. It is never populated in responses from the platform, and is ignored in queries. It will be removed in a future version entirely. */
  var dataQualityStandard: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A unique identifier for the data stream produced by this data source. The identifier includes: - The physical device's manufacturer, model, and serial number (UID). - The
    * application's package name or name. Package name is used when the data source was created by an Android application. The developer project number is used when the data source was
    * created by a REST client. - The data source's type. - The data source's stream name. Note that not all attributes of the data source are used as part of the stream identifier. In
    * particular, the version of the hardware/the application isn't used. This allows us to preserve the same stream through version updates. This also means that two DataSource objects
    * may represent the same data stream even if they're not equal. The exact format of the data stream ID created by an Android application is:
    * type:dataType.name:application.packageName:device.manufacturer:device.model:device.uid:dataStreamName The exact format of the data stream ID created by a REST client is:
    * type:dataType.name:developer project number:device.manufacturer:device.model:device.uid:dataStreamName When any of the optional fields that make up the data stream ID are absent,
    * they will be omitted from the data stream ID. The minimum viable data stream ID would be: type:dataType.name:developer project number Finally, the developer project number and
    * device UID are obfuscated when read by any REST or Android client that did not create the data source. Only the data source creator will see the developer project number in clear
    * and normal form. This means a client will see a different set of data_stream_ids than another client with different credentials.
    */
  var dataStreamId: js.UndefOr[String] = js.undefined
  
  /**
    * The stream name uniquely identifies this particular data source among other data sources of the same type from the same underlying producer. Setting the stream name is optional, but
    * should be done whenever an application exposes two streams for the same data type, or when a device has two equivalent sensors.
    */
  var dataStreamName: js.UndefOr[String] = js.undefined
  
  /** The data type defines the schema for a stream of data being collected by, inserted into, or queried from the Fitness API. */
  var dataType: js.UndefOr[DataType] = js.undefined
  
  /** Representation of an integrated device (such as a phone or a wearable) that can hold sensors. */
  var device: js.UndefOr[Device] = js.undefined
  
  /** An end-user visible name for this data source. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A constant describing the type of this data source. Indicates whether this data source produces raw or derived data. */
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setDataQualityStandard(value: js.Array[String]): Self = StObject.set(x, "dataQualityStandard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataQualityStandardUndefined: Self = StObject.set(x, "dataQualityStandard", js.undefined)
    
    @scala.inline
    def setDataQualityStandardVarargs(value: String*): Self = StObject.set(x, "dataQualityStandard", js.Array(value :_*))
    
    @scala.inline
    def setDataStreamId(value: String): Self = StObject.set(x, "dataStreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStreamIdUndefined: Self = StObject.set(x, "dataStreamId", js.undefined)
    
    @scala.inline
    def setDataStreamName(value: String): Self = StObject.set(x, "dataStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStreamNameUndefined: Self = StObject.set(x, "dataStreamName", js.undefined)
    
    @scala.inline
    def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
