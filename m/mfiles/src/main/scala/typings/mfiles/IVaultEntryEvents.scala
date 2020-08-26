package typings.mfiles

import typings.mfiles.MFiles.Event
import typings.mfiles.anon.Finally
import typings.mfiles.anon.FinallyOnError
import typings.mfiles.anon.OnError
import typings.mfiles.anon.OnSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultEntryEvents extends IEvents {
  var OnAddObjectFile: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* sourceObjectFile */ ISourceObjectFile, 
      Null | Boolean | Finally
    ]
  ] = js.native
  var OnAddObjectToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnAddObjectsToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.native
  var OnChangeVaultLanguage: js.UndefOr[js.Function1[/* languageID */ Double, Null | Boolean | OnError]] = js.native
  var OnCheckInObject: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnCheckInObjects: js.UndefOr[
    js.Function2[
      /* objVers */ IObjVers, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | FinallyOnError
    ]
  ] = js.native
  var OnCheckOutObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.native
  var OnCheckOutObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.native
  var OnCreateObject: js.UndefOr[
    js.Function6[
      /* objectType */ Double, 
      /* propertyValues */ IPropertyValues, 
      /* sourceObjectFiles */ ISourceObjectFiles, 
      /* accessControlList */ IAccessControlList, 
      /* checkInRequested */ Boolean, 
      /* singleFileRequested */ Boolean, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnDestroyObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnDestroyObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnError]] = js.native
  var OnDestroyObjectVersions: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | OnError]] = js.native
  var OnDestroyObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.native
  var OnLogOut: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.native
  var OnLoggedIn: js.UndefOr[js.Function0[Unit]] = js.native
  var OnModifyObjectVersionLabels: js.UndefOr[
    js.Function5[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      /* singleLabelRequired */ Boolean, 
      Null | Boolean | OnError
    ]
  ] = js.native
  var OnNotification: js.UndefOr[js.Function3[/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any, _]] = js.native
  var OnObjectAddedToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectCheckedIn: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectCheckedOut: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectCheckoutUndone: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectCheckoutsUndone: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectCreated: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectDestroyed: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectFileAdded: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.native
  var OnObjectFileRemoved: js.UndefOr[js.Function2[/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer, Unit]] = js.native
  var OnObjectFileRenamed: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.native
  var OnObjectLevelPropertySet: js.UndefOr[js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Unit]] = js.native
  var OnObjectOfflineAvailabilityRemoved: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectOfflineAvailabilitySet: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectRemoved: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectRemovedFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectUndeleted: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectVersionDestroyed: js.UndefOr[js.Function1[/* objVer */ IObjVer, Unit]] = js.native
  var OnObjectVersionLabelsModified: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      Unit
    ]
  ] = js.native
  var OnObjectVersionPermissionsSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectVersionRolledBack: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectVersionsDestroyed: js.UndefOr[js.Function1[/* objVers */ IObjVers, Unit]] = js.native
  var OnObjectsAddedToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.native
  var OnObjectsCheckedIn: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectsCheckedOut: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectsDestroyed: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.native
  var OnObjectsRemoved: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectsRemovedFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.native
  var OnPropertiesOfObjectVersionSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnPropertiesOfObjectVersionsSet: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnRemoveObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.native
  var OnRemoveObjectFile: js.UndefOr[
    js.Function2[/* objVer */ IObjVer, /* fileVer */ IFileVer, Null | Boolean | OnSuccess]
  ] = js.native
  var OnRemoveObjectFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnRemoveObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnRemoveObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.native
  var OnRemoveObjectsFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.native
  var OnRenameObjectFile: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      /* newName */ Null | ITypedValue, 
      /* newExtension */ Null | ITypedValue, 
      Null | Boolean | Finally
    ]
  ] = js.native
  var OnRollBackObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnSuccess]] = js.native
  var OnSetObjectLevelProperty: js.UndefOr[
    js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Null | Boolean | OnError]
  ] = js.native
  var OnSetObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnSetObjectVersionPermissions: js.UndefOr[
    js.Function3[
      /* objVer */ IObjVer, 
      /* changeAllVersions */ Boolean, 
      /* accessControlList */ IAccessControlList, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnSetPropertiesOfObjectVersion: js.UndefOr[
    js.Function3[
      /* setPropertiesParams */ ISetPropertiesParams, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnSetPropertiesOfObjectVersions: js.UndefOr[
    js.Function3[
      /* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | FinallyOnError
    ]
  ] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
  var OnSwitchToOfflineMode: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.native
  var OnSwitchToOnlineMode: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.native
  var OnSwitchedToOfflineMode: js.UndefOr[js.Function0[Unit]] = js.native
  var OnSwitchedToOnlineMode: js.UndefOr[js.Function0[Unit]] = js.native
  var OnUndeleteObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.native
  var OnUndeleteObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.native
  var OnUndoObjectCheckout: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnSuccess]] = js.native
  var OnUndoObjectCheckouts: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | FinallyOnError]] = js.native
  var OnVaultLanguageChanged: js.UndefOr[js.Function1[/* languageID */ Double, Unit]] = js.native
}

object IVaultEntryEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IVaultEntryEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IVaultEntryEvents]
  }
  @scala.inline
  implicit class IVaultEntryEventsOps[Self <: IVaultEntryEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnAddObjectFile(
      value: (/* objVer */ IObjVer, /* sourceObjectFile */ ISourceObjectFile) => Null | Boolean | Finally
    ): Self = this.set("OnAddObjectFile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAddObjectFile: Self = this.set("OnAddObjectFile", js.undefined)
    @scala.inline
    def setOnAddObjectToFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = this.set("OnAddObjectToFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAddObjectToFavorites: Self = this.set("OnAddObjectToFavorites", js.undefined)
    @scala.inline
    def setOnAddObjectsToFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = this.set("OnAddObjectsToFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAddObjectsToFavorites: Self = this.set("OnAddObjectsToFavorites", js.undefined)
    @scala.inline
    def setOnChangeVaultLanguage(value: /* languageID */ Double => Null | Boolean | OnError): Self = this.set("OnChangeVaultLanguage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChangeVaultLanguage: Self = this.set("OnChangeVaultLanguage", js.undefined)
    @scala.inline
    def setOnCheckInObject(value: (/* objVer */ IObjVer, /* propertyValues */ IPropertyValues) => Null | Boolean | OnSuccess): Self = this.set("OnCheckInObject", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCheckInObject: Self = this.set("OnCheckInObject", js.undefined)
    @scala.inline
    def setOnCheckInObjects(
      value: (/* objVers */ IObjVers, /* propertyValues */ IPropertyValues) => Null | Boolean | FinallyOnError
    ): Self = this.set("OnCheckInObjects", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCheckInObjects: Self = this.set("OnCheckInObjects", js.undefined)
    @scala.inline
    def setOnCheckOutObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = this.set("OnCheckOutObject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCheckOutObject: Self = this.set("OnCheckOutObject", js.undefined)
    @scala.inline
    def setOnCheckOutObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = this.set("OnCheckOutObjects", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCheckOutObjects: Self = this.set("OnCheckOutObjects", js.undefined)
    @scala.inline
    def setOnCreateObject(
      value: (/* objectType */ Double, /* propertyValues */ IPropertyValues, /* sourceObjectFiles */ ISourceObjectFiles, /* accessControlList */ IAccessControlList, /* checkInRequested */ Boolean, /* singleFileRequested */ Boolean) => Null | Boolean | OnSuccess
    ): Self = this.set("OnCreateObject", js.Any.fromFunction6(value))
    @scala.inline
    def deleteOnCreateObject: Self = this.set("OnCreateObject", js.undefined)
    @scala.inline
    def setOnDestroyObject(value: /* objID */ IObjID => Null | Boolean | OnError): Self = this.set("OnDestroyObject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroyObject: Self = this.set("OnDestroyObject", js.undefined)
    @scala.inline
    def setOnDestroyObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnError): Self = this.set("OnDestroyObjectVersion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroyObjectVersion: Self = this.set("OnDestroyObjectVersion", js.undefined)
    @scala.inline
    def setOnDestroyObjectVersions(value: /* objVers */ IObjVers => Null | Boolean | OnError): Self = this.set("OnDestroyObjectVersions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroyObjectVersions: Self = this.set("OnDestroyObjectVersions", js.undefined)
    @scala.inline
    def setOnDestroyObjects(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = this.set("OnDestroyObjects", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroyObjects: Self = this.set("OnDestroyObjects", js.undefined)
    @scala.inline
    def setOnLogOut(value: () => Null | Boolean | OnError): Self = this.set("OnLogOut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLogOut: Self = this.set("OnLogOut", js.undefined)
    @scala.inline
    def setOnLoggedIn(value: () => Unit): Self = this.set("OnLoggedIn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoggedIn: Self = this.set("OnLoggedIn", js.undefined)
    @scala.inline
    def setOnModifyObjectVersionLabels(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs, /* singleLabelRequired */ Boolean) => Null | Boolean | OnError
    ): Self = this.set("OnModifyObjectVersionLabels", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnModifyObjectVersionLabels: Self = this.set("OnModifyObjectVersionLabels", js.undefined)
    @scala.inline
    def setOnNotification(value: (/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any) => _): Self = this.set("OnNotification", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNotification: Self = this.set("OnNotification", js.undefined)
    @scala.inline
    def setOnObjectAddedToFavorites(value: /* objID */ IObjID => Unit): Self = this.set("OnObjectAddedToFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectAddedToFavorites: Self = this.set("OnObjectAddedToFavorites", js.undefined)
    @scala.inline
    def setOnObjectCheckedIn(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectCheckedIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectCheckedIn: Self = this.set("OnObjectCheckedIn", js.undefined)
    @scala.inline
    def setOnObjectCheckedOut(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectCheckedOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectCheckedOut: Self = this.set("OnObjectCheckedOut", js.undefined)
    @scala.inline
    def setOnObjectCheckoutUndone(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectCheckoutUndone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectCheckoutUndone: Self = this.set("OnObjectCheckoutUndone", js.undefined)
    @scala.inline
    def setOnObjectCheckoutsUndone(value: /* objectVersions */ IObjectVersions => Unit): Self = this.set("OnObjectCheckoutsUndone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectCheckoutsUndone: Self = this.set("OnObjectCheckoutsUndone", js.undefined)
    @scala.inline
    def setOnObjectCreated(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectCreated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectCreated: Self = this.set("OnObjectCreated", js.undefined)
    @scala.inline
    def setOnObjectDestroyed(value: /* objID */ IObjID => Unit): Self = this.set("OnObjectDestroyed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectDestroyed: Self = this.set("OnObjectDestroyed", js.undefined)
    @scala.inline
    def setOnObjectFileAdded(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = this.set("OnObjectFileAdded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnObjectFileAdded: Self = this.set("OnObjectFileAdded", js.undefined)
    @scala.inline
    def setOnObjectFileRemoved(value: (/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer) => Unit): Self = this.set("OnObjectFileRemoved", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnObjectFileRemoved: Self = this.set("OnObjectFileRemoved", js.undefined)
    @scala.inline
    def setOnObjectFileRenamed(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = this.set("OnObjectFileRenamed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnObjectFileRenamed: Self = this.set("OnObjectFileRenamed", js.undefined)
    @scala.inline
    def setOnObjectLevelPropertySet(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Unit): Self = this.set("OnObjectLevelPropertySet", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnObjectLevelPropertySet: Self = this.set("OnObjectLevelPropertySet", js.undefined)
    @scala.inline
    def setOnObjectOfflineAvailabilityRemoved(value: /* objID */ IObjID => Unit): Self = this.set("OnObjectOfflineAvailabilityRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectOfflineAvailabilityRemoved: Self = this.set("OnObjectOfflineAvailabilityRemoved", js.undefined)
    @scala.inline
    def setOnObjectOfflineAvailabilitySet(value: /* objID */ IObjID => Unit): Self = this.set("OnObjectOfflineAvailabilitySet", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectOfflineAvailabilitySet: Self = this.set("OnObjectOfflineAvailabilitySet", js.undefined)
    @scala.inline
    def setOnObjectRemoved(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectRemoved: Self = this.set("OnObjectRemoved", js.undefined)
    @scala.inline
    def setOnObjectRemovedFromFavorites(value: /* objID */ IObjID => Unit): Self = this.set("OnObjectRemovedFromFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectRemovedFromFavorites: Self = this.set("OnObjectRemovedFromFavorites", js.undefined)
    @scala.inline
    def setOnObjectUndeleted(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectUndeleted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectUndeleted: Self = this.set("OnObjectUndeleted", js.undefined)
    @scala.inline
    def setOnObjectVersionDestroyed(value: /* objVer */ IObjVer => Unit): Self = this.set("OnObjectVersionDestroyed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectVersionDestroyed: Self = this.set("OnObjectVersionDestroyed", js.undefined)
    @scala.inline
    def setOnObjectVersionLabelsModified(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs) => Unit
    ): Self = this.set("OnObjectVersionLabelsModified", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnObjectVersionLabelsModified: Self = this.set("OnObjectVersionLabelsModified", js.undefined)
    @scala.inline
    def setOnObjectVersionPermissionsSet(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectVersionPermissionsSet", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectVersionPermissionsSet: Self = this.set("OnObjectVersionPermissionsSet", js.undefined)
    @scala.inline
    def setOnObjectVersionRolledBack(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnObjectVersionRolledBack", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectVersionRolledBack: Self = this.set("OnObjectVersionRolledBack", js.undefined)
    @scala.inline
    def setOnObjectVersionsDestroyed(value: /* objVers */ IObjVers => Unit): Self = this.set("OnObjectVersionsDestroyed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectVersionsDestroyed: Self = this.set("OnObjectVersionsDestroyed", js.undefined)
    @scala.inline
    def setOnObjectsAddedToFavorites(value: /* objIDs */ IObjIDs => Unit): Self = this.set("OnObjectsAddedToFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectsAddedToFavorites: Self = this.set("OnObjectsAddedToFavorites", js.undefined)
    @scala.inline
    def setOnObjectsCheckedIn(value: /* objectVersions */ IObjectVersions => Unit): Self = this.set("OnObjectsCheckedIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectsCheckedIn: Self = this.set("OnObjectsCheckedIn", js.undefined)
    @scala.inline
    def setOnObjectsCheckedOut(value: /* objectVersions */ IObjectVersions => Unit): Self = this.set("OnObjectsCheckedOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectsCheckedOut: Self = this.set("OnObjectsCheckedOut", js.undefined)
    @scala.inline
    def setOnObjectsDestroyed(value: /* objIDs */ IObjIDs => Unit): Self = this.set("OnObjectsDestroyed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectsDestroyed: Self = this.set("OnObjectsDestroyed", js.undefined)
    @scala.inline
    def setOnObjectsRemoved(value: /* objectVersions */ IObjectVersions => Unit): Self = this.set("OnObjectsRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectsRemoved: Self = this.set("OnObjectsRemoved", js.undefined)
    @scala.inline
    def setOnObjectsRemovedFromFavorites(value: /* objIDs */ IObjIDs => Unit): Self = this.set("OnObjectsRemovedFromFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnObjectsRemovedFromFavorites: Self = this.set("OnObjectsRemovedFromFavorites", js.undefined)
    @scala.inline
    def setOnPropertiesOfObjectVersionSet(value: /* objectVersion */ IObjectVersion => Unit): Self = this.set("OnPropertiesOfObjectVersionSet", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPropertiesOfObjectVersionSet: Self = this.set("OnPropertiesOfObjectVersionSet", js.undefined)
    @scala.inline
    def setOnPropertiesOfObjectVersionsSet(value: /* objectVersions */ IObjectVersions => Unit): Self = this.set("OnPropertiesOfObjectVersionsSet", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPropertiesOfObjectVersionsSet: Self = this.set("OnPropertiesOfObjectVersionsSet", js.undefined)
    @scala.inline
    def setOnRemoveObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = this.set("OnRemoveObject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemoveObject: Self = this.set("OnRemoveObject", js.undefined)
    @scala.inline
    def setOnRemoveObjectFile(value: (/* objVer */ IObjVer, /* fileVer */ IFileVer) => Null | Boolean | OnSuccess): Self = this.set("OnRemoveObjectFile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRemoveObjectFile: Self = this.set("OnRemoveObjectFile", js.undefined)
    @scala.inline
    def setOnRemoveObjectFromFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = this.set("OnRemoveObjectFromFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemoveObjectFromFavorites: Self = this.set("OnRemoveObjectFromFavorites", js.undefined)
    @scala.inline
    def setOnRemoveObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = this.set("OnRemoveObjectOfflineAvailability", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemoveObjectOfflineAvailability: Self = this.set("OnRemoveObjectOfflineAvailability", js.undefined)
    @scala.inline
    def setOnRemoveObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = this.set("OnRemoveObjects", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemoveObjects: Self = this.set("OnRemoveObjects", js.undefined)
    @scala.inline
    def setOnRemoveObjectsFromFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = this.set("OnRemoveObjectsFromFavorites", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemoveObjectsFromFavorites: Self = this.set("OnRemoveObjectsFromFavorites", js.undefined)
    @scala.inline
    def setOnRenameObjectFile(
      value: (/* objVer */ IObjVer, /* fileVer */ IFileVer, /* newName */ Null | ITypedValue, /* newExtension */ Null | ITypedValue) => Null | Boolean | Finally
    ): Self = this.set("OnRenameObjectFile", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnRenameObjectFile: Self = this.set("OnRenameObjectFile", js.undefined)
    @scala.inline
    def setOnRollBackObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = this.set("OnRollBackObjectVersion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRollBackObjectVersion: Self = this.set("OnRollBackObjectVersion", js.undefined)
    @scala.inline
    def setOnSetObjectLevelProperty(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Null | Boolean | OnError): Self = this.set("OnSetObjectLevelProperty", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSetObjectLevelProperty: Self = this.set("OnSetObjectLevelProperty", js.undefined)
    @scala.inline
    def setOnSetObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = this.set("OnSetObjectOfflineAvailability", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSetObjectOfflineAvailability: Self = this.set("OnSetObjectOfflineAvailability", js.undefined)
    @scala.inline
    def setOnSetObjectVersionPermissions(
      value: (/* objVer */ IObjVer, /* changeAllVersions */ Boolean, /* accessControlList */ IAccessControlList) => Null | Boolean | OnSuccess
    ): Self = this.set("OnSetObjectVersionPermissions", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSetObjectVersionPermissions: Self = this.set("OnSetObjectVersionPermissions", js.undefined)
    @scala.inline
    def setOnSetPropertiesOfObjectVersion(
      value: (/* setPropertiesParams */ ISetPropertiesParams, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | OnSuccess
    ): Self = this.set("OnSetPropertiesOfObjectVersion", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSetPropertiesOfObjectVersion: Self = this.set("OnSetPropertiesOfObjectVersion", js.undefined)
    @scala.inline
    def setOnSetPropertiesOfObjectVersions(
      value: (/* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | FinallyOnError
    ): Self = this.set("OnSetPropertiesOfObjectVersions", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSetPropertiesOfObjectVersions: Self = this.set("OnSetPropertiesOfObjectVersions", js.undefined)
    @scala.inline
    def setOnStarted(value: () => Unit): Self = this.set("OnStarted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStarted: Self = this.set("OnStarted", js.undefined)
    @scala.inline
    def setOnStop(value: () => Unit): Self = this.set("OnStop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStop: Self = this.set("OnStop", js.undefined)
    @scala.inline
    def setOnSwitchToOfflineMode(value: () => Null | Boolean | OnError): Self = this.set("OnSwitchToOfflineMode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwitchToOfflineMode: Self = this.set("OnSwitchToOfflineMode", js.undefined)
    @scala.inline
    def setOnSwitchToOnlineMode(value: () => Null | Boolean | OnError): Self = this.set("OnSwitchToOnlineMode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwitchToOnlineMode: Self = this.set("OnSwitchToOnlineMode", js.undefined)
    @scala.inline
    def setOnSwitchedToOfflineMode(value: () => Unit): Self = this.set("OnSwitchedToOfflineMode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwitchedToOfflineMode: Self = this.set("OnSwitchedToOfflineMode", js.undefined)
    @scala.inline
    def setOnSwitchedToOnlineMode(value: () => Unit): Self = this.set("OnSwitchedToOnlineMode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwitchedToOnlineMode: Self = this.set("OnSwitchedToOnlineMode", js.undefined)
    @scala.inline
    def setOnUndeleteObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = this.set("OnUndeleteObject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUndeleteObject: Self = this.set("OnUndeleteObject", js.undefined)
    @scala.inline
    def setOnUndeleteObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = this.set("OnUndeleteObjects", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUndeleteObjects: Self = this.set("OnUndeleteObjects", js.undefined)
    @scala.inline
    def setOnUndoObjectCheckout(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = this.set("OnUndoObjectCheckout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUndoObjectCheckout: Self = this.set("OnUndoObjectCheckout", js.undefined)
    @scala.inline
    def setOnUndoObjectCheckouts(value: /* objVers */ IObjVers => Null | Boolean | FinallyOnError): Self = this.set("OnUndoObjectCheckouts", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUndoObjectCheckouts: Self = this.set("OnUndoObjectCheckouts", js.undefined)
    @scala.inline
    def setOnVaultLanguageChanged(value: /* languageID */ Double => Unit): Self = this.set("OnVaultLanguageChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVaultLanguageChanged: Self = this.set("OnVaultLanguageChanged", js.undefined)
  }
  
}

