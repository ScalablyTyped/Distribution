package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.IIDs
import typings.mfiles.IObjectType
import typings.mfiles.IObjectTypeTargetsForBrowsing
import typings.mfiles.ISessionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjType")
@js.native
class ObjType ()
  extends StObject
     with IObjectType {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  var AllowAdding: Boolean = js.native
  
  /* CompleteClass */
  var AllowedAsGroupingLevel: Boolean = js.native
  
  /* CompleteClass */
  var CanHaveFiles: Boolean = js.native
  
  /* CompleteClass */
  override def CanHaveItemIcons(): Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IObjectType = js.native
  
  /* CompleteClass */
  var DefaultAccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  var DefaultPropertyDef: Double = js.native
  
  /* CompleteClass */
  var External: Boolean = js.native
  
  /* CompleteClass */
  override val GUID: String = js.native
  
  /* CompleteClass */
  override def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
  
  /* CompleteClass */
  var HasOwnerType: Boolean = js.native
  
  /* CompleteClass */
  var Hierarchical: Boolean = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Icon: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def IsAddingAllowedForUser(SessionInfo: ISessionInfo): Boolean = js.native
  
  /* CompleteClass */
  var NamePlural: String = js.native
  
  /* CompleteClass */
  var NameSingular: String = js.native
  
  /* CompleteClass */
  var ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing = js.native
  
  /* CompleteClass */
  var OwnerPropertyDef: Double = js.native
  
  /* CompleteClass */
  var OwnerType: Double = js.native
  
  /* CompleteClass */
  override val ReadOnlyPropertiesDuringInsert: IIDs = js.native
  
  /* CompleteClass */
  override val ReadOnlyPropertiesDuringUpdate: IIDs = js.native
  
  /* CompleteClass */
  var RealObjectType: Boolean = js.native
  
  /* CompleteClass */
  var ShowCreationCommandInTaskPane: Boolean = js.native
  
  /* CompleteClass */
  var Translatable: Boolean = js.native
}
