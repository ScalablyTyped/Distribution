package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientDataSetMod {
  
  inline def apply(dataSetOrArray: Any, howManyRecords: Any, fields: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(dataSetOrArray.asInstanceOf[js.Any], howManyRecords.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/ClientDataSet", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ClientDataSet {
    def this(dataSetOrArray: Any, howManyRecords: Any, fields: Any) = this()
    
    /* CompleteClass */
    override def append(): Unit = js.native
    
    /* CompleteClass */
    var bof: Boolean = js.native
    
    /* CompleteClass */
    var bookmark: String = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def del(): Unit = js.native
    
    /* CompleteClass */
    var deleteRecord: Any = js.native
    
    /* CompleteClass */
    var eof: Boolean = js.native
    
    /* CompleteClass */
    var fieldCount: Any = js.native
    
    /* CompleteClass */
    override def fieldIsNull(fieldReference: Any): Boolean = js.native
    
    /* CompleteClass */
    var fieldNames: Any = js.native
    
    /* CompleteClass */
    var fieldSizes: Any = js.native
    
    /* CompleteClass */
    var fieldTypes: Any = js.native
    
    /* CompleteClass */
    override def first(): Unit = js.native
    
    /* CompleteClass */
    override def getField(fieldReference: Any): Any = js.native
    
    /* CompleteClass */
    override def getFieldName(fieldIndex: Any): Any = js.native
    
    /* CompleteClass */
    override def getFieldSize(fieldReference: Any): Any = js.native
    
    /* CompleteClass */
    override def getFieldType(fieldReference: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var indexOfFieldName_ : Any = js.native
    
    /* CompleteClass */
    var isEmpty: Boolean = js.native
    
    /* CompleteClass */
    override def last(): Unit = js.native
    
    /* CompleteClass */
    override def next(): Unit = js.native
    
    /* CompleteClass */
    override def post(): Unit = js.native
    
    /* CompleteClass */
    override def prior(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var readRecord_ : Any = js.native
    
    /* CompleteClass */
    var recNo: Any = js.native
    
    /* CompleteClass */
    var recordCount: Any = js.native
    
    /* CompleteClass */
    var records: Any = js.native
    
    /* CompleteClass */
    override def setBookmark(bookmark: Any): Unit = js.native
    
    /* CompleteClass */
    override def setField(fieldReference: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setRecNo(newRecNo: Any, increment: Any): Unit = js.native
    
    /* CompleteClass */
    override def updateDataSet(dataSet: Any): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/dataset/ClientDataSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClientDataSet extends StObject {
    
    def append(): Unit
    
    var bof: Boolean
    
    var bookmark: String
    
    def cancel(): Unit
    
    def del(): Unit
    
    var deleteRecord: Any
    
    var eof: Boolean
    
    var fieldCount: Any
    
    def fieldIsNull(fieldReference: Any): Boolean
    
    var fieldNames: Any
    
    var fieldSizes: Any
    
    var fieldTypes: Any
    
    def first(): Unit
    
    def getField(fieldReference: Any): Any
    
    def getFieldName(fieldIndex: Any): Any
    
    def getFieldSize(fieldReference: Any): Any
    
    def getFieldType(fieldReference: Any): Any
    
    /* private */ var indexOfFieldName_ : Any
    
    var isEmpty: Boolean
    
    def last(): Unit
    
    def next(): Unit
    
    def post(): Unit
    
    def prior(): Unit
    
    /* private */ var readRecord_ : Any
    
    var recNo: Any
    
    var recordCount: Any
    
    var records: Any
    
    def setBookmark(bookmark: Any): Unit
    
    def setField(fieldReference: Any, value: Any): Unit
    
    def setRecNo(newRecNo: Any, increment: Any): Unit
    
    def updateDataSet(dataSet: Any): Unit
  }
  object ClientDataSet {
    
    inline def apply(
      append: () => Unit,
      bof: Boolean,
      bookmark: String,
      cancel: () => Unit,
      del: () => Unit,
      deleteRecord: Any,
      eof: Boolean,
      fieldCount: Any,
      fieldIsNull: Any => Boolean,
      fieldNames: Any,
      fieldSizes: Any,
      fieldTypes: Any,
      first: () => Unit,
      getField: Any => Any,
      getFieldName: Any => Any,
      getFieldSize: Any => Any,
      getFieldType: Any => Any,
      indexOfFieldName_ : Any,
      isEmpty: Boolean,
      last: () => Unit,
      next: () => Unit,
      post: () => Unit,
      prior: () => Unit,
      readRecord_ : Any,
      recNo: Any,
      recordCount: Any,
      records: Any,
      setBookmark: Any => Unit,
      setField: (Any, Any) => Unit,
      setRecNo: (Any, Any) => Unit,
      updateDataSet: Any => Unit
    ): ClientDataSet = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction0(append), bof = bof.asInstanceOf[js.Any], bookmark = bookmark.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), del = js.Any.fromFunction0(del), deleteRecord = deleteRecord.asInstanceOf[js.Any], eof = eof.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], fieldIsNull = js.Any.fromFunction1(fieldIsNull), fieldNames = fieldNames.asInstanceOf[js.Any], fieldSizes = fieldSizes.asInstanceOf[js.Any], fieldTypes = fieldTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), getField = js.Any.fromFunction1(getField), getFieldName = js.Any.fromFunction1(getFieldName), getFieldSize = js.Any.fromFunction1(getFieldSize), getFieldType = js.Any.fromFunction1(getFieldType), indexOfFieldName_ = indexOfFieldName_.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], last = js.Any.fromFunction0(last), next = js.Any.fromFunction0(next), post = js.Any.fromFunction0(post), prior = js.Any.fromFunction0(prior), readRecord_ = readRecord_.asInstanceOf[js.Any], recNo = recNo.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], setBookmark = js.Any.fromFunction1(setBookmark), setField = js.Any.fromFunction2(setField), setRecNo = js.Any.fromFunction2(setRecNo), updateDataSet = js.Any.fromFunction1(updateDataSet))
      __obj.asInstanceOf[ClientDataSet]
    }
    
    extension [Self <: ClientDataSet](x: Self) {
      
      inline def setAppend(value: () => Unit): Self = StObject.set(x, "append", js.Any.fromFunction0(value))
      
      inline def setBof(value: Boolean): Self = StObject.set(x, "bof", value.asInstanceOf[js.Any])
      
      inline def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setDel(value: () => Unit): Self = StObject.set(x, "del", js.Any.fromFunction0(value))
      
      inline def setDeleteRecord(value: Any): Self = StObject.set(x, "deleteRecord", value.asInstanceOf[js.Any])
      
      inline def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      inline def setFieldCount(value: Any): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      inline def setFieldIsNull(value: Any => Boolean): Self = StObject.set(x, "fieldIsNull", js.Any.fromFunction1(value))
      
      inline def setFieldNames(value: Any): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldSizes(value: Any): Self = StObject.set(x, "fieldSizes", value.asInstanceOf[js.Any])
      
      inline def setFieldTypes(value: Any): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: () => Unit): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setGetField(value: Any => Any): Self = StObject.set(x, "getField", js.Any.fromFunction1(value))
      
      inline def setGetFieldName(value: Any => Any): Self = StObject.set(x, "getFieldName", js.Any.fromFunction1(value))
      
      inline def setGetFieldSize(value: Any => Any): Self = StObject.set(x, "getFieldSize", js.Any.fromFunction1(value))
      
      inline def setGetFieldType(value: Any => Any): Self = StObject.set(x, "getFieldType", js.Any.fromFunction1(value))
      
      inline def setIndexOfFieldName_(value: Any): Self = StObject.set(x, "indexOfFieldName_", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setLast(value: () => Unit): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setPost(value: () => Unit): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      inline def setPrior(value: () => Unit): Self = StObject.set(x, "prior", js.Any.fromFunction0(value))
      
      inline def setReadRecord_(value: Any): Self = StObject.set(x, "readRecord_", value.asInstanceOf[js.Any])
      
      inline def setRecNo(value: Any): Self = StObject.set(x, "recNo", value.asInstanceOf[js.Any])
      
      inline def setRecordCount(value: Any): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: Any): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setSetBookmark(value: Any => Unit): Self = StObject.set(x, "setBookmark", js.Any.fromFunction1(value))
      
      inline def setSetField(value: (Any, Any) => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction2(value))
      
      inline def setSetRecNo(value: (Any, Any) => Unit): Self = StObject.set(x, "setRecNo", js.Any.fromFunction2(value))
      
      inline def setUpdateDataSet(value: Any => Unit): Self = StObject.set(x, "updateDataSet", js.Any.fromFunction1(value))
    }
  }
}
