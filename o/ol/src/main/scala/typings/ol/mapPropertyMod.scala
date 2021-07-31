package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapPropertyMod {
  
  @JSImport("ol/MapProperty", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapProperty & String] = js.native
    
    /* "layergroup" */ val LAYERGROUP: typings.ol.mapPropertyMod.MapProperty.LAYERGROUP & String = js.native
    
    /* "size" */ val SIZE: typings.ol.mapPropertyMod.MapProperty.SIZE & String = js.native
    
    /* "target" */ val TARGET: typings.ol.mapPropertyMod.MapProperty.TARGET & String = js.native
    
    /* "view" */ val VIEW: typings.ol.mapPropertyMod.MapProperty.VIEW & String = js.native
  }
  
  @js.native
  sealed trait MapProperty extends StObject
  @JSImport("ol/MapProperty", "MapProperty")
  @js.native
  object MapProperty extends StObject {
    
    @js.native
    sealed trait LAYERGROUP
      extends StObject
         with MapProperty
    
    @js.native
    sealed trait SIZE
      extends StObject
         with MapProperty
    
    @js.native
    sealed trait TARGET
      extends StObject
         with MapProperty
    
    @js.native
    sealed trait VIEW
      extends StObject
         with MapProperty
  }
}
