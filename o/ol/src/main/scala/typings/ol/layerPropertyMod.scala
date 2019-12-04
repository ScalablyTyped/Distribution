package typings.ol

import typings.ol.layerPropertyMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/Property", JSImport.Namespace)
@js.native
object layerPropertyMod extends js.Object {
  @js.native
  sealed trait Property extends js.Object
  
  @js.native
  object Property extends js.Object {
    @js.native
    sealed trait EXTENT extends Property
    
    @js.native
    sealed trait MAX_RESOLUTION extends Property
    
    @js.native
    sealed trait MIN_RESOLUTION extends Property
    
    @js.native
    sealed trait OPACITY extends Property
    
    @js.native
    sealed trait SOURCE extends Property
    
    @js.native
    sealed trait VISIBLE extends Property
    
    @js.native
    sealed trait Z_INDEX extends Property
    
  }
  
  @js.native
  object default extends js.Object {
    /* "extent" */ val EXTENT: typings.ol.layerPropertyMod.Property.EXTENT with String = js.native
    /* "maxResolution" */ val MAX_RESOLUTION: typings.ol.layerPropertyMod.Property.MAX_RESOLUTION with String = js.native
    /* "minResolution" */ val MIN_RESOLUTION: typings.ol.layerPropertyMod.Property.MIN_RESOLUTION with String = js.native
    /* "opacity" */ val OPACITY: typings.ol.layerPropertyMod.Property.OPACITY with String = js.native
    /* "source" */ val SOURCE: typings.ol.layerPropertyMod.Property.SOURCE with String = js.native
    /* "visible" */ val VISIBLE: typings.ol.layerPropertyMod.Property.VISIBLE with String = js.native
    /* "zIndex" */ val Z_INDEX: typings.ol.layerPropertyMod.Property.Z_INDEX with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Property with String] = js.native
  }
  
}

