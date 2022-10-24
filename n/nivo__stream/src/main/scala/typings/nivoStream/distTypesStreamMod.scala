package typings.nivoStream

import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamSvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamMod {
  
  @JSImport("@nivo/stream/dist/types/Stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Stream[RawDatum /* <: StreamDatum */](param0: StreamSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Stream")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
