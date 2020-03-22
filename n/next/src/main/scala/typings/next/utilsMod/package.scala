package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type AppTreeType = typings.react.mod.ComponentType[typings.next.AppInitialPropsnamestring]
  type AppType = typings.next.utilsMod.NextComponentType[
    typings.next.utilsMod.AppContextType[typings.next.routerMod.NextRouter], 
    typings.next.utilsMod.AppInitialProps, 
    typings.next.utilsMod.AppPropsType[typings.next.routerMod.NextRouter, js.Object]
  ]
  type ComponentsEnhancer = typings.next.AnonEnhanceApp | (typings.next.utilsMod.Enhancer[
    typings.next.utilsMod.NextComponentType[typings.next.utilsMod.NextPageContext, js.Object, js.Object]
  ])
  type DocumentType = (typings.next.utilsMod.NextComponentType[
    typings.next.utilsMod.DocumentContext, 
    typings.next.utilsMod.DocumentInitialProps, 
    typings.next.utilsMod.DocumentProps
  ]) with typings.next.AnonRenderDocument
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  type NextComponentType[C /* <: typings.next.utilsMod.BaseContext */, IP, P] = typings.react.mod.ComponentType[P] with (typings.next.AnonGetInitialProps[C, IP])
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typings.next.utilsMod.ComponentsEnhancer], 
    typings.next.utilsMod.RenderPageResult | js.Promise[typings.next.utilsMod.RenderPageResult]
  ]
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
