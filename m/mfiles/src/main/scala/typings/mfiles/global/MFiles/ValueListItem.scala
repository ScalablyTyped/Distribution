package typings.mfiles.global.MFiles

import typings.mfiles.IAutomaticPermissions
import typings.mfiles.IValueListItem
import typings.mfiles.MFiles.MFBuiltInValueList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ValueListItem")
@js.native
open class ValueListItem ()
  extends StObject
     with IValueListItem {
  
  /* CompleteClass */
  var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  
  /* CompleteClass */
  override def Clone(): IValueListItem = js.native
  
  /* CompleteClass */
  override def CloneFrom(ValueListItem: IValueListItem): Unit = js.native
  
  /* CompleteClass */
  override val Deleted: Boolean = js.native
  
  /* CompleteClass */
  override val DisplayID: String = js.native
  
  /* CompleteClass */
  override val DisplayIDAvailable: Boolean = js.native
  
  /* CompleteClass */
  override def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
  
  /* CompleteClass */
  var HasOwner: Boolean = js.native
  
  /* CompleteClass */
  var HasParent: Boolean = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Icon: js.Array[Double] = js.native
  
  /* CompleteClass */
  override val ItemGUID: String = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var OwnerID: Double = js.native
  
  /* CompleteClass */
  var ParentID: Double = js.native
  
  /* CompleteClass */
  var ValueListID: MFBuiltInValueList | Double = js.native
}
