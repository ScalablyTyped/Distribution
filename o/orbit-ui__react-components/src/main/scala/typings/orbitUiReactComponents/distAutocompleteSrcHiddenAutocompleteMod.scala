package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAutocompleteSrcHiddenAutocompleteMod {
  
  object HiddenAutocomplete {
    
    inline def apply(param0: HiddenAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/autocomplete/src/HiddenAutocomplete", "HiddenAutocomplete")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/autocomplete/src/HiddenAutocomplete", "HiddenAutocomplete.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'input' extends react.react.JSXElementConstructor<infer P> ? P : 'input' extends keyof react.react.JSX.IntrinsicElements ? react.react.JSX.IntrinsicElements['input'] : {} */ trait HiddenAutocompleteProps extends StObject {
    
    /**
      * Name of the element. Used by the server to identify the fields in form submits. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes).
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A controlled selected key.
      */
    var selectedKey: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the select should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object HiddenAutocompleteProps {
    
    inline def apply(): HiddenAutocompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenAutocompleteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HiddenAutocompleteProps] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
