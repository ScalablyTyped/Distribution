package typings.mfiles

import typings.mfiles.MFiles.Event
import typings.mfiles.anon.Finally
import typings.mfiles.anon.FinallyOnError
import typings.mfiles.anon.OnError
import typings.mfiles.anon.OnSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IVaultEntryEventsMutableBuilder[Self <: IVaultEntryEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAddObjectFile(
      value: (/* objVer */ IObjVer, /* sourceObjectFile */ ISourceObjectFile) => Null | Boolean | Finally
    ): Self = StObject.set(x, "OnAddObjectFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAddObjectFileUndefined: Self = StObject.set(x, "OnAddObjectFile", js.undefined)
    
    @scala.inline
    def setOnAddObjectToFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnAddObjectToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAddObjectToFavoritesUndefined: Self = StObject.set(x, "OnAddObjectToFavorites", js.undefined)
    
    @scala.inline
    def setOnAddObjectsToFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = StObject.set(x, "OnAddObjectsToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAddObjectsToFavoritesUndefined: Self = StObject.set(x, "OnAddObjectsToFavorites", js.undefined)
    
    @scala.inline
    def setOnChangeVaultLanguage(value: /* languageID */ Double => Null | Boolean | OnError): Self = StObject.set(x, "OnChangeVaultLanguage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeVaultLanguageUndefined: Self = StObject.set(x, "OnChangeVaultLanguage", js.undefined)
    
    @scala.inline
    def setOnCheckInObject(value: (/* objVer */ IObjVer, /* propertyValues */ IPropertyValues) => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnCheckInObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCheckInObjectUndefined: Self = StObject.set(x, "OnCheckInObject", js.undefined)
    
    @scala.inline
    def setOnCheckInObjects(
      value: (/* objVers */ IObjVers, /* propertyValues */ IPropertyValues) => Null | Boolean | FinallyOnError
    ): Self = StObject.set(x, "OnCheckInObjects", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCheckInObjectsUndefined: Self = StObject.set(x, "OnCheckInObjects", js.undefined)
    
    @scala.inline
    def setOnCheckOutObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnCheckOutObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCheckOutObjectUndefined: Self = StObject.set(x, "OnCheckOutObject", js.undefined)
    
    @scala.inline
    def setOnCheckOutObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnCheckOutObjects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCheckOutObjectsUndefined: Self = StObject.set(x, "OnCheckOutObjects", js.undefined)
    
    @scala.inline
    def setOnCreateObject(
      value: (/* objectType */ Double, /* propertyValues */ IPropertyValues, /* sourceObjectFiles */ ISourceObjectFiles, /* accessControlList */ IAccessControlList, /* checkInRequested */ Boolean, /* singleFileRequested */ Boolean) => Null | Boolean | OnSuccess
    ): Self = StObject.set(x, "OnCreateObject", js.Any.fromFunction6(value))
    
    @scala.inline
    def setOnCreateObjectUndefined: Self = StObject.set(x, "OnCreateObject", js.undefined)
    
    @scala.inline
    def setOnDestroyObject(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDestroyObjectUndefined: Self = StObject.set(x, "OnDestroyObject", js.undefined)
    
    @scala.inline
    def setOnDestroyObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObjectVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDestroyObjectVersionUndefined: Self = StObject.set(x, "OnDestroyObjectVersion", js.undefined)
    
    @scala.inline
    def setOnDestroyObjectVersions(value: /* objVers */ IObjVers => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObjectVersions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDestroyObjectVersionsUndefined: Self = StObject.set(x, "OnDestroyObjectVersions", js.undefined)
    
    @scala.inline
    def setOnDestroyObjects(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObjects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDestroyObjectsUndefined: Self = StObject.set(x, "OnDestroyObjects", js.undefined)
    
    @scala.inline
    def setOnLogOut(value: () => Null | Boolean | OnError): Self = StObject.set(x, "OnLogOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLogOutUndefined: Self = StObject.set(x, "OnLogOut", js.undefined)
    
    @scala.inline
    def setOnLoggedIn(value: () => Unit): Self = StObject.set(x, "OnLoggedIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoggedInUndefined: Self = StObject.set(x, "OnLoggedIn", js.undefined)
    
    @scala.inline
    def setOnModifyObjectVersionLabels(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs, /* singleLabelRequired */ Boolean) => Null | Boolean | OnError
    ): Self = StObject.set(x, "OnModifyObjectVersionLabels", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnModifyObjectVersionLabelsUndefined: Self = StObject.set(x, "OnModifyObjectVersionLabels", js.undefined)
    
    @scala.inline
    def setOnNotification(value: (/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any) => _): Self = StObject.set(x, "OnNotification", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnNotificationUndefined: Self = StObject.set(x, "OnNotification", js.undefined)
    
    @scala.inline
    def setOnObjectAddedToFavorites(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectAddedToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectAddedToFavoritesUndefined: Self = StObject.set(x, "OnObjectAddedToFavorites", js.undefined)
    
    @scala.inline
    def setOnObjectCheckedIn(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCheckedIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectCheckedInUndefined: Self = StObject.set(x, "OnObjectCheckedIn", js.undefined)
    
    @scala.inline
    def setOnObjectCheckedOut(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCheckedOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectCheckedOutUndefined: Self = StObject.set(x, "OnObjectCheckedOut", js.undefined)
    
    @scala.inline
    def setOnObjectCheckoutUndone(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCheckoutUndone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectCheckoutUndoneUndefined: Self = StObject.set(x, "OnObjectCheckoutUndone", js.undefined)
    
    @scala.inline
    def setOnObjectCheckoutsUndone(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectCheckoutsUndone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectCheckoutsUndoneUndefined: Self = StObject.set(x, "OnObjectCheckoutsUndone", js.undefined)
    
    @scala.inline
    def setOnObjectCreated(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectCreatedUndefined: Self = StObject.set(x, "OnObjectCreated", js.undefined)
    
    @scala.inline
    def setOnObjectDestroyed(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectDestroyedUndefined: Self = StObject.set(x, "OnObjectDestroyed", js.undefined)
    
    @scala.inline
    def setOnObjectFileAdded(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = StObject.set(x, "OnObjectFileAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnObjectFileAddedUndefined: Self = StObject.set(x, "OnObjectFileAdded", js.undefined)
    
    @scala.inline
    def setOnObjectFileRemoved(value: (/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer) => Unit): Self = StObject.set(x, "OnObjectFileRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnObjectFileRemovedUndefined: Self = StObject.set(x, "OnObjectFileRemoved", js.undefined)
    
    @scala.inline
    def setOnObjectFileRenamed(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = StObject.set(x, "OnObjectFileRenamed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnObjectFileRenamedUndefined: Self = StObject.set(x, "OnObjectFileRenamed", js.undefined)
    
    @scala.inline
    def setOnObjectLevelPropertySet(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Unit): Self = StObject.set(x, "OnObjectLevelPropertySet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnObjectLevelPropertySetUndefined: Self = StObject.set(x, "OnObjectLevelPropertySet", js.undefined)
    
    @scala.inline
    def setOnObjectOfflineAvailabilityRemoved(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectOfflineAvailabilityRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectOfflineAvailabilityRemovedUndefined: Self = StObject.set(x, "OnObjectOfflineAvailabilityRemoved", js.undefined)
    
    @scala.inline
    def setOnObjectOfflineAvailabilitySet(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectOfflineAvailabilitySet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectOfflineAvailabilitySetUndefined: Self = StObject.set(x, "OnObjectOfflineAvailabilitySet", js.undefined)
    
    @scala.inline
    def setOnObjectRemoved(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectRemovedFromFavorites(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectRemovedFromFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectRemovedFromFavoritesUndefined: Self = StObject.set(x, "OnObjectRemovedFromFavorites", js.undefined)
    
    @scala.inline
    def setOnObjectRemovedUndefined: Self = StObject.set(x, "OnObjectRemoved", js.undefined)
    
    @scala.inline
    def setOnObjectUndeleted(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectUndeleted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectUndeletedUndefined: Self = StObject.set(x, "OnObjectUndeleted", js.undefined)
    
    @scala.inline
    def setOnObjectVersionDestroyed(value: /* objVer */ IObjVer => Unit): Self = StObject.set(x, "OnObjectVersionDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectVersionDestroyedUndefined: Self = StObject.set(x, "OnObjectVersionDestroyed", js.undefined)
    
    @scala.inline
    def setOnObjectVersionLabelsModified(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs) => Unit
    ): Self = StObject.set(x, "OnObjectVersionLabelsModified", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnObjectVersionLabelsModifiedUndefined: Self = StObject.set(x, "OnObjectVersionLabelsModified", js.undefined)
    
    @scala.inline
    def setOnObjectVersionPermissionsSet(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectVersionPermissionsSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectVersionPermissionsSetUndefined: Self = StObject.set(x, "OnObjectVersionPermissionsSet", js.undefined)
    
    @scala.inline
    def setOnObjectVersionRolledBack(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectVersionRolledBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectVersionRolledBackUndefined: Self = StObject.set(x, "OnObjectVersionRolledBack", js.undefined)
    
    @scala.inline
    def setOnObjectVersionsDestroyed(value: /* objVers */ IObjVers => Unit): Self = StObject.set(x, "OnObjectVersionsDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectVersionsDestroyedUndefined: Self = StObject.set(x, "OnObjectVersionsDestroyed", js.undefined)
    
    @scala.inline
    def setOnObjectsAddedToFavorites(value: /* objIDs */ IObjIDs => Unit): Self = StObject.set(x, "OnObjectsAddedToFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectsAddedToFavoritesUndefined: Self = StObject.set(x, "OnObjectsAddedToFavorites", js.undefined)
    
    @scala.inline
    def setOnObjectsCheckedIn(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectsCheckedIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectsCheckedInUndefined: Self = StObject.set(x, "OnObjectsCheckedIn", js.undefined)
    
    @scala.inline
    def setOnObjectsCheckedOut(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectsCheckedOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectsCheckedOutUndefined: Self = StObject.set(x, "OnObjectsCheckedOut", js.undefined)
    
    @scala.inline
    def setOnObjectsDestroyed(value: /* objIDs */ IObjIDs => Unit): Self = StObject.set(x, "OnObjectsDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectsDestroyedUndefined: Self = StObject.set(x, "OnObjectsDestroyed", js.undefined)
    
    @scala.inline
    def setOnObjectsRemoved(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectsRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectsRemovedFromFavorites(value: /* objIDs */ IObjIDs => Unit): Self = StObject.set(x, "OnObjectsRemovedFromFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnObjectsRemovedFromFavoritesUndefined: Self = StObject.set(x, "OnObjectsRemovedFromFavorites", js.undefined)
    
    @scala.inline
    def setOnObjectsRemovedUndefined: Self = StObject.set(x, "OnObjectsRemoved", js.undefined)
    
    @scala.inline
    def setOnPropertiesOfObjectVersionSet(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnPropertiesOfObjectVersionSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPropertiesOfObjectVersionSetUndefined: Self = StObject.set(x, "OnPropertiesOfObjectVersionSet", js.undefined)
    
    @scala.inline
    def setOnPropertiesOfObjectVersionsSet(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnPropertiesOfObjectVersionsSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPropertiesOfObjectVersionsSetUndefined: Self = StObject.set(x, "OnPropertiesOfObjectVersionsSet", js.undefined)
    
    @scala.inline
    def setOnRemoveObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnRemoveObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemoveObjectFile(value: (/* objVer */ IObjVer, /* fileVer */ IFileVer) => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnRemoveObjectFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRemoveObjectFileUndefined: Self = StObject.set(x, "OnRemoveObjectFile", js.undefined)
    
    @scala.inline
    def setOnRemoveObjectFromFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnRemoveObjectFromFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemoveObjectFromFavoritesUndefined: Self = StObject.set(x, "OnRemoveObjectFromFavorites", js.undefined)
    
    @scala.inline
    def setOnRemoveObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnRemoveObjectOfflineAvailability", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemoveObjectOfflineAvailabilityUndefined: Self = StObject.set(x, "OnRemoveObjectOfflineAvailability", js.undefined)
    
    @scala.inline
    def setOnRemoveObjectUndefined: Self = StObject.set(x, "OnRemoveObject", js.undefined)
    
    @scala.inline
    def setOnRemoveObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnRemoveObjects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemoveObjectsFromFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = StObject.set(x, "OnRemoveObjectsFromFavorites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemoveObjectsFromFavoritesUndefined: Self = StObject.set(x, "OnRemoveObjectsFromFavorites", js.undefined)
    
    @scala.inline
    def setOnRemoveObjectsUndefined: Self = StObject.set(x, "OnRemoveObjects", js.undefined)
    
    @scala.inline
    def setOnRenameObjectFile(
      value: (/* objVer */ IObjVer, /* fileVer */ IFileVer, /* newName */ Null | ITypedValue, /* newExtension */ Null | ITypedValue) => Null | Boolean | Finally
    ): Self = StObject.set(x, "OnRenameObjectFile", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnRenameObjectFileUndefined: Self = StObject.set(x, "OnRenameObjectFile", js.undefined)
    
    @scala.inline
    def setOnRollBackObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnRollBackObjectVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRollBackObjectVersionUndefined: Self = StObject.set(x, "OnRollBackObjectVersion", js.undefined)
    
    @scala.inline
    def setOnSetObjectLevelProperty(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Null | Boolean | OnError): Self = StObject.set(x, "OnSetObjectLevelProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSetObjectLevelPropertyUndefined: Self = StObject.set(x, "OnSetObjectLevelProperty", js.undefined)
    
    @scala.inline
    def setOnSetObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnSetObjectOfflineAvailability", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSetObjectOfflineAvailabilityUndefined: Self = StObject.set(x, "OnSetObjectOfflineAvailability", js.undefined)
    
    @scala.inline
    def setOnSetObjectVersionPermissions(
      value: (/* objVer */ IObjVer, /* changeAllVersions */ Boolean, /* accessControlList */ IAccessControlList) => Null | Boolean | OnSuccess
    ): Self = StObject.set(x, "OnSetObjectVersionPermissions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSetObjectVersionPermissionsUndefined: Self = StObject.set(x, "OnSetObjectVersionPermissions", js.undefined)
    
    @scala.inline
    def setOnSetPropertiesOfObjectVersion(
      value: (/* setPropertiesParams */ ISetPropertiesParams, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | OnSuccess
    ): Self = StObject.set(x, "OnSetPropertiesOfObjectVersion", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSetPropertiesOfObjectVersionUndefined: Self = StObject.set(x, "OnSetPropertiesOfObjectVersion", js.undefined)
    
    @scala.inline
    def setOnSetPropertiesOfObjectVersions(
      value: (/* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | FinallyOnError
    ): Self = StObject.set(x, "OnSetPropertiesOfObjectVersions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSetPropertiesOfObjectVersionsUndefined: Self = StObject.set(x, "OnSetPropertiesOfObjectVersions", js.undefined)
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
    
    @scala.inline
    def setOnSwitchToOfflineMode(value: () => Null | Boolean | OnError): Self = StObject.set(x, "OnSwitchToOfflineMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwitchToOfflineModeUndefined: Self = StObject.set(x, "OnSwitchToOfflineMode", js.undefined)
    
    @scala.inline
    def setOnSwitchToOnlineMode(value: () => Null | Boolean | OnError): Self = StObject.set(x, "OnSwitchToOnlineMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwitchToOnlineModeUndefined: Self = StObject.set(x, "OnSwitchToOnlineMode", js.undefined)
    
    @scala.inline
    def setOnSwitchedToOfflineMode(value: () => Unit): Self = StObject.set(x, "OnSwitchedToOfflineMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwitchedToOfflineModeUndefined: Self = StObject.set(x, "OnSwitchedToOfflineMode", js.undefined)
    
    @scala.inline
    def setOnSwitchedToOnlineMode(value: () => Unit): Self = StObject.set(x, "OnSwitchedToOnlineMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwitchedToOnlineModeUndefined: Self = StObject.set(x, "OnSwitchedToOnlineMode", js.undefined)
    
    @scala.inline
    def setOnUndeleteObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnUndeleteObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUndeleteObjectUndefined: Self = StObject.set(x, "OnUndeleteObject", js.undefined)
    
    @scala.inline
    def setOnUndeleteObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnUndeleteObjects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUndeleteObjectsUndefined: Self = StObject.set(x, "OnUndeleteObjects", js.undefined)
    
    @scala.inline
    def setOnUndoObjectCheckout(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnUndoObjectCheckout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUndoObjectCheckoutUndefined: Self = StObject.set(x, "OnUndoObjectCheckout", js.undefined)
    
    @scala.inline
    def setOnUndoObjectCheckouts(value: /* objVers */ IObjVers => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnUndoObjectCheckouts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUndoObjectCheckoutsUndefined: Self = StObject.set(x, "OnUndoObjectCheckouts", js.undefined)
    
    @scala.inline
    def setOnVaultLanguageChanged(value: /* languageID */ Double => Unit): Self = StObject.set(x, "OnVaultLanguageChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVaultLanguageChangedUndefined: Self = StObject.set(x, "OnVaultLanguageChanged", js.undefined)
  }
}
