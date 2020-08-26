package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.officeUiFabricReactStrings.absolute
import typings.officeUiFabricReact.officeUiFabricReactStrings.relative
import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricStyling.igetfocusstylesMod.IGetFocusStylesOptions
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "getFocusStyle")
@js.native
object getFocusStyle extends js.Object {
  def apply(theme: ITheme): IRawStyle = js.native
  def apply(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative | absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def apply(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
}

