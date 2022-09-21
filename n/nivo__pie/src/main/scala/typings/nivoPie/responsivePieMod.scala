package typings.nivoPie

import typings.nivoPie.nivoPieStrings.height
import typings.nivoPie.nivoPieStrings.width
import typings.nivoPie.typesMod.PieSvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsivePieMod {
  
  @JSImport("@nivo/pie/dist/types/ResponsivePie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsivePie[RawDatum](props: Omit[PieSvgProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsivePie")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
