package typings.nginstackEngine

import typings.nginstackEngine.nginstackEngineStrings.`object`
import typings.nginstackEngine.nginstackEngineStrings.bigint
import typings.nginstackEngine.nginstackEngineStrings.boolean
import typings.nginstackEngine.nginstackEngineStrings.function
import typings.nginstackEngine.nginstackEngineStrings.number
import typings.nginstackEngine.nginstackEngineStrings.string
import typings.nginstackEngine.nginstackEngineStrings.symbol
import typings.nginstackEngine.nginstackEngineStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionArgsMod {
  
  inline def apply(args: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/function/Args", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Args {
    def this(args: Any) = this()
    
    /* private */ /* CompleteClass */
    var _checkRequired: Any = js.native
    
    /* CompleteClass */
    override def _validBoolean(index: Any, value: Any): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var _validDate: Any = js.native
    
    /* private */ /* CompleteClass */
    var _validFile: Any = js.native
    
    /* private */ /* CompleteClass */
    var _validInteger: Any = js.native
    
    /* private */ /* CompleteClass */
    var _validNumber: Any = js.native
    
    /* private */ /* CompleteClass */
    var _validObject: Any = js.native
    
    /* private */ /* CompleteClass */
    var _validParameter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _validString: Any = js.native
    
    /* CompleteClass */
    var arguments: Any = js.native
    
    /* CompleteClass */
    override def getArray(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getBoolean(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getConnection(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getDataSet(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getDate(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getFile(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getInteger(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getLength(): Any = js.native
    
    /* CompleteClass */
    override def getNumber(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getObject(index: Any, functionClass: Any, args: Any*): Any = js.native
    
    /* CompleteClass */
    override def getOptionalArray(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalBoolean(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalConnection(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalDataSet(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalDate(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalFile(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalInteger(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalNumber(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getOptionalObject(index: Any, functionClass: Any, defaultValue: Any, args: Any*): Any = js.native
    
    /* CompleteClass */
    override def getOptionalString(index: Any, defaultValue: Any): Any = js.native
    
    /* CompleteClass */
    override def getString(index: Any): Any = js.native
    
    /* CompleteClass */
    override def getTypeOf(index: Any): string | number | bigint | boolean | symbol | undefined | `object` | function = js.native
    
    /* CompleteClass */
    override def isInstanceOf(index: Any, functionClass: Any): Boolean = js.native
  }
  @JSImport("@nginstack/engine/lib/function/Args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Args extends StObject {
    
    /* private */ var _checkRequired: Any
    
    def _validBoolean(index: Any, value: Any): Boolean
    
    /* private */ var _validDate: Any
    
    /* private */ var _validFile: Any
    
    /* private */ var _validInteger: Any
    
    /* private */ var _validNumber: Any
    
    /* private */ var _validObject: Any
    
    /* private */ var _validParameter: Any
    
    /* private */ var _validString: Any
    
    var arguments: Any
    
    def getArray(index: Any): Any
    
    def getBoolean(index: Any): Any
    
    def getConnection(index: Any): Any
    
    def getDataSet(index: Any): Any
    
    def getDate(index: Any): Any
    
    def getFile(index: Any): Any
    
    def getInteger(index: Any): Any
    
    def getLength(): Any
    
    def getNumber(index: Any): Any
    
    def getObject(index: Any, functionClass: Any, args: Any*): Any
    
    def getOptionalArray(index: Any, defaultValue: Any): Any
    
    def getOptionalBoolean(index: Any, defaultValue: Any): Any
    
    def getOptionalConnection(index: Any, defaultValue: Any): Any
    
    def getOptionalDataSet(index: Any, defaultValue: Any): Any
    
    def getOptionalDate(index: Any, defaultValue: Any): Any
    
    def getOptionalFile(index: Any, defaultValue: Any): Any
    
    def getOptionalInteger(index: Any, defaultValue: Any): Any
    
    def getOptionalNumber(index: Any, defaultValue: Any): Any
    
    def getOptionalObject(index: Any, functionClass: Any, defaultValue: Any, args: Any*): Any
    
    def getOptionalString(index: Any, defaultValue: Any): Any
    
    def getString(index: Any): Any
    
    def getTypeOf(index: Any): string | number | bigint | boolean | symbol | undefined | `object` | function
    
    def isInstanceOf(index: Any, functionClass: Any): Boolean
  }
  object Args {
    
    inline def apply(
      _checkRequired: Any,
      _validBoolean: (Any, Any) => Boolean,
      _validDate: Any,
      _validFile: Any,
      _validInteger: Any,
      _validNumber: Any,
      _validObject: Any,
      _validParameter: Any,
      _validString: Any,
      arguments: Any,
      getArray: Any => Any,
      getBoolean: Any => Any,
      getConnection: Any => Any,
      getDataSet: Any => Any,
      getDate: Any => Any,
      getFile: Any => Any,
      getInteger: Any => Any,
      getLength: () => Any,
      getNumber: Any => Any,
      getObject: (Any, Any, /* repeated */ Any) => Any,
      getOptionalArray: (Any, Any) => Any,
      getOptionalBoolean: (Any, Any) => Any,
      getOptionalConnection: (Any, Any) => Any,
      getOptionalDataSet: (Any, Any) => Any,
      getOptionalDate: (Any, Any) => Any,
      getOptionalFile: (Any, Any) => Any,
      getOptionalInteger: (Any, Any) => Any,
      getOptionalNumber: (Any, Any) => Any,
      getOptionalObject: (Any, Any, Any, /* repeated */ Any) => Any,
      getOptionalString: (Any, Any) => Any,
      getString: Any => Any,
      getTypeOf: Any => string | number | bigint | boolean | symbol | undefined | `object` | function,
      isInstanceOf: (Any, Any) => Boolean
    ): Args = {
      val __obj = js.Dynamic.literal(_checkRequired = _checkRequired.asInstanceOf[js.Any], _validBoolean = js.Any.fromFunction2(_validBoolean), _validDate = _validDate.asInstanceOf[js.Any], _validFile = _validFile.asInstanceOf[js.Any], _validInteger = _validInteger.asInstanceOf[js.Any], _validNumber = _validNumber.asInstanceOf[js.Any], _validObject = _validObject.asInstanceOf[js.Any], _validParameter = _validParameter.asInstanceOf[js.Any], _validString = _validString.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any], getArray = js.Any.fromFunction1(getArray), getBoolean = js.Any.fromFunction1(getBoolean), getConnection = js.Any.fromFunction1(getConnection), getDataSet = js.Any.fromFunction1(getDataSet), getDate = js.Any.fromFunction1(getDate), getFile = js.Any.fromFunction1(getFile), getInteger = js.Any.fromFunction1(getInteger), getLength = js.Any.fromFunction0(getLength), getNumber = js.Any.fromFunction1(getNumber), getObject = js.Any.fromFunction3(getObject), getOptionalArray = js.Any.fromFunction2(getOptionalArray), getOptionalBoolean = js.Any.fromFunction2(getOptionalBoolean), getOptionalConnection = js.Any.fromFunction2(getOptionalConnection), getOptionalDataSet = js.Any.fromFunction2(getOptionalDataSet), getOptionalDate = js.Any.fromFunction2(getOptionalDate), getOptionalFile = js.Any.fromFunction2(getOptionalFile), getOptionalInteger = js.Any.fromFunction2(getOptionalInteger), getOptionalNumber = js.Any.fromFunction2(getOptionalNumber), getOptionalObject = js.Any.fromFunction4(getOptionalObject), getOptionalString = js.Any.fromFunction2(getOptionalString), getString = js.Any.fromFunction1(getString), getTypeOf = js.Any.fromFunction1(getTypeOf), isInstanceOf = js.Any.fromFunction2(isInstanceOf))
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setGetArray(value: Any => Any): Self = StObject.set(x, "getArray", js.Any.fromFunction1(value))
      
      inline def setGetBoolean(value: Any => Any): Self = StObject.set(x, "getBoolean", js.Any.fromFunction1(value))
      
      inline def setGetConnection(value: Any => Any): Self = StObject.set(x, "getConnection", js.Any.fromFunction1(value))
      
      inline def setGetDataSet(value: Any => Any): Self = StObject.set(x, "getDataSet", js.Any.fromFunction1(value))
      
      inline def setGetDate(value: Any => Any): Self = StObject.set(x, "getDate", js.Any.fromFunction1(value))
      
      inline def setGetFile(value: Any => Any): Self = StObject.set(x, "getFile", js.Any.fromFunction1(value))
      
      inline def setGetInteger(value: Any => Any): Self = StObject.set(x, "getInteger", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Any): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      inline def setGetNumber(value: Any => Any): Self = StObject.set(x, "getNumber", js.Any.fromFunction1(value))
      
      inline def setGetObject(value: (Any, Any, /* repeated */ Any) => Any): Self = StObject.set(x, "getObject", js.Any.fromFunction3(value))
      
      inline def setGetOptionalArray(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalArray", js.Any.fromFunction2(value))
      
      inline def setGetOptionalBoolean(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalBoolean", js.Any.fromFunction2(value))
      
      inline def setGetOptionalConnection(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalConnection", js.Any.fromFunction2(value))
      
      inline def setGetOptionalDataSet(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalDataSet", js.Any.fromFunction2(value))
      
      inline def setGetOptionalDate(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalDate", js.Any.fromFunction2(value))
      
      inline def setGetOptionalFile(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalFile", js.Any.fromFunction2(value))
      
      inline def setGetOptionalInteger(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalInteger", js.Any.fromFunction2(value))
      
      inline def setGetOptionalNumber(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalNumber", js.Any.fromFunction2(value))
      
      inline def setGetOptionalObject(value: (Any, Any, Any, /* repeated */ Any) => Any): Self = StObject.set(x, "getOptionalObject", js.Any.fromFunction4(value))
      
      inline def setGetOptionalString(value: (Any, Any) => Any): Self = StObject.set(x, "getOptionalString", js.Any.fromFunction2(value))
      
      inline def setGetString(value: Any => Any): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
      
      inline def setGetTypeOf(value: Any => string | number | bigint | boolean | symbol | undefined | `object` | function): Self = StObject.set(x, "getTypeOf", js.Any.fromFunction1(value))
      
      inline def setIsInstanceOf(value: (Any, Any) => Boolean): Self = StObject.set(x, "isInstanceOf", js.Any.fromFunction2(value))
      
      inline def set_checkRequired(value: Any): Self = StObject.set(x, "_checkRequired", value.asInstanceOf[js.Any])
      
      inline def set_validBoolean(value: (Any, Any) => Boolean): Self = StObject.set(x, "_validBoolean", js.Any.fromFunction2(value))
      
      inline def set_validDate(value: Any): Self = StObject.set(x, "_validDate", value.asInstanceOf[js.Any])
      
      inline def set_validFile(value: Any): Self = StObject.set(x, "_validFile", value.asInstanceOf[js.Any])
      
      inline def set_validInteger(value: Any): Self = StObject.set(x, "_validInteger", value.asInstanceOf[js.Any])
      
      inline def set_validNumber(value: Any): Self = StObject.set(x, "_validNumber", value.asInstanceOf[js.Any])
      
      inline def set_validObject(value: Any): Self = StObject.set(x, "_validObject", value.asInstanceOf[js.Any])
      
      inline def set_validParameter(value: Any): Self = StObject.set(x, "_validParameter", value.asInstanceOf[js.Any])
      
      inline def set_validString(value: Any): Self = StObject.set(x, "_validString", value.asInstanceOf[js.Any])
    }
  }
}
