package typings.nivoScales.distTypesTypesMod

import typings.nivoScales.anon.`1`
import typings.nivoScales.anon.`2`
import typings.nivoScales.nivoScalesStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Axis extends 'x' ? 'y' : 'x'
  }}}
  */
type OtherScaleAxis[Axis /* <: ScaleAxis */] = y

/* Rewritten from type alias, can be one of: 
  - typings.nivoScales.distTypesTypesMod.NumericValue
  - typings.nivoScales.distTypesTypesMod.StringValue
  - js.Date
*/
type ScaleValue = _ScaleValue | js.Date

type ScaleWithBandwidth = ScaleBand[Any] | ScalePoint[Any]

type SerieAxis[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] = js.Array[`2`[Axis, Value]]

type Series[XValue /* <: ScaleValue */, YValue /* <: ScaleValue */] = js.Array[`1`[XValue, YValue]]

type TicksSpec[Value /* <: ScaleValue */] = Double | String | js.Array[Value]
