package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindParameter extends js.Object {
  /**
    * The direction of the bind. One of the Execute Bind Direction Constants.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsbinddir
    */
  var dir: js.UndefOr[Double] = js.undefined
  /**
    * The number of array elements to be allocated for a PL/SQL Collection INDEX BY associative
    * array OUT or IN OUT array bind variable. For IN binds, the value of maxArraySize is ignored.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#plsqlindexbybinds
    */
  var maxArraySize: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of bytes that an OUT or IN OUT bind variable of type STRING or BUFFER can use to get data.
    *
    * The maximum limit depends on the database type, see below. When binding IN OUT, then maxSize refers to the
    * size of the returned value: the input value can be smaller or bigger. For IN binds, maxSize is ignored.
    *
    * @default 200
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * The node-oracledb or JavaScript data type to be bound. One of the Node-oracledb Type Constants.
    *
    * With IN or IN OUT binds the type can be explicitly set with type or it will default to the type
    * of the input data value. With OUT binds, the type defaults to oracledb.STRING whenever type is not specified.
    */
  var `type`: js.UndefOr[Double | String] = js.undefined
  /**
    * The input value or variable to be used for an IN or IN OUT bind variable.
    */
  var `val`: js.UndefOr[js.Any] = js.undefined
}

object BindParameter {
  @scala.inline
  def apply(
    dir: Int | Double = null,
    maxArraySize: Int | Double = null,
    maxSize: Int | Double = null,
    `type`: Double | String = null,
    `val`: js.Any = null
  ): BindParameter = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (maxArraySize != null) __obj.updateDynamic("maxArraySize")(maxArraySize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[BindParameter]
  }
}

