package typings.nextReduxWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialProps extends js.Object {
  var initialState: js.Any
  var isServer: Boolean
}

object AnonInitialProps {
  @scala.inline
  def apply(initialState: js.Any, isServer: Boolean): AnonInitialProps = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInitialProps]
  }
}

