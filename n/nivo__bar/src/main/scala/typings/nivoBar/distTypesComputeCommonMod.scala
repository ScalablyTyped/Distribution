package typings.nivoBar

import typings.nivoBar.nivoBarBooleans.`false`
import typings.nivoBar.nivoBarInts.`0`
import typings.nivoBar.nivoBarStrings._empty
import typings.nivoBar.nivoBarStrings.x
import typings.nivoBar.nivoBarStrings.y
import typings.nivoScales.distTypesTypesMod.ScaleBand
import typings.nivoScales.distTypesTypesMod.ScaleBandSpec
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeCommonMod {
  
  @JSImport("@nivo/bar/dist/types/compute/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coerceValue[T](value: T): js.Tuple2[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, Double]]
  
  inline def filterNullValues[RawDatum /* <: Record[String, Any] */](data: RawDatum): Exclude[RawDatum, js.UndefOr[`false` | _empty | `0` | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterNullValues")(data.asInstanceOf[js.Any]).asInstanceOf[Exclude[RawDatum, js.UndefOr[`false` | _empty | `0` | Null]]]
  
  inline def getIndexScale[RawDatum](
    data: js.Array[RawDatum],
    getIndex: js.Function1[/* datum */ RawDatum, String],
    padding: Double,
    indexScale: ScaleBandSpec,
    size: Double,
    axis: x | y
  ): ScaleBand[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndexScale")(data.asInstanceOf[js.Any], getIndex.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], indexScale.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleBand[String]]
  
  inline def normalizeData[RawDatum](data: js.Array[RawDatum], keys: js.Array[String]): js.Array[RawDatum] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[RawDatum]]
}
