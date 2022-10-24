package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distFormSrcFieldsetMod.InnerFieldsetProps
import typings.orbitUiReactComponents.distFormSrcFormContextMod.FormContextType
import typings.orbitUiReactComponents.distFormSrcFormMod.InnerFormProps
import typings.orbitUiReactComponents.distFormSrcRowMod.InnerRowProps
import typings.orbitUiReactComponents.distFormSrcUseFormButtonMod.FormButtonProps
import typings.orbitUiReactComponents.distFormSrcUseFormFieldMod.FormFieldProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/form/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "Fieldset")
  @js.native
  val Fieldset: OrbitComponent[HTMLElement, InnerFieldsetProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "Form")
  @js.native
  val Form: OrbitComponent[HTMLElement, InnerFormProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "FormContext")
  @js.native
  val FormContext: Context[FormContextType] = js.native
  
  inline def InnerFieldset(param0: InnerFieldsetProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFieldset")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerForm(props: InnerFormProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerForm")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerRow(props: InnerRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRow")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "Row")
  @js.native
  val Row: OrbitComponent[HTMLElement, InnerRowProps] = js.native
  
  inline def useFormButton(): js.Tuple2[FormButtonProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormButton")().asInstanceOf[js.Tuple2[FormButtonProps, Boolean]]
  
  inline def useFormContext(): js.Tuple2[FormContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormContext")().asInstanceOf[js.Tuple2[FormContextType, Boolean]]
  
  inline def useFormField(): js.Tuple2[FormFieldProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormField")().asInstanceOf[js.Tuple2[FormFieldProps, Boolean]]
}
