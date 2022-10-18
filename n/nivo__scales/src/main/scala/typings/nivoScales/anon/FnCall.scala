package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.NestedSerie
import typings.nivoScales.distTypesComputeMod.SerieDatum
import typings.nivoScales.distTypesTypesMod.ScaleSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[S, D /* <: SerieDatum */](series: js.Array[NestedSerie[S, D]], xScaleSpec: ScaleSpec, yScaleSpec: ScaleSpec): Y = js.native
}
