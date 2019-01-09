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

