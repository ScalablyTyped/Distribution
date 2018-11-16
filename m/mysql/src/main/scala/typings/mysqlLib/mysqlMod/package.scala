package typings
package mysqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mysqlMod {
  type TypeCast = scala.Boolean | (js.Function2[
    /* field */ FieldInfo with mysqlLib.Anon_Buffer, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ])
  type packetCallback = js.Function1[/* packet */ js.Any, scala.Unit]
  type queryCallback = js.Function3[
    /* err */ MysqlError | scala.Null, 
    /* results */ js.UndefOr[js.Any], 
    /* fields */ js.UndefOr[js.Array[FieldInfo]], 
    scala.Unit
  ]
}
