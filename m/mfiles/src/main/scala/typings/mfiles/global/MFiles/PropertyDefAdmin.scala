package typings.mfiles.global.MFiles

import typings.mfiles.IAutomaticValue
import typings.mfiles.INamedValueNamespaces
import typings.mfiles.IPropertyDef
import typings.mfiles.IPropertyDefAdmin
import typings.mfiles.ISemanticAliases
import typings.mfiles.IValidation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.PropertyDefAdmin")
@js.native
open class PropertyDefAdmin ()
  extends StObject
     with IPropertyDefAdmin {
  
  /* CompleteClass */
  var AllowAutomaticPermissions: Boolean = js.native
  
  /* CompleteClass */
  var AutomaticValue: IAutomaticValue = js.native
  
  /* CompleteClass */
  override def Clone(): IPropertyDefAdmin = js.native
  
  /* CompleteClass */
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  
  /* CompleteClass */
  var PropertyDef: IPropertyDef = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var Validation: IValidation = js.native
}
