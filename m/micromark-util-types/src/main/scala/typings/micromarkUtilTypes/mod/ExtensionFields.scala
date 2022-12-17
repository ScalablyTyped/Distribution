package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.Null
import typings.micromarkUtilTypes.anon.`0`
import typings.micromarkUtilTypes.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionFields extends StObject {
  
  var attentionMarkers: `1`
  
  var contentInitial: ConstructRecord
  
  var disable: Null
  
  var document: ConstructRecord
  
  var flow: ConstructRecord
  
  var flowInitial: ConstructRecord
  
  var insideSpan: `0`
  
  var string: ConstructRecord
  
  var text: ConstructRecord
}
object ExtensionFields {
  
  inline def apply(
    attentionMarkers: `1`,
    contentInitial: ConstructRecord,
    disable: Null,
    document: ConstructRecord,
    flow: ConstructRecord,
    flowInitial: ConstructRecord,
    insideSpan: `0`,
    string: ConstructRecord,
    text: ConstructRecord
  ): ExtensionFields = {
    val __obj = js.Dynamic.literal(attentionMarkers = attentionMarkers.asInstanceOf[js.Any], contentInitial = contentInitial.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], flowInitial = flowInitial.asInstanceOf[js.Any], insideSpan = insideSpan.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFields]
  }
  
  extension [Self <: ExtensionFields](x: Self) {
    
    inline def setAttentionMarkers(value: `1`): Self = StObject.set(x, "attentionMarkers", value.asInstanceOf[js.Any])
    
    inline def setContentInitial(value: ConstructRecord): Self = StObject.set(x, "contentInitial", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: Null): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: ConstructRecord): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: ConstructRecord): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowInitial(value: ConstructRecord): Self = StObject.set(x, "flowInitial", value.asInstanceOf[js.Any])
    
    inline def setInsideSpan(value: `0`): Self = StObject.set(x, "insideSpan", value.asInstanceOf[js.Any])
    
    inline def setString(value: ConstructRecord): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setText(value: ConstructRecord): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
