package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JOI extends js.Object {
  var version: java.lang.String = js.native
  def alt(types: SchemaLike*): AlternativesSchema = js.native
  def alt(types: js.Array[SchemaLike]): AlternativesSchema = js.native
  def alternatives(types: SchemaLike*): AlternativesSchema = js.native
  def alternatives(types: js.Array[SchemaLike]): AlternativesSchema = js.native
  def any(): AnySchema = js.native
  def array(): ArraySchema = js.native
  def assert(value: js.Any, schema: SchemaLike): js.UndefOr[scala.Nothing] = js.native
  def assert(value: js.Any, schema: SchemaLike, message: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def assert(value: js.Any, schema: SchemaLike, message: stdLib.Error): js.UndefOr[scala.Nothing] = js.native
  def attempt[T](value: T, schema: SchemaLike): T = js.native
  def attempt[T](value: T, schema: SchemaLike, message: java.lang.String): T = js.native
  def attempt[T](value: T, schema: SchemaLike, message: stdLib.Error): T = js.native
  def binary(): BinarySchema = js.native
  def bool(): BooleanSchema = js.native
  def compile(schema: SchemaLike): Schema = js.native
  def date(): DateSchema = js.native
  def func(): FunctionSchema = js.native
  def isRef(ref: js.Any): /* is nats-hemera.nats-hemera.Reference */ scala.Boolean = js.native
  def `lazy`(cb: js.Function0[Schema]): AnySchema = js.native
  def number(): NumberSchema = js.native
  def `object`(): ObjectSchema = js.native
  def `object`(schema: SchemaMap): ObjectSchema = js.native
  def reach(schema: ObjectSchema, path: java.lang.String): Schema = js.native
  def ref(key: java.lang.String): Reference = js.native
  def ref(key: java.lang.String, options: ReferenceOptions): Reference = js.native
  def string(): StringSchema = js.native
  def validate[T](value: T, schema: SchemaLike): ValidationResult[T] = js.native
  def validate[T, R](value: T, schema: SchemaLike, callback: js.Function2[/* err */ ValidationError, /* value */ T, R]): R = js.native
  def validate[T, R](
    value: T,
    schema: SchemaLike,
    options: ValidationOptions,
    callback: js.Function2[/* err */ ValidationError, /* value */ T, R]
  ): R = js.native
}

