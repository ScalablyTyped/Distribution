package typings.nextReduxWrapper

import org.scalablytyped.runtime.Instantiable2
import typings.nextReduxWrapper.mod.WrappedAppProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInstantiable
  extends Instantiable2[
      /* props */ WrappedAppProps, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AppContextType<imported_router.Router> */ /* context */ js.Any, 
      AnonComponentDidCatch
    ] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var displayName: String = js.native
  def getInitialProps(
    appCtx: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AppContextType<imported_router.Router> */ js.Any
  ): js.Promise[AnonInitialProps] = js.native
}

