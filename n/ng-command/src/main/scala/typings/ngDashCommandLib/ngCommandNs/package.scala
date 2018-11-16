package typings
package ngDashCommandLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngCommandNs {
  /**
  	* Command factory which creates instances of @see ICommand.
  	*/
  type ICommandFactory = js.Function3[
    /* $scope */ angularLib.angularMod.angularNs.IScope, 
    /* execute */ js.Function0[angularLib.angularMod.angularNs.IPromise[js.Any]], 
    /* canExecute */ js.UndefOr[js.Function0[scala.Boolean]], 
    ICommand
  ]
}
