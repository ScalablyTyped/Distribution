package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryLayoutMod {
  
  @JSImport("ol/geom/GeometryLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GeometryLayout with String] = js.native
    
    /* "XY" */ val XY: typings.ol.geometryLayoutMod.GeometryLayout.XY with String = js.native
    
    /* "XYM" */ val XYM: typings.ol.geometryLayoutMod.GeometryLayout.XYM with String = js.native
    
    /* "XYZ" */ val XYZ: typings.ol.geometryLayoutMod.GeometryLayout.XYZ with String = js.native
    
    /* "XYZM" */ val XYZM: typings.ol.geometryLayoutMod.GeometryLayout.XYZM with String = js.native
  }
  
  @js.native
  sealed trait GeometryLayout extends StObject
  @JSImport("ol/geom/GeometryLayout", "GeometryLayout")
  @js.native
  object GeometryLayout extends StObject {
    
    @js.native
    sealed trait XY extends GeometryLayout
    
    @js.native
    sealed trait XYM extends GeometryLayout
    
    @js.native
    sealed trait XYZ extends GeometryLayout
    
    @js.native
    sealed trait XYZM extends GeometryLayout
  }
}
