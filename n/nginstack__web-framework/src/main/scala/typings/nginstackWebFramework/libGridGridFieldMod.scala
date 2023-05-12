package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.GridName
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridGridFieldMod {
  
  inline def apply(name: String, `type`: String, size: Double, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(name: String, `type`: String, size: Null, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/GridField", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridField {
    def this(name: String, `type`: String, size: Double, args: Any*) = this()
    def this(name: String, `type`: String, size: Null, args: Any*) = this()
    
    /* private */ /* CompleteClass */
    var _checkInformedFields: Any = js.native
    
    /* protected */ /* CompleteClass */
    override def _checkSaveInputAsDefault(context: GridName): Unit = js.native
    
    /* private */ /* CompleteClass */
    var _configWidth: Any = js.native
    
    /* private */ /* CompleteClass */
    var _readOnlyChangedByGrid: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tableViewWidth: Any = js.native
    
    /* private */ /* CompleteClass */
    var _width: Any = js.native
    
    /* CompleteClass */
    var alignment: Any = js.native
    
    /* private */ /* CompleteClass */
    var appendInTreeStructure: Any = js.native
    
    /* private */ /* CompleteClass */
    var beforeValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var calc: Any = js.native
    
    /* CompleteClass */
    var canModify: Boolean = js.native
    
    /* CompleteClass */
    var changed: Any = js.native
    
    /* private */ /* CompleteClass */
    var checkIfCanModify_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkValueError: Any = js.native
    
    /* private */ /* CompleteClass */
    var clientCanModify: Any = js.native
    
    /* private */ /* CompleteClass */
    var clientValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var dbCacheKeyExists_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var defaultLookupMultipleInsertListener_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var dispatchEvent: Any = js.native
    
    /* CompleteClass */
    var dsOriginalTree: Any = js.native
    
    /* CompleteClass */
    var dsTreeIndexSuffix: String = js.native
    
    /* CompleteClass */
    var dsTreeStructure: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def emit(event: Any, args: Any*): Any = js.native
    
    /* private */ /* CompleteClass */
    var fieldIndexCache: Any = js.native
    
    /* CompleteClass */
    var fieldIndexesToTreeSync: js.Array[Any] = js.native
    
    /* private */ /* CompleteClass */
    var fillFirstValue: Any = js.native
    
    /* CompleteClass */
    var fillingFirstValue: Boolean = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var getComboDisplay: Any = js.native
    
    /* private */ /* CompleteClass */
    var getComboOptionDisplay: Any = js.native
    
    /* CompleteClass */
    override def getComboValue(value: Any): Double | (Record[Any, Any]) = js.native
    
    /* private */ /* CompleteClass */
    var getFileDisplay: Any = js.native
    
    /* private */ /* CompleteClass */
    var getLookupDisplay: Any = js.native
    
    /* private */ /* CompleteClass */
    var getNextEditableFieldAtView: Any = js.native
    
    /* private */ /* CompleteClass */
    var getNextFieldAtView: Any = js.native
    
    /* private */ /* CompleteClass */
    var getPriorEditableFieldAtView: Any = js.native
    
    /* private */ /* CompleteClass */
    var getPriorFieldAtView: Any = js.native
    
    /* CompleteClass */
    override def getSavedValue(context: GridName): Any = js.native
    
    /* private */ /* CompleteClass */
    var getUserInformedProperty: Any = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* private */ /* CompleteClass */
    var getWriteInformation: Any = js.native
    
    /* CompleteClass */
    var grid: DetailGrid = js.native
    
    /* private */ /* CompleteClass */
    var handleActions: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleDispatchBlurEvent: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleDispatchFocusEvent: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleFieldActionsFunctions: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleOpenKey: Any = js.native
    
    /* CompleteClass */
    var height: Any = js.native
    
    /* CompleteClass */
    var inSetValue: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var lastDBCacheRefresh_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var loadSavedProfileValues: Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    override def lookup(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var notFoundKeysCache_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var prepareTreeView: Any = js.native
    
    /* private */ /* CompleteClass */
    var refreshClientValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var removeClassEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var requiresFilling: Any = js.native
    
    /* CompleteClass */
    var resyncPending: Boolean = js.native
    
    /* CompleteClass */
    override def setValue(value: Any, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def setValueOnly(value: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var tree: Any = js.native
    
    /* private */ /* CompleteClass */
    var validateClassFieldChange_ : Any = js.native
    
    /* CompleteClass */
    override def validateInput(value: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var validateLookupLicenseDependencies_ : Any = js.native
    
    /* CompleteClass */
    var value: Any = js.native
    
    /* private */ /* CompleteClass */
    var valueToClientValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var valueToServerValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var visibleAtView: Any = js.native
    
    /* private */ /* CompleteClass */
    var write: Any = js.native
    
    /* private */ /* CompleteClass */
    var written_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/GridField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DetailGrid = typings.nginstackWebFramework.libGridDetailGridMod.^
  
  trait GridField extends StObject {
    
    /* private */ var _checkInformedFields: Any
    
    /* protected */ def _checkSaveInputAsDefault(context: GridName): Unit
    
    /* private */ var _configWidth: Any
    
    /* private */ var _readOnlyChangedByGrid: Any
    
    /* private */ var _tableViewWidth: Any
    
    /* private */ var _width: Any
    
    var alignment: Any
    
    /* private */ var appendInTreeStructure: Any
    
    /* private */ var beforeValue: Any
    
    /* private */ var calc: Any
    
    var canModify: Boolean
    
    var changed: Any
    
    /* private */ var checkIfCanModify_ : Any
    
    /* private */ var checkValueError: Any
    
    /* private */ var clientCanModify: Any
    
    /* private */ var clientValue: Any
    
    /* private */ var dbCacheKeyExists_ : Any
    
    /* private */ var defaultLookupMultipleInsertListener_ : Any
    
    /* private */ var dispatchEvent: Any
    
    var dsOriginalTree: Any
    
    var dsTreeIndexSuffix: String
    
    var dsTreeStructure: typings.nginstackEngine.libDatasetDataSetMod.^
    
    def emit(event: Any, args: Any*): Any
    
    /* private */ var fieldIndexCache: Any
    
    var fieldIndexesToTreeSync: js.Array[Any]
    
    /* private */ var fillFirstValue: Any
    
    var fillingFirstValue: Boolean
    
    def focus(): Unit
    
    /* private */ var getComboDisplay: Any
    
    /* private */ var getComboOptionDisplay: Any
    
    def getComboValue(value: Any): Double | (Record[Any, Any])
    
    /* private */ var getFileDisplay: Any
    
    /* private */ var getLookupDisplay: Any
    
    /* private */ var getNextEditableFieldAtView: Any
    
    /* private */ var getNextFieldAtView: Any
    
    /* private */ var getPriorEditableFieldAtView: Any
    
    /* private */ var getPriorFieldAtView: Any
    
    def getSavedValue(context: GridName): Any
    
    /* private */ var getUserInformedProperty: Any
    
    def getValue(): Any
    
    /* private */ var getWriteInformation: Any
    
    var grid: DetailGrid
    
    /* private */ var handleActions: Any
    
    /* private */ var handleDispatchBlurEvent: Any
    
    /* private */ var handleDispatchFocusEvent: Any
    
    /* private */ var handleFieldActionsFunctions: Any
    
    /* private */ var handleOpenKey: Any
    
    var height: Any
    
    var inSetValue: Boolean
    
    /* private */ var lastDBCacheRefresh_ : Any
    
    /* private */ var loadSavedProfileValues: Any
    
    /* private */ var logger_ : Any
    
    def lookup(): Unit
    
    /* private */ var notFoundKeysCache_ : Any
    
    /* private */ var prepareTreeView: Any
    
    /* private */ var refreshClientValue: Any
    
    /* private */ var removeClassEvents: Any
    
    /* private */ var requiresFilling: Any
    
    var resyncPending: Boolean
    
    def setValue(value: Any, args: Any*): Unit
    
    def setValueOnly(value: Any): Unit
    
    /* private */ var tree: Any
    
    /* private */ var validateClassFieldChange_ : Any
    
    def validateInput(value: Any): Any
    
    /* private */ var validateLookupLicenseDependencies_ : Any
    
    var value: Any
    
    /* private */ var valueToClientValue: Any
    
    /* private */ var valueToServerValue: Any
    
    /* private */ var visibleAtView: Any
    
    /* private */ var write: Any
    
    /* private */ var written_ : Any
  }
  object GridField {
    
    inline def apply(
      _checkInformedFields: Any,
      _checkSaveInputAsDefault: GridName => Unit,
      _configWidth: Any,
      _readOnlyChangedByGrid: Any,
      _tableViewWidth: Any,
      _width: Any,
      alignment: Any,
      appendInTreeStructure: Any,
      beforeValue: Any,
      calc: Any,
      canModify: Boolean,
      changed: Any,
      checkIfCanModify_ : Any,
      checkValueError: Any,
      clientCanModify: Any,
      clientValue: Any,
      dbCacheKeyExists_ : Any,
      defaultLookupMultipleInsertListener_ : Any,
      dispatchEvent: Any,
      dsOriginalTree: Any,
      dsTreeIndexSuffix: String,
      dsTreeStructure: typings.nginstackEngine.libDatasetDataSetMod.^,
      emit: (Any, /* repeated */ Any) => Any,
      fieldIndexCache: Any,
      fieldIndexesToTreeSync: js.Array[Any],
      fillFirstValue: Any,
      fillingFirstValue: Boolean,
      focus: () => Unit,
      getComboDisplay: Any,
      getComboOptionDisplay: Any,
      getComboValue: Any => Double | (Record[Any, Any]),
      getFileDisplay: Any,
      getLookupDisplay: Any,
      getNextEditableFieldAtView: Any,
      getNextFieldAtView: Any,
      getPriorEditableFieldAtView: Any,
      getPriorFieldAtView: Any,
      getSavedValue: GridName => Any,
      getUserInformedProperty: Any,
      getValue: () => Any,
      getWriteInformation: Any,
      grid: DetailGrid,
      handleActions: Any,
      handleDispatchBlurEvent: Any,
      handleDispatchFocusEvent: Any,
      handleFieldActionsFunctions: Any,
      handleOpenKey: Any,
      height: Any,
      inSetValue: Boolean,
      lastDBCacheRefresh_ : Any,
      loadSavedProfileValues: Any,
      logger_ : Any,
      lookup: () => Unit,
      notFoundKeysCache_ : Any,
      prepareTreeView: Any,
      refreshClientValue: Any,
      removeClassEvents: Any,
      requiresFilling: Any,
      resyncPending: Boolean,
      setValue: (Any, /* repeated */ Any) => Unit,
      setValueOnly: Any => Unit,
      tree: Any,
      validateClassFieldChange_ : Any,
      validateInput: Any => Any,
      validateLookupLicenseDependencies_ : Any,
      value: Any,
      valueToClientValue: Any,
      valueToServerValue: Any,
      visibleAtView: Any,
      write: Any,
      written_ : Any
    ): GridField = {
      val __obj = js.Dynamic.literal(_checkInformedFields = _checkInformedFields.asInstanceOf[js.Any], _checkSaveInputAsDefault = js.Any.fromFunction1(_checkSaveInputAsDefault), _configWidth = _configWidth.asInstanceOf[js.Any], _readOnlyChangedByGrid = _readOnlyChangedByGrid.asInstanceOf[js.Any], _tableViewWidth = _tableViewWidth.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], appendInTreeStructure = appendInTreeStructure.asInstanceOf[js.Any], beforeValue = beforeValue.asInstanceOf[js.Any], calc = calc.asInstanceOf[js.Any], canModify = canModify.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], checkIfCanModify_ = checkIfCanModify_.asInstanceOf[js.Any], checkValueError = checkValueError.asInstanceOf[js.Any], clientCanModify = clientCanModify.asInstanceOf[js.Any], clientValue = clientValue.asInstanceOf[js.Any], dbCacheKeyExists_ = dbCacheKeyExists_.asInstanceOf[js.Any], defaultLookupMultipleInsertListener_ = defaultLookupMultipleInsertListener_.asInstanceOf[js.Any], dispatchEvent = dispatchEvent.asInstanceOf[js.Any], dsOriginalTree = dsOriginalTree.asInstanceOf[js.Any], dsTreeIndexSuffix = dsTreeIndexSuffix.asInstanceOf[js.Any], dsTreeStructure = dsTreeStructure.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), fieldIndexCache = fieldIndexCache.asInstanceOf[js.Any], fieldIndexesToTreeSync = fieldIndexesToTreeSync.asInstanceOf[js.Any], fillFirstValue = fillFirstValue.asInstanceOf[js.Any], fillingFirstValue = fillingFirstValue.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getComboDisplay = getComboDisplay.asInstanceOf[js.Any], getComboOptionDisplay = getComboOptionDisplay.asInstanceOf[js.Any], getComboValue = js.Any.fromFunction1(getComboValue), getFileDisplay = getFileDisplay.asInstanceOf[js.Any], getLookupDisplay = getLookupDisplay.asInstanceOf[js.Any], getNextEditableFieldAtView = getNextEditableFieldAtView.asInstanceOf[js.Any], getNextFieldAtView = getNextFieldAtView.asInstanceOf[js.Any], getPriorEditableFieldAtView = getPriorEditableFieldAtView.asInstanceOf[js.Any], getPriorFieldAtView = getPriorFieldAtView.asInstanceOf[js.Any], getSavedValue = js.Any.fromFunction1(getSavedValue), getUserInformedProperty = getUserInformedProperty.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), getWriteInformation = getWriteInformation.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handleActions = handleActions.asInstanceOf[js.Any], handleDispatchBlurEvent = handleDispatchBlurEvent.asInstanceOf[js.Any], handleDispatchFocusEvent = handleDispatchFocusEvent.asInstanceOf[js.Any], handleFieldActionsFunctions = handleFieldActionsFunctions.asInstanceOf[js.Any], handleOpenKey = handleOpenKey.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inSetValue = inSetValue.asInstanceOf[js.Any], lastDBCacheRefresh_ = lastDBCacheRefresh_.asInstanceOf[js.Any], loadSavedProfileValues = loadSavedProfileValues.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], lookup = js.Any.fromFunction0(lookup), notFoundKeysCache_ = notFoundKeysCache_.asInstanceOf[js.Any], prepareTreeView = prepareTreeView.asInstanceOf[js.Any], refreshClientValue = refreshClientValue.asInstanceOf[js.Any], removeClassEvents = removeClassEvents.asInstanceOf[js.Any], requiresFilling = requiresFilling.asInstanceOf[js.Any], resyncPending = resyncPending.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue), setValueOnly = js.Any.fromFunction1(setValueOnly), tree = tree.asInstanceOf[js.Any], validateClassFieldChange_ = validateClassFieldChange_.asInstanceOf[js.Any], validateInput = js.Any.fromFunction1(validateInput), validateLookupLicenseDependencies_ = validateLookupLicenseDependencies_.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueToClientValue = valueToClientValue.asInstanceOf[js.Any], valueToServerValue = valueToServerValue.asInstanceOf[js.Any], visibleAtView = visibleAtView.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], written_ = written_.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridField] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: Any): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAppendInTreeStructure(value: Any): Self = StObject.set(x, "appendInTreeStructure", value.asInstanceOf[js.Any])
      
      inline def setBeforeValue(value: Any): Self = StObject.set(x, "beforeValue", value.asInstanceOf[js.Any])
      
      inline def setCalc(value: Any): Self = StObject.set(x, "calc", value.asInstanceOf[js.Any])
      
      inline def setCanModify(value: Boolean): Self = StObject.set(x, "canModify", value.asInstanceOf[js.Any])
      
      inline def setChanged(value: Any): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setCheckIfCanModify_(value: Any): Self = StObject.set(x, "checkIfCanModify_", value.asInstanceOf[js.Any])
      
      inline def setCheckValueError(value: Any): Self = StObject.set(x, "checkValueError", value.asInstanceOf[js.Any])
      
      inline def setClientCanModify(value: Any): Self = StObject.set(x, "clientCanModify", value.asInstanceOf[js.Any])
      
      inline def setClientValue(value: Any): Self = StObject.set(x, "clientValue", value.asInstanceOf[js.Any])
      
      inline def setDbCacheKeyExists_(value: Any): Self = StObject.set(x, "dbCacheKeyExists_", value.asInstanceOf[js.Any])
      
      inline def setDefaultLookupMultipleInsertListener_(value: Any): Self = StObject.set(x, "defaultLookupMultipleInsertListener_", value.asInstanceOf[js.Any])
      
      inline def setDispatchEvent(value: Any): Self = StObject.set(x, "dispatchEvent", value.asInstanceOf[js.Any])
      
      inline def setDsOriginalTree(value: Any): Self = StObject.set(x, "dsOriginalTree", value.asInstanceOf[js.Any])
      
      inline def setDsTreeIndexSuffix(value: String): Self = StObject.set(x, "dsTreeIndexSuffix", value.asInstanceOf[js.Any])
      
      inline def setDsTreeStructure(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "dsTreeStructure", value.asInstanceOf[js.Any])
      
      inline def setEmit(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setFieldIndexCache(value: Any): Self = StObject.set(x, "fieldIndexCache", value.asInstanceOf[js.Any])
      
      inline def setFieldIndexesToTreeSync(value: js.Array[Any]): Self = StObject.set(x, "fieldIndexesToTreeSync", value.asInstanceOf[js.Any])
      
      inline def setFieldIndexesToTreeSyncVarargs(value: Any*): Self = StObject.set(x, "fieldIndexesToTreeSync", js.Array(value*))
      
      inline def setFillFirstValue(value: Any): Self = StObject.set(x, "fillFirstValue", value.asInstanceOf[js.Any])
      
      inline def setFillingFirstValue(value: Boolean): Self = StObject.set(x, "fillingFirstValue", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setGetComboDisplay(value: Any): Self = StObject.set(x, "getComboDisplay", value.asInstanceOf[js.Any])
      
      inline def setGetComboOptionDisplay(value: Any): Self = StObject.set(x, "getComboOptionDisplay", value.asInstanceOf[js.Any])
      
      inline def setGetComboValue(value: Any => Double | (Record[Any, Any])): Self = StObject.set(x, "getComboValue", js.Any.fromFunction1(value))
      
      inline def setGetFileDisplay(value: Any): Self = StObject.set(x, "getFileDisplay", value.asInstanceOf[js.Any])
      
      inline def setGetLookupDisplay(value: Any): Self = StObject.set(x, "getLookupDisplay", value.asInstanceOf[js.Any])
      
      inline def setGetNextEditableFieldAtView(value: Any): Self = StObject.set(x, "getNextEditableFieldAtView", value.asInstanceOf[js.Any])
      
      inline def setGetNextFieldAtView(value: Any): Self = StObject.set(x, "getNextFieldAtView", value.asInstanceOf[js.Any])
      
      inline def setGetPriorEditableFieldAtView(value: Any): Self = StObject.set(x, "getPriorEditableFieldAtView", value.asInstanceOf[js.Any])
      
      inline def setGetPriorFieldAtView(value: Any): Self = StObject.set(x, "getPriorFieldAtView", value.asInstanceOf[js.Any])
      
      inline def setGetSavedValue(value: GridName => Any): Self = StObject.set(x, "getSavedValue", js.Any.fromFunction1(value))
      
      inline def setGetUserInformedProperty(value: Any): Self = StObject.set(x, "getUserInformedProperty", value.asInstanceOf[js.Any])
      
      inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setGetWriteInformation(value: Any): Self = StObject.set(x, "getWriteInformation", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: DetailGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setHandleActions(value: Any): Self = StObject.set(x, "handleActions", value.asInstanceOf[js.Any])
      
      inline def setHandleDispatchBlurEvent(value: Any): Self = StObject.set(x, "handleDispatchBlurEvent", value.asInstanceOf[js.Any])
      
      inline def setHandleDispatchFocusEvent(value: Any): Self = StObject.set(x, "handleDispatchFocusEvent", value.asInstanceOf[js.Any])
      
      inline def setHandleFieldActionsFunctions(value: Any): Self = StObject.set(x, "handleFieldActionsFunctions", value.asInstanceOf[js.Any])
      
      inline def setHandleOpenKey(value: Any): Self = StObject.set(x, "handleOpenKey", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInSetValue(value: Boolean): Self = StObject.set(x, "inSetValue", value.asInstanceOf[js.Any])
      
      inline def setLastDBCacheRefresh_(value: Any): Self = StObject.set(x, "lastDBCacheRefresh_", value.asInstanceOf[js.Any])
      
      inline def setLoadSavedProfileValues(value: Any): Self = StObject.set(x, "loadSavedProfileValues", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: () => Unit): Self = StObject.set(x, "lookup", js.Any.fromFunction0(value))
      
      inline def setNotFoundKeysCache_(value: Any): Self = StObject.set(x, "notFoundKeysCache_", value.asInstanceOf[js.Any])
      
      inline def setPrepareTreeView(value: Any): Self = StObject.set(x, "prepareTreeView", value.asInstanceOf[js.Any])
      
      inline def setRefreshClientValue(value: Any): Self = StObject.set(x, "refreshClientValue", value.asInstanceOf[js.Any])
      
      inline def setRemoveClassEvents(value: Any): Self = StObject.set(x, "removeClassEvents", value.asInstanceOf[js.Any])
      
      inline def setRequiresFilling(value: Any): Self = StObject.set(x, "requiresFilling", value.asInstanceOf[js.Any])
      
      inline def setResyncPending(value: Boolean): Self = StObject.set(x, "resyncPending", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      inline def setSetValueOnly(value: Any => Unit): Self = StObject.set(x, "setValueOnly", js.Any.fromFunction1(value))
      
      inline def setTree(value: Any): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setValidateClassFieldChange_(value: Any): Self = StObject.set(x, "validateClassFieldChange_", value.asInstanceOf[js.Any])
      
      inline def setValidateInput(value: Any => Any): Self = StObject.set(x, "validateInput", js.Any.fromFunction1(value))
      
      inline def setValidateLookupLicenseDependencies_(value: Any): Self = StObject.set(x, "validateLookupLicenseDependencies_", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueToClientValue(value: Any): Self = StObject.set(x, "valueToClientValue", value.asInstanceOf[js.Any])
      
      inline def setValueToServerValue(value: Any): Self = StObject.set(x, "valueToServerValue", value.asInstanceOf[js.Any])
      
      inline def setVisibleAtView(value: Any): Self = StObject.set(x, "visibleAtView", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Any): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWritten_(value: Any): Self = StObject.set(x, "written_", value.asInstanceOf[js.Any])
      
      inline def set_checkInformedFields(value: Any): Self = StObject.set(x, "_checkInformedFields", value.asInstanceOf[js.Any])
      
      inline def set_checkSaveInputAsDefault(value: GridName => Unit): Self = StObject.set(x, "_checkSaveInputAsDefault", js.Any.fromFunction1(value))
      
      inline def set_configWidth(value: Any): Self = StObject.set(x, "_configWidth", value.asInstanceOf[js.Any])
      
      inline def set_readOnlyChangedByGrid(value: Any): Self = StObject.set(x, "_readOnlyChangedByGrid", value.asInstanceOf[js.Any])
      
      inline def set_tableViewWidth(value: Any): Self = StObject.set(x, "_tableViewWidth", value.asInstanceOf[js.Any])
      
      inline def set_width(value: Any): Self = StObject.set(x, "_width", value.asInstanceOf[js.Any])
    }
  }
  
  type LookupMultipleInsertEvent = typings.nginstackWebFramework.libClassdefLookupMultipleInsertEventMod.^
}
