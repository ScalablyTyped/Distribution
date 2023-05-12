package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object centerconstraintMod {
  
  @JSImport("ol/centerconstraint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createExtent(extent: Extent, onlyCenter: Boolean, smooth: Boolean): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("createExtent")(extent.asInstanceOf[js.Any], onlyCenter.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def none(): js.UndefOr[Coordinate] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[js.UndefOr[Coordinate]]
  inline def none(center: Coordinate): js.UndefOr[Coordinate] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(center.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Coordinate]]
  
  type Type = js.Function5[
    /* arg0 */ js.UndefOr[Coordinate], 
    /* arg1 */ Double, 
    /* arg2 */ Size, 
    /* arg3 */ js.UndefOr[Boolean], 
    /* arg4 */ js.UndefOr[js.Array[Double]], 
    js.UndefOr[Coordinate]
  ]
}
