package typings.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MeteorAstronomy {
  type Enum[T] = T with typings.meteorAstronomy.AnonGetIdentifier
  type Fields[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.NonFunctionProperties<T> ]: meteor-astronomy.MeteorAstronomy.ModelField<T[P], T>}
    */ typings.meteorAstronomy.meteorAstronomyStrings.Fields with T
  type FunctionProperties[T] = typings.std.Pick[T, typings.meteorAstronomy.MeteorAstronomy.FunctionPropertyNames[T]]
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Helpers[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.FunctionProperties<T> ]: (this : T, args : ...any): any}
    */ typings.meteorAstronomy.meteorAstronomyStrings.Helpers with js.Any
  type Model[T] = T with typings.meteorAstronomy.AnonCopy[T]
  type ModelField[Field, Doc] = (typings.meteorAstronomy.MeteorAstronomy.ModelFullField[Field, Doc]) | typings.meteorAstronomy.MeteorAstronomy.TypeOptions
  type MongoQuery[T] = typings.meteor.Mongo.Selector[T] | typings.meteor.Mongo.ObjectID | java.lang.String
  type NonFunctionProperties[T] = typings.std.Pick[T, typings.meteorAstronomy.MeteorAstronomy.NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type RemoveCallback = js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  type SaveAndValidateCallback = js.Function2[/* err */ js.Any, /* id */ js.Any, scala.Unit]
  type TypeOptions = typings.meteorAstronomy.MeteorAstronomy.TypeOptionsPrimitives | js.Array[typings.meteorAstronomy.MeteorAstronomy.TypeOptionsPrimitives] | typings.meteorAstronomy.MeteorAstronomy.Class[js.Any] | typings.meteorAstronomy.MeteorAstronomy.Enum[js.Any]
  type TypeOptionsPrimitives = typings.std.StringConstructor | typings.std.DateConstructor | typings.std.BooleanConstructor | typings.std.ObjectConstructor | typings.std.NumberConstructor
}
