package typings.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsMod {
  type AppPropsType[R /* <: typings.nextServer.routerMod.NextRouter */, P] = typings.nextServer.libUtilsMod.AppInitialProps with (typings.nextServer.AnonComponent[P, R])
  type AppType = typings.nextServer.libUtilsMod.NextComponentType[
    typings.nextServer.libUtilsMod.AppContextType[typings.nextServer.routerMod.NextRouter], 
    typings.nextServer.libUtilsMod.AppInitialProps, 
    typings.nextServer.libUtilsMod.AppPropsType[typings.nextServer.routerMod.NextRouter, js.Object]
  ]
  type ComponentsEnhancer = typings.nextServer.AnonEnhanceApp | (typings.nextServer.libUtilsMod.Enhancer[
    typings.nextServer.libUtilsMod.NextComponentType[typings.nextServer.libUtilsMod.NextPageContext, js.Object, js.Object]
  ])
  type DocumentContext = typings.nextServer.libUtilsMod.NextPageContext with typings.nextServer.AnonRenderPage
  type DocumentInitialProps = typings.nextServer.libUtilsMod.RenderPageResult with typings.nextServer.AnonStyles
  type DocumentProps = typings.nextServer.libUtilsMod.DocumentInitialProps with typings.nextServer.AnonAmpPath
  type DocumentType = typings.nextServer.libUtilsMod.NextComponentType[
    typings.nextServer.libUtilsMod.DocumentContext, 
    typings.nextServer.libUtilsMod.DocumentInitialProps, 
    typings.nextServer.libUtilsMod.DocumentProps
  ]
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextApiRequest = typings.node.httpMod.IncomingMessage with typings.nextServer.AnonBody
  type NextApiResponse[T] = typings.node.httpMod.ServerResponse with typings.nextServer.AnonJson[T]
  type NextComponentType[C /* <: typings.nextServer.libUtilsMod.BaseContext */, IP, P] = typings.react.mod.ComponentType[P] with (typings.nextServer.AnonContext[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typings.nextServer.libUtilsMod.ComponentsEnhancer], 
    typings.nextServer.libUtilsMod.RenderPageResult | js.Promise[typings.nextServer.libUtilsMod.RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
