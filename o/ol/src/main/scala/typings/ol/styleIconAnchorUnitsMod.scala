package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconAnchorUnitsMod {
  
  @JSImport("ol/style/IconAnchorUnits", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconAnchorUnits & String] = js.native
    
    /* "fraction" */ val FRACTION: typings.ol.styleIconAnchorUnitsMod.IconAnchorUnits.FRACTION & String = js.native
    
    /* "pixels" */ val PIXELS: typings.ol.styleIconAnchorUnitsMod.IconAnchorUnits.PIXELS & String = js.native
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
