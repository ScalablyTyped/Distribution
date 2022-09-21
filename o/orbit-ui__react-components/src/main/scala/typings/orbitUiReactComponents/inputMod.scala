package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.InputProps
import typings.orbitUiReactComponents.anon.`0`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.className
import typings.orbitUiReactComponents.useGroupInputMod.UseGroupInputProps
import typings.orbitUiReactComponents.useGroupInputMod.UseGroupInputReturn
import typings.orbitUiReactComponents.useInputContentMod.UseInputIconProps
import typings.orbitUiReactComponents.useInputMod.UseInputProps
import typings.orbitUiReactComponents.wrappedInputPropsAdapterMod.AdaptedWrappedInputProps
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@orbit-ui/react-components/dist/input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useGroupInput(
    hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef: UseGroupInputProps
  ): UseGroupInputReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useGroupInput")(hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef.asInstanceOf[js.Any]).asInstanceOf[UseGroupInputReturn]
  
  inline def useInput(
    hasModuleIdValuePlaceholderRequiredValidationStateOnChangeTypeAutoFocusDisabledReadOnlyFluidLoadingActiveFocusHoverForwardedRef: UseInputProps
  ): InputProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(hasModuleIdValuePlaceholderRequiredValidationStateOnChangeTypeAutoFocusDisabledReadOnlyFluidLoadingActiveFocusHoverForwardedRef.asInstanceOf[js.Any]).asInstanceOf[InputProps]
  
  inline def useInputButton(button: ReactElement, isActive: Boolean): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def useInputButton(button: ReactElement, isActive: Boolean, props: Record[String, Any]): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def useInputIcon(icon: ReactNode): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def useInputIcon(icon: ReactNode, props: UseInputIconProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def wrappedInputPropsAdapter[P /* <: `0` */](hasClassNameRest: P): (Omit[P, className]) & AdaptedWrappedInputProps = ^.asInstanceOf[js.Dynamic].applyDynamic("wrappedInputPropsAdapter")(hasClassNameRest.asInstanceOf[js.Any]).asInstanceOf[(Omit[P, className]) & AdaptedWrappedInputProps]
}
