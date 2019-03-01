package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextInfoStruct extends js.Object {
  var name: java.lang.String
  var `object`: js.Object
}

object IContextInfoStruct {
  @scala.inline
  def apply(name: java.lang.String, `object`: js.Object): IContextInfoStruct = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IContextInfoStruct]
  }
}

