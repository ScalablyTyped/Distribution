package typings.mysql

import typings.mysql.Anon_Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mysqlMod {
  type TypeCast = Boolean | (js.Function2[/* field */ FieldInfo with Anon_Buffer, /* next */ js.Function0[Unit], js.Any])
  type packetCallback = js.Function1[/* packet */ js.Any, Unit]
  type queryCallback = js.Function3[
    /* err */ MysqlError | Null, 
    /* results */ js.UndefOr[js.Any], 
    /* fields */ js.UndefOr[js.Array[FieldInfo]], 
    Unit
  ]
}
