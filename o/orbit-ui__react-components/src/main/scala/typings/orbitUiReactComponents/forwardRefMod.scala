package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Datatestid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.children
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.forwardedRef
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.slot
import typings.react.mod.ComponentProps
import typings.react.mod.ElementRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.HTMLProps
import typings.react.mod.RefAttributes
import typings.react.mod.WeakValidationMap
import typings.std.Exclude
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forwardRefMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/forwardRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forwardRef[P /* <: Record[String, Any] */, T](render: ForwardRefRenderFunction[AsRef[T], P]): OrbitComponent[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[T, P]]
  
  type AsRef[T] = T | ElementRef[T]
  
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
    (HTMLProps[T] & RefAttributes[T]) | (HTMLProps[AsRef[T]] & ComponentProps[T] & RefAttributes[AsRef[T]])
  ]
  
  type PropsWithoutChildren[P] = P | (Pick[P, Exclude[/* keyof P */ String, children]])
  
  type RightJoinProps[SourceProps /* <: Record[String, Any] */, OverrideProps /* <: Record[String, Any] */] = (OmitCommonProps[SourceProps, /* keyof OverrideProps */ String]) & OverrideProps
}
