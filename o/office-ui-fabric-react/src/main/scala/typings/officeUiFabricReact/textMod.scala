package typings.officeUiFabricReact

import typings.officeUiFabricReact.textTypesMod.ITextProps
import typings.officeUiFabricReact.textTypesMod.ITextStyles
import typings.officeUiFabricReact.textTypesMod.ITextTokens
import typings.react.mod.StatelessComponent
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.IViewComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  val Text: StatelessComponent[ITextProps] = js.native
  val TextStyles: IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles] = js.native
  val TextView: IViewComponent[ITextProps] = js.native
}

