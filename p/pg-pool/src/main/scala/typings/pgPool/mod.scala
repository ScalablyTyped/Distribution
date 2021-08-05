package typings.pgPool

import org.scalablytyped.runtime.Instantiable1
import typings.pg.mod.Client
import typings.pg.mod.ClientConfig
import typings.pg.mod.PoolClient
import typings.pg.mod.PoolConfig
import typings.pgPool.pgPoolStrings.acquire
import typings.pgPool.pgPoolStrings.connect
import typings.pgPool.pgPoolStrings.error
import typings.pgPool.pgPoolStrings.remove
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-pool", JSImport.Namespace)
  @js.native
  class ^[T /* <: typings.pg.mod.Client */] () extends Pool[T] {
    def this(config: Config[T]) = this()
    def this(config: Unit, client: ClientLikeCtr[T]) = this()
    def this(config: Config[T], client: ClientLikeCtr[T]) = this()
  }
  
  type ClientLikeCtr[T /* <: Client */] = Instantiable1[/* config */ js.UndefOr[String | ClientConfig], T]
  
  trait Config[T /* <: Client */]
    extends StObject
       with PoolConfig {
    
    var Client: js.UndefOr[ClientLikeCtr[T]] = js.undefined
  }
  object Config {
    
    inline def apply[T /* <: Client */](): Config[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[T]]
    }
    
    extension [Self <: Config[?], T /* <: Client */](x: Self & Config[T]) {
      
      inline def setClient(value: ClientLikeCtr[T]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "Client", js.undefined)
    }
  }
  
  @js.native
  trait Pool[T /* <: typings.pg.mod.Client */]
    extends typings.pg.mod.Pool {
    
    val Client: ClientLikeCtr[T] = js.native
    
    @JSName("on")
    def on_acquire(event: acquire, listener: js.Function1[/* client */ T & PoolClient, Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* client */ T & PoolClient, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function2[/* err */ Error, /* client */ T & PoolClient, Unit]): this.type = js.native
    @JSName("on")
    def on_remove(event: remove, listener: js.Function1[/* client */ T & PoolClient, Unit]): this.type = js.native
  }
}
