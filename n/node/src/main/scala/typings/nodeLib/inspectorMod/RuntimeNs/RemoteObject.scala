package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Mirror object referencing original JavaScript object.
         */

trait RemoteObject extends js.Object {
  /**
               * Object class (constructor) name. Specified for `object` type values only.
               */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
               * @experimental
               */
  var customPreview: js.UndefOr[CustomPreview] = js.undefined
  /**
               * String representation of the object.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Unique object identifier (for non-primitive values).
               */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  /**
               * Preview containing abbreviated property values. Specified for `object` type values only.
               * @experimental
               */
  var preview: js.UndefOr[ObjectPreview] = js.undefined
  /**
               * Object subtype hint. Specified for `object` type values only.
               */
  var subtype: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Object type.
               */
  var `type`: java.lang.String
  /**
               * Primitive value which can not be JSON-stringified does not have `value`, but gets this
               * property.
               */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  /**
               * Remote object value in case of primitive values or JSON values (if it was requested).
               */
  var value: js.UndefOr[js.Any] = js.undefined
}

