package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorStrings.all
import typings.monacoEditor.monacoEditorStrings.literals
import typings.monacoEditor.monacoEditorStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintsOptions extends StObject {
  
  val includeInlayEnumMemberValueHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayFunctionLikeReturnTypeHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayFunctionParameterTypeHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayParameterNameHints: js.UndefOr[none | literals | all] = js.undefined
  
  val includeInlayParameterNameHintsWhenArgumentMatchesName: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayPropertyDeclarationTypeHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayVariableTypeHints: js.UndefOr[Boolean] = js.undefined
}
object InlayHintsOptions {
  
  inline def apply(): InlayHintsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlayHintsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlayHintsOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeInlayEnumMemberValueHints(value: Boolean): Self = StObject.set(x, "includeInlayEnumMemberValueHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayEnumMemberValueHintsUndefined: Self = StObject.set(x, "includeInlayEnumMemberValueHints", js.undefined)
    
    inline def setIncludeInlayFunctionLikeReturnTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayFunctionLikeReturnTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayFunctionLikeReturnTypeHintsUndefined: Self = StObject.set(x, "includeInlayFunctionLikeReturnTypeHints", js.undefined)
    
    inline def setIncludeInlayFunctionParameterTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayFunctionParameterTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayFunctionParameterTypeHintsUndefined: Self = StObject.set(x, "includeInlayFunctionParameterTypeHints", js.undefined)
    
    inline def setIncludeInlayParameterNameHints(value: none | literals | all): Self = StObject.set(x, "includeInlayParameterNameHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayParameterNameHintsUndefined: Self = StObject.set(x, "includeInlayParameterNameHints", js.undefined)
    
    inline def setIncludeInlayParameterNameHintsWhenArgumentMatchesName(value: Boolean): Self = StObject.set(x, "includeInlayParameterNameHintsWhenArgumentMatchesName", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayParameterNameHintsWhenArgumentMatchesNameUndefined: Self = StObject.set(x, "includeInlayParameterNameHintsWhenArgumentMatchesName", js.undefined)
    
    inline def setIncludeInlayPropertyDeclarationTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayPropertyDeclarationTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayPropertyDeclarationTypeHintsUndefined: Self = StObject.set(x, "includeInlayPropertyDeclarationTypeHints", js.undefined)
    
    inline def setIncludeInlayVariableTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayVariableTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayVariableTypeHintsUndefined: Self = StObject.set(x, "includeInlayVariableTypeHints", js.undefined)
  }
}
