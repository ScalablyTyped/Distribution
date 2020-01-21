package typings.nextReduxWrapper

import org.scalablytyped.runtime.Instantiable2
import typings.nextReduxWrapper.mod.NextJSAppContext
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppCtx
  extends Instantiable2[/* props */ js.Any, /* context */ js.Any, AnonCallback] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var displayName: String = js.native
  def getInitialProps(appCtx: NextJSAppContext): js.Promise[AnonInitialProps] = js.native
}

