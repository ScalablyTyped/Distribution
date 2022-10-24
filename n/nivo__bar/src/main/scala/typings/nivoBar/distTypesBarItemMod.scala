package typings.nivoBar

import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.BarItemProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarItemMod {
  
  @JSImport("@nivo/bar/dist/types/BarItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BarItem[RawDatum /* <: BarDatum */](param0: BarItemProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BarItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
