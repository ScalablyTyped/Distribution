package typings.nivoStream

import typings.nivoStream.typesMod.StreamDatum
import typings.nivoStream.typesMod.StreamSvgProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("@nivo/stream/dist/types/Stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Stream[RawDatum /* <: StreamDatum */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: StreamSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Stream")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
