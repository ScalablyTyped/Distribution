package typings.nivoStream

import typings.nivoStream.anon.BorderColor
import typings.nivoStream.anon.GetBorderColor
import typings.nivoStream.typesMod.StreamDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/stream/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStream[RawDatum /* <: StreamDatum */](
    hasWidthHeightDataKeysLabelValueFormatOffsetTypeOrderCurveColorsBorderColorDotSizeDotColorDotBorderWidthDotBorderColor: BorderColor[RawDatum]
  ): GetBorderColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useStream")(hasWidthHeightDataKeysLabelValueFormatOffsetTypeOrderCurveColorsBorderColorDotSizeDotColorDotBorderWidthDotBorderColor.asInstanceOf[js.Any]).asInstanceOf[GetBorderColor]
}
