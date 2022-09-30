package typings.ow

import typings.node.bufferMod.global.Buffer
import typings.ow.anyMod.AnyPredicate
import typings.ow.arrayBufferMod.ArrayBufferPredicate
import typings.ow.arrayMod.ArrayPredicate
import typings.ow.basePredicateMod.BasePredicate
import typings.ow.bigintMod.BigIntPredicate
import typings.ow.booleanMod.BooleanPredicate
import typings.ow.dataViewMod.DataViewPredicate
import typings.ow.dateMod.DatePredicate
import typings.ow.errorMod.ErrorPredicate
import typings.ow.mapMod.MapPredicate
import typings.ow.modifiersMod.Optionalify
import typings.ow.numberMod.NumberPredicate
import typings.ow.objectMod.ObjectPredicate
import typings.ow.predicateMod.Predicate
import typings.ow.setMod.SetPredicate
import typings.ow.stringMod.StringPredicate
import typings.ow.typedArrayMod.TypedArrayPredicate
import typings.ow.weakMapMod.WeakMapPredicate
import typings.ow.weakSetMod.WeakSetPredicate
import typings.std.SharedArrayBuffer
import typings.typeFest.typedArrayMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {[ K in keyof ow.ow/dist/predicates.Predicates ]: ow.ow/dist/modifiers.Optionalify<ow.ow/dist/predicates.Predicates[K]>} */
  trait KinkeyofPredicatesOptiona extends StObject {
    
    var any: Optionalify[
        (js.Function1[/* p1 */ BasePredicate[Any], AnyPredicate[Any]]) & (js.Function2[/* p1 */ BasePredicate[Any], /* p2 */ BasePredicate[Any], AnyPredicate[Any]]) & (js.Function3[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ]) & (js.Function4[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ]) & (js.Function5[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ]) & (js.Function6[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ]) & (js.Function7[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ]) & (js.Function8[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          /* p8 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ]) & (js.Function9[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          /* p8 */ BasePredicate[Any], 
          /* p9 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ]) & (js.Function10[
          /* p1 */ BasePredicate[Any], 
          /* p2 */ BasePredicate[Any], 
          /* p3 */ BasePredicate[Any], 
          /* p4 */ BasePredicate[Any], 
          /* p5 */ BasePredicate[Any], 
          /* p6 */ BasePredicate[Any], 
          /* p7 */ BasePredicate[Any], 
          /* p8 */ BasePredicate[Any], 
          /* p9 */ BasePredicate[Any], 
          /* p10 */ BasePredicate[Any], 
          AnyPredicate[Any]
        ])
      ]
    
    var array: Optionalify[ArrayPredicate[Any]]
    
    var arrayBuffer: Optionalify[ArrayBufferPredicate[js.typedarray.ArrayBuffer]]
    
    var bigint: Optionalify[BigIntPredicate]
    
    var boolean: Optionalify[BooleanPredicate]
    
    var buffer: Optionalify[Predicate[Buffer]]
    
    var dataView: Optionalify[DataViewPredicate]
    
    var date: Optionalify[DatePredicate]
    
    var error: Optionalify[ErrorPredicate]
    
    var float32Array: Optionalify[TypedArrayPredicate[js.typedarray.Float32Array]]
    
    var float64Array: Optionalify[TypedArrayPredicate[js.typedarray.Float64Array]]
    
    var function: Optionalify[Predicate[js.Function]]
    
    var int16Array: Optionalify[TypedArrayPredicate[js.typedarray.Int16Array]]
    
    var int32Array: Optionalify[TypedArrayPredicate[js.typedarray.Int32Array]]
    
    var int8Array: Optionalify[TypedArrayPredicate[js.typedarray.Int8Array]]
    
    var iterable: Optionalify[Predicate[js.Iterable[Any]]]
    
    var map: Optionalify[MapPredicate[Any, Any]]
    
    var nan: Optionalify[Predicate[Double]]
    
    var `null`: Optionalify[Predicate[Null]]
    
    var nullOrUndefined: Optionalify[Predicate[js.UndefOr[Null]]]
    
    var number: Optionalify[NumberPredicate]
    
    var `object`: Optionalify[ObjectPredicate[js.Object]]
    
    var promise: Optionalify[Predicate[js.Promise[Any]]]
    
    var regExp: Optionalify[Predicate[js.RegExp]]
    
    var set: Optionalify[SetPredicate[Any]]
    
    var sharedArrayBuffer: Optionalify[ArrayBufferPredicate[SharedArrayBuffer]]
    
    var string: Optionalify[StringPredicate]
    
    var symbol: Optionalify[Predicate[js.Symbol]]
    
    var typedArray: Optionalify[TypedArrayPredicate[TypedArray]]
    
    var uint16Array: Optionalify[TypedArrayPredicate[js.typedarray.Uint16Array]]
    
    var uint32Array: Optionalify[TypedArrayPredicate[js.typedarray.Uint32Array]]
    
    var uint8Array: Optionalify[TypedArrayPredicate[js.typedarray.Uint8Array]]
    
    var uint8ClampedArray: Optionalify[TypedArrayPredicate[js.typedarray.Uint8ClampedArray]]
    
    var undefined: Optionalify[Predicate[Unit]]
    
    var weakMap: Optionalify[WeakMapPredicate[js.Object]]
    
    var weakSet: Optionalify[WeakSetPredicate[js.Object]]
  }
  object KinkeyofPredicatesOptiona {
    
    inline def apply(
      any: Optionalify[
          (js.Function1[/* p1 */ BasePredicate[Any], AnyPredicate[Any]]) & (js.Function2[/* p1 */ BasePredicate[Any], /* p2 */ BasePredicate[Any], AnyPredicate[Any]]) & (js.Function3[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ]) & (js.Function4[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            /* p4 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ]) & (js.Function5[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            /* p4 */ BasePredicate[Any], 
            /* p5 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ]) & (js.Function6[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            /* p4 */ BasePredicate[Any], 
            /* p5 */ BasePredicate[Any], 
            /* p6 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ]) & (js.Function7[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            /* p4 */ BasePredicate[Any], 
            /* p5 */ BasePredicate[Any], 
            /* p6 */ BasePredicate[Any], 
            /* p7 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ]) & (js.Function8[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            /* p4 */ BasePredicate[Any], 
            /* p5 */ BasePredicate[Any], 
            /* p6 */ BasePredicate[Any], 
            /* p7 */ BasePredicate[Any], 
            /* p8 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ]) & (js.Function9[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            /* p4 */ BasePredicate[Any], 
            /* p5 */ BasePredicate[Any], 
            /* p6 */ BasePredicate[Any], 
            /* p7 */ BasePredicate[Any], 
            /* p8 */ BasePredicate[Any], 
            /* p9 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ]) & (js.Function10[
            /* p1 */ BasePredicate[Any], 
            /* p2 */ BasePredicate[Any], 
            /* p3 */ BasePredicate[Any], 
            /* p4 */ BasePredicate[Any], 
            /* p5 */ BasePredicate[Any], 
            /* p6 */ BasePredicate[Any], 
            /* p7 */ BasePredicate[Any], 
            /* p8 */ BasePredicate[Any], 
            /* p9 */ BasePredicate[Any], 
            /* p10 */ BasePredicate[Any], 
            AnyPredicate[Any]
          ])
        ],
      array: Optionalify[ArrayPredicate[Any]],
      arrayBuffer: Optionalify[ArrayBufferPredicate[js.typedarray.ArrayBuffer]],
      bigint: Optionalify[BigIntPredicate],
      boolean: Optionalify[BooleanPredicate],
      buffer: Optionalify[Predicate[Buffer]],
      dataView: Optionalify[DataViewPredicate],
      date: Optionalify[DatePredicate],
      error: Optionalify[ErrorPredicate],
      float32Array: Optionalify[TypedArrayPredicate[js.typedarray.Float32Array]],
      float64Array: Optionalify[TypedArrayPredicate[js.typedarray.Float64Array]],
      function: Optionalify[Predicate[js.Function]],
      int16Array: Optionalify[TypedArrayPredicate[js.typedarray.Int16Array]],
      int32Array: Optionalify[TypedArrayPredicate[js.typedarray.Int32Array]],
      int8Array: Optionalify[TypedArrayPredicate[js.typedarray.Int8Array]],
      iterable: Optionalify[Predicate[js.Iterable[Any]]],
      map: Optionalify[MapPredicate[Any, Any]],
      nan: Optionalify[Predicate[Double]],
      `null`: Optionalify[Predicate[Null]],
      nullOrUndefined: Optionalify[Predicate[js.UndefOr[Null]]],
      number: Optionalify[NumberPredicate],
      `object`: Optionalify[ObjectPredicate[js.Object]],
      promise: Optionalify[Predicate[js.Promise[Any]]],
      regExp: Optionalify[Predicate[js.RegExp]],
      set: Optionalify[SetPredicate[Any]],
      sharedArrayBuffer: Optionalify[ArrayBufferPredicate[SharedArrayBuffer]],
      string: Optionalify[StringPredicate],
      symbol: Optionalify[Predicate[js.Symbol]],
      typedArray: Optionalify[TypedArrayPredicate[TypedArray]],
      uint16Array: Optionalify[TypedArrayPredicate[js.typedarray.Uint16Array]],
      uint32Array: Optionalify[TypedArrayPredicate[js.typedarray.Uint32Array]],
      uint8Array: Optionalify[TypedArrayPredicate[js.typedarray.Uint8Array]],
      uint8ClampedArray: Optionalify[TypedArrayPredicate[js.typedarray.Uint8ClampedArray]],
      undefined: Optionalify[Predicate[Unit]],
      weakMap: Optionalify[WeakMapPredicate[js.Object]],
      weakSet: Optionalify[WeakSetPredicate[js.Object]]
    ): KinkeyofPredicatesOptiona = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayBuffer = arrayBuffer.asInstanceOf[js.Any], bigint = bigint.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], dataView = dataView.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], float32Array = float32Array.asInstanceOf[js.Any], float64Array = float64Array.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], int16Array = int16Array.asInstanceOf[js.Any], int32Array = int32Array.asInstanceOf[js.Any], int8Array = int8Array.asInstanceOf[js.Any], iterable = iterable.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], nan = nan.asInstanceOf[js.Any], nullOrUndefined = nullOrUndefined.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], sharedArrayBuffer = sharedArrayBuffer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], typedArray = typedArray.asInstanceOf[js.Any], uint16Array = uint16Array.asInstanceOf[js.Any], uint32Array = uint32Array.asInstanceOf[js.Any], uint8Array = uint8Array.asInstanceOf[js.Any], uint8ClampedArray = uint8ClampedArray.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], weakMap = weakMap.asInstanceOf[js.Any], weakSet = weakSet.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinkeyofPredicatesOptiona]
    }
    
    extension [Self <: KinkeyofPredicatesOptiona](x: Self) {
      
      inline def setAny(
        value: Optionalify[
              (js.Function1[/* p1 */ BasePredicate[Any], AnyPredicate[Any]]) & (js.Function2[/* p1 */ BasePredicate[Any], /* p2 */ BasePredicate[Any], AnyPredicate[Any]]) & (js.Function3[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ]) & (js.Function4[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                /* p4 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ]) & (js.Function5[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                /* p4 */ BasePredicate[Any], 
                /* p5 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ]) & (js.Function6[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                /* p4 */ BasePredicate[Any], 
                /* p5 */ BasePredicate[Any], 
                /* p6 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ]) & (js.Function7[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                /* p4 */ BasePredicate[Any], 
                /* p5 */ BasePredicate[Any], 
                /* p6 */ BasePredicate[Any], 
                /* p7 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ]) & (js.Function8[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                /* p4 */ BasePredicate[Any], 
                /* p5 */ BasePredicate[Any], 
                /* p6 */ BasePredicate[Any], 
                /* p7 */ BasePredicate[Any], 
                /* p8 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ]) & (js.Function9[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                /* p4 */ BasePredicate[Any], 
                /* p5 */ BasePredicate[Any], 
                /* p6 */ BasePredicate[Any], 
                /* p7 */ BasePredicate[Any], 
                /* p8 */ BasePredicate[Any], 
                /* p9 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ]) & (js.Function10[
                /* p1 */ BasePredicate[Any], 
                /* p2 */ BasePredicate[Any], 
                /* p3 */ BasePredicate[Any], 
                /* p4 */ BasePredicate[Any], 
                /* p5 */ BasePredicate[Any], 
                /* p6 */ BasePredicate[Any], 
                /* p7 */ BasePredicate[Any], 
                /* p8 */ BasePredicate[Any], 
                /* p9 */ BasePredicate[Any], 
                /* p10 */ BasePredicate[Any], 
                AnyPredicate[Any]
              ])
            ]
      ): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setArray(value: Optionalify[ArrayPredicate[Any]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayBuffer(value: Optionalify[ArrayBufferPredicate[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setBigint(value: Optionalify[BigIntPredicate]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setBoolean(value: Optionalify[BooleanPredicate]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: Optionalify[Predicate[Buffer]]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setDataView(value: Optionalify[DataViewPredicate]): Self = StObject.set(x, "dataView", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Optionalify[DatePredicate]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setError(value: Optionalify[ErrorPredicate]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFloat32Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Float32Array]]): Self = StObject.set(x, "float32Array", value.asInstanceOf[js.Any])
      
      inline def setFloat64Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Float64Array]]): Self = StObject.set(x, "float64Array", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: Optionalify[Predicate[js.Function]]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setInt16Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Int16Array]]): Self = StObject.set(x, "int16Array", value.asInstanceOf[js.Any])
      
      inline def setInt32Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Int32Array]]): Self = StObject.set(x, "int32Array", value.asInstanceOf[js.Any])
      
      inline def setInt8Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Int8Array]]): Self = StObject.set(x, "int8Array", value.asInstanceOf[js.Any])
      
      inline def setIterable(value: Optionalify[Predicate[js.Iterable[Any]]]): Self = StObject.set(x, "iterable", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Optionalify[MapPredicate[Any, Any]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setNan(value: Optionalify[Predicate[Double]]): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
      
      inline def setNull(value: Optionalify[Predicate[Null]]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNullOrUndefined(value: Optionalify[Predicate[js.UndefOr[Null]]]): Self = StObject.set(x, "nullOrUndefined", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Optionalify[NumberPredicate]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Optionalify[ObjectPredicate[js.Object]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: Optionalify[Predicate[js.Promise[Any]]]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: Optionalify[Predicate[js.RegExp]]): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Optionalify[SetPredicate[Any]]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSharedArrayBuffer(value: Optionalify[ArrayBufferPredicate[SharedArrayBuffer]]): Self = StObject.set(x, "sharedArrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setString(value: Optionalify[StringPredicate]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Optionalify[Predicate[js.Symbol]]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setTypedArray(value: Optionalify[TypedArrayPredicate[TypedArray]]): Self = StObject.set(x, "typedArray", value.asInstanceOf[js.Any])
      
      inline def setUint16Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Uint16Array]]): Self = StObject.set(x, "uint16Array", value.asInstanceOf[js.Any])
      
      inline def setUint32Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Uint32Array]]): Self = StObject.set(x, "uint32Array", value.asInstanceOf[js.Any])
      
      inline def setUint8Array(value: Optionalify[TypedArrayPredicate[js.typedarray.Uint8Array]]): Self = StObject.set(x, "uint8Array", value.asInstanceOf[js.Any])
      
      inline def setUint8ClampedArray(value: Optionalify[TypedArrayPredicate[js.typedarray.Uint8ClampedArray]]): Self = StObject.set(x, "uint8ClampedArray", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: Optionalify[Predicate[Unit]]): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setWeakMap(value: Optionalify[WeakMapPredicate[js.Object]]): Self = StObject.set(x, "weakMap", value.asInstanceOf[js.Any])
      
      inline def setWeakSet(value: Optionalify[WeakSetPredicate[js.Object]]): Self = StObject.set(x, "weakSet", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    /**
      The error message which should be shown if the `validator` is `false`. Or a error function which returns the error message and accepts the label as first argument.
      */
    var message: String | (js.Function1[/* label */ String, String])
    
    /**
      Should be `true` if the validation is correct.
      */
    var validator: Boolean
  }
  object Message {
    
    inline def apply(message: String | (js.Function1[/* label */ String, String]), validator: Boolean): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String | (js.Function1[/* label */ String, String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* label */ String => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setValidator(value: Boolean): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
