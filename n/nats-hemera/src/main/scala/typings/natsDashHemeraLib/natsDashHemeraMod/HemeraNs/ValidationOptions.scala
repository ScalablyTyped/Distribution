package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found. Defaults to true.
    */
  var abortEarly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * when true, allows object to contain unknown keys which are ignored. Defaults to false.
    */
  var allowUnknown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.undefined
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number). Defaults to true.
    */
  var convert: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * overrides individual error messages. Defaults to no override ({}).
    */
  var language: js.UndefOr[LanguageRootOptions] = js.undefined
  /**
    * when true, do not apply default values. Defaults to false.
    */
  var noDefaults: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'. Defaults to 'optional'.
    */
  var presence: js.UndefOr[
    natsDashHemeraLib.natsDashHemeraLibStrings.optional | natsDashHemeraLib.natsDashHemeraLibStrings.required | natsDashHemeraLib.natsDashHemeraLibStrings.forbidden
  ] = js.undefined
  /**
    * when true, ignores unknown keys with a function value. Defaults to false.
    */
  var skipFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * remove unknown elements from objects and arrays. Defaults to false
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - arrays - set to true to remove unknown items from arrays.
    *      - objects - set to true to remove unknown keys from objects
    */
  var stripUnknown: js.UndefOr[scala.Boolean | natsDashHemeraLib.Anon_Arrays] = js.undefined
}

