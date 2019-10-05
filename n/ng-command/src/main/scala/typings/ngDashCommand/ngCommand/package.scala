package typings.ngDashCommand

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngCommand {
  import typings.angular.angularMod.IPromise
  import typings.angular.angularMod.IScope

  /**
  	* Command factory which creates instances of @see ICommand.
  	*/
  type ICommandFactory = js.Function3[
    /* $scope */ IScope, 
    /* execute */ js.Function0[IPromise[js.Any]], 
    /* canExecute */ js.UndefOr[js.Function0[Boolean]], 
    ICommand
  ]
}
