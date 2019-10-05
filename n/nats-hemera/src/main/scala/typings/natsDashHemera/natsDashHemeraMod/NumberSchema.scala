package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.natsDashHemera.natsDashHemeraMod._SchemaLike because Already inherited
- typings.natsDashHemera.natsDashHemeraMod.Schema because Already inherited */ @js.native
trait NumberSchema extends AnySchema {
  /**
    * Specifies that the value must be greater than limit.
    * It can also be a reference to another field.
    */
  def greater(limit: Double): this.type = js.native
  def greater(limit: Reference): this.type = js.native
  /**
    * Requires the number to be an integer (no floating point).
    */
  def integer(): this.type = js.native
  /**
    * Specifies that the value must be less than limit.
    * It can also be a reference to another field.
    */
  def less(limit: Double): this.type = js.native
  def less(limit: Reference): this.type = js.native
  /**
    * Specifies the maximum value.
    * It can also be a reference to another field.
    */
  def max(limit: Double): this.type = js.native
  def max(limit: Reference): this.type = js.native
  /**
    * Specifies the minimum value.
    * It can also be a reference to another field.
    */
  def min(limit: Double): this.type = js.native
  def min(limit: Reference): this.type = js.native
  /**
    * Specifies that the value must be a multiple of base.
    */
  def multiple(base: Double): this.type = js.native
  /**
    * Requires the number to be negative.
    */
  def negative(): this.type = js.native
  /**
    * Requires the number to be positive.
    */
  def positive(): this.type = js.native
  /**
    * Specifies the maximum number of decimal places where:
    * @param limit - the maximum number of decimal places allowed.
    */
  def precision(limit: Double): this.type = js.native
}

