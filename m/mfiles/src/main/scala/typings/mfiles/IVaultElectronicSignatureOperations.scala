package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultElectronicSignatureOperations extends StObject {
  
  def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties
  
  def AddEmptySignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  
  def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties
  
  def DisconnectSignatureEx(ObjVer: IObjVer, SignatureIdentifier: String, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties
  
  def DisconnectSignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  
  def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties
}
object IVaultElectronicSignatureOperations {
  
  inline def apply(
    AddEmptySignature: (IObjVer, String) => IObjectVersionAndProperties,
    AddEmptySignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignature: (IObjVer, String) => IObjectVersionAndProperties,
    DisconnectSignatureEx: (IObjVer, String, Boolean) => IObjectVersionAndProperties,
    DisconnectSignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignaturesEx: (IObjVer, Boolean) => IObjectVersionAndProperties
  ): IVaultElectronicSignatureOperations = {
    val __obj = js.Dynamic.literal(AddEmptySignature = js.Any.fromFunction2(AddEmptySignature), AddEmptySignatures = js.Any.fromFunction1(AddEmptySignatures), DisconnectSignature = js.Any.fromFunction2(DisconnectSignature), DisconnectSignatureEx = js.Any.fromFunction3(DisconnectSignatureEx), DisconnectSignatures = js.Any.fromFunction1(DisconnectSignatures), DisconnectSignaturesEx = js.Any.fromFunction2(DisconnectSignaturesEx))
    __obj.asInstanceOf[IVaultElectronicSignatureOperations]
  }
  
  extension [Self <: IVaultElectronicSignatureOperations](x: Self) {
    
    inline def setAddEmptySignature(value: (IObjVer, String) => IObjectVersionAndProperties): Self = StObject.set(x, "AddEmptySignature", js.Any.fromFunction2(value))
    
    inline def setAddEmptySignatures(value: IObjVer => IObjectVersionAndProperties): Self = StObject.set(x, "AddEmptySignatures", js.Any.fromFunction1(value))
    
    inline def setDisconnectSignature(value: (IObjVer, String) => IObjectVersionAndProperties): Self = StObject.set(x, "DisconnectSignature", js.Any.fromFunction2(value))
    
    inline def setDisconnectSignatureEx(value: (IObjVer, String, Boolean) => IObjectVersionAndProperties): Self = StObject.set(x, "DisconnectSignatureEx", js.Any.fromFunction3(value))
    
    inline def setDisconnectSignatures(value: IObjVer => IObjectVersionAndProperties): Self = StObject.set(x, "DisconnectSignatures", js.Any.fromFunction1(value))
    
    inline def setDisconnectSignaturesEx(value: (IObjVer, Boolean) => IObjectVersionAndProperties): Self = StObject.set(x, "DisconnectSignaturesEx", js.Any.fromFunction2(value))
  }
}
