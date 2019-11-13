package typings.next.distPagesUnderscoreDocumentMod

import typings.next.Anon_CrossOrigin
import typings.next.Anon_DevOnlyInvalidateCacheQueryString
import typings.next.distNextDashServerLibDocumentDashContextMod.DocumentContext
import typings.next.distNextDashServerLibUtilsMod.DocumentProps
import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/pages/_document", "NextScript")
@js.native
class NextScript ()
  extends Component[OriginProps, js.Object, js.Any] {
  @JSName("context")
  var context_NextScript: ContextType[Context[DocumentContext]] = js.native
  def getDynamicChunks(): js.Array[Element | Null] = js.native
  def getPolyfillScripts(): js.Array[Element] = js.native
  def getScripts(): (js.Array[Element | Null]) | Null = js.native
}

/* static members */
@JSImport("next/dist/pages/_document", "NextScript")
@js.native
object NextScript extends js.Object {
  var contextType: Context[Anon_DevOnlyInvalidateCacheQueryString] = js.native
  var propTypes: Anon_CrossOrigin = js.native
  var safariNomoduleFix: String = js.native
  def getInlineScriptSource(documentProps: DocumentProps): String = js.native
}

