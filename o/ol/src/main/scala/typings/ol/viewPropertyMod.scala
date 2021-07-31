package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewPropertyMod {
  
  @JSImport("ol/ViewProperty", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ViewProperty & String] = js.native
    
    /* "center" */ val CENTER: typings.ol.viewPropertyMod.ViewProperty.CENTER & String = js.native
    
    /* "resolution" */ val RESOLUTION: typings.ol.viewPropertyMod.ViewProperty.RESOLUTION & String = js.native
    
    /* "rotation" */ val ROTATION: typings.ol.viewPropertyMod.ViewProperty.ROTATION & String = js.native
  }
  
  @js.native
  sealed trait ViewProperty extends StObject
  @JSImport("ol/ViewProperty", "ViewProperty")
  @js.native
  object ViewProperty extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with ViewProperty
    
    @js.native
    sealed trait RESOLUTION
      extends StObject
         with ViewProperty
    
    @js.native
    sealed trait ROTATION
      extends StObject
         with ViewProperty
  }
}
