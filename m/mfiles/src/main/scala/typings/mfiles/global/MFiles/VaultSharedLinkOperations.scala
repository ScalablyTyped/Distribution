package typings.mfiles.global.MFiles

import typings.mfiles.IObjID
import typings.mfiles.ISharedLinkInfo
import typings.mfiles.ISharedLinkInfos
import typings.mfiles.IVaultSharedLinkOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultSharedLinkOperations")
@js.native
open class VaultSharedLinkOperations ()
  extends StObject
     with IVaultSharedLinkOperations {
  
  /* CompleteClass */
  override def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo = js.native
  
  /* CompleteClass */
  override def DeleteSharedLink(AccessKey: String): Unit = js.native
  
  /* CompleteClass */
  override def GetSharedLink(AccessKey: String): ISharedLinkInfo = js.native
  
  /* CompleteClass */
  override def GetSharedLinks(CreatedByUser: Double): ISharedLinkInfos = js.native
  
  /* CompleteClass */
  override def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos = js.native
}
