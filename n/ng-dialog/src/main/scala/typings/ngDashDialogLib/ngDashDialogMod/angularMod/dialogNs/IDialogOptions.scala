package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDialogOptions extends js.Object {
  /**
  			 * Unlike the className property, which overrides any default classes specified through the setDefaults() method (see docs), appendClassName allows for the addition of a class on top of any defaults.
  			 */
  var appendClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Specify your element where to append dialog instance, accepts selector string (e.g. #yourId, .yourClass).
  			 * If not specified appends dialog to body as default behavior.
  			 */
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * When true, automatically selects appropriate values for any unspecified accessibility attributes. Default value is true
  			 */
  var ariaAuto: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Specifies the value for the aria-describedby attribute that should be applied to the dialog element. Default value is null (unspecified)
  			 *
  			 * If specified, the value is not validated against the DOM.
  			 */
  var ariaDescribedById: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Specifies the CSS selector for the element to be referenced by the aria-describedby attribute on the dialog element. Default value is null (unspecified)
  		 *
  		 * If specified, the first matching element is used.
  		 */
  var ariaDescribedBySelector: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Specifies the value for the aria-labelledby attribute that should be applied to the dialog element.
  			 * Default value is null (unspecified)
  			 *
  			 * If specified, the value is not validated against the DOM
  			 */
  var ariaLabelledById: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Specifies the CSS selector for the element to be referenced by the aria-labelledby attribute on the dialog element. Default value is null (unspecified)
  			 *
  			 * If specified, the first matching element is used.
  			 */
  var ariaLabelledBySelector: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Specifies the value for the role attribute that should be applied to the dialog element. Default value is null (unspecified)
  			 */
  var ariaRole: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Pass false to disable template caching. Useful for developing purposes, default is true.
  			 */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * This option allows you to control the dialog's look, you can use built-in themes or create your own styled modals.
  			 * It will be appended with the "ngdialog" class e.g. className is "default-theme flat-ui" it will be class="ngdialog default-theme flat-ui".
  			 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * It allows to close modals by clicking on overlay background, default true. If @see Hammer.js is loaded, it will listen for tap instead of click.
  			 */
  var closeByDocument: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * It allows to close modals by clicking Esc button, default true.
  			 * This will close all open modals if there several of them open at the same time.
  			 */
  var closeByEscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Listens for $locationChangeSuccess event and closes open dialogs if true (also handles the ui.router $stateChangeSuccess event if ui.router is used)
  			 * default : false
  			 */
  var closeByNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * If true then animation for the dialog will be disabled, default false.
  			 */
  var disableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Specifies the height of the dialog content element. Default value is null (unspecified)
  		 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  			 * Give a name for a dialog instance. It is useful for identifying specific dialog if there are multiple dialog boxes opened.
  			 */
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  			 * If false it allows to hide overlay div behind the modals, default true.
  			 */
  var overlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * If true allows to use plain string as template, default false.
  			 */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Provide either the name of a function or a function to be called before the dialog is closed.
  			 * If the callback function specified in the option returns false then the dialog will not be closed.
  			 * Alternatively, if the callback function returns a promise that gets resolved the dialog will be closed.
  			 *
  			 * more: https://github.com/likeastore/ngDialog#preclosecallback-string--function
  			 */
  var preCloseCallback: js.UndefOr[java.lang.String | angularLib.angularMod.Global.Function] = js.undefined
  /**
  			 * When true, closing the dialog restores focus to the element that launched it. Designed to improve keyboard
  			 * accessibility. Default value is true
  			 */
  var preserveFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * If false it allows to hide close button on modals, default true.
  			 */
  var showClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * When true, ensures that the focused element remains within the dialog to conform to accessibility recommendations.
  			 * Default value is true
  			 */
  var trapFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Specifies the width of the dialog content element. Default value is null (unspecified)
  		 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

