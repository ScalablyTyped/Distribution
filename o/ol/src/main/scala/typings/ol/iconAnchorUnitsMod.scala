package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconAnchorUnitsMod {
  
  @JSImport("ol/style/IconAnchorUnits", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconAnchorUnits & String] = js.native
    
    /* "fraction" */ val FRACTION: typings.ol.iconAnchorUnitsMod.IconAnchorUnits.FRACTION & String = js.native
    
    /* "pixels" */ val PIXELS: typings.ol.iconAnchorUnitsMod.IconAnchorUnits.PIXELS & String = js.native
  }
  
  @js.native
  sealed trait IconAnchorUnits extends StObject
  @JSImport("ol/style/IconAnchorUnits", "IconAnchorUnits")
  @js.native
  object IconAnchorUnits extends StObject {
    
    @js.native
    sealed trait FRACTION
      extends StObject
         with IconAnchorUnits
    
    @js.native
    sealed trait PIXELS
      extends StObject
         with IconAnchorUnits
  }
}
