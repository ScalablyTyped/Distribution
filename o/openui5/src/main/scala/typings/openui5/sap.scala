package typings.openui5

import typings.openui5.anon.Details
import typings.openui5.sapUiCoreItemMod.default
import typings.std.Partial
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Root namespace for JavaScript functionality provided by SAP SE.
  *
  * The `sap` namespace is automatically registered with the OpenAjax hub if it exists.
  */
object sap {
  
  type ClassInfo[T, C] = T & Partial[C] & (ThisType[T & C])
  
  trait IUI5DefineDependencyNames extends StObject {
    
    @JSName("jquery.sap.act")
    var jqueryDotsapDotact: Unit
    
    @JSName("jquery.sap.events")
    var jqueryDotsapDotevents: Unit
    
    @JSName("jquery.sap.global")
    var jqueryDotsapDotglobal: Unit
    
    @JSName("jquery.sap.history")
    var jqueryDotsapDothistory: Unit
    
    @JSName("jquery.sap.keycodes")
    var jqueryDotsapDotkeycodes: Unit
    
    @JSName("jquery.sap.mobile")
    var jqueryDotsapDotmobile: Unit
    
    @JSName("jquery.sap.properties")
    var jqueryDotsapDotproperties: Unit
    
    @JSName("jquery.sap.resources")
    var jqueryDotsapDotresources: Unit
    
    @JSName("jquery.sap.script")
    var jqueryDotsapDotscript: Unit
    
    @JSName("jquery.sap.storage")
    var jqueryDotsapDotstorage: Unit
    
    @JSName("jquery.sap.trace")
    var jqueryDotsapDottrace: Unit
    
    @JSName("sap/base/Log")
    var sapSlashbaseSlashLog: Unit
    
    @JSName("sap/base/assert")
    var sapSlashbaseSlashassert: Unit
    
    @JSName("sap/base/i18n/ResourceBundle")
    var sapSlashbaseSlashi18nSlashResourceBundle: Unit
    
    @JSName("sap/base/security/URLListValidator")
    var sapSlashbaseSlashsecuritySlashURLListValidator: Unit
    
    @JSName("sap/base/security/URLWhitelist")
    var sapSlashbaseSlashsecuritySlashURLWhitelist: Unit
    
    @JSName("sap/base/security/encodeCSS")
    var sapSlashbaseSlashsecuritySlashencodeCSS: Unit
    
    @JSName("sap/base/security/encodeJS")
    var sapSlashbaseSlashsecuritySlashencodeJS: Unit
    
    @JSName("sap/base/security/encodeURL")
    var sapSlashbaseSlashsecuritySlashencodeURL: Unit
    
    @JSName("sap/base/security/encodeURLParameters")
    var sapSlashbaseSlashsecuritySlashencodeURLParameters: Unit
    
    @JSName("sap/base/security/encodeXML")
    var sapSlashbaseSlashsecuritySlashencodeXML: Unit
    
    @JSName("sap/base/strings/camelize")
    var sapSlashbaseSlashstringsSlashcamelize: Unit
    
    @JSName("sap/base/strings/capitalize")
    var sapSlashbaseSlashstringsSlashcapitalize: Unit
    
    @JSName("sap/base/strings/escapeRegExp")
    var sapSlashbaseSlashstringsSlashescapeRegExp: Unit
    
    @JSName("sap/base/strings/formatMessage")
    var sapSlashbaseSlashstringsSlashformatMessage: Unit
    
    @JSName("sap/base/strings/hyphenate")
    var sapSlashbaseSlashstringsSlashhyphenate: Unit
    
    @JSName("sap/base/strings/whitespaceReplacer")
    var sapSlashbaseSlashstringsSlashwhitespaceReplacer: Unit
    
    @JSName("sap/base/util/Deferred")
    var sapSlashbaseSlashutilSlashDeferred: Unit
    
    @JSName("sap/base/util/JSTokenizer")
    var sapSlashbaseSlashutilSlashJSTokenizer: Unit
    
    @JSName("sap/base/util/LoaderExtensions")
    var sapSlashbaseSlashutilSlashLoaderExtensions: Unit
    
    @JSName("sap/base/util/ObjectPath")
    var sapSlashbaseSlashutilSlashObjectPath: Unit
    
    @JSName("sap/base/util/Properties")
    var sapSlashbaseSlashutilSlashProperties: Unit
    
    @JSName("sap/base/util/UriParameters")
    var sapSlashbaseSlashutilSlashUriParameters: Unit
    
    @JSName("sap/base/util/Version")
    var sapSlashbaseSlashutilSlashVersion: Unit
    
    @JSName("sap/base/util/array/diff")
    var sapSlashbaseSlashutilSlasharraySlashdiff: Unit
    
    @JSName("sap/base/util/array/uniqueSort")
    var sapSlashbaseSlashutilSlasharraySlashuniqueSort: Unit
    
    @JSName("sap/base/util/deepClone")
    var sapSlashbaseSlashutilSlashdeepClone: Unit
    
    @JSName("sap/base/util/deepEqual")
    var sapSlashbaseSlashutilSlashdeepEqual: Unit
    
    @JSName("sap/base/util/deepExtend")
    var sapSlashbaseSlashutilSlashdeepExtend: Unit
    
    @JSName("sap/base/util/defineCoupledProperty")
    var sapSlashbaseSlashutilSlashdefineCoupledProperty: Unit
    
    @JSName("sap/base/util/defineLazyProperty")
    var sapSlashbaseSlashutilSlashdefineLazyProperty: Unit
    
    @JSName("sap/base/util/each")
    var sapSlashbaseSlashutilSlasheach: Unit
    
    @JSName("sap/base/util/extend")
    var sapSlashbaseSlashutilSlashextend: Unit
    
    @JSName("sap/base/util/fetch")
    var sapSlashbaseSlashutilSlashfetch: Unit
    
    @JSName("sap/base/util/includes")
    var sapSlashbaseSlashutilSlashincludes: Unit
    
    @JSName("sap/base/util/isEmptyObject")
    var sapSlashbaseSlashutilSlashisEmptyObject: Unit
    
    @JSName("sap/base/util/isPlainObject")
    var sapSlashbaseSlashutilSlashisPlainObject: Unit
    
    @JSName("sap/base/util/merge")
    var sapSlashbaseSlashutilSlashmerge: Unit
    
    @JSName("sap/base/util/mixedFetch")
    var sapSlashbaseSlashutilSlashmixedFetch: Unit
    
    @JSName("sap/base/util/now")
    var sapSlashbaseSlashutilSlashnow: Unit
    
    @JSName("sap/base/util/resolveReference")
    var sapSlashbaseSlashutilSlashresolveReference: Unit
    
    @JSName("sap/base/util/syncFetch")
    var sapSlashbaseSlashutilSlashsyncFetch: Unit
    
    @JSName("sap/base/util/uid")
    var sapSlashbaseSlashutilSlashuid: Unit
    
    @JSName("sap/base/util/values")
    var sapSlashbaseSlashutilSlashvalues: Unit
    
    @JSName("sap/f/Avatar")
    var sapSlashfSlashAvatar: Unit
    
    @JSName("sap/f/AvatarGroup")
    var sapSlashfSlashAvatarGroup: Unit
    
    @JSName("sap/f/AvatarGroupItem")
    var sapSlashfSlashAvatarGroupItem: Unit
    
    @JSName("sap/f/Card")
    var sapSlashfSlashCard: Unit
    
    @JSName("sap/f/CardBase")
    var sapSlashfSlashCardBase: Unit
    
    @JSName("sap/f/DynamicPage")
    var sapSlashfSlashDynamicPage: Unit
    
    @JSName("sap/f/DynamicPageAccessibleLandmarkInfo")
    var sapSlashfSlashDynamicPageAccessibleLandmarkInfo: Unit
    
    @JSName("sap/f/DynamicPageHeader")
    var sapSlashfSlashDynamicPageHeader: Unit
    
    @JSName("sap/f/DynamicPageTitle")
    var sapSlashfSlashDynamicPageTitle: Unit
    
    @JSName("sap/f/FlexibleColumnLayout")
    var sapSlashfSlashFlexibleColumnLayout: Unit
    
    @JSName("sap/f/FlexibleColumnLayoutAccessibleLandmarkInfo")
    var sapSlashfSlashFlexibleColumnLayoutAccessibleLandmarkInfo: Unit
    
    @JSName("sap/f/FlexibleColumnLayoutSemanticHelper")
    var sapSlashfSlashFlexibleColumnLayoutSemanticHelper: Unit
    
    @JSName("sap/f/GridContainer")
    var sapSlashfSlashGridContainer: Unit
    
    @JSName("sap/f/GridContainerItemLayoutData")
    var sapSlashfSlashGridContainerItemLayoutData: Unit
    
    @JSName("sap/f/GridContainerSettings")
    var sapSlashfSlashGridContainerSettings: Unit
    
    @JSName("sap/f/GridList")
    var sapSlashfSlashGridList: Unit
    
    @JSName("sap/f/GridListItem")
    var sapSlashfSlashGridListItem: Unit
    
    @JSName("sap/f/IllustratedMessage")
    var sapSlashfSlashIllustratedMessage: Unit
    
    @JSName("sap/f/Illustration")
    var sapSlashfSlashIllustration: Unit
    
    @JSName("sap/f/IllustrationPool")
    var sapSlashfSlashIllustrationPool: Unit
    
    @JSName("sap/f/ProductSwitch")
    var sapSlashfSlashProductSwitch: Unit
    
    @JSName("sap/f/ProductSwitchItem")
    var sapSlashfSlashProductSwitchItem: Unit
    
    @JSName("sap/f/SearchManager")
    var sapSlashfSlashSearchManager: Unit
    
    @JSName("sap/f/ShellBar")
    var sapSlashfSlashShellBar: Unit
    
    @JSName("sap/f/SidePanel")
    var sapSlashfSlashSidePanel: Unit
    
    @JSName("sap/f/SidePanelItem")
    var sapSlashfSlashSidePanelItem: Unit
    
    @JSName("sap/f/cards/BaseHeader")
    var sapSlashfSlashcardsSlashBaseHeader: Unit
    
    @JSName("sap/f/cards/Header")
    var sapSlashfSlashcardsSlashHeader: Unit
    
    @JSName("sap/f/cards/NumericHeader")
    var sapSlashfSlashcardsSlashNumericHeader: Unit
    
    @JSName("sap/f/cards/NumericSideIndicator")
    var sapSlashfSlashcardsSlashNumericSideIndicator: Unit
    
    @JSName("sap/f/dnd/GridDropInfo")
    var sapSlashfSlashdndSlashGridDropInfo: Unit
    
    @JSName("sap/f/library")
    var sapSlashfSlashlibrary: Unit
    
    @JSName("sap/f/routing/Router")
    var sapSlashfSlashroutingSlashRouter: Unit
    
    @JSName("sap/f/routing/TargetHandler")
    var sapSlashfSlashroutingSlashTargetHandler: Unit
    
    @JSName("sap/f/routing/Targets")
    var sapSlashfSlashroutingSlashTargets: Unit
    
    @JSName("sap/f/semantic/AddAction")
    var sapSlashfSlashsemanticSlashAddAction: Unit
    
    @JSName("sap/f/semantic/CloseAction")
    var sapSlashfSlashsemanticSlashCloseAction: Unit
    
    @JSName("sap/f/semantic/CopyAction")
    var sapSlashfSlashsemanticSlashCopyAction: Unit
    
    @JSName("sap/f/semantic/DeleteAction")
    var sapSlashfSlashsemanticSlashDeleteAction: Unit
    
    @JSName("sap/f/semantic/DiscussInJamAction")
    var sapSlashfSlashsemanticSlashDiscussInJamAction: Unit
    
    @JSName("sap/f/semantic/EditAction")
    var sapSlashfSlashsemanticSlashEditAction: Unit
    
    @JSName("sap/f/semantic/ExitFullScreenAction")
    var sapSlashfSlashsemanticSlashExitFullScreenAction: Unit
    
    @JSName("sap/f/semantic/FavoriteAction")
    var sapSlashfSlashsemanticSlashFavoriteAction: Unit
    
    @JSName("sap/f/semantic/FlagAction")
    var sapSlashfSlashsemanticSlashFlagAction: Unit
    
    @JSName("sap/f/semantic/FooterMainAction")
    var sapSlashfSlashsemanticSlashFooterMainAction: Unit
    
    @JSName("sap/f/semantic/FullScreenAction")
    var sapSlashfSlashsemanticSlashFullScreenAction: Unit
    
    @JSName("sap/f/semantic/MainAction")
    var sapSlashfSlashsemanticSlashMainAction: Unit
    
    @JSName("sap/f/semantic/MessagesIndicator")
    var sapSlashfSlashsemanticSlashMessagesIndicator: Unit
    
    @JSName("sap/f/semantic/NegativeAction")
    var sapSlashfSlashsemanticSlashNegativeAction: Unit
    
    @JSName("sap/f/semantic/PositiveAction")
    var sapSlashfSlashsemanticSlashPositiveAction: Unit
    
    @JSName("sap/f/semantic/PrintAction")
    var sapSlashfSlashsemanticSlashPrintAction: Unit
    
    @JSName("sap/f/semantic/SemanticButton")
    var sapSlashfSlashsemanticSlashSemanticButton: Unit
    
    @JSName("sap/f/semantic/SemanticControl")
    var sapSlashfSlashsemanticSlashSemanticControl: Unit
    
    @JSName("sap/f/semantic/SemanticPage")
    var sapSlashfSlashsemanticSlashSemanticPage: Unit
    
    @JSName("sap/f/semantic/SemanticToggleButton")
    var sapSlashfSlashsemanticSlashSemanticToggleButton: Unit
    
    @JSName("sap/f/semantic/SendEmailAction")
    var sapSlashfSlashsemanticSlashSendEmailAction: Unit
    
    @JSName("sap/f/semantic/SendMessageAction")
    var sapSlashfSlashsemanticSlashSendMessageAction: Unit
    
    @JSName("sap/f/semantic/ShareInJamAction")
    var sapSlashfSlashsemanticSlashShareInJamAction: Unit
    
    @JSName("sap/f/semantic/TitleMainAction")
    var sapSlashfSlashsemanticSlashTitleMainAction: Unit
    
    @JSName("sap/m/ActionListItem")
    var sapSlashmSlashActionListItem: Unit
    
    @JSName("sap/m/ActionSelect")
    var sapSlashmSlashActionSelect: Unit
    
    @JSName("sap/m/ActionSheet")
    var sapSlashmSlashActionSheet: Unit
    
    @JSName("sap/m/App")
    var sapSlashmSlashApp: Unit
    
    @JSName("sap/m/Avatar")
    var sapSlashmSlashAvatar: Unit
    
    @JSName("sap/m/AvatarColor")
    var sapSlashmSlashAvatarColor: Unit
    
    @JSName("sap/m/AvatarImageFitType")
    var sapSlashmSlashAvatarImageFitType: Unit
    
    @JSName("sap/m/AvatarShape")
    var sapSlashmSlashAvatarShape: Unit
    
    @JSName("sap/m/AvatarSize")
    var sapSlashmSlashAvatarSize: Unit
    
    @JSName("sap/m/AvatarType")
    var sapSlashmSlashAvatarType: Unit
    
    @JSName("sap/m/BadgeCustomData")
    var sapSlashmSlashBadgeCustomData: Unit
    
    @JSName("sap/m/BadgeEnabler")
    var sapSlashmSlashBadgeEnabler: Unit
    
    @JSName("sap/m/Bar")
    var sapSlashmSlashBar: Unit
    
    @JSName("sap/m/BarInPageEnabler")
    var sapSlashmSlashBarInPageEnabler: Unit
    
    @JSName("sap/m/Breadcrumbs")
    var sapSlashmSlashBreadcrumbs: Unit
    
    @JSName("sap/m/BusyDialog")
    var sapSlashmSlashBusyDialog: Unit
    
    @JSName("sap/m/BusyIndicator")
    var sapSlashmSlashBusyIndicator: Unit
    
    @JSName("sap/m/Button")
    var sapSlashmSlashButton: Unit
    
    @JSName("sap/m/Carousel")
    var sapSlashmSlashCarousel: Unit
    
    @JSName("sap/m/CarouselLayout")
    var sapSlashmSlashCarouselLayout: Unit
    
    @JSName("sap/m/CheckBox")
    var sapSlashmSlashCheckBox: Unit
    
    @JSName("sap/m/ColorPalette")
    var sapSlashmSlashColorPalette: Unit
    
    @JSName("sap/m/ColorPalettePopover")
    var sapSlashmSlashColorPalettePopover: Unit
    
    @JSName("sap/m/Column")
    var sapSlashmSlashColumn: Unit
    
    @JSName("sap/m/ColumnListItem")
    var sapSlashmSlashColumnListItem: Unit
    
    @JSName("sap/m/ComboBox")
    var sapSlashmSlashComboBox: Unit
    
    @JSName("sap/m/ComboBoxBase")
    var sapSlashmSlashComboBoxBase: Unit
    
    @JSName("sap/m/ComboBoxTextField")
    var sapSlashmSlashComboBoxTextField: Unit
    
    @JSName("sap/m/CustomDynamicDateOption")
    var sapSlashmSlashCustomDynamicDateOption: Unit
    
    @JSName("sap/m/CustomListItem")
    var sapSlashmSlashCustomListItem: Unit
    
    @JSName("sap/m/CustomTile")
    var sapSlashmSlashCustomTile: Unit
    
    @JSName("sap/m/CustomTreeItem")
    var sapSlashmSlashCustomTreeItem: Unit
    
    @JSName("sap/m/DatePicker")
    var sapSlashmSlashDatePicker: Unit
    
    @JSName("sap/m/DateRangeSelection")
    var sapSlashmSlashDateRangeSelection: Unit
    
    @JSName("sap/m/DateTimeField")
    var sapSlashmSlashDateTimeField: Unit
    
    @JSName("sap/m/DateTimeInput")
    var sapSlashmSlashDateTimeInput: Unit
    
    @JSName("sap/m/DateTimePicker")
    var sapSlashmSlashDateTimePicker: Unit
    
    @JSName("sap/m/Dialog")
    var sapSlashmSlashDialog: Unit
    
    @JSName("sap/m/DisplayListItem")
    var sapSlashmSlashDisplayListItem: Unit
    
    @JSName("sap/m/DraftIndicator")
    var sapSlashmSlashDraftIndicator: Unit
    
    @JSName("sap/m/DynamicDate")
    var sapSlashmSlashDynamicDate: Unit
    
    @JSName("sap/m/DynamicDateFormat")
    var sapSlashmSlashDynamicDateFormat: Unit
    
    @JSName("sap/m/DynamicDateOption")
    var sapSlashmSlashDynamicDateOption: Unit
    
    @JSName("sap/m/DynamicDateRange")
    var sapSlashmSlashDynamicDateRange: Unit
    
    @JSName("sap/m/DynamicDateUtil")
    var sapSlashmSlashDynamicDateUtil: Unit
    
    @JSName("sap/m/DynamicDateValueHelpUIType")
    var sapSlashmSlashDynamicDateValueHelpUIType: Unit
    
    @JSName("sap/m/ExpandableText")
    var sapSlashmSlashExpandableText: Unit
    
    @JSName("sap/m/FacetFilter")
    var sapSlashmSlashFacetFilter: Unit
    
    @JSName("sap/m/FacetFilterItem")
    var sapSlashmSlashFacetFilterItem: Unit
    
    @JSName("sap/m/FacetFilterList")
    var sapSlashmSlashFacetFilterList: Unit
    
    @JSName("sap/m/FeedContent")
    var sapSlashmSlashFeedContent: Unit
    
    @JSName("sap/m/FeedInput")
    var sapSlashmSlashFeedInput: Unit
    
    @JSName("sap/m/FeedListItem")
    var sapSlashmSlashFeedListItem: Unit
    
    @JSName("sap/m/FeedListItemAction")
    var sapSlashmSlashFeedListItemAction: Unit
    
    @JSName("sap/m/FlexBox")
    var sapSlashmSlashFlexBox: Unit
    
    @JSName("sap/m/FlexItemData")
    var sapSlashmSlashFlexItemData: Unit
    
    @JSName("sap/m/FormattedText")
    var sapSlashmSlashFormattedText: Unit
    
    @JSName("sap/m/GenericTag")
    var sapSlashmSlashGenericTag: Unit
    
    @JSName("sap/m/GenericTile")
    var sapSlashmSlashGenericTile: Unit
    
    @JSName("sap/m/GroupHeaderListItem")
    var sapSlashmSlashGroupHeaderListItem: Unit
    
    @JSName("sap/m/GrowingEnablement")
    var sapSlashmSlashGrowingEnablement: Unit
    
    @JSName("sap/m/GrowingList")
    var sapSlashmSlashGrowingList: Unit
    
    @JSName("sap/m/HBox")
    var sapSlashmSlashHBox: Unit
    
    @JSName("sap/m/HeaderContainer")
    var sapSlashmSlashHeaderContainer: Unit
    
    @JSName("sap/m/IconTabBar")
    var sapSlashmSlashIconTabBar: Unit
    
    @JSName("sap/m/IconTabFilter")
    var sapSlashmSlashIconTabFilter: Unit
    
    @JSName("sap/m/IconTabHeader")
    var sapSlashmSlashIconTabHeader: Unit
    
    @JSName("sap/m/IconTabSeparator")
    var sapSlashmSlashIconTabSeparator: Unit
    
    @JSName("sap/m/IllustratedMessage")
    var sapSlashmSlashIllustratedMessage: Unit
    
    @JSName("sap/m/IllustratedMessageSize")
    var sapSlashmSlashIllustratedMessageSize: Unit
    
    @JSName("sap/m/IllustratedMessageType")
    var sapSlashmSlashIllustratedMessageType: Unit
    
    @JSName("sap/m/Illustration")
    var sapSlashmSlashIllustration: Unit
    
    @JSName("sap/m/IllustrationPool")
    var sapSlashmSlashIllustrationPool: Unit
    
    @JSName("sap/m/Image")
    var sapSlashmSlashImage: Unit
    
    @JSName("sap/m/ImageContent")
    var sapSlashmSlashImageContent: Unit
    
    @JSName("sap/m/Input")
    var sapSlashmSlashInput: Unit
    
    @JSName("sap/m/InputBase")
    var sapSlashmSlashInputBase: Unit
    
    @JSName("sap/m/InputBaseRenderer")
    var sapSlashmSlashInputBaseRenderer: Unit
    
    @JSName("sap/m/InputListItem")
    var sapSlashmSlashInputListItem: Unit
    
    @JSName("sap/m/InputRenderer")
    var sapSlashmSlashInputRenderer: Unit
    
    @JSName("sap/m/InstanceManager")
    var sapSlashmSlashInstanceManager: Unit
    
    @JSName("sap/m/Label")
    var sapSlashmSlashLabel: Unit
    
    @JSName("sap/m/LightBox")
    var sapSlashmSlashLightBox: Unit
    
    @JSName("sap/m/LightBoxItem")
    var sapSlashmSlashLightBoxItem: Unit
    
    @JSName("sap/m/Link")
    var sapSlashmSlashLink: Unit
    
    @JSName("sap/m/List")
    var sapSlashmSlashList: Unit
    
    @JSName("sap/m/ListBase")
    var sapSlashmSlashListBase: Unit
    
    @JSName("sap/m/ListItemBase")
    var sapSlashmSlashListItemBase: Unit
    
    @JSName("sap/m/MaskInput")
    var sapSlashmSlashMaskInput: Unit
    
    @JSName("sap/m/MaskInputRule")
    var sapSlashmSlashMaskInputRule: Unit
    
    @JSName("sap/m/Menu")
    var sapSlashmSlashMenu: Unit
    
    @JSName("sap/m/MenuButton")
    var sapSlashmSlashMenuButton: Unit
    
    @JSName("sap/m/MenuItem")
    var sapSlashmSlashMenuItem: Unit
    
    @JSName("sap/m/MessageBox")
    var sapSlashmSlashMessageBox: Unit
    
    @JSName("sap/m/MessageItem")
    var sapSlashmSlashMessageItem: Unit
    
    @JSName("sap/m/MessagePage")
    var sapSlashmSlashMessagePage: Unit
    
    @JSName("sap/m/MessagePopover")
    var sapSlashmSlashMessagePopover: Unit
    
    @JSName("sap/m/MessagePopoverItem")
    var sapSlashmSlashMessagePopoverItem: Unit
    
    @JSName("sap/m/MessageStrip")
    var sapSlashmSlashMessageStrip: Unit
    
    @JSName("sap/m/MessageToast")
    var sapSlashmSlashMessageToast: Unit
    
    @JSName("sap/m/MessageView")
    var sapSlashmSlashMessageView: Unit
    
    @JSName("sap/m/MultiComboBox")
    var sapSlashmSlashMultiComboBox: Unit
    
    @JSName("sap/m/MultiEditField")
    var sapSlashmSlashMultiEditField: Unit
    
    @JSName("sap/m/MultiInput")
    var sapSlashmSlashMultiInput: Unit
    
    @JSName("sap/m/NavContainer")
    var sapSlashmSlashNavContainer: Unit
    
    @JSName("sap/m/NewsContent")
    var sapSlashmSlashNewsContent: Unit
    
    @JSName("sap/m/NotificationList")
    var sapSlashmSlashNotificationList: Unit
    
    @JSName("sap/m/NotificationListBase")
    var sapSlashmSlashNotificationListBase: Unit
    
    @JSName("sap/m/NotificationListGroup")
    var sapSlashmSlashNotificationListGroup: Unit
    
    @JSName("sap/m/NotificationListItem")
    var sapSlashmSlashNotificationListItem: Unit
    
    @JSName("sap/m/NumericContent")
    var sapSlashmSlashNumericContent: Unit
    
    @JSName("sap/m/ObjectAttribute")
    var sapSlashmSlashObjectAttribute: Unit
    
    @JSName("sap/m/ObjectHeader")
    var sapSlashmSlashObjectHeader: Unit
    
    @JSName("sap/m/ObjectIdentifier")
    var sapSlashmSlashObjectIdentifier: Unit
    
    @JSName("sap/m/ObjectListItem")
    var sapSlashmSlashObjectListItem: Unit
    
    @JSName("sap/m/ObjectMarker")
    var sapSlashmSlashObjectMarker: Unit
    
    @JSName("sap/m/ObjectNumber")
    var sapSlashmSlashObjectNumber: Unit
    
    @JSName("sap/m/ObjectStatus")
    var sapSlashmSlashObjectStatus: Unit
    
    @JSName("sap/m/OverflowToolbar")
    var sapSlashmSlashOverflowToolbar: Unit
    
    @JSName("sap/m/OverflowToolbarButton")
    var sapSlashmSlashOverflowToolbarButton: Unit
    
    @JSName("sap/m/OverflowToolbarLayoutData")
    var sapSlashmSlashOverflowToolbarLayoutData: Unit
    
    @JSName("sap/m/OverflowToolbarMenuButton")
    var sapSlashmSlashOverflowToolbarMenuButton: Unit
    
    @JSName("sap/m/OverflowToolbarToggleButton")
    var sapSlashmSlashOverflowToolbarToggleButton: Unit
    
    @JSName("sap/m/P13nColumnsItem")
    var sapSlashmSlashP13nColumnsItem: Unit
    
    @JSName("sap/m/P13nColumnsPanel")
    var sapSlashmSlashP13nColumnsPanel: Unit
    
    @JSName("sap/m/P13nConditionPanel")
    var sapSlashmSlashP13nConditionPanel: Unit
    
    @JSName("sap/m/P13nDialog")
    var sapSlashmSlashP13nDialog: Unit
    
    @JSName("sap/m/P13nDimMeasureItem")
    var sapSlashmSlashP13nDimMeasureItem: Unit
    
    @JSName("sap/m/P13nDimMeasurePanel")
    var sapSlashmSlashP13nDimMeasurePanel: Unit
    
    @JSName("sap/m/P13nFilterItem")
    var sapSlashmSlashP13nFilterItem: Unit
    
    @JSName("sap/m/P13nFilterPanel")
    var sapSlashmSlashP13nFilterPanel: Unit
    
    @JSName("sap/m/P13nGroupItem")
    var sapSlashmSlashP13nGroupItem: Unit
    
    @JSName("sap/m/P13nGroupPanel")
    var sapSlashmSlashP13nGroupPanel: Unit
    
    @JSName("sap/m/P13nItem")
    var sapSlashmSlashP13nItem: Unit
    
    @JSName("sap/m/P13nOperationsHelper")
    var sapSlashmSlashP13nOperationsHelper: Unit
    
    @JSName("sap/m/P13nPanel")
    var sapSlashmSlashP13nPanel: Unit
    
    @JSName("sap/m/P13nSortItem")
    var sapSlashmSlashP13nSortItem: Unit
    
    @JSName("sap/m/P13nSortPanel")
    var sapSlashmSlashP13nSortPanel: Unit
    
    @JSName("sap/m/PDFViewer")
    var sapSlashmSlashPDFViewer: Unit
    
    @JSName("sap/m/Page")
    var sapSlashmSlashPage: Unit
    
    @JSName("sap/m/PageAccessibleLandmarkInfo")
    var sapSlashmSlashPageAccessibleLandmarkInfo: Unit
    
    @JSName("sap/m/PagingButton")
    var sapSlashmSlashPagingButton: Unit
    
    @JSName("sap/m/Panel")
    var sapSlashmSlashPanel: Unit
    
    @JSName("sap/m/PlanningCalendar")
    var sapSlashmSlashPlanningCalendar: Unit
    
    @JSName("sap/m/PlanningCalendarLegend")
    var sapSlashmSlashPlanningCalendarLegend: Unit
    
    @JSName("sap/m/PlanningCalendarRow")
    var sapSlashmSlashPlanningCalendarRow: Unit
    
    @JSName("sap/m/PlanningCalendarView")
    var sapSlashmSlashPlanningCalendarView: Unit
    
    @JSName("sap/m/Popover")
    var sapSlashmSlashPopover: Unit
    
    @JSName("sap/m/ProgressIndicator")
    var sapSlashmSlashProgressIndicator: Unit
    
    @JSName("sap/m/PullToRefresh")
    var sapSlashmSlashPullToRefresh: Unit
    
    @JSName("sap/m/QuickView")
    var sapSlashmSlashQuickView: Unit
    
    @JSName("sap/m/QuickViewBase")
    var sapSlashmSlashQuickViewBase: Unit
    
    @JSName("sap/m/QuickViewCard")
    var sapSlashmSlashQuickViewCard: Unit
    
    @JSName("sap/m/QuickViewGroup")
    var sapSlashmSlashQuickViewGroup: Unit
    
    @JSName("sap/m/QuickViewGroupElement")
    var sapSlashmSlashQuickViewGroupElement: Unit
    
    @JSName("sap/m/QuickViewPage")
    var sapSlashmSlashQuickViewPage: Unit
    
    @JSName("sap/m/RadioButton")
    var sapSlashmSlashRadioButton: Unit
    
    @JSName("sap/m/RadioButtonGroup")
    var sapSlashmSlashRadioButtonGroup: Unit
    
    @JSName("sap/m/RangeSlider")
    var sapSlashmSlashRangeSlider: Unit
    
    @JSName("sap/m/RatingIndicator")
    var sapSlashmSlashRatingIndicator: Unit
    
    @JSName("sap/m/ResponsivePopover")
    var sapSlashmSlashResponsivePopover: Unit
    
    @JSName("sap/m/ResponsiveScale")
    var sapSlashmSlashResponsiveScale: Unit
    
    @JSName("sap/m/ScrollContainer")
    var sapSlashmSlashScrollContainer: Unit
    
    @JSName("sap/m/SearchField")
    var sapSlashmSlashSearchField: Unit
    
    @JSName("sap/m/SegmentedButton")
    var sapSlashmSlashSegmentedButton: Unit
    
    @JSName("sap/m/SegmentedButtonItem")
    var sapSlashmSlashSegmentedButtonItem: Unit
    
    @JSName("sap/m/Select")
    var sapSlashmSlashSelect: Unit
    
    @JSName("sap/m/SelectDialog")
    var sapSlashmSlashSelectDialog: Unit
    
    @JSName("sap/m/SelectDialogBase")
    var sapSlashmSlashSelectDialogBase: Unit
    
    @JSName("sap/m/SelectList")
    var sapSlashmSlashSelectList: Unit
    
    @JSName("sap/m/SelectionDetails")
    var sapSlashmSlashSelectionDetails: Unit
    
    @JSName("sap/m/SelectionDetailsFacade")
    var sapSlashmSlashSelectionDetailsFacade: Unit
    
    @JSName("sap/m/SelectionDetailsItem")
    var sapSlashmSlashSelectionDetailsItem: Unit
    
    @JSName("sap/m/SelectionDetailsItemLine")
    var sapSlashmSlashSelectionDetailsItemLine: Unit
    
    @JSName("sap/m/Shell")
    var sapSlashmSlashShell: Unit
    
    @JSName("sap/m/SinglePlanningCalendar")
    var sapSlashmSlashSinglePlanningCalendar: Unit
    
    @JSName("sap/m/SinglePlanningCalendarDayView")
    var sapSlashmSlashSinglePlanningCalendarDayView: Unit
    
    @JSName("sap/m/SinglePlanningCalendarMonthView")
    var sapSlashmSlashSinglePlanningCalendarMonthView: Unit
    
    @JSName("sap/m/SinglePlanningCalendarView")
    var sapSlashmSlashSinglePlanningCalendarView: Unit
    
    @JSName("sap/m/SinglePlanningCalendarWeekView")
    var sapSlashmSlashSinglePlanningCalendarWeekView: Unit
    
    @JSName("sap/m/SinglePlanningCalendarWorkWeekView")
    var sapSlashmSlashSinglePlanningCalendarWorkWeekView: Unit
    
    @JSName("sap/m/SlideTile")
    var sapSlashmSlashSlideTile: Unit
    
    @JSName("sap/m/Slider")
    var sapSlashmSlashSlider: Unit
    
    @JSName("sap/m/SliderTooltipBase")
    var sapSlashmSlashSliderTooltipBase: Unit
    
    @JSName("sap/m/SplitApp")
    var sapSlashmSlashSplitApp: Unit
    
    @JSName("sap/m/SplitButton")
    var sapSlashmSlashSplitButton: Unit
    
    @JSName("sap/m/SplitContainer")
    var sapSlashmSlashSplitContainer: Unit
    
    @JSName("sap/m/StandardDynamicDateOption")
    var sapSlashmSlashStandardDynamicDateOption: Unit
    
    @JSName("sap/m/StandardListItem")
    var sapSlashmSlashStandardListItem: Unit
    
    @JSName("sap/m/StandardTile")
    var sapSlashmSlashStandardTile: Unit
    
    @JSName("sap/m/StandardTreeItem")
    var sapSlashmSlashStandardTreeItem: Unit
    
    @JSName("sap/m/StepInput")
    var sapSlashmSlashStepInput: Unit
    
    @JSName("sap/m/SuggestionItem")
    var sapSlashmSlashSuggestionItem: Unit
    
    @JSName("sap/m/Switch")
    var sapSlashmSlashSwitch: Unit
    
    @JSName("sap/m/TabContainer")
    var sapSlashmSlashTabContainer: Unit
    
    @JSName("sap/m/TabContainerItem")
    var sapSlashmSlashTabContainerItem: Unit
    
    @JSName("sap/m/Table")
    var sapSlashmSlashTable: Unit
    
    @JSName("sap/m/TablePersoController")
    var sapSlashmSlashTablePersoController: Unit
    
    @JSName("sap/m/TablePersoDialog")
    var sapSlashmSlashTablePersoDialog: Unit
    
    @JSName("sap/m/TablePersoProvider")
    var sapSlashmSlashTablePersoProvider: Unit
    
    @JSName("sap/m/TableSelectDialog")
    var sapSlashmSlashTableSelectDialog: Unit
    
    @JSName("sap/m/Text")
    var sapSlashmSlashText: Unit
    
    @JSName("sap/m/TextArea")
    var sapSlashmSlashTextArea: Unit
    
    @JSName("sap/m/Tile")
    var sapSlashmSlashTile: Unit
    
    @JSName("sap/m/TileContainer")
    var sapSlashmSlashTileContainer: Unit
    
    @JSName("sap/m/TileContent")
    var sapSlashmSlashTileContent: Unit
    
    @JSName("sap/m/TimePicker")
    var sapSlashmSlashTimePicker: Unit
    
    @JSName("sap/m/TimePickerClocks")
    var sapSlashmSlashTimePickerClocks: Unit
    
    @JSName("sap/m/TimePickerInputs")
    var sapSlashmSlashTimePickerInputs: Unit
    
    @JSName("sap/m/TimePickerSliders")
    var sapSlashmSlashTimePickerSliders: Unit
    
    @JSName("sap/m/Title")
    var sapSlashmSlashTitle: Unit
    
    @JSName("sap/m/ToggleButton")
    var sapSlashmSlashToggleButton: Unit
    
    @JSName("sap/m/Token")
    var sapSlashmSlashToken: Unit
    
    @JSName("sap/m/Tokenizer")
    var sapSlashmSlashTokenizer: Unit
    
    @JSName("sap/m/Toolbar")
    var sapSlashmSlashToolbar: Unit
    
    @JSName("sap/m/ToolbarLayoutData")
    var sapSlashmSlashToolbarLayoutData: Unit
    
    @JSName("sap/m/ToolbarSeparator")
    var sapSlashmSlashToolbarSeparator: Unit
    
    @JSName("sap/m/ToolbarSpacer")
    var sapSlashmSlashToolbarSpacer: Unit
    
    @JSName("sap/m/Tree")
    var sapSlashmSlashTree: Unit
    
    @JSName("sap/m/TreeItemBase")
    var sapSlashmSlashTreeItemBase: Unit
    
    @JSName("sap/m/UploadCollection")
    var sapSlashmSlashUploadCollection: Unit
    
    @JSName("sap/m/UploadCollectionItem")
    var sapSlashmSlashUploadCollectionItem: Unit
    
    @JSName("sap/m/UploadCollectionParameter")
    var sapSlashmSlashUploadCollectionParameter: Unit
    
    @JSName("sap/m/UploadCollectionToolbarPlaceholder")
    var sapSlashmSlashUploadCollectionToolbarPlaceholder: Unit
    
    @JSName("sap/m/VBox")
    var sapSlashmSlashVBox: Unit
    
    @JSName("sap/m/VariantItem")
    var sapSlashmSlashVariantItem: Unit
    
    @JSName("sap/m/VariantManagement")
    var sapSlashmSlashVariantManagement: Unit
    
    @JSName("sap/m/ViewSettingsCustomItem")
    var sapSlashmSlashViewSettingsCustomItem: Unit
    
    @JSName("sap/m/ViewSettingsCustomTab")
    var sapSlashmSlashViewSettingsCustomTab: Unit
    
    @JSName("sap/m/ViewSettingsDialog")
    var sapSlashmSlashViewSettingsDialog: Unit
    
    @JSName("sap/m/ViewSettingsFilterItem")
    var sapSlashmSlashViewSettingsFilterItem: Unit
    
    @JSName("sap/m/ViewSettingsItem")
    var sapSlashmSlashViewSettingsItem: Unit
    
    @JSName("sap/m/WheelSlider")
    var sapSlashmSlashWheelSlider: Unit
    
    @JSName("sap/m/WheelSliderContainer")
    var sapSlashmSlashWheelSliderContainer: Unit
    
    @JSName("sap/m/Wizard")
    var sapSlashmSlashWizard: Unit
    
    @JSName("sap/m/WizardStep")
    var sapSlashmSlashWizardStep: Unit
    
    @JSName("sap/m/library")
    var sapSlashmSlashlibrary: Unit
    
    @JSName("sap/m/p13n/AbstractContainer")
    var sapSlashmSlashp13nSlashAbstractContainer: Unit
    
    @JSName("sap/m/p13n/AbstractContainerItem")
    var sapSlashmSlashp13nSlashAbstractContainerItem: Unit
    
    @JSName("sap/m/p13n/BasePanel")
    var sapSlashmSlashp13nSlashBasePanel: Unit
    
    @JSName("sap/m/p13n/Container")
    var sapSlashmSlashp13nSlashContainer: Unit
    
    @JSName("sap/m/p13n/Engine")
    var sapSlashmSlashp13nSlashEngine: Unit
    
    @JSName("sap/m/p13n/GroupController")
    var sapSlashmSlashp13nSlashGroupController: Unit
    
    @JSName("sap/m/p13n/GroupPanel")
    var sapSlashmSlashp13nSlashGroupPanel: Unit
    
    @JSName("sap/m/p13n/MetadataHelper")
    var sapSlashmSlashp13nSlashMetadataHelper: Unit
    
    @JSName("sap/m/p13n/Popup")
    var sapSlashmSlashp13nSlashPopup: Unit
    
    @JSName("sap/m/p13n/QueryPanel")
    var sapSlashmSlashp13nSlashQueryPanel: Unit
    
    @JSName("sap/m/p13n/SelectionController")
    var sapSlashmSlashp13nSlashSelectionController: Unit
    
    @JSName("sap/m/p13n/SelectionPanel")
    var sapSlashmSlashp13nSlashSelectionPanel: Unit
    
    @JSName("sap/m/p13n/SortController")
    var sapSlashmSlashp13nSlashSortController: Unit
    
    @JSName("sap/m/p13n/SortPanel")
    var sapSlashmSlashp13nSlashSortPanel: Unit
    
    @JSName("sap/m/p13n/enum/PersistenceMode")
    var sapSlashmSlashp13nSlashenumSlashPersistenceMode: Unit
    
    @JSName("sap/m/p13n/enum/ProcessingStrategy")
    var sapSlashmSlashp13nSlashenumSlashProcessingStrategy: Unit
    
    @JSName("sap/m/p13n/modules/AdaptationProvider")
    var sapSlashmSlashp13nSlashmodulesSlashAdaptationProvider: Unit
    
    @JSName("sap/m/plugins/ColumnResizer")
    var sapSlashmSlashpluginsSlashColumnResizer: Unit
    
    @JSName("sap/m/plugins/CopyProvider")
    var sapSlashmSlashpluginsSlashCopyProvider: Unit
    
    @JSName("sap/m/plugins/DataStateIndicator")
    var sapSlashmSlashpluginsSlashDataStateIndicator: Unit
    
    @JSName("sap/m/plugins/PasteProvider")
    var sapSlashmSlashpluginsSlashPasteProvider: Unit
    
    @JSName("sap/m/routing/RouteMatchedHandler")
    var sapSlashmSlashroutingSlashRouteMatchedHandler: Unit
    
    @JSName("sap/m/routing/Router")
    var sapSlashmSlashroutingSlashRouter: Unit
    
    @JSName("sap/m/routing/TargetHandler")
    var sapSlashmSlashroutingSlashTargetHandler: Unit
    
    @JSName("sap/m/routing/Targets")
    var sapSlashmSlashroutingSlashTargets: Unit
    
    @JSName("sap/m/semantic/AddAction")
    var sapSlashmSlashsemanticSlashAddAction: Unit
    
    @JSName("sap/m/semantic/CancelAction")
    var sapSlashmSlashsemanticSlashCancelAction: Unit
    
    @JSName("sap/m/semantic/DeleteAction")
    var sapSlashmSlashsemanticSlashDeleteAction: Unit
    
    @JSName("sap/m/semantic/DetailPage")
    var sapSlashmSlashsemanticSlashDetailPage: Unit
    
    @JSName("sap/m/semantic/DiscussInJamAction")
    var sapSlashmSlashsemanticSlashDiscussInJamAction: Unit
    
    @JSName("sap/m/semantic/EditAction")
    var sapSlashmSlashsemanticSlashEditAction: Unit
    
    @JSName("sap/m/semantic/FavoriteAction")
    var sapSlashmSlashsemanticSlashFavoriteAction: Unit
    
    @JSName("sap/m/semantic/FilterAction")
    var sapSlashmSlashsemanticSlashFilterAction: Unit
    
    @JSName("sap/m/semantic/FilterSelect")
    var sapSlashmSlashsemanticSlashFilterSelect: Unit
    
    @JSName("sap/m/semantic/FlagAction")
    var sapSlashmSlashsemanticSlashFlagAction: Unit
    
    @JSName("sap/m/semantic/ForwardAction")
    var sapSlashmSlashsemanticSlashForwardAction: Unit
    
    @JSName("sap/m/semantic/FullscreenPage")
    var sapSlashmSlashsemanticSlashFullscreenPage: Unit
    
    @JSName("sap/m/semantic/GroupAction")
    var sapSlashmSlashsemanticSlashGroupAction: Unit
    
    @JSName("sap/m/semantic/GroupSelect")
    var sapSlashmSlashsemanticSlashGroupSelect: Unit
    
    @JSName("sap/m/semantic/MainAction")
    var sapSlashmSlashsemanticSlashMainAction: Unit
    
    @JSName("sap/m/semantic/MasterPage")
    var sapSlashmSlashsemanticSlashMasterPage: Unit
    
    @JSName("sap/m/semantic/MessagesIndicator")
    var sapSlashmSlashsemanticSlashMessagesIndicator: Unit
    
    @JSName("sap/m/semantic/MultiSelectAction")
    var sapSlashmSlashsemanticSlashMultiSelectAction: Unit
    
    @JSName("sap/m/semantic/NegativeAction")
    var sapSlashmSlashsemanticSlashNegativeAction: Unit
    
    @JSName("sap/m/semantic/OpenInAction")
    var sapSlashmSlashsemanticSlashOpenInAction: Unit
    
    @JSName("sap/m/semantic/PositiveAction")
    var sapSlashmSlashsemanticSlashPositiveAction: Unit
    
    @JSName("sap/m/semantic/PrintAction")
    var sapSlashmSlashsemanticSlashPrintAction: Unit
    
    @JSName("sap/m/semantic/SaveAction")
    var sapSlashmSlashsemanticSlashSaveAction: Unit
    
    @JSName("sap/m/semantic/SemanticButton")
    var sapSlashmSlashsemanticSlashSemanticButton: Unit
    
    @JSName("sap/m/semantic/SemanticControl")
    var sapSlashmSlashsemanticSlashSemanticControl: Unit
    
    @JSName("sap/m/semantic/SemanticPage")
    var sapSlashmSlashsemanticSlashSemanticPage: Unit
    
    @JSName("sap/m/semantic/SemanticSelect")
    var sapSlashmSlashsemanticSlashSemanticSelect: Unit
    
    @JSName("sap/m/semantic/SemanticToggleButton")
    var sapSlashmSlashsemanticSlashSemanticToggleButton: Unit
    
    @JSName("sap/m/semantic/SendEmailAction")
    var sapSlashmSlashsemanticSlashSendEmailAction: Unit
    
    @JSName("sap/m/semantic/SendMessageAction")
    var sapSlashmSlashsemanticSlashSendMessageAction: Unit
    
    @JSName("sap/m/semantic/ShareInJamAction")
    var sapSlashmSlashsemanticSlashShareInJamAction: Unit
    
    @JSName("sap/m/semantic/ShareMenuPage")
    var sapSlashmSlashsemanticSlashShareMenuPage: Unit
    
    @JSName("sap/m/semantic/SortAction")
    var sapSlashmSlashsemanticSlashSortAction: Unit
    
    @JSName("sap/m/semantic/SortSelect")
    var sapSlashmSlashsemanticSlashSortSelect: Unit
    
    @JSName("sap/m/table/Util")
    var sapSlashmSlashtableSlashUtil: Unit
    
    @JSName("sap/m/table/columnmenu/ActionItem")
    var sapSlashmSlashtableSlashcolumnmenuSlashActionItem: Unit
    
    @JSName("sap/m/table/columnmenu/Entry")
    var sapSlashmSlashtableSlashcolumnmenuSlashEntry: Unit
    
    @JSName("sap/m/table/columnmenu/Item")
    var sapSlashmSlashtableSlashcolumnmenuSlashItem: Unit
    
    @JSName("sap/m/table/columnmenu/ItemBase")
    var sapSlashmSlashtableSlashcolumnmenuSlashItemBase: Unit
    
    @JSName("sap/m/table/columnmenu/Menu")
    var sapSlashmSlashtableSlashcolumnmenuSlashMenu: Unit
    
    @JSName("sap/m/table/columnmenu/QuickAction")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickAction: Unit
    
    @JSName("sap/m/table/columnmenu/QuickActionBase")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickActionBase: Unit
    
    @JSName("sap/m/table/columnmenu/QuickActionItem")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickActionItem: Unit
    
    @JSName("sap/m/table/columnmenu/QuickGroup")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickGroup: Unit
    
    @JSName("sap/m/table/columnmenu/QuickGroupItem")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickGroupItem: Unit
    
    @JSName("sap/m/table/columnmenu/QuickSort")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickSort: Unit
    
    @JSName("sap/m/table/columnmenu/QuickSortItem")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickSortItem: Unit
    
    @JSName("sap/m/table/columnmenu/QuickTotal")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickTotal: Unit
    
    @JSName("sap/m/table/columnmenu/QuickTotalItem")
    var sapSlashmSlashtableSlashcolumnmenuSlashQuickTotalItem: Unit
    
    @JSName("sap/m/upload/UploadSet")
    var sapSlashmSlashuploadSlashUploadSet: Unit
    
    @JSName("sap/m/upload/UploadSetItem")
    var sapSlashmSlashuploadSlashUploadSetItem: Unit
    
    @JSName("sap/m/upload/UploadSetToolbarPlaceholder")
    var sapSlashmSlashuploadSlashUploadSetToolbarPlaceholder: Unit
    
    @JSName("sap/m/upload/Uploader")
    var sapSlashmSlashuploadSlashUploader: Unit
    
    @JSName("sap/m/upload/UploaderHttpRequestMethod")
    var sapSlashmSlashuploadSlashUploaderHttpRequestMethod: Unit
    
    @JSName("sap/tnt/InfoLabel")
    var sapSlashtntSlashInfoLabel: Unit
    
    @JSName("sap/tnt/NavigationList")
    var sapSlashtntSlashNavigationList: Unit
    
    @JSName("sap/tnt/NavigationListItem")
    var sapSlashtntSlashNavigationListItem: Unit
    
    @JSName("sap/tnt/SideNavigation")
    var sapSlashtntSlashSideNavigation: Unit
    
    @JSName("sap/tnt/ToolHeader")
    var sapSlashtntSlashToolHeader: Unit
    
    @JSName("sap/tnt/ToolHeaderUtilitySeparator")
    var sapSlashtntSlashToolHeaderUtilitySeparator: Unit
    
    @JSName("sap/tnt/ToolPage")
    var sapSlashtntSlashToolPage: Unit
    
    @JSName("sap/tnt/library")
    var sapSlashtntSlashlibrary: Unit
    
    @JSName("sap/ui/Device")
    var sapSlashuiSlashDevice: Unit
    
    @JSName("sap/ui/VersionInfo")
    var sapSlashuiSlashVersionInfo: Unit
    
    @JSName("sap/ui/app/Application")
    var sapSlashuiSlashappSlashApplication: Unit
    
    @JSName("sap/ui/app/MockServer")
    var sapSlashuiSlashappSlashMockServer: Unit
    
    @JSName("sap/ui/base/BindingInfo")
    var sapSlashuiSlashbaseSlashBindingInfo: Unit
    
    @JSName("sap/ui/base/DataType")
    var sapSlashuiSlashbaseSlashDataType: Unit
    
    @JSName("sap/ui/base/Event")
    var sapSlashuiSlashbaseSlashEvent: Unit
    
    @JSName("sap/ui/base/EventProvider")
    var sapSlashuiSlashbaseSlashEventProvider: Unit
    
    @JSName("sap/ui/base/Interface")
    var sapSlashuiSlashbaseSlashInterface: Unit
    
    @JSName("sap/ui/base/ManagedObject")
    var sapSlashuiSlashbaseSlashManagedObject: Unit
    
    @JSName("sap/ui/base/ManagedObjectMetadata")
    var sapSlashuiSlashbaseSlashManagedObjectMetadata: Unit
    
    @JSName("sap/ui/base/ManagedObjectObserver")
    var sapSlashuiSlashbaseSlashManagedObjectObserver: Unit
    
    @JSName("sap/ui/base/Metadata")
    var sapSlashuiSlashbaseSlashMetadata: Unit
    
    @JSName("sap/ui/base/Object")
    var sapSlashuiSlashbaseSlashObject: Unit
    
    @JSName("sap/ui/base/ObjectPool")
    var sapSlashuiSlashbaseSlashObjectPool: Unit
    
    @JSName("sap/ui/base/SyncPromise")
    var sapSlashuiSlashbaseSlashSyncPromise: Unit
    
    @JSName("sap/ui/codeeditor/CodeEditor")
    var sapSlashuiSlashcodeeditorSlashCodeEditor: Unit
    
    @JSName("sap/ui/codeeditor/library")
    var sapSlashuiSlashcodeeditorSlashlibrary: Unit
    
    @JSName("sap/ui/commons/Accordion")
    var sapSlashuiSlashcommonsSlashAccordion: Unit
    
    @JSName("sap/ui/commons/AccordionSection")
    var sapSlashuiSlashcommonsSlashAccordionSection: Unit
    
    @JSName("sap/ui/commons/ApplicationHeader")
    var sapSlashuiSlashcommonsSlashApplicationHeader: Unit
    
    @JSName("sap/ui/commons/Area")
    var sapSlashuiSlashcommonsSlashArea: Unit
    
    @JSName("sap/ui/commons/AutoComplete")
    var sapSlashuiSlashcommonsSlashAutoComplete: Unit
    
    @JSName("sap/ui/commons/Button")
    var sapSlashuiSlashcommonsSlashButton: Unit
    
    @JSName("sap/ui/commons/Callout")
    var sapSlashuiSlashcommonsSlashCallout: Unit
    
    @JSName("sap/ui/commons/CalloutBase")
    var sapSlashuiSlashcommonsSlashCalloutBase: Unit
    
    @JSName("sap/ui/commons/Carousel")
    var sapSlashuiSlashcommonsSlashCarousel: Unit
    
    @JSName("sap/ui/commons/CheckBox")
    var sapSlashuiSlashcommonsSlashCheckBox: Unit
    
    @JSName("sap/ui/commons/ColorPicker")
    var sapSlashuiSlashcommonsSlashColorPicker: Unit
    
    @JSName("sap/ui/commons/ComboBox")
    var sapSlashuiSlashcommonsSlashComboBox: Unit
    
    @JSName("sap/ui/commons/DatePicker")
    var sapSlashuiSlashcommonsSlashDatePicker: Unit
    
    @JSName("sap/ui/commons/Dialog")
    var sapSlashuiSlashcommonsSlashDialog: Unit
    
    @JSName("sap/ui/commons/DropdownBox")
    var sapSlashuiSlashcommonsSlashDropdownBox: Unit
    
    @JSName("sap/ui/commons/FileUploader")
    var sapSlashuiSlashcommonsSlashFileUploader: Unit
    
    @JSName("sap/ui/commons/FileUploaderParameter")
    var sapSlashuiSlashcommonsSlashFileUploaderParameter: Unit
    
    @JSName("sap/ui/commons/FormattedTextView")
    var sapSlashuiSlashcommonsSlashFormattedTextView: Unit
    
    @JSName("sap/ui/commons/HorizontalDivider")
    var sapSlashuiSlashcommonsSlashHorizontalDivider: Unit
    
    @JSName("sap/ui/commons/Image")
    var sapSlashuiSlashcommonsSlashImage: Unit
    
    @JSName("sap/ui/commons/ImageMap")
    var sapSlashuiSlashcommonsSlashImageMap: Unit
    
    @JSName("sap/ui/commons/InPlaceEdit")
    var sapSlashuiSlashcommonsSlashInPlaceEdit: Unit
    
    @JSName("sap/ui/commons/Label")
    var sapSlashuiSlashcommonsSlashLabel: Unit
    
    @JSName("sap/ui/commons/Link")
    var sapSlashuiSlashcommonsSlashLink: Unit
    
    @JSName("sap/ui/commons/ListBox")
    var sapSlashuiSlashcommonsSlashListBox: Unit
    
    @JSName("sap/ui/commons/Menu")
    var sapSlashuiSlashcommonsSlashMenu: Unit
    
    @JSName("sap/ui/commons/MenuBar")
    var sapSlashuiSlashcommonsSlashMenuBar: Unit
    
    @JSName("sap/ui/commons/MenuButton")
    var sapSlashuiSlashcommonsSlashMenuButton: Unit
    
    @JSName("sap/ui/commons/MenuItem")
    var sapSlashuiSlashcommonsSlashMenuItem: Unit
    
    @JSName("sap/ui/commons/MenuItemBase")
    var sapSlashuiSlashcommonsSlashMenuItemBase: Unit
    
    @JSName("sap/ui/commons/MenuTextFieldItem")
    var sapSlashuiSlashcommonsSlashMenuTextFieldItem: Unit
    
    @JSName("sap/ui/commons/Message")
    var sapSlashuiSlashcommonsSlashMessage: Unit
    
    @JSName("sap/ui/commons/MessageBar")
    var sapSlashuiSlashcommonsSlashMessageBar: Unit
    
    @JSName("sap/ui/commons/MessageBox")
    var sapSlashuiSlashcommonsSlashMessageBox: Unit
    
    @JSName("sap/ui/commons/MessageList")
    var sapSlashuiSlashcommonsSlashMessageList: Unit
    
    @JSName("sap/ui/commons/MessageToast")
    var sapSlashuiSlashcommonsSlashMessageToast: Unit
    
    @JSName("sap/ui/commons/Paginator")
    var sapSlashuiSlashcommonsSlashPaginator: Unit
    
    @JSName("sap/ui/commons/Panel")
    var sapSlashuiSlashcommonsSlashPanel: Unit
    
    @JSName("sap/ui/commons/PasswordField")
    var sapSlashuiSlashcommonsSlashPasswordField: Unit
    
    @JSName("sap/ui/commons/ProgressIndicator")
    var sapSlashuiSlashcommonsSlashProgressIndicator: Unit
    
    @JSName("sap/ui/commons/RadioButton")
    var sapSlashuiSlashcommonsSlashRadioButton: Unit
    
    @JSName("sap/ui/commons/RadioButtonGroup")
    var sapSlashuiSlashcommonsSlashRadioButtonGroup: Unit
    
    @JSName("sap/ui/commons/RangeSlider")
    var sapSlashuiSlashcommonsSlashRangeSlider: Unit
    
    @JSName("sap/ui/commons/RatingIndicator")
    var sapSlashuiSlashcommonsSlashRatingIndicator: Unit
    
    @JSName("sap/ui/commons/ResponsiveContainer")
    var sapSlashuiSlashcommonsSlashResponsiveContainer: Unit
    
    @JSName("sap/ui/commons/ResponsiveContainerRange")
    var sapSlashuiSlashcommonsSlashResponsiveContainerRange: Unit
    
    @JSName("sap/ui/commons/RichTooltip")
    var sapSlashuiSlashcommonsSlashRichTooltip: Unit
    
    @JSName("sap/ui/commons/RoadMap")
    var sapSlashuiSlashcommonsSlashRoadMap: Unit
    
    @JSName("sap/ui/commons/RoadMapStep")
    var sapSlashuiSlashcommonsSlashRoadMapStep: Unit
    
    @JSName("sap/ui/commons/RowRepeater")
    var sapSlashuiSlashcommonsSlashRowRepeater: Unit
    
    @JSName("sap/ui/commons/RowRepeaterFilter")
    var sapSlashuiSlashcommonsSlashRowRepeaterFilter: Unit
    
    @JSName("sap/ui/commons/RowRepeaterSorter")
    var sapSlashuiSlashcommonsSlashRowRepeaterSorter: Unit
    
    @JSName("sap/ui/commons/SearchField")
    var sapSlashuiSlashcommonsSlashSearchField: Unit
    
    @JSName("sap/ui/commons/SearchProvider")
    var sapSlashuiSlashcommonsSlashSearchProvider: Unit
    
    @JSName("sap/ui/commons/SegmentedButton")
    var sapSlashuiSlashcommonsSlashSegmentedButton: Unit
    
    @JSName("sap/ui/commons/Slider")
    var sapSlashuiSlashcommonsSlashSlider: Unit
    
    @JSName("sap/ui/commons/Splitter")
    var sapSlashuiSlashcommonsSlashSplitter: Unit
    
    @JSName("sap/ui/commons/Tab")
    var sapSlashuiSlashcommonsSlashTab: Unit
    
    @JSName("sap/ui/commons/TabStrip")
    var sapSlashuiSlashcommonsSlashTabStrip: Unit
    
    @JSName("sap/ui/commons/TextArea")
    var sapSlashuiSlashcommonsSlashTextArea: Unit
    
    @JSName("sap/ui/commons/TextField")
    var sapSlashuiSlashcommonsSlashTextField: Unit
    
    @JSName("sap/ui/commons/TextView")
    var sapSlashuiSlashcommonsSlashTextView: Unit
    
    @JSName("sap/ui/commons/Title")
    var sapSlashuiSlashcommonsSlashTitle: Unit
    
    @JSName("sap/ui/commons/ToggleButton")
    var sapSlashuiSlashcommonsSlashToggleButton: Unit
    
    @JSName("sap/ui/commons/Toolbar")
    var sapSlashuiSlashcommonsSlashToolbar: Unit
    
    @JSName("sap/ui/commons/ToolbarSeparator")
    var sapSlashuiSlashcommonsSlashToolbarSeparator: Unit
    
    @JSName("sap/ui/commons/Tree")
    var sapSlashuiSlashcommonsSlashTree: Unit
    
    @JSName("sap/ui/commons/TreeNode")
    var sapSlashuiSlashcommonsSlashTreeNode: Unit
    
    @JSName("sap/ui/commons/TriStateCheckBox")
    var sapSlashuiSlashcommonsSlashTriStateCheckBox: Unit
    
    @JSName("sap/ui/commons/ValueHelpField")
    var sapSlashuiSlashcommonsSlashValueHelpField: Unit
    
    @JSName("sap/ui/commons/form/Form")
    var sapSlashuiSlashcommonsSlashformSlashForm: Unit
    
    @JSName("sap/ui/commons/form/FormContainer")
    var sapSlashuiSlashcommonsSlashformSlashFormContainer: Unit
    
    @JSName("sap/ui/commons/form/FormElement")
    var sapSlashuiSlashcommonsSlashformSlashFormElement: Unit
    
    @JSName("sap/ui/commons/form/FormLayout")
    var sapSlashuiSlashcommonsSlashformSlashFormLayout: Unit
    
    @JSName("sap/ui/commons/form/GridContainerData")
    var sapSlashuiSlashcommonsSlashformSlashGridContainerData: Unit
    
    @JSName("sap/ui/commons/form/GridElementData")
    var sapSlashuiSlashcommonsSlashformSlashGridElementData: Unit
    
    @JSName("sap/ui/commons/form/GridLayout")
    var sapSlashuiSlashcommonsSlashformSlashGridLayout: Unit
    
    @JSName("sap/ui/commons/form/ResponsiveLayout")
    var sapSlashuiSlashcommonsSlashformSlashResponsiveLayout: Unit
    
    @JSName("sap/ui/commons/form/SimpleForm")
    var sapSlashuiSlashcommonsSlashformSlashSimpleForm: Unit
    
    @JSName("sap/ui/commons/layout/AbsoluteLayout")
    var sapSlashuiSlashcommonsSlashlayoutSlashAbsoluteLayout: Unit
    
    @JSName("sap/ui/commons/layout/BorderLayout")
    var sapSlashuiSlashcommonsSlashlayoutSlashBorderLayout: Unit
    
    @JSName("sap/ui/commons/layout/BorderLayoutArea")
    var sapSlashuiSlashcommonsSlashlayoutSlashBorderLayoutArea: Unit
    
    @JSName("sap/ui/commons/layout/HorizontalLayout")
    var sapSlashuiSlashcommonsSlashlayoutSlashHorizontalLayout: Unit
    
    @JSName("sap/ui/commons/layout/MatrixLayout")
    var sapSlashuiSlashcommonsSlashlayoutSlashMatrixLayout: Unit
    
    @JSName("sap/ui/commons/layout/MatrixLayoutCell")
    var sapSlashuiSlashcommonsSlashlayoutSlashMatrixLayoutCell: Unit
    
    @JSName("sap/ui/commons/layout/MatrixLayoutRow")
    var sapSlashuiSlashcommonsSlashlayoutSlashMatrixLayoutRow: Unit
    
    @JSName("sap/ui/commons/layout/PositionContainer")
    var sapSlashuiSlashcommonsSlashlayoutSlashPositionContainer: Unit
    
    @JSName("sap/ui/commons/layout/ResponsiveFlowLayout")
    var sapSlashuiSlashcommonsSlashlayoutSlashResponsiveFlowLayout: Unit
    
    @JSName("sap/ui/commons/layout/ResponsiveFlowLayoutData")
    var sapSlashuiSlashcommonsSlashlayoutSlashResponsiveFlowLayoutData: Unit
    
    @JSName("sap/ui/commons/layout/VerticalLayout")
    var sapSlashuiSlashcommonsSlashlayoutSlashVerticalLayout: Unit
    
    @JSName("sap/ui/commons/library")
    var sapSlashuiSlashcommonsSlashlibrary: Unit
    
    @JSName("sap/ui/core/AppCacheBuster")
    var sapSlashuiSlashcoreSlashAppCacheBuster: Unit
    
    @JSName("sap/ui/core/BusyIndicator")
    var sapSlashuiSlashcoreSlashBusyIndicator: Unit
    
    @JSName("sap/ui/core/BusyIndicatorUtils")
    var sapSlashuiSlashcoreSlashBusyIndicatorUtils: Unit
    
    @JSName("sap/ui/core/CalendarType")
    var sapSlashuiSlashcoreSlashCalendarType: Unit
    
    @JSName("sap/ui/core/CommandExecution")
    var sapSlashuiSlashcoreSlashCommandExecution: Unit
    
    @JSName("sap/ui/core/Component")
    var sapSlashuiSlashcoreSlashComponent: Unit
    
    @JSName("sap/ui/core/ComponentContainer")
    var sapSlashuiSlashcoreSlashComponentContainer: Unit
    
    @JSName("sap/ui/core/ComponentMetadata")
    var sapSlashuiSlashcoreSlashComponentMetadata: Unit
    
    @JSName("sap/ui/core/ComponentSupport")
    var sapSlashuiSlashcoreSlashComponentSupport: Unit
    
    @JSName("sap/ui/core/Configuration")
    var sapSlashuiSlashcoreSlashConfiguration: Unit
    
    @JSName("sap/ui/core/Control")
    var sapSlashuiSlashcoreSlashControl: Unit
    
    @JSName("sap/ui/core/Core")
    var sapSlashuiSlashcoreSlashCore: Unit
    
    @JSName("sap/ui/core/CustomData")
    var sapSlashuiSlashcoreSlashCustomData: Unit
    
    @JSName("sap/ui/core/DeclarativeSupport")
    var sapSlashuiSlashcoreSlashDeclarativeSupport: Unit
    
    @JSName("sap/ui/core/Element")
    var sapSlashuiSlashcoreSlashElement: Unit
    
    @JSName("sap/ui/core/ElementMetadata")
    var sapSlashuiSlashcoreSlashElementMetadata: Unit
    
    @JSName("sap/ui/core/EnabledPropagator")
    var sapSlashuiSlashcoreSlashEnabledPropagator: Unit
    
    @JSName("sap/ui/core/EventBus")
    var sapSlashuiSlashcoreSlashEventBus: Unit
    
    @JSName("sap/ui/core/ExtensionPoint")
    var sapSlashuiSlashcoreSlashExtensionPoint: Unit
    
    @JSName("sap/ui/core/Fragment")
    var sapSlashuiSlashcoreSlashFragment: Unit
    
    @JSName("sap/ui/core/HTML")
    var sapSlashuiSlashcoreSlashHTML: Unit
    
    @JSName("sap/ui/core/History")
    var sapSlashuiSlashcoreSlashHistory: Unit
    
    @JSName("sap/ui/core/Icon")
    var sapSlashuiSlashcoreSlashIcon: Unit
    
    @JSName("sap/ui/core/IconPool")
    var sapSlashuiSlashcoreSlashIconPool: Unit
    
    @JSName("sap/ui/core/IndicationColorSupport")
    var sapSlashuiSlashcoreSlashIndicationColorSupport: Unit
    
    @JSName("sap/ui/core/IntervalTrigger")
    var sapSlashuiSlashcoreSlashIntervalTrigger: Unit
    
    @JSName("sap/ui/core/InvisibleMessage")
    var sapSlashuiSlashcoreSlashInvisibleMessage: Unit
    
    @JSName("sap/ui/core/InvisibleRenderer")
    var sapSlashuiSlashcoreSlashInvisibleRenderer: Unit
    
    @JSName("sap/ui/core/InvisibleText")
    var sapSlashuiSlashcoreSlashInvisibleText: Unit
    
    @JSName("sap/ui/core/Item")
    var sapSlashuiSlashcoreSlashItem: Unit
    
    @JSName("sap/ui/core/LabelEnablement")
    var sapSlashuiSlashcoreSlashLabelEnablement: Unit
    
    @JSName("sap/ui/core/LayoutData")
    var sapSlashuiSlashcoreSlashLayoutData: Unit
    
    @JSName("sap/ui/core/ListItem")
    var sapSlashuiSlashcoreSlashListItem: Unit
    
    @JSName("sap/ui/core/LocalBusyIndicator")
    var sapSlashuiSlashcoreSlashLocalBusyIndicator: Unit
    
    @JSName("sap/ui/core/Locale")
    var sapSlashuiSlashcoreSlashLocale: Unit
    
    @JSName("sap/ui/core/LocaleData")
    var sapSlashuiSlashcoreSlashLocaleData: Unit
    
    @JSName("sap/ui/core/Manifest")
    var sapSlashuiSlashcoreSlashManifest: Unit
    
    @JSName("sap/ui/core/Message")
    var sapSlashuiSlashcoreSlashMessage: Unit
    
    @JSName("sap/ui/core/Patcher")
    var sapSlashuiSlashcoreSlashPatcher: Unit
    
    @JSName("sap/ui/core/Placeholder")
    var sapSlashuiSlashcoreSlashPlaceholder: Unit
    
    @JSName("sap/ui/core/Popup")
    var sapSlashuiSlashcoreSlashPopup: Unit
    
    @JSName("sap/ui/core/RenderManager")
    var sapSlashuiSlashcoreSlashRenderManager: Unit
    
    @JSName("sap/ui/core/Renderer")
    var sapSlashuiSlashcoreSlashRenderer: Unit
    
    @JSName("sap/ui/core/ResizeHandler")
    var sapSlashuiSlashcoreSlashResizeHandler: Unit
    
    @JSName("sap/ui/core/ScrollBar")
    var sapSlashuiSlashcoreSlashScrollBar: Unit
    
    @JSName("sap/ui/core/SeparatorItem")
    var sapSlashuiSlashcoreSlashSeparatorItem: Unit
    
    @JSName("sap/ui/core/Title")
    var sapSlashuiSlashcoreSlashTitle: Unit
    
    @JSName("sap/ui/core/TooltipBase")
    var sapSlashuiSlashcoreSlashTooltipBase: Unit
    
    @JSName("sap/ui/core/UIArea")
    var sapSlashuiSlashcoreSlashUIArea: Unit
    
    @JSName("sap/ui/core/UIComponent")
    var sapSlashuiSlashcoreSlashUIComponent: Unit
    
    @JSName("sap/ui/core/ValueStateSupport")
    var sapSlashuiSlashcoreSlashValueStateSupport: Unit
    
    @JSName("sap/ui/core/VariantLayoutData")
    var sapSlashuiSlashcoreSlashVariantLayoutData: Unit
    
    @JSName("sap/ui/core/XMLComposite")
    var sapSlashuiSlashcoreSlashXMLComposite: Unit
    
    @JSName("sap/ui/core/_UrlResolver")
    var sapSlashuiSlashcoreSlash_UrlResolver: Unit
    
    @JSName("sap/ui/core/cache/CacheManager")
    var sapSlashuiSlashcoreSlashcacheSlashCacheManager: Unit
    
    @JSName("sap/ui/core/cache/LRUPersistentCache")
    var sapSlashuiSlashcoreSlashcacheSlashLRUPersistentCache: Unit
    
    @JSName("sap/ui/core/date/CalendarUtils")
    var sapSlashuiSlashcoreSlashdateSlashCalendarUtils: Unit
    
    @JSName("sap/ui/core/date/CalendarWeekNumbering")
    var sapSlashuiSlashcoreSlashdateSlashCalendarWeekNumbering: Unit
    
    @JSName("sap/ui/core/date/UI5Date")
    var sapSlashuiSlashcoreSlashdateSlashUI5Date: Unit
    
    @JSName("sap/ui/core/date/UniversalDate")
    var sapSlashuiSlashcoreSlashdateSlashUniversalDate: Unit
    
    @JSName("sap/ui/core/date/UniversalDateUtils")
    var sapSlashuiSlashcoreSlashdateSlashUniversalDateUtils: Unit
    
    @JSName("sap/ui/core/delegate/ItemNavigation")
    var sapSlashuiSlashcoreSlashdelegateSlashItemNavigation: Unit
    
    @JSName("sap/ui/core/delegate/ScrollEnablement")
    var sapSlashuiSlashcoreSlashdelegateSlashScrollEnablement: Unit
    
    @JSName("sap/ui/core/dnd/DragAndDrop")
    var sapSlashuiSlashcoreSlashdndSlashDragAndDrop: Unit
    
    @JSName("sap/ui/core/dnd/DragDropBase")
    var sapSlashuiSlashcoreSlashdndSlashDragDropBase: Unit
    
    @JSName("sap/ui/core/dnd/DragDropInfo")
    var sapSlashuiSlashcoreSlashdndSlashDragDropInfo: Unit
    
    @JSName("sap/ui/core/dnd/DragInfo")
    var sapSlashuiSlashcoreSlashdndSlashDragInfo: Unit
    
    @JSName("sap/ui/core/dnd/DropInfo")
    var sapSlashuiSlashcoreSlashdndSlashDropInfo: Unit
    
    @JSName("sap/ui/core/format/DateFormat")
    var sapSlashuiSlashcoreSlashformatSlashDateFormat: Unit
    
    @JSName("sap/ui/core/format/DateFormatTimezoneDisplay")
    var sapSlashuiSlashcoreSlashformatSlashDateFormatTimezoneDisplay: Unit
    
    @JSName("sap/ui/core/format/FileSizeFormat")
    var sapSlashuiSlashcoreSlashformatSlashFileSizeFormat: Unit
    
    @JSName("sap/ui/core/format/ListFormat")
    var sapSlashuiSlashcoreSlashformatSlashListFormat: Unit
    
    @JSName("sap/ui/core/format/NumberFormat")
    var sapSlashuiSlashcoreSlashformatSlashNumberFormat: Unit
    
    @JSName("sap/ui/core/format/TimezoneUtil")
    var sapSlashuiSlashcoreSlashformatSlashTimezoneUtil: Unit
    
    @JSName("sap/ui/core/hyphenation/Hyphenation")
    var sapSlashuiSlashcoreSlashhyphenationSlashHyphenation: Unit
    
    @JSName("sap/ui/core/library")
    var sapSlashuiSlashcoreSlashlibrary: Unit
    
    @JSName("sap/ui/core/message/ControlMessageProcessor")
    var sapSlashuiSlashcoreSlashmessageSlashControlMessageProcessor: Unit
    
    @JSName("sap/ui/core/message/Message")
    var sapSlashuiSlashcoreSlashmessageSlashMessage: Unit
    
    @JSName("sap/ui/core/message/MessageManager")
    var sapSlashuiSlashcoreSlashmessageSlashMessageManager: Unit
    
    @JSName("sap/ui/core/message/MessageParser")
    var sapSlashuiSlashcoreSlashmessageSlashMessageParser: Unit
    
    @JSName("sap/ui/core/message/MessageProcessor")
    var sapSlashuiSlashcoreSlashmessageSlashMessageProcessor: Unit
    
    @JSName("sap/ui/core/mvc/Controller")
    var sapSlashuiSlashcoreSlashmvcSlashController: Unit
    
    @JSName("sap/ui/core/mvc/ControllerExtension")
    var sapSlashuiSlashcoreSlashmvcSlashControllerExtension: Unit
    
    @JSName("sap/ui/core/mvc/ControllerExtensionProvider")
    var sapSlashuiSlashcoreSlashmvcSlashControllerExtensionProvider: Unit
    
    @JSName("sap/ui/core/mvc/HTMLView")
    var sapSlashuiSlashcoreSlashmvcSlashHTMLView: Unit
    
    @JSName("sap/ui/core/mvc/JSONView")
    var sapSlashuiSlashcoreSlashmvcSlashJSONView: Unit
    
    @JSName("sap/ui/core/mvc/JSView")
    var sapSlashuiSlashcoreSlashmvcSlashJSView: Unit
    
    @JSName("sap/ui/core/mvc/OverrideExecution")
    var sapSlashuiSlashcoreSlashmvcSlashOverrideExecution: Unit
    
    @JSName("sap/ui/core/mvc/TemplateView")
    var sapSlashuiSlashcoreSlashmvcSlashTemplateView: Unit
    
    @JSName("sap/ui/core/mvc/View")
    var sapSlashuiSlashcoreSlashmvcSlashView: Unit
    
    @JSName("sap/ui/core/mvc/ViewType")
    var sapSlashuiSlashcoreSlashmvcSlashViewType: Unit
    
    @JSName("sap/ui/core/mvc/XMLView")
    var sapSlashuiSlashcoreSlashmvcSlashXMLView: Unit
    
    @JSName("sap/ui/core/postmessage/Bus")
    var sapSlashuiSlashcoreSlashpostmessageSlashBus: Unit
    
    @JSName("sap/ui/core/routing/HashChanger")
    var sapSlashuiSlashcoreSlashroutingSlashHashChanger: Unit
    
    @JSName("sap/ui/core/routing/HashChangerBase")
    var sapSlashuiSlashcoreSlashroutingSlashHashChangerBase: Unit
    
    @JSName("sap/ui/core/routing/History")
    var sapSlashuiSlashcoreSlashroutingSlashHistory: Unit
    
    @JSName("sap/ui/core/routing/Route")
    var sapSlashuiSlashcoreSlashroutingSlashRoute: Unit
    
    @JSName("sap/ui/core/routing/Router")
    var sapSlashuiSlashcoreSlashroutingSlashRouter: Unit
    
    @JSName("sap/ui/core/routing/RouterHashChanger")
    var sapSlashuiSlashcoreSlashroutingSlashRouterHashChanger: Unit
    
    @JSName("sap/ui/core/routing/Target")
    var sapSlashuiSlashcoreSlashroutingSlashTarget: Unit
    
    @JSName("sap/ui/core/routing/Targets")
    var sapSlashuiSlashcoreSlashroutingSlashTargets: Unit
    
    @JSName("sap/ui/core/routing/Views")
    var sapSlashuiSlashcoreSlashroutingSlashViews: Unit
    
    @JSName("sap/ui/core/search/OpenSearchProvider")
    var sapSlashuiSlashcoreSlashsearchSlashOpenSearchProvider: Unit
    
    @JSName("sap/ui/core/search/SearchProvider")
    var sapSlashuiSlashcoreSlashsearchSlashSearchProvider: Unit
    
    @JSName("sap/ui/core/service/Service")
    var sapSlashuiSlashcoreSlashserviceSlashService: Unit
    
    @JSName("sap/ui/core/service/ServiceFactory")
    var sapSlashuiSlashcoreSlashserviceSlashServiceFactory: Unit
    
    @JSName("sap/ui/core/support/Hotkeys")
    var sapSlashuiSlashcoreSlashsupportSlashHotkeys: Unit
    
    @JSName("sap/ui/core/support/Plugin")
    var sapSlashuiSlashcoreSlashsupportSlashPlugin: Unit
    
    @JSName("sap/ui/core/support/RuleEngineOpaExtension")
    var sapSlashuiSlashcoreSlashsupportSlashRuleEngineOpaExtension: Unit
    
    @JSName("sap/ui/core/support/usage/EventBroadcaster")
    var sapSlashuiSlashcoreSlashsupportSlashusageSlashEventBroadcaster: Unit
    
    @JSName("sap/ui/core/syncStyleClass")
    var sapSlashuiSlashcoreSlashsyncStyleClass: Unit
    
    @JSName("sap/ui/core/theming/Parameters")
    var sapSlashuiSlashcoreSlashthemingSlashParameters: Unit
    
    @JSName("sap/ui/core/theming/ThemeHelper")
    var sapSlashuiSlashcoreSlashthemingSlashThemeHelper: Unit
    
    @JSName("sap/ui/core/tmpl/DOMAttribute")
    var sapSlashuiSlashcoreSlashtmplSlashDOMAttribute: Unit
    
    @JSName("sap/ui/core/tmpl/DOMElement")
    var sapSlashuiSlashcoreSlashtmplSlashDOMElement: Unit
    
    @JSName("sap/ui/core/tmpl/HandlebarsTemplate")
    var sapSlashuiSlashcoreSlashtmplSlashHandlebarsTemplate: Unit
    
    @JSName("sap/ui/core/tmpl/Template")
    var sapSlashuiSlashcoreSlashtmplSlashTemplate: Unit
    
    @JSName("sap/ui/core/tmpl/TemplateControl")
    var sapSlashuiSlashcoreSlashtmplSlashTemplateControl: Unit
    
    @JSName("sap/ui/core/util/Export")
    var sapSlashuiSlashcoreSlashutilSlashExport: Unit
    
    @JSName("sap/ui/core/util/ExportCell")
    var sapSlashuiSlashcoreSlashutilSlashExportCell: Unit
    
    @JSName("sap/ui/core/util/ExportColumn")
    var sapSlashuiSlashcoreSlashutilSlashExportColumn: Unit
    
    @JSName("sap/ui/core/util/ExportRow")
    var sapSlashuiSlashcoreSlashutilSlashExportRow: Unit
    
    @JSName("sap/ui/core/util/ExportType")
    var sapSlashuiSlashcoreSlashutilSlashExportType: Unit
    
    @JSName("sap/ui/core/util/ExportTypeCSV")
    var sapSlashuiSlashcoreSlashutilSlashExportTypeCSV: Unit
    
    @JSName("sap/ui/core/util/File")
    var sapSlashuiSlashcoreSlashutilSlashFile: Unit
    
    @JSName("sap/ui/core/util/MockServer")
    var sapSlashuiSlashcoreSlashutilSlashMockServer: Unit
    
    @JSName("sap/ui/core/util/PasteHelper")
    var sapSlashuiSlashcoreSlashutilSlashPasteHelper: Unit
    
    @JSName("sap/ui/core/util/XMLPreprocessor")
    var sapSlashuiSlashcoreSlashutilSlashXMLPreprocessor: Unit
    
    @JSName("sap/ui/core/util/reflection/BaseTreeModifier")
    var sapSlashuiSlashcoreSlashutilSlashreflectionSlashBaseTreeModifier: Unit
    
    @JSName("sap/ui/core/util/reflection/JsControlTreeModifier")
    var sapSlashuiSlashcoreSlashutilSlashreflectionSlashJsControlTreeModifier: Unit
    
    @JSName("sap/ui/core/util/reflection/XmlTreeModifier")
    var sapSlashuiSlashcoreSlashutilSlashreflectionSlashXmlTreeModifier: Unit
    
    @JSName("sap/ui/core/util/serializer/HTMLViewSerializer")
    var sapSlashuiSlashcoreSlashutilSlashserializerSlashHTMLViewSerializer: Unit
    
    @JSName("sap/ui/core/util/serializer/Serializer")
    var sapSlashuiSlashcoreSlashutilSlashserializerSlashSerializer: Unit
    
    @JSName("sap/ui/core/util/serializer/ViewSerializer")
    var sapSlashuiSlashcoreSlashutilSlashserializerSlashViewSerializer: Unit
    
    @JSName("sap/ui/core/util/serializer/XMLViewSerializer")
    var sapSlashuiSlashcoreSlashutilSlashserializerSlashXMLViewSerializer: Unit
    
    @JSName("sap/ui/core/util/serializer/delegate/Delegate")
    var sapSlashuiSlashcoreSlashutilSlashserializerSlashdelegateSlashDelegate: Unit
    
    @JSName("sap/ui/core/util/serializer/delegate/HTML")
    var sapSlashuiSlashcoreSlashutilSlashserializerSlashdelegateSlashHTML: Unit
    
    @JSName("sap/ui/core/util/serializer/delegate/XML")
    var sapSlashuiSlashcoreSlashutilSlashserializerSlashdelegateSlashXML: Unit
    
    @JSName("sap/ui/core/ws/ReadyState")
    var sapSlashuiSlashcoreSlashwsSlashReadyState: Unit
    
    @JSName("sap/ui/core/ws/SapPcpWebSocket")
    var sapSlashuiSlashcoreSlashwsSlashSapPcpWebSocket: Unit
    
    @JSName("sap/ui/core/ws/WebSocket")
    var sapSlashuiSlashcoreSlashwsSlashWebSocket: Unit
    
    @JSName("sap/ui/dom/containsOrEquals")
    var sapSlashuiSlashdomSlashcontainsOrEquals: Unit
    
    @JSName("sap/ui/dom/denormalizeScrollBeginRTL")
    var sapSlashuiSlashdomSlashdenormalizeScrollBeginRTL: Unit
    
    @JSName("sap/ui/dom/denormalizeScrollLeftRTL")
    var sapSlashuiSlashdomSlashdenormalizeScrollLeftRTL: Unit
    
    @JSName("sap/ui/dom/getOwnerWindow")
    var sapSlashuiSlashdomSlashgetOwnerWindow: Unit
    
    @JSName("sap/ui/dom/getScrollbarSize")
    var sapSlashuiSlashdomSlashgetScrollbarSize: Unit
    
    @JSName("sap/ui/dom/includeScript")
    var sapSlashuiSlashdomSlashincludeScript: Unit
    
    @JSName("sap/ui/dom/includeStylesheet")
    var sapSlashuiSlashdomSlashincludeStylesheet: Unit
    
    @JSName("sap/ui/dom/isHidden")
    var sapSlashuiSlashdomSlashisHidden: Unit
    
    @JSName("sap/ui/dom/jquery/Aria")
    var sapSlashuiSlashdomSlashjquerySlashAria: Unit
    
    @JSName("sap/ui/dom/jquery/Focusable")
    var sapSlashuiSlashdomSlashjquerySlashFocusable: Unit
    
    @JSName("sap/ui/dom/jquery/Selection")
    var sapSlashuiSlashdomSlashjquerySlashSelection: Unit
    
    @JSName("sap/ui/dom/jquery/Selectors")
    var sapSlashuiSlashdomSlashjquerySlashSelectors: Unit
    
    @JSName("sap/ui/dom/jquery/control")
    var sapSlashuiSlashdomSlashjquerySlashcontrol: Unit
    
    @JSName("sap/ui/dom/jquery/cursorPos")
    var sapSlashuiSlashdomSlashjquerySlashcursorPos: Unit
    
    @JSName("sap/ui/dom/jquery/getSelectedText")
    var sapSlashuiSlashdomSlashjquerySlashgetSelectedText: Unit
    
    @JSName("sap/ui/dom/jquery/hasTabIndex")
    var sapSlashuiSlashdomSlashjquerySlashhasTabIndex: Unit
    
    @JSName("sap/ui/dom/jquery/parentByAttribute")
    var sapSlashuiSlashdomSlashjquerySlashparentByAttribute: Unit
    
    @JSName("sap/ui/dom/jquery/rect")
    var sapSlashuiSlashdomSlashjquerySlashrect: Unit
    
    @JSName("sap/ui/dom/jquery/rectContains")
    var sapSlashuiSlashdomSlashjquerySlashrectContains: Unit
    
    @JSName("sap/ui/dom/jquery/scrollLeftRTL")
    var sapSlashuiSlashdomSlashjquerySlashscrollLeftRTL: Unit
    
    @JSName("sap/ui/dom/jquery/scrollRightRTL")
    var sapSlashuiSlashdomSlashjquerySlashscrollRightRTL: Unit
    
    @JSName("sap/ui/dom/jquery/selectText")
    var sapSlashuiSlashdomSlashjquerySlashselectText: Unit
    
    @JSName("sap/ui/dom/jquery/zIndex")
    var sapSlashuiSlashdomSlashjquerySlashzIndex: Unit
    
    @JSName("sap/ui/dom/units/Rem")
    var sapSlashuiSlashdomSlashunitsSlashRem: Unit
    
    @JSName("sap/ui/events/ControlEvents")
    var sapSlashuiSlasheventsSlashControlEvents: Unit
    
    @JSName("sap/ui/events/F6Navigation")
    var sapSlashuiSlasheventsSlashF6Navigation: Unit
    
    @JSName("sap/ui/events/KeyCodes")
    var sapSlashuiSlasheventsSlashKeyCodes: Unit
    
    @JSName("sap/ui/events/PseudoEvents")
    var sapSlashuiSlasheventsSlashPseudoEvents: Unit
    
    @JSName("sap/ui/events/TouchToMouseMapping")
    var sapSlashuiSlasheventsSlashTouchToMouseMapping: Unit
    
    @JSName("sap/ui/events/checkMouseEnterOrLeave")
    var sapSlashuiSlasheventsSlashcheckMouseEnterOrLeave: Unit
    
    @JSName("sap/ui/events/isMouseEventDelayed")
    var sapSlashuiSlasheventsSlashisMouseEventDelayed: Unit
    
    @JSName("sap/ui/events/isSpecialKey")
    var sapSlashuiSlasheventsSlashisSpecialKey: Unit
    
    @JSName("sap/ui/events/jquery/EventExtension")
    var sapSlashuiSlasheventsSlashjquerySlashEventExtension: Unit
    
    @JSName("sap/ui/events/jquery/EventSimulation")
    var sapSlashuiSlasheventsSlashjquerySlashEventSimulation: Unit
    
    @JSName("sap/ui/fl/Cache")
    var sapSlashuiSlashflSlashCache: Unit
    
    @JSName("sap/ui/fl/ChangePersistenceFactory")
    var sapSlashuiSlashflSlashChangePersistenceFactory: Unit
    
    @JSName("sap/ui/fl/FlexControllerFactory")
    var sapSlashuiSlashflSlashFlexControllerFactory: Unit
    
    @JSName("sap/ui/fl/Utils")
    var sapSlashuiSlashflSlashUtils: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/Utils")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashUtils: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/Preprocessor")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashPreprocessor: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/Registration")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashRegistration: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/RegistrationBuild")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashRegistrationBuild: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/app/AddAnnotationsToOData")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashAddAnnotationsToOData: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/app/AddNewInbound")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashAddNewInbound: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/app/ChangeDataSource")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashChangeDataSource: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/app/ChangeInbound")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashChangeInbound: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/app/RemoveAllInboundsExceptOne")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashRemoveAllInboundsExceptOne: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/app/SetTitle")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashSetTitle: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/fiori/SetAbstract")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashfioriSlashSetAbstract: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/fiori/SetRegistrationIds")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashfioriSlashSetRegistrationIds: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ovp/AddNewCard")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashovpSlashAddNewCard: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ovp/ChangeCard")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashovpSlashChangeCard: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ovp/DeleteCard")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashovpSlashDeleteCard: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddComponentUsages")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddComponentUsages: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddLibrary")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddLibrary: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddNewModel")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddNewModel: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddNewModelEnhanceWith")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddNewModelEnhanceWith: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ui5/SetFlexExtensionPointEnabled")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashSetFlexExtensionPointEnabled: Unit
    
    @JSName("sap/ui/fl/apply/_internal/changes/descriptor/ui5/SetMinUI5Version")
    var sapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashSetMinUI5Version: Unit
    
    @JSName("sap/ui/fl/apply/_internal/connectors/ObjectStorageConnector")
    var sapSlashuiSlashflSlashapplySlash_internalSlashconnectorsSlashObjectStorageConnector: Unit
    
    @JSName("sap/ui/fl/apply/_internal/controlVariants/URLHandler")
    var sapSlashuiSlashflSlashapplySlash_internalSlashcontrolVariantsSlashURLHandler: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/AppDescriptorChange")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashAppDescriptorChange: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/CompVariant")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashCompVariant: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/ControllerExtensionChange")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashControllerExtensionChange: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/FlVariant")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashFlVariant: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/FlexObject")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashFlexObject: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/FlexObjectFactory")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashFlexObjectFactory: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/UIChange")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashUIChange: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/UpdatableChange")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashUpdatableChange: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexObjects/Variant")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashVariant: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/DataSelector")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashDataSelector: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/FlexState")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashFlexState: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/InitialPrepareFunctions")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashInitialPrepareFunctions: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/Loader")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashLoader: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/UI2Personalization/UI2PersonalizationState")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashUI2PersonalizationSlashUI2PersonalizationState: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/changes/DependencyHandler")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashchangesSlashDependencyHandler: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/changes/ExtensionPointState")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashchangesSlashExtensionPointState: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/compVariants/CompVariantMerger")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashcompVariantsSlashCompVariantMerger: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/controlVariants/Switcher")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashcontrolVariantsSlashSwitcher: Unit
    
    @JSName("sap/ui/fl/apply/_internal/flexState/controlVariants/VariantManagementState")
    var sapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashcontrolVariantsSlashVariantManagementState: Unit
    
    @JSName("sap/ui/fl/apply/_internal/preprocessors/ControllerExtension")
    var sapSlashuiSlashflSlashapplySlash_internalSlashpreprocessorsSlashControllerExtension: Unit
    
    @JSName("sap/ui/fl/apply/_internal/preprocessors/EventHistory")
    var sapSlashuiSlashflSlashapplySlash_internalSlashpreprocessorsSlashEventHistory: Unit
    
    @JSName("sap/ui/fl/apply/api/ControlVariantApplyAPI")
    var sapSlashuiSlashflSlashapplySlashapiSlashControlVariantApplyAPI: Unit
    
    @JSName("sap/ui/fl/apply/api/DelegateMediatorAPI")
    var sapSlashuiSlashflSlashapplySlashapiSlashDelegateMediatorAPI: Unit
    
    @JSName("sap/ui/fl/apply/api/FlexRuntimeInfoAPI")
    var sapSlashuiSlashflSlashapplySlashapiSlashFlexRuntimeInfoAPI: Unit
    
    @JSName("sap/ui/fl/apply/api/SmartVariantManagementApplyAPI")
    var sapSlashuiSlashflSlashapplySlashapiSlashSmartVariantManagementApplyAPI: Unit
    
    @JSName("sap/ui/fl/apply/api/UI2PersonalizationApplyAPI")
    var sapSlashuiSlashflSlashapplySlashapiSlashUI2PersonalizationApplyAPI: Unit
    
    @JSName("sap/ui/fl/changeHandler/Base")
    var sapSlashuiSlashflSlashchangeHandlerSlashBase: Unit
    
    @JSName("sap/ui/fl/descriptorRelated/api/DescriptorChangeFactory")
    var sapSlashuiSlashflSlashdescriptorRelatedSlashapiSlashDescriptorChangeFactory: Unit
    
    @JSName("sap/ui/fl/descriptorRelated/api/DescriptorInlineChangeFactory")
    var sapSlashuiSlashflSlashdescriptorRelatedSlashapiSlashDescriptorInlineChangeFactory: Unit
    
    @JSName("sap/ui/fl/descriptorRelated/api/DescriptorVariantFactory")
    var sapSlashuiSlashflSlashdescriptorRelatedSlashapiSlashDescriptorVariantFactory: Unit
    
    @JSName("sap/ui/fl/initial/_internal/Storage")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashStorage: Unit
    
    @JSName("sap/ui/fl/initial/_internal/StorageUtils")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashStorageUtils: Unit
    
    @JSName("sap/ui/fl/initial/_internal/changeHandlers/ChangeRegistryItem")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashchangeHandlersSlashChangeRegistryItem: Unit
    
    @JSName("sap/ui/fl/initial/_internal/connectors/BackendConnector")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashBackendConnector: Unit
    
    @JSName("sap/ui/fl/initial/_internal/connectors/KeyUserConnector")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashKeyUserConnector: Unit
    
    @JSName("sap/ui/fl/initial/_internal/connectors/LrepConnector")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashLrepConnector: Unit
    
    @JSName("sap/ui/fl/initial/_internal/connectors/NeoLrepConnector")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashNeoLrepConnector: Unit
    
    @JSName("sap/ui/fl/initial/_internal/connectors/PersonalizationConnector")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashPersonalizationConnector: Unit
    
    @JSName("sap/ui/fl/initial/_internal/connectors/StaticFileConnector")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashStaticFileConnector: Unit
    
    @JSName("sap/ui/fl/initial/_internal/connectors/Utils")
    var sapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashUtils: Unit
    
    @JSName("sap/ui/fl/interfaces/BaseLoadConnector")
    var sapSlashuiSlashflSlashinterfacesSlashBaseLoadConnector: Unit
    
    @JSName("sap/ui/fl/interfaces/Delegate")
    var sapSlashuiSlashflSlashinterfacesSlashDelegate: Unit
    
    @JSName("sap/ui/fl/library")
    var sapSlashuiSlashflSlashlibrary: Unit
    
    @JSName("sap/ui/fl/registry/Settings")
    var sapSlashuiSlashflSlashregistrySlashSettings: Unit
    
    @JSName("sap/ui/fl/support/_internal/getChangeDependencies")
    var sapSlashuiSlashflSlashsupportSlash_internalSlashgetChangeDependencies: Unit
    
    @JSName("sap/ui/fl/support/_internal/getFlexSettings")
    var sapSlashuiSlashflSlashsupportSlash_internalSlashgetFlexSettings: Unit
    
    @JSName("sap/ui/fl/support/api/SupportAPI")
    var sapSlashuiSlashflSlashsupportSlashapiSlashSupportAPI: Unit
    
    @JSName("sap/ui/fl/transport/TransportDialog")
    var sapSlashuiSlashflSlashtransportSlashTransportDialog: Unit
    
    @JSName("sap/ui/fl/variants/VariantManagement")
    var sapSlashuiSlashflSlashvariantsSlashVariantManagement: Unit
    
    @JSName("sap/ui/fl/variants/VariantModel")
    var sapSlashuiSlashflSlashvariantsSlashVariantModel: Unit
    
    @JSName("sap/ui/fl/variants/context/Component")
    var sapSlashuiSlashflSlashvariantsSlashcontextSlashComponent: Unit
    
    @JSName("sap/ui/fl/write/_internal/Storage")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashStorage: Unit
    
    @JSName("sap/ui/fl/write/_internal/StorageFeaturesMerger")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashStorageFeaturesMerger: Unit
    
    @JSName("sap/ui/fl/write/_internal/Versions")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashVersions: Unit
    
    @JSName("sap/ui/fl/write/_internal/appVariant/AppVariant")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariant: Unit
    
    @JSName("sap/ui/fl/write/_internal/appVariant/AppVariantFactory")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariantFactory: Unit
    
    @JSName("sap/ui/fl/write/_internal/appVariant/AppVariantInlineChange")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariantInlineChange: Unit
    
    @JSName("sap/ui/fl/write/_internal/appVariant/AppVariantInlineChangeFactory")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariantInlineChangeFactory: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/BackendConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashBackendConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/JsObjectConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashJsObjectConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/KeyUserConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashKeyUserConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/LocalStorageConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashLocalStorageConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/LrepConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashLrepConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/NeoLrepConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashNeoLrepConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/ObjectPathConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashObjectPathConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/ObjectStorageConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashObjectStorageConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/PersonalizationConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashPersonalizationConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/SessionStorageConnector")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashSessionStorageConnector: Unit
    
    @JSName("sap/ui/fl/write/_internal/connectors/Utils")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashUtils: Unit
    
    @JSName("sap/ui/fl/write/_internal/extensionPoint/Registry")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashextensionPointSlashRegistry: Unit
    
    @JSName("sap/ui/fl/write/_internal/fieldExtensibility/ABAPExtensibilityVariant")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashfieldExtensibilitySlashABAPExtensibilityVariant: Unit
    
    @JSName("sap/ui/fl/write/_internal/fieldExtensibility/MultiTenantABAPExtensibilityVariant")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashfieldExtensibilitySlashMultiTenantABAPExtensibilityVariant: Unit
    
    @JSName("sap/ui/fl/write/_internal/fieldExtensibility/SingleTenantABAPExtensibilityVariant")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashfieldExtensibilitySlashSingleTenantABAPExtensibilityVariant: Unit
    
    @JSName("sap/ui/fl/write/_internal/flexState/FlexObjectState")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashflexStateSlashFlexObjectState: Unit
    
    @JSName("sap/ui/fl/write/_internal/flexState/compVariants/CompVariantState")
    var sapSlashuiSlashflSlashwriteSlash_internalSlashflexStateSlashcompVariantsSlashCompVariantState: Unit
    
    @JSName("sap/ui/fl/write/api/AppVariantWriteAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashAppVariantWriteAPI: Unit
    
    @JSName("sap/ui/fl/write/api/ChangesWriteAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashChangesWriteAPI: Unit
    
    @JSName("sap/ui/fl/write/api/ContextBasedAdaptationsAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashContextBasedAdaptationsAPI: Unit
    
    @JSName("sap/ui/fl/write/api/ContextSharingAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashContextSharingAPI: Unit
    
    @JSName("sap/ui/fl/write/api/ControlPersonalizationWriteAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashControlPersonalizationWriteAPI: Unit
    
    @JSName("sap/ui/fl/write/api/ExtensionPointRegistryAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashExtensionPointRegistryAPI: Unit
    
    @JSName("sap/ui/fl/write/api/FeaturesAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashFeaturesAPI: Unit
    
    @JSName("sap/ui/fl/write/api/FieldExtensibility")
    var sapSlashuiSlashflSlashwriteSlashapiSlashFieldExtensibility: Unit
    
    @JSName("sap/ui/fl/write/api/LocalResetAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashLocalResetAPI: Unit
    
    @JSName("sap/ui/fl/write/api/PersistenceWriteAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashPersistenceWriteAPI: Unit
    
    @JSName("sap/ui/fl/write/api/ReloadInfoAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashReloadInfoAPI: Unit
    
    @JSName("sap/ui/fl/write/api/SmartBusinessWriteAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashSmartBusinessWriteAPI: Unit
    
    @JSName("sap/ui/fl/write/api/SmartVariantManagementWriteAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashSmartVariantManagementWriteAPI: Unit
    
    @JSName("sap/ui/fl/write/api/TranslationAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashTranslationAPI: Unit
    
    @JSName("sap/ui/fl/write/api/UI2PersonalizationWriteAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashUI2PersonalizationWriteAPI: Unit
    
    @JSName("sap/ui/fl/write/api/VersionsAPI")
    var sapSlashuiSlashflSlashwriteSlashapiSlashVersionsAPI: Unit
    
    @JSName("sap/ui/fl/write/api/connectors/ObjectStorageConnector")
    var sapSlashuiSlashflSlashwriteSlashapiSlashconnectorsSlashObjectStorageConnector: Unit
    
    @JSName("sap/ui/fl/write/connectors/BaseConnector")
    var sapSlashuiSlashflSlashwriteSlashconnectorsSlashBaseConnector: Unit
    
    @JSName("sap/ui/integration/ActionDefinition")
    var sapSlashuiSlashintegrationSlashActionDefinition: Unit
    
    @JSName("sap/ui/integration/Designtime")
    var sapSlashuiSlashintegrationSlashDesigntime: Unit
    
    @JSName("sap/ui/integration/Extension")
    var sapSlashuiSlashintegrationSlashExtension: Unit
    
    @JSName("sap/ui/integration/Host")
    var sapSlashuiSlashintegrationSlashHost: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/BaseEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashBaseEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/PropertyEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashPropertyEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/PropertyEditors")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashPropertyEditors: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/layout/Form")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashlayoutSlashForm: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/BasePropertyEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashBasePropertyEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/PropertyEditorFactory")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashPropertyEditorFactory: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/arrayEditor/ArrayEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlasharrayEditorSlashArrayEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/booleanEditor/BooleanEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashbooleanEditorSlashBooleanEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/codeEditor/CodeEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashcodeEditorSlashCodeEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/dateEditor/DateEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashdateEditorSlashDateEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/dateTimeEditor/DateTimeEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashdateTimeEditorSlashDateTimeEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/enumStringEditor/EnumStringEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashenumStringEditorSlashEnumStringEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/groupEditor/GroupEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashgroupEditorSlashGroupEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/iconEditor/IconEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashiconEditorSlashIconEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/integerEditor/IntegerEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashintegerEditorSlashIntegerEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/jsonEditor/JsonEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashjsonEditorSlashJsonEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/listEditor/ListEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashlistEditorSlashListEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/mapEditor/MapEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashmapEditorSlashMapEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/multiSelectEditor/MultiSelectEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashmultiSelectEditorSlashMultiSelectEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/numberEditor/NumberEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashnumberEditorSlashNumberEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/objectArrayEditor/ObjectArrayEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashobjectArrayEditorSlashObjectArrayEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/selectEditor/SelectEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashselectEditorSlashSelectEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/separatorEditor/SeparatorEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashseparatorEditorSlashSeparatorEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/stringEditor/StringEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashstringEditorSlashStringEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/propertyEditor/textAreaEditor/TextAreaEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashtextAreaEditorSlashTextAreaEditor: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/util/unset")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashutilSlashunset: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsBoolean")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsBoolean: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsDate")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsDate: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsInteger")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsInteger: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsNumber")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsNumber: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsSelectedKey")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsSelectedKey: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsStringList")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsStringList: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsUniqueKey")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsUniqueKey: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsUniqueList")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsUniqueList: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/IsValidBinding")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsValidBinding: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/MaxLength")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashMaxLength: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/NotABinding")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashNotABinding: Unit
    
    @JSName("sap/ui/integration/designtime/baseEditor/validator/ValidatorRegistry")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashValidatorRegistry: Unit
    
    @JSName("sap/ui/integration/designtime/cardEditor/propertyEditor/complexMapEditor/ComplexMapEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashcomplexMapEditorSlashComplexMapEditor: Unit
    
    @JSName("sap/ui/integration/designtime/cardEditor/propertyEditor/destinationsEditor/DestinationsEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashdestinationsEditorSlashDestinationsEditor: Unit
    
    @JSName("sap/ui/integration/designtime/cardEditor/propertyEditor/filtersEditor/FiltersEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashfiltersEditorSlashFiltersEditor: Unit
    
    @JSName("sap/ui/integration/designtime/cardEditor/propertyEditor/iconEditor/IconEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashiconEditorSlashIconEditor: Unit
    
    @JSName("sap/ui/integration/designtime/cardEditor/propertyEditor/parametersEditor/ParametersEditor")
    var sapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashparametersEditorSlashParametersEditor: Unit
    
    @JSName("sap/ui/integration/designtime/editor/CardPreview")
    var sapSlashuiSlashintegrationSlashdesigntimeSlasheditorSlashCardPreview: Unit
    
    @JSName("sap/ui/integration/editor/Editor")
    var sapSlashuiSlashintegrationSlasheditorSlashEditor: Unit
    
    @JSName("sap/ui/integration/editor/Extension")
    var sapSlashuiSlashintegrationSlasheditorSlashExtension: Unit
    
    @JSName("sap/ui/integration/editor/Settings")
    var sapSlashuiSlashintegrationSlasheditorSlashSettings: Unit
    
    @JSName("sap/ui/integration/editor/fields/BaseField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashBaseField: Unit
    
    @JSName("sap/ui/integration/editor/fields/BooleanField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashBooleanField: Unit
    
    @JSName("sap/ui/integration/editor/fields/DateField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashDateField: Unit
    
    @JSName("sap/ui/integration/editor/fields/DateTimeField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashDateTimeField: Unit
    
    @JSName("sap/ui/integration/editor/fields/DestinationField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashDestinationField: Unit
    
    @JSName("sap/ui/integration/editor/fields/GroupField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashGroupField: Unit
    
    @JSName("sap/ui/integration/editor/fields/IntegerField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashIntegerField: Unit
    
    @JSName("sap/ui/integration/editor/fields/NumberField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashNumberField: Unit
    
    @JSName("sap/ui/integration/editor/fields/ObjectField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashObjectField: Unit
    
    @JSName("sap/ui/integration/editor/fields/ObjectListField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashObjectListField: Unit
    
    @JSName("sap/ui/integration/editor/fields/StringField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashStringField: Unit
    
    @JSName("sap/ui/integration/editor/fields/StringListField")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashStringListField: Unit
    
    @JSName("sap/ui/integration/editor/fields/fragment/Controller")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashfragmentSlashController: Unit
    
    @JSName("sap/ui/integration/editor/fields/viz/ColorSelect")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashColorSelect: Unit
    
    @JSName("sap/ui/integration/editor/fields/viz/IconSelect")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashIconSelect: Unit
    
    @JSName("sap/ui/integration/editor/fields/viz/ShapeSelect")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashShapeSelect: Unit
    
    @JSName("sap/ui/integration/editor/fields/viz/VizBase")
    var sapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashVizBase: Unit
    
    @JSName("sap/ui/integration/library")
    var sapSlashuiSlashintegrationSlashlibrary: Unit
    
    @JSName("sap/ui/integration/services/Service")
    var sapSlashuiSlashintegrationSlashservicesSlashService: Unit
    
    @JSName("sap/ui/integration/util/CsrfTokenHandler")
    var sapSlashuiSlashintegrationSlashutilSlashCsrfTokenHandler: Unit
    
    @JSName("sap/ui/integration/util/DataProvider")
    var sapSlashuiSlashintegrationSlashutilSlashDataProvider: Unit
    
    @JSName("sap/ui/integration/util/DataProviderFactory")
    var sapSlashuiSlashintegrationSlashutilSlashDataProviderFactory: Unit
    
    @JSName("sap/ui/integration/util/ManifestResolver")
    var sapSlashuiSlashintegrationSlashutilSlashManifestResolver: Unit
    
    @JSName("sap/ui/integration/util/RequestDataProvider")
    var sapSlashuiSlashintegrationSlashutilSlashRequestDataProvider: Unit
    
    @JSName("sap/ui/integration/util/SkeletonCard")
    var sapSlashuiSlashintegrationSlashutilSlashSkeletonCard: Unit
    
    @JSName("sap/ui/integration/widgets/Card")
    var sapSlashuiSlashintegrationSlashwidgetsSlashCard: Unit
    
    @JSName("sap/ui/layout/BlockLayout")
    var sapSlashuiSlashlayoutSlashBlockLayout: Unit
    
    @JSName("sap/ui/layout/BlockLayoutCell")
    var sapSlashuiSlashlayoutSlashBlockLayoutCell: Unit
    
    @JSName("sap/ui/layout/BlockLayoutCellData")
    var sapSlashuiSlashlayoutSlashBlockLayoutCellData: Unit
    
    @JSName("sap/ui/layout/BlockLayoutRow")
    var sapSlashuiSlashlayoutSlashBlockLayoutRow: Unit
    
    @JSName("sap/ui/layout/DynamicSideContent")
    var sapSlashuiSlashlayoutSlashDynamicSideContent: Unit
    
    @JSName("sap/ui/layout/FixFlex")
    var sapSlashuiSlashlayoutSlashFixFlex: Unit
    
    @JSName("sap/ui/layout/Grid")
    var sapSlashuiSlashlayoutSlashGrid: Unit
    
    @JSName("sap/ui/layout/GridData")
    var sapSlashuiSlashlayoutSlashGridData: Unit
    
    @JSName("sap/ui/layout/HorizontalLayout")
    var sapSlashuiSlashlayoutSlashHorizontalLayout: Unit
    
    @JSName("sap/ui/layout/PaneContainer")
    var sapSlashuiSlashlayoutSlashPaneContainer: Unit
    
    @JSName("sap/ui/layout/ResponsiveFlowLayout")
    var sapSlashuiSlashlayoutSlashResponsiveFlowLayout: Unit
    
    @JSName("sap/ui/layout/ResponsiveFlowLayoutData")
    var sapSlashuiSlashlayoutSlashResponsiveFlowLayoutData: Unit
    
    @JSName("sap/ui/layout/ResponsiveSplitter")
    var sapSlashuiSlashlayoutSlashResponsiveSplitter: Unit
    
    @JSName("sap/ui/layout/SplitPane")
    var sapSlashuiSlashlayoutSlashSplitPane: Unit
    
    @JSName("sap/ui/layout/Splitter")
    var sapSlashuiSlashlayoutSlashSplitter: Unit
    
    @JSName("sap/ui/layout/SplitterLayoutData")
    var sapSlashuiSlashlayoutSlashSplitterLayoutData: Unit
    
    @JSName("sap/ui/layout/VerticalLayout")
    var sapSlashuiSlashlayoutSlashVerticalLayout: Unit
    
    @JSName("sap/ui/layout/cssgrid/CSSGrid")
    var sapSlashuiSlashlayoutSlashcssgridSlashCSSGrid: Unit
    
    @JSName("sap/ui/layout/cssgrid/GridBasicLayout")
    var sapSlashuiSlashlayoutSlashcssgridSlashGridBasicLayout: Unit
    
    @JSName("sap/ui/layout/cssgrid/GridBoxLayout")
    var sapSlashuiSlashlayoutSlashcssgridSlashGridBoxLayout: Unit
    
    @JSName("sap/ui/layout/cssgrid/GridItemLayoutData")
    var sapSlashuiSlashlayoutSlashcssgridSlashGridItemLayoutData: Unit
    
    @JSName("sap/ui/layout/cssgrid/GridLayoutBase")
    var sapSlashuiSlashlayoutSlashcssgridSlashGridLayoutBase: Unit
    
    @JSName("sap/ui/layout/cssgrid/GridLayoutDelegate")
    var sapSlashuiSlashlayoutSlashcssgridSlashGridLayoutDelegate: Unit
    
    @JSName("sap/ui/layout/cssgrid/GridResponsiveLayout")
    var sapSlashuiSlashlayoutSlashcssgridSlashGridResponsiveLayout: Unit
    
    @JSName("sap/ui/layout/cssgrid/GridSettings")
    var sapSlashuiSlashlayoutSlashcssgridSlashGridSettings: Unit
    
    @JSName("sap/ui/layout/cssgrid/ResponsiveColumnItemLayoutData")
    var sapSlashuiSlashlayoutSlashcssgridSlashResponsiveColumnItemLayoutData: Unit
    
    @JSName("sap/ui/layout/cssgrid/ResponsiveColumnLayout")
    var sapSlashuiSlashlayoutSlashcssgridSlashResponsiveColumnLayout: Unit
    
    @JSName("sap/ui/layout/form/ColumnContainerData")
    var sapSlashuiSlashlayoutSlashformSlashColumnContainerData: Unit
    
    @JSName("sap/ui/layout/form/ColumnElementData")
    var sapSlashuiSlashlayoutSlashformSlashColumnElementData: Unit
    
    @JSName("sap/ui/layout/form/ColumnLayout")
    var sapSlashuiSlashlayoutSlashformSlashColumnLayout: Unit
    
    @JSName("sap/ui/layout/form/Form")
    var sapSlashuiSlashlayoutSlashformSlashForm: Unit
    
    @JSName("sap/ui/layout/form/FormContainer")
    var sapSlashuiSlashlayoutSlashformSlashFormContainer: Unit
    
    @JSName("sap/ui/layout/form/FormElement")
    var sapSlashuiSlashlayoutSlashformSlashFormElement: Unit
    
    @JSName("sap/ui/layout/form/FormLayout")
    var sapSlashuiSlashlayoutSlashformSlashFormLayout: Unit
    
    @JSName("sap/ui/layout/form/GridContainerData")
    var sapSlashuiSlashlayoutSlashformSlashGridContainerData: Unit
    
    @JSName("sap/ui/layout/form/GridElementData")
    var sapSlashuiSlashlayoutSlashformSlashGridElementData: Unit
    
    @JSName("sap/ui/layout/form/GridLayout")
    var sapSlashuiSlashlayoutSlashformSlashGridLayout: Unit
    
    @JSName("sap/ui/layout/form/ResponsiveGridLayout")
    var sapSlashuiSlashlayoutSlashformSlashResponsiveGridLayout: Unit
    
    @JSName("sap/ui/layout/form/ResponsiveLayout")
    var sapSlashuiSlashlayoutSlashformSlashResponsiveLayout: Unit
    
    @JSName("sap/ui/layout/form/SemanticFormElement")
    var sapSlashuiSlashlayoutSlashformSlashSemanticFormElement: Unit
    
    @JSName("sap/ui/layout/form/SimpleForm")
    var sapSlashuiSlashlayoutSlashformSlashSimpleForm: Unit
    
    @JSName("sap/ui/layout/library")
    var sapSlashuiSlashlayoutSlashlibrary: Unit
    
    @JSName("sap/ui/mdc/ActionToolbar")
    var sapSlashuiSlashmdcSlashActionToolbar: Unit
    
    @JSName("sap/ui/mdc/Chart")
    var sapSlashuiSlashmdcSlashChart: Unit
    
    @JSName("sap/ui/mdc/ChartDelegate")
    var sapSlashuiSlashmdcSlashChartDelegate: Unit
    
    @JSName("sap/ui/mdc/Control")
    var sapSlashuiSlashmdcSlashControl: Unit
    
    @JSName("sap/ui/mdc/Element")
    var sapSlashuiSlashmdcSlashElement: Unit
    
    @JSName("sap/ui/mdc/Field")
    var sapSlashuiSlashmdcSlashField: Unit
    
    @JSName("sap/ui/mdc/FilterBar")
    var sapSlashuiSlashmdcSlashFilterBar: Unit
    
    @JSName("sap/ui/mdc/FilterBarDelegate")
    var sapSlashuiSlashmdcSlashFilterBarDelegate: Unit
    
    @JSName("sap/ui/mdc/FilterField")
    var sapSlashuiSlashmdcSlashFilterField: Unit
    
    @JSName("sap/ui/mdc/Link")
    var sapSlashuiSlashmdcSlashLink: Unit
    
    @JSName("sap/ui/mdc/LinkDelegate")
    var sapSlashuiSlashmdcSlashLinkDelegate: Unit
    
    @JSName("sap/ui/mdc/MultiValueField")
    var sapSlashuiSlashmdcSlashMultiValueField: Unit
    
    @JSName("sap/ui/mdc/Table")
    var sapSlashuiSlashmdcSlashTable: Unit
    
    @JSName("sap/ui/mdc/TableDelegate")
    var sapSlashuiSlashmdcSlashTableDelegate: Unit
    
    @JSName("sap/ui/mdc/ValueHelp")
    var sapSlashuiSlashmdcSlashValueHelp: Unit
    
    @JSName("sap/ui/mdc/ValueHelpDelegate")
    var sapSlashuiSlashmdcSlashValueHelpDelegate: Unit
    
    @JSName("sap/ui/mdc/actiontoolbar/ActionToolbarAction")
    var sapSlashuiSlashmdcSlashactiontoolbarSlashActionToolbarAction: Unit
    
    @JSName("sap/ui/mdc/chart/ChartImplementationContainer")
    var sapSlashuiSlashmdcSlashchartSlashChartImplementationContainer: Unit
    
    @JSName("sap/ui/mdc/chart/ChartSelectionDetails")
    var sapSlashuiSlashmdcSlashchartSlashChartSelectionDetails: Unit
    
    @JSName("sap/ui/mdc/chart/Item")
    var sapSlashuiSlashmdcSlashchartSlashItem: Unit
    
    @JSName("sap/ui/mdc/chart/SelectionDetailsActions")
    var sapSlashuiSlashmdcSlashchartSlashSelectionDetailsActions: Unit
    
    @JSName("sap/ui/mdc/condition/Condition")
    var sapSlashuiSlashmdcSlashconditionSlashCondition: Unit
    
    @JSName("sap/ui/mdc/condition/ConditionConverter")
    var sapSlashuiSlashmdcSlashconditionSlashConditionConverter: Unit
    
    @JSName("sap/ui/mdc/condition/ConditionModel")
    var sapSlashuiSlashmdcSlashconditionSlashConditionModel: Unit
    
    @JSName("sap/ui/mdc/condition/ConditionModelPropertyBinding")
    var sapSlashuiSlashmdcSlashconditionSlashConditionModelPropertyBinding: Unit
    
    @JSName("sap/ui/mdc/condition/ConditionValidateException")
    var sapSlashuiSlashmdcSlashconditionSlashConditionValidateException: Unit
    
    @JSName("sap/ui/mdc/condition/FilterConverter")
    var sapSlashuiSlashmdcSlashconditionSlashFilterConverter: Unit
    
    @JSName("sap/ui/mdc/condition/FilterOperatorUtil")
    var sapSlashuiSlashmdcSlashconditionSlashFilterOperatorUtil: Unit
    
    @JSName("sap/ui/mdc/condition/Operator")
    var sapSlashuiSlashmdcSlashconditionSlashOperator: Unit
    
    @JSName("sap/ui/mdc/condition/OperatorDynamicDateOption")
    var sapSlashuiSlashmdcSlashconditionSlashOperatorDynamicDateOption: Unit
    
    @JSName("sap/ui/mdc/condition/RangeOperator")
    var sapSlashuiSlashmdcSlashconditionSlashRangeOperator: Unit
    
    @JSName("sap/ui/mdc/enum/ActionToolbarActionAlignment")
    var sapSlashuiSlashmdcSlashenumSlashActionToolbarActionAlignment: Unit
    
    @JSName("sap/ui/mdc/enum/BaseType")
    var sapSlashuiSlashmdcSlashenumSlashBaseType: Unit
    
    @JSName("sap/ui/mdc/enum/ConditionValidated")
    var sapSlashuiSlashmdcSlashenumSlashConditionValidated: Unit
    
    @JSName("sap/ui/mdc/enum/ContentMode")
    var sapSlashuiSlashmdcSlashenumSlashContentMode: Unit
    
    @JSName("sap/ui/mdc/enum/EditMode")
    var sapSlashuiSlashmdcSlashenumSlashEditMode: Unit
    
    @JSName("sap/ui/mdc/enum/FieldDisplay")
    var sapSlashuiSlashmdcSlashenumSlashFieldDisplay: Unit
    
    @JSName("sap/ui/mdc/enum/FilterBarValidationStatus")
    var sapSlashuiSlashmdcSlashenumSlashFilterBarValidationStatus: Unit
    
    @JSName("sap/ui/mdc/enum/PersistenceMode")
    var sapSlashuiSlashmdcSlashenumSlashPersistenceMode: Unit
    
    @JSName("sap/ui/mdc/enum/ProcessingStrategy")
    var sapSlashuiSlashmdcSlashenumSlashProcessingStrategy: Unit
    
    @JSName("sap/ui/mdc/enum/PropagationReason")
    var sapSlashuiSlashmdcSlashenumSlashPropagationReason: Unit
    
    @JSName("sap/ui/mdc/enum/ReasonMode")
    var sapSlashuiSlashmdcSlashenumSlashReasonMode: Unit
    
    @JSName("sap/ui/mdc/enum/SelectType")
    var sapSlashuiSlashmdcSlashenumSlashSelectType: Unit
    
    @JSName("sap/ui/mdc/field/ConditionType")
    var sapSlashuiSlashmdcSlashfieldSlashConditionType: Unit
    
    @JSName("sap/ui/mdc/field/ConditionsType")
    var sapSlashuiSlashmdcSlashfieldSlashConditionsType: Unit
    
    @JSName("sap/ui/mdc/field/CustomFieldInfo")
    var sapSlashuiSlashmdcSlashfieldSlashCustomFieldInfo: Unit
    
    @JSName("sap/ui/mdc/field/DefineConditionPanel")
    var sapSlashuiSlashmdcSlashfieldSlashDefineConditionPanel: Unit
    
    @JSName("sap/ui/mdc/field/DynamicDateRangeConditionsType")
    var sapSlashuiSlashmdcSlashfieldSlashDynamicDateRangeConditionsType: Unit
    
    @JSName("sap/ui/mdc/field/FieldBase")
    var sapSlashuiSlashmdcSlashfieldSlashFieldBase: Unit
    
    @JSName("sap/ui/mdc/field/FieldBaseDelegate")
    var sapSlashuiSlashmdcSlashfieldSlashFieldBaseDelegate: Unit
    
    @JSName("sap/ui/mdc/field/FieldInfoBase")
    var sapSlashuiSlashmdcSlashfieldSlashFieldInfoBase: Unit
    
    @JSName("sap/ui/mdc/field/FieldInput")
    var sapSlashuiSlashmdcSlashfieldSlashFieldInput: Unit
    
    @JSName("sap/ui/mdc/field/FieldMultiInput")
    var sapSlashuiSlashmdcSlashfieldSlashFieldMultiInput: Unit
    
    @JSName("sap/ui/mdc/field/ListFieldHelpItem")
    var sapSlashuiSlashmdcSlashfieldSlashListFieldHelpItem: Unit
    
    @JSName("sap/ui/mdc/field/MultiValueFieldDelegate")
    var sapSlashuiSlashmdcSlashfieldSlashMultiValueFieldDelegate: Unit
    
    @JSName("sap/ui/mdc/field/MultiValueFieldItem")
    var sapSlashuiSlashmdcSlashfieldSlashMultiValueFieldItem: Unit
    
    @JSName("sap/ui/mdc/field/TokenDisplay")
    var sapSlashuiSlashmdcSlashfieldSlashTokenDisplay: Unit
    
    @JSName("sap/ui/mdc/field/TokenizerDisplay")
    var sapSlashuiSlashmdcSlashfieldSlashTokenizerDisplay: Unit
    
    @JSName("sap/ui/mdc/filterbar/FilterBarBase")
    var sapSlashuiSlashmdcSlashfilterbarSlashFilterBarBase: Unit
    
    @JSName("sap/ui/mdc/filterbar/aligned/FilterContainer")
    var sapSlashuiSlashmdcSlashfilterbarSlashalignedSlashFilterContainer: Unit
    
    @JSName("sap/ui/mdc/filterbar/aligned/FilterItemLayout")
    var sapSlashuiSlashmdcSlashfilterbarSlashalignedSlashFilterItemLayout: Unit
    
    @JSName("sap/ui/mdc/filterbar/p13n/AdaptationFilterBar")
    var sapSlashuiSlashmdcSlashfilterbarSlashp13nSlashAdaptationFilterBar: Unit
    
    @JSName("sap/ui/mdc/filterbar/vh/CollectiveSearchSelect")
    var sapSlashuiSlashmdcSlashfilterbarSlashvhSlashCollectiveSearchSelect: Unit
    
    @JSName("sap/ui/mdc/filterbar/vh/FilterBar")
    var sapSlashuiSlashmdcSlashfilterbarSlashvhSlashFilterBar: Unit
    
    @JSName("sap/ui/mdc/filterbar/vh/FilterContainer")
    var sapSlashuiSlashmdcSlashfilterbarSlashvhSlashFilterContainer: Unit
    
    @JSName("sap/ui/mdc/library")
    var sapSlashuiSlashmdcSlashlibrary: Unit
    
    @JSName("sap/ui/mdc/link/LinkItem")
    var sapSlashuiSlashmdcSlashlinkSlashLinkItem: Unit
    
    @JSName("sap/ui/mdc/mixin/AdaptationMixin")
    var sapSlashuiSlashmdcSlashmixinSlashAdaptationMixin: Unit
    
    @JSName("sap/ui/mdc/mixin/DelegateMixin")
    var sapSlashuiSlashmdcSlashmixinSlashDelegateMixin: Unit
    
    @JSName("sap/ui/mdc/mixin/FilterIntegrationMixin")
    var sapSlashuiSlashmdcSlashmixinSlashFilterIntegrationMixin: Unit
    
    @JSName("sap/ui/mdc/mixin/PromiseMixin")
    var sapSlashuiSlashmdcSlashmixinSlashPromiseMixin: Unit
    
    @JSName("sap/ui/mdc/mixin/PropertyHelperMixin")
    var sapSlashuiSlashmdcSlashmixinSlashPropertyHelperMixin: Unit
    
    @JSName("sap/ui/mdc/odata/TypeUtil")
    var sapSlashuiSlashmdcSlashodataSlashTypeUtil: Unit
    
    @JSName("sap/ui/mdc/odata/v4/FieldBaseDelegate")
    var sapSlashuiSlashmdcSlashodataSlashv4SlashFieldBaseDelegate: Unit
    
    @JSName("sap/ui/mdc/odata/v4/TableDelegate")
    var sapSlashuiSlashmdcSlashodataSlashv4SlashTableDelegate: Unit
    
    @JSName("sap/ui/mdc/odata/v4/TypeUtil")
    var sapSlashuiSlashmdcSlashodataSlashv4SlashTypeUtil: Unit
    
    @JSName("sap/ui/mdc/odata/v4/ValueHelpDelegate")
    var sapSlashuiSlashmdcSlashodataSlashv4SlashValueHelpDelegate: Unit
    
    @JSName("sap/ui/mdc/p13n/StateUtil")
    var sapSlashuiSlashmdcSlashp13nSlashStateUtil: Unit
    
    @JSName("sap/ui/mdc/p13n/UIManager")
    var sapSlashuiSlashmdcSlashp13nSlashUIManager: Unit
    
    @JSName("sap/ui/mdc/p13n/panels/FilterPanel")
    var sapSlashuiSlashmdcSlashp13nSlashpanelsSlashFilterPanel: Unit
    
    @JSName("sap/ui/mdc/table/Column")
    var sapSlashuiSlashmdcSlashtableSlashColumn: Unit
    
    @JSName("sap/ui/mdc/table/ColumnSettings")
    var sapSlashuiSlashmdcSlashtableSlashColumnSettings: Unit
    
    @JSName("sap/ui/mdc/table/CreationRow")
    var sapSlashuiSlashmdcSlashtableSlashCreationRow: Unit
    
    @JSName("sap/ui/mdc/table/GridTableType")
    var sapSlashuiSlashmdcSlashtableSlashGridTableType: Unit
    
    @JSName("sap/ui/mdc/table/PropertyHelper")
    var sapSlashuiSlashmdcSlashtableSlashPropertyHelper: Unit
    
    @JSName("sap/ui/mdc/table/ResponsiveColumnSettings")
    var sapSlashuiSlashmdcSlashtableSlashResponsiveColumnSettings: Unit
    
    @JSName("sap/ui/mdc/table/ResponsiveTableType")
    var sapSlashuiSlashmdcSlashtableSlashResponsiveTableType: Unit
    
    @JSName("sap/ui/mdc/table/RowActionItem")
    var sapSlashuiSlashmdcSlashtableSlashRowActionItem: Unit
    
    @JSName("sap/ui/mdc/table/RowSettings")
    var sapSlashuiSlashmdcSlashtableSlashRowSettings: Unit
    
    @JSName("sap/ui/mdc/table/TableTypeBase")
    var sapSlashuiSlashmdcSlashtableSlashTableTypeBase: Unit
    
    @JSName("sap/ui/mdc/table/TreeTableType")
    var sapSlashuiSlashmdcSlashtableSlashTreeTableType: Unit
    
    @JSName("sap/ui/mdc/table/V4AnalyticsPropertyHelper")
    var sapSlashuiSlashmdcSlashtableSlashV4AnalyticsPropertyHelper: Unit
    
    @JSName("sap/ui/mdc/util/DateUtil")
    var sapSlashuiSlashmdcSlashutilSlashDateUtil: Unit
    
    @JSName("sap/ui/mdc/util/FilterUtil")
    var sapSlashuiSlashmdcSlashutilSlashFilterUtil: Unit
    
    @JSName("sap/ui/mdc/util/InfoBar")
    var sapSlashuiSlashmdcSlashutilSlashInfoBar: Unit
    
    @JSName("sap/ui/mdc/util/PromiseCache")
    var sapSlashuiSlashmdcSlashutilSlashPromiseCache: Unit
    
    @JSName("sap/ui/mdc/util/PropertyHelper")
    var sapSlashuiSlashmdcSlashutilSlashPropertyHelper: Unit
    
    @JSName("sap/ui/mdc/util/TypeUtil")
    var sapSlashuiSlashmdcSlashutilSlashTypeUtil: Unit
    
    @JSName("sap/ui/mdc/valuehelp/Dialog")
    var sapSlashuiSlashmdcSlashvaluehelpSlashDialog: Unit
    
    @JSName("sap/ui/mdc/valuehelp/Popover")
    var sapSlashuiSlashmdcSlashvaluehelpSlashPopover: Unit
    
    @JSName("sap/ui/mdc/valuehelp/base/Container")
    var sapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashContainer: Unit
    
    @JSName("sap/ui/mdc/valuehelp/base/Content")
    var sapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashContent: Unit
    
    @JSName("sap/ui/mdc/valuehelp/base/DialogTab")
    var sapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashDialogTab: Unit
    
    @JSName("sap/ui/mdc/valuehelp/base/FilterableListContent")
    var sapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashFilterableListContent: Unit
    
    @JSName("sap/ui/mdc/valuehelp/base/ListContent")
    var sapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashListContent: Unit
    
    @JSName("sap/ui/mdc/valuehelp/content/Bool")
    var sapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashBool: Unit
    
    @JSName("sap/ui/mdc/valuehelp/content/Conditions")
    var sapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashConditions: Unit
    
    @JSName("sap/ui/mdc/valuehelp/content/FixedList")
    var sapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashFixedList: Unit
    
    @JSName("sap/ui/mdc/valuehelp/content/MDCTable")
    var sapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashMDCTable: Unit
    
    @JSName("sap/ui/mdc/valuehelp/content/MTable")
    var sapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashMTable: Unit
    
    @JSName("sap/ui/model/Binding")
    var sapSlashuiSlashmodelSlashBinding: Unit
    
    @JSName("sap/ui/model/BindingMode")
    var sapSlashuiSlashmodelSlashBindingMode: Unit
    
    @JSName("sap/ui/model/ChangeReason")
    var sapSlashuiSlashmodelSlashChangeReason: Unit
    
    @JSName("sap/ui/model/ClientContextBinding")
    var sapSlashuiSlashmodelSlashClientContextBinding: Unit
    
    @JSName("sap/ui/model/ClientListBinding")
    var sapSlashuiSlashmodelSlashClientListBinding: Unit
    
    @JSName("sap/ui/model/ClientModel")
    var sapSlashuiSlashmodelSlashClientModel: Unit
    
    @JSName("sap/ui/model/ClientPropertyBinding")
    var sapSlashuiSlashmodelSlashClientPropertyBinding: Unit
    
    @JSName("sap/ui/model/ClientTreeBinding")
    var sapSlashuiSlashmodelSlashClientTreeBinding: Unit
    
    @JSName("sap/ui/model/ClientTreeBindingAdapter")
    var sapSlashuiSlashmodelSlashClientTreeBindingAdapter: Unit
    
    @JSName("sap/ui/model/CompositeBinding")
    var sapSlashuiSlashmodelSlashCompositeBinding: Unit
    
    @JSName("sap/ui/model/CompositeDataState")
    var sapSlashuiSlashmodelSlashCompositeDataState: Unit
    
    @JSName("sap/ui/model/CompositeType")
    var sapSlashuiSlashmodelSlashCompositeType: Unit
    
    @JSName("sap/ui/model/Context")
    var sapSlashuiSlashmodelSlashContext: Unit
    
    @JSName("sap/ui/model/ContextBinding")
    var sapSlashuiSlashmodelSlashContextBinding: Unit
    
    @JSName("sap/ui/model/DataState")
    var sapSlashuiSlashmodelSlashDataState: Unit
    
    @JSName("sap/ui/model/Filter")
    var sapSlashuiSlashmodelSlashFilter: Unit
    
    @JSName("sap/ui/model/FilterOperator")
    var sapSlashuiSlashmodelSlashFilterOperator: Unit
    
    @JSName("sap/ui/model/FilterProcessor")
    var sapSlashuiSlashmodelSlashFilterProcessor: Unit
    
    @JSName("sap/ui/model/FilterType")
    var sapSlashuiSlashmodelSlashFilterType: Unit
    
    @JSName("sap/ui/model/FormatException")
    var sapSlashuiSlashmodelSlashFormatException: Unit
    
    @JSName("sap/ui/model/ListBinding")
    var sapSlashuiSlashmodelSlashListBinding: Unit
    
    @JSName("sap/ui/model/MetaModel")
    var sapSlashuiSlashmodelSlashMetaModel: Unit
    
    @JSName("sap/ui/model/Model")
    var sapSlashuiSlashmodelSlashModel: Unit
    
    @JSName("sap/ui/model/ParseException")
    var sapSlashuiSlashmodelSlashParseException: Unit
    
    @JSName("sap/ui/model/PropertyBinding")
    var sapSlashuiSlashmodelSlashPropertyBinding: Unit
    
    @JSName("sap/ui/model/SelectionModel")
    var sapSlashuiSlashmodelSlashSelectionModel: Unit
    
    @JSName("sap/ui/model/SimpleType")
    var sapSlashuiSlashmodelSlashSimpleType: Unit
    
    @JSName("sap/ui/model/Sorter")
    var sapSlashuiSlashmodelSlashSorter: Unit
    
    @JSName("sap/ui/model/StaticBinding")
    var sapSlashuiSlashmodelSlashStaticBinding: Unit
    
    @JSName("sap/ui/model/TreeAutoExpandMode")
    var sapSlashuiSlashmodelSlashTreeAutoExpandMode: Unit
    
    @JSName("sap/ui/model/TreeBinding")
    var sapSlashuiSlashmodelSlashTreeBinding: Unit
    
    @JSName("sap/ui/model/TreeBindingAdapter")
    var sapSlashuiSlashmodelSlashTreeBindingAdapter: Unit
    
    @JSName("sap/ui/model/TreeBindingCompatibilityAdapter")
    var sapSlashuiSlashmodelSlashTreeBindingCompatibilityAdapter: Unit
    
    @JSName("sap/ui/model/TreeBindingUtils")
    var sapSlashuiSlashmodelSlashTreeBindingUtils: Unit
    
    @JSName("sap/ui/model/Type")
    var sapSlashuiSlashmodelSlashType: Unit
    
    @JSName("sap/ui/model/ValidateException")
    var sapSlashuiSlashmodelSlashValidateException: Unit
    
    @JSName("sap/ui/model/analytics/AnalyticalBinding")
    var sapSlashuiSlashmodelSlashanalyticsSlashAnalyticalBinding: Unit
    
    @JSName("sap/ui/model/analytics/AnalyticalTreeBindingAdapter")
    var sapSlashuiSlashmodelSlashanalyticsSlashAnalyticalTreeBindingAdapter: Unit
    
    @JSName("sap/ui/model/analytics/BatchResponseCollector")
    var sapSlashuiSlashmodelSlashanalyticsSlashBatchResponseCollector: Unit
    
    @JSName("sap/ui/model/analytics/odata4analytics")
    var sapSlashuiSlashmodelSlashanalyticsSlashodata4analytics: Unit
    
    @JSName("sap/ui/model/base/ManagedObjectModel")
    var sapSlashuiSlashmodelSlashbaseSlashManagedObjectModel: Unit
    
    @JSName("sap/ui/model/json/JSONListBinding")
    var sapSlashuiSlashmodelSlashjsonSlashJSONListBinding: Unit
    
    @JSName("sap/ui/model/json/JSONModel")
    var sapSlashuiSlashmodelSlashjsonSlashJSONModel: Unit
    
    @JSName("sap/ui/model/json/JSONPropertyBinding")
    var sapSlashuiSlashmodelSlashjsonSlashJSONPropertyBinding: Unit
    
    @JSName("sap/ui/model/json/JSONTreeBinding")
    var sapSlashuiSlashmodelSlashjsonSlashJSONTreeBinding: Unit
    
    @JSName("sap/ui/model/message/MessageModel")
    var sapSlashuiSlashmodelSlashmessageSlashMessageModel: Unit
    
    @JSName("sap/ui/model/odata/AnnotationHelper")
    var sapSlashuiSlashmodelSlashodataSlashAnnotationHelper: Unit
    
    @JSName("sap/ui/model/odata/CountMode")
    var sapSlashuiSlashmodelSlashodataSlashCountMode: Unit
    
    @JSName("sap/ui/model/odata/Filter")
    var sapSlashuiSlashmodelSlashodataSlashFilter: Unit
    
    @JSName("sap/ui/model/odata/MessageScope")
    var sapSlashuiSlashmodelSlashodataSlashMessageScope: Unit
    
    @JSName("sap/ui/model/odata/ODataAnnotations")
    var sapSlashuiSlashmodelSlashodataSlashODataAnnotations: Unit
    
    @JSName("sap/ui/model/odata/ODataContextBinding")
    var sapSlashuiSlashmodelSlashodataSlashODataContextBinding: Unit
    
    @JSName("sap/ui/model/odata/ODataListBinding")
    var sapSlashuiSlashmodelSlashodataSlashODataListBinding: Unit
    
    @JSName("sap/ui/model/odata/ODataMessageParser")
    var sapSlashuiSlashmodelSlashodataSlashODataMessageParser: Unit
    
    @JSName("sap/ui/model/odata/ODataMetaModel")
    var sapSlashuiSlashmodelSlashodataSlashODataMetaModel: Unit
    
    @JSName("sap/ui/model/odata/ODataMetadata")
    var sapSlashuiSlashmodelSlashodataSlashODataMetadata: Unit
    
    @JSName("sap/ui/model/odata/ODataModel")
    var sapSlashuiSlashmodelSlashodataSlashODataModel: Unit
    
    @JSName("sap/ui/model/odata/ODataPropertyBinding")
    var sapSlashuiSlashmodelSlashodataSlashODataPropertyBinding: Unit
    
    @JSName("sap/ui/model/odata/ODataUtils")
    var sapSlashuiSlashmodelSlashodataSlashODataUtils: Unit
    
    @JSName("sap/ui/model/odata/OperationMode")
    var sapSlashuiSlashmodelSlashodataSlashOperationMode: Unit
    
    @JSName("sap/ui/model/odata/UpdateMethod")
    var sapSlashuiSlashmodelSlashodataSlashUpdateMethod: Unit
    
    @JSName("sap/ui/model/odata/type/Boolean")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashBoolean: Unit
    
    @JSName("sap/ui/model/odata/type/Byte")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashByte: Unit
    
    @JSName("sap/ui/model/odata/type/Currency")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashCurrency: Unit
    
    @JSName("sap/ui/model/odata/type/Date")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashDate: Unit
    
    @JSName("sap/ui/model/odata/type/DateTime")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashDateTime: Unit
    
    @JSName("sap/ui/model/odata/type/DateTimeBase")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashDateTimeBase: Unit
    
    @JSName("sap/ui/model/odata/type/DateTimeOffset")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashDateTimeOffset: Unit
    
    @JSName("sap/ui/model/odata/type/DateTimeWithTimezone")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashDateTimeWithTimezone: Unit
    
    @JSName("sap/ui/model/odata/type/Decimal")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashDecimal: Unit
    
    @JSName("sap/ui/model/odata/type/Double")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashDouble: Unit
    
    @JSName("sap/ui/model/odata/type/Guid")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashGuid: Unit
    
    @JSName("sap/ui/model/odata/type/Int")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashInt: Unit
    
    @JSName("sap/ui/model/odata/type/Int16")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashInt16: Unit
    
    @JSName("sap/ui/model/odata/type/Int32")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashInt32: Unit
    
    @JSName("sap/ui/model/odata/type/Int64")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashInt64: Unit
    
    @JSName("sap/ui/model/odata/type/ODataType")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashODataType: Unit
    
    @JSName("sap/ui/model/odata/type/Raw")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashRaw: Unit
    
    @JSName("sap/ui/model/odata/type/SByte")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashSByte: Unit
    
    @JSName("sap/ui/model/odata/type/Single")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashSingle: Unit
    
    @JSName("sap/ui/model/odata/type/Stream")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashStream: Unit
    
    @JSName("sap/ui/model/odata/type/String")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashString: Unit
    
    @JSName("sap/ui/model/odata/type/Time")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashTime: Unit
    
    @JSName("sap/ui/model/odata/type/TimeOfDay")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashTimeOfDay: Unit
    
    @JSName("sap/ui/model/odata/type/Unit")
    var sapSlashuiSlashmodelSlashodataSlashtypeSlashUnit: Unit
    
    @JSName("sap/ui/model/odata/v2/BatchMode")
    var sapSlashuiSlashmodelSlashodataSlashv2SlashBatchMode: Unit
    
    @JSName("sap/ui/model/odata/v2/Context")
    var sapSlashuiSlashmodelSlashodataSlashv2SlashContext: Unit
    
    @JSName("sap/ui/model/odata/v2/ODataAnnotations")
    var sapSlashuiSlashmodelSlashodataSlashv2SlashODataAnnotations: Unit
    
    @JSName("sap/ui/model/odata/v2/ODataContextBinding")
    var sapSlashuiSlashmodelSlashodataSlashv2SlashODataContextBinding: Unit
    
    @JSName("sap/ui/model/odata/v2/ODataListBinding")
    var sapSlashuiSlashmodelSlashodataSlashv2SlashODataListBinding: Unit
    
    @JSName("sap/ui/model/odata/v2/ODataModel")
    var sapSlashuiSlashmodelSlashodataSlashv2SlashODataModel: Unit
    
    @JSName("sap/ui/model/odata/v2/ODataTreeBinding")
    var sapSlashuiSlashmodelSlashodataSlashv2SlashODataTreeBinding: Unit
    
    @JSName("sap/ui/model/odata/v4/AnnotationHelper")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashAnnotationHelper: Unit
    
    @JSName("sap/ui/model/odata/v4/Context")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashContext: Unit
    
    @JSName("sap/ui/model/odata/v4/ODataContextBinding")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashODataContextBinding: Unit
    
    @JSName("sap/ui/model/odata/v4/ODataListBinding")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashODataListBinding: Unit
    
    @JSName("sap/ui/model/odata/v4/ODataMetaModel")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashODataMetaModel: Unit
    
    @JSName("sap/ui/model/odata/v4/ODataModel")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashODataModel: Unit
    
    @JSName("sap/ui/model/odata/v4/ODataPropertyBinding")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashODataPropertyBinding: Unit
    
    @JSName("sap/ui/model/odata/v4/ODataUtils")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashODataUtils: Unit
    
    @JSName("sap/ui/model/odata/v4/SubmitMode")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashSubmitMode: Unit
    
    @JSName("sap/ui/model/odata/v4/ValueListType")
    var sapSlashuiSlashmodelSlashodataSlashv4SlashValueListType: Unit
    
    @JSName("sap/ui/model/resource/ResourceModel")
    var sapSlashuiSlashmodelSlashresourceSlashResourceModel: Unit
    
    @JSName("sap/ui/model/type/Boolean")
    var sapSlashuiSlashmodelSlashtypeSlashBoolean: Unit
    
    @JSName("sap/ui/model/type/Currency")
    var sapSlashuiSlashmodelSlashtypeSlashCurrency: Unit
    
    @JSName("sap/ui/model/type/Date")
    var sapSlashuiSlashmodelSlashtypeSlashDate: Unit
    
    @JSName("sap/ui/model/type/DateInterval")
    var sapSlashuiSlashmodelSlashtypeSlashDateInterval: Unit
    
    @JSName("sap/ui/model/type/DateTime")
    var sapSlashuiSlashmodelSlashtypeSlashDateTime: Unit
    
    @JSName("sap/ui/model/type/DateTimeInterval")
    var sapSlashuiSlashmodelSlashtypeSlashDateTimeInterval: Unit
    
    @JSName("sap/ui/model/type/FileSize")
    var sapSlashuiSlashmodelSlashtypeSlashFileSize: Unit
    
    @JSName("sap/ui/model/type/Float")
    var sapSlashuiSlashmodelSlashtypeSlashFloat: Unit
    
    @JSName("sap/ui/model/type/Integer")
    var sapSlashuiSlashmodelSlashtypeSlashInteger: Unit
    
    @JSName("sap/ui/model/type/String")
    var sapSlashuiSlashmodelSlashtypeSlashString: Unit
    
    @JSName("sap/ui/model/type/Time")
    var sapSlashuiSlashmodelSlashtypeSlashTime: Unit
    
    @JSName("sap/ui/model/type/TimeInterval")
    var sapSlashuiSlashmodelSlashtypeSlashTimeInterval: Unit
    
    @JSName("sap/ui/model/type/Unit")
    var sapSlashuiSlashmodelSlashtypeSlashUnit: Unit
    
    @JSName("sap/ui/model/xml/XMLModel")
    var sapSlashuiSlashmodelSlashxmlSlashXMLModel: Unit
    
    @JSName("sap/ui/model/xml/XMLTreeBinding")
    var sapSlashuiSlashmodelSlashxmlSlashXMLTreeBinding: Unit
    
    @JSName("sap/ui/performance/Measurement")
    var sapSlashuiSlashperformanceSlashMeasurement: Unit
    
    @JSName("sap/ui/performance/XHRInterceptor")
    var sapSlashuiSlashperformanceSlashXHRInterceptor: Unit
    
    @JSName("sap/ui/performance/trace/FESR")
    var sapSlashuiSlashperformanceSlashtraceSlashFESR: Unit
    
    @JSName("sap/ui/performance/trace/FESRHelper")
    var sapSlashuiSlashperformanceSlashtraceSlashFESRHelper: Unit
    
    @JSName("sap/ui/performance/trace/Interaction")
    var sapSlashuiSlashperformanceSlashtraceSlashInteraction: Unit
    
    @JSName("sap/ui/performance/trace/initTraces")
    var sapSlashuiSlashperformanceSlashtraceSlashinitTraces: Unit
    
    @JSName("sap/ui/rta/Client")
    var sapSlashuiSlashrtaSlashClient: Unit
    
    @JSName("sap/ui/rta/api/startAdaptation")
    var sapSlashuiSlashrtaSlashapiSlashstartAdaptation: Unit
    
    @JSName("sap/ui/rta/api/startKeyUserAdaptation")
    var sapSlashuiSlashrtaSlashapiSlashstartKeyUserAdaptation: Unit
    
    @JSName("sap/ui/rta/enablement/TestDelegate")
    var sapSlashuiSlashrtaSlashenablementSlashTestDelegate: Unit
    
    @JSName("sap/ui/rta/service/Action")
    var sapSlashuiSlashrtaSlashserviceSlashAction: Unit
    
    @JSName("sap/ui/rta/service/ControllerExtension")
    var sapSlashuiSlashrtaSlashserviceSlashControllerExtension: Unit
    
    @JSName("sap/ui/rta/service/Outline")
    var sapSlashuiSlashrtaSlashserviceSlashOutline: Unit
    
    @JSName("sap/ui/rta/service/Property")
    var sapSlashuiSlashrtaSlashserviceSlashProperty: Unit
    
    @JSName("sap/ui/rta/service/Selection")
    var sapSlashuiSlashrtaSlashserviceSlashSelection: Unit
    
    @JSName("sap/ui/rta/service/SupportTools")
    var sapSlashuiSlashrtaSlashserviceSlashSupportTools: Unit
    
    @JSName("sap/ui/rta/util/ReloadManager")
    var sapSlashuiSlashrtaSlashutilSlashReloadManager: Unit
    
    @JSName("sap/ui/security/FrameOptions")
    var sapSlashuiSlashsecuritySlashFrameOptions: Unit
    
    @JSName("sap/ui/suite/TaskCircle")
    var sapSlashuiSlashsuiteSlashTaskCircle: Unit
    
    @JSName("sap/ui/suite/VerticalProgressIndicator")
    var sapSlashuiSlashsuiteSlashVerticalProgressIndicator: Unit
    
    @JSName("sap/ui/suite/library")
    var sapSlashuiSlashsuiteSlashlibrary: Unit
    
    @JSName("sap/ui/support/RuleAnalyzer")
    var sapSlashuiSlashsupportSlashRuleAnalyzer: Unit
    
    @JSName("sap/ui/support/library")
    var sapSlashuiSlashsupportSlashlibrary: Unit
    
    @JSName("sap/ui/support/supportRules/CoreFacade")
    var sapSlashuiSlashsupportSlashsupportRulesSlashCoreFacade: Unit
    
    @JSName("sap/ui/support/supportRules/ExecutionScope")
    var sapSlashuiSlashsupportSlashsupportRulesSlashExecutionScope: Unit
    
    @JSName("sap/ui/support/supportRules/History")
    var sapSlashuiSlashsupportSlashsupportRulesSlashHistory: Unit
    
    @JSName("sap/ui/support/supportRules/IssueManager")
    var sapSlashuiSlashsupportSlashsupportRulesSlashIssueManager: Unit
    
    @JSName("sap/ui/table/AnalyticalColumn")
    var sapSlashuiSlashtableSlashAnalyticalColumn: Unit
    
    @JSName("sap/ui/table/AnalyticalColumnMenu")
    var sapSlashuiSlashtableSlashAnalyticalColumnMenu: Unit
    
    @JSName("sap/ui/table/AnalyticalTable")
    var sapSlashuiSlashtableSlashAnalyticalTable: Unit
    
    @JSName("sap/ui/table/Column")
    var sapSlashuiSlashtableSlashColumn: Unit
    
    @JSName("sap/ui/table/ColumnMenu")
    var sapSlashuiSlashtableSlashColumnMenu: Unit
    
    @JSName("sap/ui/table/CreationRow")
    var sapSlashuiSlashtableSlashCreationRow: Unit
    
    @JSName("sap/ui/table/Row")
    var sapSlashuiSlashtableSlashRow: Unit
    
    @JSName("sap/ui/table/RowAction")
    var sapSlashuiSlashtableSlashRowAction: Unit
    
    @JSName("sap/ui/table/RowActionItem")
    var sapSlashuiSlashtableSlashRowActionItem: Unit
    
    @JSName("sap/ui/table/RowSettings")
    var sapSlashuiSlashtableSlashRowSettings: Unit
    
    @JSName("sap/ui/table/Table")
    var sapSlashuiSlashtableSlashTable: Unit
    
    @JSName("sap/ui/table/TablePersoController")
    var sapSlashuiSlashtableSlashTablePersoController: Unit
    
    @JSName("sap/ui/table/TreeTable")
    var sapSlashuiSlashtableSlashTreeTable: Unit
    
    @JSName("sap/ui/table/library")
    var sapSlashuiSlashtableSlashlibrary: Unit
    
    @JSName("sap/ui/table/plugins/MultiSelectionPlugin")
    var sapSlashuiSlashtableSlashpluginsSlashMultiSelectionPlugin: Unit
    
    @JSName("sap/ui/table/plugins/SelectionPlugin")
    var sapSlashuiSlashtableSlashpluginsSlashSelectionPlugin: Unit
    
    @JSName("sap/ui/table/rowmodes/AutoRowMode")
    var sapSlashuiSlashtableSlashrowmodesSlashAutoRowMode: Unit
    
    @JSName("sap/ui/table/rowmodes/FixedRowMode")
    var sapSlashuiSlashtableSlashrowmodesSlashFixedRowMode: Unit
    
    @JSName("sap/ui/table/rowmodes/InteractiveRowMode")
    var sapSlashuiSlashtableSlashrowmodesSlashInteractiveRowMode: Unit
    
    @JSName("sap/ui/table/rowmodes/RowMode")
    var sapSlashuiSlashtableSlashrowmodesSlashRowMode: Unit
    
    @JSName("sap/ui/test/Opa")
    var sapSlashuiSlashtestSlashOpa: Unit
    
    @JSName("sap/ui/test/Opa5")
    var sapSlashuiSlashtestSlashOpa5: Unit
    
    @JSName("sap/ui/test/OpaBuilder")
    var sapSlashuiSlashtestSlashOpaBuilder: Unit
    
    @JSName("sap/ui/test/OpaExtension")
    var sapSlashuiSlashtestSlashOpaExtension: Unit
    
    @JSName("sap/ui/test/OpaPlugin")
    var sapSlashuiSlashtestSlashOpaPlugin: Unit
    
    @JSName("sap/ui/test/PageObjectFactory")
    var sapSlashuiSlashtestSlashPageObjectFactory: Unit
    
    @JSName("sap/ui/test/RecordReplay")
    var sapSlashuiSlashtestSlashRecordReplay: Unit
    
    @JSName("sap/ui/test/actions/Action")
    var sapSlashuiSlashtestSlashactionsSlashAction: Unit
    
    @JSName("sap/ui/test/actions/Drag")
    var sapSlashuiSlashtestSlashactionsSlashDrag: Unit
    
    @JSName("sap/ui/test/actions/Drop")
    var sapSlashuiSlashtestSlashactionsSlashDrop: Unit
    
    @JSName("sap/ui/test/actions/EnterText")
    var sapSlashuiSlashtestSlashactionsSlashEnterText: Unit
    
    @JSName("sap/ui/test/actions/Press")
    var sapSlashuiSlashtestSlashactionsSlashPress: Unit
    
    @JSName("sap/ui/test/actions/Scroll")
    var sapSlashuiSlashtestSlashactionsSlashScroll: Unit
    
    @JSName("sap/ui/test/generic/GenericTestCollection")
    var sapSlashuiSlashtestSlashgenericSlashGenericTestCollection: Unit
    
    @JSName("sap/ui/test/generic/Utils")
    var sapSlashuiSlashtestSlashgenericSlashUtils: Unit
    
    @JSName("sap/ui/test/gherkin/StepDefinitions")
    var sapSlashuiSlashtestSlashgherkinSlashStepDefinitions: Unit
    
    @JSName("sap/ui/test/gherkin/dataTableUtils")
    var sapSlashuiSlashtestSlashgherkinSlashdataTableUtils: Unit
    
    @JSName("sap/ui/test/gherkin/opa5TestHarness")
    var sapSlashuiSlashtestSlashgherkinSlashopa5TestHarness: Unit
    
    @JSName("sap/ui/test/gherkin/qUnitTestHarness")
    var sapSlashuiSlashtestSlashgherkinSlashqUnitTestHarness: Unit
    
    @JSName("sap/ui/test/matchers/AggregationContainsPropertyEqual")
    var sapSlashuiSlashtestSlashmatchersSlashAggregationContainsPropertyEqual: Unit
    
    @JSName("sap/ui/test/matchers/AggregationEmpty")
    var sapSlashuiSlashtestSlashmatchersSlashAggregationEmpty: Unit
    
    @JSName("sap/ui/test/matchers/AggregationFilled")
    var sapSlashuiSlashtestSlashmatchersSlashAggregationFilled: Unit
    
    @JSName("sap/ui/test/matchers/AggregationLengthEquals")
    var sapSlashuiSlashtestSlashmatchersSlashAggregationLengthEquals: Unit
    
    @JSName("sap/ui/test/matchers/Ancestor")
    var sapSlashuiSlashtestSlashmatchersSlashAncestor: Unit
    
    @JSName("sap/ui/test/matchers/BindingPath")
    var sapSlashuiSlashtestSlashmatchersSlashBindingPath: Unit
    
    @JSName("sap/ui/test/matchers/Descendant")
    var sapSlashuiSlashtestSlashmatchersSlashDescendant: Unit
    
    @JSName("sap/ui/test/matchers/I18NText")
    var sapSlashuiSlashtestSlashmatchersSlashI18NText: Unit
    
    @JSName("sap/ui/test/matchers/Interactable")
    var sapSlashuiSlashtestSlashmatchersSlashInteractable: Unit
    
    @JSName("sap/ui/test/matchers/LabelFor")
    var sapSlashuiSlashtestSlashmatchersSlashLabelFor: Unit
    
    @JSName("sap/ui/test/matchers/Matcher")
    var sapSlashuiSlashtestSlashmatchersSlashMatcher: Unit
    
    @JSName("sap/ui/test/matchers/Properties")
    var sapSlashuiSlashtestSlashmatchersSlashProperties: Unit
    
    @JSName("sap/ui/test/matchers/PropertyStrictEquals")
    var sapSlashuiSlashtestSlashmatchersSlashPropertyStrictEquals: Unit
    
    @JSName("sap/ui/test/matchers/Sibling")
    var sapSlashuiSlashtestSlashmatchersSlashSibling: Unit
    
    @JSName("sap/ui/test/opaQunit")
    var sapSlashuiSlashtestSlashopaQunit: Unit
    
    @JSName("sap/ui/testrecorder/library")
    var sapSlashuiSlashtestrecorderSlashlibrary: Unit
    
    @JSName("sap/ui/thirdparty/jquery")
    var sapSlashuiSlashthirdpartySlashjquery: Unit
    
    @JSName("sap/ui/thirdparty/qunit-2")
    var `sapSlashuiSlashthirdpartySlashqunit-2`: Unit
    
    @JSName("sap/ui/unified/Calendar")
    var sapSlashuiSlashunifiedSlashCalendar: Unit
    
    @JSName("sap/ui/unified/CalendarAppointment")
    var sapSlashuiSlashunifiedSlashCalendarAppointment: Unit
    
    @JSName("sap/ui/unified/CalendarDateInterval")
    var sapSlashuiSlashunifiedSlashCalendarDateInterval: Unit
    
    @JSName("sap/ui/unified/CalendarLegend")
    var sapSlashuiSlashunifiedSlashCalendarLegend: Unit
    
    @JSName("sap/ui/unified/CalendarLegendItem")
    var sapSlashuiSlashunifiedSlashCalendarLegendItem: Unit
    
    @JSName("sap/ui/unified/CalendarMonthInterval")
    var sapSlashuiSlashunifiedSlashCalendarMonthInterval: Unit
    
    @JSName("sap/ui/unified/CalendarRow")
    var sapSlashuiSlashunifiedSlashCalendarRow: Unit
    
    @JSName("sap/ui/unified/CalendarTimeInterval")
    var sapSlashuiSlashunifiedSlashCalendarTimeInterval: Unit
    
    @JSName("sap/ui/unified/ColorPicker")
    var sapSlashuiSlashunifiedSlashColorPicker: Unit
    
    @JSName("sap/ui/unified/ColorPickerDisplayMode")
    var sapSlashuiSlashunifiedSlashColorPickerDisplayMode: Unit
    
    @JSName("sap/ui/unified/ColorPickerPopover")
    var sapSlashuiSlashunifiedSlashColorPickerPopover: Unit
    
    @JSName("sap/ui/unified/ContentSwitcher")
    var sapSlashuiSlashunifiedSlashContentSwitcher: Unit
    
    @JSName("sap/ui/unified/Currency")
    var sapSlashuiSlashunifiedSlashCurrency: Unit
    
    @JSName("sap/ui/unified/DateRange")
    var sapSlashuiSlashunifiedSlashDateRange: Unit
    
    @JSName("sap/ui/unified/DateTypeRange")
    var sapSlashuiSlashunifiedSlashDateTypeRange: Unit
    
    @JSName("sap/ui/unified/FileUploader")
    var sapSlashuiSlashunifiedSlashFileUploader: Unit
    
    @JSName("sap/ui/unified/FileUploaderHttpRequestMethod")
    var sapSlashuiSlashunifiedSlashFileUploaderHttpRequestMethod: Unit
    
    @JSName("sap/ui/unified/FileUploaderParameter")
    var sapSlashuiSlashunifiedSlashFileUploaderParameter: Unit
    
    @JSName("sap/ui/unified/FileUploaderXHRSettings")
    var sapSlashuiSlashunifiedSlashFileUploaderXHRSettings: Unit
    
    @JSName("sap/ui/unified/Menu")
    var sapSlashuiSlashunifiedSlashMenu: Unit
    
    @JSName("sap/ui/unified/MenuItem")
    var sapSlashuiSlashunifiedSlashMenuItem: Unit
    
    @JSName("sap/ui/unified/MenuItemBase")
    var sapSlashuiSlashunifiedSlashMenuItemBase: Unit
    
    @JSName("sap/ui/unified/MenuTextFieldItem")
    var sapSlashuiSlashunifiedSlashMenuTextFieldItem: Unit
    
    @JSName("sap/ui/unified/Shell")
    var sapSlashuiSlashunifiedSlashShell: Unit
    
    @JSName("sap/ui/unified/ShellHeadItem")
    var sapSlashuiSlashunifiedSlashShellHeadItem: Unit
    
    @JSName("sap/ui/unified/ShellHeadUserItem")
    var sapSlashuiSlashunifiedSlashShellHeadUserItem: Unit
    
    @JSName("sap/ui/unified/ShellLayout")
    var sapSlashuiSlashunifiedSlashShellLayout: Unit
    
    @JSName("sap/ui/unified/ShellOverlay")
    var sapSlashuiSlashunifiedSlashShellOverlay: Unit
    
    @JSName("sap/ui/unified/SplitContainer")
    var sapSlashuiSlashunifiedSlashSplitContainer: Unit
    
    @JSName("sap/ui/unified/calendar/DatesRow")
    var sapSlashuiSlashunifiedSlashcalendarSlashDatesRow: Unit
    
    @JSName("sap/ui/unified/calendar/Header")
    var sapSlashuiSlashunifiedSlashcalendarSlashHeader: Unit
    
    @JSName("sap/ui/unified/calendar/Month")
    var sapSlashuiSlashunifiedSlashcalendarSlashMonth: Unit
    
    @JSName("sap/ui/unified/calendar/MonthPicker")
    var sapSlashuiSlashunifiedSlashcalendarSlashMonthPicker: Unit
    
    @JSName("sap/ui/unified/calendar/MonthsRow")
    var sapSlashuiSlashunifiedSlashcalendarSlashMonthsRow: Unit
    
    @JSName("sap/ui/unified/calendar/TimesRow")
    var sapSlashuiSlashunifiedSlashcalendarSlashTimesRow: Unit
    
    @JSName("sap/ui/unified/calendar/YearPicker")
    var sapSlashuiSlashunifiedSlashcalendarSlashYearPicker: Unit
    
    @JSName("sap/ui/unified/library")
    var sapSlashuiSlashunifiedSlashlibrary: Unit
    
    @JSName("sap/ui/util/ActivityDetection")
    var sapSlashuiSlashutilSlashActivityDetection: Unit
    
    @JSName("sap/ui/util/Mobile")
    var sapSlashuiSlashutilSlashMobile: Unit
    
    @JSName("sap/ui/util/Storage")
    var sapSlashuiSlashutilSlashStorage: Unit
    
    @JSName("sap/ui/util/XMLHelper")
    var sapSlashuiSlashutilSlashXMLHelper: Unit
    
    @JSName("sap/ui/util/defaultLinkTypes")
    var sapSlashuiSlashutilSlashdefaultLinkTypes: Unit
    
    @JSName("sap/ui/util/isCrossOriginURL")
    var sapSlashuiSlashutilSlashisCrossOriginURL: Unit
    
    @JSName("sap/ui/util/openWindow")
    var sapSlashuiSlashutilSlashopenWindow: Unit
    
    @JSName("sap/ui/ux3/ActionBar")
    var sapSlashuiSlashux3SlashActionBar: Unit
    
    @JSName("sap/ui/ux3/Collection")
    var sapSlashuiSlashux3SlashCollection: Unit
    
    @JSName("sap/ui/ux3/CollectionInspector")
    var sapSlashuiSlashux3SlashCollectionInspector: Unit
    
    @JSName("sap/ui/ux3/DataSet")
    var sapSlashuiSlashux3SlashDataSet: Unit
    
    @JSName("sap/ui/ux3/DataSetItem")
    var sapSlashuiSlashux3SlashDataSetItem: Unit
    
    @JSName("sap/ui/ux3/DataSetSimpleView")
    var sapSlashuiSlashux3SlashDataSetSimpleView: Unit
    
    @JSName("sap/ui/ux3/Exact")
    var sapSlashuiSlashux3SlashExact: Unit
    
    @JSName("sap/ui/ux3/ExactArea")
    var sapSlashuiSlashux3SlashExactArea: Unit
    
    @JSName("sap/ui/ux3/ExactAttribute")
    var sapSlashuiSlashux3SlashExactAttribute: Unit
    
    @JSName("sap/ui/ux3/ExactBrowser")
    var sapSlashuiSlashux3SlashExactBrowser: Unit
    
    @JSName("sap/ui/ux3/ExactList")
    var sapSlashuiSlashux3SlashExactList: Unit
    
    @JSName("sap/ui/ux3/FacetFilter")
    var sapSlashuiSlashux3SlashFacetFilter: Unit
    
    @JSName("sap/ui/ux3/FacetFilterList")
    var sapSlashuiSlashux3SlashFacetFilterList: Unit
    
    @JSName("sap/ui/ux3/Feed")
    var sapSlashuiSlashux3SlashFeed: Unit
    
    @JSName("sap/ui/ux3/FeedChunk")
    var sapSlashuiSlashux3SlashFeedChunk: Unit
    
    @JSName("sap/ui/ux3/Feeder")
    var sapSlashuiSlashux3SlashFeeder: Unit
    
    @JSName("sap/ui/ux3/NavigationBar")
    var sapSlashuiSlashux3SlashNavigationBar: Unit
    
    @JSName("sap/ui/ux3/NavigationItem")
    var sapSlashuiSlashux3SlashNavigationItem: Unit
    
    @JSName("sap/ui/ux3/NotificationBar")
    var sapSlashuiSlashux3SlashNotificationBar: Unit
    
    @JSName("sap/ui/ux3/Notifier")
    var sapSlashuiSlashux3SlashNotifier: Unit
    
    @JSName("sap/ui/ux3/Overlay")
    var sapSlashuiSlashux3SlashOverlay: Unit
    
    @JSName("sap/ui/ux3/OverlayContainer")
    var sapSlashuiSlashux3SlashOverlayContainer: Unit
    
    @JSName("sap/ui/ux3/OverlayDialog")
    var sapSlashuiSlashux3SlashOverlayDialog: Unit
    
    @JSName("sap/ui/ux3/QuickView")
    var sapSlashuiSlashux3SlashQuickView: Unit
    
    @JSName("sap/ui/ux3/Shell")
    var sapSlashuiSlashux3SlashShell: Unit
    
    @JSName("sap/ui/ux3/ThingAction")
    var sapSlashuiSlashux3SlashThingAction: Unit
    
    @JSName("sap/ui/ux3/ThingGroup")
    var sapSlashuiSlashux3SlashThingGroup: Unit
    
    @JSName("sap/ui/ux3/ThingInspector")
    var sapSlashuiSlashux3SlashThingInspector: Unit
    
    @JSName("sap/ui/ux3/ThingViewer")
    var sapSlashuiSlashux3SlashThingViewer: Unit
    
    @JSName("sap/ui/ux3/ToolPopup")
    var sapSlashuiSlashux3SlashToolPopup: Unit
    
    @JSName("sap/ui/ux3/library")
    var sapSlashuiSlashux3Slashlibrary: Unit
    
    @JSName("sap/ui/webc/common/WebComponent")
    var sapSlashuiSlashwebcSlashcommonSlashWebComponent: Unit
    
    @JSName("sap/ui/webc/common/WebComponentMetadata")
    var sapSlashuiSlashwebcSlashcommonSlashWebComponentMetadata: Unit
    
    @JSName("sap/ui/webc/common/library")
    var sapSlashuiSlashwebcSlashcommonSlashlibrary: Unit
    
    @JSName("sap/ui/webc/fiori/Bar")
    var sapSlashuiSlashwebcSlashfioriSlashBar: Unit
    
    @JSName("sap/ui/webc/fiori/BarcodeScannerDialog")
    var sapSlashuiSlashwebcSlashfioriSlashBarcodeScannerDialog: Unit
    
    @JSName("sap/ui/webc/fiori/DynamicSideContent")
    var sapSlashuiSlashwebcSlashfioriSlashDynamicSideContent: Unit
    
    @JSName("sap/ui/webc/fiori/FilterItem")
    var sapSlashuiSlashwebcSlashfioriSlashFilterItem: Unit
    
    @JSName("sap/ui/webc/fiori/FilterItemOption")
    var sapSlashuiSlashwebcSlashfioriSlashFilterItemOption: Unit
    
    @JSName("sap/ui/webc/fiori/FlexibleColumnLayout")
    var sapSlashuiSlashwebcSlashfioriSlashFlexibleColumnLayout: Unit
    
    @JSName("sap/ui/webc/fiori/IllustratedMessage")
    var sapSlashuiSlashwebcSlashfioriSlashIllustratedMessage: Unit
    
    @JSName("sap/ui/webc/fiori/MediaGallery")
    var sapSlashuiSlashwebcSlashfioriSlashMediaGallery: Unit
    
    @JSName("sap/ui/webc/fiori/MediaGalleryItem")
    var sapSlashuiSlashwebcSlashfioriSlashMediaGalleryItem: Unit
    
    @JSName("sap/ui/webc/fiori/NotificationAction")
    var sapSlashuiSlashwebcSlashfioriSlashNotificationAction: Unit
    
    @JSName("sap/ui/webc/fiori/NotificationListGroupItem")
    var sapSlashuiSlashwebcSlashfioriSlashNotificationListGroupItem: Unit
    
    @JSName("sap/ui/webc/fiori/NotificationListItem")
    var sapSlashuiSlashwebcSlashfioriSlashNotificationListItem: Unit
    
    @JSName("sap/ui/webc/fiori/Page")
    var sapSlashuiSlashwebcSlashfioriSlashPage: Unit
    
    @JSName("sap/ui/webc/fiori/ProductSwitch")
    var sapSlashuiSlashwebcSlashfioriSlashProductSwitch: Unit
    
    @JSName("sap/ui/webc/fiori/ProductSwitchItem")
    var sapSlashuiSlashwebcSlashfioriSlashProductSwitchItem: Unit
    
    @JSName("sap/ui/webc/fiori/ShellBar")
    var sapSlashuiSlashwebcSlashfioriSlashShellBar: Unit
    
    @JSName("sap/ui/webc/fiori/ShellBarItem")
    var sapSlashuiSlashwebcSlashfioriSlashShellBarItem: Unit
    
    @JSName("sap/ui/webc/fiori/SideNavigation")
    var sapSlashuiSlashwebcSlashfioriSlashSideNavigation: Unit
    
    @JSName("sap/ui/webc/fiori/SideNavigationItem")
    var sapSlashuiSlashwebcSlashfioriSlashSideNavigationItem: Unit
    
    @JSName("sap/ui/webc/fiori/SideNavigationSubItem")
    var sapSlashuiSlashwebcSlashfioriSlashSideNavigationSubItem: Unit
    
    @JSName("sap/ui/webc/fiori/SortItem")
    var sapSlashuiSlashwebcSlashfioriSlashSortItem: Unit
    
    @JSName("sap/ui/webc/fiori/Timeline")
    var sapSlashuiSlashwebcSlashfioriSlashTimeline: Unit
    
    @JSName("sap/ui/webc/fiori/TimelineItem")
    var sapSlashuiSlashwebcSlashfioriSlashTimelineItem: Unit
    
    @JSName("sap/ui/webc/fiori/UploadCollection")
    var sapSlashuiSlashwebcSlashfioriSlashUploadCollection: Unit
    
    @JSName("sap/ui/webc/fiori/UploadCollectionItem")
    var sapSlashuiSlashwebcSlashfioriSlashUploadCollectionItem: Unit
    
    @JSName("sap/ui/webc/fiori/ViewSettingsDialog")
    var sapSlashuiSlashwebcSlashfioriSlashViewSettingsDialog: Unit
    
    @JSName("sap/ui/webc/fiori/Wizard")
    var sapSlashuiSlashwebcSlashfioriSlashWizard: Unit
    
    @JSName("sap/ui/webc/fiori/WizardStep")
    var sapSlashuiSlashwebcSlashfioriSlashWizardStep: Unit
    
    @JSName("sap/ui/webc/fiori/library")
    var sapSlashuiSlashwebcSlashfioriSlashlibrary: Unit
    
    @JSName("sap/ui/webc/main/Avatar")
    var sapSlashuiSlashwebcSlashmainSlashAvatar: Unit
    
    @JSName("sap/ui/webc/main/AvatarGroup")
    var sapSlashuiSlashwebcSlashmainSlashAvatarGroup: Unit
    
    @JSName("sap/ui/webc/main/Badge")
    var sapSlashuiSlashwebcSlashmainSlashBadge: Unit
    
    @JSName("sap/ui/webc/main/Breadcrumbs")
    var sapSlashuiSlashwebcSlashmainSlashBreadcrumbs: Unit
    
    @JSName("sap/ui/webc/main/BreadcrumbsItem")
    var sapSlashuiSlashwebcSlashmainSlashBreadcrumbsItem: Unit
    
    @JSName("sap/ui/webc/main/BusyIndicator")
    var sapSlashuiSlashwebcSlashmainSlashBusyIndicator: Unit
    
    @JSName("sap/ui/webc/main/Button")
    var sapSlashuiSlashwebcSlashmainSlashButton: Unit
    
    @JSName("sap/ui/webc/main/Calendar")
    var sapSlashuiSlashwebcSlashmainSlashCalendar: Unit
    
    @JSName("sap/ui/webc/main/CalendarDate")
    var sapSlashuiSlashwebcSlashmainSlashCalendarDate: Unit
    
    @JSName("sap/ui/webc/main/Card")
    var sapSlashuiSlashwebcSlashmainSlashCard: Unit
    
    @JSName("sap/ui/webc/main/CardHeader")
    var sapSlashuiSlashwebcSlashmainSlashCardHeader: Unit
    
    @JSName("sap/ui/webc/main/Carousel")
    var sapSlashuiSlashwebcSlashmainSlashCarousel: Unit
    
    @JSName("sap/ui/webc/main/CheckBox")
    var sapSlashuiSlashwebcSlashmainSlashCheckBox: Unit
    
    @JSName("sap/ui/webc/main/ColorPalette")
    var sapSlashuiSlashwebcSlashmainSlashColorPalette: Unit
    
    @JSName("sap/ui/webc/main/ColorPaletteItem")
    var sapSlashuiSlashwebcSlashmainSlashColorPaletteItem: Unit
    
    @JSName("sap/ui/webc/main/ColorPalettePopover")
    var sapSlashuiSlashwebcSlashmainSlashColorPalettePopover: Unit
    
    @JSName("sap/ui/webc/main/ColorPicker")
    var sapSlashuiSlashwebcSlashmainSlashColorPicker: Unit
    
    @JSName("sap/ui/webc/main/ComboBox")
    var sapSlashuiSlashwebcSlashmainSlashComboBox: Unit
    
    @JSName("sap/ui/webc/main/ComboBoxGroupItem")
    var sapSlashuiSlashwebcSlashmainSlashComboBoxGroupItem: Unit
    
    @JSName("sap/ui/webc/main/ComboBoxItem")
    var sapSlashuiSlashwebcSlashmainSlashComboBoxItem: Unit
    
    @JSName("sap/ui/webc/main/CustomListItem")
    var sapSlashuiSlashwebcSlashmainSlashCustomListItem: Unit
    
    @JSName("sap/ui/webc/main/DatePicker")
    var sapSlashuiSlashwebcSlashmainSlashDatePicker: Unit
    
    @JSName("sap/ui/webc/main/DateRangePicker")
    var sapSlashuiSlashwebcSlashmainSlashDateRangePicker: Unit
    
    @JSName("sap/ui/webc/main/DateTimePicker")
    var sapSlashuiSlashwebcSlashmainSlashDateTimePicker: Unit
    
    @JSName("sap/ui/webc/main/Dialog")
    var sapSlashuiSlashwebcSlashmainSlashDialog: Unit
    
    @JSName("sap/ui/webc/main/FileUploader")
    var sapSlashuiSlashwebcSlashmainSlashFileUploader: Unit
    
    @JSName("sap/ui/webc/main/GroupHeaderListItem")
    var sapSlashuiSlashwebcSlashmainSlashGroupHeaderListItem: Unit
    
    @JSName("sap/ui/webc/main/Icon")
    var sapSlashuiSlashwebcSlashmainSlashIcon: Unit
    
    @JSName("sap/ui/webc/main/Input")
    var sapSlashuiSlashwebcSlashmainSlashInput: Unit
    
    @JSName("sap/ui/webc/main/Label")
    var sapSlashuiSlashwebcSlashmainSlashLabel: Unit
    
    @JSName("sap/ui/webc/main/Link")
    var sapSlashuiSlashwebcSlashmainSlashLink: Unit
    
    @JSName("sap/ui/webc/main/List")
    var sapSlashuiSlashwebcSlashmainSlashList: Unit
    
    @JSName("sap/ui/webc/main/Menu")
    var sapSlashuiSlashwebcSlashmainSlashMenu: Unit
    
    @JSName("sap/ui/webc/main/MenuItem")
    var sapSlashuiSlashwebcSlashmainSlashMenuItem: Unit
    
    @JSName("sap/ui/webc/main/MessageStrip")
    var sapSlashuiSlashwebcSlashmainSlashMessageStrip: Unit
    
    @JSName("sap/ui/webc/main/MultiComboBox")
    var sapSlashuiSlashwebcSlashmainSlashMultiComboBox: Unit
    
    @JSName("sap/ui/webc/main/MultiComboBoxGroupItem")
    var sapSlashuiSlashwebcSlashmainSlashMultiComboBoxGroupItem: Unit
    
    @JSName("sap/ui/webc/main/MultiComboBoxItem")
    var sapSlashuiSlashwebcSlashmainSlashMultiComboBoxItem: Unit
    
    @JSName("sap/ui/webc/main/MultiInput")
    var sapSlashuiSlashwebcSlashmainSlashMultiInput: Unit
    
    @JSName("sap/ui/webc/main/Option")
    var sapSlashuiSlashwebcSlashmainSlashOption: Unit
    
    @JSName("sap/ui/webc/main/Panel")
    var sapSlashuiSlashwebcSlashmainSlashPanel: Unit
    
    @JSName("sap/ui/webc/main/Popover")
    var sapSlashuiSlashwebcSlashmainSlashPopover: Unit
    
    @JSName("sap/ui/webc/main/ProgressIndicator")
    var sapSlashuiSlashwebcSlashmainSlashProgressIndicator: Unit
    
    @JSName("sap/ui/webc/main/RadioButton")
    var sapSlashuiSlashwebcSlashmainSlashRadioButton: Unit
    
    @JSName("sap/ui/webc/main/RangeSlider")
    var sapSlashuiSlashwebcSlashmainSlashRangeSlider: Unit
    
    @JSName("sap/ui/webc/main/RatingIndicator")
    var sapSlashuiSlashwebcSlashmainSlashRatingIndicator: Unit
    
    @JSName("sap/ui/webc/main/ResponsivePopover")
    var sapSlashuiSlashwebcSlashmainSlashResponsivePopover: Unit
    
    @JSName("sap/ui/webc/main/SegmentedButton")
    var sapSlashuiSlashwebcSlashmainSlashSegmentedButton: Unit
    
    @JSName("sap/ui/webc/main/SegmentedButtonItem")
    var sapSlashuiSlashwebcSlashmainSlashSegmentedButtonItem: Unit
    
    @JSName("sap/ui/webc/main/Select")
    var sapSlashuiSlashwebcSlashmainSlashSelect: Unit
    
    @JSName("sap/ui/webc/main/Slider")
    var sapSlashuiSlashwebcSlashmainSlashSlider: Unit
    
    @JSName("sap/ui/webc/main/SplitButton")
    var sapSlashuiSlashwebcSlashmainSlashSplitButton: Unit
    
    @JSName("sap/ui/webc/main/StandardListItem")
    var sapSlashuiSlashwebcSlashmainSlashStandardListItem: Unit
    
    @JSName("sap/ui/webc/main/StepInput")
    var sapSlashuiSlashwebcSlashmainSlashStepInput: Unit
    
    @JSName("sap/ui/webc/main/SuggestionGroupItem")
    var sapSlashuiSlashwebcSlashmainSlashSuggestionGroupItem: Unit
    
    @JSName("sap/ui/webc/main/SuggestionItem")
    var sapSlashuiSlashwebcSlashmainSlashSuggestionItem: Unit
    
    @JSName("sap/ui/webc/main/Switch")
    var sapSlashuiSlashwebcSlashmainSlashSwitch: Unit
    
    @JSName("sap/ui/webc/main/Tab")
    var sapSlashuiSlashwebcSlashmainSlashTab: Unit
    
    @JSName("sap/ui/webc/main/TabContainer")
    var sapSlashuiSlashwebcSlashmainSlashTabContainer: Unit
    
    @JSName("sap/ui/webc/main/TabSeparator")
    var sapSlashuiSlashwebcSlashmainSlashTabSeparator: Unit
    
    @JSName("sap/ui/webc/main/Table")
    var sapSlashuiSlashwebcSlashmainSlashTable: Unit
    
    @JSName("sap/ui/webc/main/TableCell")
    var sapSlashuiSlashwebcSlashmainSlashTableCell: Unit
    
    @JSName("sap/ui/webc/main/TableColumn")
    var sapSlashuiSlashwebcSlashmainSlashTableColumn: Unit
    
    @JSName("sap/ui/webc/main/TableGroupRow")
    var sapSlashuiSlashwebcSlashmainSlashTableGroupRow: Unit
    
    @JSName("sap/ui/webc/main/TableRow")
    var sapSlashuiSlashwebcSlashmainSlashTableRow: Unit
    
    @JSName("sap/ui/webc/main/TextArea")
    var sapSlashuiSlashwebcSlashmainSlashTextArea: Unit
    
    @JSName("sap/ui/webc/main/TimePicker")
    var sapSlashuiSlashwebcSlashmainSlashTimePicker: Unit
    
    @JSName("sap/ui/webc/main/Title")
    var sapSlashuiSlashwebcSlashmainSlashTitle: Unit
    
    @JSName("sap/ui/webc/main/Toast")
    var sapSlashuiSlashwebcSlashmainSlashToast: Unit
    
    @JSName("sap/ui/webc/main/ToggleButton")
    var sapSlashuiSlashwebcSlashmainSlashToggleButton: Unit
    
    @JSName("sap/ui/webc/main/Token")
    var sapSlashuiSlashwebcSlashmainSlashToken: Unit
    
    @JSName("sap/ui/webc/main/Tree")
    var sapSlashuiSlashwebcSlashmainSlashTree: Unit
    
    @JSName("sap/ui/webc/main/TreeItem")
    var sapSlashuiSlashwebcSlashmainSlashTreeItem: Unit
    
    @JSName("sap/ui/webc/main/library")
    var sapSlashuiSlashwebcSlashmainSlashlibrary: Unit
    
    @JSName("sap/uxap/AnchorBar")
    var sapSlashuxapSlashAnchorBar: Unit
    
    @JSName("sap/uxap/BlockBase")
    var sapSlashuxapSlashBlockBase: Unit
    
    @JSName("sap/uxap/BreadCrumbs")
    var sapSlashuxapSlashBreadCrumbs: Unit
    
    @JSName("sap/uxap/HierarchicalSelect")
    var sapSlashuxapSlashHierarchicalSelect: Unit
    
    @JSName("sap/uxap/ModelMapping")
    var sapSlashuxapSlashModelMapping: Unit
    
    @JSName("sap/uxap/ObjectPageAccessibleLandmarkInfo")
    var sapSlashuxapSlashObjectPageAccessibleLandmarkInfo: Unit
    
    @JSName("sap/uxap/ObjectPageDynamicHeaderContent")
    var sapSlashuxapSlashObjectPageDynamicHeaderContent: Unit
    
    @JSName("sap/uxap/ObjectPageDynamicHeaderTitle")
    var sapSlashuxapSlashObjectPageDynamicHeaderTitle: Unit
    
    @JSName("sap/uxap/ObjectPageHeader")
    var sapSlashuxapSlashObjectPageHeader: Unit
    
    @JSName("sap/uxap/ObjectPageHeaderActionButton")
    var sapSlashuxapSlashObjectPageHeaderActionButton: Unit
    
    @JSName("sap/uxap/ObjectPageHeaderContent")
    var sapSlashuxapSlashObjectPageHeaderContent: Unit
    
    @JSName("sap/uxap/ObjectPageHeaderLayoutData")
    var sapSlashuxapSlashObjectPageHeaderLayoutData: Unit
    
    @JSName("sap/uxap/ObjectPageLayout")
    var sapSlashuxapSlashObjectPageLayout: Unit
    
    @JSName("sap/uxap/ObjectPageLazyLoader")
    var sapSlashuxapSlashObjectPageLazyLoader: Unit
    
    @JSName("sap/uxap/ObjectPageSection")
    var sapSlashuxapSlashObjectPageSection: Unit
    
    @JSName("sap/uxap/ObjectPageSectionBase")
    var sapSlashuxapSlashObjectPageSectionBase: Unit
    
    @JSName("sap/uxap/ObjectPageSubSection")
    var sapSlashuxapSlashObjectPageSubSection: Unit
    
    @JSName("sap/uxap/library")
    var sapSlashuxapSlashlibrary: Unit
  }
  object IUI5DefineDependencyNames {
    
    inline def apply(
      jqueryDotsapDotact: Unit,
      jqueryDotsapDotevents: Unit,
      jqueryDotsapDotglobal: Unit,
      jqueryDotsapDothistory: Unit,
      jqueryDotsapDotkeycodes: Unit,
      jqueryDotsapDotmobile: Unit,
      jqueryDotsapDotproperties: Unit,
      jqueryDotsapDotresources: Unit,
      jqueryDotsapDotscript: Unit,
      jqueryDotsapDotstorage: Unit,
      jqueryDotsapDottrace: Unit,
      sapSlashbaseSlashLog: Unit,
      sapSlashbaseSlashassert: Unit,
      sapSlashbaseSlashi18nSlashResourceBundle: Unit,
      sapSlashbaseSlashsecuritySlashURLListValidator: Unit,
      sapSlashbaseSlashsecuritySlashURLWhitelist: Unit,
      sapSlashbaseSlashsecuritySlashencodeCSS: Unit,
      sapSlashbaseSlashsecuritySlashencodeJS: Unit,
      sapSlashbaseSlashsecuritySlashencodeURL: Unit,
      sapSlashbaseSlashsecuritySlashencodeURLParameters: Unit,
      sapSlashbaseSlashsecuritySlashencodeXML: Unit,
      sapSlashbaseSlashstringsSlashcamelize: Unit,
      sapSlashbaseSlashstringsSlashcapitalize: Unit,
      sapSlashbaseSlashstringsSlashescapeRegExp: Unit,
      sapSlashbaseSlashstringsSlashformatMessage: Unit,
      sapSlashbaseSlashstringsSlashhyphenate: Unit,
      sapSlashbaseSlashstringsSlashwhitespaceReplacer: Unit,
      sapSlashbaseSlashutilSlashDeferred: Unit,
      sapSlashbaseSlashutilSlashJSTokenizer: Unit,
      sapSlashbaseSlashutilSlashLoaderExtensions: Unit,
      sapSlashbaseSlashutilSlashObjectPath: Unit,
      sapSlashbaseSlashutilSlashProperties: Unit,
      sapSlashbaseSlashutilSlashUriParameters: Unit,
      sapSlashbaseSlashutilSlashVersion: Unit,
      sapSlashbaseSlashutilSlasharraySlashdiff: Unit,
      sapSlashbaseSlashutilSlasharraySlashuniqueSort: Unit,
      sapSlashbaseSlashutilSlashdeepClone: Unit,
      sapSlashbaseSlashutilSlashdeepEqual: Unit,
      sapSlashbaseSlashutilSlashdeepExtend: Unit,
      sapSlashbaseSlashutilSlashdefineCoupledProperty: Unit,
      sapSlashbaseSlashutilSlashdefineLazyProperty: Unit,
      sapSlashbaseSlashutilSlasheach: Unit,
      sapSlashbaseSlashutilSlashextend: Unit,
      sapSlashbaseSlashutilSlashfetch: Unit,
      sapSlashbaseSlashutilSlashincludes: Unit,
      sapSlashbaseSlashutilSlashisEmptyObject: Unit,
      sapSlashbaseSlashutilSlashisPlainObject: Unit,
      sapSlashbaseSlashutilSlashmerge: Unit,
      sapSlashbaseSlashutilSlashmixedFetch: Unit,
      sapSlashbaseSlashutilSlashnow: Unit,
      sapSlashbaseSlashutilSlashresolveReference: Unit,
      sapSlashbaseSlashutilSlashsyncFetch: Unit,
      sapSlashbaseSlashutilSlashuid: Unit,
      sapSlashbaseSlashutilSlashvalues: Unit,
      sapSlashfSlashAvatar: Unit,
      sapSlashfSlashAvatarGroup: Unit,
      sapSlashfSlashAvatarGroupItem: Unit,
      sapSlashfSlashCard: Unit,
      sapSlashfSlashCardBase: Unit,
      sapSlashfSlashDynamicPage: Unit,
      sapSlashfSlashDynamicPageAccessibleLandmarkInfo: Unit,
      sapSlashfSlashDynamicPageHeader: Unit,
      sapSlashfSlashDynamicPageTitle: Unit,
      sapSlashfSlashFlexibleColumnLayout: Unit,
      sapSlashfSlashFlexibleColumnLayoutAccessibleLandmarkInfo: Unit,
      sapSlashfSlashFlexibleColumnLayoutSemanticHelper: Unit,
      sapSlashfSlashGridContainer: Unit,
      sapSlashfSlashGridContainerItemLayoutData: Unit,
      sapSlashfSlashGridContainerSettings: Unit,
      sapSlashfSlashGridList: Unit,
      sapSlashfSlashGridListItem: Unit,
      sapSlashfSlashIllustratedMessage: Unit,
      sapSlashfSlashIllustration: Unit,
      sapSlashfSlashIllustrationPool: Unit,
      sapSlashfSlashProductSwitch: Unit,
      sapSlashfSlashProductSwitchItem: Unit,
      sapSlashfSlashSearchManager: Unit,
      sapSlashfSlashShellBar: Unit,
      sapSlashfSlashSidePanel: Unit,
      sapSlashfSlashSidePanelItem: Unit,
      sapSlashfSlashcardsSlashBaseHeader: Unit,
      sapSlashfSlashcardsSlashHeader: Unit,
      sapSlashfSlashcardsSlashNumericHeader: Unit,
      sapSlashfSlashcardsSlashNumericSideIndicator: Unit,
      sapSlashfSlashdndSlashGridDropInfo: Unit,
      sapSlashfSlashlibrary: Unit,
      sapSlashfSlashroutingSlashRouter: Unit,
      sapSlashfSlashroutingSlashTargetHandler: Unit,
      sapSlashfSlashroutingSlashTargets: Unit,
      sapSlashfSlashsemanticSlashAddAction: Unit,
      sapSlashfSlashsemanticSlashCloseAction: Unit,
      sapSlashfSlashsemanticSlashCopyAction: Unit,
      sapSlashfSlashsemanticSlashDeleteAction: Unit,
      sapSlashfSlashsemanticSlashDiscussInJamAction: Unit,
      sapSlashfSlashsemanticSlashEditAction: Unit,
      sapSlashfSlashsemanticSlashExitFullScreenAction: Unit,
      sapSlashfSlashsemanticSlashFavoriteAction: Unit,
      sapSlashfSlashsemanticSlashFlagAction: Unit,
      sapSlashfSlashsemanticSlashFooterMainAction: Unit,
      sapSlashfSlashsemanticSlashFullScreenAction: Unit,
      sapSlashfSlashsemanticSlashMainAction: Unit,
      sapSlashfSlashsemanticSlashMessagesIndicator: Unit,
      sapSlashfSlashsemanticSlashNegativeAction: Unit,
      sapSlashfSlashsemanticSlashPositiveAction: Unit,
      sapSlashfSlashsemanticSlashPrintAction: Unit,
      sapSlashfSlashsemanticSlashSemanticButton: Unit,
      sapSlashfSlashsemanticSlashSemanticControl: Unit,
      sapSlashfSlashsemanticSlashSemanticPage: Unit,
      sapSlashfSlashsemanticSlashSemanticToggleButton: Unit,
      sapSlashfSlashsemanticSlashSendEmailAction: Unit,
      sapSlashfSlashsemanticSlashSendMessageAction: Unit,
      sapSlashfSlashsemanticSlashShareInJamAction: Unit,
      sapSlashfSlashsemanticSlashTitleMainAction: Unit,
      sapSlashmSlashActionListItem: Unit,
      sapSlashmSlashActionSelect: Unit,
      sapSlashmSlashActionSheet: Unit,
      sapSlashmSlashApp: Unit,
      sapSlashmSlashAvatar: Unit,
      sapSlashmSlashAvatarColor: Unit,
      sapSlashmSlashAvatarImageFitType: Unit,
      sapSlashmSlashAvatarShape: Unit,
      sapSlashmSlashAvatarSize: Unit,
      sapSlashmSlashAvatarType: Unit,
      sapSlashmSlashBadgeCustomData: Unit,
      sapSlashmSlashBadgeEnabler: Unit,
      sapSlashmSlashBar: Unit,
      sapSlashmSlashBarInPageEnabler: Unit,
      sapSlashmSlashBreadcrumbs: Unit,
      sapSlashmSlashBusyDialog: Unit,
      sapSlashmSlashBusyIndicator: Unit,
      sapSlashmSlashButton: Unit,
      sapSlashmSlashCarousel: Unit,
      sapSlashmSlashCarouselLayout: Unit,
      sapSlashmSlashCheckBox: Unit,
      sapSlashmSlashColorPalette: Unit,
      sapSlashmSlashColorPalettePopover: Unit,
      sapSlashmSlashColumn: Unit,
      sapSlashmSlashColumnListItem: Unit,
      sapSlashmSlashComboBox: Unit,
      sapSlashmSlashComboBoxBase: Unit,
      sapSlashmSlashComboBoxTextField: Unit,
      sapSlashmSlashCustomDynamicDateOption: Unit,
      sapSlashmSlashCustomListItem: Unit,
      sapSlashmSlashCustomTile: Unit,
      sapSlashmSlashCustomTreeItem: Unit,
      sapSlashmSlashDatePicker: Unit,
      sapSlashmSlashDateRangeSelection: Unit,
      sapSlashmSlashDateTimeField: Unit,
      sapSlashmSlashDateTimeInput: Unit,
      sapSlashmSlashDateTimePicker: Unit,
      sapSlashmSlashDialog: Unit,
      sapSlashmSlashDisplayListItem: Unit,
      sapSlashmSlashDraftIndicator: Unit,
      sapSlashmSlashDynamicDate: Unit,
      sapSlashmSlashDynamicDateFormat: Unit,
      sapSlashmSlashDynamicDateOption: Unit,
      sapSlashmSlashDynamicDateRange: Unit,
      sapSlashmSlashDynamicDateUtil: Unit,
      sapSlashmSlashDynamicDateValueHelpUIType: Unit,
      sapSlashmSlashExpandableText: Unit,
      sapSlashmSlashFacetFilter: Unit,
      sapSlashmSlashFacetFilterItem: Unit,
      sapSlashmSlashFacetFilterList: Unit,
      sapSlashmSlashFeedContent: Unit,
      sapSlashmSlashFeedInput: Unit,
      sapSlashmSlashFeedListItem: Unit,
      sapSlashmSlashFeedListItemAction: Unit,
      sapSlashmSlashFlexBox: Unit,
      sapSlashmSlashFlexItemData: Unit,
      sapSlashmSlashFormattedText: Unit,
      sapSlashmSlashGenericTag: Unit,
      sapSlashmSlashGenericTile: Unit,
      sapSlashmSlashGroupHeaderListItem: Unit,
      sapSlashmSlashGrowingEnablement: Unit,
      sapSlashmSlashGrowingList: Unit,
      sapSlashmSlashHBox: Unit,
      sapSlashmSlashHeaderContainer: Unit,
      sapSlashmSlashIconTabBar: Unit,
      sapSlashmSlashIconTabFilter: Unit,
      sapSlashmSlashIconTabHeader: Unit,
      sapSlashmSlashIconTabSeparator: Unit,
      sapSlashmSlashIllustratedMessage: Unit,
      sapSlashmSlashIllustratedMessageSize: Unit,
      sapSlashmSlashIllustratedMessageType: Unit,
      sapSlashmSlashIllustration: Unit,
      sapSlashmSlashIllustrationPool: Unit,
      sapSlashmSlashImage: Unit,
      sapSlashmSlashImageContent: Unit,
      sapSlashmSlashInput: Unit,
      sapSlashmSlashInputBase: Unit,
      sapSlashmSlashInputBaseRenderer: Unit,
      sapSlashmSlashInputListItem: Unit,
      sapSlashmSlashInputRenderer: Unit,
      sapSlashmSlashInstanceManager: Unit,
      sapSlashmSlashLabel: Unit,
      sapSlashmSlashLightBox: Unit,
      sapSlashmSlashLightBoxItem: Unit,
      sapSlashmSlashLink: Unit,
      sapSlashmSlashList: Unit,
      sapSlashmSlashListBase: Unit,
      sapSlashmSlashListItemBase: Unit,
      sapSlashmSlashMaskInput: Unit,
      sapSlashmSlashMaskInputRule: Unit,
      sapSlashmSlashMenu: Unit,
      sapSlashmSlashMenuButton: Unit,
      sapSlashmSlashMenuItem: Unit,
      sapSlashmSlashMessageBox: Unit,
      sapSlashmSlashMessageItem: Unit,
      sapSlashmSlashMessagePage: Unit,
      sapSlashmSlashMessagePopover: Unit,
      sapSlashmSlashMessagePopoverItem: Unit,
      sapSlashmSlashMessageStrip: Unit,
      sapSlashmSlashMessageToast: Unit,
      sapSlashmSlashMessageView: Unit,
      sapSlashmSlashMultiComboBox: Unit,
      sapSlashmSlashMultiEditField: Unit,
      sapSlashmSlashMultiInput: Unit,
      sapSlashmSlashNavContainer: Unit,
      sapSlashmSlashNewsContent: Unit,
      sapSlashmSlashNotificationList: Unit,
      sapSlashmSlashNotificationListBase: Unit,
      sapSlashmSlashNotificationListGroup: Unit,
      sapSlashmSlashNotificationListItem: Unit,
      sapSlashmSlashNumericContent: Unit,
      sapSlashmSlashObjectAttribute: Unit,
      sapSlashmSlashObjectHeader: Unit,
      sapSlashmSlashObjectIdentifier: Unit,
      sapSlashmSlashObjectListItem: Unit,
      sapSlashmSlashObjectMarker: Unit,
      sapSlashmSlashObjectNumber: Unit,
      sapSlashmSlashObjectStatus: Unit,
      sapSlashmSlashOverflowToolbar: Unit,
      sapSlashmSlashOverflowToolbarButton: Unit,
      sapSlashmSlashOverflowToolbarLayoutData: Unit,
      sapSlashmSlashOverflowToolbarMenuButton: Unit,
      sapSlashmSlashOverflowToolbarToggleButton: Unit,
      sapSlashmSlashP13nColumnsItem: Unit,
      sapSlashmSlashP13nColumnsPanel: Unit,
      sapSlashmSlashP13nConditionPanel: Unit,
      sapSlashmSlashP13nDialog: Unit,
      sapSlashmSlashP13nDimMeasureItem: Unit,
      sapSlashmSlashP13nDimMeasurePanel: Unit,
      sapSlashmSlashP13nFilterItem: Unit,
      sapSlashmSlashP13nFilterPanel: Unit,
      sapSlashmSlashP13nGroupItem: Unit,
      sapSlashmSlashP13nGroupPanel: Unit,
      sapSlashmSlashP13nItem: Unit,
      sapSlashmSlashP13nOperationsHelper: Unit,
      sapSlashmSlashP13nPanel: Unit,
      sapSlashmSlashP13nSortItem: Unit,
      sapSlashmSlashP13nSortPanel: Unit,
      sapSlashmSlashPDFViewer: Unit,
      sapSlashmSlashPage: Unit,
      sapSlashmSlashPageAccessibleLandmarkInfo: Unit
    ): IUI5DefineDependencyNames = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("jquery.sap.act")(jqueryDotsapDotact.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.events")(jqueryDotsapDotevents.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.global")(jqueryDotsapDotglobal.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.history")(jqueryDotsapDothistory.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.keycodes")(jqueryDotsapDotkeycodes.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.mobile")(jqueryDotsapDotmobile.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.properties")(jqueryDotsapDotproperties.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.resources")(jqueryDotsapDotresources.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.script")(jqueryDotsapDotscript.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.storage")(jqueryDotsapDotstorage.asInstanceOf[js.Any])
      __obj.updateDynamic("jquery.sap.trace")(jqueryDotsapDottrace.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/Log")(sapSlashbaseSlashLog.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/assert")(sapSlashbaseSlashassert.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/i18n/ResourceBundle")(sapSlashbaseSlashi18nSlashResourceBundle.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/security/URLListValidator")(sapSlashbaseSlashsecuritySlashURLListValidator.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/security/URLWhitelist")(sapSlashbaseSlashsecuritySlashURLWhitelist.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/security/encodeCSS")(sapSlashbaseSlashsecuritySlashencodeCSS.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/security/encodeJS")(sapSlashbaseSlashsecuritySlashencodeJS.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/security/encodeURL")(sapSlashbaseSlashsecuritySlashencodeURL.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/security/encodeURLParameters")(sapSlashbaseSlashsecuritySlashencodeURLParameters.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/security/encodeXML")(sapSlashbaseSlashsecuritySlashencodeXML.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/strings/camelize")(sapSlashbaseSlashstringsSlashcamelize.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/strings/capitalize")(sapSlashbaseSlashstringsSlashcapitalize.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/strings/escapeRegExp")(sapSlashbaseSlashstringsSlashescapeRegExp.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/strings/formatMessage")(sapSlashbaseSlashstringsSlashformatMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/strings/hyphenate")(sapSlashbaseSlashstringsSlashhyphenate.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/strings/whitespaceReplacer")(sapSlashbaseSlashstringsSlashwhitespaceReplacer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/Deferred")(sapSlashbaseSlashutilSlashDeferred.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/JSTokenizer")(sapSlashbaseSlashutilSlashJSTokenizer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/LoaderExtensions")(sapSlashbaseSlashutilSlashLoaderExtensions.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/ObjectPath")(sapSlashbaseSlashutilSlashObjectPath.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/Properties")(sapSlashbaseSlashutilSlashProperties.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/UriParameters")(sapSlashbaseSlashutilSlashUriParameters.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/Version")(sapSlashbaseSlashutilSlashVersion.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/array/diff")(sapSlashbaseSlashutilSlasharraySlashdiff.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/array/uniqueSort")(sapSlashbaseSlashutilSlasharraySlashuniqueSort.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/deepClone")(sapSlashbaseSlashutilSlashdeepClone.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/deepEqual")(sapSlashbaseSlashutilSlashdeepEqual.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/deepExtend")(sapSlashbaseSlashutilSlashdeepExtend.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/defineCoupledProperty")(sapSlashbaseSlashutilSlashdefineCoupledProperty.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/defineLazyProperty")(sapSlashbaseSlashutilSlashdefineLazyProperty.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/each")(sapSlashbaseSlashutilSlasheach.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/extend")(sapSlashbaseSlashutilSlashextend.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/fetch")(sapSlashbaseSlashutilSlashfetch.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/includes")(sapSlashbaseSlashutilSlashincludes.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/isEmptyObject")(sapSlashbaseSlashutilSlashisEmptyObject.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/isPlainObject")(sapSlashbaseSlashutilSlashisPlainObject.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/merge")(sapSlashbaseSlashutilSlashmerge.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/mixedFetch")(sapSlashbaseSlashutilSlashmixedFetch.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/now")(sapSlashbaseSlashutilSlashnow.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/resolveReference")(sapSlashbaseSlashutilSlashresolveReference.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/syncFetch")(sapSlashbaseSlashutilSlashsyncFetch.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/uid")(sapSlashbaseSlashutilSlashuid.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/base/util/values")(sapSlashbaseSlashutilSlashvalues.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/Avatar")(sapSlashfSlashAvatar.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/AvatarGroup")(sapSlashfSlashAvatarGroup.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/AvatarGroupItem")(sapSlashfSlashAvatarGroupItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/Card")(sapSlashfSlashCard.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/CardBase")(sapSlashfSlashCardBase.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/DynamicPage")(sapSlashfSlashDynamicPage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/DynamicPageAccessibleLandmarkInfo")(sapSlashfSlashDynamicPageAccessibleLandmarkInfo.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/DynamicPageHeader")(sapSlashfSlashDynamicPageHeader.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/DynamicPageTitle")(sapSlashfSlashDynamicPageTitle.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/FlexibleColumnLayout")(sapSlashfSlashFlexibleColumnLayout.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/FlexibleColumnLayoutAccessibleLandmarkInfo")(sapSlashfSlashFlexibleColumnLayoutAccessibleLandmarkInfo.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/FlexibleColumnLayoutSemanticHelper")(sapSlashfSlashFlexibleColumnLayoutSemanticHelper.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/GridContainer")(sapSlashfSlashGridContainer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/GridContainerItemLayoutData")(sapSlashfSlashGridContainerItemLayoutData.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/GridContainerSettings")(sapSlashfSlashGridContainerSettings.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/GridList")(sapSlashfSlashGridList.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/GridListItem")(sapSlashfSlashGridListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/IllustratedMessage")(sapSlashfSlashIllustratedMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/Illustration")(sapSlashfSlashIllustration.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/IllustrationPool")(sapSlashfSlashIllustrationPool.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/ProductSwitch")(sapSlashfSlashProductSwitch.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/ProductSwitchItem")(sapSlashfSlashProductSwitchItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/SearchManager")(sapSlashfSlashSearchManager.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/ShellBar")(sapSlashfSlashShellBar.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/SidePanel")(sapSlashfSlashSidePanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/SidePanelItem")(sapSlashfSlashSidePanelItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/cards/BaseHeader")(sapSlashfSlashcardsSlashBaseHeader.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/cards/Header")(sapSlashfSlashcardsSlashHeader.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/cards/NumericHeader")(sapSlashfSlashcardsSlashNumericHeader.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/cards/NumericSideIndicator")(sapSlashfSlashcardsSlashNumericSideIndicator.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/dnd/GridDropInfo")(sapSlashfSlashdndSlashGridDropInfo.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/library")(sapSlashfSlashlibrary.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/routing/Router")(sapSlashfSlashroutingSlashRouter.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/routing/TargetHandler")(sapSlashfSlashroutingSlashTargetHandler.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/routing/Targets")(sapSlashfSlashroutingSlashTargets.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/AddAction")(sapSlashfSlashsemanticSlashAddAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/CloseAction")(sapSlashfSlashsemanticSlashCloseAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/CopyAction")(sapSlashfSlashsemanticSlashCopyAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/DeleteAction")(sapSlashfSlashsemanticSlashDeleteAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/DiscussInJamAction")(sapSlashfSlashsemanticSlashDiscussInJamAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/EditAction")(sapSlashfSlashsemanticSlashEditAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/ExitFullScreenAction")(sapSlashfSlashsemanticSlashExitFullScreenAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/FavoriteAction")(sapSlashfSlashsemanticSlashFavoriteAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/FlagAction")(sapSlashfSlashsemanticSlashFlagAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/FooterMainAction")(sapSlashfSlashsemanticSlashFooterMainAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/FullScreenAction")(sapSlashfSlashsemanticSlashFullScreenAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/MainAction")(sapSlashfSlashsemanticSlashMainAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/MessagesIndicator")(sapSlashfSlashsemanticSlashMessagesIndicator.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/NegativeAction")(sapSlashfSlashsemanticSlashNegativeAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/PositiveAction")(sapSlashfSlashsemanticSlashPositiveAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/PrintAction")(sapSlashfSlashsemanticSlashPrintAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/SemanticButton")(sapSlashfSlashsemanticSlashSemanticButton.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/SemanticControl")(sapSlashfSlashsemanticSlashSemanticControl.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/SemanticPage")(sapSlashfSlashsemanticSlashSemanticPage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/SemanticToggleButton")(sapSlashfSlashsemanticSlashSemanticToggleButton.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/SendEmailAction")(sapSlashfSlashsemanticSlashSendEmailAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/SendMessageAction")(sapSlashfSlashsemanticSlashSendMessageAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/ShareInJamAction")(sapSlashfSlashsemanticSlashShareInJamAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/f/semantic/TitleMainAction")(sapSlashfSlashsemanticSlashTitleMainAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ActionListItem")(sapSlashmSlashActionListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ActionSelect")(sapSlashmSlashActionSelect.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ActionSheet")(sapSlashmSlashActionSheet.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/App")(sapSlashmSlashApp.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Avatar")(sapSlashmSlashAvatar.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/AvatarColor")(sapSlashmSlashAvatarColor.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/AvatarImageFitType")(sapSlashmSlashAvatarImageFitType.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/AvatarShape")(sapSlashmSlashAvatarShape.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/AvatarSize")(sapSlashmSlashAvatarSize.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/AvatarType")(sapSlashmSlashAvatarType.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/BadgeCustomData")(sapSlashmSlashBadgeCustomData.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/BadgeEnabler")(sapSlashmSlashBadgeEnabler.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Bar")(sapSlashmSlashBar.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/BarInPageEnabler")(sapSlashmSlashBarInPageEnabler.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Breadcrumbs")(sapSlashmSlashBreadcrumbs.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/BusyDialog")(sapSlashmSlashBusyDialog.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/BusyIndicator")(sapSlashmSlashBusyIndicator.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Button")(sapSlashmSlashButton.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Carousel")(sapSlashmSlashCarousel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/CarouselLayout")(sapSlashmSlashCarouselLayout.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/CheckBox")(sapSlashmSlashCheckBox.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ColorPalette")(sapSlashmSlashColorPalette.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ColorPalettePopover")(sapSlashmSlashColorPalettePopover.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Column")(sapSlashmSlashColumn.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ColumnListItem")(sapSlashmSlashColumnListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ComboBox")(sapSlashmSlashComboBox.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ComboBoxBase")(sapSlashmSlashComboBoxBase.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ComboBoxTextField")(sapSlashmSlashComboBoxTextField.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/CustomDynamicDateOption")(sapSlashmSlashCustomDynamicDateOption.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/CustomListItem")(sapSlashmSlashCustomListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/CustomTile")(sapSlashmSlashCustomTile.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/CustomTreeItem")(sapSlashmSlashCustomTreeItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DatePicker")(sapSlashmSlashDatePicker.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DateRangeSelection")(sapSlashmSlashDateRangeSelection.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DateTimeField")(sapSlashmSlashDateTimeField.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DateTimeInput")(sapSlashmSlashDateTimeInput.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DateTimePicker")(sapSlashmSlashDateTimePicker.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Dialog")(sapSlashmSlashDialog.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DisplayListItem")(sapSlashmSlashDisplayListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DraftIndicator")(sapSlashmSlashDraftIndicator.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DynamicDate")(sapSlashmSlashDynamicDate.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DynamicDateFormat")(sapSlashmSlashDynamicDateFormat.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DynamicDateOption")(sapSlashmSlashDynamicDateOption.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DynamicDateRange")(sapSlashmSlashDynamicDateRange.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DynamicDateUtil")(sapSlashmSlashDynamicDateUtil.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/DynamicDateValueHelpUIType")(sapSlashmSlashDynamicDateValueHelpUIType.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ExpandableText")(sapSlashmSlashExpandableText.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FacetFilter")(sapSlashmSlashFacetFilter.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FacetFilterItem")(sapSlashmSlashFacetFilterItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FacetFilterList")(sapSlashmSlashFacetFilterList.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FeedContent")(sapSlashmSlashFeedContent.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FeedInput")(sapSlashmSlashFeedInput.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FeedListItem")(sapSlashmSlashFeedListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FeedListItemAction")(sapSlashmSlashFeedListItemAction.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FlexBox")(sapSlashmSlashFlexBox.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FlexItemData")(sapSlashmSlashFlexItemData.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/FormattedText")(sapSlashmSlashFormattedText.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/GenericTag")(sapSlashmSlashGenericTag.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/GenericTile")(sapSlashmSlashGenericTile.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/GroupHeaderListItem")(sapSlashmSlashGroupHeaderListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/GrowingEnablement")(sapSlashmSlashGrowingEnablement.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/GrowingList")(sapSlashmSlashGrowingList.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/HBox")(sapSlashmSlashHBox.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/HeaderContainer")(sapSlashmSlashHeaderContainer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IconTabBar")(sapSlashmSlashIconTabBar.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IconTabFilter")(sapSlashmSlashIconTabFilter.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IconTabHeader")(sapSlashmSlashIconTabHeader.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IconTabSeparator")(sapSlashmSlashIconTabSeparator.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IllustratedMessage")(sapSlashmSlashIllustratedMessage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IllustratedMessageSize")(sapSlashmSlashIllustratedMessageSize.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IllustratedMessageType")(sapSlashmSlashIllustratedMessageType.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Illustration")(sapSlashmSlashIllustration.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/IllustrationPool")(sapSlashmSlashIllustrationPool.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Image")(sapSlashmSlashImage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ImageContent")(sapSlashmSlashImageContent.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Input")(sapSlashmSlashInput.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/InputBase")(sapSlashmSlashInputBase.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/InputBaseRenderer")(sapSlashmSlashInputBaseRenderer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/InputListItem")(sapSlashmSlashInputListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/InputRenderer")(sapSlashmSlashInputRenderer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/InstanceManager")(sapSlashmSlashInstanceManager.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Label")(sapSlashmSlashLabel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/LightBox")(sapSlashmSlashLightBox.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/LightBoxItem")(sapSlashmSlashLightBoxItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Link")(sapSlashmSlashLink.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/List")(sapSlashmSlashList.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ListBase")(sapSlashmSlashListBase.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ListItemBase")(sapSlashmSlashListItemBase.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MaskInput")(sapSlashmSlashMaskInput.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MaskInputRule")(sapSlashmSlashMaskInputRule.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Menu")(sapSlashmSlashMenu.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MenuButton")(sapSlashmSlashMenuButton.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MenuItem")(sapSlashmSlashMenuItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessageBox")(sapSlashmSlashMessageBox.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessageItem")(sapSlashmSlashMessageItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessagePage")(sapSlashmSlashMessagePage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessagePopover")(sapSlashmSlashMessagePopover.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessagePopoverItem")(sapSlashmSlashMessagePopoverItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessageStrip")(sapSlashmSlashMessageStrip.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessageToast")(sapSlashmSlashMessageToast.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MessageView")(sapSlashmSlashMessageView.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MultiComboBox")(sapSlashmSlashMultiComboBox.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MultiEditField")(sapSlashmSlashMultiEditField.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/MultiInput")(sapSlashmSlashMultiInput.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/NavContainer")(sapSlashmSlashNavContainer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/NewsContent")(sapSlashmSlashNewsContent.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/NotificationList")(sapSlashmSlashNotificationList.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/NotificationListBase")(sapSlashmSlashNotificationListBase.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/NotificationListGroup")(sapSlashmSlashNotificationListGroup.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/NotificationListItem")(sapSlashmSlashNotificationListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/NumericContent")(sapSlashmSlashNumericContent.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ObjectAttribute")(sapSlashmSlashObjectAttribute.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ObjectHeader")(sapSlashmSlashObjectHeader.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ObjectIdentifier")(sapSlashmSlashObjectIdentifier.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ObjectListItem")(sapSlashmSlashObjectListItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ObjectMarker")(sapSlashmSlashObjectMarker.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ObjectNumber")(sapSlashmSlashObjectNumber.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/ObjectStatus")(sapSlashmSlashObjectStatus.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/OverflowToolbar")(sapSlashmSlashOverflowToolbar.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/OverflowToolbarButton")(sapSlashmSlashOverflowToolbarButton.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/OverflowToolbarLayoutData")(sapSlashmSlashOverflowToolbarLayoutData.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/OverflowToolbarMenuButton")(sapSlashmSlashOverflowToolbarMenuButton.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/OverflowToolbarToggleButton")(sapSlashmSlashOverflowToolbarToggleButton.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nColumnsItem")(sapSlashmSlashP13nColumnsItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nColumnsPanel")(sapSlashmSlashP13nColumnsPanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nConditionPanel")(sapSlashmSlashP13nConditionPanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nDialog")(sapSlashmSlashP13nDialog.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nDimMeasureItem")(sapSlashmSlashP13nDimMeasureItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nDimMeasurePanel")(sapSlashmSlashP13nDimMeasurePanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nFilterItem")(sapSlashmSlashP13nFilterItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nFilterPanel")(sapSlashmSlashP13nFilterPanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nGroupItem")(sapSlashmSlashP13nGroupItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nGroupPanel")(sapSlashmSlashP13nGroupPanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nItem")(sapSlashmSlashP13nItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nOperationsHelper")(sapSlashmSlashP13nOperationsHelper.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nPanel")(sapSlashmSlashP13nPanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nSortItem")(sapSlashmSlashP13nSortItem.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/P13nSortPanel")(sapSlashmSlashP13nSortPanel.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/PDFViewer")(sapSlashmSlashPDFViewer.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/Page")(sapSlashmSlashPage.asInstanceOf[js.Any])
      __obj.updateDynamic("sap/m/PageAccessibleLandmarkInfo")(sapSlashmSlashPageAccessibleLandmarkInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUI5DefineDependencyNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUI5DefineDependencyNames] (val x: Self) extends AnyVal {
      
      inline def setJqueryDotsapDotact(value: Unit): Self = StObject.set(x, "jquery.sap.act", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotevents(value: Unit): Self = StObject.set(x, "jquery.sap.events", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotglobal(value: Unit): Self = StObject.set(x, "jquery.sap.global", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDothistory(value: Unit): Self = StObject.set(x, "jquery.sap.history", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotkeycodes(value: Unit): Self = StObject.set(x, "jquery.sap.keycodes", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotmobile(value: Unit): Self = StObject.set(x, "jquery.sap.mobile", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotproperties(value: Unit): Self = StObject.set(x, "jquery.sap.properties", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotresources(value: Unit): Self = StObject.set(x, "jquery.sap.resources", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotscript(value: Unit): Self = StObject.set(x, "jquery.sap.script", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDotstorage(value: Unit): Self = StObject.set(x, "jquery.sap.storage", value.asInstanceOf[js.Any])
      
      inline def setJqueryDotsapDottrace(value: Unit): Self = StObject.set(x, "jquery.sap.trace", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashLog(value: Unit): Self = StObject.set(x, "sap/base/Log", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashassert(value: Unit): Self = StObject.set(x, "sap/base/assert", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashi18nSlashResourceBundle(value: Unit): Self = StObject.set(x, "sap/base/i18n/ResourceBundle", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashsecuritySlashURLListValidator(value: Unit): Self = StObject.set(x, "sap/base/security/URLListValidator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashsecuritySlashURLWhitelist(value: Unit): Self = StObject.set(x, "sap/base/security/URLWhitelist", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashsecuritySlashencodeCSS(value: Unit): Self = StObject.set(x, "sap/base/security/encodeCSS", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashsecuritySlashencodeJS(value: Unit): Self = StObject.set(x, "sap/base/security/encodeJS", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashsecuritySlashencodeURL(value: Unit): Self = StObject.set(x, "sap/base/security/encodeURL", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashsecuritySlashencodeURLParameters(value: Unit): Self = StObject.set(x, "sap/base/security/encodeURLParameters", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashsecuritySlashencodeXML(value: Unit): Self = StObject.set(x, "sap/base/security/encodeXML", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashstringsSlashcamelize(value: Unit): Self = StObject.set(x, "sap/base/strings/camelize", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashstringsSlashcapitalize(value: Unit): Self = StObject.set(x, "sap/base/strings/capitalize", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashstringsSlashescapeRegExp(value: Unit): Self = StObject.set(x, "sap/base/strings/escapeRegExp", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashstringsSlashformatMessage(value: Unit): Self = StObject.set(x, "sap/base/strings/formatMessage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashstringsSlashhyphenate(value: Unit): Self = StObject.set(x, "sap/base/strings/hyphenate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashstringsSlashwhitespaceReplacer(value: Unit): Self = StObject.set(x, "sap/base/strings/whitespaceReplacer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashDeferred(value: Unit): Self = StObject.set(x, "sap/base/util/Deferred", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashJSTokenizer(value: Unit): Self = StObject.set(x, "sap/base/util/JSTokenizer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashLoaderExtensions(value: Unit): Self = StObject.set(x, "sap/base/util/LoaderExtensions", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashObjectPath(value: Unit): Self = StObject.set(x, "sap/base/util/ObjectPath", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashProperties(value: Unit): Self = StObject.set(x, "sap/base/util/Properties", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashUriParameters(value: Unit): Self = StObject.set(x, "sap/base/util/UriParameters", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashVersion(value: Unit): Self = StObject.set(x, "sap/base/util/Version", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlasharraySlashdiff(value: Unit): Self = StObject.set(x, "sap/base/util/array/diff", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlasharraySlashuniqueSort(value: Unit): Self = StObject.set(x, "sap/base/util/array/uniqueSort", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashdeepClone(value: Unit): Self = StObject.set(x, "sap/base/util/deepClone", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashdeepEqual(value: Unit): Self = StObject.set(x, "sap/base/util/deepEqual", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashdeepExtend(value: Unit): Self = StObject.set(x, "sap/base/util/deepExtend", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashdefineCoupledProperty(value: Unit): Self = StObject.set(x, "sap/base/util/defineCoupledProperty", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashdefineLazyProperty(value: Unit): Self = StObject.set(x, "sap/base/util/defineLazyProperty", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlasheach(value: Unit): Self = StObject.set(x, "sap/base/util/each", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashextend(value: Unit): Self = StObject.set(x, "sap/base/util/extend", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashfetch(value: Unit): Self = StObject.set(x, "sap/base/util/fetch", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashincludes(value: Unit): Self = StObject.set(x, "sap/base/util/includes", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashisEmptyObject(value: Unit): Self = StObject.set(x, "sap/base/util/isEmptyObject", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashisPlainObject(value: Unit): Self = StObject.set(x, "sap/base/util/isPlainObject", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashmerge(value: Unit): Self = StObject.set(x, "sap/base/util/merge", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashmixedFetch(value: Unit): Self = StObject.set(x, "sap/base/util/mixedFetch", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashnow(value: Unit): Self = StObject.set(x, "sap/base/util/now", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashresolveReference(value: Unit): Self = StObject.set(x, "sap/base/util/resolveReference", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashsyncFetch(value: Unit): Self = StObject.set(x, "sap/base/util/syncFetch", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashuid(value: Unit): Self = StObject.set(x, "sap/base/util/uid", value.asInstanceOf[js.Any])
      
      inline def setSapSlashbaseSlashutilSlashvalues(value: Unit): Self = StObject.set(x, "sap/base/util/values", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashAvatar(value: Unit): Self = StObject.set(x, "sap/f/Avatar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashAvatarGroup(value: Unit): Self = StObject.set(x, "sap/f/AvatarGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashAvatarGroupItem(value: Unit): Self = StObject.set(x, "sap/f/AvatarGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashCard(value: Unit): Self = StObject.set(x, "sap/f/Card", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashCardBase(value: Unit): Self = StObject.set(x, "sap/f/CardBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashDynamicPage(value: Unit): Self = StObject.set(x, "sap/f/DynamicPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashDynamicPageAccessibleLandmarkInfo(value: Unit): Self = StObject.set(x, "sap/f/DynamicPageAccessibleLandmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashDynamicPageHeader(value: Unit): Self = StObject.set(x, "sap/f/DynamicPageHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashDynamicPageTitle(value: Unit): Self = StObject.set(x, "sap/f/DynamicPageTitle", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashFlexibleColumnLayout(value: Unit): Self = StObject.set(x, "sap/f/FlexibleColumnLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashFlexibleColumnLayoutAccessibleLandmarkInfo(value: Unit): Self = StObject.set(x, "sap/f/FlexibleColumnLayoutAccessibleLandmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashFlexibleColumnLayoutSemanticHelper(value: Unit): Self = StObject.set(x, "sap/f/FlexibleColumnLayoutSemanticHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashGridContainer(value: Unit): Self = StObject.set(x, "sap/f/GridContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashGridContainerItemLayoutData(value: Unit): Self = StObject.set(x, "sap/f/GridContainerItemLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashGridContainerSettings(value: Unit): Self = StObject.set(x, "sap/f/GridContainerSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashGridList(value: Unit): Self = StObject.set(x, "sap/f/GridList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashGridListItem(value: Unit): Self = StObject.set(x, "sap/f/GridListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashIllustratedMessage(value: Unit): Self = StObject.set(x, "sap/f/IllustratedMessage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashIllustration(value: Unit): Self = StObject.set(x, "sap/f/Illustration", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashIllustrationPool(value: Unit): Self = StObject.set(x, "sap/f/IllustrationPool", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashProductSwitch(value: Unit): Self = StObject.set(x, "sap/f/ProductSwitch", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashProductSwitchItem(value: Unit): Self = StObject.set(x, "sap/f/ProductSwitchItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashSearchManager(value: Unit): Self = StObject.set(x, "sap/f/SearchManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashShellBar(value: Unit): Self = StObject.set(x, "sap/f/ShellBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashSidePanel(value: Unit): Self = StObject.set(x, "sap/f/SidePanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashSidePanelItem(value: Unit): Self = StObject.set(x, "sap/f/SidePanelItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashcardsSlashBaseHeader(value: Unit): Self = StObject.set(x, "sap/f/cards/BaseHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashcardsSlashHeader(value: Unit): Self = StObject.set(x, "sap/f/cards/Header", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashcardsSlashNumericHeader(value: Unit): Self = StObject.set(x, "sap/f/cards/NumericHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashcardsSlashNumericSideIndicator(value: Unit): Self = StObject.set(x, "sap/f/cards/NumericSideIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashdndSlashGridDropInfo(value: Unit): Self = StObject.set(x, "sap/f/dnd/GridDropInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashlibrary(value: Unit): Self = StObject.set(x, "sap/f/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashroutingSlashRouter(value: Unit): Self = StObject.set(x, "sap/f/routing/Router", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashroutingSlashTargetHandler(value: Unit): Self = StObject.set(x, "sap/f/routing/TargetHandler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashroutingSlashTargets(value: Unit): Self = StObject.set(x, "sap/f/routing/Targets", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashAddAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/AddAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashCloseAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/CloseAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashCopyAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/CopyAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashDeleteAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/DeleteAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashDiscussInJamAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/DiscussInJamAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashEditAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/EditAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashExitFullScreenAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/ExitFullScreenAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashFavoriteAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/FavoriteAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashFlagAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/FlagAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashFooterMainAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/FooterMainAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashFullScreenAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/FullScreenAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashMainAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/MainAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashMessagesIndicator(value: Unit): Self = StObject.set(x, "sap/f/semantic/MessagesIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashNegativeAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/NegativeAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashPositiveAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/PositiveAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashPrintAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/PrintAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashSemanticButton(value: Unit): Self = StObject.set(x, "sap/f/semantic/SemanticButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashSemanticControl(value: Unit): Self = StObject.set(x, "sap/f/semantic/SemanticControl", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashSemanticPage(value: Unit): Self = StObject.set(x, "sap/f/semantic/SemanticPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashSemanticToggleButton(value: Unit): Self = StObject.set(x, "sap/f/semantic/SemanticToggleButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashSendEmailAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/SendEmailAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashSendMessageAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/SendMessageAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashShareInJamAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/ShareInJamAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashfSlashsemanticSlashTitleMainAction(value: Unit): Self = StObject.set(x, "sap/f/semantic/TitleMainAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashActionListItem(value: Unit): Self = StObject.set(x, "sap/m/ActionListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashActionSelect(value: Unit): Self = StObject.set(x, "sap/m/ActionSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashActionSheet(value: Unit): Self = StObject.set(x, "sap/m/ActionSheet", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashApp(value: Unit): Self = StObject.set(x, "sap/m/App", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashAvatar(value: Unit): Self = StObject.set(x, "sap/m/Avatar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashAvatarColor(value: Unit): Self = StObject.set(x, "sap/m/AvatarColor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashAvatarImageFitType(value: Unit): Self = StObject.set(x, "sap/m/AvatarImageFitType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashAvatarShape(value: Unit): Self = StObject.set(x, "sap/m/AvatarShape", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashAvatarSize(value: Unit): Self = StObject.set(x, "sap/m/AvatarSize", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashAvatarType(value: Unit): Self = StObject.set(x, "sap/m/AvatarType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashBadgeCustomData(value: Unit): Self = StObject.set(x, "sap/m/BadgeCustomData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashBadgeEnabler(value: Unit): Self = StObject.set(x, "sap/m/BadgeEnabler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashBar(value: Unit): Self = StObject.set(x, "sap/m/Bar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashBarInPageEnabler(value: Unit): Self = StObject.set(x, "sap/m/BarInPageEnabler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashBreadcrumbs(value: Unit): Self = StObject.set(x, "sap/m/Breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashBusyDialog(value: Unit): Self = StObject.set(x, "sap/m/BusyDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashBusyIndicator(value: Unit): Self = StObject.set(x, "sap/m/BusyIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashButton(value: Unit): Self = StObject.set(x, "sap/m/Button", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashCarousel(value: Unit): Self = StObject.set(x, "sap/m/Carousel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashCarouselLayout(value: Unit): Self = StObject.set(x, "sap/m/CarouselLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashCheckBox(value: Unit): Self = StObject.set(x, "sap/m/CheckBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashColorPalette(value: Unit): Self = StObject.set(x, "sap/m/ColorPalette", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashColorPalettePopover(value: Unit): Self = StObject.set(x, "sap/m/ColorPalettePopover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashColumn(value: Unit): Self = StObject.set(x, "sap/m/Column", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashColumnListItem(value: Unit): Self = StObject.set(x, "sap/m/ColumnListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashComboBox(value: Unit): Self = StObject.set(x, "sap/m/ComboBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashComboBoxBase(value: Unit): Self = StObject.set(x, "sap/m/ComboBoxBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashComboBoxTextField(value: Unit): Self = StObject.set(x, "sap/m/ComboBoxTextField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashCustomDynamicDateOption(value: Unit): Self = StObject.set(x, "sap/m/CustomDynamicDateOption", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashCustomListItem(value: Unit): Self = StObject.set(x, "sap/m/CustomListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashCustomTile(value: Unit): Self = StObject.set(x, "sap/m/CustomTile", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashCustomTreeItem(value: Unit): Self = StObject.set(x, "sap/m/CustomTreeItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDatePicker(value: Unit): Self = StObject.set(x, "sap/m/DatePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDateRangeSelection(value: Unit): Self = StObject.set(x, "sap/m/DateRangeSelection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDateTimeField(value: Unit): Self = StObject.set(x, "sap/m/DateTimeField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDateTimeInput(value: Unit): Self = StObject.set(x, "sap/m/DateTimeInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDateTimePicker(value: Unit): Self = StObject.set(x, "sap/m/DateTimePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDialog(value: Unit): Self = StObject.set(x, "sap/m/Dialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDisplayListItem(value: Unit): Self = StObject.set(x, "sap/m/DisplayListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDraftIndicator(value: Unit): Self = StObject.set(x, "sap/m/DraftIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDynamicDate(value: Unit): Self = StObject.set(x, "sap/m/DynamicDate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDynamicDateFormat(value: Unit): Self = StObject.set(x, "sap/m/DynamicDateFormat", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDynamicDateOption(value: Unit): Self = StObject.set(x, "sap/m/DynamicDateOption", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDynamicDateRange(value: Unit): Self = StObject.set(x, "sap/m/DynamicDateRange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDynamicDateUtil(value: Unit): Self = StObject.set(x, "sap/m/DynamicDateUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashDynamicDateValueHelpUIType(value: Unit): Self = StObject.set(x, "sap/m/DynamicDateValueHelpUIType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashExpandableText(value: Unit): Self = StObject.set(x, "sap/m/ExpandableText", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFacetFilter(value: Unit): Self = StObject.set(x, "sap/m/FacetFilter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFacetFilterItem(value: Unit): Self = StObject.set(x, "sap/m/FacetFilterItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFacetFilterList(value: Unit): Self = StObject.set(x, "sap/m/FacetFilterList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFeedContent(value: Unit): Self = StObject.set(x, "sap/m/FeedContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFeedInput(value: Unit): Self = StObject.set(x, "sap/m/FeedInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFeedListItem(value: Unit): Self = StObject.set(x, "sap/m/FeedListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFeedListItemAction(value: Unit): Self = StObject.set(x, "sap/m/FeedListItemAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFlexBox(value: Unit): Self = StObject.set(x, "sap/m/FlexBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFlexItemData(value: Unit): Self = StObject.set(x, "sap/m/FlexItemData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashFormattedText(value: Unit): Self = StObject.set(x, "sap/m/FormattedText", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashGenericTag(value: Unit): Self = StObject.set(x, "sap/m/GenericTag", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashGenericTile(value: Unit): Self = StObject.set(x, "sap/m/GenericTile", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashGroupHeaderListItem(value: Unit): Self = StObject.set(x, "sap/m/GroupHeaderListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashGrowingEnablement(value: Unit): Self = StObject.set(x, "sap/m/GrowingEnablement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashGrowingList(value: Unit): Self = StObject.set(x, "sap/m/GrowingList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashHBox(value: Unit): Self = StObject.set(x, "sap/m/HBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashHeaderContainer(value: Unit): Self = StObject.set(x, "sap/m/HeaderContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIconTabBar(value: Unit): Self = StObject.set(x, "sap/m/IconTabBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIconTabFilter(value: Unit): Self = StObject.set(x, "sap/m/IconTabFilter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIconTabHeader(value: Unit): Self = StObject.set(x, "sap/m/IconTabHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIconTabSeparator(value: Unit): Self = StObject.set(x, "sap/m/IconTabSeparator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIllustratedMessage(value: Unit): Self = StObject.set(x, "sap/m/IllustratedMessage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIllustratedMessageSize(value: Unit): Self = StObject.set(x, "sap/m/IllustratedMessageSize", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIllustratedMessageType(value: Unit): Self = StObject.set(x, "sap/m/IllustratedMessageType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIllustration(value: Unit): Self = StObject.set(x, "sap/m/Illustration", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashIllustrationPool(value: Unit): Self = StObject.set(x, "sap/m/IllustrationPool", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashImage(value: Unit): Self = StObject.set(x, "sap/m/Image", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashImageContent(value: Unit): Self = StObject.set(x, "sap/m/ImageContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashInput(value: Unit): Self = StObject.set(x, "sap/m/Input", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashInputBase(value: Unit): Self = StObject.set(x, "sap/m/InputBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashInputBaseRenderer(value: Unit): Self = StObject.set(x, "sap/m/InputBaseRenderer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashInputListItem(value: Unit): Self = StObject.set(x, "sap/m/InputListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashInputRenderer(value: Unit): Self = StObject.set(x, "sap/m/InputRenderer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashInstanceManager(value: Unit): Self = StObject.set(x, "sap/m/InstanceManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashLabel(value: Unit): Self = StObject.set(x, "sap/m/Label", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashLightBox(value: Unit): Self = StObject.set(x, "sap/m/LightBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashLightBoxItem(value: Unit): Self = StObject.set(x, "sap/m/LightBoxItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashLink(value: Unit): Self = StObject.set(x, "sap/m/Link", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashList(value: Unit): Self = StObject.set(x, "sap/m/List", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashListBase(value: Unit): Self = StObject.set(x, "sap/m/ListBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashListItemBase(value: Unit): Self = StObject.set(x, "sap/m/ListItemBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMaskInput(value: Unit): Self = StObject.set(x, "sap/m/MaskInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMaskInputRule(value: Unit): Self = StObject.set(x, "sap/m/MaskInputRule", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMenu(value: Unit): Self = StObject.set(x, "sap/m/Menu", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMenuButton(value: Unit): Self = StObject.set(x, "sap/m/MenuButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMenuItem(value: Unit): Self = StObject.set(x, "sap/m/MenuItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessageBox(value: Unit): Self = StObject.set(x, "sap/m/MessageBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessageItem(value: Unit): Self = StObject.set(x, "sap/m/MessageItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessagePage(value: Unit): Self = StObject.set(x, "sap/m/MessagePage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessagePopover(value: Unit): Self = StObject.set(x, "sap/m/MessagePopover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessagePopoverItem(value: Unit): Self = StObject.set(x, "sap/m/MessagePopoverItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessageStrip(value: Unit): Self = StObject.set(x, "sap/m/MessageStrip", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessageToast(value: Unit): Self = StObject.set(x, "sap/m/MessageToast", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMessageView(value: Unit): Self = StObject.set(x, "sap/m/MessageView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMultiComboBox(value: Unit): Self = StObject.set(x, "sap/m/MultiComboBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMultiEditField(value: Unit): Self = StObject.set(x, "sap/m/MultiEditField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashMultiInput(value: Unit): Self = StObject.set(x, "sap/m/MultiInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashNavContainer(value: Unit): Self = StObject.set(x, "sap/m/NavContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashNewsContent(value: Unit): Self = StObject.set(x, "sap/m/NewsContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashNotificationList(value: Unit): Self = StObject.set(x, "sap/m/NotificationList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashNotificationListBase(value: Unit): Self = StObject.set(x, "sap/m/NotificationListBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashNotificationListGroup(value: Unit): Self = StObject.set(x, "sap/m/NotificationListGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashNotificationListItem(value: Unit): Self = StObject.set(x, "sap/m/NotificationListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashNumericContent(value: Unit): Self = StObject.set(x, "sap/m/NumericContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashObjectAttribute(value: Unit): Self = StObject.set(x, "sap/m/ObjectAttribute", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashObjectHeader(value: Unit): Self = StObject.set(x, "sap/m/ObjectHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashObjectIdentifier(value: Unit): Self = StObject.set(x, "sap/m/ObjectIdentifier", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashObjectListItem(value: Unit): Self = StObject.set(x, "sap/m/ObjectListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashObjectMarker(value: Unit): Self = StObject.set(x, "sap/m/ObjectMarker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashObjectNumber(value: Unit): Self = StObject.set(x, "sap/m/ObjectNumber", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashObjectStatus(value: Unit): Self = StObject.set(x, "sap/m/ObjectStatus", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashOverflowToolbar(value: Unit): Self = StObject.set(x, "sap/m/OverflowToolbar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashOverflowToolbarButton(value: Unit): Self = StObject.set(x, "sap/m/OverflowToolbarButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashOverflowToolbarLayoutData(value: Unit): Self = StObject.set(x, "sap/m/OverflowToolbarLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashOverflowToolbarMenuButton(value: Unit): Self = StObject.set(x, "sap/m/OverflowToolbarMenuButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashOverflowToolbarToggleButton(value: Unit): Self = StObject.set(x, "sap/m/OverflowToolbarToggleButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nColumnsItem(value: Unit): Self = StObject.set(x, "sap/m/P13nColumnsItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nColumnsPanel(value: Unit): Self = StObject.set(x, "sap/m/P13nColumnsPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nConditionPanel(value: Unit): Self = StObject.set(x, "sap/m/P13nConditionPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nDialog(value: Unit): Self = StObject.set(x, "sap/m/P13nDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nDimMeasureItem(value: Unit): Self = StObject.set(x, "sap/m/P13nDimMeasureItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nDimMeasurePanel(value: Unit): Self = StObject.set(x, "sap/m/P13nDimMeasurePanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nFilterItem(value: Unit): Self = StObject.set(x, "sap/m/P13nFilterItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nFilterPanel(value: Unit): Self = StObject.set(x, "sap/m/P13nFilterPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nGroupItem(value: Unit): Self = StObject.set(x, "sap/m/P13nGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nGroupPanel(value: Unit): Self = StObject.set(x, "sap/m/P13nGroupPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nItem(value: Unit): Self = StObject.set(x, "sap/m/P13nItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nOperationsHelper(value: Unit): Self = StObject.set(x, "sap/m/P13nOperationsHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nPanel(value: Unit): Self = StObject.set(x, "sap/m/P13nPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nSortItem(value: Unit): Self = StObject.set(x, "sap/m/P13nSortItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashP13nSortPanel(value: Unit): Self = StObject.set(x, "sap/m/P13nSortPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPDFViewer(value: Unit): Self = StObject.set(x, "sap/m/PDFViewer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPage(value: Unit): Self = StObject.set(x, "sap/m/Page", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPageAccessibleLandmarkInfo(value: Unit): Self = StObject.set(x, "sap/m/PageAccessibleLandmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPagingButton(value: Unit): Self = StObject.set(x, "sap/m/PagingButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPanel(value: Unit): Self = StObject.set(x, "sap/m/Panel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPlanningCalendar(value: Unit): Self = StObject.set(x, "sap/m/PlanningCalendar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPlanningCalendarLegend(value: Unit): Self = StObject.set(x, "sap/m/PlanningCalendarLegend", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPlanningCalendarRow(value: Unit): Self = StObject.set(x, "sap/m/PlanningCalendarRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPlanningCalendarView(value: Unit): Self = StObject.set(x, "sap/m/PlanningCalendarView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPopover(value: Unit): Self = StObject.set(x, "sap/m/Popover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashProgressIndicator(value: Unit): Self = StObject.set(x, "sap/m/ProgressIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashPullToRefresh(value: Unit): Self = StObject.set(x, "sap/m/PullToRefresh", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashQuickView(value: Unit): Self = StObject.set(x, "sap/m/QuickView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashQuickViewBase(value: Unit): Self = StObject.set(x, "sap/m/QuickViewBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashQuickViewCard(value: Unit): Self = StObject.set(x, "sap/m/QuickViewCard", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashQuickViewGroup(value: Unit): Self = StObject.set(x, "sap/m/QuickViewGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashQuickViewGroupElement(value: Unit): Self = StObject.set(x, "sap/m/QuickViewGroupElement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashQuickViewPage(value: Unit): Self = StObject.set(x, "sap/m/QuickViewPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashRadioButton(value: Unit): Self = StObject.set(x, "sap/m/RadioButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashRadioButtonGroup(value: Unit): Self = StObject.set(x, "sap/m/RadioButtonGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashRangeSlider(value: Unit): Self = StObject.set(x, "sap/m/RangeSlider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashRatingIndicator(value: Unit): Self = StObject.set(x, "sap/m/RatingIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashResponsivePopover(value: Unit): Self = StObject.set(x, "sap/m/ResponsivePopover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashResponsiveScale(value: Unit): Self = StObject.set(x, "sap/m/ResponsiveScale", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashScrollContainer(value: Unit): Self = StObject.set(x, "sap/m/ScrollContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSearchField(value: Unit): Self = StObject.set(x, "sap/m/SearchField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSegmentedButton(value: Unit): Self = StObject.set(x, "sap/m/SegmentedButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSegmentedButtonItem(value: Unit): Self = StObject.set(x, "sap/m/SegmentedButtonItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelect(value: Unit): Self = StObject.set(x, "sap/m/Select", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelectDialog(value: Unit): Self = StObject.set(x, "sap/m/SelectDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelectDialogBase(value: Unit): Self = StObject.set(x, "sap/m/SelectDialogBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelectList(value: Unit): Self = StObject.set(x, "sap/m/SelectList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelectionDetails(value: Unit): Self = StObject.set(x, "sap/m/SelectionDetails", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelectionDetailsFacade(value: Unit): Self = StObject.set(x, "sap/m/SelectionDetailsFacade", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelectionDetailsItem(value: Unit): Self = StObject.set(x, "sap/m/SelectionDetailsItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSelectionDetailsItemLine(value: Unit): Self = StObject.set(x, "sap/m/SelectionDetailsItemLine", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashShell(value: Unit): Self = StObject.set(x, "sap/m/Shell", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSinglePlanningCalendar(value: Unit): Self = StObject.set(x, "sap/m/SinglePlanningCalendar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSinglePlanningCalendarDayView(value: Unit): Self = StObject.set(x, "sap/m/SinglePlanningCalendarDayView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSinglePlanningCalendarMonthView(value: Unit): Self = StObject.set(x, "sap/m/SinglePlanningCalendarMonthView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSinglePlanningCalendarView(value: Unit): Self = StObject.set(x, "sap/m/SinglePlanningCalendarView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSinglePlanningCalendarWeekView(value: Unit): Self = StObject.set(x, "sap/m/SinglePlanningCalendarWeekView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSinglePlanningCalendarWorkWeekView(value: Unit): Self = StObject.set(x, "sap/m/SinglePlanningCalendarWorkWeekView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSlideTile(value: Unit): Self = StObject.set(x, "sap/m/SlideTile", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSlider(value: Unit): Self = StObject.set(x, "sap/m/Slider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSliderTooltipBase(value: Unit): Self = StObject.set(x, "sap/m/SliderTooltipBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSplitApp(value: Unit): Self = StObject.set(x, "sap/m/SplitApp", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSplitButton(value: Unit): Self = StObject.set(x, "sap/m/SplitButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSplitContainer(value: Unit): Self = StObject.set(x, "sap/m/SplitContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashStandardDynamicDateOption(value: Unit): Self = StObject.set(x, "sap/m/StandardDynamicDateOption", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashStandardListItem(value: Unit): Self = StObject.set(x, "sap/m/StandardListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashStandardTile(value: Unit): Self = StObject.set(x, "sap/m/StandardTile", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashStandardTreeItem(value: Unit): Self = StObject.set(x, "sap/m/StandardTreeItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashStepInput(value: Unit): Self = StObject.set(x, "sap/m/StepInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSuggestionItem(value: Unit): Self = StObject.set(x, "sap/m/SuggestionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashSwitch(value: Unit): Self = StObject.set(x, "sap/m/Switch", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTabContainer(value: Unit): Self = StObject.set(x, "sap/m/TabContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTabContainerItem(value: Unit): Self = StObject.set(x, "sap/m/TabContainerItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTable(value: Unit): Self = StObject.set(x, "sap/m/Table", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTablePersoController(value: Unit): Self = StObject.set(x, "sap/m/TablePersoController", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTablePersoDialog(value: Unit): Self = StObject.set(x, "sap/m/TablePersoDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTablePersoProvider(value: Unit): Self = StObject.set(x, "sap/m/TablePersoProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTableSelectDialog(value: Unit): Self = StObject.set(x, "sap/m/TableSelectDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashText(value: Unit): Self = StObject.set(x, "sap/m/Text", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTextArea(value: Unit): Self = StObject.set(x, "sap/m/TextArea", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTile(value: Unit): Self = StObject.set(x, "sap/m/Tile", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTileContainer(value: Unit): Self = StObject.set(x, "sap/m/TileContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTileContent(value: Unit): Self = StObject.set(x, "sap/m/TileContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTimePicker(value: Unit): Self = StObject.set(x, "sap/m/TimePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTimePickerClocks(value: Unit): Self = StObject.set(x, "sap/m/TimePickerClocks", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTimePickerInputs(value: Unit): Self = StObject.set(x, "sap/m/TimePickerInputs", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTimePickerSliders(value: Unit): Self = StObject.set(x, "sap/m/TimePickerSliders", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTitle(value: Unit): Self = StObject.set(x, "sap/m/Title", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashToggleButton(value: Unit): Self = StObject.set(x, "sap/m/ToggleButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashToken(value: Unit): Self = StObject.set(x, "sap/m/Token", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTokenizer(value: Unit): Self = StObject.set(x, "sap/m/Tokenizer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashToolbar(value: Unit): Self = StObject.set(x, "sap/m/Toolbar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashToolbarLayoutData(value: Unit): Self = StObject.set(x, "sap/m/ToolbarLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashToolbarSeparator(value: Unit): Self = StObject.set(x, "sap/m/ToolbarSeparator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashToolbarSpacer(value: Unit): Self = StObject.set(x, "sap/m/ToolbarSpacer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTree(value: Unit): Self = StObject.set(x, "sap/m/Tree", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashTreeItemBase(value: Unit): Self = StObject.set(x, "sap/m/TreeItemBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashUploadCollection(value: Unit): Self = StObject.set(x, "sap/m/UploadCollection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashUploadCollectionItem(value: Unit): Self = StObject.set(x, "sap/m/UploadCollectionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashUploadCollectionParameter(value: Unit): Self = StObject.set(x, "sap/m/UploadCollectionParameter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashUploadCollectionToolbarPlaceholder(value: Unit): Self = StObject.set(x, "sap/m/UploadCollectionToolbarPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashVBox(value: Unit): Self = StObject.set(x, "sap/m/VBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashVariantItem(value: Unit): Self = StObject.set(x, "sap/m/VariantItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashVariantManagement(value: Unit): Self = StObject.set(x, "sap/m/VariantManagement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashViewSettingsCustomItem(value: Unit): Self = StObject.set(x, "sap/m/ViewSettingsCustomItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashViewSettingsCustomTab(value: Unit): Self = StObject.set(x, "sap/m/ViewSettingsCustomTab", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashViewSettingsDialog(value: Unit): Self = StObject.set(x, "sap/m/ViewSettingsDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashViewSettingsFilterItem(value: Unit): Self = StObject.set(x, "sap/m/ViewSettingsFilterItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashViewSettingsItem(value: Unit): Self = StObject.set(x, "sap/m/ViewSettingsItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashWheelSlider(value: Unit): Self = StObject.set(x, "sap/m/WheelSlider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashWheelSliderContainer(value: Unit): Self = StObject.set(x, "sap/m/WheelSliderContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashWizard(value: Unit): Self = StObject.set(x, "sap/m/Wizard", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashWizardStep(value: Unit): Self = StObject.set(x, "sap/m/WizardStep", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashlibrary(value: Unit): Self = StObject.set(x, "sap/m/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashAbstractContainer(value: Unit): Self = StObject.set(x, "sap/m/p13n/AbstractContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashAbstractContainerItem(value: Unit): Self = StObject.set(x, "sap/m/p13n/AbstractContainerItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashBasePanel(value: Unit): Self = StObject.set(x, "sap/m/p13n/BasePanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashContainer(value: Unit): Self = StObject.set(x, "sap/m/p13n/Container", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashEngine(value: Unit): Self = StObject.set(x, "sap/m/p13n/Engine", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashGroupController(value: Unit): Self = StObject.set(x, "sap/m/p13n/GroupController", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashGroupPanel(value: Unit): Self = StObject.set(x, "sap/m/p13n/GroupPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashMetadataHelper(value: Unit): Self = StObject.set(x, "sap/m/p13n/MetadataHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashPopup(value: Unit): Self = StObject.set(x, "sap/m/p13n/Popup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashQueryPanel(value: Unit): Self = StObject.set(x, "sap/m/p13n/QueryPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashSelectionController(value: Unit): Self = StObject.set(x, "sap/m/p13n/SelectionController", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashSelectionPanel(value: Unit): Self = StObject.set(x, "sap/m/p13n/SelectionPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashSortController(value: Unit): Self = StObject.set(x, "sap/m/p13n/SortController", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashSortPanel(value: Unit): Self = StObject.set(x, "sap/m/p13n/SortPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashenumSlashPersistenceMode(value: Unit): Self = StObject.set(x, "sap/m/p13n/enum/PersistenceMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashenumSlashProcessingStrategy(value: Unit): Self = StObject.set(x, "sap/m/p13n/enum/ProcessingStrategy", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashp13nSlashmodulesSlashAdaptationProvider(value: Unit): Self = StObject.set(x, "sap/m/p13n/modules/AdaptationProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashpluginsSlashColumnResizer(value: Unit): Self = StObject.set(x, "sap/m/plugins/ColumnResizer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashpluginsSlashCopyProvider(value: Unit): Self = StObject.set(x, "sap/m/plugins/CopyProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashpluginsSlashDataStateIndicator(value: Unit): Self = StObject.set(x, "sap/m/plugins/DataStateIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashpluginsSlashPasteProvider(value: Unit): Self = StObject.set(x, "sap/m/plugins/PasteProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashroutingSlashRouteMatchedHandler(value: Unit): Self = StObject.set(x, "sap/m/routing/RouteMatchedHandler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashroutingSlashRouter(value: Unit): Self = StObject.set(x, "sap/m/routing/Router", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashroutingSlashTargetHandler(value: Unit): Self = StObject.set(x, "sap/m/routing/TargetHandler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashroutingSlashTargets(value: Unit): Self = StObject.set(x, "sap/m/routing/Targets", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashAddAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/AddAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashCancelAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/CancelAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashDeleteAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/DeleteAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashDetailPage(value: Unit): Self = StObject.set(x, "sap/m/semantic/DetailPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashDiscussInJamAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/DiscussInJamAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashEditAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/EditAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashFavoriteAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/FavoriteAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashFilterAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/FilterAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashFilterSelect(value: Unit): Self = StObject.set(x, "sap/m/semantic/FilterSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashFlagAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/FlagAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashForwardAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/ForwardAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashFullscreenPage(value: Unit): Self = StObject.set(x, "sap/m/semantic/FullscreenPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashGroupAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/GroupAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashGroupSelect(value: Unit): Self = StObject.set(x, "sap/m/semantic/GroupSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashMainAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/MainAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashMasterPage(value: Unit): Self = StObject.set(x, "sap/m/semantic/MasterPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashMessagesIndicator(value: Unit): Self = StObject.set(x, "sap/m/semantic/MessagesIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashMultiSelectAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/MultiSelectAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashNegativeAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/NegativeAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashOpenInAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/OpenInAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashPositiveAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/PositiveAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashPrintAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/PrintAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSaveAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/SaveAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSemanticButton(value: Unit): Self = StObject.set(x, "sap/m/semantic/SemanticButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSemanticControl(value: Unit): Self = StObject.set(x, "sap/m/semantic/SemanticControl", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSemanticPage(value: Unit): Self = StObject.set(x, "sap/m/semantic/SemanticPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSemanticSelect(value: Unit): Self = StObject.set(x, "sap/m/semantic/SemanticSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSemanticToggleButton(value: Unit): Self = StObject.set(x, "sap/m/semantic/SemanticToggleButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSendEmailAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/SendEmailAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSendMessageAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/SendMessageAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashShareInJamAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/ShareInJamAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashShareMenuPage(value: Unit): Self = StObject.set(x, "sap/m/semantic/ShareMenuPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSortAction(value: Unit): Self = StObject.set(x, "sap/m/semantic/SortAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashsemanticSlashSortSelect(value: Unit): Self = StObject.set(x, "sap/m/semantic/SortSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashUtil(value: Unit): Self = StObject.set(x, "sap/m/table/Util", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashActionItem(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/ActionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashEntry(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/Entry", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashItem(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/Item", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashItemBase(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/ItemBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashMenu(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/Menu", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickAction(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickActionBase(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickActionBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickActionItem(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickActionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickGroup(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickGroupItem(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickSort(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickSort", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickSortItem(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickSortItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickTotal(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickTotal", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashtableSlashcolumnmenuSlashQuickTotalItem(value: Unit): Self = StObject.set(x, "sap/m/table/columnmenu/QuickTotalItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashuploadSlashUploadSet(value: Unit): Self = StObject.set(x, "sap/m/upload/UploadSet", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashuploadSlashUploadSetItem(value: Unit): Self = StObject.set(x, "sap/m/upload/UploadSetItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashuploadSlashUploadSetToolbarPlaceholder(value: Unit): Self = StObject.set(x, "sap/m/upload/UploadSetToolbarPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashuploadSlashUploader(value: Unit): Self = StObject.set(x, "sap/m/upload/Uploader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashmSlashuploadSlashUploaderHttpRequestMethod(value: Unit): Self = StObject.set(x, "sap/m/upload/UploaderHttpRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashInfoLabel(value: Unit): Self = StObject.set(x, "sap/tnt/InfoLabel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashNavigationList(value: Unit): Self = StObject.set(x, "sap/tnt/NavigationList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashNavigationListItem(value: Unit): Self = StObject.set(x, "sap/tnt/NavigationListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashSideNavigation(value: Unit): Self = StObject.set(x, "sap/tnt/SideNavigation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashToolHeader(value: Unit): Self = StObject.set(x, "sap/tnt/ToolHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashToolHeaderUtilitySeparator(value: Unit): Self = StObject.set(x, "sap/tnt/ToolHeaderUtilitySeparator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashToolPage(value: Unit): Self = StObject.set(x, "sap/tnt/ToolPage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashtntSlashlibrary(value: Unit): Self = StObject.set(x, "sap/tnt/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashDevice(value: Unit): Self = StObject.set(x, "sap/ui/Device", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashVersionInfo(value: Unit): Self = StObject.set(x, "sap/ui/VersionInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashappSlashApplication(value: Unit): Self = StObject.set(x, "sap/ui/app/Application", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashappSlashMockServer(value: Unit): Self = StObject.set(x, "sap/ui/app/MockServer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashBindingInfo(value: Unit): Self = StObject.set(x, "sap/ui/base/BindingInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashDataType(value: Unit): Self = StObject.set(x, "sap/ui/base/DataType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashEvent(value: Unit): Self = StObject.set(x, "sap/ui/base/Event", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashEventProvider(value: Unit): Self = StObject.set(x, "sap/ui/base/EventProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashInterface(value: Unit): Self = StObject.set(x, "sap/ui/base/Interface", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashManagedObject(value: Unit): Self = StObject.set(x, "sap/ui/base/ManagedObject", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashManagedObjectMetadata(value: Unit): Self = StObject.set(x, "sap/ui/base/ManagedObjectMetadata", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashManagedObjectObserver(value: Unit): Self = StObject.set(x, "sap/ui/base/ManagedObjectObserver", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashMetadata(value: Unit): Self = StObject.set(x, "sap/ui/base/Metadata", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashObject(value: Unit): Self = StObject.set(x, "sap/ui/base/Object", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashObjectPool(value: Unit): Self = StObject.set(x, "sap/ui/base/ObjectPool", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashbaseSlashSyncPromise(value: Unit): Self = StObject.set(x, "sap/ui/base/SyncPromise", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcodeeditorSlashCodeEditor(value: Unit): Self = StObject.set(x, "sap/ui/codeeditor/CodeEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcodeeditorSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/codeeditor/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashAccordion(value: Unit): Self = StObject.set(x, "sap/ui/commons/Accordion", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashAccordionSection(value: Unit): Self = StObject.set(x, "sap/ui/commons/AccordionSection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashApplicationHeader(value: Unit): Self = StObject.set(x, "sap/ui/commons/ApplicationHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashArea(value: Unit): Self = StObject.set(x, "sap/ui/commons/Area", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashAutoComplete(value: Unit): Self = StObject.set(x, "sap/ui/commons/AutoComplete", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashButton(value: Unit): Self = StObject.set(x, "sap/ui/commons/Button", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashCallout(value: Unit): Self = StObject.set(x, "sap/ui/commons/Callout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashCalloutBase(value: Unit): Self = StObject.set(x, "sap/ui/commons/CalloutBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashCarousel(value: Unit): Self = StObject.set(x, "sap/ui/commons/Carousel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashCheckBox(value: Unit): Self = StObject.set(x, "sap/ui/commons/CheckBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashColorPicker(value: Unit): Self = StObject.set(x, "sap/ui/commons/ColorPicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashComboBox(value: Unit): Self = StObject.set(x, "sap/ui/commons/ComboBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashDatePicker(value: Unit): Self = StObject.set(x, "sap/ui/commons/DatePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashDialog(value: Unit): Self = StObject.set(x, "sap/ui/commons/Dialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashDropdownBox(value: Unit): Self = StObject.set(x, "sap/ui/commons/DropdownBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashFileUploader(value: Unit): Self = StObject.set(x, "sap/ui/commons/FileUploader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashFileUploaderParameter(value: Unit): Self = StObject.set(x, "sap/ui/commons/FileUploaderParameter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashFormattedTextView(value: Unit): Self = StObject.set(x, "sap/ui/commons/FormattedTextView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashHorizontalDivider(value: Unit): Self = StObject.set(x, "sap/ui/commons/HorizontalDivider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashImage(value: Unit): Self = StObject.set(x, "sap/ui/commons/Image", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashImageMap(value: Unit): Self = StObject.set(x, "sap/ui/commons/ImageMap", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashInPlaceEdit(value: Unit): Self = StObject.set(x, "sap/ui/commons/InPlaceEdit", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashLabel(value: Unit): Self = StObject.set(x, "sap/ui/commons/Label", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashLink(value: Unit): Self = StObject.set(x, "sap/ui/commons/Link", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashListBox(value: Unit): Self = StObject.set(x, "sap/ui/commons/ListBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMenu(value: Unit): Self = StObject.set(x, "sap/ui/commons/Menu", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMenuBar(value: Unit): Self = StObject.set(x, "sap/ui/commons/MenuBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMenuButton(value: Unit): Self = StObject.set(x, "sap/ui/commons/MenuButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMenuItem(value: Unit): Self = StObject.set(x, "sap/ui/commons/MenuItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMenuItemBase(value: Unit): Self = StObject.set(x, "sap/ui/commons/MenuItemBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMenuTextFieldItem(value: Unit): Self = StObject.set(x, "sap/ui/commons/MenuTextFieldItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMessage(value: Unit): Self = StObject.set(x, "sap/ui/commons/Message", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMessageBar(value: Unit): Self = StObject.set(x, "sap/ui/commons/MessageBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMessageBox(value: Unit): Self = StObject.set(x, "sap/ui/commons/MessageBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMessageList(value: Unit): Self = StObject.set(x, "sap/ui/commons/MessageList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashMessageToast(value: Unit): Self = StObject.set(x, "sap/ui/commons/MessageToast", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashPaginator(value: Unit): Self = StObject.set(x, "sap/ui/commons/Paginator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashPanel(value: Unit): Self = StObject.set(x, "sap/ui/commons/Panel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashPasswordField(value: Unit): Self = StObject.set(x, "sap/ui/commons/PasswordField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashProgressIndicator(value: Unit): Self = StObject.set(x, "sap/ui/commons/ProgressIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRadioButton(value: Unit): Self = StObject.set(x, "sap/ui/commons/RadioButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRadioButtonGroup(value: Unit): Self = StObject.set(x, "sap/ui/commons/RadioButtonGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRangeSlider(value: Unit): Self = StObject.set(x, "sap/ui/commons/RangeSlider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRatingIndicator(value: Unit): Self = StObject.set(x, "sap/ui/commons/RatingIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashResponsiveContainer(value: Unit): Self = StObject.set(x, "sap/ui/commons/ResponsiveContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashResponsiveContainerRange(value: Unit): Self = StObject.set(x, "sap/ui/commons/ResponsiveContainerRange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRichTooltip(value: Unit): Self = StObject.set(x, "sap/ui/commons/RichTooltip", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRoadMap(value: Unit): Self = StObject.set(x, "sap/ui/commons/RoadMap", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRoadMapStep(value: Unit): Self = StObject.set(x, "sap/ui/commons/RoadMapStep", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRowRepeater(value: Unit): Self = StObject.set(x, "sap/ui/commons/RowRepeater", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRowRepeaterFilter(value: Unit): Self = StObject.set(x, "sap/ui/commons/RowRepeaterFilter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashRowRepeaterSorter(value: Unit): Self = StObject.set(x, "sap/ui/commons/RowRepeaterSorter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashSearchField(value: Unit): Self = StObject.set(x, "sap/ui/commons/SearchField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashSearchProvider(value: Unit): Self = StObject.set(x, "sap/ui/commons/SearchProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashSegmentedButton(value: Unit): Self = StObject.set(x, "sap/ui/commons/SegmentedButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashSlider(value: Unit): Self = StObject.set(x, "sap/ui/commons/Slider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashSplitter(value: Unit): Self = StObject.set(x, "sap/ui/commons/Splitter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTab(value: Unit): Self = StObject.set(x, "sap/ui/commons/Tab", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTabStrip(value: Unit): Self = StObject.set(x, "sap/ui/commons/TabStrip", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTextArea(value: Unit): Self = StObject.set(x, "sap/ui/commons/TextArea", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTextField(value: Unit): Self = StObject.set(x, "sap/ui/commons/TextField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTextView(value: Unit): Self = StObject.set(x, "sap/ui/commons/TextView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTitle(value: Unit): Self = StObject.set(x, "sap/ui/commons/Title", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashToggleButton(value: Unit): Self = StObject.set(x, "sap/ui/commons/ToggleButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashToolbar(value: Unit): Self = StObject.set(x, "sap/ui/commons/Toolbar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashToolbarSeparator(value: Unit): Self = StObject.set(x, "sap/ui/commons/ToolbarSeparator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTree(value: Unit): Self = StObject.set(x, "sap/ui/commons/Tree", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTreeNode(value: Unit): Self = StObject.set(x, "sap/ui/commons/TreeNode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashTriStateCheckBox(value: Unit): Self = StObject.set(x, "sap/ui/commons/TriStateCheckBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashValueHelpField(value: Unit): Self = StObject.set(x, "sap/ui/commons/ValueHelpField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashForm(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/Form", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashFormContainer(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/FormContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashFormElement(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/FormElement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashFormLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/FormLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashGridContainerData(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/GridContainerData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashGridElementData(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/GridElementData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashGridLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/GridLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashResponsiveLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/ResponsiveLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashformSlashSimpleForm(value: Unit): Self = StObject.set(x, "sap/ui/commons/form/SimpleForm", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashAbsoluteLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/AbsoluteLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashBorderLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/BorderLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashBorderLayoutArea(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/BorderLayoutArea", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashHorizontalLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/HorizontalLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashMatrixLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/MatrixLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashMatrixLayoutCell(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/MatrixLayoutCell", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashMatrixLayoutRow(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/MatrixLayoutRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashPositionContainer(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/PositionContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashResponsiveFlowLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/ResponsiveFlowLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashResponsiveFlowLayoutData(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/ResponsiveFlowLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlayoutSlashVerticalLayout(value: Unit): Self = StObject.set(x, "sap/ui/commons/layout/VerticalLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcommonsSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/commons/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashAppCacheBuster(value: Unit): Self = StObject.set(x, "sap/ui/core/AppCacheBuster", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashBusyIndicator(value: Unit): Self = StObject.set(x, "sap/ui/core/BusyIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashBusyIndicatorUtils(value: Unit): Self = StObject.set(x, "sap/ui/core/BusyIndicatorUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashCalendarType(value: Unit): Self = StObject.set(x, "sap/ui/core/CalendarType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashCommandExecution(value: Unit): Self = StObject.set(x, "sap/ui/core/CommandExecution", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashComponent(value: Unit): Self = StObject.set(x, "sap/ui/core/Component", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashComponentContainer(value: Unit): Self = StObject.set(x, "sap/ui/core/ComponentContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashComponentMetadata(value: Unit): Self = StObject.set(x, "sap/ui/core/ComponentMetadata", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashComponentSupport(value: Unit): Self = StObject.set(x, "sap/ui/core/ComponentSupport", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashConfiguration(value: Unit): Self = StObject.set(x, "sap/ui/core/Configuration", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashControl(value: Unit): Self = StObject.set(x, "sap/ui/core/Control", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashCore(value: Unit): Self = StObject.set(x, "sap/ui/core/Core", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashCustomData(value: Unit): Self = StObject.set(x, "sap/ui/core/CustomData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashDeclarativeSupport(value: Unit): Self = StObject.set(x, "sap/ui/core/DeclarativeSupport", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashElement(value: Unit): Self = StObject.set(x, "sap/ui/core/Element", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashElementMetadata(value: Unit): Self = StObject.set(x, "sap/ui/core/ElementMetadata", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashEnabledPropagator(value: Unit): Self = StObject.set(x, "sap/ui/core/EnabledPropagator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashEventBus(value: Unit): Self = StObject.set(x, "sap/ui/core/EventBus", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashExtensionPoint(value: Unit): Self = StObject.set(x, "sap/ui/core/ExtensionPoint", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashFragment(value: Unit): Self = StObject.set(x, "sap/ui/core/Fragment", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashHTML(value: Unit): Self = StObject.set(x, "sap/ui/core/HTML", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashHistory(value: Unit): Self = StObject.set(x, "sap/ui/core/History", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashIcon(value: Unit): Self = StObject.set(x, "sap/ui/core/Icon", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashIconPool(value: Unit): Self = StObject.set(x, "sap/ui/core/IconPool", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashIndicationColorSupport(value: Unit): Self = StObject.set(x, "sap/ui/core/IndicationColorSupport", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashIntervalTrigger(value: Unit): Self = StObject.set(x, "sap/ui/core/IntervalTrigger", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashInvisibleMessage(value: Unit): Self = StObject.set(x, "sap/ui/core/InvisibleMessage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashInvisibleRenderer(value: Unit): Self = StObject.set(x, "sap/ui/core/InvisibleRenderer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashInvisibleText(value: Unit): Self = StObject.set(x, "sap/ui/core/InvisibleText", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashItem(value: Unit): Self = StObject.set(x, "sap/ui/core/Item", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashLabelEnablement(value: Unit): Self = StObject.set(x, "sap/ui/core/LabelEnablement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashLayoutData(value: Unit): Self = StObject.set(x, "sap/ui/core/LayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashListItem(value: Unit): Self = StObject.set(x, "sap/ui/core/ListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashLocalBusyIndicator(value: Unit): Self = StObject.set(x, "sap/ui/core/LocalBusyIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashLocale(value: Unit): Self = StObject.set(x, "sap/ui/core/Locale", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashLocaleData(value: Unit): Self = StObject.set(x, "sap/ui/core/LocaleData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashManifest(value: Unit): Self = StObject.set(x, "sap/ui/core/Manifest", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashMessage(value: Unit): Self = StObject.set(x, "sap/ui/core/Message", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashPatcher(value: Unit): Self = StObject.set(x, "sap/ui/core/Patcher", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashPlaceholder(value: Unit): Self = StObject.set(x, "sap/ui/core/Placeholder", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashPopup(value: Unit): Self = StObject.set(x, "sap/ui/core/Popup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashRenderManager(value: Unit): Self = StObject.set(x, "sap/ui/core/RenderManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashRenderer(value: Unit): Self = StObject.set(x, "sap/ui/core/Renderer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashResizeHandler(value: Unit): Self = StObject.set(x, "sap/ui/core/ResizeHandler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashScrollBar(value: Unit): Self = StObject.set(x, "sap/ui/core/ScrollBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashSeparatorItem(value: Unit): Self = StObject.set(x, "sap/ui/core/SeparatorItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashTitle(value: Unit): Self = StObject.set(x, "sap/ui/core/Title", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashTooltipBase(value: Unit): Self = StObject.set(x, "sap/ui/core/TooltipBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashUIArea(value: Unit): Self = StObject.set(x, "sap/ui/core/UIArea", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashUIComponent(value: Unit): Self = StObject.set(x, "sap/ui/core/UIComponent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashValueStateSupport(value: Unit): Self = StObject.set(x, "sap/ui/core/ValueStateSupport", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashVariantLayoutData(value: Unit): Self = StObject.set(x, "sap/ui/core/VariantLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashXMLComposite(value: Unit): Self = StObject.set(x, "sap/ui/core/XMLComposite", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlash_UrlResolver(value: Unit): Self = StObject.set(x, "sap/ui/core/_UrlResolver", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashcacheSlashCacheManager(value: Unit): Self = StObject.set(x, "sap/ui/core/cache/CacheManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashcacheSlashLRUPersistentCache(value: Unit): Self = StObject.set(x, "sap/ui/core/cache/LRUPersistentCache", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdateSlashCalendarUtils(value: Unit): Self = StObject.set(x, "sap/ui/core/date/CalendarUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdateSlashCalendarWeekNumbering(value: Unit): Self = StObject.set(x, "sap/ui/core/date/CalendarWeekNumbering", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdateSlashUI5Date(value: Unit): Self = StObject.set(x, "sap/ui/core/date/UI5Date", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdateSlashUniversalDate(value: Unit): Self = StObject.set(x, "sap/ui/core/date/UniversalDate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdateSlashUniversalDateUtils(value: Unit): Self = StObject.set(x, "sap/ui/core/date/UniversalDateUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdelegateSlashItemNavigation(value: Unit): Self = StObject.set(x, "sap/ui/core/delegate/ItemNavigation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdelegateSlashScrollEnablement(value: Unit): Self = StObject.set(x, "sap/ui/core/delegate/ScrollEnablement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdndSlashDragAndDrop(value: Unit): Self = StObject.set(x, "sap/ui/core/dnd/DragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdndSlashDragDropBase(value: Unit): Self = StObject.set(x, "sap/ui/core/dnd/DragDropBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdndSlashDragDropInfo(value: Unit): Self = StObject.set(x, "sap/ui/core/dnd/DragDropInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdndSlashDragInfo(value: Unit): Self = StObject.set(x, "sap/ui/core/dnd/DragInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashdndSlashDropInfo(value: Unit): Self = StObject.set(x, "sap/ui/core/dnd/DropInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashformatSlashDateFormat(value: Unit): Self = StObject.set(x, "sap/ui/core/format/DateFormat", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashformatSlashDateFormatTimezoneDisplay(value: Unit): Self = StObject.set(x, "sap/ui/core/format/DateFormatTimezoneDisplay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashformatSlashFileSizeFormat(value: Unit): Self = StObject.set(x, "sap/ui/core/format/FileSizeFormat", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashformatSlashListFormat(value: Unit): Self = StObject.set(x, "sap/ui/core/format/ListFormat", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashformatSlashNumberFormat(value: Unit): Self = StObject.set(x, "sap/ui/core/format/NumberFormat", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashformatSlashTimezoneUtil(value: Unit): Self = StObject.set(x, "sap/ui/core/format/TimezoneUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashhyphenationSlashHyphenation(value: Unit): Self = StObject.set(x, "sap/ui/core/hyphenation/Hyphenation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/core/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmessageSlashControlMessageProcessor(value: Unit): Self = StObject.set(x, "sap/ui/core/message/ControlMessageProcessor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmessageSlashMessage(value: Unit): Self = StObject.set(x, "sap/ui/core/message/Message", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmessageSlashMessageManager(value: Unit): Self = StObject.set(x, "sap/ui/core/message/MessageManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmessageSlashMessageParser(value: Unit): Self = StObject.set(x, "sap/ui/core/message/MessageParser", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmessageSlashMessageProcessor(value: Unit): Self = StObject.set(x, "sap/ui/core/message/MessageProcessor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashController(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/Controller", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashControllerExtension(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/ControllerExtension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashControllerExtensionProvider(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/ControllerExtensionProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashHTMLView(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/HTMLView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashJSONView(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/JSONView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashJSView(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/JSView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashOverrideExecution(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/OverrideExecution", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashTemplateView(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/TemplateView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashView(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/View", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashViewType(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/ViewType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashmvcSlashXMLView(value: Unit): Self = StObject.set(x, "sap/ui/core/mvc/XMLView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashpostmessageSlashBus(value: Unit): Self = StObject.set(x, "sap/ui/core/postmessage/Bus", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashHashChanger(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/HashChanger", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashHashChangerBase(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/HashChangerBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashHistory(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/History", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashRoute(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/Route", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashRouter(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/Router", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashRouterHashChanger(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/RouterHashChanger", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashTarget(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/Target", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashTargets(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/Targets", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashroutingSlashViews(value: Unit): Self = StObject.set(x, "sap/ui/core/routing/Views", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashsearchSlashOpenSearchProvider(value: Unit): Self = StObject.set(x, "sap/ui/core/search/OpenSearchProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashsearchSlashSearchProvider(value: Unit): Self = StObject.set(x, "sap/ui/core/search/SearchProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashserviceSlashService(value: Unit): Self = StObject.set(x, "sap/ui/core/service/Service", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashserviceSlashServiceFactory(value: Unit): Self = StObject.set(x, "sap/ui/core/service/ServiceFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashsupportSlashHotkeys(value: Unit): Self = StObject.set(x, "sap/ui/core/support/Hotkeys", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashsupportSlashPlugin(value: Unit): Self = StObject.set(x, "sap/ui/core/support/Plugin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashsupportSlashRuleEngineOpaExtension(value: Unit): Self = StObject.set(x, "sap/ui/core/support/RuleEngineOpaExtension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashsupportSlashusageSlashEventBroadcaster(value: Unit): Self = StObject.set(x, "sap/ui/core/support/usage/EventBroadcaster", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashsyncStyleClass(value: Unit): Self = StObject.set(x, "sap/ui/core/syncStyleClass", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashthemingSlashParameters(value: Unit): Self = StObject.set(x, "sap/ui/core/theming/Parameters", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashthemingSlashThemeHelper(value: Unit): Self = StObject.set(x, "sap/ui/core/theming/ThemeHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashtmplSlashDOMAttribute(value: Unit): Self = StObject.set(x, "sap/ui/core/tmpl/DOMAttribute", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashtmplSlashDOMElement(value: Unit): Self = StObject.set(x, "sap/ui/core/tmpl/DOMElement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashtmplSlashHandlebarsTemplate(value: Unit): Self = StObject.set(x, "sap/ui/core/tmpl/HandlebarsTemplate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashtmplSlashTemplate(value: Unit): Self = StObject.set(x, "sap/ui/core/tmpl/Template", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashtmplSlashTemplateControl(value: Unit): Self = StObject.set(x, "sap/ui/core/tmpl/TemplateControl", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashExport(value: Unit): Self = StObject.set(x, "sap/ui/core/util/Export", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashExportCell(value: Unit): Self = StObject.set(x, "sap/ui/core/util/ExportCell", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashExportColumn(value: Unit): Self = StObject.set(x, "sap/ui/core/util/ExportColumn", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashExportRow(value: Unit): Self = StObject.set(x, "sap/ui/core/util/ExportRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashExportType(value: Unit): Self = StObject.set(x, "sap/ui/core/util/ExportType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashExportTypeCSV(value: Unit): Self = StObject.set(x, "sap/ui/core/util/ExportTypeCSV", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashFile(value: Unit): Self = StObject.set(x, "sap/ui/core/util/File", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashMockServer(value: Unit): Self = StObject.set(x, "sap/ui/core/util/MockServer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashPasteHelper(value: Unit): Self = StObject.set(x, "sap/ui/core/util/PasteHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashXMLPreprocessor(value: Unit): Self = StObject.set(x, "sap/ui/core/util/XMLPreprocessor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashreflectionSlashBaseTreeModifier(value: Unit): Self = StObject.set(x, "sap/ui/core/util/reflection/BaseTreeModifier", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashreflectionSlashJsControlTreeModifier(value: Unit): Self = StObject.set(x, "sap/ui/core/util/reflection/JsControlTreeModifier", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashreflectionSlashXmlTreeModifier(value: Unit): Self = StObject.set(x, "sap/ui/core/util/reflection/XmlTreeModifier", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashserializerSlashHTMLViewSerializer(value: Unit): Self = StObject.set(x, "sap/ui/core/util/serializer/HTMLViewSerializer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashserializerSlashSerializer(value: Unit): Self = StObject.set(x, "sap/ui/core/util/serializer/Serializer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashserializerSlashViewSerializer(value: Unit): Self = StObject.set(x, "sap/ui/core/util/serializer/ViewSerializer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashserializerSlashXMLViewSerializer(value: Unit): Self = StObject.set(x, "sap/ui/core/util/serializer/XMLViewSerializer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashserializerSlashdelegateSlashDelegate(value: Unit): Self = StObject.set(x, "sap/ui/core/util/serializer/delegate/Delegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashserializerSlashdelegateSlashHTML(value: Unit): Self = StObject.set(x, "sap/ui/core/util/serializer/delegate/HTML", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashutilSlashserializerSlashdelegateSlashXML(value: Unit): Self = StObject.set(x, "sap/ui/core/util/serializer/delegate/XML", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashwsSlashReadyState(value: Unit): Self = StObject.set(x, "sap/ui/core/ws/ReadyState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashwsSlashSapPcpWebSocket(value: Unit): Self = StObject.set(x, "sap/ui/core/ws/SapPcpWebSocket", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashcoreSlashwsSlashWebSocket(value: Unit): Self = StObject.set(x, "sap/ui/core/ws/WebSocket", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashcontainsOrEquals(value: Unit): Self = StObject.set(x, "sap/ui/dom/containsOrEquals", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashdenormalizeScrollBeginRTL(value: Unit): Self = StObject.set(x, "sap/ui/dom/denormalizeScrollBeginRTL", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashdenormalizeScrollLeftRTL(value: Unit): Self = StObject.set(x, "sap/ui/dom/denormalizeScrollLeftRTL", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashgetOwnerWindow(value: Unit): Self = StObject.set(x, "sap/ui/dom/getOwnerWindow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashgetScrollbarSize(value: Unit): Self = StObject.set(x, "sap/ui/dom/getScrollbarSize", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashincludeScript(value: Unit): Self = StObject.set(x, "sap/ui/dom/includeScript", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashincludeStylesheet(value: Unit): Self = StObject.set(x, "sap/ui/dom/includeStylesheet", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashisHidden(value: Unit): Self = StObject.set(x, "sap/ui/dom/isHidden", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashAria(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/Aria", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashFocusable(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/Focusable", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashSelection(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/Selection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashSelectors(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/Selectors", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashcontrol(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/control", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashcursorPos(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/cursorPos", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashgetSelectedText(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/getSelectedText", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashhasTabIndex(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/hasTabIndex", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashparentByAttribute(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/parentByAttribute", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashrect(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/rect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashrectContains(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/rectContains", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashscrollLeftRTL(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/scrollLeftRTL", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashscrollRightRTL(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/scrollRightRTL", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashselectText(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/selectText", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashjquerySlashzIndex(value: Unit): Self = StObject.set(x, "sap/ui/dom/jquery/zIndex", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashdomSlashunitsSlashRem(value: Unit): Self = StObject.set(x, "sap/ui/dom/units/Rem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashControlEvents(value: Unit): Self = StObject.set(x, "sap/ui/events/ControlEvents", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashF6Navigation(value: Unit): Self = StObject.set(x, "sap/ui/events/F6Navigation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashKeyCodes(value: Unit): Self = StObject.set(x, "sap/ui/events/KeyCodes", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashPseudoEvents(value: Unit): Self = StObject.set(x, "sap/ui/events/PseudoEvents", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashTouchToMouseMapping(value: Unit): Self = StObject.set(x, "sap/ui/events/TouchToMouseMapping", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashcheckMouseEnterOrLeave(value: Unit): Self = StObject.set(x, "sap/ui/events/checkMouseEnterOrLeave", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashisMouseEventDelayed(value: Unit): Self = StObject.set(x, "sap/ui/events/isMouseEventDelayed", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashisSpecialKey(value: Unit): Self = StObject.set(x, "sap/ui/events/isSpecialKey", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashjquerySlashEventExtension(value: Unit): Self = StObject.set(x, "sap/ui/events/jquery/EventExtension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlasheventsSlashjquerySlashEventSimulation(value: Unit): Self = StObject.set(x, "sap/ui/events/jquery/EventSimulation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashCache(value: Unit): Self = StObject.set(x, "sap/ui/fl/Cache", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashChangePersistenceFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/ChangePersistenceFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashFlexControllerFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/FlexControllerFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashUtils(value: Unit): Self = StObject.set(x, "sap/ui/fl/Utils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashUtils(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/Utils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashPreprocessor(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/Preprocessor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashRegistration(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/Registration", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashRegistrationBuild(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/RegistrationBuild", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashAddAnnotationsToOData(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/app/AddAnnotationsToOData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashAddNewInbound(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/app/AddNewInbound", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashChangeDataSource(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/app/ChangeDataSource", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashChangeInbound(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/app/ChangeInbound", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashRemoveAllInboundsExceptOne(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/app/RemoveAllInboundsExceptOne", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashappSlashSetTitle(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/app/SetTitle", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashfioriSlashSetAbstract(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/fiori/SetAbstract", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashfioriSlashSetRegistrationIds(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/fiori/SetRegistrationIds", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashovpSlashAddNewCard(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ovp/AddNewCard", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashovpSlashChangeCard(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ovp/ChangeCard", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashovpSlashDeleteCard(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ovp/DeleteCard", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddComponentUsages(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddComponentUsages", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddLibrary(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddLibrary", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddNewModel(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddNewModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashAddNewModelEnhanceWith(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ui5/AddNewModelEnhanceWith", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashSetFlexExtensionPointEnabled(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ui5/SetFlexExtensionPointEnabled", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashchangesSlashdescriptorSlashui5SlashSetMinUI5Version(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/changes/descriptor/ui5/SetMinUI5Version", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashconnectorsSlashObjectStorageConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/connectors/ObjectStorageConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashcontrolVariantsSlashURLHandler(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/controlVariants/URLHandler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashAppDescriptorChange(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/AppDescriptorChange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashCompVariant(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/CompVariant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashControllerExtensionChange(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/ControllerExtensionChange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashFlVariant(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/FlVariant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashFlexObject(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/FlexObject", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashFlexObjectFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/FlexObjectFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashUIChange(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/UIChange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashUpdatableChange(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/UpdatableChange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexObjectsSlashVariant(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexObjects/Variant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashDataSelector(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/DataSelector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashFlexState(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/FlexState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashInitialPrepareFunctions(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/InitialPrepareFunctions", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashLoader(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/Loader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashUI2PersonalizationSlashUI2PersonalizationState(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/UI2Personalization/UI2PersonalizationState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashchangesSlashDependencyHandler(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/changes/DependencyHandler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashchangesSlashExtensionPointState(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/changes/ExtensionPointState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashcompVariantsSlashCompVariantMerger(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/compVariants/CompVariantMerger", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashcontrolVariantsSlashSwitcher(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/controlVariants/Switcher", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashflexStateSlashcontrolVariantsSlashVariantManagementState(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/flexState/controlVariants/VariantManagementState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashpreprocessorsSlashControllerExtension(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/preprocessors/ControllerExtension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlash_internalSlashpreprocessorsSlashEventHistory(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/_internal/preprocessors/EventHistory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlashapiSlashControlVariantApplyAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/api/ControlVariantApplyAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlashapiSlashDelegateMediatorAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/api/DelegateMediatorAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlashapiSlashFlexRuntimeInfoAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/api/FlexRuntimeInfoAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlashapiSlashSmartVariantManagementApplyAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/api/SmartVariantManagementApplyAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashapplySlashapiSlashUI2PersonalizationApplyAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/apply/api/UI2PersonalizationApplyAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashchangeHandlerSlashBase(value: Unit): Self = StObject.set(x, "sap/ui/fl/changeHandler/Base", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashdescriptorRelatedSlashapiSlashDescriptorChangeFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/descriptorRelated/api/DescriptorChangeFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashdescriptorRelatedSlashapiSlashDescriptorInlineChangeFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/descriptorRelated/api/DescriptorInlineChangeFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashdescriptorRelatedSlashapiSlashDescriptorVariantFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/descriptorRelated/api/DescriptorVariantFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashStorage(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/Storage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashStorageUtils(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/StorageUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashchangeHandlersSlashChangeRegistryItem(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/changeHandlers/ChangeRegistryItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashBackendConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/connectors/BackendConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashKeyUserConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/connectors/KeyUserConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashLrepConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/connectors/LrepConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashNeoLrepConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/connectors/NeoLrepConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashPersonalizationConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/connectors/PersonalizationConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashStaticFileConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/connectors/StaticFileConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinitialSlash_internalSlashconnectorsSlashUtils(value: Unit): Self = StObject.set(x, "sap/ui/fl/initial/_internal/connectors/Utils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinterfacesSlashBaseLoadConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/interfaces/BaseLoadConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashinterfacesSlashDelegate(value: Unit): Self = StObject.set(x, "sap/ui/fl/interfaces/Delegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/fl/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashregistrySlashSettings(value: Unit): Self = StObject.set(x, "sap/ui/fl/registry/Settings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashsupportSlash_internalSlashgetChangeDependencies(value: Unit): Self = StObject.set(x, "sap/ui/fl/support/_internal/getChangeDependencies", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashsupportSlash_internalSlashgetFlexSettings(value: Unit): Self = StObject.set(x, "sap/ui/fl/support/_internal/getFlexSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashsupportSlashapiSlashSupportAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/support/api/SupportAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashtransportSlashTransportDialog(value: Unit): Self = StObject.set(x, "sap/ui/fl/transport/TransportDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashvariantsSlashVariantManagement(value: Unit): Self = StObject.set(x, "sap/ui/fl/variants/VariantManagement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashvariantsSlashVariantModel(value: Unit): Self = StObject.set(x, "sap/ui/fl/variants/VariantModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashvariantsSlashcontextSlashComponent(value: Unit): Self = StObject.set(x, "sap/ui/fl/variants/context/Component", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashStorage(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/Storage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashStorageFeaturesMerger(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/StorageFeaturesMerger", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashVersions(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/Versions", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariant(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/appVariant/AppVariant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariantFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/appVariant/AppVariantFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariantInlineChange(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/appVariant/AppVariantInlineChange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashappVariantSlashAppVariantInlineChangeFactory(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/appVariant/AppVariantInlineChangeFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashBackendConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/BackendConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashJsObjectConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/JsObjectConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashKeyUserConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/KeyUserConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashLocalStorageConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/LocalStorageConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashLrepConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/LrepConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashNeoLrepConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/NeoLrepConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashObjectPathConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/ObjectPathConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashObjectStorageConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/ObjectStorageConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashPersonalizationConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/PersonalizationConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashSessionStorageConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/SessionStorageConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashconnectorsSlashUtils(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/connectors/Utils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashextensionPointSlashRegistry(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/extensionPoint/Registry", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashfieldExtensibilitySlashABAPExtensibilityVariant(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/fieldExtensibility/ABAPExtensibilityVariant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashfieldExtensibilitySlashMultiTenantABAPExtensibilityVariant(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/fieldExtensibility/MultiTenantABAPExtensibilityVariant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashfieldExtensibilitySlashSingleTenantABAPExtensibilityVariant(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/fieldExtensibility/SingleTenantABAPExtensibilityVariant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashflexStateSlashFlexObjectState(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/flexState/FlexObjectState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlash_internalSlashflexStateSlashcompVariantsSlashCompVariantState(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/_internal/flexState/compVariants/CompVariantState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashAppVariantWriteAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/AppVariantWriteAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashChangesWriteAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/ChangesWriteAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashContextBasedAdaptationsAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/ContextBasedAdaptationsAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashContextSharingAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/ContextSharingAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashControlPersonalizationWriteAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/ControlPersonalizationWriteAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashExtensionPointRegistryAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/ExtensionPointRegistryAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashFeaturesAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/FeaturesAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashFieldExtensibility(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/FieldExtensibility", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashLocalResetAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/LocalResetAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashPersistenceWriteAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/PersistenceWriteAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashReloadInfoAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/ReloadInfoAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashSmartBusinessWriteAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/SmartBusinessWriteAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashSmartVariantManagementWriteAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/SmartVariantManagementWriteAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashTranslationAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/TranslationAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashUI2PersonalizationWriteAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/UI2PersonalizationWriteAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashVersionsAPI(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/VersionsAPI", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashapiSlashconnectorsSlashObjectStorageConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/api/connectors/ObjectStorageConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashflSlashwriteSlashconnectorsSlashBaseConnector(value: Unit): Self = StObject.set(x, "sap/ui/fl/write/connectors/BaseConnector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashActionDefinition(value: Unit): Self = StObject.set(x, "sap/ui/integration/ActionDefinition", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashDesigntime(value: Unit): Self = StObject.set(x, "sap/ui/integration/Designtime", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashExtension(value: Unit): Self = StObject.set(x, "sap/ui/integration/Extension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashHost(value: Unit): Self = StObject.set(x, "sap/ui/integration/Host", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashBaseEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/BaseEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashPropertyEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/PropertyEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashPropertyEditors(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/PropertyEditors", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashlayoutSlashForm(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/layout/Form", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashBasePropertyEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/BasePropertyEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashPropertyEditorFactory(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/PropertyEditorFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlasharrayEditorSlashArrayEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/arrayEditor/ArrayEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashbooleanEditorSlashBooleanEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/booleanEditor/BooleanEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashcodeEditorSlashCodeEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/codeEditor/CodeEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashdateEditorSlashDateEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/dateEditor/DateEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashdateTimeEditorSlashDateTimeEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/dateTimeEditor/DateTimeEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashenumStringEditorSlashEnumStringEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/enumStringEditor/EnumStringEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashgroupEditorSlashGroupEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/groupEditor/GroupEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashiconEditorSlashIconEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/iconEditor/IconEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashintegerEditorSlashIntegerEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/integerEditor/IntegerEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashjsonEditorSlashJsonEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/jsonEditor/JsonEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashlistEditorSlashListEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/listEditor/ListEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashmapEditorSlashMapEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/mapEditor/MapEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashmultiSelectEditorSlashMultiSelectEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/multiSelectEditor/MultiSelectEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashnumberEditorSlashNumberEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/numberEditor/NumberEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashobjectArrayEditorSlashObjectArrayEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/objectArrayEditor/ObjectArrayEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashselectEditorSlashSelectEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/selectEditor/SelectEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashseparatorEditorSlashSeparatorEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/separatorEditor/SeparatorEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashstringEditorSlashStringEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/stringEditor/StringEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashpropertyEditorSlashtextAreaEditorSlashTextAreaEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/propertyEditor/textAreaEditor/TextAreaEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashutilSlashunset(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/util/unset", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsBoolean(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsBoolean", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsDate(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsDate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsInteger(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsInteger", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsNumber(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsNumber", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsSelectedKey(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsStringList(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsStringList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsUniqueKey(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsUniqueKey", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsUniqueList(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsUniqueList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashIsValidBinding(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/IsValidBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashMaxLength(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/MaxLength", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashNotABinding(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/NotABinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashbaseEditorSlashvalidatorSlashValidatorRegistry(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/baseEditor/validator/ValidatorRegistry", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashcomplexMapEditorSlashComplexMapEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/cardEditor/propertyEditor/complexMapEditor/ComplexMapEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashdestinationsEditorSlashDestinationsEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/cardEditor/propertyEditor/destinationsEditor/DestinationsEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashfiltersEditorSlashFiltersEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/cardEditor/propertyEditor/filtersEditor/FiltersEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashiconEditorSlashIconEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/cardEditor/propertyEditor/iconEditor/IconEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlashcardEditorSlashpropertyEditorSlashparametersEditorSlashParametersEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/cardEditor/propertyEditor/parametersEditor/ParametersEditor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashdesigntimeSlasheditorSlashCardPreview(value: Unit): Self = StObject.set(x, "sap/ui/integration/designtime/editor/CardPreview", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashEditor(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/Editor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashExtension(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/Extension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashSettings(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/Settings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashBaseField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/BaseField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashBooleanField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/BooleanField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashDateField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/DateField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashDateTimeField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/DateTimeField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashDestinationField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/DestinationField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashGroupField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/GroupField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashIntegerField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/IntegerField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashNumberField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/NumberField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashObjectField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/ObjectField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashObjectListField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/ObjectListField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashStringField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/StringField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashStringListField(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/StringListField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashfragmentSlashController(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/fragment/Controller", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashColorSelect(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/viz/ColorSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashIconSelect(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/viz/IconSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashShapeSelect(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/viz/ShapeSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlasheditorSlashfieldsSlashvizSlashVizBase(value: Unit): Self = StObject.set(x, "sap/ui/integration/editor/fields/viz/VizBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/integration/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashservicesSlashService(value: Unit): Self = StObject.set(x, "sap/ui/integration/services/Service", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashutilSlashCsrfTokenHandler(value: Unit): Self = StObject.set(x, "sap/ui/integration/util/CsrfTokenHandler", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashutilSlashDataProvider(value: Unit): Self = StObject.set(x, "sap/ui/integration/util/DataProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashutilSlashDataProviderFactory(value: Unit): Self = StObject.set(x, "sap/ui/integration/util/DataProviderFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashutilSlashManifestResolver(value: Unit): Self = StObject.set(x, "sap/ui/integration/util/ManifestResolver", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashutilSlashRequestDataProvider(value: Unit): Self = StObject.set(x, "sap/ui/integration/util/RequestDataProvider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashutilSlashSkeletonCard(value: Unit): Self = StObject.set(x, "sap/ui/integration/util/SkeletonCard", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashintegrationSlashwidgetsSlashCard(value: Unit): Self = StObject.set(x, "sap/ui/integration/widgets/Card", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashBlockLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/BlockLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashBlockLayoutCell(value: Unit): Self = StObject.set(x, "sap/ui/layout/BlockLayoutCell", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashBlockLayoutCellData(value: Unit): Self = StObject.set(x, "sap/ui/layout/BlockLayoutCellData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashBlockLayoutRow(value: Unit): Self = StObject.set(x, "sap/ui/layout/BlockLayoutRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashDynamicSideContent(value: Unit): Self = StObject.set(x, "sap/ui/layout/DynamicSideContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashFixFlex(value: Unit): Self = StObject.set(x, "sap/ui/layout/FixFlex", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashGrid(value: Unit): Self = StObject.set(x, "sap/ui/layout/Grid", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashGridData(value: Unit): Self = StObject.set(x, "sap/ui/layout/GridData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashHorizontalLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/HorizontalLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashPaneContainer(value: Unit): Self = StObject.set(x, "sap/ui/layout/PaneContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashResponsiveFlowLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/ResponsiveFlowLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashResponsiveFlowLayoutData(value: Unit): Self = StObject.set(x, "sap/ui/layout/ResponsiveFlowLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashResponsiveSplitter(value: Unit): Self = StObject.set(x, "sap/ui/layout/ResponsiveSplitter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashSplitPane(value: Unit): Self = StObject.set(x, "sap/ui/layout/SplitPane", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashSplitter(value: Unit): Self = StObject.set(x, "sap/ui/layout/Splitter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashSplitterLayoutData(value: Unit): Self = StObject.set(x, "sap/ui/layout/SplitterLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashVerticalLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/VerticalLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashCSSGrid(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/CSSGrid", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashGridBasicLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/GridBasicLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashGridBoxLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/GridBoxLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashGridItemLayoutData(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/GridItemLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashGridLayoutBase(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/GridLayoutBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashGridLayoutDelegate(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/GridLayoutDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashGridResponsiveLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/GridResponsiveLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashGridSettings(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/GridSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashResponsiveColumnItemLayoutData(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/ResponsiveColumnItemLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashcssgridSlashResponsiveColumnLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/cssgrid/ResponsiveColumnLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashColumnContainerData(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/ColumnContainerData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashColumnElementData(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/ColumnElementData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashColumnLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/ColumnLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashForm(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/Form", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashFormContainer(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/FormContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashFormElement(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/FormElement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashFormLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/FormLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashGridContainerData(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/GridContainerData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashGridElementData(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/GridElementData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashGridLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/GridLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashResponsiveGridLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/ResponsiveGridLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashResponsiveLayout(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/ResponsiveLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashSemanticFormElement(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/SemanticFormElement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashformSlashSimpleForm(value: Unit): Self = StObject.set(x, "sap/ui/layout/form/SimpleForm", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashlayoutSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/layout/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashActionToolbar(value: Unit): Self = StObject.set(x, "sap/ui/mdc/ActionToolbar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashChart(value: Unit): Self = StObject.set(x, "sap/ui/mdc/Chart", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashChartDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/ChartDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashControl(value: Unit): Self = StObject.set(x, "sap/ui/mdc/Control", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashElement(value: Unit): Self = StObject.set(x, "sap/ui/mdc/Element", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashField(value: Unit): Self = StObject.set(x, "sap/ui/mdc/Field", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashFilterBar(value: Unit): Self = StObject.set(x, "sap/ui/mdc/FilterBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashFilterBarDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/FilterBarDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashFilterField(value: Unit): Self = StObject.set(x, "sap/ui/mdc/FilterField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashLink(value: Unit): Self = StObject.set(x, "sap/ui/mdc/Link", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashLinkDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/LinkDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashMultiValueField(value: Unit): Self = StObject.set(x, "sap/ui/mdc/MultiValueField", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashTable(value: Unit): Self = StObject.set(x, "sap/ui/mdc/Table", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashTableDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/TableDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashValueHelp(value: Unit): Self = StObject.set(x, "sap/ui/mdc/ValueHelp", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashValueHelpDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/ValueHelpDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashactiontoolbarSlashActionToolbarAction(value: Unit): Self = StObject.set(x, "sap/ui/mdc/actiontoolbar/ActionToolbarAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashchartSlashChartImplementationContainer(value: Unit): Self = StObject.set(x, "sap/ui/mdc/chart/ChartImplementationContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashchartSlashChartSelectionDetails(value: Unit): Self = StObject.set(x, "sap/ui/mdc/chart/ChartSelectionDetails", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashchartSlashItem(value: Unit): Self = StObject.set(x, "sap/ui/mdc/chart/Item", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashchartSlashSelectionDetailsActions(value: Unit): Self = StObject.set(x, "sap/ui/mdc/chart/SelectionDetailsActions", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashCondition(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/Condition", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashConditionConverter(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/ConditionConverter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashConditionModel(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/ConditionModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashConditionModelPropertyBinding(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/ConditionModelPropertyBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashConditionValidateException(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/ConditionValidateException", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashFilterConverter(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/FilterConverter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashFilterOperatorUtil(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/FilterOperatorUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashOperator(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/Operator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashOperatorDynamicDateOption(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/OperatorDynamicDateOption", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashconditionSlashRangeOperator(value: Unit): Self = StObject.set(x, "sap/ui/mdc/condition/RangeOperator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashActionToolbarActionAlignment(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/ActionToolbarActionAlignment", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashBaseType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/BaseType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashConditionValidated(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/ConditionValidated", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashContentMode(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/ContentMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashEditMode(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/EditMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashFieldDisplay(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/FieldDisplay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashFilterBarValidationStatus(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/FilterBarValidationStatus", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashPersistenceMode(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/PersistenceMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashProcessingStrategy(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/ProcessingStrategy", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashPropagationReason(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/PropagationReason", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashReasonMode(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/ReasonMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashenumSlashSelectType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/enum/SelectType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashConditionType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/ConditionType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashConditionsType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/ConditionsType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashCustomFieldInfo(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/CustomFieldInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashDefineConditionPanel(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/DefineConditionPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashDynamicDateRangeConditionsType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/DynamicDateRangeConditionsType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashFieldBase(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/FieldBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashFieldBaseDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/FieldBaseDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashFieldInfoBase(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/FieldInfoBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashFieldInput(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/FieldInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashFieldMultiInput(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/FieldMultiInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashListFieldHelpItem(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/ListFieldHelpItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashMultiValueFieldDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/MultiValueFieldDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashMultiValueFieldItem(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/MultiValueFieldItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashTokenDisplay(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/TokenDisplay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfieldSlashTokenizerDisplay(value: Unit): Self = StObject.set(x, "sap/ui/mdc/field/TokenizerDisplay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfilterbarSlashFilterBarBase(value: Unit): Self = StObject.set(x, "sap/ui/mdc/filterbar/FilterBarBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfilterbarSlashalignedSlashFilterContainer(value: Unit): Self = StObject.set(x, "sap/ui/mdc/filterbar/aligned/FilterContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfilterbarSlashalignedSlashFilterItemLayout(value: Unit): Self = StObject.set(x, "sap/ui/mdc/filterbar/aligned/FilterItemLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfilterbarSlashp13nSlashAdaptationFilterBar(value: Unit): Self = StObject.set(x, "sap/ui/mdc/filterbar/p13n/AdaptationFilterBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfilterbarSlashvhSlashCollectiveSearchSelect(value: Unit): Self = StObject.set(x, "sap/ui/mdc/filterbar/vh/CollectiveSearchSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfilterbarSlashvhSlashFilterBar(value: Unit): Self = StObject.set(x, "sap/ui/mdc/filterbar/vh/FilterBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashfilterbarSlashvhSlashFilterContainer(value: Unit): Self = StObject.set(x, "sap/ui/mdc/filterbar/vh/FilterContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/mdc/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashlinkSlashLinkItem(value: Unit): Self = StObject.set(x, "sap/ui/mdc/link/LinkItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashmixinSlashAdaptationMixin(value: Unit): Self = StObject.set(x, "sap/ui/mdc/mixin/AdaptationMixin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashmixinSlashDelegateMixin(value: Unit): Self = StObject.set(x, "sap/ui/mdc/mixin/DelegateMixin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashmixinSlashFilterIntegrationMixin(value: Unit): Self = StObject.set(x, "sap/ui/mdc/mixin/FilterIntegrationMixin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashmixinSlashPromiseMixin(value: Unit): Self = StObject.set(x, "sap/ui/mdc/mixin/PromiseMixin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashmixinSlashPropertyHelperMixin(value: Unit): Self = StObject.set(x, "sap/ui/mdc/mixin/PropertyHelperMixin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashodataSlashTypeUtil(value: Unit): Self = StObject.set(x, "sap/ui/mdc/odata/TypeUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashodataSlashv4SlashFieldBaseDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/odata/v4/FieldBaseDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashodataSlashv4SlashTableDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/odata/v4/TableDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashodataSlashv4SlashTypeUtil(value: Unit): Self = StObject.set(x, "sap/ui/mdc/odata/v4/TypeUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashodataSlashv4SlashValueHelpDelegate(value: Unit): Self = StObject.set(x, "sap/ui/mdc/odata/v4/ValueHelpDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashp13nSlashStateUtil(value: Unit): Self = StObject.set(x, "sap/ui/mdc/p13n/StateUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashp13nSlashUIManager(value: Unit): Self = StObject.set(x, "sap/ui/mdc/p13n/UIManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashp13nSlashpanelsSlashFilterPanel(value: Unit): Self = StObject.set(x, "sap/ui/mdc/p13n/panels/FilterPanel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashColumn(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/Column", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashColumnSettings(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/ColumnSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashCreationRow(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/CreationRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashGridTableType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/GridTableType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashPropertyHelper(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/PropertyHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashResponsiveColumnSettings(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/ResponsiveColumnSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashResponsiveTableType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/ResponsiveTableType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashRowActionItem(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/RowActionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashRowSettings(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/RowSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashTableTypeBase(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/TableTypeBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashTreeTableType(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/TreeTableType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashtableSlashV4AnalyticsPropertyHelper(value: Unit): Self = StObject.set(x, "sap/ui/mdc/table/V4AnalyticsPropertyHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashutilSlashDateUtil(value: Unit): Self = StObject.set(x, "sap/ui/mdc/util/DateUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashutilSlashFilterUtil(value: Unit): Self = StObject.set(x, "sap/ui/mdc/util/FilterUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashutilSlashInfoBar(value: Unit): Self = StObject.set(x, "sap/ui/mdc/util/InfoBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashutilSlashPromiseCache(value: Unit): Self = StObject.set(x, "sap/ui/mdc/util/PromiseCache", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashutilSlashPropertyHelper(value: Unit): Self = StObject.set(x, "sap/ui/mdc/util/PropertyHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashutilSlashTypeUtil(value: Unit): Self = StObject.set(x, "sap/ui/mdc/util/TypeUtil", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashDialog(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/Dialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashPopover(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/Popover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashContainer(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/base/Container", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashContent(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/base/Content", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashDialogTab(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/base/DialogTab", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashFilterableListContent(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/base/FilterableListContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashbaseSlashListContent(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/base/ListContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashBool(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/content/Bool", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashConditions(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/content/Conditions", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashFixedList(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/content/FixedList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashMDCTable(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/content/MDCTable", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmdcSlashvaluehelpSlashcontentSlashMTable(value: Unit): Self = StObject.set(x, "sap/ui/mdc/valuehelp/content/MTable", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/Binding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashBindingMode(value: Unit): Self = StObject.set(x, "sap/ui/model/BindingMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashChangeReason(value: Unit): Self = StObject.set(x, "sap/ui/model/ChangeReason", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashClientContextBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/ClientContextBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashClientListBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/ClientListBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashClientModel(value: Unit): Self = StObject.set(x, "sap/ui/model/ClientModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashClientPropertyBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/ClientPropertyBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashClientTreeBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/ClientTreeBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashClientTreeBindingAdapter(value: Unit): Self = StObject.set(x, "sap/ui/model/ClientTreeBindingAdapter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashCompositeBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/CompositeBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashCompositeDataState(value: Unit): Self = StObject.set(x, "sap/ui/model/CompositeDataState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashCompositeType(value: Unit): Self = StObject.set(x, "sap/ui/model/CompositeType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashContext(value: Unit): Self = StObject.set(x, "sap/ui/model/Context", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashContextBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/ContextBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashDataState(value: Unit): Self = StObject.set(x, "sap/ui/model/DataState", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashFilter(value: Unit): Self = StObject.set(x, "sap/ui/model/Filter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashFilterOperator(value: Unit): Self = StObject.set(x, "sap/ui/model/FilterOperator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashFilterProcessor(value: Unit): Self = StObject.set(x, "sap/ui/model/FilterProcessor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashFilterType(value: Unit): Self = StObject.set(x, "sap/ui/model/FilterType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashFormatException(value: Unit): Self = StObject.set(x, "sap/ui/model/FormatException", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashListBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/ListBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashMetaModel(value: Unit): Self = StObject.set(x, "sap/ui/model/MetaModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashModel(value: Unit): Self = StObject.set(x, "sap/ui/model/Model", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashParseException(value: Unit): Self = StObject.set(x, "sap/ui/model/ParseException", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashPropertyBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/PropertyBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashSelectionModel(value: Unit): Self = StObject.set(x, "sap/ui/model/SelectionModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashSimpleType(value: Unit): Self = StObject.set(x, "sap/ui/model/SimpleType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashSorter(value: Unit): Self = StObject.set(x, "sap/ui/model/Sorter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashStaticBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/StaticBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashTreeAutoExpandMode(value: Unit): Self = StObject.set(x, "sap/ui/model/TreeAutoExpandMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashTreeBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/TreeBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashTreeBindingAdapter(value: Unit): Self = StObject.set(x, "sap/ui/model/TreeBindingAdapter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashTreeBindingCompatibilityAdapter(value: Unit): Self = StObject.set(x, "sap/ui/model/TreeBindingCompatibilityAdapter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashTreeBindingUtils(value: Unit): Self = StObject.set(x, "sap/ui/model/TreeBindingUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashType(value: Unit): Self = StObject.set(x, "sap/ui/model/Type", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashValidateException(value: Unit): Self = StObject.set(x, "sap/ui/model/ValidateException", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashanalyticsSlashAnalyticalBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/analytics/AnalyticalBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashanalyticsSlashAnalyticalTreeBindingAdapter(value: Unit): Self = StObject.set(x, "sap/ui/model/analytics/AnalyticalTreeBindingAdapter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashanalyticsSlashBatchResponseCollector(value: Unit): Self = StObject.set(x, "sap/ui/model/analytics/BatchResponseCollector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashanalyticsSlashodata4analytics(value: Unit): Self = StObject.set(x, "sap/ui/model/analytics/odata4analytics", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashbaseSlashManagedObjectModel(value: Unit): Self = StObject.set(x, "sap/ui/model/base/ManagedObjectModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashjsonSlashJSONListBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/json/JSONListBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashjsonSlashJSONModel(value: Unit): Self = StObject.set(x, "sap/ui/model/json/JSONModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashjsonSlashJSONPropertyBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/json/JSONPropertyBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashjsonSlashJSONTreeBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/json/JSONTreeBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashmessageSlashMessageModel(value: Unit): Self = StObject.set(x, "sap/ui/model/message/MessageModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashAnnotationHelper(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/AnnotationHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashCountMode(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/CountMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashFilter(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/Filter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashMessageScope(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/MessageScope", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataAnnotations(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataAnnotations", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataContextBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataContextBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataListBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataListBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataMessageParser(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataMessageParser", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataMetaModel(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataMetaModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataMetadata(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataMetadata", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataModel(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataPropertyBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataPropertyBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashODataUtils(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/ODataUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashOperationMode(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/OperationMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashUpdateMethod(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/UpdateMethod", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashBoolean(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Boolean", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashByte(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Byte", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashCurrency(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Currency", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashDate(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Date", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashDateTime(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/DateTime", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashDateTimeBase(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/DateTimeBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashDateTimeOffset(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/DateTimeOffset", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashDateTimeWithTimezone(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/DateTimeWithTimezone", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashDecimal(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Decimal", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashDouble(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Double", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashGuid(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Guid", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashInt(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Int", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashInt16(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Int16", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashInt32(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Int32", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashInt64(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Int64", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashODataType(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/ODataType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashRaw(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Raw", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashSByte(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/SByte", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashSingle(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Single", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashStream(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Stream", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashString(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/String", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashTime(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Time", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashTimeOfDay(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/TimeOfDay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashtypeSlashUnit(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/type/Unit", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv2SlashBatchMode(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v2/BatchMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv2SlashContext(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v2/Context", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv2SlashODataAnnotations(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v2/ODataAnnotations", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv2SlashODataContextBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v2/ODataContextBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv2SlashODataListBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v2/ODataListBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv2SlashODataModel(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v2/ODataModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv2SlashODataTreeBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v2/ODataTreeBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashAnnotationHelper(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/AnnotationHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashContext(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/Context", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashODataContextBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/ODataContextBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashODataListBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/ODataListBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashODataMetaModel(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/ODataMetaModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashODataModel(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/ODataModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashODataPropertyBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/ODataPropertyBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashODataUtils(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/ODataUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashSubmitMode(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/SubmitMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashodataSlashv4SlashValueListType(value: Unit): Self = StObject.set(x, "sap/ui/model/odata/v4/ValueListType", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashresourceSlashResourceModel(value: Unit): Self = StObject.set(x, "sap/ui/model/resource/ResourceModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashBoolean(value: Unit): Self = StObject.set(x, "sap/ui/model/type/Boolean", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashCurrency(value: Unit): Self = StObject.set(x, "sap/ui/model/type/Currency", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashDate(value: Unit): Self = StObject.set(x, "sap/ui/model/type/Date", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashDateInterval(value: Unit): Self = StObject.set(x, "sap/ui/model/type/DateInterval", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashDateTime(value: Unit): Self = StObject.set(x, "sap/ui/model/type/DateTime", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashDateTimeInterval(value: Unit): Self = StObject.set(x, "sap/ui/model/type/DateTimeInterval", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashFileSize(value: Unit): Self = StObject.set(x, "sap/ui/model/type/FileSize", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashFloat(value: Unit): Self = StObject.set(x, "sap/ui/model/type/Float", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashInteger(value: Unit): Self = StObject.set(x, "sap/ui/model/type/Integer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashString(value: Unit): Self = StObject.set(x, "sap/ui/model/type/String", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashTime(value: Unit): Self = StObject.set(x, "sap/ui/model/type/Time", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashTimeInterval(value: Unit): Self = StObject.set(x, "sap/ui/model/type/TimeInterval", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashtypeSlashUnit(value: Unit): Self = StObject.set(x, "sap/ui/model/type/Unit", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashxmlSlashXMLModel(value: Unit): Self = StObject.set(x, "sap/ui/model/xml/XMLModel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashmodelSlashxmlSlashXMLTreeBinding(value: Unit): Self = StObject.set(x, "sap/ui/model/xml/XMLTreeBinding", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashperformanceSlashMeasurement(value: Unit): Self = StObject.set(x, "sap/ui/performance/Measurement", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashperformanceSlashXHRInterceptor(value: Unit): Self = StObject.set(x, "sap/ui/performance/XHRInterceptor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashperformanceSlashtraceSlashFESR(value: Unit): Self = StObject.set(x, "sap/ui/performance/trace/FESR", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashperformanceSlashtraceSlashFESRHelper(value: Unit): Self = StObject.set(x, "sap/ui/performance/trace/FESRHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashperformanceSlashtraceSlashInteraction(value: Unit): Self = StObject.set(x, "sap/ui/performance/trace/Interaction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashperformanceSlashtraceSlashinitTraces(value: Unit): Self = StObject.set(x, "sap/ui/performance/trace/initTraces", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashClient(value: Unit): Self = StObject.set(x, "sap/ui/rta/Client", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashapiSlashstartAdaptation(value: Unit): Self = StObject.set(x, "sap/ui/rta/api/startAdaptation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashapiSlashstartKeyUserAdaptation(value: Unit): Self = StObject.set(x, "sap/ui/rta/api/startKeyUserAdaptation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashenablementSlashTestDelegate(value: Unit): Self = StObject.set(x, "sap/ui/rta/enablement/TestDelegate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashserviceSlashAction(value: Unit): Self = StObject.set(x, "sap/ui/rta/service/Action", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashserviceSlashControllerExtension(value: Unit): Self = StObject.set(x, "sap/ui/rta/service/ControllerExtension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashserviceSlashOutline(value: Unit): Self = StObject.set(x, "sap/ui/rta/service/Outline", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashserviceSlashProperty(value: Unit): Self = StObject.set(x, "sap/ui/rta/service/Property", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashserviceSlashSelection(value: Unit): Self = StObject.set(x, "sap/ui/rta/service/Selection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashserviceSlashSupportTools(value: Unit): Self = StObject.set(x, "sap/ui/rta/service/SupportTools", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashrtaSlashutilSlashReloadManager(value: Unit): Self = StObject.set(x, "sap/ui/rta/util/ReloadManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsecuritySlashFrameOptions(value: Unit): Self = StObject.set(x, "sap/ui/security/FrameOptions", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsuiteSlashTaskCircle(value: Unit): Self = StObject.set(x, "sap/ui/suite/TaskCircle", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsuiteSlashVerticalProgressIndicator(value: Unit): Self = StObject.set(x, "sap/ui/suite/VerticalProgressIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsuiteSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/suite/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsupportSlashRuleAnalyzer(value: Unit): Self = StObject.set(x, "sap/ui/support/RuleAnalyzer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsupportSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/support/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsupportSlashsupportRulesSlashCoreFacade(value: Unit): Self = StObject.set(x, "sap/ui/support/supportRules/CoreFacade", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsupportSlashsupportRulesSlashExecutionScope(value: Unit): Self = StObject.set(x, "sap/ui/support/supportRules/ExecutionScope", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsupportSlashsupportRulesSlashHistory(value: Unit): Self = StObject.set(x, "sap/ui/support/supportRules/History", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashsupportSlashsupportRulesSlashIssueManager(value: Unit): Self = StObject.set(x, "sap/ui/support/supportRules/IssueManager", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashAnalyticalColumn(value: Unit): Self = StObject.set(x, "sap/ui/table/AnalyticalColumn", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashAnalyticalColumnMenu(value: Unit): Self = StObject.set(x, "sap/ui/table/AnalyticalColumnMenu", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashAnalyticalTable(value: Unit): Self = StObject.set(x, "sap/ui/table/AnalyticalTable", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashColumn(value: Unit): Self = StObject.set(x, "sap/ui/table/Column", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashColumnMenu(value: Unit): Self = StObject.set(x, "sap/ui/table/ColumnMenu", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashCreationRow(value: Unit): Self = StObject.set(x, "sap/ui/table/CreationRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashRow(value: Unit): Self = StObject.set(x, "sap/ui/table/Row", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashRowAction(value: Unit): Self = StObject.set(x, "sap/ui/table/RowAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashRowActionItem(value: Unit): Self = StObject.set(x, "sap/ui/table/RowActionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashRowSettings(value: Unit): Self = StObject.set(x, "sap/ui/table/RowSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashTable(value: Unit): Self = StObject.set(x, "sap/ui/table/Table", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashTablePersoController(value: Unit): Self = StObject.set(x, "sap/ui/table/TablePersoController", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashTreeTable(value: Unit): Self = StObject.set(x, "sap/ui/table/TreeTable", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/table/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashpluginsSlashMultiSelectionPlugin(value: Unit): Self = StObject.set(x, "sap/ui/table/plugins/MultiSelectionPlugin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashpluginsSlashSelectionPlugin(value: Unit): Self = StObject.set(x, "sap/ui/table/plugins/SelectionPlugin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashrowmodesSlashAutoRowMode(value: Unit): Self = StObject.set(x, "sap/ui/table/rowmodes/AutoRowMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashrowmodesSlashFixedRowMode(value: Unit): Self = StObject.set(x, "sap/ui/table/rowmodes/FixedRowMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashrowmodesSlashInteractiveRowMode(value: Unit): Self = StObject.set(x, "sap/ui/table/rowmodes/InteractiveRowMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtableSlashrowmodesSlashRowMode(value: Unit): Self = StObject.set(x, "sap/ui/table/rowmodes/RowMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashOpa(value: Unit): Self = StObject.set(x, "sap/ui/test/Opa", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashOpa5(value: Unit): Self = StObject.set(x, "sap/ui/test/Opa5", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashOpaBuilder(value: Unit): Self = StObject.set(x, "sap/ui/test/OpaBuilder", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashOpaExtension(value: Unit): Self = StObject.set(x, "sap/ui/test/OpaExtension", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashOpaPlugin(value: Unit): Self = StObject.set(x, "sap/ui/test/OpaPlugin", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashPageObjectFactory(value: Unit): Self = StObject.set(x, "sap/ui/test/PageObjectFactory", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashRecordReplay(value: Unit): Self = StObject.set(x, "sap/ui/test/RecordReplay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashactionsSlashAction(value: Unit): Self = StObject.set(x, "sap/ui/test/actions/Action", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashactionsSlashDrag(value: Unit): Self = StObject.set(x, "sap/ui/test/actions/Drag", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashactionsSlashDrop(value: Unit): Self = StObject.set(x, "sap/ui/test/actions/Drop", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashactionsSlashEnterText(value: Unit): Self = StObject.set(x, "sap/ui/test/actions/EnterText", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashactionsSlashPress(value: Unit): Self = StObject.set(x, "sap/ui/test/actions/Press", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashactionsSlashScroll(value: Unit): Self = StObject.set(x, "sap/ui/test/actions/Scroll", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashgenericSlashGenericTestCollection(value: Unit): Self = StObject.set(x, "sap/ui/test/generic/GenericTestCollection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashgenericSlashUtils(value: Unit): Self = StObject.set(x, "sap/ui/test/generic/Utils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashgherkinSlashStepDefinitions(value: Unit): Self = StObject.set(x, "sap/ui/test/gherkin/StepDefinitions", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashgherkinSlashdataTableUtils(value: Unit): Self = StObject.set(x, "sap/ui/test/gherkin/dataTableUtils", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashgherkinSlashopa5TestHarness(value: Unit): Self = StObject.set(x, "sap/ui/test/gherkin/opa5TestHarness", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashgherkinSlashqUnitTestHarness(value: Unit): Self = StObject.set(x, "sap/ui/test/gherkin/qUnitTestHarness", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashAggregationContainsPropertyEqual(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/AggregationContainsPropertyEqual", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashAggregationEmpty(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/AggregationEmpty", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashAggregationFilled(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/AggregationFilled", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashAggregationLengthEquals(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/AggregationLengthEquals", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashAncestor(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/Ancestor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashBindingPath(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/BindingPath", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashDescendant(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/Descendant", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashI18NText(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/I18NText", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashInteractable(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/Interactable", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashLabelFor(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/LabelFor", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashMatcher(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/Matcher", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashProperties(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/Properties", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashPropertyStrictEquals(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/PropertyStrictEquals", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashmatchersSlashSibling(value: Unit): Self = StObject.set(x, "sap/ui/test/matchers/Sibling", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestSlashopaQunit(value: Unit): Self = StObject.set(x, "sap/ui/test/opaQunit", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashtestrecorderSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/testrecorder/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashthirdpartySlashjquery(value: Unit): Self = StObject.set(x, "sap/ui/thirdparty/jquery", value.asInstanceOf[js.Any])
      
      inline def `setSapSlashuiSlashthirdpartySlashqunit-2`(value: Unit): Self = StObject.set(x, "sap/ui/thirdparty/qunit-2", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendar(value: Unit): Self = StObject.set(x, "sap/ui/unified/Calendar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendarAppointment(value: Unit): Self = StObject.set(x, "sap/ui/unified/CalendarAppointment", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendarDateInterval(value: Unit): Self = StObject.set(x, "sap/ui/unified/CalendarDateInterval", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendarLegend(value: Unit): Self = StObject.set(x, "sap/ui/unified/CalendarLegend", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendarLegendItem(value: Unit): Self = StObject.set(x, "sap/ui/unified/CalendarLegendItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendarMonthInterval(value: Unit): Self = StObject.set(x, "sap/ui/unified/CalendarMonthInterval", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendarRow(value: Unit): Self = StObject.set(x, "sap/ui/unified/CalendarRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCalendarTimeInterval(value: Unit): Self = StObject.set(x, "sap/ui/unified/CalendarTimeInterval", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashColorPicker(value: Unit): Self = StObject.set(x, "sap/ui/unified/ColorPicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashColorPickerDisplayMode(value: Unit): Self = StObject.set(x, "sap/ui/unified/ColorPickerDisplayMode", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashColorPickerPopover(value: Unit): Self = StObject.set(x, "sap/ui/unified/ColorPickerPopover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashContentSwitcher(value: Unit): Self = StObject.set(x, "sap/ui/unified/ContentSwitcher", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashCurrency(value: Unit): Self = StObject.set(x, "sap/ui/unified/Currency", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashDateRange(value: Unit): Self = StObject.set(x, "sap/ui/unified/DateRange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashDateTypeRange(value: Unit): Self = StObject.set(x, "sap/ui/unified/DateTypeRange", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashFileUploader(value: Unit): Self = StObject.set(x, "sap/ui/unified/FileUploader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashFileUploaderHttpRequestMethod(value: Unit): Self = StObject.set(x, "sap/ui/unified/FileUploaderHttpRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashFileUploaderParameter(value: Unit): Self = StObject.set(x, "sap/ui/unified/FileUploaderParameter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashFileUploaderXHRSettings(value: Unit): Self = StObject.set(x, "sap/ui/unified/FileUploaderXHRSettings", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashMenu(value: Unit): Self = StObject.set(x, "sap/ui/unified/Menu", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashMenuItem(value: Unit): Self = StObject.set(x, "sap/ui/unified/MenuItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashMenuItemBase(value: Unit): Self = StObject.set(x, "sap/ui/unified/MenuItemBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashMenuTextFieldItem(value: Unit): Self = StObject.set(x, "sap/ui/unified/MenuTextFieldItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashShell(value: Unit): Self = StObject.set(x, "sap/ui/unified/Shell", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashShellHeadItem(value: Unit): Self = StObject.set(x, "sap/ui/unified/ShellHeadItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashShellHeadUserItem(value: Unit): Self = StObject.set(x, "sap/ui/unified/ShellHeadUserItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashShellLayout(value: Unit): Self = StObject.set(x, "sap/ui/unified/ShellLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashShellOverlay(value: Unit): Self = StObject.set(x, "sap/ui/unified/ShellOverlay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashSplitContainer(value: Unit): Self = StObject.set(x, "sap/ui/unified/SplitContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashcalendarSlashDatesRow(value: Unit): Self = StObject.set(x, "sap/ui/unified/calendar/DatesRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashcalendarSlashHeader(value: Unit): Self = StObject.set(x, "sap/ui/unified/calendar/Header", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashcalendarSlashMonth(value: Unit): Self = StObject.set(x, "sap/ui/unified/calendar/Month", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashcalendarSlashMonthPicker(value: Unit): Self = StObject.set(x, "sap/ui/unified/calendar/MonthPicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashcalendarSlashMonthsRow(value: Unit): Self = StObject.set(x, "sap/ui/unified/calendar/MonthsRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashcalendarSlashTimesRow(value: Unit): Self = StObject.set(x, "sap/ui/unified/calendar/TimesRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashcalendarSlashYearPicker(value: Unit): Self = StObject.set(x, "sap/ui/unified/calendar/YearPicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashunifiedSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/unified/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashutilSlashActivityDetection(value: Unit): Self = StObject.set(x, "sap/ui/util/ActivityDetection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashutilSlashMobile(value: Unit): Self = StObject.set(x, "sap/ui/util/Mobile", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashutilSlashStorage(value: Unit): Self = StObject.set(x, "sap/ui/util/Storage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashutilSlashXMLHelper(value: Unit): Self = StObject.set(x, "sap/ui/util/XMLHelper", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashutilSlashdefaultLinkTypes(value: Unit): Self = StObject.set(x, "sap/ui/util/defaultLinkTypes", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashutilSlashisCrossOriginURL(value: Unit): Self = StObject.set(x, "sap/ui/util/isCrossOriginURL", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashutilSlashopenWindow(value: Unit): Self = StObject.set(x, "sap/ui/util/openWindow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashActionBar(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ActionBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashCollection(value: Unit): Self = StObject.set(x, "sap/ui/ux3/Collection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashCollectionInspector(value: Unit): Self = StObject.set(x, "sap/ui/ux3/CollectionInspector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashDataSet(value: Unit): Self = StObject.set(x, "sap/ui/ux3/DataSet", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashDataSetItem(value: Unit): Self = StObject.set(x, "sap/ui/ux3/DataSetItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashDataSetSimpleView(value: Unit): Self = StObject.set(x, "sap/ui/ux3/DataSetSimpleView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashExact(value: Unit): Self = StObject.set(x, "sap/ui/ux3/Exact", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashExactArea(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ExactArea", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashExactAttribute(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ExactAttribute", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashExactBrowser(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ExactBrowser", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashExactList(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ExactList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashFacetFilter(value: Unit): Self = StObject.set(x, "sap/ui/ux3/FacetFilter", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashFacetFilterList(value: Unit): Self = StObject.set(x, "sap/ui/ux3/FacetFilterList", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashFeed(value: Unit): Self = StObject.set(x, "sap/ui/ux3/Feed", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashFeedChunk(value: Unit): Self = StObject.set(x, "sap/ui/ux3/FeedChunk", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashFeeder(value: Unit): Self = StObject.set(x, "sap/ui/ux3/Feeder", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashNavigationBar(value: Unit): Self = StObject.set(x, "sap/ui/ux3/NavigationBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashNavigationItem(value: Unit): Self = StObject.set(x, "sap/ui/ux3/NavigationItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashNotificationBar(value: Unit): Self = StObject.set(x, "sap/ui/ux3/NotificationBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashNotifier(value: Unit): Self = StObject.set(x, "sap/ui/ux3/Notifier", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashOverlay(value: Unit): Self = StObject.set(x, "sap/ui/ux3/Overlay", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashOverlayContainer(value: Unit): Self = StObject.set(x, "sap/ui/ux3/OverlayContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashOverlayDialog(value: Unit): Self = StObject.set(x, "sap/ui/ux3/OverlayDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashQuickView(value: Unit): Self = StObject.set(x, "sap/ui/ux3/QuickView", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashShell(value: Unit): Self = StObject.set(x, "sap/ui/ux3/Shell", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashThingAction(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ThingAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashThingGroup(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ThingGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashThingInspector(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ThingInspector", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashThingViewer(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ThingViewer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3SlashToolPopup(value: Unit): Self = StObject.set(x, "sap/ui/ux3/ToolPopup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashux3Slashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/ux3/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashcommonSlashWebComponent(value: Unit): Self = StObject.set(x, "sap/ui/webc/common/WebComponent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashcommonSlashWebComponentMetadata(value: Unit): Self = StObject.set(x, "sap/ui/webc/common/WebComponentMetadata", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashcommonSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/webc/common/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashBar(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/Bar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashBarcodeScannerDialog(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/BarcodeScannerDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashDynamicSideContent(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/DynamicSideContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashFilterItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/FilterItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashFilterItemOption(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/FilterItemOption", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashFlexibleColumnLayout(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/FlexibleColumnLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashIllustratedMessage(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/IllustratedMessage", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashMediaGallery(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/MediaGallery", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashMediaGalleryItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/MediaGalleryItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashNotificationAction(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/NotificationAction", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashNotificationListGroupItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/NotificationListGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashNotificationListItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/NotificationListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashPage(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/Page", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashProductSwitch(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/ProductSwitch", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashProductSwitchItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/ProductSwitchItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashShellBar(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/ShellBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashShellBarItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/ShellBarItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashSideNavigation(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/SideNavigation", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashSideNavigationItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/SideNavigationItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashSideNavigationSubItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/SideNavigationSubItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashSortItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/SortItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashTimeline(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/Timeline", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashTimelineItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/TimelineItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashUploadCollection(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/UploadCollection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashUploadCollectionItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/UploadCollectionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashViewSettingsDialog(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/ViewSettingsDialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashWizard(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/Wizard", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashWizardStep(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/WizardStep", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashfioriSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/webc/fiori/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashAvatar(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Avatar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashAvatarGroup(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/AvatarGroup", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashBadge(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Badge", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashBreadcrumbs(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashBreadcrumbsItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/BreadcrumbsItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashBusyIndicator(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/BusyIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashButton(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Button", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashCalendar(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Calendar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashCalendarDate(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/CalendarDate", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashCard(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Card", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashCardHeader(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/CardHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashCarousel(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Carousel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashCheckBox(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/CheckBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashColorPalette(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ColorPalette", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashColorPaletteItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ColorPaletteItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashColorPalettePopover(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ColorPalettePopover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashColorPicker(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ColorPicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashComboBox(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ComboBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashComboBoxGroupItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ComboBoxGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashComboBoxItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ComboBoxItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashCustomListItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/CustomListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashDatePicker(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/DatePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashDateRangePicker(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/DateRangePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashDateTimePicker(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/DateTimePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashDialog(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Dialog", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashFileUploader(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/FileUploader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashGroupHeaderListItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/GroupHeaderListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashIcon(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Icon", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashInput(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Input", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashLabel(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Label", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashLink(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Link", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashList(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/List", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashMenu(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Menu", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashMenuItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/MenuItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashMessageStrip(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/MessageStrip", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashMultiComboBox(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/MultiComboBox", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashMultiComboBoxGroupItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/MultiComboBoxGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashMultiComboBoxItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/MultiComboBoxItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashMultiInput(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/MultiInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashOption(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Option", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashPanel(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Panel", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashPopover(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Popover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashProgressIndicator(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ProgressIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashRadioButton(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/RadioButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashRangeSlider(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/RangeSlider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashRatingIndicator(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/RatingIndicator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashResponsivePopover(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ResponsivePopover", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSegmentedButton(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/SegmentedButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSegmentedButtonItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/SegmentedButtonItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSelect(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Select", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSlider(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Slider", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSplitButton(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/SplitButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashStandardListItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/StandardListItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashStepInput(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/StepInput", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSuggestionGroupItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/SuggestionGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSuggestionItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/SuggestionItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashSwitch(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Switch", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTab(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Tab", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTabContainer(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TabContainer", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTabSeparator(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TabSeparator", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTable(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Table", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTableCell(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TableCell", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTableColumn(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TableColumn", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTableGroupRow(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TableGroupRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTableRow(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TableRow", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTextArea(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TextArea", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTimePicker(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TimePicker", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTitle(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Title", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashToast(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Toast", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashToggleButton(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/ToggleButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashToken(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Token", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTree(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/Tree", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashTreeItem(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/TreeItem", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuiSlashwebcSlashmainSlashlibrary(value: Unit): Self = StObject.set(x, "sap/ui/webc/main/library", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashAnchorBar(value: Unit): Self = StObject.set(x, "sap/uxap/AnchorBar", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashBlockBase(value: Unit): Self = StObject.set(x, "sap/uxap/BlockBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashBreadCrumbs(value: Unit): Self = StObject.set(x, "sap/uxap/BreadCrumbs", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashHierarchicalSelect(value: Unit): Self = StObject.set(x, "sap/uxap/HierarchicalSelect", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashModelMapping(value: Unit): Self = StObject.set(x, "sap/uxap/ModelMapping", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageAccessibleLandmarkInfo(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageAccessibleLandmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageDynamicHeaderContent(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageDynamicHeaderContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageDynamicHeaderTitle(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageDynamicHeaderTitle", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageHeader(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageHeader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageHeaderActionButton(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageHeaderActionButton", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageHeaderContent(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageHeaderContent", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageHeaderLayoutData(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageHeaderLayoutData", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageLayout(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageLayout", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageLazyLoader(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageLazyLoader", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageSection(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageSection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageSectionBase(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageSectionBase", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashObjectPageSubSection(value: Unit): Self = StObject.set(x, "sap/uxap/ObjectPageSubSection", value.asInstanceOf[js.Any])
      
      inline def setSapSlashuxapSlashlibrary(value: Unit): Self = StObject.set(x, "sap/uxap/library", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @SINCE 1.4
    *
    * The main UI5 control library, with responsive controls that can be used in touch devices as well as desktop
    * browsers.
    */
  object m {
    
    /**
      * @SINCE 1.48.0
      *
      * The public facade of the {@link sap.m.SelectionDetailsItem} element.
      */
    @js.native
    trait SelectionDetailsItemFacade extends StObject {
      
      /**
        * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
        *
        * Adds some action to the aggregation {@link #getActions actions}.
        *
        * @returns Reference to `this` in order to allow method chaining
        */
      def addAction(/**
        * The action to add; if empty, nothing is inserted
        */
      oAction: default): this.type = js.native
      
      /**
        * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
        *
        * Gets current value of property {@link #getEnableNav enableNav}.
        *
        * Determines whether or not the item is active and a navigation event is triggered on press.
        *
        * Default value is `false`.
        *
        * @returns Value of property `enableNav`
        */
      def getEnableNav(): Boolean = js.native
      
      def removeAction(/**
        * The action to remove or its index or id
        */
      vAction: String): default | Null = js.native
      /**
        * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
        *
        * Removes a action from the aggregation {@link #getActions actions}.
        *
        * @returns The removed action or `null`
        */
      def removeAction(/**
        * The action to remove or its index or id
        */
      vAction: int): default | Null = js.native
      def removeAction(/**
        * The action to remove or its index or id
        */
      vAction: default): default | Null = js.native
      
      /**
        * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
        *
        * Sets a new value for property {@link #getEnableNav enableNav}.
        *
        * Determines whether or not the item is active and a navigation event is triggered on press.
        *
        * When called with a value of `null` or `undefined`, the default value of the property will be restored.
        *
        * Default value is `false`.
        *
        * @returns Reference to `this` in order to allow method chaining
        */
      def setEnableNav(): this.type = js.native
      def setEnableNav(/**
        * New value for property `enableNav`
        */
      bEnableNav: Boolean): this.type = js.native
    }
  }
  
  /**
    * The `sap.ui` namespace is the central OpenAjax compliant entry point for UI related JavaScript functionality
    * provided by SAP.
    */
  object ui {
    
    /**
      * @SINCE 1.50
      *
      * UI5 library: sap.ui.support. A library for the Support Assistant tool. Overview: The library provides
      * the Support Assistant tool. It enables application developers to check whether their applications are
      * built according to the best practices for building SAPUI5 apps. The tool uses a set of pre-defined rules
      * to check all aspects of an application.
      */
    object support {
      
      /**
        * The CoreFacade interface allows rule developers to access the metadata, models, UI areas and components
        * of the Core.
        *
        * Usage: The CoreFacade is passed as second argument to all rule check functions.
        */
      trait CoreFacade extends StObject {
        
        /**
          * Gets the Components from the Core object.
          */
        def getComponents(): Unit
        
        /**
          * Gets the Metadata from the Core object.
          */
        def getMetadata(): Unit
        
        /**
          * Gets the Models from the Core object.
          */
        def getModels(): Unit
        
        /**
          * Gets the UI areas from the Core object.
          */
        def getUIAreas(): Unit
      }
      object CoreFacade {
        
        inline def apply(getComponents: () => Unit, getMetadata: () => Unit, getModels: () => Unit, getUIAreas: () => Unit): CoreFacade = {
          val __obj = js.Dynamic.literal(getComponents = js.Any.fromFunction0(getComponents), getMetadata = js.Any.fromFunction0(getMetadata), getModels = js.Any.fromFunction0(getModels), getUIAreas = js.Any.fromFunction0(getUIAreas))
          __obj.asInstanceOf[CoreFacade]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: CoreFacade] (val x: Self) extends AnyVal {
          
          inline def setGetComponents(value: () => Unit): Self = StObject.set(x, "getComponents", js.Any.fromFunction0(value))
          
          inline def setGetMetadata(value: () => Unit): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
          
          inline def setGetModels(value: () => Unit): Self = StObject.set(x, "getModels", js.Any.fromFunction0(value))
          
          inline def setGetUIAreas(value: () => Unit): Self = StObject.set(x, "getUIAreas", js.Any.fromFunction0(value))
        }
      }
      
      /**
        * The IssueManagerFacade allows rule developers to add new issues.
        *
        * Usage: The IssueManagerFacade is passed as first argument to all rule check functions.
        */
      trait IssueManagerFacade extends StObject {
        
        /**
          * Adds issue
          */
        def addIssue(/**
          * Issue object to be added
          */
        oIssue: Details): Unit
      }
      object IssueManagerFacade {
        
        inline def apply(addIssue: Details => Unit): IssueManagerFacade = {
          val __obj = js.Dynamic.literal(addIssue = js.Any.fromFunction1(addIssue))
          __obj.asInstanceOf[IssueManagerFacade]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IssueManagerFacade] (val x: Self) extends AnyVal {
          
          inline def setAddIssue(value: Details => Unit): Self = StObject.set(x, "addIssue", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
