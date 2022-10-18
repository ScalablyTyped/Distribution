package typings.nivoStream

import typings.nivoStream.distTypesTypesMod.StreamDatum
import typings.nivoStream.distTypesTypesMod.StreamSvgProps
import typings.nivoStream.nivoStreamStrings.height
import typings.nivoStream.nivoStreamStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveStreamMod {
  
  @JSImport("@nivo/stream/dist/types/ResponsiveStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveStream[RawDatum /* <: StreamDatum */](props: Omit[StreamSvgProps[RawDatum], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveStream")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
