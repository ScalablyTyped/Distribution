package typings.minappEnv

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.anon.OptionalRecordcompletesuc
import typings.minappEnv.minappEnvStrings.complete
import typings.minappEnv.minappEnvStrings.fail
import typings.minappEnv.minappEnvStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyArray = Array[Any]

type AnyObject = StringDictionary[Any]

type ClassDecorator = js.Function1[/* target */ Function, Function | Unit]

type Exclude[T, U] = T

type IAPIFunction[T, P /* <: IAPIParam[T] */] = js.Function1[/* param */ P, Promise[T] | Any]

type IAnyObject = Record[java.lang.String, Any]

type ICloudServices = StringDictionary[ICloudService]

type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: T[K]}
  */ typings.minappEnv.minappEnvStrings.KVInfer & TopLevel[T]

type MethodDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[Any], 
TypedPropertyDescriptor[Any] | Unit]

type OQ[T /* <: OptionalRecordcompletesuc */] = (RQ[T] & (Required[Pick[T, success]])) | (RQ[T] & (Required[Pick[T, fail]])) | (RQ[T] & (Required[Pick[T, complete]])) | (RQ[T] & (Required[Pick[T, success | fail]])) | (RQ[T] & (Required[Pick[T, success | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete | success]]))

type Optional[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? T[K]}
  */ typings.minappEnv.minappEnvStrings.Optional & TopLevel[T]

type ParameterDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* parameterIndex */ Double, 
Unit]

/**
  * Make all properties in T optional
  */
type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P]}
  */ typings.minappEnv.minappEnvStrings.Partial & TopLevel[T]

type PartialOptional[T, K /* <: /* keyof T */ java.lang.String */] = (Partial[Pick[T, K]]) & (Pick[T, Exclude[/* keyof T */ java.lang.String, K]])

/**
  * From T pick a set of properties K
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  */ typings.minappEnv.minappEnvStrings.Pick & TopLevel[T]

type PromiseConstructorLike = Instantiable1[
/* executor */ js.Function2[
  /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | PromiseLike[js.Object]], Unit], 
  /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
  Unit
], 
PromiseLike[js.Object]]

type PropertyDecorator = js.Function2[/* target */ Object, /* propertyKey */ java.lang.String | js.Symbol, Unit]

type PropertyDescriptorMap = StringDictionary[PropertyDescriptor]

type PropertyKey = java.lang.String | Double | js.Symbol

type RQ[T /* <: OptionalRecordcompletesuc */] = Pick[T, Exclude[/* keyof T */ java.lang.String, complete | success | fail]]

/**
  * Make all properties in T readonly
  */
type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ P in keyof T ]: T[P]}
  */ typings.minappEnv.minappEnvStrings.Readonly & TopLevel[T]

/**
  * Construct a type with a set of properties K of type T
  */
type Record[K /* <: java.lang.String */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T}
  */ typings.minappEnv.minappEnvStrings.Record & TopLevel[Any]

/**
  * Utils
  */
type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: -? T[P]}
  */ typings.minappEnv.minappEnvStrings.Required & TopLevel[T]

type Void[T] = js.UndefOr[T | Null]
