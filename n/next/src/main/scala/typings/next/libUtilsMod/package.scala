package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libUtilsMod {
  
  type AppTreeType = typings.react.mod.ComponentType[typings.next.anon.AppInitialPropsnamestring]
  
  type AppType = typings.next.libUtilsMod.NextComponentType[
    typings.next.libUtilsMod.AppContextType[typings.next.routerMod.NextRouter], 
    typings.next.libUtilsMod.AppInitialProps, 
    typings.next.libUtilsMod.AppPropsType[typings.next.routerMod.NextRouter, js.Object]
  ]
  
  type ComponentsEnhancer = typings.next.anon.EnhanceApp | (typings.next.libUtilsMod.Enhancer[
    typings.next.libUtilsMod.NextComponentType[typings.next.libUtilsMod.NextPageContext, js.Object, js.Object]
  ])
  
  type DocumentType = (typings.next.libUtilsMod.NextComponentType[
    typings.next.libUtilsMod.DocumentContext, 
    typings.next.libUtilsMod.DocumentInitialProps, 
    typings.next.libUtilsMod.DocumentProps
  ]) with typings.next.anon.RenderDocument
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  type NextApiHandler[T] = js.Function2[
    /* req */ typings.next.libUtilsMod.NextApiRequest, 
    /* res */ typings.next.libUtilsMod.NextApiResponse[T], 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  type NextComponentType[C /* <: typings.next.libUtilsMod.BaseContext */, IP, P] = typings.react.mod.ComponentType[P] with (typings.next.anon.GetInitialProps[C, IP])
  
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typings.next.libUtilsMod.ComponentsEnhancer], 
    typings.next.libUtilsMod.RenderPageResult | js.Promise[typings.next.libUtilsMod.RenderPageResult]
  ]
  
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
