package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.GridName
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridFieldMod {
  
  inline def apply(name: String, `type`: String, size: Double, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(name: String, `type`: String, size: Null, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/GridField", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridField {
    def this(name: String, `type`: String, size: Double, args: Any*) = this()
    def this(name: String, `type`: String, size: Null, args: Any*) = this()
  }
  @JSImport("@nginstack/web-framework/lib/grid/GridField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait GridField extends StObject {
    
    /* private */ var _checkInformedFields: Any = js.native
    
    /* protected */ def _checkSaveInputAsDefault(context: GridName): Unit = js.native
    
    /* private */ var _configWidth: Any = js.native
    
    /* private */ var _readOnlyChangedByGrid: Any = js.native
    
    /* private */ var _tableViewWidth: Any = js.native
    
    /* private */ var _width: Any = js.native
    
    var alignment: Any = js.native
    
    /* private */ var appendInTreeStructure: Any = js.native
    
    /* private */ var beforeValue: Any = js.native
    
    /* private */ var calc: Any = js.native
    
    var canModify: Boolean = js.native
    
    var changed: Any = js.native
    
    /* private */ var checkIfCanModify_ : Any = js.native
    
    /* private */ var checkValueError: Any = js.native
    
    /* private */ var clientCanModify: Any = js.native
    
    /* private */ var clientValue: Any = js.native
    
    /* private */ var dbCacheKeyExists_ : Any = js.native
    
    /* private */ var defaultLookupMultipleInsertListener_ : Any = js.native
    
    /* private */ var dispatchEvent: Any = js.native
    
    var dsOriginalTree: Any = js.native
    
    var dsTreeIndexSuffix: String = js.native
    
    var dsTreeStructure: typings.nginstackEngine.dataSetMod.^ = js.native
    
    def emit(event: Any, args: Any*): Any = js.native
    
    /* private */ var fieldIndexCache: Any = js.native
    
    var fieldIndexesToTreeSync: js.Array[Any] = js.native
    
    /* private */ var fillFirstValue: Any = js.native
    
    var fillingFirstValue: Boolean = js.native
    
    def focus(): Unit = js.native
    
    /* private */ var getComboDisplay: Any = js.native
    
    /* private */ var getComboOptionDisplay: Any = js.native
    
    def getComboValue(value: Any): Double | (Record[Any, Any]) = js.native
    
    /* private */ var getFileDisplay: Any = js.native
    
    /* private */ var getLookupDisplay: Any = js.native
    
    /* private */ var getNextEditableFieldAtView: Any = js.native
    
    /* private */ var getNextFieldAtView: Any = js.native
    
    /* private */ var getPriorEditableFieldAtView: Any = js.native
    
    /* private */ var getPriorFieldAtView: Any = js.native
    
    def getSavedValue(context: GridName): Any = js.native
    
    /* private */ var getUserInformedProperty: Any = js.native
    
    def getValue(): Any = js.native
    
    /* private */ var getWriteInformation: Any = js.native
    
    var grid: Any = js.native
    
    /* private */ var handleActions: Any = js.native
    
    /* private */ var handleDispatchBlurEvent: Any = js.native
    
    /* private */ var handleDispatchFocusEvent: Any = js.native
    
    /* private */ var handleFieldActionsFunctions: Any = js.native
    
    /* private */ var handleOpenKey: Any = js.native
    
    var height: Any = js.native
    
    var inSetValue: Boolean = js.native
    
    /* private */ var lastDBCacheRefresh_ : Any = js.native
    
    /* private */ var loadSavedProfileValues: Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def lookup(): Unit = js.native
    
    /* private */ var notFoundKeysCache_ : Any = js.native
    
    /* private */ var prepareTreeView: Any = js.native
    
    /* private */ var refreshClientValue: Any = js.native
    
    /* private */ var removeClassEvents: Any = js.native
    
    /* private */ var requiresFilling: Any = js.native
    
    var resyncPending: Boolean = js.native
    
    def setValue(value: Any, args: Any*): Unit = js.native
    
    def setValueOnly(value: Any): Unit = js.native
    
    /* private */ var tree: Any = js.native
    
    /* private */ var validateClassFieldChange_ : Any = js.native
    
    def validateInput(value: String): Any = js.native
    def validateInput(value: js.Date): Any = js.native
    def validateInput(value: Boolean): Any = js.native
    def validateInput(value: Double): Any = js.native
    
    /* private */ var validateLookupLicenseDependencies_ : Any = js.native
    
    var value: Any = js.native
    
    /* private */ var valueToClientValue: Any = js.native
    
    /* private */ var valueToServerValue: Any = js.native
    
    /* private */ var visibleAtView: Any = js.native
    
    /* private */ var write: Any = js.native
    
    /* private */ var written_ : Any = js.native
  }
  
  type LookupMultipleInsertEvent = typings.nginstackWebFramework.lookupMultipleInsertEventMod.^
}
