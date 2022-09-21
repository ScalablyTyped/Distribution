package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.fieldsetMod.InnerFieldsetProps
import typings.orbitUiReactComponents.formContextMod.FormContextType
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.rowMod.InnerRowProps
import typings.orbitUiReactComponents.srcFormMod.InnerFormProps
import typings.orbitUiReactComponents.useFormButtonMod.FormButtonProps
import typings.orbitUiReactComponents.useFormFieldMod.FormFieldProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  @JSImport("@orbit-ui/react-components/dist/form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form", "Fieldset")
  @js.native
  val Fieldset: OrbitComponent[HTMLElement, InnerFieldsetProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form", "Form")
  @js.native
  val Form: OrbitComponent[HTMLElement, InnerFormProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form", "FormContext")
  @js.native
  val FormContext: Context[FormContextType] = js.native
  
  inline def InnerFieldset(hasIdLabelAsChildrenForwardedRefRest: InnerFieldsetProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFieldset")(hasIdLabelAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerForm(props: InnerFormProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerForm")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerRow(props: InnerRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRow")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/form", "Row")
  @js.native
  val Row: OrbitComponent[HTMLElement, InnerRowProps] = js.native
  
  inline def useFormButton(): js.Tuple2[FormButtonProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormButton")().asInstanceOf[js.Tuple2[FormButtonProps, Boolean]]
  
  inline def useFormContext(): js.Tuple2[FormContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormContext")().asInstanceOf[js.Tuple2[FormContextType, Boolean]]
  
  inline def useFormField(): js.Tuple2[FormFieldProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormField")().asInstanceOf[js.Tuple2[FormFieldProps, Boolean]]
}
