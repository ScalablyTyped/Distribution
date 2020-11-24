package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object styleStyleMod {
  
  type GeometryFunction = js.Function1[
    /* p0 */ typings.ol.olFeatureMod.FeatureLike, 
    js.UndefOr[typings.ol.geometryMod.default | typings.ol.renderFeatureMod.default]
  ]
  
  type RenderFunction = js.Function2[
    /* p0 */ typings.ol.coordinateMod.Coordinate | (js.Array[
      js.Array[typings.ol.coordinateMod.Coordinate] | typings.ol.coordinateMod.Coordinate
    ]), 
    /* p1 */ typings.ol.renderMod.State, 
    scala.Unit
  ]
  
  type StyleFunction = js.Function2[
    /* p0 */ typings.ol.olFeatureMod.FeatureLike, 
    /* p1 */ scala.Double, 
    typings.ol.styleStyleMod.Style | js.Array[typings.ol.styleStyleMod.Style]
  ]
  
  type StyleLike = typings.ol.styleStyleMod.Style | js.Array[typings.ol.styleStyleMod.Style] | typings.ol.styleStyleMod.StyleFunction
}
