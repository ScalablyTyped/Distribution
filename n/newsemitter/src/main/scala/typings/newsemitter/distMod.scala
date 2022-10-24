package typings.newsemitter

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("newsemitter/dist", JSImport.Default)
  @js.native
  /**
    * Emits only new events.
    
    * @param {Object} options
    * @constructor
    */
  open class default () extends NewsEmitter {
    def this(options: Options) = this()
  }
  
  /* Inlined std.Required<newsemitter.newsemitter/dist.Options> */
  trait DefaultOptions extends StObject {
    
    var filter: js.Array[String]
    
    def identifier(args: js.Array[Any]): String
    @JSName("identifier")
    var identifier_Original: js.Function1[/* args */ js.Array[Any], String]
    
    var ignore: js.Array[String]
    
    var manageHistory: Boolean
    
    var maxHistory: Double
  }
  object DefaultOptions {
    
    inline def apply(
      filter: js.Array[String],
      identifier: /* args */ js.Array[Any] => String,
      ignore: js.Array[String],
      manageHistory: Boolean,
      maxHistory: Double
    ): DefaultOptions = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], identifier = js.Any.fromFunction1(identifier), ignore = ignore.asInstanceOf[js.Any], manageHistory = manageHistory.asInstanceOf[js.Any], maxHistory = maxHistory.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setIdentifier(value: /* args */ js.Array[Any] => String): Self = StObject.set(x, "identifier", js.Any.fromFunction1(value))
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setManageHistory(value: Boolean): Self = StObject.set(x, "manageHistory", value.asInstanceOf[js.Any])
      
      inline def setMaxHistory(value: Double): Self = StObject.set(x, "maxHistory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewsEmitter extends EventEmitter {
    
    /**
      * Adds one history item to an event's history.
      *
      * @param {Set} tistory
      * @param {string} key
      */
    def _addHistory(tistory: Set[String], key: String): Unit = js.native
    
    /**
      * Manual managing of event history.
      *
      * @param {string} event
      * @param {Array.<Object>} arr An array of items to add to history.
      */
    def addHistory(event: String, arr: js.Array[Any]): Unit = js.native
    
    var history: Map[String, Set[String]] = js.native
    
    var options: DefaultOptions = js.native
    
    /**
      * Resets event history.
      *
      * @param {!String} event
      */
    def reset(): Unit = js.native
    def reset(event: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var filter: js.UndefOr[Null | js.Array[String]] = js.undefined
    
    var identifier: js.UndefOr[js.Function1[/* args */ js.Array[Any], String]] = js.undefined
    
    var ignore: js.UndefOr[Null | js.Array[String]] = js.undefined
    
    var manageHistory: js.UndefOr[Boolean] = js.undefined
    
    var maxHistory: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterNull: Self = StObject.set(x, "filter", null)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setIdentifier(value: /* args */ js.Array[Any] => String): Self = StObject.set(x, "identifier", js.Any.fromFunction1(value))
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setManageHistory(value: Boolean): Self = StObject.set(x, "manageHistory", value.asInstanceOf[js.Any])
      
      inline def setManageHistoryUndefined: Self = StObject.set(x, "manageHistory", js.undefined)
      
      inline def setMaxHistory(value: Double): Self = StObject.set(x, "maxHistory", value.asInstanceOf[js.Any])
      
      inline def setMaxHistoryUndefined: Self = StObject.set(x, "maxHistory", js.undefined)
    }
  }
}
