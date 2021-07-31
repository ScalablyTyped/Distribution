package typings.mfiles.global.MFiles

import typings.mfiles.IVaultOnServer
import typings.mfiles.IVaultsOnServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultsOnServer")
@js.native
class VaultsOnServer ()
  extends StObject
     with IVaultsOnServer {
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetVaultByGUID(GUID: String): IVaultOnServer = js.native
  
  /* CompleteClass */
  override def GetVaultByName(Name: String): IVaultOnServer = js.native
  
  /* CompleteClass */
  override def GetVaultIndexByGUID(GUID: String): Double = js.native
  
  /* CompleteClass */
  override def GetVaultIndexByName(Name: String): Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IVaultOnServer = js.native
}
