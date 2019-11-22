package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

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
    val __obj = js.Dynamic.literal(initialProps = initialProps, initialState = initialState, isServer = isServer)
  
    __obj.asInstanceOf[WrappedAppProps]
  }
}

