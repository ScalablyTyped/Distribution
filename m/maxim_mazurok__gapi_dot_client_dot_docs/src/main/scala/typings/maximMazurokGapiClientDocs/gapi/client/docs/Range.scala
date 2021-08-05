package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /**
    * The zero-based end index of this range, exclusive, in UTF-16 code units. In all current uses, an end index must be provided. This field is an Int32Value in order to accommodate
    * future use cases with open-ended ranges.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /** The ID of the header, footer or footnote that this range is contained in. An empty segment ID signifies the document's body. */
  var segmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The zero-based start index of this range, in UTF-16 code units. In all current uses, a start index must be provided. This field is an Int32Value in order to accommodate future use
    * cases with open-ended ranges.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object Range {
  
  inline def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
