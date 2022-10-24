package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distFieldSrcErrorMessageMod.InnerErrorMessageProps
import typings.orbitUiReactComponents.distFieldSrcFieldContextMod.ClearFieldContextProps
import typings.orbitUiReactComponents.distFieldSrcFieldContextMod.FieldContextType
import typings.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldInputPropsReturn
import typings.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldLabelPropsReturn
import typings.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldLabelProps_
import typings.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldMessagePropsReturn
import typings.orbitUiReactComponents.distFieldSrcFieldMod.InnerFieldProps
import typings.orbitUiReactComponents.distFieldSrcGroupFieldMod.InnerGroupFieldProps
import typings.orbitUiReactComponents.distFieldSrcHelpMessageMod.InnerHelpMessageProps
import typings.orbitUiReactComponents.distFieldSrcLabelMod.InnerLabelProps
import typings.orbitUiReactComponents.distFieldSrcValidMessageMod.InnerValidMessageProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFieldMod {
  
  @JSImport("@orbit-ui/react-components/dist/field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearFieldContext(param0: ClearFieldContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearFieldContext")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/field", "ErrorMessage")
  @js.native
  val ErrorMessage: OrbitComponent[HTMLElement, InnerErrorMessageProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field", "Field")
  @js.native
  val Field: OrbitComponent[HTMLElement, InnerFieldProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field", "FieldContext")
  @js.native
  val FieldContext: Context[FieldContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field", "GroupField")
  @js.native
  val GroupField: OrbitComponent[HTMLElement, InnerGroupFieldProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field", "HelpMessage")
  @js.native
  val HelpMessage: OrbitComponent[HTMLElement, InnerHelpMessageProps] = js.native
  
  inline def InnerErrorMessage(props: InnerErrorMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerErrorMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerField(props: InnerFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerField")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerGroupField(props: InnerGroupFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerGroupField")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerHelpMessage(props: InnerHelpMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHelpMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerLabel(props: InnerLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerValidMessage(props: InnerValidMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerValidMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/field", "Label")
  @js.native
  val Label: OrbitComponent[HTMLElement, InnerLabelProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field", "ValidMessage")
  @js.native
  val ValidMessage: OrbitComponent[HTMLElement, InnerValidMessageProps] = js.native
  
  inline def useFieldContext(): js.Tuple2[FieldContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldContext")().asInstanceOf[js.Tuple2[FieldContextType, Boolean]]
  
  inline def useFieldInputProps(): js.Tuple2[UseFieldInputPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldInputProps")().asInstanceOf[js.Tuple2[UseFieldInputPropsReturn, Boolean]]
  
  inline def useFieldLabelProps(param0: UseFieldLabelProps_): js.Tuple2[UseFieldLabelPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldLabelProps")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseFieldLabelPropsReturn, Boolean]]
  
  inline def useFieldMessageProps(): js.Tuple2[UseFieldMessagePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldMessageProps")().asInstanceOf[js.Tuple2[UseFieldMessagePropsReturn, Boolean]]
}
