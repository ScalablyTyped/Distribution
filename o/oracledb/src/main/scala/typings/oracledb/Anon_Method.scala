package typings.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  /**
    * Method used to compute version values for objects when they are inserted into a collection or replaced.
    *
    * @default SHA256
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * Name of the column that stores the document version.
    *
    * @default VERSION
    */
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Method {
  @scala.inline
  def apply(method: String = null, name: String = null): Anon_Method = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Method]
  }
}

