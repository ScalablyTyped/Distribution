package typings
package nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPageComponentMethods extends js.Object {
  def getInitialProps(props: js.Any): js.Promise[_]
}

object NextPageComponentMethods {
  @scala.inline
  def apply(getInitialProps: js.Any => js.Promise[_]): NextPageComponentMethods = {
    val __obj = js.Dynamic.literal(getInitialProps = js.Any.fromFunction1(getInitialProps))
  
    __obj.asInstanceOf[NextPageComponentMethods]
  }
}

