package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Options which are provided to open a dialog.
		 */

trait IDialogOpenOptions extends IDialogOptions {
  var bindToController: js.UndefOr[scala.Boolean] = js.undefined
  var controller: js.UndefOr[java.lang.String | js.Array[_] | js.Any] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Any serializable data that you want to be stored in the controller's dialog scope. ($scope.ngDialogData).
  			 * From version 0.3.6 $scope.ngDialogData keeps references to the objects instead of copying them.
  			 */
  var data: js.UndefOr[java.lang.String | js.Object | js.Array[_]] = js.undefined
  /**
  			 * An optional map of dependencies which should be injected into the controller. If any of these dependencies
  			 * are promises, ngDialog will wait for them all to be resolved or one to be rejected before the controller
  			 * is instantiated.
  			 */
  var resolve: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[java.lang.String | angularLib.angularMod.Global.Function]
  ] = js.undefined
  /**
  			 * Scope object that will be passed to dialog. If you use controller with separate $scope service this object will be passed to $scope.$parent param.
  			 */
  var scope: js.UndefOr[IDialogScope] = js.undefined
  var template: java.lang.String
}

