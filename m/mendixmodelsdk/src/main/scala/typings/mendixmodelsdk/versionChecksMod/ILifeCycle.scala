package typings.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILifeCycle extends js.Object {
  var deleted: js.UndefOr[String] = js.undefined
  var deletionMessage: js.UndefOr[String | Null] = js.undefined
  var deprecated: js.UndefOr[String] = js.undefined
  var deprecationMessage: js.UndefOr[String | Null] = js.undefined
  var introduced: js.UndefOr[String] = js.undefined
}

object ILifeCycle {
  @scala.inline
  def apply(
    deleted: String = null,
    deletionMessage: String = null,
    deprecated: String = null,
    deprecationMessage: String = null,
    introduced: String = null
  ): ILifeCycle = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (deletionMessage != null) __obj.updateDynamic("deletionMessage")(deletionMessage.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage.asInstanceOf[js.Any])
    if (introduced != null) __obj.updateDynamic("introduced")(introduced.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILifeCycle]
  }
}

