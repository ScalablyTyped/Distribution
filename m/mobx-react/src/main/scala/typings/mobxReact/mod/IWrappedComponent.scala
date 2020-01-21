package typings.mobxReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWrappedComponent[P] extends js.Object {
  var wrappedComponent: IReactComponent[P]
}

object IWrappedComponent {
  @scala.inline
  def apply[P](wrappedComponent: IReactComponent[P]): IWrappedComponent[P] = {
    val __obj = js.Dynamic.literal(wrappedComponent = wrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWrappedComponent[P]]
  }
}

