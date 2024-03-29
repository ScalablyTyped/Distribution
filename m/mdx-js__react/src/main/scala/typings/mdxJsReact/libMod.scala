package typings.mdxJsReact

import typings.mdx.typesMod.MDXComponents
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@mdx-js/react/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mdx-js/react/lib", "MDXContext")
  @js.native
  val MDXContext: Context[Components] = js.native
  
  inline def MDXProvider(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MDXProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useMDXComponents(): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")().asInstanceOf[Components]
  inline def useMDXComponents(components: Components): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")(components.asInstanceOf[js.Any]).asInstanceOf[Components]
  inline def useMDXComponents(components: MergeComponents): Components = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")(components.asInstanceOf[js.Any]).asInstanceOf[Components]
  
  inline def withMDXComponents(Component: ComponentType[Any]): js.Function1[/* props */ (Record[String, Any]) & typings.mdxJsReact.anon.Components, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMDXComponents")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ (Record[String, Any]) & typings.mdxJsReact.anon.Components, Element]]
  
  type Components = MDXComponents
  
  type MergeComponents = js.Function1[/* currentComponents */ Components, Components]
  
  trait Props extends StObject {
    
    /**
      * Children.
      */
    var children: js.UndefOr[ReactNode | Null] = js.undefined
    
    /**
      * Mapping of names for JSX components to React components.
      */
    var components: js.UndefOr[Components | MergeComponents | Null] = js.undefined
    
    /**
      * Turn off outer component context.
      */
    var disableParentContext: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponents(value: Components | MergeComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsFunction1(value: /* currentComponents */ Components => Components): Self = StObject.set(x, "components", js.Any.fromFunction1(value))
      
      inline def setComponentsNull: Self = StObject.set(x, "components", null)
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDisableParentContext(value: Boolean): Self = StObject.set(x, "disableParentContext", value.asInstanceOf[js.Any])
      
      inline def setDisableParentContextNull: Self = StObject.set(x, "disableParentContext", null)
      
      inline def setDisableParentContextUndefined: Self = StObject.set(x, "disableParentContext", js.undefined)
    }
  }
  
  type ReactNode = typings.react.mod.ReactNode
}
