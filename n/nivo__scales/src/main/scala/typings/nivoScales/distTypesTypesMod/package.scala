package typings.nivoScales.distTypesTypesMod

import typings.nivoScales.anon.`2`
import typings.nivoScales.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.nivoScales.distTypesTypesMod.NumericValue
  - typings.nivoScales.distTypesTypesMod.StringValue
  - js.Date
*/
type ScaleValue = _ScaleValue | js.Date

type ScaleWithBandwidth = ScaleBand[Any] | ScalePoint[Any]

type SerieAxis[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] = js.Array[`2`[Axis, Value]]

type Series[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] = js.Array[`3`[XValue, YValue]]

type TicksSpec[Value /* <: ScaleValue */] = Double | String | js.Array[Value]
