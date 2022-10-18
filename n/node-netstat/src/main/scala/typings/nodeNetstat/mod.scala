package typings.nodeNetstat

import typings.node.NodeJS.ReadableStream
import typings.nodeNetstat.anon.RecursivePartialAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options, callback: LineHandler): ActivatorResult = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ActivatorResult]
  
  @JSImport("node-netstat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-netstat", "commands")
  @js.native
  val commands: Commands_ = js.native
  
  object filters {
    
    @JSImport("node-netstat", "filters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def conditional(callback: LineHandler, conditions: Filter): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("conditional")(callback.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
    
    inline def limit(callback: LineHandler, limit: Double): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(callback.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  }
  
  object parserFactories {
    
    @JSImport("node-netstat", "parserFactories.darwin")
    @js.native
    val darwin: ParserFactory = js.native
    
    @JSImport("node-netstat", "parserFactories.linux")
    @js.native
    val linux: ParserFactory = js.native
    
    @JSImport("node-netstat", "parserFactories.win32")
    @js.native
    val win32: ParserFactory = js.native
  }
  
  object parsers {
    
    @JSImport("node-netstat", "parsers.darwin")
    @js.native
    val darwin: Parser = js.native
    
    @JSImport("node-netstat", "parsers.linux")
    @js.native
    val linux: Parser = js.native
    
    @JSImport("node-netstat", "parsers.win32")
    @js.native
    val win32: Parser = js.native
  }
  
  object utils {
    
    @JSImport("node-netstat", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emitLines(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitLines")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
    
    inline def normalizeValues(item: RawItem): ParsedItem = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeValues")(item.asInstanceOf[js.Any]).asInstanceOf[ParsedItem]
    
    inline def parseAddress(raw: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAddress")(raw.asInstanceOf[js.Any]).asInstanceOf[Address]
    
    inline def parseLines(source: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLines")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("node-netstat", "version")
  @js.native
  val version: String = js.native
  
  type ActivatorResult = AsyncResult | SyncResult
  
  trait Address extends StObject {
    
    var address: String | Null
    
    var port: Double | Null
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal(address = null, port = null)
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressNull: Self = StObject.set(x, "address", null)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
    }
  }
  
  trait AsyncResult extends StObject {
    
    def cancel(): Unit
  }
  object AsyncResult {
    
    inline def apply(cancel: () => Unit): AsyncResult = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[AsyncResult]
    }
    
    extension [Self <: AsyncResult](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  trait Command extends StObject {
    
    var args: js.Array[String]
    
    var cmd: String
  }
  object Command {
    
    inline def apply(args: js.Array[String], cmd: String): Command = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ platform in node-netstat.node-netstat.Platforms ]: node-netstat.node-netstat.Command} */
  trait Commands_ extends StObject {
    
    var darwin: Command
    
    var linux: Command
    
    var win32: Command
  }
  object Commands_ {
    
    inline def apply(darwin: Command, linux: Command, win32: Command): Commands_ = {
      val __obj = js.Dynamic.literal(darwin = darwin.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], win32 = win32.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commands_]
    }
    
    extension [Self <: Commands_](x: Self) {
      
      inline def setDarwin(value: Command): Self = StObject.set(x, "darwin", value.asInstanceOf[js.Any])
      
      inline def setLinux(value: Command): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      inline def setWin32(value: Command): Self = StObject.set(x, "win32", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined node-netstat.node-netstat.RecursivePartial<node-netstat.node-netstat.ParsedItem> */
  trait Filter extends StObject {
    
    var local: js.UndefOr[RecursivePartialAddress] = js.undefined
    
    var pid: js.UndefOr[RecursivePartial[Double]] = js.undefined
    
    var processName: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
    
    var protocol: js.UndefOr[RecursivePartial[String]] = js.undefined
    
    var remote: js.UndefOr[RecursivePartialAddress] = js.undefined
    
    var state: js.UndefOr[RecursivePartial[State]] = js.undefined
  }
  object Filter {
    
    inline def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setLocal(value: RecursivePartialAddress): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setPid(value: RecursivePartial[Double]): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setProcessName(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "processName", value.asInstanceOf[js.Any])
      
      inline def setProcessNameUndefined: Self = StObject.set(x, "processName", js.undefined)
      
      inline def setProtocol(value: RecursivePartial[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRemote(value: RecursivePartialAddress): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setState(value: RecursivePartial[State]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type LineHandler = js.Function1[/* item */ ParsedItem, Boolean | Unit]
  
  trait Options extends StObject {
    
    var done: js.UndefOr[js.Function1[/* error */ js.UndefOr[String], Unit]] = js.undefined
    
    var filter: js.UndefOr[Filter] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDone(value: /* error */ js.UndefOr[String] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait ParsedItem extends StObject {
    
    var local: Address
    
    var pid: Double
    
    var processName: js.UndefOr[String] = js.undefined
    
    var protocol: String
    
    var remote: Address
    
    var state: State
  }
  object ParsedItem {
    
    inline def apply(local: Address, pid: Double, protocol: String, remote: Address, state: State): ParsedItem = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedItem]
    }
    
    extension [Self <: ParsedItem](x: Self) {
      
      inline def setLocal(value: Address): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setProcessName(value: String): Self = StObject.set(x, "processName", value.asInstanceOf[js.Any])
      
      inline def setProcessNameUndefined: Self = StObject.set(x, "processName", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: Address): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type Parser = js.Function2[/* line */ String, /* callback */ LineHandler, Boolean | Unit]
  
  type ParserFactory = js.Function1[/* options */ js.UndefOr[ParserFactoryOptions], Parser]
  
  trait ParserFactoryOptions extends StObject {
    
    var parseName: js.UndefOr[Boolean] = js.undefined
  }
  object ParserFactoryOptions {
    
    inline def apply(): ParserFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserFactoryOptions]
    }
    
    extension [Self <: ParserFactoryOptions](x: Self) {
      
      inline def setParseName(value: Boolean): Self = StObject.set(x, "parseName", value.asInstanceOf[js.Any])
      
      inline def setParseNameUndefined: Self = StObject.set(x, "parseName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeNetstat.nodeNetstatStrings.darwin
    - typings.nodeNetstat.nodeNetstatStrings.linux
    - typings.nodeNetstat.nodeNetstatStrings.win32
  */
  trait Platforms extends StObject
  object Platforms {
    
    inline def darwin: typings.nodeNetstat.nodeNetstatStrings.darwin = "darwin".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.darwin]
    
    inline def linux: typings.nodeNetstat.nodeNetstatStrings.linux = "linux".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.linux]
    
    inline def win32: typings.nodeNetstat.nodeNetstatStrings.win32 = "win32".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.win32]
  }
  
  trait RawItem extends StObject {
    
    var local: String
    
    var pid: String
    
    var processName: js.UndefOr[String] = js.undefined
    
    var protocol: String
    
    var remote: String
    
    var state: String
  }
  object RawItem {
    
    inline def apply(local: String, pid: String, protocol: String, remote: String, state: String): RawItem = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawItem]
    }
    
    extension [Self <: RawItem](x: Self) {
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setProcessName(value: String): Self = StObject.set(x, "processName", value.asInstanceOf[js.Any])
      
      inline def setProcessNameUndefined: Self = StObject.set(x, "processName", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? node-netstat.node-netstat.RecursivePartial<T[P]>}
    }}}
    */
  @js.native
  trait RecursivePartial[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeNetstat.nodeNetstatStrings.SYN_SEND
    - typings.nodeNetstat.nodeNetstatStrings.SYN_RECEIVED
    - typings.nodeNetstat.nodeNetstatStrings.ESTABLISHED
    - typings.nodeNetstat.nodeNetstatStrings.LISTEN
    - typings.nodeNetstat.nodeNetstatStrings.FIN_WAIT_1
    - typings.nodeNetstat.nodeNetstatStrings.TIMED_WAIT
    - typings.nodeNetstat.nodeNetstatStrings.CLOSE_WAIT
    - typings.nodeNetstat.nodeNetstatStrings.FIN_WAIT_2
    - typings.nodeNetstat.nodeNetstatStrings.LAST_ACK
    - typings.nodeNetstat.nodeNetstatStrings.CLOSED
  */
  trait State extends StObject
  object State {
    
    inline def CLOSED: typings.nodeNetstat.nodeNetstatStrings.CLOSED = "CLOSED".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.CLOSED]
    
    inline def CLOSE_WAIT: typings.nodeNetstat.nodeNetstatStrings.CLOSE_WAIT = "CLOSE_WAIT".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.CLOSE_WAIT]
    
    inline def ESTABLISHED: typings.nodeNetstat.nodeNetstatStrings.ESTABLISHED = "ESTABLISHED".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.ESTABLISHED]
    
    inline def FIN_WAIT_1: typings.nodeNetstat.nodeNetstatStrings.FIN_WAIT_1 = "FIN_WAIT_1".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.FIN_WAIT_1]
    
    inline def FIN_WAIT_2: typings.nodeNetstat.nodeNetstatStrings.FIN_WAIT_2 = "FIN_WAIT_2".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.FIN_WAIT_2]
    
    inline def LAST_ACK: typings.nodeNetstat.nodeNetstatStrings.LAST_ACK = "LAST_ACK".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.LAST_ACK]
    
    inline def LISTEN: typings.nodeNetstat.nodeNetstatStrings.LISTEN = "LISTEN".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.LISTEN]
    
    inline def SYN_RECEIVED: typings.nodeNetstat.nodeNetstatStrings.SYN_RECEIVED = "SYN_RECEIVED".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.SYN_RECEIVED]
    
    inline def SYN_SEND: typings.nodeNetstat.nodeNetstatStrings.SYN_SEND = "SYN_SEND".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.SYN_SEND]
    
    inline def TIMED_WAIT: typings.nodeNetstat.nodeNetstatStrings.TIMED_WAIT = "TIMED_WAIT".asInstanceOf[typings.nodeNetstat.nodeNetstatStrings.TIMED_WAIT]
  }
  
  type SyncResult = Any
}
