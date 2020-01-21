package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type AppPropsType[R /* <: typings.next.routerMod.NextRouter */, P] = typings.next.utilsMod.AppInitialProps with (typings.next.AnonComponent[P, R])
  type AppTreeType = typings.react.mod.ComponentType[
    typings.next.utilsMod.AppInitialProps with org.scalablytyped.runtime.StringDictionary[js.Any]
  ]
  type AppType = typings.next.utilsMod.NextComponentType[
    typings.next.utilsMod.AppContextType[typings.next.routerMod.NextRouter], 
    typings.next.utilsMod.AppInitialProps, 
    typings.next.utilsMod.AppPropsType[typings.next.routerMod.NextRouter, js.Object]
  ]
  type ComponentsEnhancer = typings.next.AnonEnhanceApp | (typings.next.utilsMod.Enhancer[
    typings.next.utilsMod.NextComponentType[typings.next.utilsMod.NextPageContext, js.Object, js.Object]
  ])
  type DocumentContext = typings.next.utilsMod.NextPageContext with typings.next.AnonRenderPage
  type DocumentInitialProps = typings.next.utilsMod.RenderPageResult with typings.next.AnonStyles
  type DocumentProps = typings.next.utilsMod.DocumentInitialProps with typings.next.AnonAmpPath
  type DocumentType = (typings.next.utilsMod.NextComponentType[
    typings.next.utilsMod.DocumentContext, 
    typings.next.utilsMod.DocumentInitialProps, 
    typings.next.utilsMod.DocumentProps
  ]) with typings.next.AnonDocument
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextApiRequest = typings.node.httpMod.IncomingMessage with typings.next.AnonBody
  type NextApiResponse[T] = typings.node.httpMod.ServerResponse with typings.next.AnonJson[T]
  type NextComponentType[C /* <: typings.next.utilsMod.BaseContext */, IP, P] = typings.react.mod.ComponentType[P] with (typings.next.AnonContext[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typings.next.utilsMod.ComponentsEnhancer], 
    typings.next.utilsMod.RenderPageResult | js.Promise[typings.next.utilsMod.RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
