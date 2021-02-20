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
import typings.std.MapConstructor
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*----------------------------------------------*
*                                               *
*               GLOBAL INTERFACES               *
*                                               *
*-----------------------------------------------*/
object NodeJS {
  
  type ArrayBufferView = TypedArray | DataView
  
  @js.native
  trait CallSite extends StObject {
    
    /**
      * Current column number [if this function was defined in a script]
      */
    def getColumnNumber(): Double | Null = js.native
    
    /**
      * A call site object representing the location where eval was called
      * [if this function was created using a call to eval]
      */
    def getEvalOrigin(): js.UndefOr[java.lang.String] = js.native
    
    /**
      * Name of the script [if this function was defined in a script]
      */
    def getFileName(): java.lang.String | Null = js.native
    
    /**
      * Current function
      */
    def getFunction(): js.UndefOr[js.Function] = js.native
    
    /**
      * Name of the current function, typically its name property.
      * If a name property is not available an attempt will be made to try
      * to infer a name from the function's context.
      */
    def getFunctionName(): java.lang.String | Null = js.native
    
    /**
      * Current line number [if this function was defined in a script]
      */
    def getLineNumber(): Double | Null = js.native
    
    /**
      * Name of the property [of "this" or one of its prototypes] that holds
      * the current function
      */
    def getMethodName(): java.lang.String | Null = js.native
    
    /**
      * Value of "this"
      */
    def getThis(): js.Any = js.native
    
    /**
      * Type of "this" as a string.
      * This is the name of the function stored in the constructor field of
      * "this", if available.  Otherwise the object's [[Class]] internal
      * property.
      */
    def getTypeName(): java.lang.String | Null = js.native
    
    /**
      * Is this a constructor call?
      */
    def isConstructor(): Boolean = js.native
    
    /**
      * Does this call take place in code defined by a call to eval?
      */
    def isEval(): Boolean = js.native
    
    /**
      * Is this call in native V8 code?
      */
    def isNative(): Boolean = js.native
    
    /**
      * Is this a toplevel invocation, that is, is "this" the global object?
      */
    def isToplevel(): Boolean = js.native
  }
  object CallSite {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CallSiteMutableBuilder[Self <: CallSite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColumnNumber(value: () => Double | Null): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEvalOrigin(value: () => js.UndefOr[java.lang.String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunction(value: () => js.UndefOr[js.Function]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunctionName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMethodName(value: () => java.lang.String | Null): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetThis(value: () => js.Any): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTypeName(value: () => java.lang.String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
  
  type Dict[T] = StringDictionary[js.UndefOr[T]]
  
  @js.native
  trait ErrnoException extends Error {
    
    var code: js.UndefOr[java.lang.String] = js.native
    
    var errno: js.UndefOr[Double] = js.native
    
    var path: js.UndefOr[java.lang.String] = js.native
    
    var syscall: js.UndefOr[java.lang.String] = js.native
  }
  object ErrnoException {
    
    @scala.inline
    def apply(message: java.lang.String, name: java.lang.String): ErrnoException = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrnoException]
    }
    
    @scala.inline
    implicit class ErrnoExceptionMutableBuilder[Self <: ErrnoException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSyscall(value: java.lang.String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
    }
  }
  
  @js.native
  trait Global extends StObject {
    
    def Array(): js.Array[_] = js.native
    def Array(arrayLength: Double): js.Array[_] = js.native
    def Array[T](items: T*): js.Array[T] = js.native
    
    var ArrayBuffer: ArrayBufferConstructor = js.native
    
    @JSName("Array")
    var Array_Original: ArrayConstructor = js.native
    @JSName("Array")
    def Array_T[T](arrayLength: Double): js.Array[T] = js.native
    
    def Boolean[T](): scala.Boolean = js.native
    def Boolean[T](value: T): scala.Boolean = js.native
    @JSName("Boolean")
    var Boolean_Original: BooleanConstructor = js.native
    
    var Buffer: TypeofBuffer with (Instantiable2[
        /* str */ java.lang.String, 
        /* encoding */ js.UndefOr[BufferEncoding], 
        typings.node.Buffer
      ]) = js.native
    
    var DataView: DataViewConstructor = js.native
    
    def Date(): java.lang.String = js.native
    @JSName("Date")
    var Date_Original: DateConstructor = js.native
    
    def Error(): typings.std.Error = js.native
    def Error(message: java.lang.String): typings.std.Error = js.native
    @JSName("Error")
    var Error_Original: typings.std.ErrorConstructor = js.native
    
    def EvalError(): Error = js.native
    def EvalError(message: java.lang.String): Error = js.native
    @JSName("EvalError")
    def EvalError_EvalError(): EvalError = js.native
    @JSName("EvalError")
    def EvalError_EvalError(message: java.lang.String): EvalError = js.native
    @JSName("EvalError")
    var EvalError_Original: EvalErrorConstructor = js.native
    
    var Float32Array: Float32ArrayConstructor = js.native
    
    var Float64Array: Float64ArrayConstructor = js.native
    
    def Function(args: java.lang.String*): js.Function = js.native
    @JSName("Function")
    var Function_Original: FunctionConstructor = js.native
    
    var Infinity: Double = js.native
    
    var Int16Array: Int16ArrayConstructor = js.native
    
    var Int32Array: Int32ArrayConstructor = js.native
    
    var Int8Array: Int8ArrayConstructor = js.native
    
    var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any = js.native
    
    var JSON: typings.std.JSON = js.native
    
    var Map: MapConstructor = js.native
    
    var Math: typings.std.Math = js.native
    
    var NaN: Double = js.native
    
    def Number(): Double = js.native
    def Number(value: js.Any): Double = js.native
    @JSName("Number")
    var Number_Original: NumberConstructor = js.native
    
    def Object(): js.Any = js.native
    def Object(value: js.Any): js.Any = js.native
    @JSName("Object")
    var Object_Original: ObjectConstructor = js.native
    
    var Promise: PromiseConstructor = js.native
    
    def RangeError(): typings.std.RangeError = js.native
    def RangeError(message: java.lang.String): typings.std.RangeError = js.native
    @JSName("RangeError")
    def RangeError_Error(): Error = js.native
    @JSName("RangeError")
    def RangeError_Error(message: java.lang.String): Error = js.native
    @JSName("RangeError")
    var RangeError_Original: RangeErrorConstructor = js.native
    
    def ReferenceError(): Error = js.native
    def ReferenceError(message: java.lang.String): Error = js.native
    @JSName("ReferenceError")
    var ReferenceError_Original: ReferenceErrorConstructor = js.native
    @JSName("ReferenceError")
    def ReferenceError_ReferenceError(): ReferenceError = js.native
    @JSName("ReferenceError")
    def ReferenceError_ReferenceError(message: java.lang.String): ReferenceError = js.native
    
    def RegExp(pattern: java.lang.String): typings.std.RegExp = js.native
    def RegExp(pattern: java.lang.String, flags: java.lang.String): typings.std.RegExp = js.native
    def RegExp(pattern: typings.std.RegExp): typings.std.RegExp = js.native
    def RegExp(pattern: typings.std.RegExp, flags: java.lang.String): typings.std.RegExp = js.native
    @JSName("RegExp")
    var RegExp_Original: RegExpConstructor = js.native
    
    var Set: SetConstructor = js.native
    
    def String(): java.lang.String = js.native
    def String(value: js.Any): java.lang.String = js.native
    @JSName("String")
    var String_Original: StringConstructor = js.native
    
    var Symbol: js.Function = js.native
    
    def SyntaxError(): typings.std.SyntaxError = js.native
    def SyntaxError(message: java.lang.String): typings.std.SyntaxError = js.native
    @JSName("SyntaxError")
    def SyntaxError_Error(): Error = js.native
    @JSName("SyntaxError")
    def SyntaxError_Error(message: java.lang.String): Error = js.native
    @JSName("SyntaxError")
    var SyntaxError_Original: SyntaxErrorConstructor = js.native
    
    def TypeError(): Error = js.native
    def TypeError(message: java.lang.String): Error = js.native
    @JSName("TypeError")
    var TypeError_Original: TypeErrorConstructor = js.native
    @JSName("TypeError")
    def TypeError_TypeError(): TypeError = js.native
    @JSName("TypeError")
    def TypeError_TypeError(message: java.lang.String): TypeError = js.native
    
    def URIError(): Error = js.native
    def URIError(message: java.lang.String): Error = js.native
    @JSName("URIError")
    var URIError_Original: URIErrorConstructor = js.native
    @JSName("URIError")
    def URIError_URIError(): URIError = js.native
    @JSName("URIError")
    def URIError_URIError(message: java.lang.String): URIError = js.native
    
    var Uint16Array: Uint16ArrayConstructor = js.native
    
    var Uint32Array: Uint32ArrayConstructor = js.native
    
    var Uint8Array: Uint8ArrayConstructor = js.native
    
    var Uint8ClampedArray: Uint8ClampedArrayConstructor = js.native
    
    var WeakMap: WeakMapConstructor = js.native
    
    var WeakSet: WeakSetConstructor = js.native
    
    def clearImmediate(immediateId: Immediate): Unit = js.native
    
    def clearInterval(intervalId: Timeout): Unit = js.native
    
    def clearTimeout(timeoutId: Timeout): Unit = js.native
    
    def decodeURI(encodedURI: java.lang.String): java.lang.String = js.native
    
    def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.native
    @JSName("decodeURIComponent")
    var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ java.lang.String, java.lang.String] = js.native
    
    @JSName("decodeURI")
    var decodeURI_Original: js.Function1[/* encodedURI */ java.lang.String, java.lang.String] = js.native
    
    def encodeURI(uri: java.lang.String): java.lang.String = js.native
    
    def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.native
    def encodeURIComponent(uriComponent: Boolean): java.lang.String = js.native
    def encodeURIComponent(uriComponent: Double): java.lang.String = js.native
    @JSName("encodeURIComponent")
    var encodeURIComponent_Original: FnCallUriComponent = js.native
    
    @JSName("encodeURI")
    var encodeURI_Original: js.Function1[/* uri */ java.lang.String, java.lang.String] = js.native
    
    def escape(str: java.lang.String): java.lang.String = js.native
    
    def eval(x: java.lang.String): js.Any = js.native
    @JSName("eval")
    var eval_Original: js.Function1[/* x */ java.lang.String, _] = js.native
    
    def gc(): Unit = js.native
    
    var global: Global = js.native
    
    def isFinite(number: Double): Boolean = js.native
    @JSName("isFinite")
    var isFinite_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    def isNaN(number: Double): Boolean = js.native
    @JSName("isNaN")
    var isNaN_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    def parseFloat(string: java.lang.String): Double = js.native
    @JSName("parseFloat")
    var parseFloat_Original: js.Function1[/* string */ java.lang.String, Double] = js.native
    
    def parseInt(s: java.lang.String): Double = js.native
    def parseInt(s: java.lang.String, radix: Double): Double = js.native
    @JSName("parseInt")
    var parseInt_Original: FnCallSRadix = js.native
    
    def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
    @JSName("queueMicrotask")
    var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
    
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
    
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
    
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
    
    var undefined: js.UndefOr[scala.Nothing] = js.native
    
    def unescape(str: java.lang.String): java.lang.String = js.native
    
    var v8debug: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  trait Immediate extends RefCounted {
    
    var _onImmediate: js.Function = js.native
    
    def hasRef(): Boolean = js.native
  }
  object Immediate {
    
    @scala.inline
    def apply(_onImmediate: js.Function, hasRef: () => Boolean, ref: () => Immediate, unref: () => Immediate): Immediate = {
      val __obj = js.Dynamic.literal(_onImmediate = _onImmediate.asInstanceOf[js.Any], hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Immediate]
    }
    
    @scala.inline
    implicit class ImmediateMutableBuilder[Self <: Immediate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasRef(value: () => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_onImmediate(value: js.Function): Self = StObject.set(x, "_onImmediate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InspectOptions extends StObject {
    
    var breakLength: js.UndefOr[Double] = js.native
    
    var colors: js.UndefOr[Boolean] = js.native
    
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
    var compact: js.UndefOr[Boolean | Double] = js.native
    
    var customInspect: js.UndefOr[Boolean] = js.native
    
    /**
      * @default 2
      */
    var depth: js.UndefOr[Double | Null] = js.native
    
    /**
      * If set to `true`, getters are going to be
      * inspected as well. If set to `'get'` only getters without setter are going
      * to be inspected. If set to `'set'` only getters having a corresponding
      * setter are going to be inspected. This might cause side effects depending on
      * the getter function.
      * @default `false`
      */
    var getters: js.UndefOr[get | set | Boolean] = js.native
    
    var maxArrayLength: js.UndefOr[Double | Null] = js.native
    
    /**
      * Specifies the maximum number of characters to
      * include when formatting. Set to `null` or `Infinity` to show all elements.
      * Set to `0` or negative to show no characters.
      * @default Infinity
      */
    var maxStringLength: js.UndefOr[Double | Null] = js.native
    
    var showHidden: js.UndefOr[Boolean] = js.native
    
    var showProxy: js.UndefOr[Boolean] = js.native
    
    var sorted: js.UndefOr[
        Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, Double])
      ] = js.native
  }
  object InspectOptions {
    
    @scala.inline
    def apply(): InspectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InspectOptions]
    }
    
    @scala.inline
    implicit class InspectOptionsMutableBuilder[Self <: InspectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakLength(value: Double): Self = StObject.set(x, "breakLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakLengthUndefined: Self = StObject.set(x, "breakLength", js.undefined)
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean | Double): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthNull: Self = StObject.set(x, "depth", null)
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setGetters(value: get | set | Boolean): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      @scala.inline
      def setMaxArrayLength(value: Double): Self = StObject.set(x, "maxArrayLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxArrayLengthNull: Self = StObject.set(x, "maxArrayLength", null)
      
      @scala.inline
      def setMaxArrayLengthUndefined: Self = StObject.set(x, "maxArrayLength", js.undefined)
      
      @scala.inline
      def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStringLengthNull: Self = StObject.set(x, "maxStringLength", null)
      
      @scala.inline
      def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
      
      @scala.inline
      def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
      
      @scala.inline
      def setShowProxy(value: Boolean): Self = StObject.set(x, "showProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProxyUndefined: Self = StObject.set(x, "showProxy", js.undefined)
      
      @scala.inline
      def setSorted(value: Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, Double])): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedFunction2(value: (/* a */ java.lang.String, /* b */ java.lang.String) => Double): Self = StObject.set(x, "sorted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
  
  @js.native
  trait Module extends StObject {
    
    var children: js.Array[Module] = js.native
    
    var exports: js.Any = js.native
    
    var filename: java.lang.String = js.native
    
    var id: java.lang.String = js.native
    
    var loaded: Boolean = js.native
    
    /** @deprecated since 14.6.0 Please use `require.main` and `module.children` instead. */
    var parent: js.UndefOr[Module | Null] = js.native
    
    /**
      * @since 11.14.0
      *
      * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
      */
    var path: java.lang.String = js.native
    
    var paths: js.Array[java.lang.String] = js.native
    
    def require(id: java.lang.String): js.Any = js.native
    @JSName("require")
    var require_Original: Require = js.native
  }
  
  type ReadOnlyDict[T] = StringDictionary[js.UndefOr[T]]
  
  @js.native
  trait ReadWriteStream
    extends ReadableStream
       with WritableStream
  
  @js.native
  trait ReadableStream extends EventEmitter {
    
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
  
  @js.native
  trait RefCounted extends StObject {
    
    def ref(): this.type = js.native
    
    def unref(): this.type = js.native
  }
  object RefCounted {
    
    @scala.inline
    def apply(ref: () => RefCounted, unref: () => RefCounted): RefCounted = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[RefCounted]
    }
    
    @scala.inline
    implicit class RefCountedMutableBuilder[Self <: RefCounted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: () => RefCounted): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => RefCounted): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
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
  
  @js.native
  trait RequireExtensions
    extends Dict[js.Function2[/* m */ Module, /* filename */ java.lang.String, js.Any]] {
    
    @JSName(".js")
    def Dotjs(m: Module, filename: java.lang.String): js.Any = js.native
    
    @JSName(".json")
    def Dotjson(m: Module, filename: java.lang.String): js.Any = js.native
    
    @JSName(".node")
    def Dotnode(m: Module, filename: java.lang.String): js.Any = js.native
  }
  object RequireExtensions {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RequireExtensionsMutableBuilder[Self <: RequireExtensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotjs(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".js", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotjson(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".json", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotnode(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".node", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait RequireResolve extends StObject {
    
    def apply(id: java.lang.String): java.lang.String = js.native
    def apply(id: java.lang.String, options: Paths): java.lang.String = js.native
    
    def paths(request: java.lang.String): js.Array[java.lang.String] | Null = js.native
  }
  
  @js.native
  trait Timeout extends Timer
  
  // compatibility with older typings
  @js.native
  trait Timer extends RefCounted {
    
    def hasRef(): Boolean = js.native
    
    def refresh(): this.type = js.native
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function0[Double] = js.native
  }
  
  type TypedArray = Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array
  
  @js.native
  trait WritableStream extends EventEmitter {
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(data: java.lang.String): Unit = js.native
    def end(data: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: Uint8Array): Unit = js.native
    def end(data: Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    var writable: Boolean = js.native
    
    def write(buffer: java.lang.String): Boolean = js.native
    def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(buffer: Uint8Array): Boolean = js.native
    def write(buffer: Uint8Array, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(
      str: java.lang.String,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(str: java.lang.String, encoding: BufferEncoding): Boolean = js.native
    def write(
      str: java.lang.String,
      encoding: BufferEncoding,
      cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
  }
}
