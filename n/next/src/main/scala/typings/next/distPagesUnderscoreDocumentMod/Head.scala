package typings.next.distPagesUnderscoreDocumentMod

import typings.next.Anon_CrossOrigin
import typings.next.Anon_DevOnlyInvalidateCacheQueryString
import typings.next.distNextDashServerLibDocumentDashContextMod.DocumentContext
import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLHeadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/pages/_document", "Head")
@js.native
class Head ()
  extends Component[
      OriginProps with (DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]), 
      js.Object, 
      js.Any
    ] {
  @JSName("context")
  var context_Head: ContextType[Context[DocumentContext]] = js.native
  def getCssLinks(): js.Array[Element] | Null = js.native
  def getPreloadDynamicChunks(): js.Array[Element | Null] = js.native
  def getPreloadMainLinks(): js.Array[Element] | Null = js.native
}

/* static members */
@JSImport("next/dist/pages/_document", "Head")
@js.native
object Head extends js.Object {
  var contextType: Context[Anon_DevOnlyInvalidateCacheQueryString] = js.native
  var propTypes: Anon_CrossOrigin = js.native
}

