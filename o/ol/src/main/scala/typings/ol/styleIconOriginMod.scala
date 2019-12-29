package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconOrigin", JSImport.Namespace)
@js.native
object styleIconOriginMod extends js.Object {
  @js.native
  sealed trait IconOrigin extends js.Object
  
  @js.native
  object IconOrigin extends js.Object {
    @js.native
    sealed trait BOTTOM_LEFT extends IconOrigin
    
    @js.native
    sealed trait BOTTOM_RIGHT extends IconOrigin
    
    @js.native
    sealed trait TOP_LEFT extends IconOrigin
    
    @js.native
    sealed trait TOP_RIGHT extends IconOrigin
    
  }
  
  @js.native
  object default extends js.Object {
    /* "bottom-left" */ val BOTTOM_LEFT: typings.ol.styleIconOriginMod.IconOrigin.BOTTOM_LEFT with String = js.native
    /* "bottom-right" */ val BOTTOM_RIGHT: typings.ol.styleIconOriginMod.IconOrigin.BOTTOM_RIGHT with String = js.native
    /* "top-left" */ val TOP_LEFT: typings.ol.styleIconOriginMod.IconOrigin.TOP_LEFT with String = js.native
    /* "top-right" */ val TOP_RIGHT: typings.ol.styleIconOriginMod.IconOrigin.TOP_RIGHT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconOrigin with String] = js.native
  }
  
}

