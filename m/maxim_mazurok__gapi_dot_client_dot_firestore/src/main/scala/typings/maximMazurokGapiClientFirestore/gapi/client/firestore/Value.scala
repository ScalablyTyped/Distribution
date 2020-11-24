package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends js.Object {
  
  /** An array value. Cannot directly contain another array value, though can contain an map which contains another array. */
  var arrayValue: js.UndefOr[ArrayValue] = js.native
  
  /** A boolean value. */
  var booleanValue: js.UndefOr[Boolean] = js.native
  
  /** A bytes value. Must not exceed 1 MiB - 89 bytes. Only the first 1,500 bytes are considered by queries. */
  var bytesValue: js.UndefOr[String] = js.native
  
  /** A double value. */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /** A geo point value representing a point on the surface of Earth. */
  var geoPointValue: js.UndefOr[LatLng] = js.native
  
  /** An integer value. */
  var integerValue: js.UndefOr[String] = js.native
  
  /** A map value. */
  var mapValue: js.UndefOr[MapValue] = js.native
  
  /** A null value. */
  var nullValue: js.UndefOr[String] = js.native
  
  /** A reference to a document. For example: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. */
  var referenceValue: js.UndefOr[String] = js.native
  
  /** A string value. The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes. Only the first 1,500 bytes of the UTF-8 representation are considered by queries. */
  var stringValue: js.UndefOr[String] = js.native
  
  /** A timestamp value. Precise only to microseconds. When stored, any additional precision is rounded down. */
  var timestampValue: js.UndefOr[String] = js.native
}
object Value {
  
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayValue(value: ArrayValue): Self = this.set("arrayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayValue: Self = this.set("arrayValue", js.undefined)
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    
    @scala.inline
    def setBytesValue(value: String): Self = this.set("bytesValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesValue: Self = this.set("bytesValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    
    @scala.inline
    def setGeoPointValue(value: LatLng): Self = this.set("geoPointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoPointValue: Self = this.set("geoPointValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setMapValue(value: MapValue): Self = this.set("mapValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapValue: Self = this.set("mapValue", js.undefined)
    
    @scala.inline
    def setNullValue(value: String): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    
    @scala.inline
    def setReferenceValue(value: String): Self = this.set("referenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceValue: Self = this.set("referenceValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
  }
}
