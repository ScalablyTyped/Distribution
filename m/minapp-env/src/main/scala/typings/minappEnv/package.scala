package typings.minappEnv

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
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

type IAPIFunction[T, P /* <: IAPIParam[T] */] = js.Function1[/* param */ P, Promise[T] | Any]

type IAnyObject = Record[java.lang.String, Any]

type ICloudServices = StringDictionary[ICloudService]

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in keyof T ]: T[K]}
  }}}
  */
type KVInfer[T] = T

type MethodDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[Any], 
TypedPropertyDescriptor[Any] | Unit]

type OQ[T /* <: OptionalRecordcompletesuc */] = (RQ[T] & (Required[Pick[T, success]])) | (RQ[T] & (Required[Pick[T, fail]])) | (RQ[T] & (Required[Pick[T, complete]])) | (RQ[T] & (Required[Pick[T, success | fail]])) | (RQ[T] & (Required[Pick[T, success | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete | success]]))

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in keyof T ]:? T[K]}
  }}}
  */
type Optional[T] = T

type ParameterDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* parameterIndex */ Double, 
Unit]

/**
  * Make all properties in T optional
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]:? T[P]}
  }}}
  */
type Partial[T] = T

type PartialOptional[T, K /* <: /* keyof T */ java.lang.String */] = (Partial[Pick[T, K]]) & (Pick[T, Exclude[/* keyof T */ java.lang.String, K]])

/**
  * From T pick a set of properties K
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in K ]: T[P]}
  }}}
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = T

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
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {readonly [ P in keyof T ]: T[P]}
  }}}
  */
type Readonly[T] = T

/**
  * Construct a type with a set of properties K of type T
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation throws away the known field names. 
  * TS definition: {{{
  {[ P in K ]: T}
  }}}
  */
type Record[K /* <: java.lang.String */, T] = StringDictionary[T]

/**
  * Utils
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]: -? T[P]}
  }}}
  */
type Required[T] = T

type Void[T] = js.UndefOr[T | Null]
