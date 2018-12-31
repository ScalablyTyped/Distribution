package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Dialog Scope which extends the $scope.
		 */
@js.native
trait IDialogScope
  extends angularLib.angularMod.angularNs.IRootScopeService {
  /**
  			 * Any serializable data that you want to be stored in the controller's dialog scope.
  			 * From version 0.3.6 $scope.ngDialogData keeps references to the objects instead of copying them.
  			 */
  var ngDialogData: java.lang.String | js.Object | js.Array[_] = js.native
  /**
  			 * The id of the dialog. If you you ngDialogData, it'll be also available under ngDialogData.ngDialogId
  			 */
  var ngDialogId: java.lang.String = js.native
  /**
  			 * This allows you to close dialog straight from handler in a popup element.
  			 * @param value Any value passed to this function will be attached to the object which resolves on the close promise for this dialog.
  			 * For dialogs opened with the openConfirm() method the value is used as the reject reason.
  			 */
  def closeThisDialog(): scala.Unit = js.native
  def closeThisDialog(value: js.Any): scala.Unit = js.native
}

