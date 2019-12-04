package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Controller extends js.Object {
  var controller: String
  var controllerAs: String
  var replace: Boolean
  var restrict: String
  var scope: Boolean
  var templateUrl: js.Any
}

object Anon_Controller {
  @scala.inline
  def apply(
    controller: String,
    controllerAs: String,
    replace: Boolean,
    restrict: String,
    scope: Boolean,
    templateUrl: js.Any
  ): Anon_Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], controllerAs = controllerAs.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], restrict = restrict.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Controller]
  }
}

