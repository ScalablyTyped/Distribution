package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Event extends js.Object

@JSGlobal("MFiles.Event")
@js.native
object Event extends js.Object {
  @js.native
  sealed trait ActiveListingChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait AddObjectFile
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait AddObjectToFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait AddObjectsToFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait AllItemsCleared
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait AutomaticValueStatusChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait BuiltinCommand
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ChangeLabel
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ChangeMustExistStatus
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ChangeReadOnlyStatus
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ChangeValue
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ChangeValueRequiredStatus
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ChangeVaultLanguage
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ChangeVisibility
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CheckInObject
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CheckInObjects
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CheckOutObject
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CheckOutObjects
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CloseWindow
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CommitUIModifiedState
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ContentChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ContentInitialized
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ContentUpdated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CreateObject
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait CustomCommand
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait DataError
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait DestroyObject
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait DestroyObjectVersion
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait DestroyObjectVersions
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait DestroyObjects
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait EnabledStateChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ExplanationChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait FilePreviewInfoUpdated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait FocusLost
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait FocusReceived
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait HidePane
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait HideTab
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait HitHighlightingUpdated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait IconChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait InitializingContent
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ItemAdded
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ItemMoved
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ItemRemoved
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ItemReplaced
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ItemsChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait LabelChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ListingActivated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ListingDeactivated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait LogOut
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait LoggedIn
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait MetadataCardLocationChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait MetadataCardLocationChanging
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait MetadataCardPoppedOut
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait MinimizedStateChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ModifyFlagChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ModifyObjectVersionLabels
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait MustExistStatusChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NameChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewBottomPane
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewCommands
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewCommonDialogShellFrame
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewEmbeddedShellFrame
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewNormalShellFrame
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewRightPane
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewSearchPane
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewShellFrame
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewShellListing
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewTab
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewTaskPane
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait NewVaultEntry
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait Notification
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectAddedToFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectCheckedIn
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectCheckedOut
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectCheckoutUndone
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectCheckoutsUndone
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectCreated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectDestroyed
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectFileAdded
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectFileRemoved
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectFileRenamed
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectLevelPropertySet
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectOfflineAvailabilityRemoved
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectOfflineAvailabilitySet
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectRemoved
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectRemovedFromFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectUndeleted
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectVersionDestroyed
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectVersionLabelsModified
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectVersionPermissionsSet
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectVersionRolledBack
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectVersionsDestroyed
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectsAddedToFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectsCheckedIn
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectsCheckedOut
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectsDestroyed
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectsRemoved
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectsRemovedFromFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ObjectsUndeleted
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait OptionValueChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait PaneResized
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait PermissionsChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait PopOutMetadataCard
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait PropertiesOfObjectVersionSet
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait PropertiesOfObjectVersionsSet
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait QueryCanHandleFocusChangeKey
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait QueryUIModifiedState
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ReadOnlyStatusChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RemoveObject
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RemoveObjectFile
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RemoveObjectFromFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RemoveObjectOfflineAvailability
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RemoveObjects
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RemoveObjectsFromFavorites
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RenameObjectFile
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RequestActivateView
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait RollBackObjectVersion
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SearchInitiated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SearchReady
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SelectedItemsChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SelectionChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SelectionListItemsUpdated
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SetModifyFlag
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SetObjectLevelProperty
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SetObjectOfflineAvailability
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SetObjectVersionPermissions
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SetPropertiesOfObjectVersion
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SetPropertiesOfObjectVersions
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ShowContextMenu
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ShowMainMenu
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ShowPane
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ShowTab
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait Started
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait Stop
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SwitchToOfflineMode
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SwitchToOnlineMode
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SwitchedToOfflineMode
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait SwitchedToOnlineMode
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait TabSelected
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait TabUnselected
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait Undefined
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait UndeleteObject
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait UndeleteObjects
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait UndoObjectCheckout
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait UndoObjectCheckouts
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait UpdatingContent
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ValueChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ValueRequiredStatusChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ValueSuggestionsChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait ValueValidationError
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait VaultLanguageChanged
    extends mfilesLib.MFilesNs.Event
  
  @js.native
  sealed trait VisibilityChanged
    extends mfilesLib.MFilesNs.Event
  
  /* 17 */ val ActiveListingChanged: ActiveListingChanged with scala.Double = js.native
  /* 53 */ val AddObjectFile: AddObjectFile with scala.Double = js.native
  /* 79 */ val AddObjectToFavorites: AddObjectToFavorites with scala.Double = js.native
  /* 81 */ val AddObjectsToFavorites: AddObjectsToFavorites with scala.Double = js.native
  /* 108 */ val AllItemsCleared: AllItemsCleared with scala.Double = js.native
  /* 118 */ val AutomaticValueStatusChanged: AutomaticValueStatusChanged with scala.Double = js.native
  /* 22 */ val BuiltinCommand: BuiltinCommand with scala.Double = js.native
  /* 121 */ val ChangeLabel: ChangeLabel with scala.Double = js.native
  /* 114 */ val ChangeMustExistStatus: ChangeMustExistStatus with scala.Double = js.native
  /* 116 */ val ChangeReadOnlyStatus: ChangeReadOnlyStatus with scala.Double = js.native
  /* 110 */ val ChangeValue: ChangeValue with scala.Double = js.native
  /* 112 */ val ChangeValueRequiredStatus: ChangeValueRequiredStatus with scala.Double = js.native
  /* 100 */ val ChangeVaultLanguage: ChangeVaultLanguage with scala.Double = js.native
  /* 119 */ val ChangeVisibility: ChangeVisibility with scala.Double = js.native
  /* 59 */ val CheckInObject: CheckInObject with scala.Double = js.native
  /* 61 */ val CheckInObjects: CheckInObjects with scala.Double = js.native
  /* 63 */ val CheckOutObject: CheckOutObject with scala.Double = js.native
  /* 65 */ val CheckOutObjects: CheckOutObjects with scala.Double = js.native
  /* 33 */ val CloseWindow: CloseWindow with scala.Double = js.native
  /* 141 */ val CommitUIModifiedState: CommitUIModifiedState with scala.Double = js.native
  /* 26 */ val ContentChanged: ContentChanged with scala.Double = js.native
  /* 131 */ val ContentInitialized: ContentInitialized with scala.Double = js.native
  /* 129 */ val ContentUpdated: ContentUpdated with scala.Double = js.native
  /* 35 */ val CreateObject: CreateObject with scala.Double = js.native
  /* 23 */ val CustomCommand: CustomCommand with scala.Double = js.native
  /* 125 */ val DataError: DataError with scala.Double = js.native
  /* 37 */ val DestroyObject: DestroyObject with scala.Double = js.native
  /* 41 */ val DestroyObjectVersion: DestroyObjectVersion with scala.Double = js.native
  /* 43 */ val DestroyObjectVersions: DestroyObjectVersions with scala.Double = js.native
  /* 39 */ val DestroyObjects: DestroyObjects with scala.Double = js.native
  /* 137 */ val EnabledStateChanged: EnabledStateChanged with scala.Double = js.native
  /* 144 */ val ExplanationChanged: ExplanationChanged with scala.Double = js.native
  /* 134 */ val FilePreviewInfoUpdated: FilePreviewInfoUpdated with scala.Double = js.native
  /* 148 */ val FocusLost: FocusLost with scala.Double = js.native
  /* 147 */ val FocusReceived: FocusReceived with scala.Double = js.native
  /* 5 */ val HidePane: HidePane with scala.Double = js.native
  /* 146 */ val HideTab: HideTab with scala.Double = js.native
  /* 138 */ val HitHighlightingUpdated: HitHighlightingUpdated with scala.Double = js.native
  /* 133 */ val IconChanged: IconChanged with scala.Double = js.native
  /* 130 */ val InitializingContent: InitializingContent with scala.Double = js.native
  /* 104 */ val ItemAdded: ItemAdded with scala.Double = js.native
  /* 107 */ val ItemMoved: ItemMoved with scala.Double = js.native
  /* 105 */ val ItemRemoved: ItemRemoved with scala.Double = js.native
  /* 106 */ val ItemReplaced: ItemReplaced with scala.Double = js.native
  /* 109 */ val ItemsChanged: ItemsChanged with scala.Double = js.native
  /* 122 */ val LabelChanged: LabelChanged with scala.Double = js.native
  /* 29 */ val ListingActivated: ListingActivated with scala.Double = js.native
  /* 30 */ val ListingDeactivated: ListingDeactivated with scala.Double = js.native
  /* 99 */ val LogOut: LogOut with scala.Double = js.native
  /* 102 */ val LoggedIn: LoggedIn with scala.Double = js.native
  /* 150 */ val MetadataCardLocationChanged: MetadataCardLocationChanged with scala.Double = js.native
  /* 149 */ val MetadataCardLocationChanging: MetadataCardLocationChanging with scala.Double = js.native
  /* 136 */ val MetadataCardPoppedOut: MetadataCardPoppedOut with scala.Double = js.native
  /* 21 */ val MinimizedStateChanged: MinimizedStateChanged with scala.Double = js.native
  /* 124 */ val ModifyFlagChanged: ModifyFlagChanged with scala.Double = js.native
  /* 87 */ val ModifyObjectVersionLabels: ModifyObjectVersionLabels with scala.Double = js.native
  /* 115 */ val MustExistStatusChanged: MustExistStatusChanged with scala.Double = js.native
  /* 143 */ val NameChanged: NameChanged with scala.Double = js.native
  /* 12 */ val NewBottomPane: NewBottomPane with scala.Double = js.native
  /* 16 */ val NewCommands: NewCommands with scala.Double = js.native
  /* 9 */ val NewCommonDialogShellFrame: NewCommonDialogShellFrame with scala.Double = js.native
  /* 10 */ val NewEmbeddedShellFrame: NewEmbeddedShellFrame with scala.Double = js.native
  /* 8 */ val NewNormalShellFrame: NewNormalShellFrame with scala.Double = js.native
  /* 14 */ val NewRightPane: NewRightPane with scala.Double = js.native
  /* 13 */ val NewSearchPane: NewSearchPane with scala.Double = js.native
  /* 7 */ val NewShellFrame: NewShellFrame with scala.Double = js.native
  /* 15 */ val NewShellListing: NewShellListing with scala.Double = js.native
  /* 18 */ val NewTab: NewTab with scala.Double = js.native
  /* 11 */ val NewTaskPane: NewTaskPane with scala.Double = js.native
  /* 34 */ val NewVaultEntry: NewVaultEntry with scala.Double = js.native
  /* 1 */ val Notification: Notification with scala.Double = js.native
  /* 80 */ val ObjectAddedToFavorites: ObjectAddedToFavorites with scala.Double = js.native
  /* 60 */ val ObjectCheckedIn: ObjectCheckedIn with scala.Double = js.native
  /* 64 */ val ObjectCheckedOut: ObjectCheckedOut with scala.Double = js.native
  /* 68 */ val ObjectCheckoutUndone: ObjectCheckoutUndone with scala.Double = js.native
  /* 70 */ val ObjectCheckoutsUndone: ObjectCheckoutsUndone with scala.Double = js.native
  /* 36 */ val ObjectCreated: ObjectCreated with scala.Double = js.native
  /* 38 */ val ObjectDestroyed: ObjectDestroyed with scala.Double = js.native
  /* 54 */ val ObjectFileAdded: ObjectFileAdded with scala.Double = js.native
  /* 56 */ val ObjectFileRemoved: ObjectFileRemoved with scala.Double = js.native
  /* 58 */ val ObjectFileRenamed: ObjectFileRenamed with scala.Double = js.native
  /* 90 */ val ObjectLevelPropertySet: ObjectLevelPropertySet with scala.Double = js.native
  /* 94 */ val ObjectOfflineAvailabilityRemoved: ObjectOfflineAvailabilityRemoved with scala.Double = js.native
  /* 93 */ val ObjectOfflineAvailabilitySet: ObjectOfflineAvailabilitySet with scala.Double = js.native
  /* 46 */ val ObjectRemoved: ObjectRemoved with scala.Double = js.native
  /* 84 */ val ObjectRemovedFromFavorites: ObjectRemovedFromFavorites with scala.Double = js.native
  /* 50 */ val ObjectUndeleted: ObjectUndeleted with scala.Double = js.native
  /* 42 */ val ObjectVersionDestroyed: ObjectVersionDestroyed with scala.Double = js.native
  /* 88 */ val ObjectVersionLabelsModified: ObjectVersionLabelsModified with scala.Double = js.native
  /* 78 */ val ObjectVersionPermissionsSet: ObjectVersionPermissionsSet with scala.Double = js.native
  /* 72 */ val ObjectVersionRolledBack: ObjectVersionRolledBack with scala.Double = js.native
  /* 44 */ val ObjectVersionsDestroyed: ObjectVersionsDestroyed with scala.Double = js.native
  /* 82 */ val ObjectsAddedToFavorites: ObjectsAddedToFavorites with scala.Double = js.native
  /* 62 */ val ObjectsCheckedIn: ObjectsCheckedIn with scala.Double = js.native
  /* 66 */ val ObjectsCheckedOut: ObjectsCheckedOut with scala.Double = js.native
  /* 40 */ val ObjectsDestroyed: ObjectsDestroyed with scala.Double = js.native
  /* 48 */ val ObjectsRemoved: ObjectsRemoved with scala.Double = js.native
  /* 86 */ val ObjectsRemovedFromFavorites: ObjectsRemovedFromFavorites with scala.Double = js.native
  /* 52 */ val ObjectsUndeleted: ObjectsUndeleted with scala.Double = js.native
  /* 142 */ val OptionValueChanged: OptionValueChanged with scala.Double = js.native
  /* 6 */ val PaneResized: PaneResized with scala.Double = js.native
  /* 132 */ val PermissionsChanged: PermissionsChanged with scala.Double = js.native
  /* 135 */ val PopOutMetadataCard: PopOutMetadataCard with scala.Double = js.native
  /* 74 */ val PropertiesOfObjectVersionSet: PropertiesOfObjectVersionSet with scala.Double = js.native
  /* 76 */ val PropertiesOfObjectVersionsSet: PropertiesOfObjectVersionsSet with scala.Double = js.native
  /* 103 */ val QueryCanHandleFocusChangeKey: QueryCanHandleFocusChangeKey with scala.Double = js.native
  /* 140 */ val QueryUIModifiedState: QueryUIModifiedState with scala.Double = js.native
  /* 117 */ val ReadOnlyStatusChanged: ReadOnlyStatusChanged with scala.Double = js.native
  /* 45 */ val RemoveObject: RemoveObject with scala.Double = js.native
  /* 55 */ val RemoveObjectFile: RemoveObjectFile with scala.Double = js.native
  /* 83 */ val RemoveObjectFromFavorites: RemoveObjectFromFavorites with scala.Double = js.native
  /* 92 */ val RemoveObjectOfflineAvailability: RemoveObjectOfflineAvailability with scala.Double = js.native
  /* 47 */ val RemoveObjects: RemoveObjects with scala.Double = js.native
  /* 85 */ val RemoveObjectsFromFavorites: RemoveObjectsFromFavorites with scala.Double = js.native
  /* 57 */ val RenameObjectFile: RenameObjectFile with scala.Double = js.native
  /* 139 */ val RequestActivateView: RequestActivateView with scala.Double = js.native
  /* 71 */ val RollBackObjectVersion: RollBackObjectVersion with scala.Double = js.native
  /* 31 */ val SearchInitiated: SearchInitiated with scala.Double = js.native
  /* 32 */ val SearchReady: SearchReady with scala.Double = js.native
  /* 25 */ val SelectedItemsChanged: SelectedItemsChanged with scala.Double = js.native
  /* 24 */ val SelectionChanged: SelectionChanged with scala.Double = js.native
  /* 127 */ val SelectionListItemsUpdated: SelectionListItemsUpdated with scala.Double = js.native
  /* 123 */ val SetModifyFlag: SetModifyFlag with scala.Double = js.native
  /* 89 */ val SetObjectLevelProperty: SetObjectLevelProperty with scala.Double = js.native
  /* 91 */ val SetObjectOfflineAvailability: SetObjectOfflineAvailability with scala.Double = js.native
  /* 77 */ val SetObjectVersionPermissions: SetObjectVersionPermissions with scala.Double = js.native
  /* 73 */ val SetPropertiesOfObjectVersion: SetPropertiesOfObjectVersion with scala.Double = js.native
  /* 75 */ val SetPropertiesOfObjectVersions: SetPropertiesOfObjectVersions with scala.Double = js.native
  /* 27 */ val ShowContextMenu: ShowContextMenu with scala.Double = js.native
  /* 28 */ val ShowMainMenu: ShowMainMenu with scala.Double = js.native
  /* 4 */ val ShowPane: ShowPane with scala.Double = js.native
  /* 145 */ val ShowTab: ShowTab with scala.Double = js.native
  /* 2 */ val Started: Started with scala.Double = js.native
  /* 3 */ val Stop: Stop with scala.Double = js.native
  /* 95 */ val SwitchToOfflineMode: SwitchToOfflineMode with scala.Double = js.native
  /* 97 */ val SwitchToOnlineMode: SwitchToOnlineMode with scala.Double = js.native
  /* 96 */ val SwitchedToOfflineMode: SwitchedToOfflineMode with scala.Double = js.native
  /* 98 */ val SwitchedToOnlineMode: SwitchedToOnlineMode with scala.Double = js.native
  /* 19 */ val TabSelected: TabSelected with scala.Double = js.native
  /* 20 */ val TabUnselected: TabUnselected with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  /* 49 */ val UndeleteObject: UndeleteObject with scala.Double = js.native
  /* 51 */ val UndeleteObjects: UndeleteObjects with scala.Double = js.native
  /* 67 */ val UndoObjectCheckout: UndoObjectCheckout with scala.Double = js.native
  /* 69 */ val UndoObjectCheckouts: UndoObjectCheckouts with scala.Double = js.native
  /* 128 */ val UpdatingContent: UpdatingContent with scala.Double = js.native
  /* 111 */ val ValueChanged: ValueChanged with scala.Double = js.native
  /* 113 */ val ValueRequiredStatusChanged: ValueRequiredStatusChanged with scala.Double = js.native
  /* 151 */ val ValueSuggestionsChanged: ValueSuggestionsChanged with scala.Double = js.native
  /* 126 */ val ValueValidationError: ValueValidationError with scala.Double = js.native
  /* 101 */ val VaultLanguageChanged: VaultLanguageChanged with scala.Double = js.native
  /* 120 */ val VisibilityChanged: VisibilityChanged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.Event with scala.Double] = js.native
}

