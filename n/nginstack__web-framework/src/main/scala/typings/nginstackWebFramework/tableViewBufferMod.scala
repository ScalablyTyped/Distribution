package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableViewBufferMod {
  
  inline def apply(grid: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TableViewBuffer {
    def this(grid: Any) = this()
    
    /* private */ /* CompleteClass */
    var _grid: Any = js.native
    
    /* private */ /* CompleteClass */
    var _searchRecordBufferByRecNo: Any = js.native
    
    /* CompleteClass */
    var buffer: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var clientBufferIndex: Any = js.native
    
    /* CompleteClass */
    override def createRecordBuffer(qtd: Any, bufferLength: Any): Unit = js.native
    
    /* CompleteClass */
    var editedRecBuffer: Any = js.native
    
    /* CompleteClass */
    var editing: Boolean = js.native
    
    /* CompleteClass */
    var editingOrInserting: Boolean = js.native
    
    /* CompleteClass */
    var fEditingRecBuffer: Any = js.native
    
    /* CompleteClass */
    override def getEditingRecBuffer(): Any = js.native
    
    /* private */ /* CompleteClass */
    var getLastUsedBufferIndex: Any = js.native
    
    /* CompleteClass */
    override def getRecordBufferByRecNo(recNo: Any): Any = js.native
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def isBrowsing(): Boolean = js.native
    
    /* CompleteClass */
    override def isInactive(): Boolean = js.native
    
    /* CompleteClass */
    var lastRecordIndex: Double = js.native
    
    /* CompleteClass */
    override def rebuild(qtd: Any, bufferLength: Any): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def resync(): Unit = js.native
    
    /* CompleteClass */
    override def resyncRecord(recNo: Any): Unit = js.native
    
    /* CompleteClass */
    override def setEditingRecBuffer(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setFieldRecordBuffer(fieldIndex: Any, recNo: Any, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def setState(value: Double): Unit = js.native
    
    /* CompleteClass */
    var stateModified: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var state_ : Any = js.native
    
    /* CompleteClass */
    var syncBookmarkAfterInsert: Boolean = js.native
    
    /* CompleteClass */
    override def updateBufferProperties(propertyName: Any, value: Any): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_BROWSE")
  @js.native
  val BM_BROWSE: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_DELETING")
  @js.native
  val BM_DELETING: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_EDIT")
  @js.native
  val BM_EDIT: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_INACTIVE")
  @js.native
  val BM_INACTIVE: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TableViewBuffer", "BM_INSERT")
  @js.native
  val BM_INSERT: Double = js.native
  
  trait TableViewBuffer extends StObject {
    
    /* private */ var _grid: Any
    
    /* private */ var _searchRecordBufferByRecNo: Any
    
    var buffer: js.Array[Any]
    
    def clear(): Unit
    
    var clientBufferIndex: Any
    
    def createRecordBuffer(qtd: Any, bufferLength: Any): Unit
    
    var editedRecBuffer: Any
    
    var editing: Boolean
    
    var editingOrInserting: Boolean
    
    var fEditingRecBuffer: Any
    
    def getEditingRecBuffer(): Any
    
    /* private */ var getLastUsedBufferIndex: Any
    
    def getRecordBufferByRecNo(recNo: Any): Any
    
    def getState(): Double
    
    def isBrowsing(): Boolean
    
    def isInactive(): Boolean
    
    var lastRecordIndex: Double
    
    def rebuild(qtd: Any, bufferLength: Any): Unit
    
    def reset(): Unit
    
    def resync(): Unit
    
    def resyncRecord(recNo: Any): Unit
    
    def setEditingRecBuffer(value: Any): Unit
    
    def setFieldRecordBuffer(fieldIndex: Any, recNo: Any, value: Any): Unit
    
    def setState(value: Double): Unit
    
    var stateModified: Boolean
    
    /* private */ var state_ : Any
    
    var syncBookmarkAfterInsert: Boolean
    
    def updateBufferProperties(propertyName: Any, value: Any): Unit
  }
  object TableViewBuffer {
    
    inline def apply(
      _grid: Any,
      _searchRecordBufferByRecNo: Any,
      buffer: js.Array[Any],
      clear: () => Unit,
      clientBufferIndex: Any,
      createRecordBuffer: (Any, Any) => Unit,
      editedRecBuffer: Any,
      editing: Boolean,
      editingOrInserting: Boolean,
      fEditingRecBuffer: Any,
      getEditingRecBuffer: () => Any,
      getLastUsedBufferIndex: Any,
      getRecordBufferByRecNo: Any => Any,
      getState: () => Double,
      isBrowsing: () => Boolean,
      isInactive: () => Boolean,
      lastRecordIndex: Double,
      rebuild: (Any, Any) => Unit,
      reset: () => Unit,
      resync: () => Unit,
      resyncRecord: Any => Unit,
      setEditingRecBuffer: Any => Unit,
      setFieldRecordBuffer: (Any, Any, Any) => Unit,
      setState: Double => Unit,
      stateModified: Boolean,
      state_ : Any,
      syncBookmarkAfterInsert: Boolean,
      updateBufferProperties: (Any, Any) => Unit
    ): TableViewBuffer = {
      val __obj = js.Dynamic.literal(_grid = _grid.asInstanceOf[js.Any], _searchRecordBufferByRecNo = _searchRecordBufferByRecNo.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), clientBufferIndex = clientBufferIndex.asInstanceOf[js.Any], createRecordBuffer = js.Any.fromFunction2(createRecordBuffer), editedRecBuffer = editedRecBuffer.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], editingOrInserting = editingOrInserting.asInstanceOf[js.Any], fEditingRecBuffer = fEditingRecBuffer.asInstanceOf[js.Any], getEditingRecBuffer = js.Any.fromFunction0(getEditingRecBuffer), getLastUsedBufferIndex = getLastUsedBufferIndex.asInstanceOf[js.Any], getRecordBufferByRecNo = js.Any.fromFunction1(getRecordBufferByRecNo), getState = js.Any.fromFunction0(getState), isBrowsing = js.Any.fromFunction0(isBrowsing), isInactive = js.Any.fromFunction0(isInactive), lastRecordIndex = lastRecordIndex.asInstanceOf[js.Any], rebuild = js.Any.fromFunction2(rebuild), reset = js.Any.fromFunction0(reset), resync = js.Any.fromFunction0(resync), resyncRecord = js.Any.fromFunction1(resyncRecord), setEditingRecBuffer = js.Any.fromFunction1(setEditingRecBuffer), setFieldRecordBuffer = js.Any.fromFunction3(setFieldRecordBuffer), setState = js.Any.fromFunction1(setState), stateModified = stateModified.asInstanceOf[js.Any], state_ = state_.asInstanceOf[js.Any], syncBookmarkAfterInsert = syncBookmarkAfterInsert.asInstanceOf[js.Any], updateBufferProperties = js.Any.fromFunction2(updateBufferProperties))
      __obj.asInstanceOf[TableViewBuffer]
    }
    
    extension [Self <: TableViewBuffer](x: Self) {
      
      inline def setBuffer(value: js.Array[Any]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferVarargs(value: Any*): Self = StObject.set(x, "buffer", js.Array(value*))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClientBufferIndex(value: Any): Self = StObject.set(x, "clientBufferIndex", value.asInstanceOf[js.Any])
      
      inline def setCreateRecordBuffer(value: (Any, Any) => Unit): Self = StObject.set(x, "createRecordBuffer", js.Any.fromFunction2(value))
      
      inline def setEditedRecBuffer(value: Any): Self = StObject.set(x, "editedRecBuffer", value.asInstanceOf[js.Any])
      
      inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingOrInserting(value: Boolean): Self = StObject.set(x, "editingOrInserting", value.asInstanceOf[js.Any])
      
      inline def setFEditingRecBuffer(value: Any): Self = StObject.set(x, "fEditingRecBuffer", value.asInstanceOf[js.Any])
      
      inline def setGetEditingRecBuffer(value: () => Any): Self = StObject.set(x, "getEditingRecBuffer", js.Any.fromFunction0(value))
      
      inline def setGetLastUsedBufferIndex(value: Any): Self = StObject.set(x, "getLastUsedBufferIndex", value.asInstanceOf[js.Any])
      
      inline def setGetRecordBufferByRecNo(value: Any => Any): Self = StObject.set(x, "getRecordBufferByRecNo", js.Any.fromFunction1(value))
      
      inline def setGetState(value: () => Double): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setIsBrowsing(value: () => Boolean): Self = StObject.set(x, "isBrowsing", js.Any.fromFunction0(value))
      
      inline def setIsInactive(value: () => Boolean): Self = StObject.set(x, "isInactive", js.Any.fromFunction0(value))
      
      inline def setLastRecordIndex(value: Double): Self = StObject.set(x, "lastRecordIndex", value.asInstanceOf[js.Any])
      
      inline def setRebuild(value: (Any, Any) => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction2(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setResync(value: () => Unit): Self = StObject.set(x, "resync", js.Any.fromFunction0(value))
      
      inline def setResyncRecord(value: Any => Unit): Self = StObject.set(x, "resyncRecord", js.Any.fromFunction1(value))
      
      inline def setSetEditingRecBuffer(value: Any => Unit): Self = StObject.set(x, "setEditingRecBuffer", js.Any.fromFunction1(value))
      
      inline def setSetFieldRecordBuffer(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "setFieldRecordBuffer", js.Any.fromFunction3(value))
      
      inline def setSetState(value: Double => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      inline def setStateModified(value: Boolean): Self = StObject.set(x, "stateModified", value.asInstanceOf[js.Any])
      
      inline def setState_(value: Any): Self = StObject.set(x, "state_", value.asInstanceOf[js.Any])
      
      inline def setSyncBookmarkAfterInsert(value: Boolean): Self = StObject.set(x, "syncBookmarkAfterInsert", value.asInstanceOf[js.Any])
      
      inline def setUpdateBufferProperties(value: (Any, Any) => Unit): Self = StObject.set(x, "updateBufferProperties", js.Any.fromFunction2(value))
      
      inline def set_grid(value: Any): Self = StObject.set(x, "_grid", value.asInstanceOf[js.Any])
      
      inline def set_searchRecordBufferByRecNo(value: Any): Self = StObject.set(x, "_searchRecordBufferByRecNo", value.asInstanceOf[js.Any])
    }
  }
}
