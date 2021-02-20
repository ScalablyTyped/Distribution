package typings.pg

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pg.mod.Client
import typings.pg.mod.ClientBase
import typings.pg.mod.ClientConfig
import typings.pg.mod.Connection
import typings.pg.mod.ConnectionConfig
import typings.pg.mod.Defaults_
import typings.pg.mod.Events
import typings.pg.mod.Pool
import typings.pg.mod.PoolConfig
import typings.pg.mod.Query
import typings.pg.mod.QueryConfig
import typings.pg.mod.QueryResultRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofPg extends StObject {
    
    var Client: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], typings.pg.mod.Client] = js.native
    
    var ClientBase: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], typings.pg.mod.ClientBase] = js.native
    
    var Connection: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], typings.pg.mod.Connection] = js.native
    
    var Events: Instantiable0[typings.pg.mod.Events] = js.native
    
    var Pool: Instantiable1[/* config */ js.UndefOr[PoolConfig], typings.pg.mod.Pool] = js.native
    
    var Query: Instantiable2[
        /* queryTextOrConfig */ js.UndefOr[
          String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
        ], 
        /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any], 
        typings.pg.mod.Query[QueryResultRow, js.Array[js.Any]]
      ] = js.native
    
    val defaults: Defaults_ with ClientConfig = js.native
    
    val native: (/* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any) | Null = js.native
  }
  object TypeofPg {
    
    @scala.inline
    def apply(
      Client: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], Client],
      ClientBase: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], ClientBase],
      Connection: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], Connection],
      Events: Instantiable0[Events],
      Pool: Instantiable1[/* config */ js.UndefOr[PoolConfig], Pool],
      Query: Instantiable2[
          /* queryTextOrConfig */ js.UndefOr[
            String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
          ], 
          /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any], 
          Query[QueryResultRow, js.Array[js.Any]]
        ],
      defaults: Defaults_ with ClientConfig
    ): TypeofPg = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofPg]
    }
    
    @scala.inline
    implicit class TypeofPgMutableBuilder[Self <: TypeofPg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], Client]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientBase(value: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], ClientBase]): Self = StObject.set(x, "ClientBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnection(value: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], Connection]): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults(value: Defaults_ with ClientConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: Instantiable0[Events]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNative(value: /* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeNull: Self = StObject.set(x, "native", null)
      
      @scala.inline
      def setPool(value: Instantiable1[/* config */ js.UndefOr[PoolConfig], Pool]): Self = StObject.set(x, "Pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(
        value: Instantiable2[
              /* queryTextOrConfig */ js.UndefOr[
                String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any])
              ], 
              /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ js.Any], 
              Query[QueryResultRow, js.Array[js.Any]]
            ]
      ): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    }
  }
}
