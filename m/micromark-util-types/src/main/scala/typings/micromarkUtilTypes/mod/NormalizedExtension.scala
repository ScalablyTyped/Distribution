package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.Null
import typings.micromarkUtilTypes.anon.`0`
import typings.micromarkUtilTypes.anon.`1`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Key in keyof micromark-util-types.micromark-util-types.Extension ]: std.Exclude<micromark-util-types.micromark-util-types.Extension[Key], undefined>} */
trait NormalizedExtension extends StObject {
  
  var attentionMarkers: js.UndefOr[Exclude[js.UndefOr[`1`], Unit]] = js.undefined
  
  var contentInitial: js.UndefOr[Exclude[js.UndefOr[ConstructRecord], Unit]] = js.undefined
  
  var disable: js.UndefOr[Exclude[js.UndefOr[Null], Unit]] = js.undefined
  
  var document: js.UndefOr[Exclude[js.UndefOr[ConstructRecord], Unit]] = js.undefined
  
  var flow: js.UndefOr[Exclude[js.UndefOr[ConstructRecord], Unit]] = js.undefined
  
  var flowInitial: js.UndefOr[Exclude[js.UndefOr[ConstructRecord], Unit]] = js.undefined
  
  var insideSpan: js.UndefOr[Exclude[js.UndefOr[`0`], Unit]] = js.undefined
  
  var string: js.UndefOr[Exclude[js.UndefOr[ConstructRecord], Unit]] = js.undefined
  
  var text: js.UndefOr[Exclude[js.UndefOr[ConstructRecord], Unit]] = js.undefined
}
object NormalizedExtension {
  
  inline def apply(): NormalizedExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizedExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedExtension] (val x: Self) extends AnyVal {
    
    inline def setAttentionMarkers(value: Exclude[js.UndefOr[`1`], Unit]): Self = StObject.set(x, "attentionMarkers", value.asInstanceOf[js.Any])
    
    inline def setAttentionMarkersUndefined: Self = StObject.set(x, "attentionMarkers", js.undefined)
    
    inline def setContentInitial(value: Exclude[js.UndefOr[ConstructRecord], Unit]): Self = StObject.set(x, "contentInitial", value.asInstanceOf[js.Any])
    
    inline def setContentInitialUndefined: Self = StObject.set(x, "contentInitial", js.undefined)
    
    inline def setDisable(value: Exclude[js.UndefOr[Null], Unit]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDocument(value: Exclude[js.UndefOr[ConstructRecord], Unit]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setFlow(value: Exclude[js.UndefOr[ConstructRecord], Unit]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowInitial(value: Exclude[js.UndefOr[ConstructRecord], Unit]): Self = StObject.set(x, "flowInitial", value.asInstanceOf[js.Any])
    
    inline def setFlowInitialUndefined: Self = StObject.set(x, "flowInitial", js.undefined)
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setInsideSpan(value: Exclude[js.UndefOr[`0`], Unit]): Self = StObject.set(x, "insideSpan", value.asInstanceOf[js.Any])
    
    inline def setInsideSpanUndefined: Self = StObject.set(x, "insideSpan", js.undefined)
    
    inline def setString(value: Exclude[js.UndefOr[ConstructRecord], Unit]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setText(value: Exclude[js.UndefOr[ConstructRecord], Unit]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
