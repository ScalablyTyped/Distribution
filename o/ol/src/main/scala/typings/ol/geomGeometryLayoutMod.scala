package typings.ol

import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/GeometryLayout", JSImport.Namespace)
@js.native
object geomGeometryLayoutMod extends js.Object {
  @js.native
  sealed trait GeometryLayout extends js.Object
  
  @js.native
  object GeometryLayout extends js.Object {
    @js.native
    sealed trait XY extends GeometryLayout
    
    @js.native
    sealed trait XYM extends GeometryLayout
    
    @js.native
    sealed trait XYZ extends GeometryLayout
    
    @js.native
    sealed trait XYZM extends GeometryLayout
    
  }
  
  @js.native
  object default extends js.Object {
    /* "XY" */ val XY: typings.ol.geomGeometryLayoutMod.GeometryLayout.XY with String = js.native
    /* "XYM" */ val XYM: typings.ol.geomGeometryLayoutMod.GeometryLayout.XYM with String = js.native
    /* "XYZ" */ val XYZ: typings.ol.geomGeometryLayoutMod.GeometryLayout.XYZ with String = js.native
    /* "XYZM" */ val XYZM: typings.ol.geomGeometryLayoutMod.GeometryLayout.XYZM with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GeometryLayout with String] = js.native
  }
  
}

