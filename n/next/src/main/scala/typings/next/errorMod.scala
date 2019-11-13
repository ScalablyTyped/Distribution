package typings.next

import typings.next.distNextDashServerLibUtilsMod.NextPageContext
import typings.next.distPagesUnderscoreErrorMod.ErrorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class default[P] ()
    extends typings.next.distPagesUnderscoreErrorMod.default[P]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var displayName: String = js.native
    def getInitialProps(hasResErr: NextPageContext): js.Promise[ErrorProps] | ErrorProps = js.native
  }
  
}

