package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArraySchema extends AnySchema {
  /**
           * List the types allowed for the array values.
           * type can be an array of values, or multiple values can be passed as individual arguments.
           * If a given type is .required() then there must be a matching item in the array.
           * If a type is .forbidden() then it cannot appear in the array.
           * Required items can be added multiple times to signify that multiple items must be found.
           * Errors will contain the number of items that didn't match.
           * Any unmatched item having a label will be mentioned explicitly.
           *
           * @param type - a joi schema object to validate each array item against.
           */
  def items(types: SchemaLike*): this.type = js.native
  def items(types: js.Array[SchemaLike]): this.type = js.native
  /**
           * Specifies the exact number of items in the array.
           */
  def length(limit: scala.Double): this.type = js.native
  /**
           * Specifies the maximum number of items in the array.
           */
  def max(limit: scala.Double): this.type = js.native
  /**
           * Specifies the minimum number of items in the array.
           */
  def min(limit: scala.Double): this.type = js.native
  /**
           * Lists the types in sequence order for the array values where:
           * @param type - a joi schema object to validate against each array item in sequence order.
           * type can be an array of values, or multiple values can be passed as individual arguments.
           * If a given type is .required() then there must be a matching item with the same index position
           * in the array. Errors will contain the number of items that didn't match. Any unmatched item having a label will be mentioned explicitly.
           */
  def ordered(types: SchemaLike*): this.type = js.native
  def ordered(types: js.Array[SchemaLike]): this.type = js.native
  /**
           * Allow single values to be checked against rules as if it were provided as an array.
           * enabled can be used with a falsy value to go back to the default behavior.
           */
  def single(): this.type = js.native
  /**
           * Allow single values to be checked against rules as if it were provided as an array.
           * enabled can be used with a falsy value to go back to the default behavior.
           */
  def single(enabled: js.Any): this.type = js.native
  /**
           * Allow this array to be sparse.
           * enabled can be used with a falsy value to go back to the default behavior.
           */
  def sparse(): this.type = js.native
  /**
           * Allow this array to be sparse.
           * enabled can be used with a falsy value to go back to the default behavior.
           */
  def sparse(enabled: js.Any): this.type = js.native
  /**
           * Requires the array values to be unique.
           * Be aware that a deep equality is performed on elements of the array having a type of object,
           * a performance penalty is to be expected for this kind of operation.
           */
  def unique(): this.type = js.native
  /**
           * Requires the array values to be unique.
           * Be aware that a deep equality is performed on elements of the array having a type of object,
           * a performance penalty is to be expected for this kind of operation.
           */
  def unique(comparator: java.lang.String): this.type = js.native
  def unique[T](comparator: js.Function2[/* a */ T, /* b */ T, scala.Boolean]): this.type = js.native
  @JSName("unique")
  def unique_T[T](): this.type = js.native
}

