package typings.nginstackOrm

import org.scalablytyped.runtime.StringDictionary
import typings.nginstackOrm.anon.Fields
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntityMod {
  
  inline def apply(classKey: Double, dataSet: DataSet): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(classKey: Double, dataSet: DataSet, opt_options: EntityOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(classKey: Double, dataSet: DataSet, opt_options: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/orm/lib/Entity", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Entity {
    def this(classKey: Double, dataSet: DataSet) = this()
    def this(classKey: Double, dataSet: DataSet, opt_options: EntityOptions) = this()
    def this(classKey: Double, dataSet: DataSet, opt_options: Record[Any, Any]) = this()
    
    /* protected */ /* CompleteClass */
    override def CloneClass_(): Unit = js.native
    
    /* CompleteClass */
    override def assign(values: StringDictionary[Any]): Unit = js.native
    
    /* CompleteClass */
    var autoPersist: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var autoPersistVersion_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var autoPersist_ : Any = js.native
    
    /* CompleteClass */
    override def bindDataSet(dataSet: DataSet): Unit = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var changeableFieldNamesSet_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkIfCanChangeClass_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkIfCanChangeNegativeKey_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkIfClassIsJustToGroup_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkIfFieldIsReadOnly_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkIfIsEmpty_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkPermission_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkPosition_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkRequiredFields_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var checkStrictMode_ : Any = js.native
    
    /* CompleteClass */
    var classKey: Double = js.native
    
    /* private */ /* CompleteClass */
    var classKey_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var cloneableProperties_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var configDef_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var customModelDef_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var dataSet_ : Any = js.native
    
    /* CompleteClass */
    override def delete(): Unit = js.native
    
    /* CompleteClass */
    override def edit(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var editableNegativeKeys_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var editableProductFields_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var emitDataSetEvent_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var emitEvent_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var emitFieldChangeEvent_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var emitFieldEvent_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var executeMasterDetailActions_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var extraFilterFields_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fieldPermissions_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fieldTypeIsSupported_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fieldsFilter_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fieldsWithDefaultValue_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var fields_ : Any = js.native
    
    /* CompleteClass */
    override def get(name: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var getExtraFilters_ : Any = js.native
    
    /* protected */ /* CompleteClass */
    override def insert_(): Unit = js.native
    
    /* CompleteClass */
    var key: Double = js.native
    
    /* CompleteClass */
    var key_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var masterDetailFields_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var modelDef_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var normalizeFieldValue_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var originalBookmark_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var permissionFieldLabels_ : Any = js.native
    
    /* CompleteClass */
    override def persist(): Double = js.native
    
    /* CompleteClass */
    override def post(): Unit = js.native
    
    /* CompleteClass */
    var postPending: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var requiredFields_ : Any = js.native
    
    /* CompleteClass */
    override def set(name: String, value: Any): Unit = js.native
    
    /* CompleteClass */
    var state: EntityState = js.native
    
    /* private */ /* CompleteClass */
    var stringify_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var suggestDefaultValues_ : Any = js.native
    
    /* CompleteClass */
    override def toJSONSchema(): Any = js.native
    
    /* CompleteClass */
    override def toJSONString(): String = js.native
    
    /* protected */ /* CompleteClass */
    override def updateClass_(classKey: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var userKey_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var validateLookupValue_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var visibleFieldIndexes_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var visibleFieldNamesSet_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var visibleFieldNames_ : Any = js.native
  }
  @JSImport("@nginstack/orm/lib/Entity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromDataSet(classKey: Double, dataSet: DataSet): Entity = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDataSet")(classKey.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Entity]
  inline def fromDataSet(classKey: Double, dataSet: DataSet, opt_options: Fields): Entity = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDataSet")(classKey.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Entity]
  inline def fromDataSet(classKey: Double, dataSet: DataSet, opt_options: Record[Any, Any]): Entity = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDataSet")(classKey.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Entity]
  
  inline def fromKey(key: Double): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKey")(key.asInstanceOf[js.Any]).asInstanceOf[Entity]
  inline def fromKey(key: Double, opt_options: Fields): Entity = (^.asInstanceOf[js.Dynamic].applyDynamic("fromKey")(key.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Entity]
  inline def fromKey(key: Double, opt_options: Record[Any, Any]): Entity = (^.asInstanceOf[js.Dynamic].applyDynamic("fromKey")(key.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Entity]
  
  @JSImport("@nginstack/orm/lib/Entity", "requiresStrictMode")
  @js.native
  def requiresStrictMode: Boolean = js.native
  inline def requiresStrictMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requiresStrictMode")(x.asInstanceOf[js.Any])
  
  type ConfigDef = typings.nginstackEngine.libClassdefConfigDefMod.^
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type Emitter = typings.nginstackEngine.libEventEmitterMod.^
  
  trait Entity extends StObject {
    
    /* protected */ def CloneClass_(): Unit
    
    def assign(values: StringDictionary[Any]): Unit
    
    var autoPersist: Boolean
    
    /* private */ var autoPersistVersion_ : Any
    
    /* private */ var autoPersist_ : Any
    
    def bindDataSet(dataSet: DataSet): Unit
    
    def cancel(): Unit
    
    /* private */ var changeableFieldNamesSet_ : Any
    
    /* private */ var checkIfCanChangeClass_ : Any
    
    /* private */ var checkIfCanChangeNegativeKey_ : Any
    
    /* private */ var checkIfClassIsJustToGroup_ : Any
    
    /* private */ var checkIfFieldIsReadOnly_ : Any
    
    /* private */ var checkIfIsEmpty_ : Any
    
    /* private */ var checkPermission_ : Any
    
    /* private */ var checkPosition_ : Any
    
    /* private */ var checkRequiredFields_ : Any
    
    /* private */ var checkStrictMode_ : Any
    
    var classKey: Double
    
    /* private */ var classKey_ : Any
    
    /* private */ var cloneableProperties_ : Any
    
    /* private */ var configDef_ : Any
    
    /* private */ var customModelDef_ : Any
    
    /* private */ var dataSet_ : Any
    
    def delete(): Unit
    
    def edit(): Unit
    
    /* private */ var editableNegativeKeys_ : Any
    
    /* private */ var editableProductFields_ : Any
    
    /* private */ var emitDataSetEvent_ : Any
    
    /* private */ var emitEvent_ : Any
    
    /* private */ var emitFieldChangeEvent_ : Any
    
    /* private */ var emitFieldEvent_ : Any
    
    /* private */ var executeMasterDetailActions_ : Any
    
    /* private */ var extraFilterFields_ : Any
    
    /* private */ var fieldPermissions_ : Any
    
    /* private */ var fieldTypeIsSupported_ : Any
    
    /* private */ var fieldsFilter_ : Any
    
    /* private */ var fieldsWithDefaultValue_ : Any
    
    /* private */ var fields_ : Any
    
    def get(name: Any): Any
    
    /* private */ var getExtraFilters_ : Any
    
    /* protected */ def insert_(): Unit
    
    var key: Double
    
    var key_ : Any
    
    /* private */ var masterDetailFields_ : Any
    
    /* private */ var modelDef_ : Any
    
    /* private */ var normalizeFieldValue_ : Any
    
    /* private */ var originalBookmark_ : Any
    
    /* private */ var permissionFieldLabels_ : Any
    
    def persist(): Double
    
    def post(): Unit
    
    var postPending: Boolean
    
    /* private */ var requiredFields_ : Any
    
    def set(name: String, value: Any): Unit
    
    var state: EntityState
    
    /* private */ var stringify_ : Any
    
    /* private */ var suggestDefaultValues_ : Any
    
    def toJSONSchema(): Any
    
    def toJSONString(): String
    
    /* protected */ def updateClass_(classKey: Double): Unit
    
    /* private */ var userKey_ : Any
    
    /* private */ var validateLookupValue_ : Any
    
    /* private */ var visibleFieldIndexes_ : Any
    
    /* private */ var visibleFieldNamesSet_ : Any
    
    /* private */ var visibleFieldNames_ : Any
  }
  object Entity {
    
    inline def apply(
      CloneClass_ : () => Unit,
      assign: StringDictionary[Any] => Unit,
      autoPersist: Boolean,
      autoPersistVersion_ : Any,
      autoPersist_ : Any,
      bindDataSet: DataSet => Unit,
      cancel: () => Unit,
      changeableFieldNamesSet_ : Any,
      checkIfCanChangeClass_ : Any,
      checkIfCanChangeNegativeKey_ : Any,
      checkIfClassIsJustToGroup_ : Any,
      checkIfFieldIsReadOnly_ : Any,
      checkIfIsEmpty_ : Any,
      checkPermission_ : Any,
      checkPosition_ : Any,
      checkRequiredFields_ : Any,
      checkStrictMode_ : Any,
      classKey: Double,
      classKey_ : Any,
      cloneableProperties_ : Any,
      configDef_ : Any,
      customModelDef_ : Any,
      dataSet_ : Any,
      delete: () => Unit,
      edit: () => Unit,
      editableNegativeKeys_ : Any,
      editableProductFields_ : Any,
      emitDataSetEvent_ : Any,
      emitEvent_ : Any,
      emitFieldChangeEvent_ : Any,
      emitFieldEvent_ : Any,
      executeMasterDetailActions_ : Any,
      extraFilterFields_ : Any,
      fieldPermissions_ : Any,
      fieldTypeIsSupported_ : Any,
      fieldsFilter_ : Any,
      fieldsWithDefaultValue_ : Any,
      fields_ : Any,
      get: Any => Any,
      getExtraFilters_ : Any,
      insert_ : () => Unit,
      key: Double,
      key_ : Any,
      masterDetailFields_ : Any,
      modelDef_ : Any,
      normalizeFieldValue_ : Any,
      originalBookmark_ : Any,
      permissionFieldLabels_ : Any,
      persist: () => Double,
      post: () => Unit,
      postPending: Boolean,
      requiredFields_ : Any,
      set: (String, Any) => Unit,
      state: EntityState,
      stringify_ : Any,
      suggestDefaultValues_ : Any,
      toJSONSchema: () => Any,
      toJSONString: () => String,
      updateClass_ : Double => Unit,
      userKey_ : Any,
      validateLookupValue_ : Any,
      visibleFieldIndexes_ : Any,
      visibleFieldNamesSet_ : Any,
      visibleFieldNames_ : Any
    ): Entity = {
      val __obj = js.Dynamic.literal(CloneClass_ = js.Any.fromFunction0(CloneClass_), assign = js.Any.fromFunction1(assign), autoPersist = autoPersist.asInstanceOf[js.Any], autoPersistVersion_ = autoPersistVersion_.asInstanceOf[js.Any], autoPersist_ = autoPersist_.asInstanceOf[js.Any], bindDataSet = js.Any.fromFunction1(bindDataSet), cancel = js.Any.fromFunction0(cancel), changeableFieldNamesSet_ = changeableFieldNamesSet_.asInstanceOf[js.Any], checkIfCanChangeClass_ = checkIfCanChangeClass_.asInstanceOf[js.Any], checkIfCanChangeNegativeKey_ = checkIfCanChangeNegativeKey_.asInstanceOf[js.Any], checkIfClassIsJustToGroup_ = checkIfClassIsJustToGroup_.asInstanceOf[js.Any], checkIfFieldIsReadOnly_ = checkIfFieldIsReadOnly_.asInstanceOf[js.Any], checkIfIsEmpty_ = checkIfIsEmpty_.asInstanceOf[js.Any], checkPermission_ = checkPermission_.asInstanceOf[js.Any], checkPosition_ = checkPosition_.asInstanceOf[js.Any], checkRequiredFields_ = checkRequiredFields_.asInstanceOf[js.Any], checkStrictMode_ = checkStrictMode_.asInstanceOf[js.Any], classKey = classKey.asInstanceOf[js.Any], classKey_ = classKey_.asInstanceOf[js.Any], cloneableProperties_ = cloneableProperties_.asInstanceOf[js.Any], configDef_ = configDef_.asInstanceOf[js.Any], customModelDef_ = customModelDef_.asInstanceOf[js.Any], dataSet_ = dataSet_.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), edit = js.Any.fromFunction0(edit), editableNegativeKeys_ = editableNegativeKeys_.asInstanceOf[js.Any], editableProductFields_ = editableProductFields_.asInstanceOf[js.Any], emitDataSetEvent_ = emitDataSetEvent_.asInstanceOf[js.Any], emitEvent_ = emitEvent_.asInstanceOf[js.Any], emitFieldChangeEvent_ = emitFieldChangeEvent_.asInstanceOf[js.Any], emitFieldEvent_ = emitFieldEvent_.asInstanceOf[js.Any], executeMasterDetailActions_ = executeMasterDetailActions_.asInstanceOf[js.Any], extraFilterFields_ = extraFilterFields_.asInstanceOf[js.Any], fieldPermissions_ = fieldPermissions_.asInstanceOf[js.Any], fieldTypeIsSupported_ = fieldTypeIsSupported_.asInstanceOf[js.Any], fieldsFilter_ = fieldsFilter_.asInstanceOf[js.Any], fieldsWithDefaultValue_ = fieldsWithDefaultValue_.asInstanceOf[js.Any], fields_ = fields_.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getExtraFilters_ = getExtraFilters_.asInstanceOf[js.Any], insert_ = js.Any.fromFunction0(insert_), key = key.asInstanceOf[js.Any], key_ = key_.asInstanceOf[js.Any], masterDetailFields_ = masterDetailFields_.asInstanceOf[js.Any], modelDef_ = modelDef_.asInstanceOf[js.Any], normalizeFieldValue_ = normalizeFieldValue_.asInstanceOf[js.Any], originalBookmark_ = originalBookmark_.asInstanceOf[js.Any], permissionFieldLabels_ = permissionFieldLabels_.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), post = js.Any.fromFunction0(post), postPending = postPending.asInstanceOf[js.Any], requiredFields_ = requiredFields_.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), state = state.asInstanceOf[js.Any], stringify_ = stringify_.asInstanceOf[js.Any], suggestDefaultValues_ = suggestDefaultValues_.asInstanceOf[js.Any], toJSONSchema = js.Any.fromFunction0(toJSONSchema), toJSONString = js.Any.fromFunction0(toJSONString), updateClass_ = js.Any.fromFunction1(updateClass_), userKey_ = userKey_.asInstanceOf[js.Any], validateLookupValue_ = validateLookupValue_.asInstanceOf[js.Any], visibleFieldIndexes_ = visibleFieldIndexes_.asInstanceOf[js.Any], visibleFieldNamesSet_ = visibleFieldNamesSet_.asInstanceOf[js.Any], visibleFieldNames_ = visibleFieldNames_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
      
      inline def setAssign(value: StringDictionary[Any] => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
      
      inline def setAutoPersist(value: Boolean): Self = StObject.set(x, "autoPersist", value.asInstanceOf[js.Any])
      
      inline def setAutoPersistVersion_(value: Any): Self = StObject.set(x, "autoPersistVersion_", value.asInstanceOf[js.Any])
      
      inline def setAutoPersist_(value: Any): Self = StObject.set(x, "autoPersist_", value.asInstanceOf[js.Any])
      
      inline def setBindDataSet(value: DataSet => Unit): Self = StObject.set(x, "bindDataSet", js.Any.fromFunction1(value))
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setChangeableFieldNamesSet_(value: Any): Self = StObject.set(x, "changeableFieldNamesSet_", value.asInstanceOf[js.Any])
      
      inline def setCheckIfCanChangeClass_(value: Any): Self = StObject.set(x, "checkIfCanChangeClass_", value.asInstanceOf[js.Any])
      
      inline def setCheckIfCanChangeNegativeKey_(value: Any): Self = StObject.set(x, "checkIfCanChangeNegativeKey_", value.asInstanceOf[js.Any])
      
      inline def setCheckIfClassIsJustToGroup_(value: Any): Self = StObject.set(x, "checkIfClassIsJustToGroup_", value.asInstanceOf[js.Any])
      
      inline def setCheckIfFieldIsReadOnly_(value: Any): Self = StObject.set(x, "checkIfFieldIsReadOnly_", value.asInstanceOf[js.Any])
      
      inline def setCheckIfIsEmpty_(value: Any): Self = StObject.set(x, "checkIfIsEmpty_", value.asInstanceOf[js.Any])
      
      inline def setCheckPermission_(value: Any): Self = StObject.set(x, "checkPermission_", value.asInstanceOf[js.Any])
      
      inline def setCheckPosition_(value: Any): Self = StObject.set(x, "checkPosition_", value.asInstanceOf[js.Any])
      
      inline def setCheckRequiredFields_(value: Any): Self = StObject.set(x, "checkRequiredFields_", value.asInstanceOf[js.Any])
      
      inline def setCheckStrictMode_(value: Any): Self = StObject.set(x, "checkStrictMode_", value.asInstanceOf[js.Any])
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKey_(value: Any): Self = StObject.set(x, "classKey_", value.asInstanceOf[js.Any])
      
      inline def setCloneClass_(value: () => Unit): Self = StObject.set(x, "CloneClass_", js.Any.fromFunction0(value))
      
      inline def setCloneableProperties_(value: Any): Self = StObject.set(x, "cloneableProperties_", value.asInstanceOf[js.Any])
      
      inline def setConfigDef_(value: Any): Self = StObject.set(x, "configDef_", value.asInstanceOf[js.Any])
      
      inline def setCustomModelDef_(value: Any): Self = StObject.set(x, "customModelDef_", value.asInstanceOf[js.Any])
      
      inline def setDataSet_(value: Any): Self = StObject.set(x, "dataSet_", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setEdit(value: () => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction0(value))
      
      inline def setEditableNegativeKeys_(value: Any): Self = StObject.set(x, "editableNegativeKeys_", value.asInstanceOf[js.Any])
      
      inline def setEditableProductFields_(value: Any): Self = StObject.set(x, "editableProductFields_", value.asInstanceOf[js.Any])
      
      inline def setEmitDataSetEvent_(value: Any): Self = StObject.set(x, "emitDataSetEvent_", value.asInstanceOf[js.Any])
      
      inline def setEmitEvent_(value: Any): Self = StObject.set(x, "emitEvent_", value.asInstanceOf[js.Any])
      
      inline def setEmitFieldChangeEvent_(value: Any): Self = StObject.set(x, "emitFieldChangeEvent_", value.asInstanceOf[js.Any])
      
      inline def setEmitFieldEvent_(value: Any): Self = StObject.set(x, "emitFieldEvent_", value.asInstanceOf[js.Any])
      
      inline def setExecuteMasterDetailActions_(value: Any): Self = StObject.set(x, "executeMasterDetailActions_", value.asInstanceOf[js.Any])
      
      inline def setExtraFilterFields_(value: Any): Self = StObject.set(x, "extraFilterFields_", value.asInstanceOf[js.Any])
      
      inline def setFieldPermissions_(value: Any): Self = StObject.set(x, "fieldPermissions_", value.asInstanceOf[js.Any])
      
      inline def setFieldTypeIsSupported_(value: Any): Self = StObject.set(x, "fieldTypeIsSupported_", value.asInstanceOf[js.Any])
      
      inline def setFieldsFilter_(value: Any): Self = StObject.set(x, "fieldsFilter_", value.asInstanceOf[js.Any])
      
      inline def setFieldsWithDefaultValue_(value: Any): Self = StObject.set(x, "fieldsWithDefaultValue_", value.asInstanceOf[js.Any])
      
      inline def setFields_(value: Any): Self = StObject.set(x, "fields_", value.asInstanceOf[js.Any])
      
      inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetExtraFilters_(value: Any): Self = StObject.set(x, "getExtraFilters_", value.asInstanceOf[js.Any])
      
      inline def setInsert_(value: () => Unit): Self = StObject.set(x, "insert_", js.Any.fromFunction0(value))
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKey_(value: Any): Self = StObject.set(x, "key_", value.asInstanceOf[js.Any])
      
      inline def setMasterDetailFields_(value: Any): Self = StObject.set(x, "masterDetailFields_", value.asInstanceOf[js.Any])
      
      inline def setModelDef_(value: Any): Self = StObject.set(x, "modelDef_", value.asInstanceOf[js.Any])
      
      inline def setNormalizeFieldValue_(value: Any): Self = StObject.set(x, "normalizeFieldValue_", value.asInstanceOf[js.Any])
      
      inline def setOriginalBookmark_(value: Any): Self = StObject.set(x, "originalBookmark_", value.asInstanceOf[js.Any])
      
      inline def setPermissionFieldLabels_(value: Any): Self = StObject.set(x, "permissionFieldLabels_", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => Double): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      inline def setPost(value: () => Unit): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      inline def setPostPending(value: Boolean): Self = StObject.set(x, "postPending", value.asInstanceOf[js.Any])
      
      inline def setRequiredFields_(value: Any): Self = StObject.set(x, "requiredFields_", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setState(value: EntityState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStringify_(value: Any): Self = StObject.set(x, "stringify_", value.asInstanceOf[js.Any])
      
      inline def setSuggestDefaultValues_(value: Any): Self = StObject.set(x, "suggestDefaultValues_", value.asInstanceOf[js.Any])
      
      inline def setToJSONSchema(value: () => Any): Self = StObject.set(x, "toJSONSchema", js.Any.fromFunction0(value))
      
      inline def setToJSONString(value: () => String): Self = StObject.set(x, "toJSONString", js.Any.fromFunction0(value))
      
      inline def setUpdateClass_(value: Double => Unit): Self = StObject.set(x, "updateClass_", js.Any.fromFunction1(value))
      
      inline def setUserKey_(value: Any): Self = StObject.set(x, "userKey_", value.asInstanceOf[js.Any])
      
      inline def setValidateLookupValue_(value: Any): Self = StObject.set(x, "validateLookupValue_", value.asInstanceOf[js.Any])
      
      inline def setVisibleFieldIndexes_(value: Any): Self = StObject.set(x, "visibleFieldIndexes_", value.asInstanceOf[js.Any])
      
      inline def setVisibleFieldNamesSet_(value: Any): Self = StObject.set(x, "visibleFieldNamesSet_", value.asInstanceOf[js.Any])
      
      inline def setVisibleFieldNames_(value: Any): Self = StObject.set(x, "visibleFieldNames_", value.asInstanceOf[js.Any])
    }
  }
  
  type EntityOptions = typings.nginstackOrm.libEntityOptionsMod.^
  
  trait EntityState extends StObject {
    
    var ADDED: Double
    
    var DELETED: Double
    
    var DETACHED: Double
    
    var MODIFIED: Double
    
    var UNCHANGED: Double
  }
  object EntityState {
    
    inline def apply(ADDED: Double, DELETED: Double, DETACHED: Double, MODIFIED: Double, UNCHANGED: Double): EntityState = {
      val __obj = js.Dynamic.literal(ADDED = ADDED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any], DETACHED = DETACHED.asInstanceOf[js.Any], MODIFIED = MODIFIED.asInstanceOf[js.Any], UNCHANGED = UNCHANGED.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntityState] (val x: Self) extends AnyVal {
      
      inline def setADDED(value: Double): Self = StObject.set(x, "ADDED", value.asInstanceOf[js.Any])
      
      inline def setDELETED(value: Double): Self = StObject.set(x, "DELETED", value.asInstanceOf[js.Any])
      
      inline def setDETACHED(value: Double): Self = StObject.set(x, "DETACHED", value.asInstanceOf[js.Any])
      
      inline def setMODIFIED(value: Double): Self = StObject.set(x, "MODIFIED", value.asInstanceOf[js.Any])
      
      inline def setUNCHANGED(value: Double): Self = StObject.set(x, "UNCHANGED", value.asInstanceOf[js.Any])
    }
  }
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
  
  type FieldPermissions = typings.nginstackEngine.libSecurityFieldPermissionsMod.^
  
  type ModelDef = typings.nginstackEngine.libClassdefModelDefMod.^
}
