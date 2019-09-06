package typings.pg

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pg.pgMod.Client
import typings.pg.pgMod.ClientBase
import typings.pg.pgMod.ClientConfig
import typings.pg.pgMod.Connection
import typings.pg.pgMod.ConnectionConfig
import typings.pg.pgMod.Defaults
import typings.pg.pgMod.Events
import typings.pg.pgMod.Pool
import typings.pg.pgMod.PoolConfig
import typings.pg.pgMod.Query
import typings.pg.pgMod.QueryConfig
import typings.pg.pgMod.QueryResultRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofPg extends js.Object {
  var Client: Instantiable1[js.UndefOr[String | ClientConfig], typings.pg.pgMod.Client]
  var ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], typings.pg.pgMod.ClientBase]
  var Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], typings.pg.pgMod.Connection]
  var Events: Instantiable0[typings.pg.pgMod.Events]
  var Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], typings.pg.pgMod.Pool]
  var Query: Instantiable2[
    js.UndefOr[
      String | (QueryConfig[/* import warning: RewrittenClass.unapply cls $anonfun was tparam I */ js.Any])
    ], 
    js.UndefOr[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam I */ /* values */ js.Any
    ], 
    typings.pg.pgMod.Query[QueryResultRow, js.Array[js.Any]]
  ]
  val defaults: Defaults with ClientConfig
  val native: (/* import warning: ImportType.apply Failed type conversion: typeof Pg */ js.Any) | Null
}

object TypeofPg {
  @scala.inline
  def apply(
    Client: Instantiable1[js.UndefOr[String | ClientConfig], Client],
    ClientBase: Instantiable1[js.UndefOr[String | ClientConfig], ClientBase],
    Connection: Instantiable1[js.UndefOr[/* config */ ConnectionConfig], Connection],
    Events: Instantiable0[Events],
    Pool: Instantiable1[js.UndefOr[/* config */ PoolConfig], Pool],
    Query: Instantiable2[
      js.UndefOr[
        String | (QueryConfig[/* import warning: RewrittenClass.unapply cls $anonfun was tparam I */ js.Any])
      ], 
      js.UndefOr[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam I */ /* values */ js.Any
      ], 
      Query[QueryResultRow, js.Array[js.Any]]
    ],
    defaults: Defaults with ClientConfig,
    native: /* import warning: ImportType.apply Failed type conversion: typeof Pg */ js.Any = null
  ): TypeofPg = {
    val __obj = js.Dynamic.literal(Client = Client, ClientBase = ClientBase, Connection = Connection, Events = Events, Pool = Pool, Query = Query, defaults = defaults)
    if (native != null) __obj.updateDynamic("native")(native)
    __obj.asInstanceOf[TypeofPg]
  }
}

