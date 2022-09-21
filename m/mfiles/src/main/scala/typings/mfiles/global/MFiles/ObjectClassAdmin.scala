package typings.mfiles.global.MFiles

import typings.mfiles.IAdditionalClassInfo
import typings.mfiles.IAssociatedPropertyDefs
import typings.mfiles.IAutomaticPermissions
import typings.mfiles.IObjectClassAdmin
import typings.mfiles.ISemanticAliases
import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectClassAdmin")
@js.native
open class ObjectClassAdmin ()
  extends StObject
     with IObjectClassAdmin {
  
  /* CompleteClass */
  override val AdditionalClassInfo: IAdditionalClassInfo = js.native
  
  /* CompleteClass */
  var AssociatedPropertyDefs: IAssociatedPropertyDefs = js.native
  
  /* CompleteClass */
  var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  
  /* CompleteClass */
  override def Clone(): IObjectClassAdmin = js.native
  
  /* CompleteClass */
  var ForceWorkflow: Boolean = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var NamePropertyDef: Double = js.native
  
  /* CompleteClass */
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  /* CompleteClass */
  var Predefined: Boolean = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var Workflow: Double = js.native
}
