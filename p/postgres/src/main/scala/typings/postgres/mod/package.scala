package typings.postgres.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postgres.anon.ToJSON
import typings.postgres.mod.^
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Establish a connection to a PostgreSQL server.
  * @param options Connection options - default to the same as psql
  * @returns An utility function to make queries to the server
  */
inline def apply[T /* <: Record[String, PostgresType[Any]] */](): Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any]]
inline def apply[T /* <: Record[String, PostgresType[Any]] */](options: Options[T]): Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any]]
/**
  * Establish a connection to a PostgreSQL server.
  * @param url Connection string used for authentication
  * @param options Connection options - default to the same as psql
  * @returns An utility function to make queries to the server
  */
inline def apply[T /* <: Record[String, PostgresType[Any]] */](url: String): Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any]]
inline def apply[T /* <: Record[String, PostgresType[Any]] */](url: String, options: Options[T]): Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sql[
/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, postgres.postgres.PostgresType<any>> extends T ? {} : {[ type in keyof T ]: T[type] extends {serialize (value : infer R): any, parse (raw : any): infer R}? R : never} */ js.Any]]

inline def BigInt: PostgresType[js.BigInt] = ^.asInstanceOf[js.Dynamic].selectDynamic("BigInt").asInstanceOf[PostgresType[js.BigInt]]

type ColumnList[T] = js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? postgres.postgres.Column<T> : never */ js.Any]

/* Rewritten from type alias, can be one of: 
  - scala.Nothing
  - typings.postgres.mod.PostgresError
  - typings.postgres.mod.ConnectionError
  - typings.postgres.mod.NotSupportedError
  - typings.postgres.mod.GenericError
  - typings.postgres.mod.AuthNotImplementedError
*/
type Error = _Error | scala.Nothing

type EscapableArray = js.Array[String | Double]

type ExecutionResult[T] = js.Array[Any] & (ResultQueryMeta[Double, /* keyof std.NonNullable<T> */ String])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Tagged template string call
T extends std.TemplateStringsArray ? std.TemplateStringsArray : // Identifiers helper
T extends string ? string : // Dynamic values helper (depth 2)
T extends std.Array<std.Array<any>> ? std.Array<postgres.postgres.EscapableArray> : // Insert/update helper (depth 2)
T extends std.Array<object & infer R> ? R extends postgres.postgres.SerializableParameter<TT> ? std.Array<postgres.postgres.SerializableParameter<TT>> : std.Array<postgres.postgres.SerializableObject<R, K, TT>> : // Dynamic values/ANY helper (depth 1)
T extends std.Array<any> ? std.Array<postgres.postgres.SerializableParameter<TT>> : // Insert/update helper (depth 1)
T extends object ? postgres.postgres.SerializableObject<T, K, TT> : // Unexpected type
never
  }}}
  */
type First[T, K /* <: js.Array[Any] */, TT] = TemplateStringsArray

type Fragment = PendingQuery[Any]

/** 
NOTE: Rewritten from type alias:
{{{
type JSONValue = null | string | number | boolean | std.Date | std.Array<postgres.postgres.JSONValue> | {toJSON (): any} | {readonly [prop: string | number] : undefined | postgres.postgres.JSONValue | (args : any): any}
}}}
to avoid circular code involving: 
- postgres.postgres.JSONValue
*/
type JSONValue = Null | String | Double | Boolean | js.Date | js.Array[Any] | ToJSON | (StringDictionary[js.UndefOr[Any | (js.Function1[/* args */ Any, Any])]])

type Keys = String

type ListenRequest = js.Promise[ListenMeta]

type MaybeRow = js.UndefOr[Row]

type Notice = StringDictionary[String]

type ParameterOrFragment[T] = SerializableParameter[T] | Fragment

/** 
NOTE: Rewritten from type alias:
{{{
type ParameterOrJSON = postgres.postgres.SerializableParameter<T> | postgres.postgres.JSONValue
}}}
to avoid circular code involving: 
- postgres.postgres.JSONValue
- postgres.postgres.ParameterOrJSON
*/
type ParameterOrJSON[T] = SerializableParameter[T] | Any

type PendingDescribeQuery = js.Promise[Statement]

type PendingRequest = js.Promise[js.Array[Any] & ResultMeta[Null]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.TemplateStringsArray ? never : // force fallback to the tagged template function overload
T extends string ? std.Array<string> : T extends std.Array<std.Array<any>> ? [] : T extends std.Array<object & infer R> ? std.Array<postgres.postgres.Keys & keyof R> : T extends std.Array<any> ? [] : T extends object ? std.Array<postgres.postgres.Keys & keyof T> : any
  }}}
  */
type Rest[T] = js.Array[String]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [std.TemplateStringsArray] ? [unknown] extends [T] ? postgres.postgres.Helper<T, K> : [std.TemplateStringsArray] extends [T] ? postgres.postgres.PendingQuery<std.Array<postgres.postgres.Row>> : postgres.postgres.Helper<T, K> : postgres.postgres.Helper<T, K>
  }}}
  */
type Return[T, K /* <: js.Array[Any] */] = Helper[T, K]

type Row = StringDictionary[Any]

type RowList[T /* <: js.Array[Any] */] = T & (js.Iterable[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
]]) & (ResultQueryMeta[
/* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: keyof T[number] */ js.Any])

type Serializable = scala.Nothing | Null | Boolean | Double | String | js.Date | js.typedarray.Uint8Array

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  number extends K['length'] ? {} : std.Partial<std.Record<postgres.postgres.Keys & keyof T & K['length'] extends 0 ? string : K[number], postgres.postgres.ParameterOrJSON<TT> | undefined> & std.Record<string, any>>
  }}}
  */
type SerializableObject[T, K /* <: js.Array[Any] */, TT] = Partial[
(Record[
  Keys & (/* keyof T */ String) & (/* import warning: importer.ImportType#apply Failed type conversion: K['length'] extends 0 ? string : K[number] */ js.Any), 
  js.UndefOr[ParameterOrJSON[TT]]
]) & (Record[String, Any])]

/** 
NOTE: Rewritten from type alias:
{{{
type SerializableParameter = never | T | postgres.postgres.Serializable | postgres.postgres.Helper<any, std.Array<any>> | postgres.postgres.Parameter<any> | postgres.postgres.ArrayParameter<std.Array<any>> | std.Array<postgres.postgres.SerializableParameter<T>>
}}}
to avoid circular code involving: 
- postgres.postgres.ParameterOrFragment
- postgres.postgres.ParameterOrJSON
- postgres.postgres.SerializableParameter
*/
type SerializableParameter[T] = scala.Nothing | T | Serializable | (Helper[Any, js.Array[Any]]) | Parameter[Any] | ArrayParameter[js.Array[Any]] | js.Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Array<any> ? {[ k in keyof T ]: T[k] extends std.Promise<infer R>? R : T[k]} : T
  }}}
  */
type UnwrapPromiseArray[T] = T
