package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlListComponent
import typings.mfiles.IAccessControlListComponentContainer
import typings.mfiles.IAccessControlListComponentKey
import typings.mfiles.IAccessControlListComponentKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlListComponentContainer")
@js.native
open class AccessControlListComponentContainer ()
  extends StObject
     with IAccessControlListComponentContainer {
  
  /* CompleteClass */
  override def At(AccessControlListComponentKey: IAccessControlListComponentKey): IAccessControlListComponent = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetKeys(): IAccessControlListComponentKeys = js.native
  
  /* CompleteClass */
  override def HasKey(AccessControlListComponentKey: IAccessControlListComponentKey): Boolean = js.native
}
