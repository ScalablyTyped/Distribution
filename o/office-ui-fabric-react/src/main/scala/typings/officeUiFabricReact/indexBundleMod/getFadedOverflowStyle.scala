package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.horizontal
import typings.officeUiFabricReact.officeUiFabricReactStrings.vertical
import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "getFadedOverflowStyle")
@js.native
object getFadedOverflowStyle extends js.Object {
  def apply(
    theme: ITheme,
    color: js.UndefOr[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 124 */ js.Any
    ],
    direction: js.UndefOr[horizontal | vertical],
    width: js.UndefOr[String | Double],
    height: js.UndefOr[String | Double]
  ): IRawStyle = js.native
}

