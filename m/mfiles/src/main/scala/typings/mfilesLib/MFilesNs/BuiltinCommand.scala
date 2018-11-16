package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinCommand extends js.Object

@JSGlobal("MFiles.BuiltinCommand")
@js.native
object BuiltinCommand extends js.Object {
  @js.native
  sealed trait ALL
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AboutMFiles
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddCollectionMember
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddDashboardToViewLocBottom
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddDashboardToViewLocMain
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddDashboardToViewLocRight
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddDocumentFromScanner
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddFileFromScanner
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddGroupingLevel
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddRelationship
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddReportToViewLocBottom
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddReportToViewLocMain
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddReportToViewLocRight
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddShortcutToTaskPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait AddToFavorites
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Applications
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ApproveAssignment
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait BeginCoauthoring
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait BottomPane_Minimized
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait BottomPane_Normal
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait BottomPane_Off
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait BrowseInThisWindow
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ChangeLanguage
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ChangePassword
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ChangeState
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ChangeStateAdmin
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ChangeViewMode
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CheckIn
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CheckInWithComments
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CheckOut
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CheckOutForCoauthoring
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ChooseColumns
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CleanView
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ClearArchiveMarker
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ClearLocalCache
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ClientSettings
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CompleteAssignment
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ConvertToDocument
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ConvertToDocumentFiles
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ConvertToMultiFilePDF
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ConvertToOneMultiFileDocument
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ConvertToSearchablePDF
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ConvertToSingleFileDocument
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ConvertToSingleFilePDF
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Copy
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CreateOrGetShortcut
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CreateShortcut
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CurrentGroupingLevel
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait CustomizePropertyFolder
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Cut
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Delete
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait DeleteAll
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Destroy
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait DiscardFileModifications
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait EditCollectionMembership
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait EditOneAnnotation
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait EditRelationship
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait EndCoauthoring
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ExportObjects
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ExportSearchBarConditions
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait FIRST
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GoOffline
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GoOnline
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GoToCustomView
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GroupBy
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GroupFoldersBy
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GroupFoldersByFirstLetters
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GroupObjectsByFirstLetters
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GroupObjectsByObjectType
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait GroupViewsAndFolders
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait HideAllVisualAnnotations
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait HideOrShowEmptyFolders
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait HideView
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait HitHighlighting
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ImportFilesAndFolders
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait InvertSelection
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait LAST
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait LabelThisVersion
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait LogOut
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MFilesGuidedTour
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MFilesHelp
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MakeCopy
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MarkApproved
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MarkComplete
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MarkFolderForOfflineAvailability
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MarkForArchiving
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MarkForOfflineAvailability
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait MarkRejected
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ModifyVersionDetails
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NavigationPane_Off
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NavigationPane_On
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewAnnotation
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewAssignment
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewObject
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewOfflineFilter
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewPropertyFolder
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewSubobject
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewTraditionalFolder
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewView
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NewWindow
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait NotificationSettings
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Paste
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait PasteAsMultiFileDocument
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Properties
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Refresh
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RejectAssignment
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveCollectionMembership
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveCurrentGroupingLevel
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveDashboardFromViewLocBottom
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveDashboardFromViewLocMain
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveDashboardFromViewLocRight
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveFromFavorites
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveOfflineAvailability
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveRelationship
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveReportFromViewLocBottom
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveReportFromViewLocMain
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RemoveReportFromViewLocRight
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Rename
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ReplaceWithFile
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ReplaceWithFileFromScanner
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ResetUISettingsToDefaults
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ResolveConflictDiscardThis
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ResolveConflictKeepThis
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RightPane_Minimized
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RightPane_Normal
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RightPane_Off
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait RollBack
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SaveAnnotation
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SaveAsCommonUISettings
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SaveAsPDF
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SelectAll
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SendCoauthoringLink
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SendCopyByEmail
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SendLinkByEmail
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SendPDFByEmail
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ServerAdmin
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SharePublicLink
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShareViaSkyDrive
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShareViaSkyDriveAsPDF
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SharedByMe
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowAllVisualAnnotations
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowAssignments
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowBottomPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowCollectionMembers
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowComments
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowHistory
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowMetadataInBottomPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowMetadataInRightPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowNavigationPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowOriginalObject
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowPreviewPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowPropertiesPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowRelationships
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowRightPane
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowSearchRefinementOptions
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowSearchResultsFromMultipleVaults
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ShowVisualAnnotations
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_Archiving
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_BrowseRelatedObjects
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_Dashboards
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_DisplayMode
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_NewFile
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_NewObject
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_OfflineAvailability
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_RefreshExtObjects
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_Reports
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_ScanningAndOCR
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_Send
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_WindowsCommands
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubMenu_Workflow
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Submenu_DocumentX
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Submenu_VaultX
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Submenu_ViewX
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait SubstituteUsers
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait UncustomizePropertyFolder
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Undefined
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Undelete
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait UndoCheckOut
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait UnhideView
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait UnhideViews
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait UploadFiles
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait UseCompactLayout
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait UseNormalLayout
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait ViewEditSubobjects
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  @js.native
  sealed trait Workflow
    extends mfilesLib.MFilesNs.BuiltinCommand
  
  /* 268435455 */ val ALL: ALL with scala.Double = js.native
  /* 162 */ val AboutMFiles: AboutMFiles with scala.Double = js.native
  /* 95 */ val AddCollectionMember: AddCollectionMember with scala.Double = js.native
  /* 69 */ val AddDashboardToViewLocBottom: AddDashboardToViewLocBottom with scala.Double = js.native
  /* 67 */ val AddDashboardToViewLocMain: AddDashboardToViewLocMain with scala.Double = js.native
  /* 68 */ val AddDashboardToViewLocRight: AddDashboardToViewLocRight with scala.Double = js.native
  /* 43 */ val AddDocumentFromScanner: AddDocumentFromScanner with scala.Double = js.native
  /* 44 */ val AddFileFromScanner: AddFileFromScanner with scala.Double = js.native
  /* 116 */ val AddGroupingLevel: AddGroupingLevel with scala.Double = js.native
  /* 98 */ val AddRelationship: AddRelationship with scala.Double = js.native
  /* 69 */ val AddReportToViewLocBottom: AddReportToViewLocBottom with scala.Double = js.native
  /* 67 */ val AddReportToViewLocMain: AddReportToViewLocMain with scala.Double = js.native
  /* 68 */ val AddReportToViewLocRight: AddReportToViewLocRight with scala.Double = js.native
  /* 66 */ val AddShortcutToTaskPane: AddShortcutToTaskPane with scala.Double = js.native
  /* 62 */ val AddToFavorites: AddToFavorites with scala.Double = js.native
  /* 136 */ val Applications: Applications with scala.Double = js.native
  /* 165 */ val ApproveAssignment: ApproveAssignment with scala.Double = js.native
  /* 130 */ val BeginCoauthoring: BeginCoauthoring with scala.Double = js.native
  /* 152 */ val BottomPane_Minimized: BottomPane_Minimized with scala.Double = js.native
  /* 151 */ val BottomPane_Normal: BottomPane_Normal with scala.Double = js.native
  /* 153 */ val BottomPane_Off: BottomPane_Off with scala.Double = js.native
  /* 120 */ val BrowseInThisWindow: BrowseInThisWindow with scala.Double = js.native
  /* 42 */ val ChangeLanguage: ChangeLanguage with scala.Double = js.native
  /* 41 */ val ChangePassword: ChangePassword with scala.Double = js.native
  /* 26 */ val ChangeState: ChangeState with scala.Double = js.native
  /* 167 */ val ChangeStateAdmin: ChangeStateAdmin with scala.Double = js.native
  /* 106 */ val ChangeViewMode: ChangeViewMode with scala.Double = js.native
  /* 11 */ val CheckIn: CheckIn with scala.Double = js.native
  /* 12 */ val CheckInWithComments: CheckInWithComments with scala.Double = js.native
  /* 10 */ val CheckOut: CheckOut with scala.Double = js.native
  /* 129 */ val CheckOutForCoauthoring: CheckOutForCoauthoring with scala.Double = js.native
  /* 83 */ val ChooseColumns: ChooseColumns with scala.Double = js.native
  /* 58 */ val CleanView: CleanView with scala.Double = js.native
  /* 29 */ val ClearArchiveMarker: ClearArchiveMarker with scala.Double = js.native
  /* 40 */ val ClearLocalCache: ClearLocalCache with scala.Double = js.native
  /* 37 */ val ClientSettings: ClientSettings with scala.Double = js.native
  /* 25 */ val CompleteAssignment: CompleteAssignment with scala.Double = js.native
  /* 6 */ val ConvertToDocument: ConvertToDocument with scala.Double = js.native
  /* 7 */ val ConvertToDocumentFiles: ConvertToDocumentFiles with scala.Double = js.native
  /* 82 */ val ConvertToMultiFilePDF: ConvertToMultiFilePDF with scala.Double = js.native
  /* 32 */ val ConvertToOneMultiFileDocument: ConvertToOneMultiFileDocument with scala.Double = js.native
  /* 46 */ val ConvertToSearchablePDF: ConvertToSearchablePDF with scala.Double = js.native
  /* 31 */ val ConvertToSingleFileDocument: ConvertToSingleFileDocument with scala.Double = js.native
  /* 81 */ val ConvertToSingleFilePDF: ConvertToSingleFilePDF with scala.Double = js.native
  /* 73 */ val Copy: Copy with scala.Double = js.native
  /* 64 */ val CreateOrGetShortcut: CreateOrGetShortcut with scala.Double = js.native
  /* 65 */ val CreateShortcut: CreateShortcut with scala.Double = js.native
  /* 117 */ val CurrentGroupingLevel: CurrentGroupingLevel with scala.Double = js.native
  /* 144 */ val CustomizePropertyFolder: CustomizePropertyFolder with scala.Double = js.native
  /* 74 */ val Cut: Cut with scala.Double = js.native
  /* 76 */ val Delete: Delete with scala.Double = js.native
  /* 90 */ val DeleteAll: DeleteAll with scala.Double = js.native
  /* 91 */ val Destroy: Destroy with scala.Double = js.native
  /* 171 */ val DiscardFileModifications: DiscardFileModifications with scala.Double = js.native
  /* 96 */ val EditCollectionMembership: EditCollectionMembership with scala.Double = js.native
  /* 159 */ val EditOneAnnotation: EditOneAnnotation with scala.Double = js.native
  /* 99 */ val EditRelationship: EditRelationship with scala.Double = js.native
  /* 131 */ val EndCoauthoring: EndCoauthoring with scala.Double = js.native
  /* 79 */ val ExportObjects: ExportObjects with scala.Double = js.native
  /* 80 */ val ExportSearchBarConditions: ExportSearchBarConditions with scala.Double = js.native
  /* 1 */ val FIRST: FIRST with scala.Double = js.native
  /* 35 */ val GoOffline: GoOffline with scala.Double = js.native
  /* 34 */ val GoOnline: GoOnline with scala.Double = js.native
  /* 124 */ val GoToCustomView: GoToCustomView with scala.Double = js.native
  /* 121 */ val GroupBy: GroupBy with scala.Double = js.native
  /* 122 */ val GroupFoldersBy: GroupFoldersBy with scala.Double = js.native
  /* 115 */ val GroupFoldersByFirstLetters: GroupFoldersByFirstLetters with scala.Double = js.native
  /* 114 */ val GroupObjectsByFirstLetters: GroupObjectsByFirstLetters with scala.Double = js.native
  /* 54 */ val GroupObjectsByObjectType: GroupObjectsByObjectType with scala.Double = js.native
  /* 55 */ val GroupViewsAndFolders: GroupViewsAndFolders with scala.Double = js.native
  /* 158 */ val HideAllVisualAnnotations: HideAllVisualAnnotations with scala.Double = js.native
  /* 119 */ val HideOrShowEmptyFolders: HideOrShowEmptyFolders with scala.Double = js.native
  /* 56 */ val HideView: HideView with scala.Double = js.native
  /* 128 */ val HitHighlighting: HitHighlighting with scala.Double = js.native
  /* 8 */ val ImportFilesAndFolders: ImportFilesAndFolders with scala.Double = js.native
  /* 86 */ val InvertSelection: InvertSelection with scala.Double = js.native
  /* 174 */ val LAST: LAST with scala.Double = js.native
  /* 93 */ val LabelThisVersion: LabelThisVersion with scala.Double = js.native
  /* 36 */ val LogOut: LogOut with scala.Double = js.native
  /* 142 */ val MFilesGuidedTour: MFilesGuidedTour with scala.Double = js.native
  /* 141 */ val MFilesHelp: MFilesHelp with scala.Double = js.native
  /* 9 */ val MakeCopy: MakeCopy with scala.Double = js.native
  /* 163 */ val MarkApproved: MarkApproved with scala.Double = js.native
  /* 123 */ val MarkComplete: MarkComplete with scala.Double = js.native
  /* 15 */ val MarkFolderForOfflineAvailability: MarkFolderForOfflineAvailability with scala.Double = js.native
  /* 28 */ val MarkForArchiving: MarkForArchiving with scala.Double = js.native
  /* 16 */ val MarkForOfflineAvailability: MarkForOfflineAvailability with scala.Double = js.native
  /* 164 */ val MarkRejected: MarkRejected with scala.Double = js.native
  /* 92 */ val ModifyVersionDetails: ModifyVersionDetails with scala.Double = js.native
  /* 155 */ val NavigationPane_Off: NavigationPane_Off with scala.Double = js.native
  /* 154 */ val NavigationPane_On: NavigationPane_On with scala.Double = js.native
  /* 161 */ val NewAnnotation: NewAnnotation with scala.Double = js.native
  /* 23 */ val NewAssignment: NewAssignment with scala.Double = js.native
  /* 87 */ val NewObject: NewObject with scala.Double = js.native
  /* 3 */ val NewOfflineFilter: NewOfflineFilter with scala.Double = js.native
  /* 5 */ val NewPropertyFolder: NewPropertyFolder with scala.Double = js.native
  /* 94 */ val NewSubobject: NewSubobject with scala.Double = js.native
  /* 4 */ val NewTraditionalFolder: NewTraditionalFolder with scala.Double = js.native
  /* 2 */ val NewView: NewView with scala.Double = js.native
  /* 78 */ val NewWindow: NewWindow with scala.Double = js.native
  /* 39 */ val NotificationSettings: NotificationSettings with scala.Double = js.native
  /* 75 */ val Paste: Paste with scala.Double = js.native
  /* 84 */ val PasteAsMultiFileDocument: PasteAsMultiFileDocument with scala.Double = js.native
  /* 14 */ val Properties: Properties with scala.Double = js.native
  /* 88 */ val Refresh: Refresh with scala.Double = js.native
  /* 166 */ val RejectAssignment: RejectAssignment with scala.Double = js.native
  /* 97 */ val RemoveCollectionMembership: RemoveCollectionMembership with scala.Double = js.native
  /* 118 */ val RemoveCurrentGroupingLevel: RemoveCurrentGroupingLevel with scala.Double = js.native
  /* 72 */ val RemoveDashboardFromViewLocBottom: RemoveDashboardFromViewLocBottom with scala.Double = js.native
  /* 70 */ val RemoveDashboardFromViewLocMain: RemoveDashboardFromViewLocMain with scala.Double = js.native
  /* 71 */ val RemoveDashboardFromViewLocRight: RemoveDashboardFromViewLocRight with scala.Double = js.native
  /* 63 */ val RemoveFromFavorites: RemoveFromFavorites with scala.Double = js.native
  /* 17 */ val RemoveOfflineAvailability: RemoveOfflineAvailability with scala.Double = js.native
  /* 100 */ val RemoveRelationship: RemoveRelationship with scala.Double = js.native
  /* 72 */ val RemoveReportFromViewLocBottom: RemoveReportFromViewLocBottom with scala.Double = js.native
  /* 70 */ val RemoveReportFromViewLocMain: RemoveReportFromViewLocMain with scala.Double = js.native
  /* 71 */ val RemoveReportFromViewLocRight: RemoveReportFromViewLocRight with scala.Double = js.native
  /* 77 */ val Rename: Rename with scala.Double = js.native
  /* 33 */ val ReplaceWithFile: ReplaceWithFile with scala.Double = js.native
  /* 45 */ val ReplaceWithFileFromScanner: ReplaceWithFileFromScanner with scala.Double = js.native
  /* 60 */ val ResetUISettingsToDefaults: ResetUISettingsToDefaults with scala.Double = js.native
  /* 135 */ val ResolveConflictDiscardThis: ResolveConflictDiscardThis with scala.Double = js.native
  /* 134 */ val ResolveConflictKeepThis: ResolveConflictKeepThis with scala.Double = js.native
  /* 149 */ val RightPane_Minimized: RightPane_Minimized with scala.Double = js.native
  /* 148 */ val RightPane_Normal: RightPane_Normal with scala.Double = js.native
  /* 150 */ val RightPane_Off: RightPane_Off with scala.Double = js.native
  /* 89 */ val RollBack: RollBack with scala.Double = js.native
  /* 160 */ val SaveAnnotation: SaveAnnotation with scala.Double = js.native
  /* 61 */ val SaveAsCommonUISettings: SaveAsCommonUISettings with scala.Double = js.native
  /* 50 */ val SaveAsPDF: SaveAsPDF with scala.Double = js.native
  /* 85 */ val SelectAll: SelectAll with scala.Double = js.native
  /* 133 */ val SendCoauthoringLink: SendCoauthoringLink with scala.Double = js.native
  /* 48 */ val SendCopyByEmail: SendCopyByEmail with scala.Double = js.native
  /* 47 */ val SendLinkByEmail: SendLinkByEmail with scala.Double = js.native
  /* 49 */ val SendPDFByEmail: SendPDFByEmail with scala.Double = js.native
  /* 38 */ val ServerAdmin: ServerAdmin with scala.Double = js.native
  /* 168 */ val SharePublicLink: SharePublicLink with scala.Double = js.native
  /* 137 */ val ShareViaSkyDrive: ShareViaSkyDrive with scala.Double = js.native
  /* 138 */ val ShareViaSkyDriveAsPDF: ShareViaSkyDriveAsPDF with scala.Double = js.native
  /* 169 */ val SharedByMe: SharedByMe with scala.Double = js.native
  /* 157 */ val ShowAllVisualAnnotations: ShowAllVisualAnnotations with scala.Double = js.native
  /* 24 */ val ShowAssignments: ShowAssignments with scala.Double = js.native
  /* 52 */ val ShowBottomPane: ShowBottomPane with scala.Double = js.native
  /* 20 */ val ShowCollectionMembers: ShowCollectionMembers with scala.Double = js.native
  /* 22 */ val ShowComments: ShowComments with scala.Double = js.native
  /* 18 */ val ShowHistory: ShowHistory with scala.Double = js.native
  /* 140 */ val ShowMetadataInBottomPane: ShowMetadataInBottomPane with scala.Double = js.native
  /* 139 */ val ShowMetadataInRightPane: ShowMetadataInRightPane with scala.Double = js.native
  /* 143 */ val ShowNavigationPane: ShowNavigationPane with scala.Double = js.native
  /* 132 */ val ShowOriginalObject: ShowOriginalObject with scala.Double = js.native
  /* 53 */ val ShowPreviewPane: ShowPreviewPane with scala.Double = js.native
  /* 52 */ val ShowPropertiesPane: ShowPropertiesPane with scala.Double = js.native
  /* 19 */ val ShowRelationships: ShowRelationships with scala.Double = js.native
  /* 53 */ val ShowRightPane: ShowRightPane with scala.Double = js.native
  /* 173 */ val ShowSearchRefinementOptions: ShowSearchRefinementOptions with scala.Double = js.native
  /* 172 */ val ShowSearchResultsFromMultipleVaults: ShowSearchResultsFromMultipleVaults with scala.Double = js.native
  /* 156 */ val ShowVisualAnnotations: ShowVisualAnnotations with scala.Double = js.native
  /* 109 */ val SubMenu_Archiving: SubMenu_Archiving with scala.Double = js.native
  /* 108 */ val SubMenu_BrowseRelatedObjects: SubMenu_BrowseRelatedObjects with scala.Double = js.native
  /* 113 */ val SubMenu_Dashboards: SubMenu_Dashboards with scala.Double = js.native
  /* 105 */ val SubMenu_DisplayMode: SubMenu_DisplayMode with scala.Double = js.native
  /* 102 */ val SubMenu_NewFile: SubMenu_NewFile with scala.Double = js.native
  /* 101 */ val SubMenu_NewObject: SubMenu_NewObject with scala.Double = js.native
  /* 107 */ val SubMenu_OfflineAvailability: SubMenu_OfflineAvailability with scala.Double = js.native
  /* 112 */ val SubMenu_RefreshExtObjects: SubMenu_RefreshExtObjects with scala.Double = js.native
  /* 113 */ val SubMenu_Reports: SubMenu_Reports with scala.Double = js.native
  /* 111 */ val SubMenu_ScanningAndOCR: SubMenu_ScanningAndOCR with scala.Double = js.native
  /* 104 */ val SubMenu_Send: SubMenu_Send with scala.Double = js.native
  /* 103 */ val SubMenu_WindowsCommands: SubMenu_WindowsCommands with scala.Double = js.native
  /* 110 */ val SubMenu_Workflow: SubMenu_Workflow with scala.Double = js.native
  /* 127 */ val Submenu_DocumentX: Submenu_DocumentX with scala.Double = js.native
  /* 125 */ val Submenu_VaultX: Submenu_VaultX with scala.Double = js.native
  /* 126 */ val Submenu_ViewX: Submenu_ViewX with scala.Double = js.native
  /* 51 */ val SubstituteUsers: SubstituteUsers with scala.Double = js.native
  /* 145 */ val UncustomizePropertyFolder: UncustomizePropertyFolder with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  /* 30 */ val Undelete: Undelete with scala.Double = js.native
  /* 13 */ val UndoCheckOut: UndoCheckOut with scala.Double = js.native
  /* 57 */ val UnhideView: UnhideView with scala.Double = js.native
  /* 59 */ val UnhideViews: UnhideViews with scala.Double = js.native
  /* 170 */ val UploadFiles: UploadFiles with scala.Double = js.native
  /* 147 */ val UseCompactLayout: UseCompactLayout with scala.Double = js.native
  /* 146 */ val UseNormalLayout: UseNormalLayout with scala.Double = js.native
  /* 21 */ val ViewEditSubobjects: ViewEditSubobjects with scala.Double = js.native
  /* 27 */ val Workflow: Workflow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.BuiltinCommand with scala.Double] = js.native
}

