package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapEventTypeMod {
  
  object default {
    
    @JSImport("ol/MapEventType", "default.LOADEND")
    @js.native
    val LOADEND: String = js.native
    
    @JSImport("ol/MapEventType", "default.LOADSTART")
    @js.native
    val LOADSTART: String = js.native
    
    @JSImport("ol/MapEventType", "default.MOVEEND")
    @js.native
    val MOVEEND: String = js.native
    
    @JSImport("ol/MapEventType", "default.MOVESTART")
    @js.native
    val MOVESTART: String = js.native
    
    @JSImport("ol/MapEventType", "default.POSTRENDER")
    @js.native
    val POSTRENDER: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.postrender
    - typings.ol.olStrings.movestart
    - typings.ol.olStrings.moveend
    - typings.ol.olStrings.loadstart
    - typings.ol.olStrings.loadend
  */
  trait Types extends StObject
  object Types {
    
    inline def loadend: typings.ol.olStrings.loadend = "loadend".asInstanceOf[typings.ol.olStrings.loadend]
    
    inline def loadstart: typings.ol.olStrings.loadstart = "loadstart".asInstanceOf[typings.ol.olStrings.loadstart]
    
    inline def moveend: typings.ol.olStrings.moveend = "moveend".asInstanceOf[typings.ol.olStrings.moveend]
    
    inline def movestart: typings.ol.olStrings.movestart = "movestart".asInstanceOf[typings.ol.olStrings.movestart]
    
    inline def postrender: typings.ol.olStrings.postrender = "postrender".asInstanceOf[typings.ol.olStrings.postrender]
  }
}
