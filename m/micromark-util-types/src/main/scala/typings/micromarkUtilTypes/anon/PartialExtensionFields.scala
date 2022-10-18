package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.ConstructRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<micromark-util-types.micromark-util-types._ExtensionFields> */
trait PartialExtensionFields extends StObject {
  
  var attentionMarkers: js.UndefOr[`0`] = js.undefined
  
  var contentInitial: js.UndefOr[ConstructRecord] = js.undefined
  
  var disable: js.UndefOr[Null] = js.undefined
  
  var document: js.UndefOr[ConstructRecord] = js.undefined
  
  var flow: js.UndefOr[ConstructRecord] = js.undefined
  
  var flowInitial: js.UndefOr[ConstructRecord] = js.undefined
  
  var insideSpan: js.UndefOr[`1`] = js.undefined
  
  var string: js.UndefOr[ConstructRecord] = js.undefined
  
  var text: js.UndefOr[ConstructRecord] = js.undefined
}
object PartialExtensionFields {
  
  inline def apply(): PartialExtensionFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExtensionFields]
  }
  
  extension [Self <: PartialExtensionFields](x: Self) {
    
    inline def setAttentionMarkers(value: `0`): Self = StObject.set(x, "attentionMarkers", value.asInstanceOf[js.Any])
    
    inline def setAttentionMarkersUndefined: Self = StObject.set(x, "attentionMarkers", js.undefined)
    
    inline def setContentInitial(value: ConstructRecord): Self = StObject.set(x, "contentInitial", value.asInstanceOf[js.Any])
    
    inline def setContentInitialUndefined: Self = StObject.set(x, "contentInitial", js.undefined)
    
    inline def setDisable(value: Null): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDocument(value: ConstructRecord): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFlow(value: ConstructRecord): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowInitial(value: ConstructRecord): Self = StObject.set(x, "flowInitial", value.asInstanceOf[js.Any])
    
    inline def setFlowInitialUndefined: Self = StObject.set(x, "flowInitial", js.undefined)
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setInsideSpan(value: `1`): Self = StObject.set(x, "insideSpan", value.asInstanceOf[js.Any])
    
    inline def setInsideSpanUndefined: Self = StObject.set(x, "insideSpan", js.undefined)
    
    inline def setString(value: ConstructRecord): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setText(value: ConstructRecord): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
