package typings.nextReduxWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedAppProps extends js.Object {
  var initialProps: js.Any
  var initialState: js.Any
  var isServer: Boolean
}

object WrappedAppProps {
  @scala.inline
  def apply(initialProps: js.Any, initialState: js.Any, isServer: Boolean): WrappedAppProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WrappedAppProps]
  }
}

