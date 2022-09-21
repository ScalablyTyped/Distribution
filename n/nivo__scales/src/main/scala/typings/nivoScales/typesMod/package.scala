package typings.nivoScales.typesMod

import typings.nivoScales.anon.`1`
import typings.nivoScales.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.nivoScales.typesMod.NumericValue
  - typings.nivoScales.typesMod.StringValue
  - js.Date
*/
type ScaleValue = _ScaleValue | js.Date

type ScaleWithBandwidth = ScaleBand[Any] | ScalePoint[Any]

type SerieAxis[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] = js.Array[`2`[Axis, Value]]

type Series[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] = js.Array[`1`[XValue, YValue]]

type TicksSpec[Value /* <: ScaleValue */] = Double | String | js.Array[Value]
