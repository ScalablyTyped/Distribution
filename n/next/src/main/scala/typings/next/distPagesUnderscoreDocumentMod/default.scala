package typings.next.distPagesUnderscoreDocumentMod

import org.scalablytyped.runtime.Instantiable0
import typings.next.distNextDashServerLibUtilsMod.DocumentContext
import typings.next.distNextDashServerLibUtilsMod.DocumentInitialProps
import typings.next.distNextDashServerLibUtilsMod.DocumentProps
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/pages/_document", JSImport.Default)
@js.native
class default[P] () extends Document[P]

/* static members */
@JSImport("next/dist/pages/_document", JSImport.Default)
@js.native
object default extends js.Object {
  var bodyTagsMiddleware: js.Any = js.native
  var headTagsMiddleware: js.Any = js.native
  var htmlPropsMiddleware: js.Any = js.native
  /**
    * `getInitialProps` hook returns the context object with the addition of `renderPage`.
    * `renderPage` callback executes `React` rendering logic synchronously to support server-rendering wrappers
    */
  def getInitialProps(ctx: DocumentContext): js.Promise[DocumentInitialProps] = js.native
  def renderDocument[P](Document: Instantiable0[Document[P]], props: DocumentProps with P): ReactElement = js.native
}

