package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.NullArray
import typings.micromarkUtilTypes.anon.`2`
import typings.micromarkUtilTypes.anon.`3`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedExtensionFields extends StObject {
  
  var attentionMarkers: `3`
  
  var contentInitial: Record[String, js.Array[Construct]]
  
  var disable: NullArray
  
  var document: Record[String, js.Array[Construct]]
  
  var flow: Record[String, js.Array[Construct]]
  
  var flowInitial: Record[String, js.Array[Construct]]
  
  var insideSpan: `2`
  
  var string: Record[String, js.Array[Construct]]
  
  var text: Record[String, js.Array[Construct]]
}
object NormalizedExtensionFields {
  
  inline def apply(
    attentionMarkers: `3`,
    contentInitial: Record[String, js.Array[Construct]],
    disable: NullArray,
    document: Record[String, js.Array[Construct]],
    flow: Record[String, js.Array[Construct]],
    flowInitial: Record[String, js.Array[Construct]],
    insideSpan: `2`,
    string: Record[String, js.Array[Construct]],
    text: Record[String, js.Array[Construct]]
  ): NormalizedExtensionFields = {
    val __obj = js.Dynamic.literal(attentionMarkers = attentionMarkers.asInstanceOf[js.Any], contentInitial = contentInitial.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], flowInitial = flowInitial.asInstanceOf[js.Any], insideSpan = insideSpan.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedExtensionFields]
  }
  
  extension [Self <: NormalizedExtensionFields](x: Self) {
    
    inline def setAttentionMarkers(value: `3`): Self = StObject.set(x, "attentionMarkers", value.asInstanceOf[js.Any])
    
    inline def setContentInitial(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "contentInitial", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: NullArray): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowInitial(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "flowInitial", value.asInstanceOf[js.Any])
    
    inline def setInsideSpan(value: `2`): Self = StObject.set(x, "insideSpan", value.asInstanceOf[js.Any])
    
    inline def setString(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setText(value: Record[String, js.Array[Construct]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
