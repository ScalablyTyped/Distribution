package typings.ol

import typings.ol.styleIconAnchorUnitsMod.IconAnchorUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconAnchorUnits", JSImport.Namespace)
@js.native
object styleIconAnchorUnitsMod extends js.Object {
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
    /* "fraction" */ val FRACTION: typings.ol.styleIconAnchorUnitsMod.IconAnchorUnits.FRACTION with String = js.native
    /* "pixels" */ val PIXELS: typings.ol.styleIconAnchorUnitsMod.IconAnchorUnits.PIXELS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconAnchorUnits with String] = js.native
  }
  
}

