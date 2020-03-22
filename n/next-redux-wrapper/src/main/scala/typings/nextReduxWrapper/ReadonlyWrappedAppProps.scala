package typings.nextReduxWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-redux-wrapper.next-redux-wrapper.WrappedAppProps> */
trait ReadonlyWrappedAppProps extends js.Object {
  val initialProps: js.Any
  val initialState: js.Any
  val isServer: Boolean
}

object ReadonlyWrappedAppProps {
  @scala.inline
  def apply(initialProps: js.Any, initialState: js.Any, isServer: Boolean): ReadonlyWrappedAppProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyWrappedAppProps]
  }
}

