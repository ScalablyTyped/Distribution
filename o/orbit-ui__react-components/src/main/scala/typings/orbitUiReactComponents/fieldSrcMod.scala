package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.errorMessageMod.InnerErrorMessageProps
import typings.orbitUiReactComponents.fieldContextMod.ClearFieldContextProps
import typings.orbitUiReactComponents.fieldContextMod.FieldContextType
import typings.orbitUiReactComponents.fieldContextMod.UseFieldInputPropsReturn
import typings.orbitUiReactComponents.fieldContextMod.UseFieldLabelPropsReturn
import typings.orbitUiReactComponents.fieldContextMod.UseFieldLabelProps_
import typings.orbitUiReactComponents.fieldContextMod.UseFieldMessagePropsReturn
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.groupFieldMod.InnerGroupFieldProps
import typings.orbitUiReactComponents.helpMessageMod.InnerHelpMessageProps
import typings.orbitUiReactComponents.labelMod.InnerLabelProps
import typings.orbitUiReactComponents.srcFieldMod.InnerFieldProps
import typings.orbitUiReactComponents.validMessageMod.InnerValidMessageProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/field/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearFieldContext(hasChildren: ClearFieldContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearFieldContext")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/field/src", "ErrorMessage")
  @js.native
  val ErrorMessage: OrbitComponent[HTMLElement, InnerErrorMessageProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src", "Field")
  @js.native
  val Field: OrbitComponent[HTMLElement, InnerFieldProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src", "FieldContext")
  @js.native
  val FieldContext: Context[FieldContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src", "GroupField")
  @js.native
  val GroupField: OrbitComponent[HTMLElement, InnerGroupFieldProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src", "HelpMessage")
  @js.native
  val HelpMessage: OrbitComponent[HTMLElement, InnerHelpMessageProps] = js.native
  
  inline def InnerErrorMessage(props: InnerErrorMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerErrorMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerField(props: InnerFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerField")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerGroupField(props: InnerGroupFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerGroupField")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerHelpMessage(props: InnerHelpMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHelpMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerLabel(props: InnerLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerValidMessage(props: InnerValidMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerValidMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/field/src", "Label")
  @js.native
  val Label: OrbitComponent[HTMLElement, InnerLabelProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/field/src", "ValidMessage")
  @js.native
  val ValidMessage: OrbitComponent[HTMLElement, InnerValidMessageProps] = js.native
  
  inline def useFieldContext(): js.Tuple2[FieldContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldContext")().asInstanceOf[js.Tuple2[FieldContextType, Boolean]]
  
  inline def useFieldInputProps(): js.Tuple2[UseFieldInputPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldInputProps")().asInstanceOf[js.Tuple2[UseFieldInputPropsReturn, Boolean]]
  
  inline def useFieldLabelProps(hasAsProp: UseFieldLabelProps_): js.Tuple2[UseFieldLabelPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldLabelProps")(hasAsProp.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseFieldLabelPropsReturn, Boolean]]
  
  inline def useFieldMessageProps(): js.Tuple2[UseFieldMessagePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldMessageProps")().asInstanceOf[js.Tuple2[UseFieldMessagePropsReturn, Boolean]]
}
