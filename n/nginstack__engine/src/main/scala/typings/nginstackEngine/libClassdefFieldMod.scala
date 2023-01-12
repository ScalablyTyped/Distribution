package typings.nginstackEngine

import typings.nginstackEngine.anon.AFTERINSERT
import typings.nginstackEngine.anon.BIGINT
import typings.nginstackEngine.anon.BOOLEAN
import typings.nginstackEngine.anon.DDD
import typings.nginstackEngine.anon.DDDDDDDD
import typings.nginstackEngine.anon.DDMM
import typings.nginstackEngine.anon.DELETE
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldMod {
  
  inline def apply(name: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(name: String, `type`: String, opt_size: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], opt_size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/Field", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Field {
    def this(name: String, `type`: String) = this()
    def this(name: String, `type`: String, opt_size: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/classdef/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AdapterDescriptor = typings.nginstackEngine.libEventAdapterDescriptorMod.^
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  @js.native
  trait Field extends StObject {
    
    /* private */ var _changedObjectsProperties: Any = js.native
    
    /* protected */ def _getArrayFromList(list: Any): Any = js.native
    
    /* protected */ def _notifyObjectPropertyChange(name: String): Unit = js.native
    
    /* private */ var _ownControlledProperties: Any = js.native
    
    /* private */ var _propertiesToAssign: Any = js.native
    
    /* protected */ def adaptEvent_(name: String, descriptor: AdapterDescriptor): Unit = js.native
    /* protected */ def adaptEvent_(name: String, descriptor: Record[Any, Any]): Unit = js.native
    
    def assign(field: Field): Unit = js.native
    
    def assignObjectsTo(field: Any): Unit = js.native
    
    def assignTo(field: Field): Unit = js.native
    
    var autoSanitize: Boolean = js.native
    
    var autoTrim: Boolean = js.native
    
    var caseType: String = js.native
    
    /* protected */ def changeFieldType_(`type`: String, fieldName: String): Unit = js.native
    
    var charLength: Double | Null = js.native
    
    /* private */ var charLength_ : Any = js.native
    
    /* private */ var checkCoordinateRange_ : Any = js.native
    
    /* private */ var checkOptions_ : Any = js.native
    
    var classDef: Any = js.native
    
    var classKey: Double = js.native
    
    /* private */ var clearDataTypeAndSizeCache_ : Any = js.native
    
    def clone(NewClass: js.Function1[/* repeated */ Any, Unit]): Field = js.native
    
    var dataDictionary: Any = js.native
    
    var dataSetType: BOOLEAN = js.native
    
    /* private */ var dataSetType_ : Any = js.native
    
    var databaseType: BIGINT = js.native
    
    /* private */ var databaseType_ : Any = js.native
    
    var dateFormat: DDMM = js.native
    
    var decimalPrecision: Double = js.native
    
    /* private */ var defaultAdapterDescriptor_ : Any = js.native
    
    /* private */ var defaultDisplayFormats_ : Any = js.native
    
    var defaultValue: Any = js.native
    
    var detailFieldNames: String = js.native
    
    var detailFilter: String = js.native
    
    var displayFormat: DDMM | DDDDDDDD | DDD = js.native
    
    /* private */ var getIntegerDatabaseType_ : Any = js.native
    
    var group: typings.nginstackEngine.libClassdefFieldGroupMod.^ = js.native
    
    /* private */ var groupName: Any = js.native
    
    var help: String = js.native
    
    /* protected */ var inheritedClassDefEvents_ : js.Array[String] = js.native
    
    /* protected */ def init_(name: String, `type`: String): Unit = js.native
    /* protected */ def init_(name: String, `type`: String, opt_size: Double): Unit = js.native
    
    var integrityCheck: Boolean = js.native
    
    def isBoolean(): Boolean = js.native
    
    var isClassLookup: Boolean = js.native
    
    def isCombo(): Boolean = js.native
    
    var isDataBaseField: Boolean = js.native
    
    var isDatabaseField: Boolean = js.native
    
    def isDate(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isInt32(): Boolean = js.native
    
    def isInt64(): Boolean = js.native
    
    def isInteger(): Boolean = js.native
    
    def isMasterDetail(): Boolean = js.native
    
    def isMemo(): Boolean = js.native
    
    def isNumber(): Boolean = js.native
    
    def isPassword(): Boolean = js.native
    
    def isString(): Boolean = js.native
    
    def isTime(): Boolean = js.native
    
    var label: String = js.native
    
    /* protected */ def loadClassDefIfNeeded_(): Unit = js.native
    
    var lookupType: Double = js.native
    
    var lowerName: String = js.native
    
    var masterDeleteAction: DELETE = js.native
    
    var masterFieldNames: String = js.native
    
    var max: Double | js.Date = js.native
    
    var maxDecimalPrecision: Double = js.native
    
    var min: Double | js.Date = js.native
    
    var minDecimalPrecision: Double = js.native
    
    var multiple: Boolean = js.native
    
    var name: String = js.native
    
    var onAfterChange: Event = js.native
    
    var onAfterLookupAddResult: Event = js.native
    
    var onBeforeChange: Event = js.native
    
    var onBeforeLookupAddResult: Event = js.native
    
    var onGetOptions: Event = js.native
    
    var onLookupAddResult: Event = js.native
    
    var onLookupDisplay: Event = js.native
    
    var onValidate: Event = js.native
    
    var options: js.Array[js.Array[Any]] = js.native
    
    /* private */ var options_ : Any = js.native
    
    var order: Double = js.native
    
    var permissionFilterFieldName: String = js.native
    
    var rangeLimit: Limit = js.native
    
    var readOnly: AFTERINSERT | Boolean = js.native
    
    /* protected */ def registerEvents_(): Unit = js.native
    
    var required: Boolean = js.native
    
    var size: Double = js.native
    
    var stringIfTrue: String = js.native
    
    /* private */ @JSName("toString")
    var toString_FField: Any = js.native
    
    var `type`: String = js.native
    
    /* private */ var type_ : Any = js.native
    
    /* protected */ var typesThatNotSupportUnderscoreAtName_ : Any = js.native
    
    /* private */ var updateDataTypeAndSize_ : Any = js.native
    
    var upperName: String = js.native
    
    var userCanChangeNegativeKey: Boolean = js.native
    
    def validateValue(value: String): Any = js.native
    def validateValue(value: js.Date): Any = js.native
    def validateValue(value: Boolean): Any = js.native
    def validateValue(value: Double): Any = js.native
  }
  
  trait Limit extends StObject {
    
    var END: Double
    
    var START: Double
  }
  object Limit {
    
    inline def apply(END: Double, START: Double): Limit = {
      val __obj = js.Dynamic.literal(END = END.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      inline def setEND(value: Double): Self = StObject.set(x, "END", value.asInstanceOf[js.Any])
      
      inline def setSTART(value: Double): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    }
  }
}
