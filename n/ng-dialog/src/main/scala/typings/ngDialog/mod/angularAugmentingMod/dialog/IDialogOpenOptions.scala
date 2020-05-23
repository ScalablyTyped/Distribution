package typings.ngDialog.mod.angularAugmentingMod.dialog

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are provided to open a dialog.
  */
trait IDialogOpenOptions extends IDialogOptions {
  var bindToController: js.UndefOr[Boolean] = js.undefined
  var controller: js.UndefOr[String | js.Array[_] | js.Any] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
  /**
    * Any serializable data that you want to be stored in the controller's dialog scope. ($scope.ngDialogData).
    * From version 0.3.6 $scope.ngDialogData keeps references to the objects instead of copying them.
    */
  var data: js.UndefOr[String | js.Object | js.Array[_]] = js.undefined
  /**
    * An optional map of dependencies which should be injected into the controller. If any of these dependencies
    * are promises, ngDialog will wait for them all to be resolved or one to be rejected before the controller
    * is instantiated.
    */
  var resolve: js.UndefOr[StringDictionary[String | Function]] = js.undefined
  /**
    * Scope object that will be passed to dialog. If you use controller with separate $scope service this object will be passed to $scope.$parent param.
    */
  var scope: js.UndefOr[IDialogScope] = js.undefined
  var template: String
}

object IDialogOpenOptions {
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
    scope: IDialogScope = null,
    showClose: js.UndefOr[Boolean] = js.undefined,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null
  ): IDialogOpenOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (appendClassName != null) __obj.updateDynamic("appendClassName")(appendClassName.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaAuto)) __obj.updateDynamic("ariaAuto")(ariaAuto.get.asInstanceOf[js.Any])
    if (ariaDescribedById != null) __obj.updateDynamic("ariaDescribedById")(ariaDescribedById.asInstanceOf[js.Any])
    if (ariaDescribedBySelector != null) __obj.updateDynamic("ariaDescribedBySelector")(ariaDescribedBySelector.asInstanceOf[js.Any])
    if (ariaLabelledById != null) __obj.updateDynamic("ariaLabelledById")(ariaLabelledById.asInstanceOf[js.Any])
    if (ariaLabelledBySelector != null) __obj.updateDynamic("ariaLabelledBySelector")(ariaLabelledBySelector.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByDocument)) __obj.updateDynamic("closeByDocument")(closeByDocument.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByEscape)) __obj.updateDynamic("closeByEscape")(closeByEscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByNavigation)) __obj.updateDynamic("closeByNavigation")(closeByNavigation.get.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    if (preCloseCallback != null) __obj.updateDynamic("preCloseCallback")(preCloseCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.get.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOpenOptions]
  }
}

