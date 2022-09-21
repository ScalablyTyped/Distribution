package typings.nivoScales.anon

import typings.nivoScales.computeMod.NestedSerie
import typings.nivoScales.computeMod.SerieDatum
import typings.nivoScales.typesMod.ScaleSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[S, D /* <: SerieDatum */](series: js.Array[NestedSerie[S, D]], xScaleSpec: ScaleSpec, yScaleSpec: ScaleSpec): X = js.native
}
