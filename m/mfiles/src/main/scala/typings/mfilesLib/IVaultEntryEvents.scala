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
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnAddObjectFile: js.Function2[
      /* objVer */ IObjVer, 
      /* sourceObjectFile */ ISourceObjectFile, 
      scala.Null | scala.Boolean | Anon_ErrorCode
    ] = null,
    OnAddObjectToFavorites: js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnAddObjectsToFavorites: js.Function1[/* objIDs */ IObjIDs, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnChangeVaultLanguage: js.Function1[
      /* languageID */ scala.Double, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage
    ] = null,
    OnCheckInObject: js.Function2[
      /* objVer */ IObjVer, 
      /* propertyValues */ IPropertyValues, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnCheckInObjects: js.Function2[
      /* objVers */ IObjVers, 
      /* propertyValues */ IPropertyValues, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ] = null,
    OnCheckOutObject: js.Function1[
      /* objID */ IObjID, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnCheckOutObjects: js.Function1[
      /* objIDs */ IObjIDs, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ] = null,
    OnCreateObject: js.Function6[
      /* objectType */ scala.Double, 
      /* propertyValues */ IPropertyValues, 
      /* sourceObjectFiles */ ISourceObjectFiles, 
      /* accessControlList */ IAccessControlList, 
      /* checkInRequested */ scala.Boolean, 
      /* singleFileRequested */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnDestroyObject: js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnDestroyObjectVersion: js.Function1[/* objVer */ IObjVer, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnDestroyObjectVersions: js.Function1[/* objVers */ IObjVers, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnDestroyObjects: js.Function1[/* objIDs */ IObjIDs, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnLogOut: js.Function0[scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnLoggedIn: js.Function0[scala.Unit] = null,
    OnModifyObjectVersionLabels: js.Function5[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ scala.Boolean, 
      /* append */ scala.Boolean, 
      /* labelIDs */ IIDs, 
      /* singleLabelRequired */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage
    ] = null,
    OnNotification: js.Function3[/* id */ java.lang.String, /* data1 */ js.Any, /* data2 */ js.Any, _] = null,
    OnObjectAddedToFavorites: js.Function1[/* objID */ IObjID, scala.Unit] = null,
    OnObjectCheckedIn: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectCheckedOut: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectCheckoutUndone: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectCheckoutsUndone: js.Function1[/* objectVersions */ IObjectVersions, scala.Unit] = null,
    OnObjectCreated: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectDestroyed: js.Function1[/* objID */ IObjID, scala.Unit] = null,
    OnObjectFileAdded: js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, scala.Unit] = null,
    OnObjectFileRemoved: js.Function2[/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer, scala.Unit] = null,
    OnObjectFileRenamed: js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, scala.Unit] = null,
    OnObjectLevelPropertySet: js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, scala.Unit] = null,
    OnObjectOfflineAvailabilityRemoved: js.Function1[/* objID */ IObjID, scala.Unit] = null,
    OnObjectOfflineAvailabilitySet: js.Function1[/* objID */ IObjID, scala.Unit] = null,
    OnObjectRemoved: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectRemovedFromFavorites: js.Function1[/* objID */ IObjID, scala.Unit] = null,
    OnObjectUndeleted: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectVersionDestroyed: js.Function1[/* objVer */ IObjVer, scala.Unit] = null,
    OnObjectVersionLabelsModified: js.Function4[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ scala.Boolean, 
      /* append */ scala.Boolean, 
      /* labelIDs */ IIDs, 
      scala.Unit
    ] = null,
    OnObjectVersionPermissionsSet: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectVersionRolledBack: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnObjectVersionsDestroyed: js.Function1[/* objVers */ IObjVers, scala.Unit] = null,
    OnObjectsAddedToFavorites: js.Function1[/* objIDs */ IObjIDs, scala.Unit] = null,
    OnObjectsCheckedIn: js.Function1[/* objectVersions */ IObjectVersions, scala.Unit] = null,
    OnObjectsCheckedOut: js.Function1[/* objectVersions */ IObjectVersions, scala.Unit] = null,
    OnObjectsDestroyed: js.Function1[/* objIDs */ IObjIDs, scala.Unit] = null,
    OnObjectsRemoved: js.Function1[/* objectVersions */ IObjectVersions, scala.Unit] = null,
    OnObjectsRemovedFromFavorites: js.Function1[/* objIDs */ IObjIDs, scala.Unit] = null,
    OnPropertiesOfObjectVersionSet: js.Function1[/* objectVersion */ IObjectVersion, scala.Unit] = null,
    OnPropertiesOfObjectVersionsSet: js.Function1[/* objectVersions */ IObjectVersions, scala.Unit] = null,
    OnRemoveObject: js.Function1[
      /* objID */ IObjID, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnRemoveObjectFile: js.Function2[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnRemoveObjectFromFavorites: js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnRemoveObjectOfflineAvailability: js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnRemoveObjects: js.Function1[
      /* objIDs */ IObjIDs, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ] = null,
    OnRemoveObjectsFromFavorites: js.Function1[/* objIDs */ IObjIDs, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnRenameObjectFile: js.Function4[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      /* newName */ scala.Null | ITypedValue, 
      /* newExtension */ scala.Null | ITypedValue, 
      scala.Null | scala.Boolean | Anon_ErrorCode
    ] = null,
    OnRollBackObjectVersion: js.Function1[
      /* objVer */ IObjVer, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnSetObjectLevelProperty: js.Function2[
      /* objID */ IObjID, 
      /* propertyValue */ IPropertyValue, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage
    ] = null,
    OnSetObjectOfflineAvailability: js.Function1[/* objID */ IObjID, scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnSetObjectVersionPermissions: js.Function3[
      /* objVer */ IObjVer, 
      /* changeAllVersions */ scala.Boolean, 
      /* accessControlList */ IAccessControlList, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnSetPropertiesOfObjectVersion: js.Function3[
      /* setPropertiesParams */ ISetPropertiesParams, 
      /* singlePropertyUpdate */ scala.Boolean, 
      /* singlePropertyRemove */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnSetPropertiesOfObjectVersions: js.Function3[
      /* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, 
      /* singlePropertyUpdate */ scala.Boolean, 
      /* singlePropertyRemove */ scala.Boolean, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null,
    OnSwitchToOfflineMode: js.Function0[scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnSwitchToOnlineMode: js.Function0[scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessage] = null,
    OnSwitchedToOfflineMode: js.Function0[scala.Unit] = null,
    OnSwitchedToOnlineMode: js.Function0[scala.Unit] = null,
    OnUndeleteObject: js.Function1[
      /* objID */ IObjID, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnUndeleteObjects: js.Function1[
      /* objIDs */ IObjIDs, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ] = null,
    OnUndoObjectCheckout: js.Function1[
      /* objVer */ IObjVer, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStack
    ] = null,
    OnUndoObjectCheckouts: js.Function1[
      /* objVers */ IObjVers, 
      scala.Null | scala.Boolean | Anon_ErrorCodeErrorMessageErrorStackFinally
    ] = null,
    OnVaultLanguageChanged: js.Function1[/* languageID */ scala.Double, scala.Unit] = null
  ): IVaultEntryEvents = {
    val __obj = js.Dynamic.literal(Register = Register, Unregister = Unregister)
    if (OnAddObjectFile != null) __obj.updateDynamic("OnAddObjectFile")(OnAddObjectFile)
    if (OnAddObjectToFavorites != null) __obj.updateDynamic("OnAddObjectToFavorites")(OnAddObjectToFavorites)
    if (OnAddObjectsToFavorites != null) __obj.updateDynamic("OnAddObjectsToFavorites")(OnAddObjectsToFavorites)
    if (OnChangeVaultLanguage != null) __obj.updateDynamic("OnChangeVaultLanguage")(OnChangeVaultLanguage)
    if (OnCheckInObject != null) __obj.updateDynamic("OnCheckInObject")(OnCheckInObject)
    if (OnCheckInObjects != null) __obj.updateDynamic("OnCheckInObjects")(OnCheckInObjects)
    if (OnCheckOutObject != null) __obj.updateDynamic("OnCheckOutObject")(OnCheckOutObject)
    if (OnCheckOutObjects != null) __obj.updateDynamic("OnCheckOutObjects")(OnCheckOutObjects)
    if (OnCreateObject != null) __obj.updateDynamic("OnCreateObject")(OnCreateObject)
    if (OnDestroyObject != null) __obj.updateDynamic("OnDestroyObject")(OnDestroyObject)
    if (OnDestroyObjectVersion != null) __obj.updateDynamic("OnDestroyObjectVersion")(OnDestroyObjectVersion)
    if (OnDestroyObjectVersions != null) __obj.updateDynamic("OnDestroyObjectVersions")(OnDestroyObjectVersions)
    if (OnDestroyObjects != null) __obj.updateDynamic("OnDestroyObjects")(OnDestroyObjects)
    if (OnLogOut != null) __obj.updateDynamic("OnLogOut")(OnLogOut)
    if (OnLoggedIn != null) __obj.updateDynamic("OnLoggedIn")(OnLoggedIn)
    if (OnModifyObjectVersionLabels != null) __obj.updateDynamic("OnModifyObjectVersionLabels")(OnModifyObjectVersionLabels)
    if (OnNotification != null) __obj.updateDynamic("OnNotification")(OnNotification)
    if (OnObjectAddedToFavorites != null) __obj.updateDynamic("OnObjectAddedToFavorites")(OnObjectAddedToFavorites)
    if (OnObjectCheckedIn != null) __obj.updateDynamic("OnObjectCheckedIn")(OnObjectCheckedIn)
    if (OnObjectCheckedOut != null) __obj.updateDynamic("OnObjectCheckedOut")(OnObjectCheckedOut)
    if (OnObjectCheckoutUndone != null) __obj.updateDynamic("OnObjectCheckoutUndone")(OnObjectCheckoutUndone)
    if (OnObjectCheckoutsUndone != null) __obj.updateDynamic("OnObjectCheckoutsUndone")(OnObjectCheckoutsUndone)
    if (OnObjectCreated != null) __obj.updateDynamic("OnObjectCreated")(OnObjectCreated)
    if (OnObjectDestroyed != null) __obj.updateDynamic("OnObjectDestroyed")(OnObjectDestroyed)
    if (OnObjectFileAdded != null) __obj.updateDynamic("OnObjectFileAdded")(OnObjectFileAdded)
    if (OnObjectFileRemoved != null) __obj.updateDynamic("OnObjectFileRemoved")(OnObjectFileRemoved)
    if (OnObjectFileRenamed != null) __obj.updateDynamic("OnObjectFileRenamed")(OnObjectFileRenamed)
    if (OnObjectLevelPropertySet != null) __obj.updateDynamic("OnObjectLevelPropertySet")(OnObjectLevelPropertySet)
    if (OnObjectOfflineAvailabilityRemoved != null) __obj.updateDynamic("OnObjectOfflineAvailabilityRemoved")(OnObjectOfflineAvailabilityRemoved)
    if (OnObjectOfflineAvailabilitySet != null) __obj.updateDynamic("OnObjectOfflineAvailabilitySet")(OnObjectOfflineAvailabilitySet)
    if (OnObjectRemoved != null) __obj.updateDynamic("OnObjectRemoved")(OnObjectRemoved)
    if (OnObjectRemovedFromFavorites != null) __obj.updateDynamic("OnObjectRemovedFromFavorites")(OnObjectRemovedFromFavorites)
    if (OnObjectUndeleted != null) __obj.updateDynamic("OnObjectUndeleted")(OnObjectUndeleted)
    if (OnObjectVersionDestroyed != null) __obj.updateDynamic("OnObjectVersionDestroyed")(OnObjectVersionDestroyed)
    if (OnObjectVersionLabelsModified != null) __obj.updateDynamic("OnObjectVersionLabelsModified")(OnObjectVersionLabelsModified)
    if (OnObjectVersionPermissionsSet != null) __obj.updateDynamic("OnObjectVersionPermissionsSet")(OnObjectVersionPermissionsSet)
    if (OnObjectVersionRolledBack != null) __obj.updateDynamic("OnObjectVersionRolledBack")(OnObjectVersionRolledBack)
    if (OnObjectVersionsDestroyed != null) __obj.updateDynamic("OnObjectVersionsDestroyed")(OnObjectVersionsDestroyed)
    if (OnObjectsAddedToFavorites != null) __obj.updateDynamic("OnObjectsAddedToFavorites")(OnObjectsAddedToFavorites)
    if (OnObjectsCheckedIn != null) __obj.updateDynamic("OnObjectsCheckedIn")(OnObjectsCheckedIn)
    if (OnObjectsCheckedOut != null) __obj.updateDynamic("OnObjectsCheckedOut")(OnObjectsCheckedOut)
    if (OnObjectsDestroyed != null) __obj.updateDynamic("OnObjectsDestroyed")(OnObjectsDestroyed)
    if (OnObjectsRemoved != null) __obj.updateDynamic("OnObjectsRemoved")(OnObjectsRemoved)
    if (OnObjectsRemovedFromFavorites != null) __obj.updateDynamic("OnObjectsRemovedFromFavorites")(OnObjectsRemovedFromFavorites)
    if (OnPropertiesOfObjectVersionSet != null) __obj.updateDynamic("OnPropertiesOfObjectVersionSet")(OnPropertiesOfObjectVersionSet)
    if (OnPropertiesOfObjectVersionsSet != null) __obj.updateDynamic("OnPropertiesOfObjectVersionsSet")(OnPropertiesOfObjectVersionsSet)
    if (OnRemoveObject != null) __obj.updateDynamic("OnRemoveObject")(OnRemoveObject)
    if (OnRemoveObjectFile != null) __obj.updateDynamic("OnRemoveObjectFile")(OnRemoveObjectFile)
    if (OnRemoveObjectFromFavorites != null) __obj.updateDynamic("OnRemoveObjectFromFavorites")(OnRemoveObjectFromFavorites)
    if (OnRemoveObjectOfflineAvailability != null) __obj.updateDynamic("OnRemoveObjectOfflineAvailability")(OnRemoveObjectOfflineAvailability)
    if (OnRemoveObjects != null) __obj.updateDynamic("OnRemoveObjects")(OnRemoveObjects)
    if (OnRemoveObjectsFromFavorites != null) __obj.updateDynamic("OnRemoveObjectsFromFavorites")(OnRemoveObjectsFromFavorites)
    if (OnRenameObjectFile != null) __obj.updateDynamic("OnRenameObjectFile")(OnRenameObjectFile)
    if (OnRollBackObjectVersion != null) __obj.updateDynamic("OnRollBackObjectVersion")(OnRollBackObjectVersion)
    if (OnSetObjectLevelProperty != null) __obj.updateDynamic("OnSetObjectLevelProperty")(OnSetObjectLevelProperty)
    if (OnSetObjectOfflineAvailability != null) __obj.updateDynamic("OnSetObjectOfflineAvailability")(OnSetObjectOfflineAvailability)
    if (OnSetObjectVersionPermissions != null) __obj.updateDynamic("OnSetObjectVersionPermissions")(OnSetObjectVersionPermissions)
    if (OnSetPropertiesOfObjectVersion != null) __obj.updateDynamic("OnSetPropertiesOfObjectVersion")(OnSetPropertiesOfObjectVersion)
    if (OnSetPropertiesOfObjectVersions != null) __obj.updateDynamic("OnSetPropertiesOfObjectVersions")(OnSetPropertiesOfObjectVersions)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    if (OnSwitchToOfflineMode != null) __obj.updateDynamic("OnSwitchToOfflineMode")(OnSwitchToOfflineMode)
    if (OnSwitchToOnlineMode != null) __obj.updateDynamic("OnSwitchToOnlineMode")(OnSwitchToOnlineMode)
    if (OnSwitchedToOfflineMode != null) __obj.updateDynamic("OnSwitchedToOfflineMode")(OnSwitchedToOfflineMode)
    if (OnSwitchedToOnlineMode != null) __obj.updateDynamic("OnSwitchedToOnlineMode")(OnSwitchedToOnlineMode)
    if (OnUndeleteObject != null) __obj.updateDynamic("OnUndeleteObject")(OnUndeleteObject)
    if (OnUndeleteObjects != null) __obj.updateDynamic("OnUndeleteObjects")(OnUndeleteObjects)
    if (OnUndoObjectCheckout != null) __obj.updateDynamic("OnUndoObjectCheckout")(OnUndoObjectCheckout)
    if (OnUndoObjectCheckouts != null) __obj.updateDynamic("OnUndoObjectCheckouts")(OnUndoObjectCheckouts)
    if (OnVaultLanguageChanged != null) __obj.updateDynamic("OnVaultLanguageChanged")(OnVaultLanguageChanged)
    __obj.asInstanceOf[IVaultEntryEvents]
  }
}

