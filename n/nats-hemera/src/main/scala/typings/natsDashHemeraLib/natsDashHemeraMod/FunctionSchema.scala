package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- natsDashHemeraLib.natsDashHemeraMod.Schema because Already inherited */ @js.native
trait FunctionSchema extends AnySchema {
  /**
    * Specifies the arity of the function where:
    * @param n - the arity expected.
    */
  def arity(n: scala.Double): this.type = js.native
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def maxArity(n: scala.Double): this.type = js.native
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def minArity(n: scala.Double): this.type = js.native
  /**
    * Requires the function to be a Joi reference.
    */
  def ref(): this.type = js.native
}

