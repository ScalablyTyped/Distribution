package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderEventTypeMod {
  
  object default {
    
    @JSImport("ol/render/EventType", "default.POSTCOMPOSE")
    @js.native
    val POSTCOMPOSE: String = js.native
    
    @JSImport("ol/render/EventType", "default.POSTRENDER")
    @js.native
    val POSTRENDER: String = js.native
    
    @JSImport("ol/render/EventType", "default.PRECOMPOSE")
    @js.native
    val PRECOMPOSE: String = js.native
    
    @JSImport("ol/render/EventType", "default.PRERENDER")
    @js.native
    val PRERENDER: String = js.native
    
    @JSImport("ol/render/EventType", "default.RENDERCOMPLETE")
    @js.native
    val RENDERCOMPLETE: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.postrender
    - typings.ol.olStrings.prerender
  */
  trait LayerRenderEventTypes extends StObject
  object LayerRenderEventTypes {
    
    inline def postrender: typings.ol.olStrings.postrender = "postrender".asInstanceOf[typings.ol.olStrings.postrender]
    
    inline def prerender: typings.ol.olStrings.prerender = "prerender".asInstanceOf[typings.ol.olStrings.prerender]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.postrender
    - typings.ol.olStrings.precompose
    - typings.ol.olStrings.postcompose
    - typings.ol.olStrings.rendercomplete
  */
  trait MapRenderEventTypes extends StObject
  object MapRenderEventTypes {
    
    inline def postcompose: typings.ol.olStrings.postcompose = "postcompose".asInstanceOf[typings.ol.olStrings.postcompose]
    
    inline def postrender: typings.ol.olStrings.postrender = "postrender".asInstanceOf[typings.ol.olStrings.postrender]
    
    inline def precompose: typings.ol.olStrings.precompose = "precompose".asInstanceOf[typings.ol.olStrings.precompose]
    
    inline def rendercomplete: typings.ol.olStrings.rendercomplete = "rendercomplete".asInstanceOf[typings.ol.olStrings.rendercomplete]
  }
}
