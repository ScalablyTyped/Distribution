package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object minappEnv {
  
  type AnyArray = typings.minappEnv.Array[js.Any]
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ClassDecorator = js.Function1[/* target */ typings.minappEnv.Function, typings.minappEnv.Function | scala.Unit]
  
  type Exclude[T, U] = T
  
  type IAPIFunction[T, P /* <: typings.minappEnv.IAPIParam[T] */] = js.Function1[/* param */ P, typings.minappEnv.Promise[T] | js.Any]
  
  type IAnyObject = typings.minappEnv.Record[java.lang.String, js.Any]
  
  type ICloudServices = org.scalablytyped.runtime.StringDictionary[typings.minappEnv.ICloudService]
  
  type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.minappEnv.minappEnvStrings.KVInfer with org.scalablytyped.runtime.TopLevel[T]
  
  type MethodDecorator = js.Function3[
    /* target */ typings.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typings.minappEnv.TypedPropertyDescriptor[js.Any], 
    typings.minappEnv.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  
  type OQ[T /* <: typings.minappEnv.anon.OptionalRecordcompletesuc */] = (typings.minappEnv.RQ[T] with (typings.minappEnv.Required[typings.minappEnv.Pick[T, typings.minappEnv.minappEnvStrings.success]])) | (typings.minappEnv.RQ[T] with (typings.minappEnv.Required[typings.minappEnv.Pick[T, typings.minappEnv.minappEnvStrings.fail]])) | (typings.minappEnv.RQ[T] with (typings.minappEnv.Required[typings.minappEnv.Pick[T, typings.minappEnv.minappEnvStrings.complete]])) | (typings.minappEnv.RQ[T] with (typings.minappEnv.Required[
    typings.minappEnv.Pick[
      T, 
      typings.minappEnv.minappEnvStrings.success | typings.minappEnv.minappEnvStrings.fail
    ]
  ])) | (typings.minappEnv.RQ[T] with (typings.minappEnv.Required[
    typings.minappEnv.Pick[
      T, 
      typings.minappEnv.minappEnvStrings.success | typings.minappEnv.minappEnvStrings.complete
    ]
  ])) | (typings.minappEnv.RQ[T] with (typings.minappEnv.Required[
    typings.minappEnv.Pick[
      T, 
      typings.minappEnv.minappEnvStrings.fail | typings.minappEnv.minappEnvStrings.complete
    ]
  ])) | (typings.minappEnv.RQ[T] with (typings.minappEnv.Required[
    typings.minappEnv.Pick[
      T, 
      typings.minappEnv.minappEnvStrings.fail | typings.minappEnv.minappEnvStrings.complete | typings.minappEnv.minappEnvStrings.success
    ]
  ]))
  
  type Optional[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K]}
    */ typings.minappEnv.minappEnvStrings.Optional with org.scalablytyped.runtime.TopLevel[T]
  
  type ParameterDecorator = js.Function3[
    /* target */ typings.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.minappEnv.minappEnvStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type PartialOptional[T, K /* <: /* keyof T */ java.lang.String */] = (typings.minappEnv.Partial[typings.minappEnv.Pick[T, K]]) with (typings.minappEnv.Pick[T, typings.minappEnv.Exclude[/* keyof T */ java.lang.String, K]])
  
  /**
    * From T pick a set of properties K
    */
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typings.minappEnv.minappEnvStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[js.Object | typings.minappEnv.PromiseLike[js.Object]], 
        scala.Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    typings.minappEnv.PromiseLike[js.Object]
  ]
  
  type PropertyDecorator = js.Function2[
    /* target */ typings.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    scala.Unit
  ]
  
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[typings.minappEnv.PropertyDescriptor]
  
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  
  type RQ[T /* <: typings.minappEnv.anon.OptionalRecordcompletesuc */] = typings.minappEnv.Pick[
    T, 
    typings.minappEnv.Exclude[
      /* keyof T */ java.lang.String, 
      typings.minappEnv.minappEnvStrings.complete | typings.minappEnv.minappEnvStrings.success | typings.minappEnv.minappEnvStrings.fail
    ]
  ]
  
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typings.minappEnv.minappEnvStrings.Readonly with org.scalablytyped.runtime.TopLevel[T]
  
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T}
    */ typings.minappEnv.minappEnvStrings.Record with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * Utils
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typings.minappEnv.minappEnvStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  
  type Void[T] = js.UndefOr[T | scala.Null]
}
