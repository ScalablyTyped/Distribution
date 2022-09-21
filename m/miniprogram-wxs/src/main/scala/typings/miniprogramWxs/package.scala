package typings.miniprogramWxs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ClassDecorator = js.Function1[/* target */ Function, Function | Unit]

/**
  * Obtain the parameters of a constructor function type in a tuple
  */
type ConstructorParameters[T /* <: Instantiable1[/* args */ Any, Any] */] = Any

/**
  * Exclude from T those types that are assignable to U
  */
type Exclude[T, U] = T

/**
  * Extract from T those types that are assignable to U
  */
type Extract[T, U] = T

/**
  * Obtain the return type of a constructor function type
  */
type InstanceType[T /* <: Instantiable1[/* args */ Any, Any] */] = Any

type MethodDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[Any], 
TypedPropertyDescriptor[Any] | Unit]

/**
  * Exclude null and undefined from T
  */
type NonNullable[T] = T

/**
  * Construct a type with the properties of T except for those in type K.
  */
type Omit[T, K /* <: /* keyof any */ java.lang.String */] = Pick[T, Exclude[/* keyof T */ java.lang.String, K]]

/**
  * Removes the 'this' parameter from a function type.
  */
type OmitThisParameter[T] = T | (js.Function1[/* args */ Any, Any])

type ParameterDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* parameterIndex */ Double, 
Unit]

/**
  * Obtain the parameters of a function type in a tuple
  */
type Parameters[T /* <: js.Function1[/* args */ Any, Any] */] = Any

/**
  * Make all properties in T optional
  */
type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P]}
  */ typings.miniprogramWxs.miniprogramWxsStrings.Partial & TopLevel[T]

/**
  * From T, pick a set of properties whose keys are in the union K
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  */ typings.miniprogramWxs.miniprogramWxsStrings.Pick & TopLevel[T]

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

/**
  * Make all properties in T readonly
  */
type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ P in keyof T ]: T[P]}
  */ typings.miniprogramWxs.miniprogramWxsStrings.Readonly & TopLevel[T]

/**
  * Construct a type with a set of properties K of type T
  */
type Record[K /* <: /* keyof any */ java.lang.String */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T}
  */ typings.miniprogramWxs.miniprogramWxsStrings.Record & TopLevel[Any]

/**
  * Make all properties in T required
  */
type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: -? T[P]}
  */ typings.miniprogramWxs.miniprogramWxsStrings.Required & TopLevel[T]

/**
  * Obtain the return type of a function type
  */
type ReturnType[T /* <: js.Function1[/* args */ Any, Any] */] = Any

// declare var Function: FunctionConstructor;
/**
  * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
  */
type ThisParameterType[T] = Any
