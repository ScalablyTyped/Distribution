package typings.nivoStream

import typings.nivoStream.anon.BorderColor
import typings.nivoStream.anon.GetBorderColor
import typings.nivoStream.distTypesTypesMod.StreamDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/stream/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStream[RawDatum /* <: StreamDatum */](param0: BorderColor[RawDatum]): GetBorderColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useStream")(param0.asInstanceOf[js.Any]).asInstanceOf[GetBorderColor]
}
