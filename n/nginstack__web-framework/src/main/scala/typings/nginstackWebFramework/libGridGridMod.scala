package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Buttons
import typings.nginstackWebFramework.anon.Cancelable
import typings.nginstackWebFramework.anon.Visible
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridGridMod {
  
  inline def apply(parent: Any, name: String): Unit = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Grid {
    def this(parent: Any, name: String) = this()
  }
  @JSImport("@nginstack/web-framework/lib/grid/Grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "ALWAYS")
  @js.native
  def ALWAYS: Double = js.native
  inline def ALWAYS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALWAYS")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "FORMVIEW")
  @js.native
  val FORMVIEW: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "LOCATE_ALL_FIELDS")
  @js.native
  def LOCATE_ALL_FIELDS: Double = js.native
  inline def LOCATE_ALL_FIELDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCATE_ALL_FIELDS")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "LOCATE_EXACT")
  @js.native
  def LOCATE_EXACT: Double = js.native
  inline def LOCATE_EXACT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCATE_EXACT")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "LOCATE_NEXT")
  @js.native
  def LOCATE_NEXT: Double = js.native
  inline def LOCATE_NEXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCATE_NEXT")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "MAX_VISIBLE_RECORD_COUNT")
  @js.native
  def MAX_VISIBLE_RECORD_COUNT: Double = js.native
  inline def MAX_VISIBLE_RECORD_COUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VISIBLE_RECORD_COUNT")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "NEVER")
  @js.native
  def NEVER: Double = js.native
  inline def NEVER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEVER")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "TABLEVIEW")
  @js.native
  val TABLEVIEW: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/Grid", "USER_PERMISSION")
  @js.native
  def USER_PERMISSION: Double = js.native
  inline def USER_PERMISSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_PERMISSION")(x.asInstanceOf[js.Any])
  
  inline def persist(grids: js.Array[Grid]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("persist")(grids.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def persist(grids: Grid): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("persist")(grids.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type AdapterDescriptor = typings.nginstackEngine.libEventAdapterDescriptorMod.^
  
  type Button = typings.nginstackWebFramework.libButtonButtonMod.^
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  @js.native
  trait Grid extends StObject {
    
    /* private */ var _addField: Any = js.native
    
    /* private */ var _applyGridDefinition: Any = js.native
    
    /* private */ var _canInsertRecord: Any = js.native
    
    /* private */ var _classe: Any = js.native
    
    /* private */ var _close: Any = js.native
    
    /* private */ var _compareNearestOrMatch: Any = js.native
    
    /* private */ var _defaultOnLocate: Any = js.native
    
    /* private */ var _defaultOnShowLog: Any = js.native
    
    /* private */ var _delMasterAndDetailRecords: Any = js.native
    
    /* private */ var _deleteDetailGrids: Any = js.native
    
    /* private */ var _fieldToLinkId: Any = js.native
    
    /* private */ var _fpvManager: Any = js.native
    
    /* private */ var _getAllDataSets: Any = js.native
    
    /* private */ var _getArrayFromList: Any = js.native
    
    /* private */ var _getChanges: Any = js.native
    
    /* private */ var _getClassKeyToValidate: Any = js.native
    
    /* private */ var _getFieldByName: Any = js.native
    
    /* private */ var _getFieldIndexOrder: Any = js.native
    
    /* private */ var _getRequiredFieldsNotFilled: Any = js.native
    
    /* private */ var _getSuggestedClassToInsertion: Any = js.native
    
    /* private */ var _handleLookup: Any = js.native
    
    /* private */ var _hasScrollEvents: Any = js.native
    
    /* private */ var _hasSelectEvents: Any = js.native
    
    /* private */ var _isChildOfRoot: Any = js.native
    
    /* private */ var _isChildOfRoots: Any = js.native
    
    /* private */ var _isInserting: Any = js.native
    
    /* private */ var _isVariableGrid: Any = js.native
    
    /* private */ var _ivfs: Any = js.native
    
    /* private */ var _locateCalculatedField: Any = js.native
    
    /* private */ var _locateField: Any = js.native
    
    /* private */ var _locateLookupField: Any = js.native
    
    /* private */ var _locateMemoField: Any = js.native
    
    /* private */ var _locateValueAtField: Any = js.native
    
    /* private */ var _lookupCallerField: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _newTableViewRecordBuffer: Any = js.native
    
    /* private */ var _originalTreeClone: Any = js.native
    
    /* private */ var _permissionFilters: Any = js.native
    
    /* private */ var _prepareAggregates: Any = js.native
    
    /* private */ var _prepareDetailGrid: Any = js.native
    
    /* private */ var _prepareDetailGrids: Any = js.native
    
    /* private */ var _prepareFieldFormAndTableViewable: Any = js.native
    
    /* private */ var _prepareFieldPermissions: Any = js.native
    
    /* private */ var _prepareFromClass: Any = js.native
    
    /* private */ var _prepareFromDataSet: Any = js.native
    
    /* private */ var _prepareGridEvents: Any = js.native
    
    /* private */ var _prepareIfNecessary: Any = js.native
    
    /* private */ var _preparePermissionFilter: Any = js.native
    
    /* private */ var _prepareRequiredDataSetFields: Any = js.native
    
    /* private */ var _prepareTreeGrid: Any = js.native
    
    /* private */ var _preparedFieldsLength: Any = js.native
    
    /* private */ var _readOnlyOfFieldsHasChanged: Any = js.native
    
    /* private */ var _removeStrFromList: Any = js.native
    
    /* private */ var _reprepareFieldPermissions: Any = js.native
    
    /* private */ var _reprepareGrid: Any = js.native
    
    /* private */ var _requiredDataSetFieldsSatisfied: Any = js.native
    
    /* private */ var _resetClientButtons: Any = js.native
    
    /* protected */ def _scrollDetailGrids(): Unit = js.native
    
    /* private */ var _setFieldDefaultValue: Any = js.native
    
    /* private */ var _sortFieldsAndDeclareUnnamedGroups: Any = js.native
    
    /* private */ var _syncOfGrLookupFromReadOnlyField: Any = js.native
    
    /* private */ var _translateFieldNamesToFieldObjectsArray: Any = js.native
    
    /* private */ var _validateDelete: Any = js.native
    
    /* private */ var _validateExport: Any = js.native
    
    /* private */ var _validateIfUserCanPost: Any = js.native
    
    /* private */ var _validateIfUserCanStartEdit: Any = js.native
    
    /* private */ var _validateIfUserCanStartInsertAndReturnSuggestedClassKey: Any = js.native
    
    /* private */ var _validateJustToGroup: Any = js.native
    
    /* private */ var _validateNegativeKey: Any = js.native
    
    /* private */ var _writeAndScrollDetails: Any = js.native
    
    /* private */ var act_focus_ : Any = js.native
    
    def action(name: Any, target: Any, order: Any, processKey: Any, newTab: Any): Button = js.native
    
    /* protected */ def adaptEvent_(name: String, descriptor: AdapterDescriptor): Unit = js.native
    /* protected */ def adaptEvent_(name: String, descriptor: Record[Any, Any]): Unit = js.native
    
    /* private */ var aggregateBar: Any = js.native
    
    /* private */ var alertKeyNotFoundOnce: Any = js.native
    
    /* private */ var alertedKeys_ : Any = js.native
    
    /* private */ var allAlreadySelected_ : Any = js.native
    
    /* private */ var arButtons: Any = js.native
    
    /* protected */ var arFields: js.Array[Any] = js.native
    
    /* private */ var arFormViewFields: Any = js.native
    
    /* private */ var arTableViewFields: Any = js.native
    
    /* private */ var assign: Any = js.native
    
    var autoPersist: Boolean = js.native
    
    var automaticClearSelectedRecords: Boolean = js.native
    
    var automaticClearUnselectableRecords: Boolean = js.native
    
    /* private */ var bookmarkBeforeRefresh_ : Any = js.native
    
    /* private */ var breakFocusFlow: Any = js.native
    
    var breakLine: Boolean = js.native
    
    def button(name: String): Button = js.native
    def button(name: String, opt_target: String): Button = js.native
    def button(name: String, opt_target: String, opt_order: Double): Button = js.native
    def button(name: String, opt_target: String, opt_order: Double, opt_processKey: Double): Button = js.native
    def button(name: String, opt_target: String, opt_order: Double, opt_processKey: Double, opt_newTab: Boolean): Button = js.native
    def button(name: String, opt_target: String, opt_order: Double, opt_processKey: Unit, opt_newTab: Boolean): Button = js.native
    def button(name: String, opt_target: String, opt_order: Unit, opt_processKey: Double): Button = js.native
    def button(name: String, opt_target: String, opt_order: Unit, opt_processKey: Double, opt_newTab: Boolean): Button = js.native
    def button(name: String, opt_target: String, opt_order: Unit, opt_processKey: Unit, opt_newTab: Boolean): Button = js.native
    def button(name: String, opt_target: js.Function1[/* arg0 */ Any, Any]): Button = js.native
    def button(name: String, opt_target: js.Function1[/* arg0 */ Any, Any], opt_order: Double): Button = js.native
    def button(
      name: String,
      opt_target: js.Function1[/* arg0 */ Any, Any],
      opt_order: Double,
      opt_processKey: Double
    ): Button = js.native
    def button(
      name: String,
      opt_target: js.Function1[/* arg0 */ Any, Any],
      opt_order: Double,
      opt_processKey: Double,
      opt_newTab: Boolean
    ): Button = js.native
    def button(
      name: String,
      opt_target: js.Function1[/* arg0 */ Any, Any],
      opt_order: Double,
      opt_processKey: Unit,
      opt_newTab: Boolean
    ): Button = js.native
    def button(
      name: String,
      opt_target: js.Function1[/* arg0 */ Any, Any],
      opt_order: Unit,
      opt_processKey: Double
    ): Button = js.native
    def button(
      name: String,
      opt_target: js.Function1[/* arg0 */ Any, Any],
      opt_order: Unit,
      opt_processKey: Double,
      opt_newTab: Boolean
    ): Button = js.native
    def button(
      name: String,
      opt_target: js.Function1[/* arg0 */ Any, Any],
      opt_order: Unit,
      opt_processKey: Unit,
      opt_newTab: Boolean
    ): Button = js.native
    def button(name: String, opt_target: Unit, opt_order: Double): Button = js.native
    def button(name: String, opt_target: Unit, opt_order: Double, opt_processKey: Double): Button = js.native
    def button(name: String, opt_target: Unit, opt_order: Double, opt_processKey: Double, opt_newTab: Boolean): Button = js.native
    def button(name: String, opt_target: Unit, opt_order: Double, opt_processKey: Unit, opt_newTab: Boolean): Button = js.native
    def button(name: String, opt_target: Unit, opt_order: Unit, opt_processKey: Double): Button = js.native
    def button(name: String, opt_target: Unit, opt_order: Unit, opt_processKey: Double, opt_newTab: Boolean): Button = js.native
    def button(name: String, opt_target: Unit, opt_order: Unit, opt_processKey: Unit, opt_newTab: Boolean): Button = js.native
    
    /* private */ var buttons: Any = js.native
    
    /* private */ var calculateFirstRecNoOfView: Any = js.native
    
    var canDelete: Double = js.native
    
    var canDuplicate: Boolean = js.native
    
    var canEdit: Double = js.native
    
    var canExport: Double = js.native
    
    var canInsert: Double = js.native
    
    var canInvertSelection: Boolean = js.native
    
    var canModify: Boolean = js.native
    
    /* private */ var canPost: Any = js.native
    
    var canPostDataSetOnEvents: Boolean = js.native
    
    /* private */ var canShowButtonsBar: Any = js.native
    
    var canShowLog: Boolean = js.native
    
    /* private */ var canSync: Any = js.native
    
    def cancel(): Unit = js.native
    
    /* private */ var changes: Any = js.native
    
    /* private */ var checkRefresh: Any = js.native
    
    /* private */ var checkWordAvailability: Any = js.native
    
    var classDefManager: typings.nginstackEngine.libClassdefClassDefManagerMod.^ = js.native
    
    var classDefinition: Any = js.native
    
    var classKey: Double = js.native
    
    var classKeyToValidatePermission: Double | typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    var classesToValidatePermissions: js.Array[Any] = js.native
    
    def clearButtons(): Unit = js.native
    
    /* private */ var clearFields: Any = js.native
    
    /* private */ var clearSelectedFieldByClick: Any = js.native
    
    /* private */ var clientBof: Any = js.native
    
    /* private */ var clientCanDelete: Any = js.native
    
    /* private */ var clientCanExport: Any = js.native
    
    /* private */ var clientCanInsert: Any = js.native
    
    /* private */ var clientCanInvertSelection: Any = js.native
    
    /* private */ var clientCanModify: Any = js.native
    
    /* private */ var clientCanPost: Any = js.native
    
    /* private */ var clientCanShowLog: Any = js.native
    
    /* private */ var clientCollapsed: Any = js.native
    
    /* private */ var clientEditingFieldName: Any = js.native
    
    /* private */ var clientEof: Any = js.native
    
    /* private */ var clientPosition: Any = js.native
    
    /* private */ var clientRecNo: Any = js.native
    
    /* private */ var clientRecordCount: Any = js.native
    
    def colapse(nodeValue: String): Unit = js.native
    
    var collapsed: Boolean = js.native
    
    /* private */ var collapsed_ : Any = js.native
    
    /* private */ var collectAllRecordsToDuplicate_ : Any = js.native
    
    var column: Double = js.native
    
    /* private */ var componentFactoryResolver_ : Any = js.native
    
    var confirmCancel: Boolean = js.native
    
    var confirmChange: Boolean = js.native
    
    var confirmDelete: Boolean = js.native
    
    var cssClass: Any = js.native
    
    var dataExporter: Any = js.native
    
    /* private */ var declareGetterAndSetter_ : Any = js.native
    
    var definitionClass: Double | Null = js.native
    
    var definitionName: Double | Null = js.native
    
    def del(): Unit = js.native
    def del(handleDetailGrid: Boolean): Unit = js.native
    
    /* private */ var delayedOnAfterScrollEventCall_ : Any = js.native
    
    /* private */ var delete: Any = js.native
    
    /* private */ var deleteField: Any = js.native
    
    /* private */ var directionOfBlur: Any = js.native
    
    /* private */ var doRefresh: Any = js.native
    
    var ds: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ var dsFieldTypeToFieldType: Any = js.native
    
    def duplicateRecord(): Unit = js.native
    def duplicateRecord(opt_bookmark: String): Unit = js.native
    
    /* private */ var duplicationHandling: Any = js.native
    
    def edit(): Unit = js.native
    def edit(field: typings.nginstackWebFramework.libGridGridFieldMod.^): Unit = js.native
    
    /* private */ var editingField: Any = js.native
    
    /* private */ var editingOrInserting: Any = js.native
    
    def emit(event: Any, args: Any*): Any = js.native
    
    var enabledActions: js.Array[Button | String] = js.native
    
    var enabledButtons: js.Array[Button | String] = js.native
    
    /* private */ var endLookup: Any = js.native
    
    /* private */ var executePrepareOnFieldMethod: Any = js.native
    
    def expand(nodeValue: String): Unit = js.native
    
    /* private */ var exportersClass: Any = js.native
    
    /* private */ var fCanDelete: Any = js.native
    
    /* private */ var fCanEdit: Any = js.native
    
    /* private */ var fCanInsert: Any = js.native
    
    /* private */ var fDs: Any = js.native
    
    /* private */ var fSelectedRecords: Any = js.native
    
    /* private */ var fViewMode: Any = js.native
    
    def field(name: String, opt_type: String, opt_size: Double, args: Any*): typings.nginstackEngine.libClassdefFieldMod.^ | ViewDefField = js.native
    def field(name: String, opt_type: String, opt_size: Unit, args: Any*): typings.nginstackEngine.libClassdefFieldMod.^ | ViewDefField = js.native
    def field(name: String, opt_type: Unit, opt_size: Double, args: Any*): typings.nginstackEngine.libClassdefFieldMod.^ | ViewDefField = js.native
    def field(name: String, opt_type: Unit, opt_size: Unit, args: Any*): typings.nginstackEngine.libClassdefFieldMod.^ | ViewDefField = js.native
    
    /* private */ var fieldAction: Any = js.native
    
    /* private */ var fieldIsVisibleInCurrentView_ : Any = js.native
    
    /* private */ var fieldToFocus: Any = js.native
    
    /* private */ var fieldToFocusCalledByUser: Any = js.native
    
    var fields: typings.nginstackEngine.libClassdefFieldListMod.^ = js.native
    
    /* private */ var fieldsHasChanged: Any = js.native
    
    /* private */ var finishToggleFieldVisibility_ : Any = js.native
    
    /* private */ var firstEditableField: Any = js.native
    
    /* private */ var firstField: Any = js.native
    
    /* private */ var firstRecNoOfView: Any = js.native
    
    /* private */ var flushFocusFlow: Any = js.native
    
    /* private */ var focusChangedByLocate_ : Any = js.native
    
    /* private */ var focusFlowDisabled_ : Any = js.native
    
    /* private */ var forEachDetail_ : Any = js.native
    
    /* private */ var forceChangedFields: Any = js.native
    
    /* private */ var formSyncRefreshNavButtonsView: Any = js.native
    
    /* private */ var formSync_ : Any = js.native
    
    /* private */ var formViewBuffer_ : Any = js.native
    
    var formViewFieldNames: String = js.native
    
    /* private */ var formatEventId: Any = js.native
    
    /* private */ var getActions: Any = js.native
    
    /* private */ var getChildrenJustToGroup_ : Any = js.native
    
    /* private */ var getClassFieldExistInDs: Any = js.native
    
    /* private */ var getCurrentBookmark: Any = js.native
    
    /* private */ var getCurrentRecNo_ : Any = js.native
    
    /* private */ var getExportFormatsOptions: Any = js.native
    
    /* private */ var getFieldByNames_ : Any = js.native
    
    def getFieldsAsStringList(): typings.nginstackEngine.libStringStringListMod.^ = js.native
    
    def getFieldsByProperty(args: Any*): js.Array[typings.nginstackEngine.libClassdefFieldMod.^] = js.native
    
    /* private */ var getFormViewDataSynchronize: Any = js.native
    
    /* private */ var getHintValues: Any = js.native
    
    /* private */ var getHtmlForLinks_ : Any = js.native
    
    /* private */ var getIclass: Any = js.native
    
    /* private */ var getIkey: Any = js.native
    
    /* private */ var getIndexOfDsClassField: Any = js.native
    
    /* private */ var getIndexOfDsKeyField: Any = js.native
    
    def getKeyField(): typings.nginstackEngine.libClassdefFieldMod.^ = js.native
    
    /* private */ var getKeyFieldExistInDs: Any = js.native
    
    def getLookupCallerField(): typings.nginstackEngine.libClassdefFieldMod.^ = js.native
    
    /* private */ var getNextEditableField: Any = js.native
    
    /* private */ var getNextFieldToFocus: Any = js.native
    
    /* private */ var getNextVisibleField: Any = js.native
    
    /* private */ var getPriorEditableField: Any = js.native
    
    /* private */ var getPriorVisibleField: Any = js.native
    
    /* private */ var getRecordCount_ : Any = js.native
    
    def getSelectedRecords(): js.Array[Any] = js.native
    def getSelectedRecords(opt_viewMode: Double): js.Array[Any] = js.native
    
    def getSelectedRecordsAtView(): js.Array[Any] = js.native
    def getSelectedRecordsAtView(viewMode: Double): js.Array[Any] = js.native
    
    /* private */ var getSelectionRecordsRange: Any = js.native
    
    /* private */ var getTableRecordsSyncCommands_ : Any = js.native
    
    var groups: typings.nginstackWebFramework.libClassdefFieldGroupSetMod.^ = js.native
    
    /* private */ var handleAction: Any = js.native
    
    /* private */ var handleCancel: Any = js.native
    
    /* private */ var handleChangeView: Any = js.native
    
    /* private */ var handleCollapsed: Any = js.native
    
    /* private */ var handleDelete: Any = js.native
    
    /* private */ var handleDuplicateRecord_ : Any = js.native
    
    /* private */ var handleEditingFieldName: Any = js.native
    
    /* private */ var handleEdition: Any = js.native
    
    /* private */ var handleExport: Any = js.native
    
    /* private */ var handleFieldNameWithBlur: Any = js.native
    
    /* private */ var handleFirst: Any = js.native
    
    /* private */ var handleGridActionsFunctions: Any = js.native
    
    /* private */ var handleGridSynchronize: Any = js.native
    
    /* private */ var handleGridSynchronizeFunctions: Any = js.native
    
    /* private */ var handleInput: Any = js.native
    
    /* private */ var handleInsert: Any = js.native
    
    /* private */ var handleInvertSelection: Any = js.native
    
    /* private */ var handleLast: Any = js.native
    
    /* private */ var handleLog: Any = js.native
    
    /* private */ var handleNext: Any = js.native
    
    /* private */ var handlePosition: Any = js.native
    
    /* private */ var handlePost: Any = js.native
    
    /* private */ var handlePrior: Any = js.native
    
    /* private */ var handleRecordSelection: Any = js.native
    
    /* private */ var handleSelectRecord: Any = js.native
    
    /* private */ var handleSetsOrRetrievesAll: Any = js.native
    
    /* private */ var handleSync: Any = js.native
    
    /* private */ var handleToggleKey_ : Any = js.native
    
    /* private */ var handleTreeViewToggle: Any = js.native
    
    /* private */ var hasCalculateField: Any = js.native
    
    def hasDataSet(): Boolean = js.native
    
    /* private */ var hasDetailField: Any = js.native
    
    /* private */ var hasFieldWithInformedControl_ : Any = js.native
    
    var hasFormView: Boolean = js.native
    
    var hasTableView: Boolean = js.native
    
    var help: Buttons | String = js.native
    
    var hintFieldNames: String = js.native
    
    /* private */ var inLookup: Any = js.native
    
    /* private */ var inSpeedFill: Any = js.native
    
    /* private */ var index: Any = js.native
    
    /* private */ var input: Any = js.native
    
    def insert(): Unit = js.native
    
    /* private */ var insertRecordsFromMap_ : Any = js.native
    
    var integerDatabaseType: String = js.native
    
    /* private */ var integerDatabaseType_ : Any = js.native
    
    /* private */ var isFirstSync: Any = js.native
    
    /* private */ var isGrLookup: Any = js.native
    
    /* private */ var lastDataSetId: Any = js.native
    
    /* private */ var lastEditableField: Any = js.native
    
    /* private */ var lastField: Any = js.native
    
    /* private */ var linkFields: Any = js.native
    
    /* private */ var listenerCompareFunction: Any = js.native
    
    /* private */ var locate: Any = js.native
    
    /* protected */ def locateField(fieldName: String): typings.nginstackEngine.libClassdefFieldMod.^ = js.native
    
    /* private */ var locate_last_bookmark: Any = js.native
    
    /* private */ var locate_last_field_found: Any = js.native
    
    /* private */ var locate_last_value: Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def lookup(field: typings.nginstackWebFramework.libGridGridFieldMod.^): Unit = js.native
    
    /* private */ var maxColumn: Any = js.native
    
    var maxRecordCount: Double = js.native
    
    var maxSelectedRecords: Double = js.native
    
    var name: String = js.native
    
    /* private */ var navigateOnlyEditableFields: Any = js.native
    
    /* protected */ def newEvent_(`type`: String): typings.nginstackWebFramework.libClassdefGridEventMod.^ = js.native
    /* protected */ def newEvent_(`type`: String, opt_options: Cancelable): typings.nginstackWebFramework.libClassdefGridEventMod.^ = js.native
    
    var onAfterCancel: Event = js.native
    
    var onAfterDelete: Event = js.native
    
    var onAfterDuplicate: Event = js.native
    
    var onAfterEdit: Event = js.native
    
    var onAfterExpand: Event = js.native
    
    var onAfterInsert: Event = js.native
    
    var onAfterPost: Event = js.native
    
    var onAfterPrepare: Event = js.native
    
    var onAfterScroll: Event = js.native
    
    var onAfterSelectRecord: Event = js.native
    
    var onBeforeCancel: Event = js.native
    
    var onBeforeDelete: Event = js.native
    
    var onBeforeDuplicate: Event = js.native
    
    var onBeforeEdit: Event = js.native
    
    var onBeforeExpand: Event = js.native
    
    var onBeforeInsert: Event = js.native
    
    var onBeforePost: Event = js.native
    
    var onBeforePrepare: Event = js.native
    
    var onBeforeScroll: Event = js.native
    
    var onBeforeSelectRecord: Event = js.native
    
    var onChangeView: Event = js.native
    
    var onDefineFields: Event = js.native
    
    var onExport: Event = js.native
    
    /* private */ var onGridDefinition: Any = js.native
    
    var onLocate: Event = js.native
    
    var onShowLog: Event = js.native
    
    /* private */ var pairName_ : Any = js.native
    
    var parent: Any = js.native
    
    /* private */ var permissionFilters: Any = js.native
    
    def persist(): Double = js.native
    
    def post(opt_doParentPost: Boolean, args: Any*): Boolean = js.native
    def post(opt_doParentPost: Unit, args: Any*): Boolean = js.native
    
    /* private */ var postAtNavigation: Any = js.native
    
    /* protected */ def prepare(): Unit = js.native
    
    /* private */ var preserveFieldLinkIds_ : Any = js.native
    
    var process: Process = js.native
    
    /* private */ var protectState_ : Any = js.native
    
    /* private */ var protectedEmit_ : Any = js.native
    
    /* private */ var readCurrentRecordToDuplicate_ : Any = js.native
    
    var readOnly: Boolean = js.native
    
    /* private */ var recentlyCreated: Any = js.native
    
    /* private */ var recentlyInserted: Any = js.native
    
    /* private */ var recentlyWritten_ : Any = js.native
    
    def refresh(): Unit = js.native
    def refresh(opt_force: Boolean): Unit = js.native
    
    /* private */ var refreshFieldIndexCache: Any = js.native
    
    /* private */ var refreshFields: Any = js.native
    
    /* private */ var refreshHintFieldIndexes: Any = js.native
    
    /* private */ var removeBookmarkFromSelectAndUnSelectedRecords: Any = js.native
    
    /* private */ var reservedWords: Any = js.native
    
    /* private */ var resetButtons: Any = js.native
    
    def resetFields(): Unit = js.native
    
    /* private */ var resetPropertiesToResend: Any = js.native
    
    /* private */ var safeCallOnAfterScroll: Any = js.native
    
    /* private */ var saveBookmarkState_ : Any = js.native
    
    def scroll(action: String): Unit = js.native
    def scroll(action: js.Function1[/* arg0 */ typings.nginstackEngine.libDatasetDataSetMod.^, Any]): Unit = js.native
    
    /* private */ var searchTempDs: Any = js.native
    
    /* private */ var selectAllOnLookup: Any = js.native
    
    var selectedRecords: js.Array[String] = js.native
    
    var selectedRecordsChanged: Boolean = js.native
    
    def setFieldsProperties(args: Any*): Unit = js.native
    
    /* private */ var setNewBufferFieldValue: Any = js.native
    
    /* private */ var span: Any = js.native
    
    /* private */ var speedFill: Any = js.native
    
    /* private */ var stateProtectionId_ : Any = js.native
    
    /* private */ var stateProtectionLevel_ : Any = js.native
    
    /* private */ var syncButtons: Any = js.native
    
    /* private */ var syncCheckBufferChange: Any = js.native
    
    /* private */ var syncCheckFieldFocus: Any = js.native
    
    /* private */ var syncDataSetReferenceToAggregates: Any = js.native
    
    /* private */ var syncDataSetStateToBufferState: Any = js.native
    
    /* private */ var syncFieldProperties_ : Any = js.native
    
    /* private */ var syncFieldStyle_ : Any = js.native
    
    /* private */ var syncOnlyCurrentRecord: Any = js.native
    
    /* protected */ def sync_(formSync: Any, tableSync: Any): Unit = js.native
    
    /* private */ var tabSyncAddRemoveRows: Any = js.native
    
    /* protected */ def tabSyncBufferUpdate(dsSync: Any, records: Any, i: Any, isCurrentRecord: Any): Unit = js.native
    
    /* private */ var tabSyncClearInactiveRows_ : Any = js.native
    
    /* private */ var tabSyncRefreshNavButtonsView: Any = js.native
    
    /* private */ var tableSyncCurrentRecord_ : Any = js.native
    
    /* private */ var tableSyncNextRecords_ : Any = js.native
    
    /* private */ var tableSyncPriorRecords_ : Any = js.native
    
    /* private */ var tableSync_ : Any = js.native
    
    /* protected */ var tableViewBuffer: typings.nginstackWebFramework.libGridTableViewBufferMod.^ = js.native
    
    var tableViewFieldNames: String = js.native
    
    var title: String = js.native
    
    /* private */ var toIgnoreBookmarks: Any = js.native
    
    /* private */ @JSName("toString")
    var toString_FGrid: Any = js.native
    
    def toggleFieldVisibility(field: String): Unit = js.native
    def toggleFieldVisibility(field: typings.nginstackEngine.libClassdefFieldMod.^): Unit = js.native
    
    var toggleKeyButtonEnabled: Boolean = js.native
    
    def toggleKeyVisibility(): Unit = js.native
    
    /* private */ var toggledViewFieldsVisibility_ : Any = js.native
    
    var toolbar: Visible = js.native
    
    /* private */ var unlockEdition: Any = js.native
    
    /* private */ var unprotectState_ : Any = js.native
    
    var unselectableRecords: js.Array[Any] = js.native
    
    /* private */ var updateAggregateValue: Any = js.native
    
    /* private */ var updateDetailGrids: Any = js.native
    
    /* private */ var updateFieldValue: Any = js.native
    
    /* private */ var useLocatePatternForAll: Any = js.native
    
    var userCanExport: Boolean = js.native
    
    var userKeyToValidatePermissions: Double = js.native
    
    var userPrefName: String = js.native
    
    var validateFieldPermissions: Boolean = js.native
    
    /* private */ var validateFields: Any = js.native
    
    /* private */ var validateRequiredFields: Any = js.native
    
    /* private */ var viewChangedByUser: Any = js.native
    
    /* private */ var viewHasChanged: Any = js.native
    
    var viewMode: Double = js.native
    
    /* private */ var visible: Any = js.native
    
    var visibleActions: js.Array[Button | String] = js.native
    
    var visibleButtons: js.Array[Button | String] = js.native
    
    /* private */ var waitingForEdition: Any = js.native
    
    var width: String = js.native
    
    def write(): Unit = js.native
    def write(opt_showInFormView: Boolean): Unit = js.native
    def write(opt_showInFormView: Boolean, opt_noWriteInClient: Boolean): Unit = js.native
    def write(opt_showInFormView: Unit, opt_noWriteInClient: Boolean): Unit = js.native
    
    /* private */ var writeFields: Any = js.native
    
    /* private */ var writeFormView: Any = js.native
    
    /* private */ var writeTableView: Any = js.native
    
    /* private */ var written_ : Any = js.native
  }
  
  type Process = typings.nginstackWebFramework.libProcessProcessMod.^
  
  type ViewDefField = typings.nginstackWebFramework.libClassdefViewDefFieldMod.^
}
