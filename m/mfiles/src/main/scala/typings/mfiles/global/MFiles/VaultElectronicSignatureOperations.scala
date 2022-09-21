package typings.mfiles.global.MFiles

import typings.mfiles.IObjVer
import typings.mfiles.IObjectVersionAndProperties
import typings.mfiles.IVaultElectronicSignatureOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultElectronicSignatureOperations")
@js.native
open class VaultElectronicSignatureOperations ()
  extends StObject
     with IVaultElectronicSignatureOperations {
  
  /* CompleteClass */
  override def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def AddEmptySignatures(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def DisconnectSignatureEx(ObjVer: IObjVer, SignatureIdentifier: String, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def DisconnectSignatures(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties = js.native
}
