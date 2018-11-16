package typings
package officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButton extends js.Object {
  /**
       * If there is a menu associated with this button and it is visible, this will dismiss the menu
       */
  def dismissMenu(): scala.Unit = js.native
  /**
       * Sets focus to the button.
       */
  def focus(): scala.Unit = js.native
  /**
       * If there is a menu associated with this button and it is visible, this will open the menu.
       * Params are optional overrides to the ones defined in 'menuProps' to apply to just this instance of opening the menu.
       *
       * @param shouldFocusOnContainer - override to the ContextualMenu shouldFocusOnContainer prop.
       * BaseButton implementation defaults to 'undefined'.
       * @param shouldFocusOnMount - override to the ContextualMenu shouldFocusOnMount prop. BaseButton implementation defaults to 'true'.
       */
  def openMenu(): scala.Unit = js.native
  /**
       * If there is a menu associated with this button and it is visible, this will open the menu.
       * Params are optional overrides to the ones defined in 'menuProps' to apply to just this instance of opening the menu.
       *
       * @param shouldFocusOnContainer - override to the ContextualMenu shouldFocusOnContainer prop.
       * BaseButton implementation defaults to 'undefined'.
       * @param shouldFocusOnMount - override to the ContextualMenu shouldFocusOnMount prop. BaseButton implementation defaults to 'true'.
       */
  def openMenu(shouldFocusOnContainer: scala.Boolean): scala.Unit = js.native
  /**
       * If there is a menu associated with this button and it is visible, this will open the menu.
       * Params are optional overrides to the ones defined in 'menuProps' to apply to just this instance of opening the menu.
       *
       * @param shouldFocusOnContainer - override to the ContextualMenu shouldFocusOnContainer prop.
       * BaseButton implementation defaults to 'undefined'.
       * @param shouldFocusOnMount - override to the ContextualMenu shouldFocusOnMount prop. BaseButton implementation defaults to 'true'.
       */
  def openMenu(shouldFocusOnContainer: scala.Boolean, shouldFocusOnMount: scala.Boolean): scala.Unit = js.native
}

