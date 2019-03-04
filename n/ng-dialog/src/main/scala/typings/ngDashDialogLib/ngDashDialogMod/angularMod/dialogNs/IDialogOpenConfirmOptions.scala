package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogOpenConfirmOptions extends IDialogOpenOptions {
  @JSName("scope")
  var scope_IDialogOpenConfirmOptions: js.UndefOr[IDialogConfirmScope] = js.undefined
}

object IDialogOpenConfirmOptions {
  @scala.inline
  def apply(
    template: java.lang.String,
    appendClassName: java.lang.String = null,
    appendTo: java.lang.String = null,
    ariaAuto: js.UndefOr[scala.Boolean] = js.undefined,
    ariaDescribedById: java.lang.String = null,
    ariaDescribedBySelector: java.lang.String = null,
    ariaLabelledById: java.lang.String = null,
    ariaLabelledBySelector: java.lang.String = null,
    ariaRole: java.lang.String = null,
    bindToController: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closeByDocument: js.UndefOr[scala.Boolean] = js.undefined,
    closeByEscape: js.UndefOr[scala.Boolean] = js.undefined,
    closeByNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String | js.Array[_] | js.Any = null,
    controllerAs: java.lang.String = null,
    data: java.lang.String | js.Object | js.Array[_] = null,
    disableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double = null,
    name: java.lang.String | scala.Double = null,
    overlay: js.UndefOr[scala.Boolean] = js.undefined,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    preCloseCallback: java.lang.String | angularLib.angularMod.Global.Function = null,
    preserveFocus: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: org.scalablytyped.runtime.StringDictionary[java.lang.String | angularLib.angularMod.Global.Function] = null,
    scope: IDialogConfirmScope = null,
    showClose: js.UndefOr[scala.Boolean] = js.undefined,
    trapFocus: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null
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

