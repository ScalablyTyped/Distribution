package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.IFileClass
import typings.mfiles.IObjVer
import typings.mfiles.IObjectWindowResult
import typings.mfiles.IPropertyValues
import typings.mfiles.MFiles.MFObjectWindowResultCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectWindowResult")
@js.native
class ObjectWindowResult ()
  extends StObject
     with IObjectWindowResult {
  
  /* CompleteClass */
  override val AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override val ObjVer: IObjVer = js.native
  
  /* CompleteClass */
  override val Properties: IPropertyValues = js.native
  
  /* CompleteClass */
  override val Result: MFObjectWindowResultCode = js.native
  
  /* CompleteClass */
  override val SelectedFileClass: IFileClass = js.native
  
  /* CompleteClass */
  override val UseAsDefaults: Boolean = js.native
  
  /* CompleteClass */
  override val Visible: Boolean = js.native
}
