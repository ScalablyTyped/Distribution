package typings.mfiles.global.MFiles

import typings.mfiles.IAutomaticPermissions
import typings.mfiles.INamedValueNamespaces
import typings.mfiles.IObjectType
import typings.mfiles.IObjectTypeAdmin
import typings.mfiles.IObjectTypeColumnMappings
import typings.mfiles.ISemanticAliases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjTypeAdmin")
@js.native
class ObjTypeAdmin ()
  extends StObject
     with IObjectTypeAdmin {
  
  /* CompleteClass */
  override def Clone(): IObjectTypeAdmin = js.native
  
  /* CompleteClass */
  var ColumnMappings: IObjectTypeColumnMappings = js.native
  
  /* CompleteClass */
  var ConnectionString: String = js.native
  
  /* CompleteClass */
  var DefaultForAutomaticPermissions: IAutomaticPermissions = js.native
  
  /* CompleteClass */
  var DeleteStatement: String = js.native
  
  /* CompleteClass */
  var InsertIntoStatement: String = js.native
  
  /* CompleteClass */
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  
  /* CompleteClass */
  var ObjectType: IObjectType = js.native
  
  /* CompleteClass */
  var SelectExtIDStatement: String = js.native
  
  /* CompleteClass */
  var SelectStatement: String = js.native
  
  /* CompleteClass */
  var SelectStatementOneRecord: String = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var Translatable: Boolean = js.native
  
  /* CompleteClass */
  var UpdateStatement: String = js.native
}
