package typings.ngTable.ngTableSelectFilterDsDirectiveMod

import typings.angular.mod.IAttributes
import typings.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputAttributes extends IAttributes {
  var ngTableSelectFilterDs: String
}

object IInputAttributes {
  @scala.inline
  def apply(
    $addClass: String => Unit,
    $attr: js.Object,
    $normalize: String => String,
    $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function,
    $removeClass: String => Unit,
    $set: (String, js.Any) => Unit,
    $updateClass: (String, String) => Unit,
    ngTableSelectFilterDs: String
  ): IInputAttributes = {
    val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass), ngTableSelectFilterDs = ngTableSelectFilterDs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IInputAttributes]
  }
}

