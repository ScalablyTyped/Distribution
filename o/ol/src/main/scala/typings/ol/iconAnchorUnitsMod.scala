package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/style/IconAnchorUnits", JSImport.Namespace)
@js.native
object iconAnchorUnitsMod extends js.Object {
  
  @js.native
  sealed trait IconAnchorUnits extends js.Object
  @js.native
  object IconAnchorUnits extends js.Object {
    
    @js.native
    sealed trait FRACTION extends IconAnchorUnits
    
    @js.native
    sealed trait PIXELS extends IconAnchorUnits
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconAnchorUnits with String] = js.native
    
    /* "fraction" */ val FRACTION: typings.ol.iconAnchorUnitsMod.IconAnchorUnits.FRACTION with String = js.native
    
    /* "pixels" */ val PIXELS: typings.ol.iconAnchorUnitsMod.IconAnchorUnits.PIXELS with String = js.native
  }
}
