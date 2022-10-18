package typings.nivoWaffle

import typings.nivoWaffle.distTypesTypesMod.CanvasProps
import typings.nivoWaffle.distTypesTypesMod.Datum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWaffleCanvasMod {
  
  @JSImport("@nivo/waffle/dist/types/WaffleCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RawDatum /* <: Datum */](props: CanvasProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
