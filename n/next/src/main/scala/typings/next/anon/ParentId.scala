package typings.next.anon

import typings.next.distTraceSharedMod.SpanId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentId extends StObject {
  
  var attrs: js.UndefOr[js.Object] = js.undefined
  
  var name: String
  
  var parentId: js.UndefOr[SpanId] = js.undefined
  
  var startTime: js.UndefOr[js.BigInt] = js.undefined
}
object ParentId {
  
  inline def apply(name: String): ParentId = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentId]
  }
  
  extension [Self <: ParentId](x: Self) {
    
    inline def setAttrs(value: js.Object): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: SpanId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setStartTime(value: js.BigInt): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
