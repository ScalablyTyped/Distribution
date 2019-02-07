package typings
package officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupHeaderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupHeaderProps
  extends officeDashUiDashFabricDashReactLib.libComponentsGroupedListGroupedListDotTypesMod.IGroupDividerProps {
  /**
    * GroupedList id for aria-controls
    */
  var groupedListId: js.UndefOr[java.lang.String] = js.undefined
  /** Native props for the GroupHeader select all button */
  var selectAllButtonProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLButtonElement]] = js.undefined
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]
  ] = js.undefined
}

