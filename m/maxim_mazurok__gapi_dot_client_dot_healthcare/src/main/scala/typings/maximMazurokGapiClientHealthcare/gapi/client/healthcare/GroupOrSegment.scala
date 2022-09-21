package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOrSegment extends StObject {
  
  var group: js.UndefOr[SchemaGroup] = js.undefined
  
  var segment: js.UndefOr[SchemaSegment] = js.undefined
}
object GroupOrSegment {
  
  inline def apply(): GroupOrSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOrSegment]
  }
  
  extension [Self <: GroupOrSegment](x: Self) {
    
    inline def setGroup(value: SchemaGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setSegment(value: SchemaSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
