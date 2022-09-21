package typings.nivoWaffle

import typings.nivoWaffle.typesTypesMod.Datum
import typings.nivoWaffle.typesTypesMod.HtmlProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waffleHtmlMod {
  
  @JSImport("@nivo/waffle/dist/types/WaffleHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RawDatum /* <: Datum */](props: HtmlProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
