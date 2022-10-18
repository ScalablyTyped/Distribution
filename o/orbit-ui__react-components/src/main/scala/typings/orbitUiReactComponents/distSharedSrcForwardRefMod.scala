package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Datatestid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.forwardedRef
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.slot
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.WeakValidationMap
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcForwardRefMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/forwardRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forwardRef[P /* <: Record[String, Any] */, T](render: ForwardRefRenderFunction[AsRef[T], P]): OrbitComponent[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[T, P]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react.react.ElementType<any> ? react.react.ElementRef<T> : T
    }}}
    */
  @js.native
  trait AsRef[T] extends StObject
  
  type MergeWithAs[T, P] = RightJoinProps[PropsOf[T], (OmitCommonProps[P, slot]) & Datatestid]
  
  type OmitCommonProps[Target, OmitAdditionalProps /* <: /* keyof any */ String */] = Omit[Target, forwardedRef | OmitAdditionalProps]
  
  @js.native
  trait OrbitComponent[T, P]
    extends StObject
       with ForwardRefExoticComponent[MergeWithAs[T, P]] {
    
    @JSName("defaultProps")
    var defaultProps_OrbitComponent: js.UndefOr[Partial[Any]] = js.native
    
    @JSName("propTypes")
    var propTypes_OrbitComponent: js.UndefOr[WeakValidationMap[Any]] = js.native
  }
  
  type PropsOf[T] = PropsWithoutChildren[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ElementType<any> ? react.react.HTMLProps<@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.AsRef<T>> & react.react.ComponentProps<T> & react.react.RefAttributes<@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.AsRef<T>> : T extends std.HTMLElement ? react.react.HTMLProps<T> & react.react.RefAttributes<T> : never */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    'children' extends keyof P ? std.Pick<P, std.Exclude<keyof P, 'children'>> : P
    }}}
    */
  @js.native
  trait PropsWithoutChildren[P] extends StObject
  
  type RightJoinProps[SourceProps /* <: Record[String, Any] */, OverrideProps /* <: Record[String, Any] */] = (OmitCommonProps[SourceProps, /* keyof OverrideProps */ String]) & OverrideProps
}
