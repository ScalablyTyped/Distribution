package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibUtilsMod {
  import typings.nextDashServer.Anon_AmpPath
  import typings.nextDashServer.Anon_Body
  import typings.nextDashServer.Anon_Component
  import typings.nextDashServer.Anon_Context
  import typings.nextDashServer.Anon_EnhanceApp
  import typings.nextDashServer.Anon_Json
  import typings.nextDashServer.Anon_RenderPage
  import typings.nextDashServer.Anon_Styles
  import typings.nextDashServer.distLibRouterRouterMod.NextRouter
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse
  import typings.react.reactMod.ComponentType

  type AppPropsType[R /* <: NextRouter */, P] = AppInitialProps with (Anon_Component[P, R])
  type AppType = NextComponentType[AppContextType[NextRouter], AppInitialProps, AppPropsType[NextRouter, js.Object]]
  type ComponentsEnhancer = Anon_EnhanceApp | (Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]])
  type DocumentContext = NextPageContext with Anon_RenderPage
  type DocumentInitialProps = RenderPageResult with Anon_Styles
  type DocumentProps = DocumentInitialProps with Anon_AmpPath
  type DocumentType = NextComponentType[DocumentContext, DocumentInitialProps, DocumentProps]
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextApiRequest = IncomingMessage with Anon_Body
  type NextApiResponse[T] = ServerResponse with Anon_Json[T]
  type NextComponentType[C /* <: BaseContext */, IP, P] = ComponentType[P] with (Anon_Context[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[ComponentsEnhancer], 
    RenderPageResult | js.Promise[RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, Unit]
}
