package typings.ngDashDialog.ngDashDialogMod.angularMod.dialog

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogOpenConfirmOptions
  extends typings.ngDashDialog.ngDashDialogMod.angularMod.dialog.IDialogOpenOptions {
  @JSName("scope")
  var scope_IDialogOpenConfirmOptions: js.UndefOr[typings.ngDashDialog.ngDashDialogMod.angularMod.dialog.IDialogConfirmScope] = js.undefined
}

object IDialogOpenConfirmOptions {
  @scala.inline
  def apply(
    template: String,
    appendClassName: String = null,
    appendTo: String = null,
    ariaAuto: js.UndefOr[Boolean] = js.undefined,
    ariaDescribedById: String = null,
    ariaDescribedBySelector: String = null,
    ariaLabelledById: String = null,
    ariaLabelledBySelector: String = null,
    ariaRole: String = null,
    bindToController: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeByDocument: js.UndefOr[Boolean] = js.undefined,
    closeByEscape: js.UndefOr[Boolean] = js.undefined,
    closeByNavigation: js.UndefOr[Boolean] = js.undefined,
    controller: String | js.Array[_] | js.Any = null,
    controllerAs: String = null,
    data: String | js.Object | js.Array[_] = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    name: String | Double = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    preCloseCallback: String | Function = null,
    preserveFocus: js.UndefOr[Boolean] = js.undefined,
    resolve: StringDictionary[String | Function] = null,
    scope: typings.ngDashDialog.ngDashDialogMod.angularMod.dialog.IDialogConfirmScope = null,
    showClose: js.UndefOr[Boolean] = js.undefined,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null
  ): IDialogOpenConfirmOptions = {
    val __obj = js.Dynamic.literal(template = template)
    if (appendClassName != null) __obj.updateDynamic("appendClassName")(appendClassName)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(ariaAuto)) __obj.updateDynamic("ariaAuto")(ariaAuto)
    if (ariaDescribedById != null) __obj.updateDynamic("ariaDescribedById")(ariaDescribedById)
    if (ariaDescribedBySelector != null) __obj.updateDynamic("ariaDescribedBySelector")(ariaDescribedBySelector)
    if (ariaLabelledById != null) __obj.updateDynamic("ariaLabelledById")(ariaLabelledById)
    if (ariaLabelledBySelector != null) __obj.updateDynamic("ariaLabelledBySelector")(ariaLabelledBySelector)
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole)
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeByDocument)) __obj.updateDynamic("closeByDocument")(closeByDocument)
    if (!js.isUndefined(closeByEscape)) __obj.updateDynamic("closeByEscape")(closeByEscape)
    if (!js.isUndefined(closeByNavigation)) __obj.updateDynamic("closeByNavigation")(closeByNavigation)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (preCloseCallback != null) __obj.updateDynamic("preCloseCallback")(preCloseCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose)
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOpenConfirmOptions]
  }
}

