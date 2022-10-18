package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconOriginMod {
  
  @JSImport("ol/style/IconOrigin", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconOrigin & String] = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typings.ol.styleIconOriginMod.IconOrigin.BOTTOM_LEFT & String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typings.ol.styleIconOriginMod.IconOrigin.BOTTOM_RIGHT & String = js.native
    
    /* "top-left" */ val TOP_LEFT: typings.ol.styleIconOriginMod.IconOrigin.TOP_LEFT & String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typings.ol.styleIconOriginMod.IconOrigin.TOP_RIGHT & String = js.native
  }
  
  @js.native
  sealed trait IconOrigin extends StObject
  @JSImport("ol/style/IconOrigin", "IconOrigin")
  @js.native
  object IconOrigin extends StObject {
    
    @js.native
    sealed trait BOTTOM_LEFT
      extends StObject
         with IconOrigin
    
    @js.native
    sealed trait BOTTOM_RIGHT
      extends StObject
         with IconOrigin
    
    @js.native
    sealed trait TOP_LEFT
      extends StObject
         with IconOrigin
    
    @js.native
    sealed trait TOP_RIGHT
      extends StObject
         with IconOrigin
  }
}
