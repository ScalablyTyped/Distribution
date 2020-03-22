package typings.officeUiFabricReact

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SearchBox/SearchBox.types.ISearchBoxProps, 'disableAnimation' | 'clearButtonProps'> */
trait PickISearchBoxPropsdisabl extends js.Object {
  var clearButtonProps: js.UndefOr[IButtonProps] = js.undefined
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
}

object PickISearchBoxPropsdisabl {
  @scala.inline
  def apply(clearButtonProps: IButtonProps = null, disableAnimation: js.UndefOr[Boolean] = js.undefined): PickISearchBoxPropsdisabl = {
    val __obj = js.Dynamic.literal()
    if (clearButtonProps != null) __obj.updateDynamic("clearButtonProps")(clearButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickISearchBoxPropsdisabl]
  }
}

