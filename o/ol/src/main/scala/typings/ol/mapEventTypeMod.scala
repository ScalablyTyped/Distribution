package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapEventTypeMod {
  
  @JSImport("ol/MapEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapEventType & String] = js.native
    
    /* "moveend" */ val MOVEEND: typings.ol.mapEventTypeMod.MapEventType.MOVEEND & String = js.native
    
    /* "movestart" */ val MOVESTART: typings.ol.mapEventTypeMod.MapEventType.MOVESTART & String = js.native
    
    /* "postrender" */ val POSTRENDER: typings.ol.mapEventTypeMod.MapEventType.POSTRENDER & String = js.native
  }
  
  @js.native
  sealed trait MapEventType extends StObject
  @JSImport("ol/MapEventType", "MapEventType")
  @js.native
  object MapEventType extends StObject {
    
    @js.native
    sealed trait MOVEEND
      extends StObject
         with MapEventType
    
    @js.native
    sealed trait MOVESTART
      extends StObject
         with MapEventType
    
    @js.native
    sealed trait POSTRENDER
      extends StObject
         with MapEventType
  }
}
