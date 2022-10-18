package typings.next

import typings.next.anon.ChildNodes
import typings.next.anon.ChildProp
import typings.next.anon.Error
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsLayoutRouterDotclientMod {
  
  @JSImport("next/dist/client/components/layout-router.client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasParallelRouterKeySegmentPathChildPropErrorLoadingTemplateRootLayoutIncluded: ChildProp): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasParallelRouterKeySegmentPathChildPropErrorLoadingTemplateRootLayoutIncluded.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerLayoutRouter(hasParallelRouterKeyUrlChildNodesChildPropSegmentPathTreePathRootLayoutIncluded: ChildNodes): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLayoutRouter")(hasParallelRouterKeyUrlChildNodesChildPropSegmentPathTreePathRootLayoutIncluded.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  type ErrorComponent = ComponentType[Error]
}
