package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultExternalObjectOperationsAsync extends StObject {
  
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): Unit = js.native
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
