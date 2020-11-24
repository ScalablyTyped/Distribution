package typings.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libUtilsMod {
  
  type AppType = typings.nextServer.libUtilsMod.NextComponentType[
    typings.nextServer.libUtilsMod.AppContextType[typings.nextServer.routerMod.NextRouter], 
    typings.nextServer.libUtilsMod.AppInitialProps, 
    typings.nextServer.libUtilsMod.AppPropsType[typings.nextServer.routerMod.NextRouter, js.Object]
  ]
  
  type ComponentsEnhancer = typings.nextServer.anon.EnhanceApp | (typings.nextServer.libUtilsMod.Enhancer[
    typings.nextServer.libUtilsMod.NextComponentType[typings.nextServer.libUtilsMod.NextPageContext, js.Object, js.Object]
  ])
  
  type DocumentType = typings.nextServer.libUtilsMod.NextComponentType[
    typings.nextServer.libUtilsMod.DocumentContext, 
    typings.nextServer.libUtilsMod.DocumentInitialProps, 
    typings.nextServer.libUtilsMod.DocumentProps
  ]
  
  type Enhancer[C] = js.Function1[/* Component */ C, C]
  
  type NextComponentType[C /* <: typings.nextServer.libUtilsMod.BaseContext */, IP, P] = typings.react.mod.ComponentType[P] with (typings.nextServer.anon.GetInitialProps[C, IP])
  
  type RenderPage = js.Function1[
    /* options */ js.UndefOr[typings.nextServer.libUtilsMod.ComponentsEnhancer], 
    typings.nextServer.libUtilsMod.RenderPageResult | js.Promise[typings.nextServer.libUtilsMod.RenderPageResult]
  ]
  
  /**
    * Send body of response
    */
  type Send[T] = js.Function1[/* body */ T, scala.Unit]
}
