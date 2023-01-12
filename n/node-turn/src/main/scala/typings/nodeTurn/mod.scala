package typings.nodeTurn

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-turn", JSImport.Namespace)
  @js.native
  open class ^ () extends TurnServer {
    def this(options: TurnOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeTurn.nodeTurnStrings.none
    - typings.nodeTurn.nodeTurnStrings.`short-term`
    - typings.nodeTurn.nodeTurnStrings.`long-term`
  */
  trait TurnAuthMech extends StObject
  object TurnAuthMech {
    
    inline def `long-term`: typings.nodeTurn.nodeTurnStrings.`long-term` = "long-term".asInstanceOf[typings.nodeTurn.nodeTurnStrings.`long-term`]
    
    inline def none: typings.nodeTurn.nodeTurnStrings.none = "none".asInstanceOf[typings.nodeTurn.nodeTurnStrings.none]
    
    inline def `short-term`: typings.nodeTurn.nodeTurnStrings.`short-term` = "short-term".asInstanceOf[typings.nodeTurn.nodeTurnStrings.`short-term`]
  }
  
  type TurnCredentials = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeTurn.nodeTurnStrings.OFF
    - typings.nodeTurn.nodeTurnStrings.FATAL
    - typings.nodeTurn.nodeTurnStrings.ERROR
    - typings.nodeTurn.nodeTurnStrings.WARN
    - typings.nodeTurn.nodeTurnStrings.INFO
    - typings.nodeTurn.nodeTurnStrings.DEBUG
    - typings.nodeTurn.nodeTurnStrings.TRACE
    - typings.nodeTurn.nodeTurnStrings.ALL
  */
  trait TurnDebugLevel extends StObject
  object TurnDebugLevel {
    
    inline def ALL: typings.nodeTurn.nodeTurnStrings.ALL = "ALL".asInstanceOf[typings.nodeTurn.nodeTurnStrings.ALL]
    
    inline def DEBUG: typings.nodeTurn.nodeTurnStrings.DEBUG = "DEBUG".asInstanceOf[typings.nodeTurn.nodeTurnStrings.DEBUG]
    
    inline def ERROR: typings.nodeTurn.nodeTurnStrings.ERROR = "ERROR".asInstanceOf[typings.nodeTurn.nodeTurnStrings.ERROR]
    
    inline def FATAL: typings.nodeTurn.nodeTurnStrings.FATAL = "FATAL".asInstanceOf[typings.nodeTurn.nodeTurnStrings.FATAL]
    
    inline def INFO: typings.nodeTurn.nodeTurnStrings.INFO = "INFO".asInstanceOf[typings.nodeTurn.nodeTurnStrings.INFO]
    
    inline def OFF: typings.nodeTurn.nodeTurnStrings.OFF = "OFF".asInstanceOf[typings.nodeTurn.nodeTurnStrings.OFF]
    
    inline def TRACE: typings.nodeTurn.nodeTurnStrings.TRACE = "TRACE".asInstanceOf[typings.nodeTurn.nodeTurnStrings.TRACE]
    
    inline def WARN: typings.nodeTurn.nodeTurnStrings.WARN = "WARN".asInstanceOf[typings.nodeTurn.nodeTurnStrings.WARN]
  }
  
  /* Inlined parent std.Partial<node-turn.node-turn.TurnProps> */
  trait TurnOptions extends StObject {
    
    var authMech: js.UndefOr[TurnAuthMech] = js.undefined
    
    var credentials: js.UndefOr[TurnCredentials] = js.undefined
    
    var debug: js.UndefOr[js.Function2[/* debugLevel */ TurnDebugLevel, /* message */ String, Unit]] = js.undefined
    
    var debugLevel: js.UndefOr[TurnDebugLevel] = js.undefined
    
    var defaultAllocatetLifetime: js.UndefOr[Double] = js.undefined
    
    var externalIps: js.UndefOr[String | StringDictionary[String] | Null] = js.undefined
    
    var listeningIps: js.UndefOr[js.Array[String]] = js.undefined
    
    var listeningPort: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var maxAllocateLifetime: js.UndefOr[Double] = js.undefined
    
    var maxPort: js.UndefOr[Double] = js.undefined
    
    var minPort: js.UndefOr[Double] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var relayIps: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TurnOptions {
    
    inline def apply(): TurnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TurnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TurnOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthMech(value: TurnAuthMech): Self = StObject.set(x, "authMech", value.asInstanceOf[js.Any])
      
      inline def setAuthMechUndefined: Self = StObject.set(x, "authMech", js.undefined)
      
      inline def setCredentials(value: TurnCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDebug(value: (/* debugLevel */ TurnDebugLevel, /* message */ String) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setDebugLevel(value: TurnDebugLevel): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
      
      inline def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefaultAllocatetLifetime(value: Double): Self = StObject.set(x, "defaultAllocatetLifetime", value.asInstanceOf[js.Any])
      
      inline def setDefaultAllocatetLifetimeUndefined: Self = StObject.set(x, "defaultAllocatetLifetime", js.undefined)
      
      inline def setExternalIps(value: String | StringDictionary[String]): Self = StObject.set(x, "externalIps", value.asInstanceOf[js.Any])
      
      inline def setExternalIpsNull: Self = StObject.set(x, "externalIps", null)
      
      inline def setExternalIpsUndefined: Self = StObject.set(x, "externalIps", js.undefined)
      
      inline def setListeningIps(value: js.Array[String]): Self = StObject.set(x, "listeningIps", value.asInstanceOf[js.Any])
      
      inline def setListeningIpsUndefined: Self = StObject.set(x, "listeningIps", js.undefined)
      
      inline def setListeningIpsVarargs(value: String*): Self = StObject.set(x, "listeningIps", js.Array(value*))
      
      inline def setListeningPort(value: Double): Self = StObject.set(x, "listeningPort", value.asInstanceOf[js.Any])
      
      inline def setListeningPortUndefined: Self = StObject.set(x, "listeningPort", js.undefined)
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMaxAllocateLifetime(value: Double): Self = StObject.set(x, "maxAllocateLifetime", value.asInstanceOf[js.Any])
      
      inline def setMaxAllocateLifetimeUndefined: Self = StObject.set(x, "maxAllocateLifetime", js.undefined)
      
      inline def setMaxPort(value: Double): Self = StObject.set(x, "maxPort", value.asInstanceOf[js.Any])
      
      inline def setMaxPortUndefined: Self = StObject.set(x, "maxPort", js.undefined)
      
      inline def setMinPort(value: Double): Self = StObject.set(x, "minPort", value.asInstanceOf[js.Any])
      
      inline def setMinPortUndefined: Self = StObject.set(x, "minPort", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setRelayIps(value: js.Array[String]): Self = StObject.set(x, "relayIps", value.asInstanceOf[js.Any])
      
      inline def setRelayIpsUndefined: Self = StObject.set(x, "relayIps", js.undefined)
      
      inline def setRelayIpsVarargs(value: String*): Self = StObject.set(x, "relayIps", js.Array(value*))
    }
  }
  
  trait TurnProps extends StObject {
    
    var authMech: TurnAuthMech
    
    def debug(debugLevel: TurnDebugLevel, message: String): Unit
    
    var debugLevel: TurnDebugLevel
    
    var defaultAllocatetLifetime: Double
    
    var externalIps: String | StringDictionary[String] | Null
    
    var listeningIps: js.Array[String]
    
    var listeningPort: Double
    
    def log(args: Any*): Unit
    
    var maxAllocateLifetime: Double
    
    var maxPort: Double
    
    var minPort: Double
    
    var realm: String
    
    var relayIps: js.Array[String]
  }
  object TurnProps {
    
    inline def apply(
      authMech: TurnAuthMech,
      debug: (TurnDebugLevel, String) => Unit,
      debugLevel: TurnDebugLevel,
      defaultAllocatetLifetime: Double,
      listeningIps: js.Array[String],
      listeningPort: Double,
      log: /* repeated */ Any => Unit,
      maxAllocateLifetime: Double,
      maxPort: Double,
      minPort: Double,
      realm: String,
      relayIps: js.Array[String]
    ): TurnProps = {
      val __obj = js.Dynamic.literal(authMech = authMech.asInstanceOf[js.Any], debug = js.Any.fromFunction2(debug), debugLevel = debugLevel.asInstanceOf[js.Any], defaultAllocatetLifetime = defaultAllocatetLifetime.asInstanceOf[js.Any], listeningIps = listeningIps.asInstanceOf[js.Any], listeningPort = listeningPort.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), maxAllocateLifetime = maxAllocateLifetime.asInstanceOf[js.Any], maxPort = maxPort.asInstanceOf[js.Any], minPort = minPort.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], relayIps = relayIps.asInstanceOf[js.Any], externalIps = null)
      __obj.asInstanceOf[TurnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TurnProps] (val x: Self) extends AnyVal {
      
      inline def setAuthMech(value: TurnAuthMech): Self = StObject.set(x, "authMech", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: (TurnDebugLevel, String) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setDebugLevel(value: TurnDebugLevel): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
      
      inline def setDefaultAllocatetLifetime(value: Double): Self = StObject.set(x, "defaultAllocatetLifetime", value.asInstanceOf[js.Any])
      
      inline def setExternalIps(value: String | StringDictionary[String]): Self = StObject.set(x, "externalIps", value.asInstanceOf[js.Any])
      
      inline def setExternalIpsNull: Self = StObject.set(x, "externalIps", null)
      
      inline def setListeningIps(value: js.Array[String]): Self = StObject.set(x, "listeningIps", value.asInstanceOf[js.Any])
      
      inline def setListeningIpsVarargs(value: String*): Self = StObject.set(x, "listeningIps", js.Array(value*))
      
      inline def setListeningPort(value: Double): Self = StObject.set(x, "listeningPort", value.asInstanceOf[js.Any])
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setMaxAllocateLifetime(value: Double): Self = StObject.set(x, "maxAllocateLifetime", value.asInstanceOf[js.Any])
      
      inline def setMaxPort(value: Double): Self = StObject.set(x, "maxPort", value.asInstanceOf[js.Any])
      
      inline def setMinPort(value: Double): Self = StObject.set(x, "minPort", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRelayIps(value: js.Array[String]): Self = StObject.set(x, "relayIps", value.asInstanceOf[js.Any])
      
      inline def setRelayIpsVarargs(value: String*): Self = StObject.set(x, "relayIps", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof node-turn.node-turn.TurnProps ]: node-turn.node-turn.TurnProps[P]} */ @js.native
  trait TurnServer extends EventEmitter {
    
    def addUser(username: String, password: String): Unit = js.native
    
    def removeUser(username: String): Unit = js.native
    
    val software: String = js.native
    
    def start(): Unit = js.native
    
    val staticCredentials: TurnCredentials = js.native
    
    def stop(): Unit = js.native
  }
}
