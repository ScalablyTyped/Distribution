package typings.nivoCirclePacking

import typings.nivoCirclePacking.typesMod.LabelProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelHtmlMod {
  
  @JSImport("@nivo/circle-packing/dist/types/LabelHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LabelHtml[RawDatum](hasNodeLabelStyle: LabelProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LabelHtml")(hasNodeLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
}
