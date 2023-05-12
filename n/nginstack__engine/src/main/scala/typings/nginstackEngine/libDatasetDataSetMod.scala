package typings.nginstackEngine

import typings.nginstackEngine.anon.IgnoreNonExistingFields
import typings.nginstackEngine.anon.Kind
import typings.nginstackEngine.anon.SharedDelta
import typings.nginstackEngine.anon.ToLowerCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetDataSetMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(idoDB: IdoDB): Unit = ^.asInstanceOf[js.Dynamic].apply(idoDB.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DataSet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSet {
    def this(idoDB: IdoDB) = this()
  }
  @JSImport("@nginstack/engine/lib/dataset/DataSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIntegerDataType(): DataSetFieldType = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegerDataType")().asInstanceOf[DataSetFieldType]
  
  inline def getStringOverflowMode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringOverflowMode")().asInstanceOf[String]
  
  inline def setIntegerDataType(`type`: DataSetFieldType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIntegerDataType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setStringOverflowMode(mode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStringOverflowMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ApplyUndoLogOptions extends StObject {
    
    var endVersion: Double | Null
    
    var startVersion: Double | Null
  }
  object ApplyUndoLogOptions {
    
    inline def apply(): ApplyUndoLogOptions = {
      val __obj = js.Dynamic.literal(endVersion = null, startVersion = null)
      __obj.asInstanceOf[ApplyUndoLogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyUndoLogOptions] (val x: Self) extends AnyVal {
      
      inline def setEndVersion(value: Double): Self = StObject.set(x, "endVersion", value.asInstanceOf[js.Any])
      
      inline def setEndVersionNull: Self = StObject.set(x, "endVersion", null)
      
      inline def setStartVersion(value: Double): Self = StObject.set(x, "startVersion", value.asInstanceOf[js.Any])
      
      inline def setStartVersionNull: Self = StObject.set(x, "startVersion", null)
    }
  }
  
  @js.native
  trait DataSet extends StObject {
    
    /* private */ var _fieldsCacheOfGetFields: Any = js.native
    
    /* private */ var _getAndSetFieldInformedCache: Any = js.native
    
    /* private */ var _hasInformedField: Any = js.native
    
    /* private */ var _indexFieldsCacheOfGetFields: Any = js.native
    
    /* private */ var _mountGetAndSetFieldInformedCache: Any = js.native
    
    var active: Boolean = js.native
    
    def addMultivalue(): Unit = js.native
    
    def append(): Unit = js.native
    def append(dataSet: js.Array[Any]): Unit = js.native
    def append(dataSet: js.Array[Any], updatePreexistingKey: Boolean): Unit = js.native
    def append(dataSet: js.Array[Any], updatePreexistingKey: Boolean, insertEvenPreexistingKey: Boolean): Unit = js.native
    def append(dataSet: js.Array[Any], updatePreexistingKey: Unit, insertEvenPreexistingKey: Boolean): Unit = js.native
    def append(dataSet: Unit, updatePreexistingKey: Boolean): Unit = js.native
    def append(dataSet: Unit, updatePreexistingKey: Boolean, insertEvenPreexistingKey: Boolean): Unit = js.native
    def append(dataSet: Unit, updatePreexistingKey: Unit, insertEvenPreexistingKey: Boolean): Unit = js.native
    def append(dataSet: DataSet): Unit = js.native
    def append(dataSet: DataSet, updatePreexistingKey: Boolean): Unit = js.native
    def append(dataSet: DataSet, updatePreexistingKey: Boolean, insertEvenPreexistingKey: Boolean): Unit = js.native
    def append(dataSet: DataSet, updatePreexistingKey: Unit, insertEvenPreexistingKey: Boolean): Unit = js.native
    
    def applyLog(iLog: DataSet): Unit = js.native
    def applyLog(iLog: DataSet, options: ApplyUndoLogOptions): Unit = js.native
    
    def applyUpdates(): Double = js.native
    def applyUpdates(waitDBCacheSync: Boolean): Double = js.native
    def applyUpdates(waitDBCacheSync: Boolean, logChanges: Boolean): Double = js.native
    def applyUpdates(waitDBCacheSync: Unit, logChanges: Boolean): Double = js.native
    
    var automaticApplyUpdates: Boolean = js.native
    
    var automaticPost: Boolean = js.native
    
    def backupState(): Any = js.native
    
    var bof: Boolean = js.native
    
    var bookmark: String = js.native
    
    def bool(expr: String): Boolean = js.native
    
    def cancel(): Unit = js.native
    
    def cancelUpdates(): Unit = js.native
    def cancelUpdates(opt_key: Double): Unit = js.native
    
    var classesFilter: String = js.native
    
    def clone(source: DataSet): Unit = js.native
    def clone(source: DataSet, opt_options: Any): Unit = js.native
    
    def close(): Unit = js.native
    
    def copy(source: DataSet): Unit = js.native
    
    def copyRecord(ds: DataSet): Unit = js.native
    def copyRecord(ds: DataSet, excludedFieldNames: String): Unit = js.native
    
    def copyStructure(sourceDataSet: DataSet): Unit = js.native
    def copyStructure(sourceDataSet: DataSet, fieldNames: String): Unit = js.native
    
    def create(): Unit = js.native
    
    def createField(fieldName: String, fieldType: String): Unit = js.native
    def createField(fieldName: String, fieldType: String, opt_fieldSize: Double): Unit = js.native
    
    var dataSetId: Double = js.native
    
    var dataSetVersion: Double = js.native
    
    def date(expr: String): js.Date | Null = js.native
    
    def dbkey(expr: String): typings.nginstackEngine.libDbkeyDbkeyMod.^ | Null = js.native
    
    def del(): Unit = js.native
    
    def edit(): Unit = js.native
    
    def empty(): Unit = js.native
    
    var eof: Boolean = js.native
    
    var fieldCount: Double = js.native
    
    var fieldDefs: DataSetFieldDefs = js.native
    
    def fieldIsNull(fieldNameOrPositionIndex: Any): Boolean = js.native
    
    def fieldIsProtected(fieldName: String): Boolean = js.native
    
    def fieldWasModified(fieldId: String): Unit = js.native
    def fieldWasModified(fieldId: Double): Unit = js.native
    
    var filter: String = js.native
    
    var filtered: Boolean = js.native
    
    def find(searchValues: Any): Boolean = js.native
    
    def findField(fieldName: String): Double = js.native
    
    def findKey(key: Double): Boolean = js.native
    
    def findNearest(searchValues: Any): Unit = js.native
    
    def first(): Unit = js.native
    
    def getDeltaInspector(): DeltaInspector = js.native
    
    def getField(fieldId: String): String | Double | js.Date | Boolean | Null = js.native
    def getField(fieldId: String, options: Double): String | Double | js.Date | Boolean | Null = js.native
    def getField(fieldId: String, options: GetFieldOptions): String | Double | js.Date | Boolean | Null = js.native
    def getField(fieldId: Double): String | Double | js.Date | Boolean | Null = js.native
    def getField(fieldId: Double, options: Double): String | Double | js.Date | Boolean | Null = js.native
    def getField(fieldId: Double, options: GetFieldOptions): String | Double | js.Date | Boolean | Null = js.native
    
    var getFieldInformed: Any = js.native
    
    def getFieldModified(fieldId: String): Unit = js.native
    def getFieldModified(fieldId: Double): Unit = js.native
    
    def getFieldName(fieldIdx: Double): Unit = js.native
    
    def getFieldNames(): js.Array[String] = js.native
    def getFieldNames(opt_options: ToLowerCase): js.Array[String] = js.native
    
    def getFieldSize(fieldNameOrPositionIndex: Any): Double = js.native
    
    def getFieldType(fieldId: String): Unit = js.native
    def getFieldType(fieldId: Double): Unit = js.native
    
    def getFields(fields: String, options: GetFieldOptions): js.Array[Any] = js.native
    def getFields(fields: js.Array[Any], options: GetFieldOptions): js.Array[Any] = js.native
    
    def getIndex(): js.Array[String] = js.native
    
    def getInformedField(fieldNameOrIndex: String): Boolean = js.native
    def getInformedField(fieldNameOrIndex: Double): Boolean = js.native
    
    def getLocalDBInfo(): Kind = js.native
    
    def getRange(): js.Array[Any] = js.native
    
    def getRecordApplyUpdatesAction(key: Double): Double = js.native
    
    def getRows(fieldName: String): js.Array[Any] = js.native
    
    def getView(): Unit = js.native
    
    def goToCurrent(ds: DataSet): Unit = js.native
    
    def gotoBookmark(bookmark: String): Unit = js.native
    
    def gotoRowId(rowId: Double): Unit = js.native
    
    var ignoredFieldNamesOnApplyUpdates: String = js.native
    
    var indexFieldNames: String = js.native
    
    var insertWithHighKey: Boolean = js.native
    
    var insertWithKey: Boolean = js.native
    
    var integrityCheck: Boolean = js.native
    
    var isEmpty: Boolean = js.native
    
    var isProtected: Boolean = js.native
    
    def iterate(func: js.Function1[/* arg0 */ this.type, Any]): Unit = js.native
    def iterate(func: js.Function1[/* arg0 */ this.type, Any], thisObj: Any): Unit = js.native
    
    def last(): Unit = js.native
    
    def loadFromStream(streamObject: File): Unit = js.native
    def loadFromStream(streamObject: MemoryStream): Unit = js.native
    
    var localDBInfo: Any = js.native
    
    def locate(fields: String): Boolean = js.native
    def locate(fields: String, values: String): Boolean = js.native
    def locate(fields: String, values: String, searchPartialValues: Boolean): Boolean = js.native
    def locate(fields: String, values: js.Array[String | js.Date | Double | Boolean | Null]): Boolean = js.native
    def locate(
      fields: String,
      values: js.Array[String | js.Date | Double | Boolean | Null],
      searchPartialValues: Boolean
    ): Boolean = js.native
    def locate(fields: String, values: js.Date): Boolean = js.native
    def locate(fields: String, values: js.Date, searchPartialValues: Boolean): Boolean = js.native
    def locate(fields: String, values: Boolean): Boolean = js.native
    def locate(fields: String, values: Boolean, searchPartialValues: Boolean): Boolean = js.native
    def locate(fields: String, values: Double): Boolean = js.native
    def locate(fields: String, values: Double, searchPartialValues: Boolean): Boolean = js.native
    def locate(fields: String, values: Null, searchPartialValues: Boolean): Boolean = js.native
    
    def locateNextPattern(): Boolean = js.native
    
    def locatePattern(fields: String, values: String, logicalOperator: String): Boolean = js.native
    
    var logChanges: Boolean = js.native
    
    var modified: Boolean = js.native
    
    def newSharedDataSet(): DataSet = js.native
    def newSharedDataSet(opt_options: SharedDelta): DataSet = js.native
    
    def next(): Unit = js.native
    
    def num(expr: String): Double = js.native
    
    def post(): Unit = js.native
    
    def prior(): Unit = js.native
    
    def protect(fields: js.Array[String]): Double = js.native
    def protect(fields: js.Array[String], opt_options: Any): Double = js.native
    
    var protectedFields: js.Array[String] = js.native
    
    var rangeActive: Boolean = js.native
    
    var recNo: Double = js.native
    
    var recordCount: Double = js.native
    
    var recordVersion: Double = js.native
    
    def reload(): Unit = js.native
    
    def removeMultivalue(): Unit = js.native
    
    def resetFields(): Unit = js.native
    
    def resetRange(): Unit = js.native
    
    def resetView(): Unit = js.native
    
    def restoreState(state: Any): Unit = js.native
    
    def rollBack(): Unit = js.native
    
    var rowId: Double = js.native
    
    def saveToStream(streamObject: File): Unit = js.native
    def saveToStream(streamObject: MemoryStream): Unit = js.native
    
    def search(resultFields: String, searchFields: String, value: String, inexact: Boolean, limit: Double): DataSet = js.native
    
    def setField(fieldId: String, value: Any): Unit = js.native
    def setField(fieldId: String, value: Any, opt_ignoreInvalidFieldId: Boolean): Unit = js.native
    def setField(fieldId: Double, value: Any): Unit = js.native
    def setField(fieldId: Double, value: Any, opt_ignoreInvalidFieldId: Boolean): Unit = js.native
    
    var setFieldInformed: Any = js.native
    
    def setIndex(fieldNames: String): Unit = js.native
    def setIndex(fieldNames: String, opt_descendingFieldNames: String): Unit = js.native
    
    def setInformedField(fieldNameOrIndex: String, informed: Boolean): Unit = js.native
    def setInformedField(fieldNameOrIndex: Double, informed: Boolean): Unit = js.native
    
    def setRange(startVal: Any, endVal: Any): Unit = js.native
    
    def setRecordApplyUpdatesAction(key: Double, action: Double): Unit = js.native
    
    def setView(classKey: Double): Unit = js.native
    def setView(classKey: Double, userKey: Double): Unit = js.native
    def setView(classKey: Double, userKey: Double, securityExtraFilter: String): Unit = js.native
    def setView(classKey: Double, userKey: Unit, securityExtraFilter: String): Unit = js.native
    
    def sql(sqlExpression: String): Unit = js.native
    
    var sqlStatement: String = js.native
    
    var state: Double = js.native
    
    def str(expr: String): String = js.native
    
    var streamDelta: Boolean = js.native
    
    var streamOnlyChangedRecords: Boolean = js.native
    
    def sum(fieldsToGroup: String, fieldsToSum: String): DataSet = js.native
    
    var tableName: String = js.native
    
    def testMultivalue(): Boolean = js.native
    
    def tryGotoBookmark(bookmark: String): Boolean = js.native
    
    def tryGotoRowId(rowId: Double): Boolean = js.native
    
    def undoLog(iLog: DataSet): Unit = js.native
    def undoLog(iLog: DataSet, options: ApplyUndoLogOptions): Unit = js.native
    
    def unprotect(key: Double): Unit = js.native
    
    def updateAll(fieldNames: js.Array[String], values: js.Array[Any]): Unit = js.native
    def updateAll(fieldNames: js.Array[String], values: js.Array[Any], options: IgnoreNonExistingFields): Unit = js.native
    def updateAll(fieldNames: js.Array[String], values: DataSet): Unit = js.native
    def updateAll(fieldNames: js.Array[String], values: DataSet, options: IgnoreNonExistingFields): Unit = js.native
    
    def `val`(expr: String): String | Double | Null | Boolean | js.Date = js.native
    
    var verifyDeleteIntegrity: Boolean = js.native
    
    var viewActive: Boolean = js.native
  }
  
  trait DataSetFieldDef extends StObject {
    
    var name: String
    
    var size: Double
    
    var `type`: DataSetFieldType
  }
  object DataSetFieldDef {
    
    inline def apply(name: String, size: Double, `type`: DataSetFieldType): DataSetFieldDef = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetFieldDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSetFieldDef] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: DataSetFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataSetFieldDefs extends StObject {
    
    def add(defOrName: String): Unit = js.native
    def add(defOrName: String, `type`: Unit, size: Double): Unit = js.native
    def add(defOrName: String, `type`: DataSetFieldType): Unit = js.native
    def add(defOrName: String, `type`: DataSetFieldType, size: Double): Unit = js.native
    def add(defOrName: js.Array[DataSetFieldDef]): Unit = js.native
    def add(defOrName: js.Array[DataSetFieldDef], `type`: Unit, size: Double): Unit = js.native
    def add(defOrName: js.Array[DataSetFieldDef], `type`: DataSetFieldType): Unit = js.native
    def add(defOrName: js.Array[DataSetFieldDef], `type`: DataSetFieldType, size: Double): Unit = js.native
    def add(defOrName: DataSetFieldDef): Unit = js.native
    def add(defOrName: DataSetFieldDef, `type`: Unit, size: Double): Unit = js.native
    def add(defOrName: DataSetFieldDef, `type`: DataSetFieldType): Unit = js.native
    def add(defOrName: DataSetFieldDef, `type`: DataSetFieldType, size: Double): Unit = js.native
    
    def assign(fieldDefs: DataSetFieldDefs): Unit = js.native
    
    def clear(): Unit = js.native
    
    def delete(id: String): Boolean = js.native
    def delete(id: Double): Boolean = js.native
    
    def get(id: String): DataSetFieldDef = js.native
    def get(id: Double): DataSetFieldDef = js.native
    
    def has(name: String): Boolean = js.native
    
    def set(id: String, `def`: DataSetFieldDef): Unit = js.native
    def set(id: Double, `def`: DataSetFieldDef): Unit = js.native
    
    var size: Double = js.native
    
    def toArray(): js.Array[DataSetFieldDef] = js.native
  }
  
  type DataSetFieldType = typings.nginstackEngine.libDatasetDataSetDataTypeMod.DataSetFieldType
  
  type DeltaInspector = typings.nginstackEngine.libDatasetDeltaInspectorMod.^
  
  type File = typings.nginstackEngine.libIoFileMod.^
  
  type GetFieldOptions = typings.nginstackEngine.libDatasetGetFieldOptionsMod.^
  
  type IdoDB = typings.nginstackEngine.libIdoIdoDBMod.^
  
  type MemoryStream = typings.nginstackEngine.libIoMemoryStreamMod.^
}
