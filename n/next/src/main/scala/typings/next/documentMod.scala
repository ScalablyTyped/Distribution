package typings.next

import org.scalablytyped.runtime.Instantiable0
import typings.next.distNextDashServerLibUtilsMod.DocumentContext
import typings.next.distNextDashServerLibUtilsMod.DocumentInitialProps
import typings.next.distNextDashServerLibUtilsMod.DocumentProps
import typings.next.distPagesUnderscoreDocumentMod.Document
import typings.react.reactMod.Context
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/document", JSImport.Namespace)
@js.native
object documentMod extends js.Object {
  @js.native
  class Head ()
    extends typings.next.distPagesUnderscoreDocumentMod.Head
  
  @js.native
  class Html ()
    extends typings.next.distPagesUnderscoreDocumentMod.Html
  
  @js.native
  class Main ()
    extends typings.next.distPagesUnderscoreDocumentMod.Main
  
  @js.native
  class NextScript ()
    extends typings.next.distPagesUnderscoreDocumentMod.NextScript
  
  @js.native
  class default[P] ()
    extends typings.next.distPagesUnderscoreDocumentMod.default[P]
  
  def middleware(hasReqRes: DocumentContext): js.Promise[Unit] = js.native
  /* static members */
  @js.native
  object Head extends js.Object {
    var contextType: Context[Anon_DevOnlyInvalidateCacheQueryString] = js.native
    var propTypes: Anon_CrossOrigin = js.native
  }
  
  /* static members */
  @js.native
  object Html extends js.Object {
    var contextType: Context[Anon_DevOnlyInvalidateCacheQueryString] = js.native
    var propTypes: Anon_ChildrenBoolean = js.native
  }
  
  /* static members */
  @js.native
  object Main extends js.Object {
    var contextType: Context[Anon_DevOnlyInvalidateCacheQueryString] = js.native
  }
  
  /* static members */
  @js.native
  object NextScript extends js.Object {
    var contextType: Context[Anon_DevOnlyInvalidateCacheQueryString] = js.native
    var propTypes: Anon_CrossOrigin = js.native
    var safariNomoduleFix: String = js.native
    def getInlineScriptSource(documentProps: DocumentProps): String = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var bodyTagsMiddleware: js.Promise[_] | js.Function0[js.Array[scala.Nothing]] = js.native
    var headTagsMiddleware: js.Promise[_] | js.Function0[js.Array[scala.Nothing]] = js.native
    var htmlPropsMiddleware: js.Promise[_] | js.Function0[js.Array[scala.Nothing]] = js.native
    /**
      * `getInitialProps` hook returns the context object with the addition of `renderPage`.
      * `renderPage` callback executes `React` rendering logic synchronously to support server-rendering wrappers
      */
    def getInitialProps(ctx: DocumentContext): js.Promise[DocumentInitialProps] = js.native
    def renderDocument[P](Document: Instantiable0[Document[P]], props: DocumentProps with P): ReactElement = js.native
  }
  
}

