package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.Construct
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<micromark-util-types.micromark-util-types._NormalizedExtensionFields> */
trait PartialNormalizedExtensio extends StObject {
  
  var attentionMarkers: js.UndefOr[`3`] = js.undefined
  
  var contentInitial: js.UndefOr[Record[String, js.Array[Construct]]] = js.undefined
  
  var disable: js.UndefOr[NullArray] = js.undefined
  
  var document: js.UndefOr[Record[String, js.Array[Construct]]] = js.undefined
  
  var flow: js.UndefOr[Record[String, js.Array[Construct]]] = js.undefined
  
  var flowInitial: js.UndefOr[Record[String, js.Array[Construct]]] = js.undefined
  
  var insideSpan: js.UndefOr[`4`] = js.undefined
  
  var string: js.UndefOr[Record[String, js.Array[Construct]]] = js.undefined
  
  var text: js.UndefOr[Record[String, js.Array[Construct]]] = js.undefined
}
object PartialNormalizedExtensio {
  
  inline def apply(): PartialNormalizedExtensio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNormalizedExtensio]
  }
  
  extension [Self <: PartialNormalizedExtensio](x: Self) {
    
    inline def setAttentionMarkers(value: `3`): Self = StObject.set(x, "attentionMarkers", value.asInstanceOf[js.Any])
    
    inline def setAttentionMarkersUndefined: Self = StObject.set(x, "attentionMarkers", js.undefined)
    
    inline def setContentInitial(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "contentInitial", value.asInstanceOf[js.Any])
    
    inline def setContentInitialUndefined: Self = StObject.set(x, "contentInitial", js.undefined)
    
    inline def setDisable(value: NullArray): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDocument(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFlow(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowInitial(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "flowInitial", value.asInstanceOf[js.Any])
    
    inline def setFlowInitialUndefined: Self = StObject.set(x, "flowInitial", js.undefined)
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setInsideSpan(value: `4`): Self = StObject.set(x, "insideSpan", value.asInstanceOf[js.Any])
    
    inline def setInsideSpanUndefined: Self = StObject.set(x, "insideSpan", js.undefined)
    
    inline def setString(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setText(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
