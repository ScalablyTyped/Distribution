package typings.pg

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.node.bufferMod.global.Buffer
import typings.pg.mod.Client
import typings.pg.mod.ClientBase
import typings.pg.mod.ClientConfig
import typings.pg.mod.Connection
import typings.pg.mod.ConnectionConfig
import typings.pg.mod.DatabaseError
import typings.pg.mod.Defaults_
import typings.pg.mod.Events
import typings.pg.mod.Pool
import typings.pg.mod.PoolConfig
import typings.pg.mod.Query
import typings.pg.mod.QueryConfig
import typings.pg.mod.QueryResultRow
import typings.pg.pgStrings.binary
import typings.pg.pgStrings.text
import typings.pgProtocol.distMessagesMod.MessageName
import typings.pgTypes.mod.TypeId
import typings.pgTypes.mod.TypeParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](oid: Double): TypeParser[String, T | String] = js.native
    def apply[T](oid: Double, format: binary): TypeParser[Buffer, T | String] = js.native
    def apply[T](oid: Double, format: text): TypeParser[String, T | String] = js.native
    def apply[T](oid: TypeId): TypeParser[String, T | String] = js.native
    def apply[T](oid: TypeId, format: binary): TypeParser[Buffer, T | String] = js.native
    def apply[T](oid: TypeId, format: text): TypeParser[String, T | String] = js.native
  }
  
  trait TypeofPg extends StObject {
    
    var Client: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], typings.pg.mod.Client]
    
    var ClientBase: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], typings.pg.mod.ClientBase]
    
    var Connection: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], typings.pg.mod.Connection]
    
    var DatabaseError: Instantiable3[
        /* message */ String, 
        /* length */ Double, 
        /* name */ MessageName, 
        typings.pg.mod.DatabaseError
      ]
    
    var Events: Instantiable0[typings.pg.mod.Events]
    
    var Pool: Instantiable1[/* config */ js.UndefOr[PoolConfig], typings.pg.mod.Pool]
    
    var Query: Instantiable2[
        /* queryTextOrConfig */ js.UndefOr[
          String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ Any])
        ], 
        /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ Any], 
        typings.pg.mod.Query[QueryResultRow, js.Array[Any]]
      ]
    
    val defaults: Defaults_ & ClientConfig
    
    val native: (/* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any) | Null
  }
  object TypeofPg {
    
    inline def apply(
      Client: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], Client],
      ClientBase: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], ClientBase],
      Connection: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], Connection],
      DatabaseError: Instantiable3[/* message */ String, /* length */ Double, /* name */ MessageName, DatabaseError],
      Events: Instantiable0[Events],
      Pool: Instantiable1[/* config */ js.UndefOr[PoolConfig], Pool],
      Query: Instantiable2[
          /* queryTextOrConfig */ js.UndefOr[
            String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ Any])
          ], 
          /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ Any], 
          Query[QueryResultRow, js.Array[Any]]
        ],
      defaults: Defaults_ & ClientConfig
    ): TypeofPg = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], DatabaseError = DatabaseError.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], native = null)
      __obj.asInstanceOf[TypeofPg]
    }
    
    extension [Self <: TypeofPg](x: Self) {
      
      inline def setClient(value: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], Client]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setClientBase(value: Instantiable1[/* config */ js.UndefOr[String | ClientConfig], ClientBase]): Self = StObject.set(x, "ClientBase", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Instantiable1[/* config */ js.UndefOr[ConnectionConfig], Connection]): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      inline def setDatabaseError(
        value: Instantiable3[/* message */ String, /* length */ Double, /* name */ MessageName, DatabaseError]
      ): Self = StObject.set(x, "DatabaseError", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: Defaults_ & ClientConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: Instantiable0[Events]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setNative(value: /* import warning: importer.ImportType#apply Failed type conversion: typeof Pg */ js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeNull: Self = StObject.set(x, "native", null)
      
      inline def setPool(value: Instantiable1[/* config */ js.UndefOr[PoolConfig], Pool]): Self = StObject.set(x, "Pool", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: Instantiable2[
              /* queryTextOrConfig */ js.UndefOr[
                String | (QueryConfig[/* import warning: RewrittenClass.unapply cls was tparam I */ Any])
              ], 
              /* values */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam I */ Any], 
              Query[QueryResultRow, js.Array[Any]]
            ]
      ): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    }
  }
}
