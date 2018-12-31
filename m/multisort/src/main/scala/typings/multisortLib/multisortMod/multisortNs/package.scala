package typings
package multisortLib.multisortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multisortNs {
  /**
    * Functional evaluators don't need any transformation, and can't
    *   have inverted order.
    *
    * Numerical evaluators sort the input directly if the criterion is
    *   non-negative, and in inverted order if the criterion is negative.
    *
    * String evaluators sort the input based on objects properties.
    * - Invert the sort if initial character is ! or ~.
    * - Allow an initial dot: ".prop.subprop" as well as "prop.subprop".
    * - Allow existential criterion by tailing question mark: "prop.subprop?".
    */
  type Criterion[T] = (js.Function1[/* item */ T, js.Any]) | scala.Double | java.lang.String
}
