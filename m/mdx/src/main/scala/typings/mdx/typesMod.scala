package typings.mdx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mdx.anon.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  // tslint:disable-next-line: strict-export-declare-modifiers
  type ClassComponent[Props] = Instantiable1[
    /* props */ Props, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.ElementClass */ Any
  ]
  
  // tslint:disable-next-line: strict-export-declare-modifiers
  type Component[Props] = FunctionComponent[Props] | ClassComponent[Props]
  
  type FunctionComponent[Props] = js.Function1[
    /* props */ Props, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ Any) | Null
  ]
  
  type MDXComponents = NestedMDXComponents & (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IntrinsicElements * / any ]:? mdx.mdx/types.Component</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IntrinsicElements * / any[Key]> | keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IntrinsicElements * / any} */ js.Any) & Wrapper
  
  type MDXContent = js.Function1[
    /* props */ MDXProps, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ Any
  ]
  
  trait MDXModule
    extends StObject
       with /**
    * This could be any value that is exported from the MDX file.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * A functional JSX component which renders the content of the MDX file.
      */
    def default(props: MDXProps): Any
    /**
      * A functional JSX component which renders the content of the MDX file.
      */
    @JSName("default")
    var default_Original: MDXContent
  }
  object MDXModule {
    
    inline def apply(
      default: /* props */ MDXProps => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ Any
    ): MDXModule = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction1(default))
      __obj.asInstanceOf[MDXModule]
    }
    
    extension [Self <: MDXModule](x: Self) {
      
      inline def setDefault(
        value: /* props */ MDXProps => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ Any
      ): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    }
  }
  
  trait MDXProps
    extends StObject
       with /**
    * This could be any value that is exported from the MDX file.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * This prop may be used to customize how certain components are rendered.
      */
    var components: js.UndefOr[MDXComponents] = js.undefined
  }
  object MDXProps {
    
    inline def apply(): MDXProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDXProps]
    }
    
    extension [Self <: MDXProps](x: Self) {
      
      inline def setComponents(value: MDXComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  // tslint:disable-next-line: strict-export-declare-modifiers
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NestedMDXComponents = {[key: string] : mdx.mdx/types.NestedMDXComponents | mdx.mdx/types.Component<any> | keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IntrinsicElements * / any}
  }}}
  to avoid circular code involving: 
  - mdx.mdx/types.MDXComponents
  - mdx.mdx/types.NestedMDXComponents
  */
  trait NestedMDXComponents
    extends StObject
       with /* key */ StringDictionary[
          NestedMDXComponents | Component[Any] | (/* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IntrinsicElements * / any */ String)
        ]
  object NestedMDXComponents {
    
    inline def apply(): NestedMDXComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedMDXComponents]
    }
  }
}
