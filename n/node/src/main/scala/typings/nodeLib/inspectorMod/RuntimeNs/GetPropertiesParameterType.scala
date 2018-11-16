package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetPropertiesParameterType extends js.Object {
  /**
               * If true, returns accessor properties (with getter/setter) only; internal properties are not
               * returned either.
               * @experimental
               */
  var accessorPropertiesOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether preview should be generated for the results.
               * @experimental
               */
  var generatePreview: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Identifier of the object to return properties for.
               */
  var objectId: RemoteObjectId
  /**
               * If true, returns properties belonging only to the element itself, not to its prototype
               * chain.
               */
  var ownProperties: js.UndefOr[scala.Boolean] = js.undefined
}

