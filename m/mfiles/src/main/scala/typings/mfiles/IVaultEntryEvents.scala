package typings.mfiles

import typings.mfiles.MFiles.Event
import typings.mfiles.anon.Finally
import typings.mfiles.anon.FinallyOnError
import typings.mfiles.anon.OnError
import typings.mfiles.anon.OnSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultEntryEvents
  extends StObject
     with IEvents {
  
  var OnAddObjectFile: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* sourceObjectFile */ ISourceObjectFile, 
      Null | Boolean | Finally
    ]
  ] = js.undefined
  
  var OnAddObjectToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.undefined
  
  var OnAddObjectsToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.undefined
  
  var OnChangeVaultLanguage: js.UndefOr[js.Function1[/* languageID */ Double, Null | Boolean | OnError]] = js.undefined
  
  var OnCheckInObject: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | OnSuccess
    ]
  ] = js.undefined
  
  var OnCheckInObjects: js.UndefOr[
    js.Function2[
      /* objVers */ IObjVers, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | FinallyOnError
    ]
  ] = js.undefined
  
  var OnCheckOutObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.undefined
  
  var OnCheckOutObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.undefined
  
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
  ] = js.undefined
  
  var OnDestroyObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.undefined
  
  var OnDestroyObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnError]] = js.undefined
  
  var OnDestroyObjectVersions: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | OnError]] = js.undefined
  
  var OnDestroyObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.undefined
  
  var OnLogOut: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.undefined
  
  var OnLoggedIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnModifyObjectVersionLabels: js.UndefOr[
    js.Function5[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      /* singleLabelRequired */ Boolean, 
      Null | Boolean | OnError
    ]
  ] = js.undefined
  
  var OnNotification: js.UndefOr[js.Function3[/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any, js.Any]] = js.undefined
  
  var OnObjectAddedToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  
  var OnObjectCheckedIn: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectCheckedOut: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectCheckoutUndone: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectCheckoutsUndone: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  
  var OnObjectCreated: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectDestroyed: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  
  var OnObjectFileAdded: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.undefined
  
  var OnObjectFileRemoved: js.UndefOr[js.Function2[/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer, Unit]] = js.undefined
  
  var OnObjectFileRenamed: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.undefined
  
  var OnObjectLevelPropertySet: js.UndefOr[js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Unit]] = js.undefined
  
  var OnObjectOfflineAvailabilityRemoved: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  
  var OnObjectOfflineAvailabilitySet: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  
  var OnObjectRemoved: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectRemovedFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  
  var OnObjectUndeleted: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectVersionDestroyed: js.UndefOr[js.Function1[/* objVer */ IObjVer, Unit]] = js.undefined
  
  var OnObjectVersionLabelsModified: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      Unit
    ]
  ] = js.undefined
  
  var OnObjectVersionPermissionsSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectVersionRolledBack: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnObjectVersionsDestroyed: js.UndefOr[js.Function1[/* objVers */ IObjVers, Unit]] = js.undefined
  
  var OnObjectsAddedToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.undefined
  
  var OnObjectsCheckedIn: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  
  var OnObjectsCheckedOut: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  
  var OnObjectsDestroyed: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.undefined
  
  var OnObjectsRemoved: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  
  var OnObjectsRemovedFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.undefined
  
  var OnPropertiesOfObjectVersionSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  
  var OnPropertiesOfObjectVersionsSet: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  
  var OnRemoveObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.undefined
  
  var OnRemoveObjectFile: js.UndefOr[
    js.Function2[/* objVer */ IObjVer, /* fileVer */ IFileVer, Null | Boolean | OnSuccess]
  ] = js.undefined
  
  var OnRemoveObjectFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.undefined
  
  var OnRemoveObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.undefined
  
  var OnRemoveObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.undefined
  
  var OnRemoveObjectsFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.undefined
  
  var OnRenameObjectFile: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      /* newName */ Null | ITypedValue, 
      /* newExtension */ Null | ITypedValue, 
      Null | Boolean | Finally
    ]
  ] = js.undefined
  
  var OnRollBackObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnSuccess]] = js.undefined
  
  var OnSetObjectLevelProperty: js.UndefOr[
    js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Null | Boolean | OnError]
  ] = js.undefined
  
  var OnSetObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.undefined
  
  var OnSetObjectVersionPermissions: js.UndefOr[
    js.Function3[
      /* objVer */ IObjVer, 
      /* changeAllVersions */ Boolean, 
      /* accessControlList */ IAccessControlList, 
      Null | Boolean | OnSuccess
    ]
  ] = js.undefined
  
  var OnSetPropertiesOfObjectVersion: js.UndefOr[
    js.Function3[
      /* setPropertiesParams */ ISetPropertiesParams, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | OnSuccess
    ]
  ] = js.undefined
  
  var OnSetPropertiesOfObjectVersions: js.UndefOr[
    js.Function3[
      /* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | FinallyOnError
    ]
  ] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnSwitchToOfflineMode: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.undefined
  
  var OnSwitchToOnlineMode: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.undefined
  
  var OnSwitchedToOfflineMode: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnSwitchedToOnlineMode: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnUndeleteObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.undefined
  
  var OnUndeleteObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.undefined
  
  var OnUndoObjectCheckout: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnSuccess]] = js.undefined
  
  var OnUndoObjectCheckouts: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | FinallyOnError]] = js.undefined
  
  var OnVaultLanguageChanged: js.UndefOr[js.Function1[/* languageID */ Double, Unit]] = js.undefined
}
object IVaultEntryEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IVaultEntryEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IVaultEntryEvents]
  }
  
  extension [Self <: IVaultEntryEvents](x: Self) {
    
    inline def setOnAddObjectFile(
      value: (/* objVer */ IObjVer, /* sourceObjectFile */ ISourceObjectFile) => Null | Boolean | Finally
    ): Self = StObject.set(x, "OnAddObjectFile", js.Any.fromFunction2(value))
    
    inline def setOnAddObjectFileUndefined: Self = StObject.set(x, "OnAddObjectFile", js.undefined)
    
    inline def setOnAddObjectToFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnAddObjectToFavorites", js.Any.fromFunction1(value))
    
    inline def setOnAddObjectToFavoritesUndefined: Self = StObject.set(x, "OnAddObjectToFavorites", js.undefined)
    
    inline def setOnAddObjectsToFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = StObject.set(x, "OnAddObjectsToFavorites", js.Any.fromFunction1(value))
    
    inline def setOnAddObjectsToFavoritesUndefined: Self = StObject.set(x, "OnAddObjectsToFavorites", js.undefined)
    
    inline def setOnChangeVaultLanguage(value: /* languageID */ Double => Null | Boolean | OnError): Self = StObject.set(x, "OnChangeVaultLanguage", js.Any.fromFunction1(value))
    
    inline def setOnChangeVaultLanguageUndefined: Self = StObject.set(x, "OnChangeVaultLanguage", js.undefined)
    
    inline def setOnCheckInObject(value: (/* objVer */ IObjVer, /* propertyValues */ IPropertyValues) => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnCheckInObject", js.Any.fromFunction2(value))
    
    inline def setOnCheckInObjectUndefined: Self = StObject.set(x, "OnCheckInObject", js.undefined)
    
    inline def setOnCheckInObjects(
      value: (/* objVers */ IObjVers, /* propertyValues */ IPropertyValues) => Null | Boolean | FinallyOnError
    ): Self = StObject.set(x, "OnCheckInObjects", js.Any.fromFunction2(value))
    
    inline def setOnCheckInObjectsUndefined: Self = StObject.set(x, "OnCheckInObjects", js.undefined)
    
    inline def setOnCheckOutObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnCheckOutObject", js.Any.fromFunction1(value))
    
    inline def setOnCheckOutObjectUndefined: Self = StObject.set(x, "OnCheckOutObject", js.undefined)
    
    inline def setOnCheckOutObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnCheckOutObjects", js.Any.fromFunction1(value))
    
    inline def setOnCheckOutObjectsUndefined: Self = StObject.set(x, "OnCheckOutObjects", js.undefined)
    
    inline def setOnCreateObject(
      value: (/* objectType */ Double, /* propertyValues */ IPropertyValues, /* sourceObjectFiles */ ISourceObjectFiles, /* accessControlList */ IAccessControlList, /* checkInRequested */ Boolean, /* singleFileRequested */ Boolean) => Null | Boolean | OnSuccess
    ): Self = StObject.set(x, "OnCreateObject", js.Any.fromFunction6(value))
    
    inline def setOnCreateObjectUndefined: Self = StObject.set(x, "OnCreateObject", js.undefined)
    
    inline def setOnDestroyObject(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObject", js.Any.fromFunction1(value))
    
    inline def setOnDestroyObjectUndefined: Self = StObject.set(x, "OnDestroyObject", js.undefined)
    
    inline def setOnDestroyObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObjectVersion", js.Any.fromFunction1(value))
    
    inline def setOnDestroyObjectVersionUndefined: Self = StObject.set(x, "OnDestroyObjectVersion", js.undefined)
    
    inline def setOnDestroyObjectVersions(value: /* objVers */ IObjVers => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObjectVersions", js.Any.fromFunction1(value))
    
    inline def setOnDestroyObjectVersionsUndefined: Self = StObject.set(x, "OnDestroyObjectVersions", js.undefined)
    
    inline def setOnDestroyObjects(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = StObject.set(x, "OnDestroyObjects", js.Any.fromFunction1(value))
    
    inline def setOnDestroyObjectsUndefined: Self = StObject.set(x, "OnDestroyObjects", js.undefined)
    
    inline def setOnLogOut(value: () => Null | Boolean | OnError): Self = StObject.set(x, "OnLogOut", js.Any.fromFunction0(value))
    
    inline def setOnLogOutUndefined: Self = StObject.set(x, "OnLogOut", js.undefined)
    
    inline def setOnLoggedIn(value: () => Unit): Self = StObject.set(x, "OnLoggedIn", js.Any.fromFunction0(value))
    
    inline def setOnLoggedInUndefined: Self = StObject.set(x, "OnLoggedIn", js.undefined)
    
    inline def setOnModifyObjectVersionLabels(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs, /* singleLabelRequired */ Boolean) => Null | Boolean | OnError
    ): Self = StObject.set(x, "OnModifyObjectVersionLabels", js.Any.fromFunction5(value))
    
    inline def setOnModifyObjectVersionLabelsUndefined: Self = StObject.set(x, "OnModifyObjectVersionLabels", js.undefined)
    
    inline def setOnNotification(value: (/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any) => js.Any): Self = StObject.set(x, "OnNotification", js.Any.fromFunction3(value))
    
    inline def setOnNotificationUndefined: Self = StObject.set(x, "OnNotification", js.undefined)
    
    inline def setOnObjectAddedToFavorites(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectAddedToFavorites", js.Any.fromFunction1(value))
    
    inline def setOnObjectAddedToFavoritesUndefined: Self = StObject.set(x, "OnObjectAddedToFavorites", js.undefined)
    
    inline def setOnObjectCheckedIn(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCheckedIn", js.Any.fromFunction1(value))
    
    inline def setOnObjectCheckedInUndefined: Self = StObject.set(x, "OnObjectCheckedIn", js.undefined)
    
    inline def setOnObjectCheckedOut(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCheckedOut", js.Any.fromFunction1(value))
    
    inline def setOnObjectCheckedOutUndefined: Self = StObject.set(x, "OnObjectCheckedOut", js.undefined)
    
    inline def setOnObjectCheckoutUndone(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCheckoutUndone", js.Any.fromFunction1(value))
    
    inline def setOnObjectCheckoutUndoneUndefined: Self = StObject.set(x, "OnObjectCheckoutUndone", js.undefined)
    
    inline def setOnObjectCheckoutsUndone(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectCheckoutsUndone", js.Any.fromFunction1(value))
    
    inline def setOnObjectCheckoutsUndoneUndefined: Self = StObject.set(x, "OnObjectCheckoutsUndone", js.undefined)
    
    inline def setOnObjectCreated(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectCreated", js.Any.fromFunction1(value))
    
    inline def setOnObjectCreatedUndefined: Self = StObject.set(x, "OnObjectCreated", js.undefined)
    
    inline def setOnObjectDestroyed(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectDestroyed", js.Any.fromFunction1(value))
    
    inline def setOnObjectDestroyedUndefined: Self = StObject.set(x, "OnObjectDestroyed", js.undefined)
    
    inline def setOnObjectFileAdded(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = StObject.set(x, "OnObjectFileAdded", js.Any.fromFunction2(value))
    
    inline def setOnObjectFileAddedUndefined: Self = StObject.set(x, "OnObjectFileAdded", js.undefined)
    
    inline def setOnObjectFileRemoved(value: (/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer) => Unit): Self = StObject.set(x, "OnObjectFileRemoved", js.Any.fromFunction2(value))
    
    inline def setOnObjectFileRemovedUndefined: Self = StObject.set(x, "OnObjectFileRemoved", js.undefined)
    
    inline def setOnObjectFileRenamed(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = StObject.set(x, "OnObjectFileRenamed", js.Any.fromFunction2(value))
    
    inline def setOnObjectFileRenamedUndefined: Self = StObject.set(x, "OnObjectFileRenamed", js.undefined)
    
    inline def setOnObjectLevelPropertySet(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Unit): Self = StObject.set(x, "OnObjectLevelPropertySet", js.Any.fromFunction2(value))
    
    inline def setOnObjectLevelPropertySetUndefined: Self = StObject.set(x, "OnObjectLevelPropertySet", js.undefined)
    
    inline def setOnObjectOfflineAvailabilityRemoved(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectOfflineAvailabilityRemoved", js.Any.fromFunction1(value))
    
    inline def setOnObjectOfflineAvailabilityRemovedUndefined: Self = StObject.set(x, "OnObjectOfflineAvailabilityRemoved", js.undefined)
    
    inline def setOnObjectOfflineAvailabilitySet(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectOfflineAvailabilitySet", js.Any.fromFunction1(value))
    
    inline def setOnObjectOfflineAvailabilitySetUndefined: Self = StObject.set(x, "OnObjectOfflineAvailabilitySet", js.undefined)
    
    inline def setOnObjectRemoved(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectRemoved", js.Any.fromFunction1(value))
    
    inline def setOnObjectRemovedFromFavorites(value: /* objID */ IObjID => Unit): Self = StObject.set(x, "OnObjectRemovedFromFavorites", js.Any.fromFunction1(value))
    
    inline def setOnObjectRemovedFromFavoritesUndefined: Self = StObject.set(x, "OnObjectRemovedFromFavorites", js.undefined)
    
    inline def setOnObjectRemovedUndefined: Self = StObject.set(x, "OnObjectRemoved", js.undefined)
    
    inline def setOnObjectUndeleted(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectUndeleted", js.Any.fromFunction1(value))
    
    inline def setOnObjectUndeletedUndefined: Self = StObject.set(x, "OnObjectUndeleted", js.undefined)
    
    inline def setOnObjectVersionDestroyed(value: /* objVer */ IObjVer => Unit): Self = StObject.set(x, "OnObjectVersionDestroyed", js.Any.fromFunction1(value))
    
    inline def setOnObjectVersionDestroyedUndefined: Self = StObject.set(x, "OnObjectVersionDestroyed", js.undefined)
    
    inline def setOnObjectVersionLabelsModified(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs) => Unit
    ): Self = StObject.set(x, "OnObjectVersionLabelsModified", js.Any.fromFunction4(value))
    
    inline def setOnObjectVersionLabelsModifiedUndefined: Self = StObject.set(x, "OnObjectVersionLabelsModified", js.undefined)
    
    inline def setOnObjectVersionPermissionsSet(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectVersionPermissionsSet", js.Any.fromFunction1(value))
    
    inline def setOnObjectVersionPermissionsSetUndefined: Self = StObject.set(x, "OnObjectVersionPermissionsSet", js.undefined)
    
    inline def setOnObjectVersionRolledBack(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnObjectVersionRolledBack", js.Any.fromFunction1(value))
    
    inline def setOnObjectVersionRolledBackUndefined: Self = StObject.set(x, "OnObjectVersionRolledBack", js.undefined)
    
    inline def setOnObjectVersionsDestroyed(value: /* objVers */ IObjVers => Unit): Self = StObject.set(x, "OnObjectVersionsDestroyed", js.Any.fromFunction1(value))
    
    inline def setOnObjectVersionsDestroyedUndefined: Self = StObject.set(x, "OnObjectVersionsDestroyed", js.undefined)
    
    inline def setOnObjectsAddedToFavorites(value: /* objIDs */ IObjIDs => Unit): Self = StObject.set(x, "OnObjectsAddedToFavorites", js.Any.fromFunction1(value))
    
    inline def setOnObjectsAddedToFavoritesUndefined: Self = StObject.set(x, "OnObjectsAddedToFavorites", js.undefined)
    
    inline def setOnObjectsCheckedIn(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectsCheckedIn", js.Any.fromFunction1(value))
    
    inline def setOnObjectsCheckedInUndefined: Self = StObject.set(x, "OnObjectsCheckedIn", js.undefined)
    
    inline def setOnObjectsCheckedOut(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectsCheckedOut", js.Any.fromFunction1(value))
    
    inline def setOnObjectsCheckedOutUndefined: Self = StObject.set(x, "OnObjectsCheckedOut", js.undefined)
    
    inline def setOnObjectsDestroyed(value: /* objIDs */ IObjIDs => Unit): Self = StObject.set(x, "OnObjectsDestroyed", js.Any.fromFunction1(value))
    
    inline def setOnObjectsDestroyedUndefined: Self = StObject.set(x, "OnObjectsDestroyed", js.undefined)
    
    inline def setOnObjectsRemoved(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnObjectsRemoved", js.Any.fromFunction1(value))
    
    inline def setOnObjectsRemovedFromFavorites(value: /* objIDs */ IObjIDs => Unit): Self = StObject.set(x, "OnObjectsRemovedFromFavorites", js.Any.fromFunction1(value))
    
    inline def setOnObjectsRemovedFromFavoritesUndefined: Self = StObject.set(x, "OnObjectsRemovedFromFavorites", js.undefined)
    
    inline def setOnObjectsRemovedUndefined: Self = StObject.set(x, "OnObjectsRemoved", js.undefined)
    
    inline def setOnPropertiesOfObjectVersionSet(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnPropertiesOfObjectVersionSet", js.Any.fromFunction1(value))
    
    inline def setOnPropertiesOfObjectVersionSetUndefined: Self = StObject.set(x, "OnPropertiesOfObjectVersionSet", js.undefined)
    
    inline def setOnPropertiesOfObjectVersionsSet(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnPropertiesOfObjectVersionsSet", js.Any.fromFunction1(value))
    
    inline def setOnPropertiesOfObjectVersionsSetUndefined: Self = StObject.set(x, "OnPropertiesOfObjectVersionsSet", js.undefined)
    
    inline def setOnRemoveObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnRemoveObject", js.Any.fromFunction1(value))
    
    inline def setOnRemoveObjectFile(value: (/* objVer */ IObjVer, /* fileVer */ IFileVer) => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnRemoveObjectFile", js.Any.fromFunction2(value))
    
    inline def setOnRemoveObjectFileUndefined: Self = StObject.set(x, "OnRemoveObjectFile", js.undefined)
    
    inline def setOnRemoveObjectFromFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnRemoveObjectFromFavorites", js.Any.fromFunction1(value))
    
    inline def setOnRemoveObjectFromFavoritesUndefined: Self = StObject.set(x, "OnRemoveObjectFromFavorites", js.undefined)
    
    inline def setOnRemoveObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnRemoveObjectOfflineAvailability", js.Any.fromFunction1(value))
    
    inline def setOnRemoveObjectOfflineAvailabilityUndefined: Self = StObject.set(x, "OnRemoveObjectOfflineAvailability", js.undefined)
    
    inline def setOnRemoveObjectUndefined: Self = StObject.set(x, "OnRemoveObject", js.undefined)
    
    inline def setOnRemoveObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnRemoveObjects", js.Any.fromFunction1(value))
    
    inline def setOnRemoveObjectsFromFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = StObject.set(x, "OnRemoveObjectsFromFavorites", js.Any.fromFunction1(value))
    
    inline def setOnRemoveObjectsFromFavoritesUndefined: Self = StObject.set(x, "OnRemoveObjectsFromFavorites", js.undefined)
    
    inline def setOnRemoveObjectsUndefined: Self = StObject.set(x, "OnRemoveObjects", js.undefined)
    
    inline def setOnRenameObjectFile(
      value: (/* objVer */ IObjVer, /* fileVer */ IFileVer, /* newName */ Null | ITypedValue, /* newExtension */ Null | ITypedValue) => Null | Boolean | Finally
    ): Self = StObject.set(x, "OnRenameObjectFile", js.Any.fromFunction4(value))
    
    inline def setOnRenameObjectFileUndefined: Self = StObject.set(x, "OnRenameObjectFile", js.undefined)
    
    inline def setOnRollBackObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnRollBackObjectVersion", js.Any.fromFunction1(value))
    
    inline def setOnRollBackObjectVersionUndefined: Self = StObject.set(x, "OnRollBackObjectVersion", js.undefined)
    
    inline def setOnSetObjectLevelProperty(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Null | Boolean | OnError): Self = StObject.set(x, "OnSetObjectLevelProperty", js.Any.fromFunction2(value))
    
    inline def setOnSetObjectLevelPropertyUndefined: Self = StObject.set(x, "OnSetObjectLevelProperty", js.undefined)
    
    inline def setOnSetObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = StObject.set(x, "OnSetObjectOfflineAvailability", js.Any.fromFunction1(value))
    
    inline def setOnSetObjectOfflineAvailabilityUndefined: Self = StObject.set(x, "OnSetObjectOfflineAvailability", js.undefined)
    
    inline def setOnSetObjectVersionPermissions(
      value: (/* objVer */ IObjVer, /* changeAllVersions */ Boolean, /* accessControlList */ IAccessControlList) => Null | Boolean | OnSuccess
    ): Self = StObject.set(x, "OnSetObjectVersionPermissions", js.Any.fromFunction3(value))
    
    inline def setOnSetObjectVersionPermissionsUndefined: Self = StObject.set(x, "OnSetObjectVersionPermissions", js.undefined)
    
    inline def setOnSetPropertiesOfObjectVersion(
      value: (/* setPropertiesParams */ ISetPropertiesParams, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | OnSuccess
    ): Self = StObject.set(x, "OnSetPropertiesOfObjectVersion", js.Any.fromFunction3(value))
    
    inline def setOnSetPropertiesOfObjectVersionUndefined: Self = StObject.set(x, "OnSetPropertiesOfObjectVersion", js.undefined)
    
    inline def setOnSetPropertiesOfObjectVersions(
      value: (/* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | FinallyOnError
    ): Self = StObject.set(x, "OnSetPropertiesOfObjectVersions", js.Any.fromFunction3(value))
    
    inline def setOnSetPropertiesOfObjectVersionsUndefined: Self = StObject.set(x, "OnSetPropertiesOfObjectVersions", js.undefined)
    
    inline def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
    
    inline def setOnSwitchToOfflineMode(value: () => Null | Boolean | OnError): Self = StObject.set(x, "OnSwitchToOfflineMode", js.Any.fromFunction0(value))
    
    inline def setOnSwitchToOfflineModeUndefined: Self = StObject.set(x, "OnSwitchToOfflineMode", js.undefined)
    
    inline def setOnSwitchToOnlineMode(value: () => Null | Boolean | OnError): Self = StObject.set(x, "OnSwitchToOnlineMode", js.Any.fromFunction0(value))
    
    inline def setOnSwitchToOnlineModeUndefined: Self = StObject.set(x, "OnSwitchToOnlineMode", js.undefined)
    
    inline def setOnSwitchedToOfflineMode(value: () => Unit): Self = StObject.set(x, "OnSwitchedToOfflineMode", js.Any.fromFunction0(value))
    
    inline def setOnSwitchedToOfflineModeUndefined: Self = StObject.set(x, "OnSwitchedToOfflineMode", js.undefined)
    
    inline def setOnSwitchedToOnlineMode(value: () => Unit): Self = StObject.set(x, "OnSwitchedToOnlineMode", js.Any.fromFunction0(value))
    
    inline def setOnSwitchedToOnlineModeUndefined: Self = StObject.set(x, "OnSwitchedToOnlineMode", js.undefined)
    
    inline def setOnUndeleteObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnUndeleteObject", js.Any.fromFunction1(value))
    
    inline def setOnUndeleteObjectUndefined: Self = StObject.set(x, "OnUndeleteObject", js.undefined)
    
    inline def setOnUndeleteObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnUndeleteObjects", js.Any.fromFunction1(value))
    
    inline def setOnUndeleteObjectsUndefined: Self = StObject.set(x, "OnUndeleteObjects", js.undefined)
    
    inline def setOnUndoObjectCheckout(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = StObject.set(x, "OnUndoObjectCheckout", js.Any.fromFunction1(value))
    
    inline def setOnUndoObjectCheckoutUndefined: Self = StObject.set(x, "OnUndoObjectCheckout", js.undefined)
    
    inline def setOnUndoObjectCheckouts(value: /* objVers */ IObjVers => Null | Boolean | FinallyOnError): Self = StObject.set(x, "OnUndoObjectCheckouts", js.Any.fromFunction1(value))
    
    inline def setOnUndoObjectCheckoutsUndefined: Self = StObject.set(x, "OnUndoObjectCheckouts", js.undefined)
    
    inline def setOnVaultLanguageChanged(value: /* languageID */ Double => Unit): Self = StObject.set(x, "OnVaultLanguageChanged", js.Any.fromFunction1(value))
    
    inline def setOnVaultLanguageChangedUndefined: Self = StObject.set(x, "OnVaultLanguageChanged", js.undefined)
  }
}
