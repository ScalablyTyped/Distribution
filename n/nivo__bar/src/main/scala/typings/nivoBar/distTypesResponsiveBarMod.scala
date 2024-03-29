package typings.nivoBar

import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarSvgProps
import typings.nivoBar.nivoBarStrings.height
import typings.nivoBar.nivoBarStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveBarMod {
  
  @JSImport("@nivo/bar/dist/types/ResponsiveBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveBar[RawDatum /* <: BarDatum */](props: Omit[BarSvgProps[RawDatum], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
