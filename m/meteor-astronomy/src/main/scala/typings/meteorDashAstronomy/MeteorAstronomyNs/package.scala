package typings.meteorDashAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MeteorAstronomyNs {
  import typings.meteor.MongoNs.ObjectID
  import typings.meteor.MongoNs.Selector
  import typings.meteorDashAstronomy.Anon_Callback
  import typings.meteorDashAstronomy.Anon_GetIdentifier
  import typings.std.BooleanConstructor
  import typings.std.DateConstructor
  import typings.std.Exclude
  import typings.std.NumberConstructor
  import typings.std.ObjectConstructor
  import typings.std.Pick
  import typings.std.StringConstructor

  type Enum[T] = T with Anon_GetIdentifier
  type Fields[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.NonFunctionProperties<T> ]: meteor-astronomy.MeteorAstronomy.ModelField<T[P], T>}
    */ typings.meteorDashAstronomy.meteorDashAstronomyStrings.Fields with T
  type FunctionProperties[T] = Pick[T, FunctionPropertyNames[T]]
  type FunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Helpers[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.FunctionProperties<T> ]: (this : T, args : ...any): any}
    */ typings.meteorDashAstronomy.meteorDashAstronomyStrings.Helpers with js.Any
  type Model[T] = T with Anon_Callback[T]
  type ModelField[Field, Doc] = (ModelFullField[Field, Doc]) | TypeOptions
  type MongoQuery[T] = Selector[T] | ObjectID | String
  type NonFunctionProperties[T] = Pick[T, NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type RemoveCallback = js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
  type SaveAndValidateCallback = js.Function2[/* err */ js.Any, /* id */ js.Any, Unit]
  type TypeOptions = TypeOptionsPrimitives | js.Array[TypeOptionsPrimitives] | Class[js.Any] | Enum[js.Any]
  type TypeOptionsPrimitives = StringConstructor | DateConstructor | BooleanConstructor | ObjectConstructor | NumberConstructor
}
