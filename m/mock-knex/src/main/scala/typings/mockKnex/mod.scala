package typings.mockKnex

import typings.mockKnex.mockKnexStrings.query
import typings.mockKnex.mod.Knex.Sql
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mock-knex", "getTracker")
  @js.native
  def getTracker(): Tracker = js.native
  
  @JSImport("mock-knex", "mock")
  @js.native
  def mock(knex: Knex): Unit = js.native
  
  @JSImport("mock-knex", "unmock")
  @js.native
  def unmock(knex: Knex): Unit = js.native
  
  @js.native
  trait Knex extends StObject {
    
    var client: js.Any = js.native
  }
  object Knex {
    
    @scala.inline
    def apply(client: js.Any): Knex = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Knex]
    }
    
    @scala.inline
    implicit class KnexMutableBuilder[Self <: Knex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait Sql extends StObject {
      
      var bindings: js.Any = js.native
      
      var method: String = js.native
      
      var options: js.Any = js.native
      
      var sql: String = js.native
      
      def toNative(): js.Any = js.native
    }
    object Sql {
      
      @scala.inline
      def apply(bindings: js.Any, method: String, options: js.Any, sql: String, toNative: () => js.Any): Sql = {
        val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], toNative = js.Any.fromFunction0(toNative))
        __obj.asInstanceOf[Sql]
      }
      
      @scala.inline
      implicit class SqlMutableBuilder[Self <: Sql] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBindings(value: js.Any): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToNative(value: () => js.Any): Self = StObject.set(x, "toNative", js.Any.fromFunction0(value))
      }
    }
  }
  
  @js.native
  trait QueryDetails extends Sql {
    
    def reject(error: String): Unit = js.native
    /**
      * Function that needs to be called to mock database query result for knex.
      *
      * @param error The Error, string or instance of Error, which represents why the result was rejected
      */
    def reject(error: Error): Unit = js.native
    
    /**
      * Function that needs to be called to mock database query result for knex.
      *
      * @param values An array of mock data to be returned by database. For Bookshelf this is mostly array of objects. Knex could return any type of data.
      */
    def response(values: js.Any): Unit = js.native
    def response(values: js.Any, options: QueryDetailsResponseOption): Unit = js.native
    
    var transacting: Boolean = js.native
  }
  
  @js.native
  trait QueryDetailsResponseOption extends StObject {
    
    /**
      * Is this a stream response, defaults to false
      */
    var stream: Boolean = js.native
  }
  object QueryDetailsResponseOption {
    
    @scala.inline
    def apply(stream: Boolean): QueryDetailsResponseOption = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryDetailsResponseOption]
    }
    
    @scala.inline
    implicit class QueryDetailsResponseOptionMutableBuilder[Self <: QueryDetailsResponseOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tracker extends EventEmitter {
    
    /**
      * Enables query tracking mock on mocked knex client
      */
    def install(): Unit = js.native
    
    /**
      * Add event listener for 'query' event. It gets esecuted for each query that should end up in database.
      * Instead of this callback gets executed and its up to you to assert queries and mock database responses.
      *
      * @param callback A function that gets executed on 'query' event.
      */
    @JSName("on")
    def on_query(event: query, callback: js.Function2[/* query */ QueryDetails, /* step */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_query(event: query, callback: js.Function2[/* query */ QueryDetails, /* step */ Double, Unit]): this.type = js.native
    
    /**
      * Disables query tracking mock on mocked knex client. Also resets 'step' counter.
      */
    def uninstall(): Unit = js.native
  }
}
