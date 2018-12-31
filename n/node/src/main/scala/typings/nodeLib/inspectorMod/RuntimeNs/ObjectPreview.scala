package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing abbreviated remote object value.
  * @experimental
  */
trait ObjectPreview extends js.Object {
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of the entries. Specified for `map` and `set` subtype values only.
    */
  var entries: js.UndefOr[js.Array[EntryPreview]] = js.undefined
  /**
    * True iff some of the properties or entries of the original object did not fit.
    */
  var overflow: scala.Boolean
  /**
    * List of the properties.
    */
  var properties: js.Array[PropertyPreview]
  /**
    * Object subtype hint. Specified for `object` type values only.
    */
  var subtype: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Object type.
    */
  var `type`: java.lang.String
}

