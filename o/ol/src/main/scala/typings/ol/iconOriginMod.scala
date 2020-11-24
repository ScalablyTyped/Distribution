package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/style/IconOrigin", JSImport.Namespace)
@js.native
object iconOriginMod extends js.Object {
  
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconOrigin with String] = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typings.ol.iconOriginMod.IconOrigin.BOTTOM_LEFT with String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typings.ol.iconOriginMod.IconOrigin.BOTTOM_RIGHT with String = js.native
    
    /* "top-left" */ val TOP_LEFT: typings.ol.iconOriginMod.IconOrigin.TOP_LEFT with String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typings.ol.iconOriginMod.IconOrigin.TOP_RIGHT with String = js.native
  }
}
