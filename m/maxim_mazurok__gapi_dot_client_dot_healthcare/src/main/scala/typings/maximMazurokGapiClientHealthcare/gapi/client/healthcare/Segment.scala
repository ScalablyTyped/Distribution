package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  /**
    * A mapping from the positional location to the value. The key string uses zero-based indexes separated by dots to identify Fields, components and sub-components. A bracket notation
    * is also used to identify different instances of a repeated field. Regex for key: (\d+)(\[\d+\])?(.\d+)?(.\d+)? Examples of (key, value) pairs: * (0.1, "hemoglobin") denotes that the
    * first component of Field 0 has the value "hemoglobin". * (1.1.2, "CBC") denotes that the second sub-component of the first component of Field 1 has the value "CBC". * (1[0].1,
    * "HbA1c") denotes that the first component of the first Instance of Field 1, which is repeated, has the value "HbA1c".
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.Segment & TopLevel[js.Any]
  ] = js.undefined
  
  /** A string that indicates the type of segment. For example, EVN or PID. */
  var segmentId: js.UndefOr[String] = js.undefined
  
  /** Set ID for segments that can be in a set. This can be empty if it's missing or isn't applicable. */
  var setId: js.UndefOr[String] = js.undefined
}
object Segment {
  
  @scala.inline
  def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.Segment & TopLevel[js.Any]
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
    
    @scala.inline
    def setSetId(value: String): Self = StObject.set(x, "setId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
  }
}
