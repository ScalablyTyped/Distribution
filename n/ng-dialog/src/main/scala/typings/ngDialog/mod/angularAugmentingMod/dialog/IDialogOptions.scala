package typings.ngDialog.mod.angularAugmentingMod.dialog

import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogOptions extends js.Object {
  /**
    * Unlike the className property, which overrides any default classes specified through the setDefaults() method (see docs), appendClassName allows for the addition of a class on top of any defaults.
    */
  var appendClassName: js.UndefOr[String] = js.native
  /**
    * Specify your element where to append dialog instance, accepts selector string (e.g. #yourId, .yourClass).
    * If not specified appends dialog to body as default behavior.
    */
  var appendTo: js.UndefOr[String] = js.native
  /**
    * When true, automatically selects appropriate values for any unspecified accessibility attributes. Default value is true
    */
  var ariaAuto: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the value for the aria-describedby attribute that should be applied to the dialog element. Default value is null (unspecified)
    *
    * If specified, the value is not validated against the DOM.
    */
  var ariaDescribedById: js.UndefOr[String] = js.native
  /**
    * Specifies the CSS selector for the element to be referenced by the aria-describedby attribute on the dialog element. Default value is null (unspecified)
    *
    * If specified, the first matching element is used.
    */
  var ariaDescribedBySelector: js.UndefOr[String] = js.native
  /**
    * Specifies the value for the aria-labelledby attribute that should be applied to the dialog element.
    * Default value is null (unspecified)
    *
    * If specified, the value is not validated against the DOM
    */
  var ariaLabelledById: js.UndefOr[String] = js.native
  /**
    * Specifies the CSS selector for the element to be referenced by the aria-labelledby attribute on the dialog element. Default value is null (unspecified)
    *
    * If specified, the first matching element is used.
    */
  var ariaLabelledBySelector: js.UndefOr[String] = js.native
  /**
    * Specifies the value for the role attribute that should be applied to the dialog element. Default value is null (unspecified)
    */
  var ariaRole: js.UndefOr[String] = js.native
  /**
    * Pass false to disable template caching. Useful for developing purposes, default is true.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * This option allows you to control the dialog's look, you can use built-in themes or create your own styled modals.
    * It will be appended with the "ngdialog" class e.g. className is "default-theme flat-ui" it will be class="ngdialog default-theme flat-ui".
    */
  var className: js.UndefOr[String] = js.native
  /**
    * It allows to close modals by clicking on overlay background, default true. If @see Hammer.js is loaded, it will listen for tap instead of click.
    */
  var closeByDocument: js.UndefOr[Boolean] = js.native
  /**
    * It allows to close modals by clicking Esc button, default true.
    * This will close all open modals if there several of them open at the same time.
    */
  var closeByEscape: js.UndefOr[Boolean] = js.native
  /**
    * Listens for $locationChangeSuccess event and closes open dialogs if true (also handles the ui.router $stateChangeSuccess event if ui.router is used)
    * default : false
    */
  var closeByNavigation: js.UndefOr[Boolean] = js.native
  /**
    * If true then animation for the dialog will be disabled, default false.
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the height of the dialog content element. Default value is null (unspecified)
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Give a name for a dialog instance. It is useful for identifying specific dialog if there are multiple dialog boxes opened.
    */
  var name: js.UndefOr[String | Double] = js.native
  /**
    * If false it allows to hide overlay div behind the modals, default true.
    */
  var overlay: js.UndefOr[Boolean] = js.native
  /**
    * If true allows to use plain string as template, default false.
    */
  var plain: js.UndefOr[Boolean] = js.native
  /**
    * Provide either the name of a function or a function to be called before the dialog is closed.
    * If the callback function specified in the option returns false then the dialog will not be closed.
    * Alternatively, if the callback function returns a promise that gets resolved the dialog will be closed.
    *
    * more: https://github.com/likeastore/ngDialog#preclosecallback-string--function
    */
  var preCloseCallback: js.UndefOr[String | Function] = js.native
  /**
    * When true, closing the dialog restores focus to the element that launched it. Designed to improve keyboard
    * accessibility. Default value is true
    */
  var preserveFocus: js.UndefOr[Boolean] = js.native
  /**
    * If false it allows to hide close button on modals, default true.
    */
  var showClose: js.UndefOr[Boolean] = js.native
  /**
    * When true, ensures that the focused element remains within the dialog to conform to accessibility recommendations.
    * Default value is true
    */
  var trapFocus: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the width of the dialog content element. Default value is null (unspecified)
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IDialogOptions {
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  @scala.inline
  implicit class IDialogOptionsOps[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendClassName(value: String): Self = this.set("appendClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendClassName: Self = this.set("appendClassName", js.undefined)
    @scala.inline
    def setAppendTo(value: String): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAriaAuto(value: Boolean): Self = this.set("ariaAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaAuto: Self = this.set("ariaAuto", js.undefined)
    @scala.inline
    def setAriaDescribedById(value: String): Self = this.set("ariaDescribedById", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescribedById: Self = this.set("ariaDescribedById", js.undefined)
    @scala.inline
    def setAriaDescribedBySelector(value: String): Self = this.set("ariaDescribedBySelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescribedBySelector: Self = this.set("ariaDescribedBySelector", js.undefined)
    @scala.inline
    def setAriaLabelledById(value: String): Self = this.set("ariaLabelledById", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledById: Self = this.set("ariaLabelledById", js.undefined)
    @scala.inline
    def setAriaLabelledBySelector(value: String): Self = this.set("ariaLabelledBySelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBySelector: Self = this.set("ariaLabelledBySelector", js.undefined)
    @scala.inline
    def setAriaRole(value: String): Self = this.set("ariaRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaRole: Self = this.set("ariaRole", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseByDocument(value: Boolean): Self = this.set("closeByDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseByDocument: Self = this.set("closeByDocument", js.undefined)
    @scala.inline
    def setCloseByEscape(value: Boolean): Self = this.set("closeByEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseByEscape: Self = this.set("closeByEscape", js.undefined)
    @scala.inline
    def setCloseByNavigation(value: Boolean): Self = this.set("closeByNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseByNavigation: Self = this.set("closeByNavigation", js.undefined)
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setName(value: String | Double): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setPreCloseCallback(value: String | Function): Self = this.set("preCloseCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreCloseCallback: Self = this.set("preCloseCallback", js.undefined)
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = this.set("preserveFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveFocus: Self = this.set("preserveFocus", js.undefined)
    @scala.inline
    def setShowClose(value: Boolean): Self = this.set("showClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowClose: Self = this.set("showClose", js.undefined)
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

