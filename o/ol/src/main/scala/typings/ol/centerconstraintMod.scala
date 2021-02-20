package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object centerconstraintMod {
  
  @JSImport("ol/centerconstraint", "createExtent")
  @js.native
  def createExtent(extent: Extent, onlyCenter: Boolean, smooth: Boolean): Type = js.native
  
  @JSImport("ol/centerconstraint", "none")
  @js.native
  def none(): js.UndefOr[Coordinate] = js.native
  @JSImport("ol/centerconstraint", "none")
  @js.native
  def none(center: Coordinate): js.UndefOr[Coordinate] = js.native
  
  type Type = js.Function4[
    /* p0 */ js.UndefOr[Coordinate], 
    /* p1 */ Double, 
    /* p2 */ Size, 
    /* p3 */ js.UndefOr[Boolean], 
    js.UndefOr[Coordinate]
  ]
}
