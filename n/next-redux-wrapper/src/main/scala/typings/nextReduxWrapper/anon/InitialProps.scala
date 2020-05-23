package typings.nextReduxWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialProps extends js.Object {
  var initialState: js.Any
  var isServer: Boolean
}

object InitialProps {
  @scala.inline
  def apply(initialState: js.Any, isServer: Boolean): InitialProps = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProps]
  }
}

