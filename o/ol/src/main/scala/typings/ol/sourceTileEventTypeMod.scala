package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileEventTypeMod {
  
  object default {
    
    @JSImport("ol/source/TileEventType", "default.TILELOADEND")
    @js.native
    val TILELOADEND: String = js.native
    
    @JSImport("ol/source/TileEventType", "default.TILELOADERROR")
    @js.native
    val TILELOADERROR: String = js.native
    
    @JSImport("ol/source/TileEventType", "default.TILELOADSTART")
    @js.native
    val TILELOADSTART: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.tileloadstart
    - typings.ol.olStrings.tileloadend
    - typings.ol.olStrings.tileloaderror
  */
  trait TileSourceEventTypes extends StObject
  object TileSourceEventTypes {
    
    inline def tileloadend: typings.ol.olStrings.tileloadend = "tileloadend".asInstanceOf[typings.ol.olStrings.tileloadend]
    
    inline def tileloaderror: typings.ol.olStrings.tileloaderror = "tileloaderror".asInstanceOf[typings.ol.olStrings.tileloaderror]
    
    inline def tileloadstart: typings.ol.olStrings.tileloadstart = "tileloadstart".asInstanceOf[typings.ol.olStrings.tileloadstart]
  }
}
