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
  
  @scala.inline
  def createExtent(extent: Extent, onlyCenter: Boolean, smooth: Boolean): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("createExtent")(extent.asInstanceOf[js.Any], onlyCenter.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  @scala.inline
  def none(): js.UndefOr[Coordinate] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[js.UndefOr[Coordinate]]
  @scala.inline
  def none(center: Coordinate): js.UndefOr[Coordinate] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(center.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Coordinate]]
  
  type Type = js.Function4[
    /* p0 */ js.UndefOr[Coordinate], 
    /* p1 */ Double, 
    /* p2 */ Size, 
    /* p3 */ js.UndefOr[Boolean], 
    js.UndefOr[Coordinate]
  ]
}
