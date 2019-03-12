package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEntryEvents extends IEvents {
  var OnAddObjectFile: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* sourceObjectFile */ ISourceObjectFile, 
      scala.Null | scala.Boolean | Anon_ErrorCode
    ]
  ] = js.undefined
  var OnAddObjectToFavorites: js.UndefOr[
    js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnAddObjectsToFavorites: js.UndefOr[
    js.Function1[/* objIDs */ IObjIDs, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnChangeVaultLanguage: js.UndefOr[
    js.Function1[
      /* languageID */ scala.Double, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage
    ]
  ] = js.undefined
  var OnCheckInObject: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* propertyValues */ IPropertyValues, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnCheckInObjects: js.UndefOr[
    js.Function2[
      /* objVers */ IObjVers, 
      /* propertyValues */ IPropertyValues, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ]
  ] = js.undefined
  var OnCheckOutObject: js.UndefOr[
    js.Function1[
      /* objID */ IObjID, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnCheckOutObjects: js.UndefOr[
    js.Function1[
      /* objIDs */ IObjIDs, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ]
  ] = js.undefined
  var OnCreateObject: js.UndefOr[
    js.Function6[
      /* objectType */ scala.Double, 
      /* propertyValues */ IPropertyValues, 
      /* sourceObjectFiles */ ISourceObjectFiles, 
      /* accessControlList */ IAccessControlList, 
      /* checkInRequested */ scala.Boolean, 
      /* singleFileRequested */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnDestroyObject: js.UndefOr[
    js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnDestroyObjectVersion: js.UndefOr[
    js.Function1[/* objVer */ IObjVer, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnDestroyObjectVersions: js.UndefOr[
    js.Function1[/* objVers */ IObjVers, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnDestroyObjects: js.UndefOr[
    js.Function1[/* objIDs */ IObjIDs, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnLogOut: js.UndefOr[js.Function0[scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]] = js.undefined
  var OnLoggedIn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnModifyObjectVersionLabels: js.UndefOr[
    js.Function5[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ scala.Boolean, 
      /* append */ scala.Boolean, 
      /* labelIDs */ IIDs, 
      /* singleLabelRequired */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage
    ]
  ] = js.undefined
  var OnNotification: js.UndefOr[
    js.Function3[/* id */ java.lang.String, /* data1 */ js.Any, /* data2 */ js.Any, _]
  ] = js.undefined
  var OnObjectAddedToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, scala.Unit]] = js.undefined
  var OnObjectCheckedIn: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectCheckedOut: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectCheckoutUndone: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectCheckoutsUndone: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, scala.Unit]] = js.undefined
  var OnObjectCreated: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectDestroyed: js.UndefOr[js.Function1[/* objID */ IObjID, scala.Unit]] = js.undefined
  var OnObjectFileAdded: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, scala.Unit]
  ] = js.undefined
  var OnObjectFileRemoved: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer, scala.Unit]
  ] = js.undefined
  var OnObjectFileRenamed: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, scala.Unit]
  ] = js.undefined
  var OnObjectLevelPropertySet: js.UndefOr[js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, scala.Unit]] = js.undefined
  var OnObjectOfflineAvailabilityRemoved: js.UndefOr[js.Function1[/* objID */ IObjID, scala.Unit]] = js.undefined
  var OnObjectOfflineAvailabilitySet: js.UndefOr[js.Function1[/* objID */ IObjID, scala.Unit]] = js.undefined
  var OnObjectRemoved: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectRemovedFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, scala.Unit]] = js.undefined
  var OnObjectUndeleted: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectVersionDestroyed: js.UndefOr[js.Function1[/* objVer */ IObjVer, scala.Unit]] = js.undefined
  var OnObjectVersionLabelsModified: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ scala.Boolean, 
      /* append */ scala.Boolean, 
      /* labelIDs */ IIDs, 
      scala.Unit
    ]
  ] = js.undefined
  var OnObjectVersionPermissionsSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectVersionRolledBack: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnObjectVersionsDestroyed: js.UndefOr[js.Function1[/* objVers */ IObjVers, scala.Unit]] = js.undefined
  var OnObjectsAddedToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, scala.Unit]] = js.undefined
  var OnObjectsCheckedIn: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, scala.Unit]] = js.undefined
  var OnObjectsCheckedOut: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, scala.Unit]] = js.undefined
  var OnObjectsDestroyed: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, scala.Unit]] = js.undefined
  var OnObjectsRemoved: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, scala.Unit]] = js.undefined
  var OnObjectsRemovedFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, scala.Unit]] = js.undefined
  var OnPropertiesOfObjectVersionSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
  var OnPropertiesOfObjectVersionsSet: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, scala.Unit]] = js.undefined
  var OnRemoveObject: js.UndefOr[
    js.Function1[
      /* objID */ IObjID, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnRemoveObjectFile: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnRemoveObjectFromFavorites: js.UndefOr[
    js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnRemoveObjectOfflineAvailability: js.UndefOr[
    js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnRemoveObjects: js.UndefOr[
    js.Function1[
      /* objIDs */ IObjIDs, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ]
  ] = js.undefined
  var OnRemoveObjectsFromFavorites: js.UndefOr[
    js.Function1[/* objIDs */ IObjIDs, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnRenameObjectFile: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      /* newName */ scala.Null | ITypedValue, 
      /* newExtension */ scala.Null | ITypedValue, 
      scala.Null | scala.Boolean | Anon_ErrorCode
    ]
  ] = js.undefined
  var OnRollBackObjectVersion: js.UndefOr[
    js.Function1[
      /* objVer */ IObjVer, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnSetObjectLevelProperty: js.UndefOr[
    js.Function2[
      /* objID */ IObjID, 
      /* propertyValue */ IPropertyValue, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage
    ]
  ] = js.undefined
  var OnSetObjectOfflineAvailability: js.UndefOr[
    js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]
  ] = js.undefined
  var OnSetObjectVersionPermissions: js.UndefOr[
    js.Function3[
      /* objVer */ IObjVer, 
      /* changeAllVersions */ scala.Boolean, 
      /* accessControlList */ IAccessControlList, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnSetPropertiesOfObjectVersion: js.UndefOr[
    js.Function3[
      /* setPropertiesParams */ ISetPropertiesParams, 
      /* singlePropertyUpdate */ scala.Boolean, 
      /* singlePropertyRemove */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnSetPropertiesOfObjectVersions: js.UndefOr[
    js.Function3[
      /* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, 
      /* singlePropertyUpdate */ scala.Boolean, 
      /* singlePropertyRemove */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ]
  ] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnSwitchToOfflineMode: js.UndefOr[js.Function0[scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]] = js.undefined
  var OnSwitchToOnlineMode: js.UndefOr[js.Function0[scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage]] = js.undefined
  var OnSwitchedToOfflineMode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnSwitchedToOnlineMode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnUndeleteObject: js.UndefOr[
    js.Function1[
      /* objID */ IObjID, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnUndeleteObjects: js.UndefOr[
    js.Function1[
      /* objIDs */ IObjIDs, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ]
  ] = js.undefined
  var OnUndoObjectCheckout: js.UndefOr[
    js.Function1[
      /* objVer */ IObjVer, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ]
  ] = js.undefined
  var OnUndoObjectCheckouts: js.UndefOr[
    js.Function1[
      /* objVers */ IObjVers, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ]
  ] = js.undefined
  var OnVaultLanguageChanged: js.UndefOr[js.Function1[/* languageID */ scala.Double, scala.Unit]] = js.undefined
}

object IVaultEntryEvents {
  @scala.inline
  def apply(
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnAddObjectFile: (/* objVer */ IObjVer, /* sourceObjectFile */ ISourceObjectFile) => scala.Null | scala.Boolean | Anon_ErrorCode = null,
    OnAddObjectToFavorites: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnAddObjectsToFavorites: /* objIDs */ IObjIDs => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnChangeVaultLanguage: /* languageID */ scala.Double => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnCheckInObject: (/* objVer */ IObjVer, /* propertyValues */ IPropertyValues) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnCheckInObjects: (/* objVers */ IObjVers, /* propertyValues */ IPropertyValues) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally = null,
    OnCheckOutObject: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnCheckOutObjects: /* objIDs */ IObjIDs => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally = null,
    OnCreateObject: (/* objectType */ scala.Double, /* propertyValues */ IPropertyValues, /* sourceObjectFiles */ ISourceObjectFiles, /* accessControlList */ IAccessControlList, /* checkInRequested */ scala.Boolean, /* singleFileRequested */ scala.Boolean) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnDestroyObject: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnDestroyObjectVersion: /* objVer */ IObjVer => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnDestroyObjectVersions: /* objVers */ IObjVers => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnDestroyObjects: /* objIDs */ IObjIDs => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnLogOut: () => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnLoggedIn: () => scala.Unit = null,
    OnModifyObjectVersionLabels: (/* objVer */ IObjVer, /* clearFromOtherVersions */ scala.Boolean, /* append */ scala.Boolean, /* labelIDs */ IIDs, /* singleLabelRequired */ scala.Boolean) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnNotification: (/* id */ java.lang.String, /* data1 */ js.Any, /* data2 */ js.Any) => _ = null,
    OnObjectAddedToFavorites: /* objID */ IObjID => scala.Unit = null,
    OnObjectCheckedIn: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectCheckedOut: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectCheckoutUndone: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectCheckoutsUndone: /* objectVersions */ IObjectVersions => scala.Unit = null,
    OnObjectCreated: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectDestroyed: /* objID */ IObjID => scala.Unit = null,
    OnObjectFileAdded: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => scala.Unit = null,
    OnObjectFileRemoved: (/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer) => scala.Unit = null,
    OnObjectFileRenamed: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => scala.Unit = null,
    OnObjectLevelPropertySet: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => scala.Unit = null,
    OnObjectOfflineAvailabilityRemoved: /* objID */ IObjID => scala.Unit = null,
    OnObjectOfflineAvailabilitySet: /* objID */ IObjID => scala.Unit = null,
    OnObjectRemoved: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectRemovedFromFavorites: /* objID */ IObjID => scala.Unit = null,
    OnObjectUndeleted: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectVersionDestroyed: /* objVer */ IObjVer => scala.Unit = null,
    OnObjectVersionLabelsModified: (/* objVer */ IObjVer, /* clearFromOtherVersions */ scala.Boolean, /* append */ scala.Boolean, /* labelIDs */ IIDs) => scala.Unit = null,
    OnObjectVersionPermissionsSet: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectVersionRolledBack: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnObjectVersionsDestroyed: /* objVers */ IObjVers => scala.Unit = null,
    OnObjectsAddedToFavorites: /* objIDs */ IObjIDs => scala.Unit = null,
    OnObjectsCheckedIn: /* objectVersions */ IObjectVersions => scala.Unit = null,
    OnObjectsCheckedOut: /* objectVersions */ IObjectVersions => scala.Unit = null,
    OnObjectsDestroyed: /* objIDs */ IObjIDs => scala.Unit = null,
    OnObjectsRemoved: /* objectVersions */ IObjectVersions => scala.Unit = null,
    OnObjectsRemovedFromFavorites: /* objIDs */ IObjIDs => scala.Unit = null,
    OnPropertiesOfObjectVersionSet: /* objectVersion */ IObjectVersion => scala.Unit = null,
    OnPropertiesOfObjectVersionsSet: /* objectVersions */ IObjectVersions => scala.Unit = null,
    OnRemoveObject: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnRemoveObjectFile: (/* objVer */ IObjVer, /* fileVer */ IFileVer) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnRemoveObjectFromFavorites: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnRemoveObjectOfflineAvailability: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnRemoveObjects: /* objIDs */ IObjIDs => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally = null,
    OnRemoveObjectsFromFavorites: /* objIDs */ IObjIDs => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnRenameObjectFile: (/* objVer */ IObjVer, /* fileVer */ IFileVer, /* newName */ scala.Null | ITypedValue, /* newExtension */ scala.Null | ITypedValue) => scala.Null | scala.Boolean | Anon_ErrorCode = null,
    OnRollBackObjectVersion: /* objVer */ IObjVer => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnSetObjectLevelProperty: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnSetObjectOfflineAvailability: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnSetObjectVersionPermissions: (/* objVer */ IObjVer, /* changeAllVersions */ scala.Boolean, /* accessControlList */ IAccessControlList) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnSetPropertiesOfObjectVersion: (/* setPropertiesParams */ ISetPropertiesParams, /* singlePropertyUpdate */ scala.Boolean, /* singlePropertyRemove */ scala.Boolean) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnSetPropertiesOfObjectVersions: (/* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, /* singlePropertyUpdate */ scala.Boolean, /* singlePropertyRemove */ scala.Boolean) => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally = null,
    OnStarted: () => scala.Unit = null,
    OnStop: () => scala.Unit = null,
    OnSwitchToOfflineMode: () => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnSwitchToOnlineMode: () => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage = null,
    OnSwitchedToOfflineMode: () => scala.Unit = null,
    OnSwitchedToOnlineMode: () => scala.Unit = null,
    OnUndeleteObject: /* objID */ IObjID => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnUndeleteObjects: /* objIDs */ IObjIDs => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally = null,
    OnUndoObjectCheckout: /* objVer */ IObjVer => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack = null,
    OnUndoObjectCheckouts: /* objVers */ IObjVers => scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally = null,
    OnVaultLanguageChanged: /* languageID */ scala.Double => scala.Unit = null
  ): IVaultEntryEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnAddObjectFile != null) __obj.updateDynamic("OnAddObjectFile")(js.Any.fromFunction2(OnAddObjectFile))
    if (OnAddObjectToFavorites != null) __obj.updateDynamic("OnAddObjectToFavorites")(js.Any.fromFunction1(OnAddObjectToFavorites))
    if (OnAddObjectsToFavorites != null) __obj.updateDynamic("OnAddObjectsToFavorites")(js.Any.fromFunction1(OnAddObjectsToFavorites))
    if (OnChangeVaultLanguage != null) __obj.updateDynamic("OnChangeVaultLanguage")(js.Any.fromFunction1(OnChangeVaultLanguage))
    if (OnCheckInObject != null) __obj.updateDynamic("OnCheckInObject")(js.Any.fromFunction2(OnCheckInObject))
    if (OnCheckInObjects != null) __obj.updateDynamic("OnCheckInObjects")(js.Any.fromFunction2(OnCheckInObjects))
    if (OnCheckOutObject != null) __obj.updateDynamic("OnCheckOutObject")(js.Any.fromFunction1(OnCheckOutObject))
    if (OnCheckOutObjects != null) __obj.updateDynamic("OnCheckOutObjects")(js.Any.fromFunction1(OnCheckOutObjects))
    if (OnCreateObject != null) __obj.updateDynamic("OnCreateObject")(js.Any.fromFunction6(OnCreateObject))
    if (OnDestroyObject != null) __obj.updateDynamic("OnDestroyObject")(js.Any.fromFunction1(OnDestroyObject))
    if (OnDestroyObjectVersion != null) __obj.updateDynamic("OnDestroyObjectVersion")(js.Any.fromFunction1(OnDestroyObjectVersion))
    if (OnDestroyObjectVersions != null) __obj.updateDynamic("OnDestroyObjectVersions")(js.Any.fromFunction1(OnDestroyObjectVersions))
    if (OnDestroyObjects != null) __obj.updateDynamic("OnDestroyObjects")(js.Any.fromFunction1(OnDestroyObjects))
    if (OnLogOut != null) __obj.updateDynamic("OnLogOut")(js.Any.fromFunction0(OnLogOut))
    if (OnLoggedIn != null) __obj.updateDynamic("OnLoggedIn")(js.Any.fromFunction0(OnLoggedIn))
    if (OnModifyObjectVersionLabels != null) __obj.updateDynamic("OnModifyObjectVersionLabels")(js.Any.fromFunction5(OnModifyObjectVersionLabels))
    if (OnNotification != null) __obj.updateDynamic("OnNotification")(js.Any.fromFunction3(OnNotification))
    if (OnObjectAddedToFavorites != null) __obj.updateDynamic("OnObjectAddedToFavorites")(js.Any.fromFunction1(OnObjectAddedToFavorites))
    if (OnObjectCheckedIn != null) __obj.updateDynamic("OnObjectCheckedIn")(js.Any.fromFunction1(OnObjectCheckedIn))
    if (OnObjectCheckedOut != null) __obj.updateDynamic("OnObjectCheckedOut")(js.Any.fromFunction1(OnObjectCheckedOut))
    if (OnObjectCheckoutUndone != null) __obj.updateDynamic("OnObjectCheckoutUndone")(js.Any.fromFunction1(OnObjectCheckoutUndone))
    if (OnObjectCheckoutsUndone != null) __obj.updateDynamic("OnObjectCheckoutsUndone")(js.Any.fromFunction1(OnObjectCheckoutsUndone))
    if (OnObjectCreated != null) __obj.updateDynamic("OnObjectCreated")(js.Any.fromFunction1(OnObjectCreated))
    if (OnObjectDestroyed != null) __obj.updateDynamic("OnObjectDestroyed")(js.Any.fromFunction1(OnObjectDestroyed))
    if (OnObjectFileAdded != null) __obj.updateDynamic("OnObjectFileAdded")(js.Any.fromFunction2(OnObjectFileAdded))
    if (OnObjectFileRemoved != null) __obj.updateDynamic("OnObjectFileRemoved")(js.Any.fromFunction2(OnObjectFileRemoved))
    if (OnObjectFileRenamed != null) __obj.updateDynamic("OnObjectFileRenamed")(js.Any.fromFunction2(OnObjectFileRenamed))
    if (OnObjectLevelPropertySet != null) __obj.updateDynamic("OnObjectLevelPropertySet")(js.Any.fromFunction2(OnObjectLevelPropertySet))
    if (OnObjectOfflineAvailabilityRemoved != null) __obj.updateDynamic("OnObjectOfflineAvailabilityRemoved")(js.Any.fromFunction1(OnObjectOfflineAvailabilityRemoved))
    if (OnObjectOfflineAvailabilitySet != null) __obj.updateDynamic("OnObjectOfflineAvailabilitySet")(js.Any.fromFunction1(OnObjectOfflineAvailabilitySet))
    if (OnObjectRemoved != null) __obj.updateDynamic("OnObjectRemoved")(js.Any.fromFunction1(OnObjectRemoved))
    if (OnObjectRemovedFromFavorites != null) __obj.updateDynamic("OnObjectRemovedFromFavorites")(js.Any.fromFunction1(OnObjectRemovedFromFavorites))
    if (OnObjectUndeleted != null) __obj.updateDynamic("OnObjectUndeleted")(js.Any.fromFunction1(OnObjectUndeleted))
    if (OnObjectVersionDestroyed != null) __obj.updateDynamic("OnObjectVersionDestroyed")(js.Any.fromFunction1(OnObjectVersionDestroyed))
    if (OnObjectVersionLabelsModified != null) __obj.updateDynamic("OnObjectVersionLabelsModified")(js.Any.fromFunction4(OnObjectVersionLabelsModified))
    if (OnObjectVersionPermissionsSet != null) __obj.updateDynamic("OnObjectVersionPermissionsSet")(js.Any.fromFunction1(OnObjectVersionPermissionsSet))
    if (OnObjectVersionRolledBack != null) __obj.updateDynamic("OnObjectVersionRolledBack")(js.Any.fromFunction1(OnObjectVersionRolledBack))
    if (OnObjectVersionsDestroyed != null) __obj.updateDynamic("OnObjectVersionsDestroyed")(js.Any.fromFunction1(OnObjectVersionsDestroyed))
    if (OnObjectsAddedToFavorites != null) __obj.updateDynamic("OnObjectsAddedToFavorites")(js.Any.fromFunction1(OnObjectsAddedToFavorites))
    if (OnObjectsCheckedIn != null) __obj.updateDynamic("OnObjectsCheckedIn")(js.Any.fromFunction1(OnObjectsCheckedIn))
    if (OnObjectsCheckedOut != null) __obj.updateDynamic("OnObjectsCheckedOut")(js.Any.fromFunction1(OnObjectsCheckedOut))
    if (OnObjectsDestroyed != null) __obj.updateDynamic("OnObjectsDestroyed")(js.Any.fromFunction1(OnObjectsDestroyed))
    if (OnObjectsRemoved != null) __obj.updateDynamic("OnObjectsRemoved")(js.Any.fromFunction1(OnObjectsRemoved))
    if (OnObjectsRemovedFromFavorites != null) __obj.updateDynamic("OnObjectsRemovedFromFavorites")(js.Any.fromFunction1(OnObjectsRemovedFromFavorites))
    if (OnPropertiesOfObjectVersionSet != null) __obj.updateDynamic("OnPropertiesOfObjectVersionSet")(js.Any.fromFunction1(OnPropertiesOfObjectVersionSet))
    if (OnPropertiesOfObjectVersionsSet != null) __obj.updateDynamic("OnPropertiesOfObjectVersionsSet")(js.Any.fromFunction1(OnPropertiesOfObjectVersionsSet))
    if (OnRemoveObject != null) __obj.updateDynamic("OnRemoveObject")(js.Any.fromFunction1(OnRemoveObject))
    if (OnRemoveObjectFile != null) __obj.updateDynamic("OnRemoveObjectFile")(js.Any.fromFunction2(OnRemoveObjectFile))
    if (OnRemoveObjectFromFavorites != null) __obj.updateDynamic("OnRemoveObjectFromFavorites")(js.Any.fromFunction1(OnRemoveObjectFromFavorites))
    if (OnRemoveObjectOfflineAvailability != null) __obj.updateDynamic("OnRemoveObjectOfflineAvailability")(js.Any.fromFunction1(OnRemoveObjectOfflineAvailability))
    if (OnRemoveObjects != null) __obj.updateDynamic("OnRemoveObjects")(js.Any.fromFunction1(OnRemoveObjects))
    if (OnRemoveObjectsFromFavorites != null) __obj.updateDynamic("OnRemoveObjectsFromFavorites")(js.Any.fromFunction1(OnRemoveObjectsFromFavorites))
    if (OnRenameObjectFile != null) __obj.updateDynamic("OnRenameObjectFile")(js.Any.fromFunction4(OnRenameObjectFile))
    if (OnRollBackObjectVersion != null) __obj.updateDynamic("OnRollBackObjectVersion")(js.Any.fromFunction1(OnRollBackObjectVersion))
    if (OnSetObjectLevelProperty != null) __obj.updateDynamic("OnSetObjectLevelProperty")(js.Any.fromFunction2(OnSetObjectLevelProperty))
    if (OnSetObjectOfflineAvailability != null) __obj.updateDynamic("OnSetObjectOfflineAvailability")(js.Any.fromFunction1(OnSetObjectOfflineAvailability))
    if (OnSetObjectVersionPermissions != null) __obj.updateDynamic("OnSetObjectVersionPermissions")(js.Any.fromFunction3(OnSetObjectVersionPermissions))
    if (OnSetPropertiesOfObjectVersion != null) __obj.updateDynamic("OnSetPropertiesOfObjectVersion")(js.Any.fromFunction3(OnSetPropertiesOfObjectVersion))
    if (OnSetPropertiesOfObjectVersions != null) __obj.updateDynamic("OnSetPropertiesOfObjectVersions")(js.Any.fromFunction3(OnSetPropertiesOfObjectVersions))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    if (OnSwitchToOfflineMode != null) __obj.updateDynamic("OnSwitchToOfflineMode")(js.Any.fromFunction0(OnSwitchToOfflineMode))
    if (OnSwitchToOnlineMode != null) __obj.updateDynamic("OnSwitchToOnlineMode")(js.Any.fromFunction0(OnSwitchToOnlineMode))
    if (OnSwitchedToOfflineMode != null) __obj.updateDynamic("OnSwitchedToOfflineMode")(js.Any.fromFunction0(OnSwitchedToOfflineMode))
    if (OnSwitchedToOnlineMode != null) __obj.updateDynamic("OnSwitchedToOnlineMode")(js.Any.fromFunction0(OnSwitchedToOnlineMode))
    if (OnUndeleteObject != null) __obj.updateDynamic("OnUndeleteObject")(js.Any.fromFunction1(OnUndeleteObject))
    if (OnUndeleteObjects != null) __obj.updateDynamic("OnUndeleteObjects")(js.Any.fromFunction1(OnUndeleteObjects))
    if (OnUndoObjectCheckout != null) __obj.updateDynamic("OnUndoObjectCheckout")(js.Any.fromFunction1(OnUndoObjectCheckout))
    if (OnUndoObjectCheckouts != null) __obj.updateDynamic("OnUndoObjectCheckouts")(js.Any.fromFunction1(OnUndoObjectCheckouts))
    if (OnVaultLanguageChanged != null) __obj.updateDynamic("OnVaultLanguageChanged")(js.Any.fromFunction1(OnVaultLanguageChanged))
    __obj.asInstanceOf[IVaultEntryEvents]
  }
}

