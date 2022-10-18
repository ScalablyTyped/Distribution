package typings.mdxJsReact

import typings.mdx.typesMod.MDXComponents
import typings.mdxJsReact.libMod.Components
import typings.mdxJsReact.libMod.MergeComponents
import typings.mdxJsReact.libMod.Props
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mdx-js/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mdx-js/react", "MDXContext")
  @js.native
  val MDXContext: Context[Components] = js.native
  
  inline def MDXProvider(hasComponentsChildrenDisableParentContext: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MDXProvider")(hasComponentsChildrenDisableParentContext.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useMDXComponents(): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")().asInstanceOf[Components]
  inline def useMDXComponents(components: MDXComponents): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")(components.asInstanceOf[js.Any]).asInstanceOf[Components]
  inline def useMDXComponents(components: MergeComponents): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")(components.asInstanceOf[js.Any]).asInstanceOf[Components]
  
  inline def withMDXComponents(Component: ComponentType[Any]): js.Function1[/* props */ (Record[String, Any]) & typings.mdxJsReact.anon.Components, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMDXComponents")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ (Record[String, Any]) & typings.mdxJsReact.anon.Components, Element]]
}
