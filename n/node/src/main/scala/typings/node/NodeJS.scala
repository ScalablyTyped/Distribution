package typings.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.anon.End
import typings.node.anon.FnCallSRadix
import typings.node.anon.FnCallUriComponent
import typings.node.anon.Paths
import typings.node.anon.TypeofBuffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.nodeStrings.get
import typings.node.nodeStrings.set
import typings.std.ArrayBufferConstructor
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DataView
import typings.std.DataViewConstructor
import typings.std.DateConstructor
import typings.std.Error
import typings.std.EvalError
import typings.std.EvalErrorConstructor
import typings.std.Float32Array
import typings.std.Float32ArrayConstructor
import typings.std.Float64Array
import typings.std.Float64ArrayConstructor
import typings.std.FunctionConstructor
import typings.std.Int16Array
import typings.std.Int16ArrayConstructor
import typings.std.Int32Array
import typings.std.Int32ArrayConstructor
import typings.std.Int8Array
import typings.std.Int8ArrayConstructor
import typings.std.JSON
import typings.std.MapConstructor
import typings.std.Math
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.PromiseConstructor
import typings.std.RangeErrorConstructor
import typings.std.ReferenceError
import typings.std.ReferenceErrorConstructor
import typings.std.RegExpConstructor
import typings.std.SetConstructor
import typings.std.StringConstructor
import typings.std.SyntaxErrorConstructor
import typings.std.TypeError
import typings.std.TypeErrorConstructor
import typings.std.URIError
import typings.std.URIErrorConstructor
import typings.std.Uint16Array
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32Array
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8Array
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArray
import typings.std.Uint8ClampedArrayConstructor
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*----------------------------------------------*
*                                               *
*               GLOBAL INTERFACES               *
*                                               *
*-----------------------------------------------*/
object NodeJS {
  
  type ArrayBufferView = TypedArray | DataView
  
  trait CallSite extends StObject {
    
    /**
      * Current column number [if this function was defined in a script]
      */
    def getColumnNumber(): Double | Null
    
    /**
      * A call site object representing the location where eval was called
      * [if this function was created using a call to eval]
      */
    def getEvalOrigin(): js.UndefOr[java.lang.String]
    
    /**
      * Name of the script [if this function was defined in a script]
      */
    def getFileName(): java.lang.String | Null
    
    /**
      * Current function
      */
    def getFunction(): js.UndefOr[js.Function]
    
    /**
      * Name of the current function, typically its name property.
      * If a name property is not available an attempt will be made to try
      * to infer a name from the function's context.
      */
    def getFunctionName(): java.lang.String | Null
    
    /**
      * Current line number [if this function was defined in a script]
      */
    def getLineNumber(): Double | Null
    
    /**
      * Name of the property [of "this" or one of its prototypes] that holds
      * the current function
      */
    def getMethodName(): java.lang.String | Null
    
    /**
      * Value of "this"
      */
    def getThis(): js.Any
    
    /**
      * Type of "this" as a string.
      * This is the name of the function stored in the constructor field of
      * "this", if available.  Otherwise the object's [[Class]] internal
      * property.
      */
    def getTypeName(): java.lang.String | Null
    
    /**
      * Is this a constructor call?
      */
    def isConstructor(): Boolean
    
    /**
      * Does this call take place in code defined by a call to eval?
      */
    def isEval(): Boolean
    
    /**
      * Is this call in native V8 code?
      */
    def isNative(): Boolean
    
    /**
      * Is this a toplevel invocation, that is, is "this" the global object?
      */
    def isToplevel(): Boolean
  }
  object CallSite {
    
    inline def apply(
      getColumnNumber: () => Double | Null,
      getEvalOrigin: () => js.UndefOr[java.lang.String],
      getFileName: () => java.lang.String | Null,
      getFunction: () => js.UndefOr[js.Function],
      getFunctionName: () => java.lang.String | Null,
      getLineNumber: () => Double | Null,
      getMethodName: () => java.lang.String | Null,
      getThis: () => js.Any,
      getTypeName: () => java.lang.String | Null,
      isConstructor: () => Boolean,
      isEval: () => Boolean,
      isNative: () => Boolean,
      isToplevel: () => Boolean
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
      __obj.asInstanceOf[CallSite]
    }
    
    extension [Self <: CallSite](x: Self) {
      
      inline def setGetColumnNumber(value: () => Double | Null): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      inline def setGetEvalOrigin(value: () => js.UndefOr[java.lang.String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      inline def setGetFileName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      inline def setGetFunction(value: () => js.UndefOr[js.Function]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      inline def setGetFunctionName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      inline def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      inline def setGetMethodName(value: () => java.lang.String | Null): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      inline def setGetThis(value: () => js.Any): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      inline def setGetTypeName(value: () => java.lang.String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      inline def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      inline def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      inline def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      inline def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
  
  type Dict[T] = StringDictionary[js.UndefOr[T]]
  
  trait ErrnoException
    extends StObject
       with Error {
    
    var code: js.UndefOr[java.lang.String] = js.undefined
    
    var errno: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    var syscall: js.UndefOr[java.lang.String] = js.undefined
  }
  object ErrnoException {
    
    inline def apply(message: java.lang.String, name: java.lang.String): ErrnoException = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrnoException]
    }
    
    extension [Self <: ErrnoException](x: Self) {
      
      inline def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      inline def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
      
      inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSyscall(value: java.lang.String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
      
      inline def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
    }
  }
  
  trait Global extends StObject {
    
    def Array(): js.Array[js.Any]
    def Array(arrayLength: Double): js.Array[js.Any]
    def Array[T](items: T*): js.Array[T]
    
    var ArrayBuffer: ArrayBufferConstructor
    
    @JSName("Array")
    var Array_Original: ArrayConstructor
    @JSName("Array")
    def Array_T[T](arrayLength: Double): js.Array[T]
    
    def Boolean[T](): scala.Boolean
    def Boolean[T](value: T): scala.Boolean
    @JSName("Boolean")
    var Boolean_Original: BooleanConstructor
    
    var Buffer: TypeofBuffer & (Instantiable2[
        /* str */ java.lang.String, 
        /* encoding */ js.UndefOr[BufferEncoding], 
        typings.node.Buffer
      ])
    
    var DataView: DataViewConstructor
    
    def Date(): java.lang.String
    @JSName("Date")
    var Date_Original: DateConstructor
    
    def Error(): typings.std.Error
    def Error(message: java.lang.String): typings.std.Error
    @JSName("Error")
    var Error_Original: typings.std.ErrorConstructor
    
    def EvalError(): Error
    def EvalError(message: java.lang.String): Error
    @JSName("EvalError")
    def EvalError_EvalError(): EvalError
    @JSName("EvalError")
    def EvalError_EvalError(message: java.lang.String): EvalError
    @JSName("EvalError")
    var EvalError_Original: EvalErrorConstructor
    
    var Float32Array: Float32ArrayConstructor
    
    var Float64Array: Float64ArrayConstructor
    
    def Function(args: java.lang.String*): js.Function
    @JSName("Function")
    var Function_Original: FunctionConstructor
    
    var Infinity: Double
    
    var Int16Array: Int16ArrayConstructor
    
    var Int32Array: Int32ArrayConstructor
    
    var Int8Array: Int8ArrayConstructor
    
    var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any
    
    var JSON: typings.std.JSON
    
    var Map: MapConstructor
    
    var Math: typings.std.Math
    
    var NaN: Double
    
    def Number(): Double
    def Number(value: js.Any): Double
    @JSName("Number")
    var Number_Original: NumberConstructor
    
    def Object(): js.Any
    def Object(value: js.Any): js.Any
    @JSName("Object")
    var Object_Original: ObjectConstructor
    
    var Promise: PromiseConstructor
    
    def RangeError(): typings.std.RangeError
    def RangeError(message: java.lang.String): typings.std.RangeError
    @JSName("RangeError")
    def RangeError_Error(): Error
    @JSName("RangeError")
    def RangeError_Error(message: java.lang.String): Error
    @JSName("RangeError")
    var RangeError_Original: RangeErrorConstructor
    
    def ReferenceError(): Error
    def ReferenceError(message: java.lang.String): Error
    @JSName("ReferenceError")
    var ReferenceError_Original: ReferenceErrorConstructor
    @JSName("ReferenceError")
    def ReferenceError_ReferenceError(): ReferenceError
    @JSName("ReferenceError")
    def ReferenceError_ReferenceError(message: java.lang.String): ReferenceError
    
    def RegExp(pattern: java.lang.String): typings.std.RegExp
    def RegExp(pattern: java.lang.String, flags: java.lang.String): typings.std.RegExp
    def RegExp(pattern: typings.std.RegExp): typings.std.RegExp
    def RegExp(pattern: typings.std.RegExp, flags: java.lang.String): typings.std.RegExp
    @JSName("RegExp")
    var RegExp_Original: RegExpConstructor
    
    var Set: SetConstructor
    
    def String(): java.lang.String
    def String(value: js.Any): java.lang.String
    @JSName("String")
    var String_Original: StringConstructor
    
    var Symbol: js.Function
    
    def SyntaxError(): typings.std.SyntaxError
    def SyntaxError(message: java.lang.String): typings.std.SyntaxError
    @JSName("SyntaxError")
    def SyntaxError_Error(): Error
    @JSName("SyntaxError")
    def SyntaxError_Error(message: java.lang.String): Error
    @JSName("SyntaxError")
    var SyntaxError_Original: SyntaxErrorConstructor
    
    def TypeError(): Error
    def TypeError(message: java.lang.String): Error
    @JSName("TypeError")
    var TypeError_Original: TypeErrorConstructor
    @JSName("TypeError")
    def TypeError_TypeError(): TypeError
    @JSName("TypeError")
    def TypeError_TypeError(message: java.lang.String): TypeError
    
    def URIError(): Error
    def URIError(message: java.lang.String): Error
    @JSName("URIError")
    var URIError_Original: URIErrorConstructor
    @JSName("URIError")
    def URIError_URIError(): URIError
    @JSName("URIError")
    def URIError_URIError(message: java.lang.String): URIError
    
    var Uint16Array: Uint16ArrayConstructor
    
    var Uint32Array: Uint32ArrayConstructor
    
    var Uint8Array: Uint8ArrayConstructor
    
    var Uint8ClampedArray: Uint8ClampedArrayConstructor
    
    var WeakMap: WeakMapConstructor
    
    var WeakSet: WeakSetConstructor
    
    def clearImmediate(immediateId: Immediate): Unit
    
    def clearInterval(intervalId: Timeout): Unit
    
    def clearTimeout(timeoutId: Timeout): Unit
    
    def decodeURI(encodedURI: java.lang.String): java.lang.String
    
    def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String
    @JSName("decodeURIComponent")
    var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ java.lang.String, java.lang.String]
    
    @JSName("decodeURI")
    var decodeURI_Original: js.Function1[/* encodedURI */ java.lang.String, java.lang.String]
    
    def encodeURI(uri: java.lang.String): java.lang.String
    
    def encodeURIComponent(uriComponent: java.lang.String): java.lang.String
    def encodeURIComponent(uriComponent: Boolean): java.lang.String
    def encodeURIComponent(uriComponent: Double): java.lang.String
    @JSName("encodeURIComponent")
    var encodeURIComponent_Original: FnCallUriComponent
    
    @JSName("encodeURI")
    var encodeURI_Original: js.Function1[/* uri */ java.lang.String, java.lang.String]
    
    def escape(str: java.lang.String): java.lang.String
    
    def eval(x: java.lang.String): js.Any
    @JSName("eval")
    var eval_Original: js.Function1[/* x */ java.lang.String, js.Any]
    
    def gc(): Unit
    
    var global: Global
    
    def isFinite(number: Double): Boolean
    @JSName("isFinite")
    var isFinite_Original: js.Function1[/* number */ Double, Boolean]
    
    def isNaN(number: Double): Boolean
    @JSName("isNaN")
    var isNaN_Original: js.Function1[/* number */ Double, Boolean]
    
    def parseFloat(string: java.lang.String): Double
    @JSName("parseFloat")
    var parseFloat_Original: js.Function1[/* string */ java.lang.String, Double]
    
    def parseInt(s: java.lang.String): Double
    def parseInt(s: java.lang.String, radix: Double): Double
    @JSName("parseInt")
    var parseInt_Original: FnCallSRadix
    
    def queueMicrotask(callback: js.Function0[Unit]): Unit
    @JSName("queueMicrotask")
    var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit]
    
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate
    
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout
    
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout
    
    var undefined: Unit
    
    def unescape(str: java.lang.String): java.lang.String
    
    var v8debug: js.UndefOr[js.Any] = js.undefined
  }
  object Global {
    
    inline def apply(
      Array: ArrayConstructor,
      ArrayBuffer: ArrayBufferConstructor,
      Boolean: BooleanConstructor,
      Buffer: TypeofBuffer & (Instantiable2[/* str */ java.lang.String, /* encoding */ js.UndefOr[BufferEncoding], Buffer]),
      DataView: DataViewConstructor,
      Date: DateConstructor,
      Error: typings.std.ErrorConstructor,
      EvalError: EvalErrorConstructor,
      Float32Array: Float32ArrayConstructor,
      Float64Array: Float64ArrayConstructor,
      Function: FunctionConstructor,
      Infinity: Double,
      Int16Array: Int16ArrayConstructor,
      Int32Array: Int32ArrayConstructor,
      Int8Array: Int8ArrayConstructor,
      Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any,
      JSON: JSON,
      Map: MapConstructor,
      Math: Math,
      NaN: Double,
      Number: NumberConstructor,
      Object: ObjectConstructor,
      Promise: PromiseConstructor,
      RangeError: RangeErrorConstructor,
      ReferenceError: ReferenceErrorConstructor,
      RegExp: RegExpConstructor,
      Set: SetConstructor,
      String: StringConstructor,
      Symbol: js.Function,
      SyntaxError: SyntaxErrorConstructor,
      TypeError: TypeErrorConstructor,
      URIError: URIErrorConstructor,
      Uint16Array: Uint16ArrayConstructor,
      Uint32Array: Uint32ArrayConstructor,
      Uint8Array: Uint8ArrayConstructor,
      Uint8ClampedArray: Uint8ClampedArrayConstructor,
      WeakMap: WeakMapConstructor,
      WeakSet: WeakSetConstructor,
      clearImmediate: Immediate => Unit,
      clearInterval: Timeout => Unit,
      clearTimeout: Timeout => Unit,
      decodeURI: /* encodedURI */ java.lang.String => java.lang.String,
      decodeURIComponent: /* encodedURIComponent */ java.lang.String => java.lang.String,
      encodeURI: /* uri */ java.lang.String => java.lang.String,
      encodeURIComponent: FnCallUriComponent,
      escape: java.lang.String => java.lang.String,
      eval: /* x */ java.lang.String => js.Any,
      gc: () => Unit,
      global: Global,
      isFinite: /* number */ Double => Boolean,
      isNaN: /* number */ Double => Boolean,
      parseFloat: /* string */ java.lang.String => Double,
      parseInt: FnCallSRadix,
      queueMicrotask: /* callback */ js.Function0[Unit] => Unit,
      setImmediate: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Immediate,
      setInterval: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timeout,
      setTimeout: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timeout,
      undefined: Unit,
      unescape: java.lang.String => java.lang.String
    ): Global = {
      val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Buffer = Buffer.asInstanceOf[js.Any], DataView = DataView.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], EvalError = EvalError.asInstanceOf[js.Any], Float32Array = Float32Array.asInstanceOf[js.Any], Float64Array = Float64Array.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Infinity = Infinity.asInstanceOf[js.Any], Int16Array = Int16Array.asInstanceOf[js.Any], Int32Array = Int32Array.asInstanceOf[js.Any], Int8Array = Int8Array.asInstanceOf[js.Any], Intl = Intl.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Math = Math.asInstanceOf[js.Any], NaN = NaN.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Promise = Promise.asInstanceOf[js.Any], RangeError = RangeError.asInstanceOf[js.Any], ReferenceError = ReferenceError.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Set = Set.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Symbol = Symbol.asInstanceOf[js.Any], SyntaxError = SyntaxError.asInstanceOf[js.Any], TypeError = TypeError.asInstanceOf[js.Any], URIError = URIError.asInstanceOf[js.Any], Uint16Array = Uint16Array.asInstanceOf[js.Any], Uint32Array = Uint32Array.asInstanceOf[js.Any], Uint8Array = Uint8Array.asInstanceOf[js.Any], Uint8ClampedArray = Uint8ClampedArray.asInstanceOf[js.Any], WeakMap = WeakMap.asInstanceOf[js.Any], WeakSet = WeakSet.asInstanceOf[js.Any], clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), decodeURI = js.Any.fromFunction1(decodeURI), decodeURIComponent = js.Any.fromFunction1(decodeURIComponent), encodeURI = js.Any.fromFunction1(encodeURI), encodeURIComponent = encodeURIComponent.asInstanceOf[js.Any], escape = js.Any.fromFunction1(escape), eval = js.Any.fromFunction1(eval), gc = js.Any.fromFunction0(gc), global = global.asInstanceOf[js.Any], isFinite = js.Any.fromFunction1(isFinite), isNaN = js.Any.fromFunction1(isNaN), parseFloat = js.Any.fromFunction1(parseFloat), parseInt = parseInt.asInstanceOf[js.Any], queueMicrotask = js.Any.fromFunction1(queueMicrotask), setImmediate = js.Any.fromFunction2(setImmediate), setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout), undefined = undefined.asInstanceOf[js.Any], unescape = js.Any.fromFunction1(unescape))
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setArray(value: ArrayConstructor): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
      
      inline def setArrayBuffer(value: ArrayBufferConstructor): Self = StObject.set(x, "ArrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setBoolean(value: BooleanConstructor): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
      
      inline def setBuffer(
        value: TypeofBuffer & (Instantiable2[/* str */ java.lang.String, /* encoding */ js.UndefOr[BufferEncoding], Buffer])
      ): Self = StObject.set(x, "Buffer", value.asInstanceOf[js.Any])
      
      inline def setClearImmediate(value: Immediate => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
      
      inline def setClearInterval(value: Timeout => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      inline def setClearTimeout(value: Timeout => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setDataView(value: DataViewConstructor): Self = StObject.set(x, "DataView", value.asInstanceOf[js.Any])
      
      inline def setDate(value: DateConstructor): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setDecodeURI(value: /* encodedURI */ java.lang.String => java.lang.String): Self = StObject.set(x, "decodeURI", js.Any.fromFunction1(value))
      
      inline def setDecodeURIComponent(value: /* encodedURIComponent */ java.lang.String => java.lang.String): Self = StObject.set(x, "decodeURIComponent", js.Any.fromFunction1(value))
      
      inline def setEncodeURI(value: /* uri */ java.lang.String => java.lang.String): Self = StObject.set(x, "encodeURI", js.Any.fromFunction1(value))
      
      inline def setEncodeURIComponent(value: FnCallUriComponent): Self = StObject.set(x, "encodeURIComponent", value.asInstanceOf[js.Any])
      
      inline def setError(value: typings.std.ErrorConstructor): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setEscape(value: java.lang.String => java.lang.String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setEval(value: /* x */ java.lang.String => js.Any): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
      
      inline def setEvalError(value: EvalErrorConstructor): Self = StObject.set(x, "EvalError", value.asInstanceOf[js.Any])
      
      inline def setFloat32Array(value: Float32ArrayConstructor): Self = StObject.set(x, "Float32Array", value.asInstanceOf[js.Any])
      
      inline def setFloat64Array(value: Float64ArrayConstructor): Self = StObject.set(x, "Float64Array", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: FunctionConstructor): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
      
      inline def setGc(value: () => Unit): Self = StObject.set(x, "gc", js.Any.fromFunction0(value))
      
      inline def setGlobal(value: Global): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setInfinity(value: Double): Self = StObject.set(x, "Infinity", value.asInstanceOf[js.Any])
      
      inline def setInt16Array(value: Int16ArrayConstructor): Self = StObject.set(x, "Int16Array", value.asInstanceOf[js.Any])
      
      inline def setInt32Array(value: Int32ArrayConstructor): Self = StObject.set(x, "Int32Array", value.asInstanceOf[js.Any])
      
      inline def setInt8Array(value: Int8ArrayConstructor): Self = StObject.set(x, "Int8Array", value.asInstanceOf[js.Any])
      
      inline def setIntl(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any): Self = StObject.set(x, "Intl", value.asInstanceOf[js.Any])
      
      inline def setIsFinite(value: /* number */ Double => Boolean): Self = StObject.set(x, "isFinite", js.Any.fromFunction1(value))
      
      inline def setIsNaN(value: /* number */ Double => Boolean): Self = StObject.set(x, "isNaN", js.Any.fromFunction1(value))
      
      inline def setJSON(value: JSON): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MapConstructor): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
      
      inline def setMath(value: Math): Self = StObject.set(x, "Math", value.asInstanceOf[js.Any])
      
      inline def setNaN(value: Double): Self = StObject.set(x, "NaN", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: NumberConstructor): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ObjectConstructor): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setParseFloat(value: /* string */ java.lang.String => Double): Self = StObject.set(x, "parseFloat", js.Any.fromFunction1(value))
      
      inline def setParseInt(value: FnCallSRadix): Self = StObject.set(x, "parseInt", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setQueueMicrotask(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "queueMicrotask", js.Any.fromFunction1(value))
      
      inline def setRangeError(value: RangeErrorConstructor): Self = StObject.set(x, "RangeError", value.asInstanceOf[js.Any])
      
      inline def setReferenceError(value: ReferenceErrorConstructor): Self = StObject.set(x, "ReferenceError", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpConstructor): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SetConstructor): Self = StObject.set(x, "Set", value.asInstanceOf[js.Any])
      
      inline def setSetImmediate(value: (js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Immediate): Self = StObject.set(x, "setImmediate", js.Any.fromFunction2(value))
      
      inline def setSetInterval(value: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timeout): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ js.Any, Unit], Double, /* repeated */ js.Any) => Timeout): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
      
      inline def setString(value: StringConstructor): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: js.Function): Self = StObject.set(x, "Symbol", value.asInstanceOf[js.Any])
      
      inline def setSyntaxError(value: SyntaxErrorConstructor): Self = StObject.set(x, "SyntaxError", value.asInstanceOf[js.Any])
      
      inline def setTypeError(value: TypeErrorConstructor): Self = StObject.set(x, "TypeError", value.asInstanceOf[js.Any])
      
      inline def setURIError(value: URIErrorConstructor): Self = StObject.set(x, "URIError", value.asInstanceOf[js.Any])
      
      inline def setUint16Array(value: Uint16ArrayConstructor): Self = StObject.set(x, "Uint16Array", value.asInstanceOf[js.Any])
      
      inline def setUint32Array(value: Uint32ArrayConstructor): Self = StObject.set(x, "Uint32Array", value.asInstanceOf[js.Any])
      
      inline def setUint8Array(value: Uint8ArrayConstructor): Self = StObject.set(x, "Uint8Array", value.asInstanceOf[js.Any])
      
      inline def setUint8ClampedArray(value: Uint8ClampedArrayConstructor): Self = StObject.set(x, "Uint8ClampedArray", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: Unit): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setUnescape(value: java.lang.String => java.lang.String): Self = StObject.set(x, "unescape", js.Any.fromFunction1(value))
      
      inline def setV8debug(value: js.Any): Self = StObject.set(x, "v8debug", value.asInstanceOf[js.Any])
      
      inline def setV8debugUndefined: Self = StObject.set(x, "v8debug", js.undefined)
      
      inline def setWeakMap(value: WeakMapConstructor): Self = StObject.set(x, "WeakMap", value.asInstanceOf[js.Any])
      
      inline def setWeakSet(value: WeakSetConstructor): Self = StObject.set(x, "WeakSet", value.asInstanceOf[js.Any])
    }
  }
  
  trait Immediate
    extends StObject
       with RefCounted {
    
    var _onImmediate: js.Function
    
    def hasRef(): Boolean
  }
  object Immediate {
    
    inline def apply(_onImmediate: js.Function, hasRef: () => Boolean, ref: () => Immediate, unref: () => Immediate): Immediate = {
      val __obj = js.Dynamic.literal(_onImmediate = _onImmediate.asInstanceOf[js.Any], hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Immediate]
    }
    
    extension [Self <: Immediate](x: Self) {
      
      inline def setHasRef(value: () => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction0(value))
      
      inline def set_onImmediate(value: js.Function): Self = StObject.set(x, "_onImmediate", value.asInstanceOf[js.Any])
    }
  }
  
  trait InspectOptions extends StObject {
    
    var breakLength: js.UndefOr[Double] = js.undefined
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this to `false` causes each object key
      * to be displayed on a new line. It will also add new lines to text that is
      * longer than `breakLength`. If set to a number, the most `n` inner elements
      * are united on a single line as long as all properties fit into
      * `breakLength`. Short array elements are also grouped together. Note that no
      * text will be reduced below 16 characters, no matter the `breakLength` size.
      * For more information, see the example below.
      * @default `true`
      */
    var compact: js.UndefOr[Boolean | Double] = js.undefined
    
    var customInspect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 2
      */
    var depth: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * If set to `true`, getters are going to be
      * inspected as well. If set to `'get'` only getters without setter are going
      * to be inspected. If set to `'set'` only getters having a corresponding
      * setter are going to be inspected. This might cause side effects depending on
      * the getter function.
      * @default `false`
      */
    var getters: js.UndefOr[get | set | Boolean] = js.undefined
    
    var maxArrayLength: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Specifies the maximum number of characters to
      * include when formatting. Set to `null` or `Infinity` to show all elements.
      * Set to `0` or negative to show no characters.
      * @default Infinity
      */
    var maxStringLength: js.UndefOr[Double | Null] = js.undefined
    
    var showHidden: js.UndefOr[Boolean] = js.undefined
    
    var showProxy: js.UndefOr[Boolean] = js.undefined
    
    var sorted: js.UndefOr[
        Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, Double])
      ] = js.undefined
  }
  object InspectOptions {
    
    inline def apply(): InspectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InspectOptions]
    }
    
    extension [Self <: InspectOptions](x: Self) {
      
      inline def setBreakLength(value: Double): Self = StObject.set(x, "breakLength", value.asInstanceOf[js.Any])
      
      inline def setBreakLengthUndefined: Self = StObject.set(x, "breakLength", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCompact(value: Boolean | Double): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      inline def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthNull: Self = StObject.set(x, "depth", null)
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setGetters(value: get | set | Boolean): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      inline def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      inline def setMaxArrayLength(value: Double): Self = StObject.set(x, "maxArrayLength", value.asInstanceOf[js.Any])
      
      inline def setMaxArrayLengthNull: Self = StObject.set(x, "maxArrayLength", null)
      
      inline def setMaxArrayLengthUndefined: Self = StObject.set(x, "maxArrayLength", js.undefined)
      
      inline def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
      
      inline def setMaxStringLengthNull: Self = StObject.set(x, "maxStringLength", null)
      
      inline def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
      
      inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
      
      inline def setShowProxy(value: Boolean): Self = StObject.set(x, "showProxy", value.asInstanceOf[js.Any])
      
      inline def setShowProxyUndefined: Self = StObject.set(x, "showProxy", js.undefined)
      
      inline def setSorted(value: Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, Double])): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedFunction2(value: (/* a */ java.lang.String, /* b */ java.lang.String) => Double): Self = StObject.set(x, "sorted", js.Any.fromFunction2(value))
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
  
  trait Module extends StObject {
    
    var children: js.Array[Module]
    
    var exports: js.Any
    
    var filename: java.lang.String
    
    var id: java.lang.String
    
    var loaded: Boolean
    
    /** @deprecated since 14.6.0 Please use `require.main` and `module.children` instead. */
    var parent: js.UndefOr[Module | Null] = js.undefined
    
    /**
      * @since 11.14.0
      *
      * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
      */
    var path: java.lang.String
    
    var paths: js.Array[java.lang.String]
    
    def require(id: java.lang.String): js.Any
    @JSName("require")
    var require_Original: Require
  }
  object Module {
    
    inline def apply(
      children: js.Array[Module],
      exports: js.Any,
      filename: java.lang.String,
      id: java.lang.String,
      loaded: Boolean,
      path: java.lang.String,
      paths: js.Array[java.lang.String],
      require: Require
    ): Module = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setChildren(value: js.Array[Module]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Module*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: java.lang.String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Module): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[java.lang.String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: java.lang.String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      inline def setRequire(value: Require): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  type ReadOnlyDict[T] = StringDictionary[js.UndefOr[T]]
  
  @js.native
  trait ReadWriteStream
    extends StObject
       with ReadableStream
       with WritableStream
  
  @js.native
  trait ReadableStream
    extends StObject
       with EventEmitter {
    
    def isPaused(): Boolean = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def read(): java.lang.String | Buffer = js.native
    def read(size: Double): java.lang.String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: java.lang.String): Unit = js.native
    def unshift(chunk: java.lang.String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
  
  trait RefCounted extends StObject {
    
    def ref(): this.type
    
    def unref(): this.type
  }
  object RefCounted {
    
    inline def apply(ref: () => RefCounted, unref: () => RefCounted): RefCounted = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[RefCounted]
    }
    
    extension [Self <: RefCounted](x: Self) {
      
      inline def setRef(value: () => RefCounted): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      inline def setUnref(value: () => RefCounted): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Require extends StObject {
    
    def apply(id: java.lang.String): js.Any = js.native
    
    var cache: Dict[NodeModule] = js.native
    
    /**
      * @deprecated
      */
    var extensions: RequireExtensions = js.native
    
    var main: js.UndefOr[Module] = js.native
    
    def resolve(id: java.lang.String): java.lang.String = js.native
    def resolve(id: java.lang.String, options: Paths): java.lang.String = js.native
    @JSName("resolve")
    var resolve_Original: typings.node.NodeJS.RequireResolve = js.native
  }
  
  trait RequireExtensions
    extends StObject
       with Dict[js.Function2[/* m */ Module, /* filename */ java.lang.String, js.Any]] {
    
    @JSName(".js")
    def Dotjs(m: Module, filename: java.lang.String): js.Any
    
    @JSName(".json")
    def Dotjson(m: Module, filename: java.lang.String): js.Any
    
    @JSName(".node")
    def Dotnode(m: Module, filename: java.lang.String): js.Any
  }
  object RequireExtensions {
    
    inline def apply(
      Dotjs: (Module, java.lang.String) => js.Any,
      Dotjson: (Module, java.lang.String) => js.Any,
      Dotnode: (Module, java.lang.String) => js.Any
    ): RequireExtensions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(".js")(js.Any.fromFunction2(Dotjs))
      __obj.updateDynamic(".json")(js.Any.fromFunction2(Dotjson))
      __obj.updateDynamic(".node")(js.Any.fromFunction2(Dotnode))
      __obj.asInstanceOf[RequireExtensions]
    }
    
    extension [Self <: RequireExtensions](x: Self) {
      
      inline def setDotjs(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".js", js.Any.fromFunction2(value))
      
      inline def setDotjson(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".json", js.Any.fromFunction2(value))
      
      inline def setDotnode(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".node", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait RequireResolve extends StObject {
    
    def apply(id: java.lang.String): java.lang.String = js.native
    def apply(id: java.lang.String, options: Paths): java.lang.String = js.native
    
    def paths(request: java.lang.String): js.Array[java.lang.String] | Null = js.native
  }
  
  @js.native
  trait Timeout
    extends StObject
       with Timer
  
  // compatibility with older typings
  @js.native
  trait Timer
    extends StObject
       with RefCounted {
    
    def hasRef(): Boolean = js.native
    
    def refresh(): this.type = js.native
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function0[Double] = js.native
  }
  
  type TypedArray = Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array
  
  @js.native
  trait WritableStream
    extends StObject
       with EventEmitter {
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(data: java.lang.String): Unit = js.native
    def end(data: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: Unit, cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    var writable: Boolean = js.native
    
    def write(buffer: java.lang.String): Boolean = js.native
    def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(str: java.lang.String, encoding: Unit, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(str: java.lang.String, encoding: BufferEncoding): Boolean = js.native
    def write(
      str: java.lang.String,
      encoding: BufferEncoding,
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
  }
}
