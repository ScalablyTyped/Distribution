package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents function call argument. Either remote object id `objectId`, primitive `value`,
         * unserializable primitive value or neither of (for undefined) them should be specified.
         */

trait CallArgument extends js.Object {
  /**
               * Remote object handle.
               */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  /**
               * Primitive value which can not be JSON-stringified.
               */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  /**
               * Primitive value or serializable javascript object.
               */
  var value: js.UndefOr[js.Any] = js.undefined
}

