package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapEventTypeMod {
  
  @JSImport("ol/MapEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapEventType with String] = js.native
    
    /* "moveend" */ val MOVEEND: typings.ol.mapEventTypeMod.MapEventType.MOVEEND with String = js.native
    
    /* "movestart" */ val MOVESTART: typings.ol.mapEventTypeMod.MapEventType.MOVESTART with String = js.native
    
    /* "postrender" */ val POSTRENDER: typings.ol.mapEventTypeMod.MapEventType.POSTRENDER with String = js.native
  }
  
  @js.native
  sealed trait MapEventType extends StObject
  @JSImport("ol/MapEventType", "MapEventType")
  @js.native
  object MapEventType extends StObject {
    
    @js.native
    sealed trait MOVEEND extends MapEventType
    
    @js.native
    sealed trait MOVESTART extends MapEventType
    
    @js.native
    sealed trait POSTRENDER extends MapEventType
  }
}
