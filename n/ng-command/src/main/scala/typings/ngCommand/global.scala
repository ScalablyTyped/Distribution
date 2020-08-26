package typings.ngCommand

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object ngCommand extends js.Object {
    @js.native
    class Command protected ()
      extends typings.ngCommand.ngCommand.Command {
      def this(
        $scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ js.Any,
        execute: js.Function0[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ _
              ]
      ) = this()
      def this(
        $scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ js.Any,
        execute: js.Function0[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ _
              ],
        canExecute: js.Function0[Boolean]
      ) = this()
    }
    
    var ModuleName: String = js.native
    /* static members */
    @js.native
    object Command extends js.Object {
      var id: String = js.native
    }
    
  }
  
}

