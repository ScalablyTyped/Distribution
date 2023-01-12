package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegment extends StObject {
  
  /** The maximum number of times this segment can be present in this group. 0 or -1 means unbounded. */
  var maxOccurs: js.UndefOr[Double] = js.undefined
  
  /** The minimum number of times this segment can be present in this group. */
  var minOccurs: js.UndefOr[Double] = js.undefined
  
  /** The Segment type. For example, "PID". */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaSegment {
  
  inline def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaSegment] (val x: Self) extends AnyVal {
    
    inline def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
    
    inline def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
    
    inline def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
    
    inline def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
