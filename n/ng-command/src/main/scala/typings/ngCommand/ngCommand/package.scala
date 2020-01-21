package typings.ngCommand

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngCommand {
  /**
  	* Command factory which creates instances of @see ICommand.
  	*/
  type ICommandFactory = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ /* $scope */ js.Any, 
    /* execute */ js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any
    ], 
    /* canExecute */ js.UndefOr[js.Function0[scala.Boolean]], 
    typings.ngCommand.ngCommand.ICommand
  ]
}
