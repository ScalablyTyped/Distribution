package typings.openfin.entityTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityTypeHelpers extends js.Object {
  var isExternal: Boolean
  var isFrame: Boolean
  var isView: Boolean
  var isWindow: Boolean
}

object EntityTypeHelpers {
  @scala.inline
  def apply(isExternal: Boolean, isFrame: Boolean, isView: Boolean, isWindow: Boolean): EntityTypeHelpers = {
    val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], isFrame = isFrame.asInstanceOf[js.Any], isView = isView.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypeHelpers]
  }
}

