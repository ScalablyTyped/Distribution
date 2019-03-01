package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILifeCycle extends js.Object {
  var deleted: js.UndefOr[java.lang.String] = js.undefined
  var deletionMessage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var deprecated: js.UndefOr[java.lang.String] = js.undefined
  var deprecationMessage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var introduced: js.UndefOr[java.lang.String] = js.undefined
}

object ILifeCycle {
  @scala.inline
  def apply(
    deleted: java.lang.String = null,
    deletionMessage: java.lang.String = null,
    deprecated: java.lang.String = null,
    deprecationMessage: java.lang.String = null,
    introduced: java.lang.String = null
  ): ILifeCycle = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted)
    if (deletionMessage != null) __obj.updateDynamic("deletionMessage")(deletionMessage)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (deprecationMessage != null) __obj.updateDynamic("deprecationMessage")(deprecationMessage)
    if (introduced != null) __obj.updateDynamic("introduced")(introduced)
    __obj.asInstanceOf[ILifeCycle]
  }
}

