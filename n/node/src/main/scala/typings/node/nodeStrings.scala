package typings.node

import typings.node.NodeJS.MultipleResolveType
import typings.node.NodeJS.Platform
import typings.node.NodeJS.Signals
import typings.node.bufferMod.TranscodeEncoding
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioNull
import typings.node.childProcessMod._StdioOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.ECDHKeyFormat
import typings.node.cryptoMod.HexBase64BinaryEncoding
import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.node.cryptoMod.KeyFormat
import typings.node.cryptoMod.KeyObjectType
import typings.node.cryptoMod.KeyType
import typings.node.cryptoMod.Utf8AsciiBinaryEncoding
import typings.node.cryptoMod.Utf8AsciiLatin1Encoding
import typings.node.dgramMod.SocketType
import typings.node.fsMod.symlink.Type
import typings.node.tlsMod.SecureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeStrings {
  @js.native
  sealed trait A extends js.Object
  
  @js.native
  sealed trait AAAA extends js.Object
  
  @js.native
  sealed trait ANY extends js.Object
  
  @js.native
  sealed trait BE extends js.Object
  
  @js.native
  sealed trait Buffer extends js.Object
  
  @js.native
  sealed trait CNAME extends js.Object
  
  @js.native
  sealed trait ConsoleDotclearMessages extends js.Object
  
  @js.native
  sealed trait ConsoleDotdisable extends js.Object
  
  @js.native
  sealed trait ConsoleDotenable extends js.Object
  
  @js.native
  sealed trait ConsoleDotmessageAdded extends js.Object
  
  @js.native
  sealed trait DebuggerDotbreakpointResolved extends js.Object
  
  @js.native
  sealed trait DebuggerDotcontinueToLocation extends js.Object
  
  @js.native
  sealed trait DebuggerDotdisable extends js.Object
  
  @js.native
  sealed trait DebuggerDotenable extends js.Object
  
  @js.native
  sealed trait DebuggerDotevaluateOnCallFrame extends js.Object
  
  @js.native
  sealed trait DebuggerDotgetPossibleBreakpoints extends js.Object
  
  @js.native
  sealed trait DebuggerDotgetScriptSource extends js.Object
  
  @js.native
  sealed trait DebuggerDotgetStackTrace extends js.Object
  
  @js.native
  sealed trait DebuggerDotpause extends js.Object
  
  @js.native
  sealed trait DebuggerDotpauseOnAsyncCall extends js.Object
  
  @js.native
  sealed trait DebuggerDotpaused extends js.Object
  
  @js.native
  sealed trait DebuggerDotremoveBreakpoint extends js.Object
  
  @js.native
  sealed trait DebuggerDotrestartFrame extends js.Object
  
  @js.native
  sealed trait DebuggerDotresume extends js.Object
  
  @js.native
  sealed trait DebuggerDotresumed extends js.Object
  
  @js.native
  sealed trait DebuggerDotscheduleStepIntoAsync extends js.Object
  
  @js.native
  sealed trait DebuggerDotscriptFailedToParse extends js.Object
  
  @js.native
  sealed trait DebuggerDotscriptParsed extends js.Object
  
  @js.native
  sealed trait DebuggerDotsearchInContent extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetAsyncCallStackDepth extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetBlackboxPatterns extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetBlackboxedRanges extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetBreakpoint extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetBreakpointByUrl extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetBreakpointsActive extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetPauseOnExceptions extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetReturnValue extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetScriptSource extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetSkipAllPauses extends js.Object
  
  @js.native
  sealed trait DebuggerDotsetVariableValue extends js.Object
  
  @js.native
  sealed trait DebuggerDotstepInto extends js.Object
  
  @js.native
  sealed trait DebuggerDotstepOut extends js.Object
  
  @js.native
  sealed trait DebuggerDotstepOver extends js.Object
  
  @js.native
  sealed trait ERR_ASSERTION extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotaddHeapSnapshotChunk extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotaddInspectedHeapObject extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotcollectGarbage extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotdisable extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotenable extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotgetHeapObjectId extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotgetObjectByHeapObjectId extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotgetSamplingProfile extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotheapStatsUpdate extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotlastSeenObjectId extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotreportHeapSnapshotProgress extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotresetProfiles extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotstartSampling extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotstartTrackingHeapObjects extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotstopSampling extends js.Object
  
  @js.native
  sealed trait HeapProfilerDotstopTrackingHeapObjects extends js.Object
  
  @js.native
  sealed trait HeapProfilerDottakeHeapSnapshot extends js.Object
  
  @js.native
  sealed trait IPv4 extends js.Object
  
  @js.native
  sealed trait IPv6 extends js.Object
  
  @js.native
  sealed trait LE extends js.Object
  
  @js.native
  sealed trait MX extends js.Object
  
  @js.native
  sealed trait NAPTR extends js.Object
  
  @js.native
  sealed trait NS extends js.Object
  
  @js.native
  sealed trait NodeRuntimeDotnotifyWhenWaitingForDisconnect extends js.Object
  
  @js.native
  sealed trait NodeRuntimeDotwaitingForDisconnect extends js.Object
  
  @js.native
  sealed trait NodeTracingDotdataCollected extends js.Object
  
  @js.native
  sealed trait NodeTracingDotgetCategories extends js.Object
  
  @js.native
  sealed trait NodeTracingDotstart extends js.Object
  
  @js.native
  sealed trait NodeTracingDotstop extends js.Object
  
  @js.native
  sealed trait NodeTracingDottracingComplete extends js.Object
  
  @js.native
  sealed trait NodeWorkerDotattachedToWorker extends js.Object
  
  @js.native
  sealed trait NodeWorkerDotdetach extends js.Object
  
  @js.native
  sealed trait NodeWorkerDotdetachedFromWorker extends js.Object
  
  @js.native
  sealed trait NodeWorkerDotdisable extends js.Object
  
  @js.native
  sealed trait NodeWorkerDotenable extends js.Object
  
  @js.native
  sealed trait NodeWorkerDotreceivedMessageFromWorker extends js.Object
  
  @js.native
  sealed trait NodeWorkerDotsendMessageToWorker extends js.Object
  
  @js.native
  sealed trait OCSPRequest extends js.Object
  
  @js.native
  sealed trait OCSPResponse extends js.Object
  
  @js.native
  sealed trait PTR extends js.Object
  
  @js.native
  sealed trait ProfilerDotconsoleProfileFinished extends js.Object
  
  @js.native
  sealed trait ProfilerDotconsoleProfileStarted extends js.Object
  
  @js.native
  sealed trait ProfilerDotdisable extends js.Object
  
  @js.native
  sealed trait ProfilerDotenable extends js.Object
  
  @js.native
  sealed trait ProfilerDotgetBestEffortCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDotsetSamplingInterval extends js.Object
  
  @js.native
  sealed trait ProfilerDotstart extends js.Object
  
  @js.native
  sealed trait ProfilerDotstartPreciseCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDotstartTypeProfile extends js.Object
  
  @js.native
  sealed trait ProfilerDotstop extends js.Object
  
  @js.native
  sealed trait ProfilerDotstopPreciseCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDotstopTypeProfile extends js.Object
  
  @js.native
  sealed trait ProfilerDottakePreciseCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDottakeTypeProfile extends js.Object
  
  @js.native
  sealed trait RuntimeDotawaitPromise extends js.Object
  
  @js.native
  sealed trait RuntimeDotcallFunctionOn extends js.Object
  
  @js.native
  sealed trait RuntimeDotcompileScript extends js.Object
  
  @js.native
  sealed trait RuntimeDotconsoleAPICalled extends js.Object
  
  @js.native
  sealed trait RuntimeDotdisable extends js.Object
  
  @js.native
  sealed trait RuntimeDotdiscardConsoleEntries extends js.Object
  
  @js.native
  sealed trait RuntimeDotenable extends js.Object
  
  @js.native
  sealed trait RuntimeDotevaluate extends js.Object
  
  @js.native
  sealed trait RuntimeDotexceptionRevoked extends js.Object
  
  @js.native
  sealed trait RuntimeDotexceptionThrown extends js.Object
  
  @js.native
  sealed trait RuntimeDotexecutionContextCreated extends js.Object
  
  @js.native
  sealed trait RuntimeDotexecutionContextDestroyed extends js.Object
  
  @js.native
  sealed trait RuntimeDotexecutionContextsCleared extends js.Object
  
  @js.native
  sealed trait RuntimeDotgetProperties extends js.Object
  
  @js.native
  sealed trait RuntimeDotglobalLexicalScopeNames extends js.Object
  
  @js.native
  sealed trait RuntimeDotinspectRequested extends js.Object
  
  @js.native
  sealed trait RuntimeDotqueryObjects extends js.Object
  
  @js.native
  sealed trait RuntimeDotreleaseObject extends js.Object
  
  @js.native
  sealed trait RuntimeDotreleaseObjectGroup extends js.Object
  
  @js.native
  sealed trait RuntimeDotrunIfWaitingForDebugger extends js.Object
  
  @js.native
  sealed trait RuntimeDotrunScript extends js.Object
  
  @js.native
  sealed trait RuntimeDotsetCustomObjectFormatterEnabled extends js.Object
  
  @js.native
  sealed trait SIGABRT extends Signals
  
  @js.native
  sealed trait SIGALRM extends Signals
  
  @js.native
  sealed trait SIGBREAK extends Signals
  
  @js.native
  sealed trait SIGBUS extends Signals
  
  @js.native
  sealed trait SIGCHLD extends Signals
  
  @js.native
  sealed trait SIGCONT extends Signals
  
  @js.native
  sealed trait SIGFPE extends Signals
  
  @js.native
  sealed trait SIGHUP extends Signals
  
  @js.native
  sealed trait SIGILL extends Signals
  
  @js.native
  sealed trait SIGINFO extends Signals
  
  @js.native
  sealed trait SIGINT extends Signals
  
  @js.native
  sealed trait SIGIO extends Signals
  
  @js.native
  sealed trait SIGIOT extends Signals
  
  @js.native
  sealed trait SIGKILL extends Signals
  
  @js.native
  sealed trait SIGLOST extends Signals
  
  @js.native
  sealed trait SIGPIPE extends Signals
  
  @js.native
  sealed trait SIGPOLL extends Signals
  
  @js.native
  sealed trait SIGPROF extends Signals
  
  @js.native
  sealed trait SIGPWR extends Signals
  
  @js.native
  sealed trait SIGQUIT extends Signals
  
  @js.native
  sealed trait SIGSEGV extends Signals
  
  @js.native
  sealed trait SIGSTKFLT extends Signals
  
  @js.native
  sealed trait SIGSTOP extends Signals
  
  @js.native
  sealed trait SIGSYS extends Signals
  
  @js.native
  sealed trait SIGTERM extends Signals
  
  @js.native
  sealed trait SIGTRAP extends Signals
  
  @js.native
  sealed trait SIGTSTP extends Signals
  
  @js.native
  sealed trait SIGTTIN extends Signals
  
  @js.native
  sealed trait SIGTTOU extends Signals
  
  @js.native
  sealed trait SIGUNUSED extends Signals
  
  @js.native
  sealed trait SIGURG extends Signals
  
  @js.native
  sealed trait SIGUSR1 extends Signals
  
  @js.native
  sealed trait SIGUSR2 extends Signals
  
  @js.native
  sealed trait SIGVTALRM extends Signals
  
  @js.native
  sealed trait SIGWINCH extends Signals
  
  @js.native
  sealed trait SIGXCPU extends Signals
  
  @js.native
  sealed trait SIGXFSZ extends Signals
  
  @js.native
  sealed trait SOA extends js.Object
  
  @js.native
  sealed trait SRV extends js.Object
  
  @js.native
  sealed trait SchemaDotgetDomains extends js.Object
  
  @js.native
  sealed trait SignalConstants extends js.Object
  
  @js.native
  sealed trait TLSv1 extends SecureVersion
  
  @js.native
  sealed trait TLSv1Dot1 extends SecureVersion
  
  @js.native
  sealed trait TLSv1Dot2 extends SecureVersion
  
  @js.native
  sealed trait TLSv1Dot3 extends SecureVersion
  
  @js.native
  sealed trait TXT extends js.Object
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait aborted extends js.Object
  
  @js.native
  sealed trait advanced extends SerializationType
  
  @js.native
  sealed trait `aes-128-ccm` extends CipherCCMTypes
  
  @js.native
  sealed trait `aes-128-gcm` extends CipherGCMTypes
  
  @js.native
  sealed trait `aes-192-ccm` extends CipherCCMTypes
  
  @js.native
  sealed trait `aes-192-gcm` extends CipherGCMTypes
  
  @js.native
  sealed trait `aes-256-ccm` extends CipherCCMTypes
  
  @js.native
  sealed trait `aes-256-gcm` extends CipherGCMTypes
  
  @js.native
  sealed trait aix extends Platform
  
  @js.native
  sealed trait altsvc extends js.Object
  
  @js.native
  sealed trait android extends Platform
  
  @js.native
  sealed trait ascii
    extends BufferEncoding
       with TranscodeEncoding
       with Utf8AsciiBinaryEncoding
       with Utf8AsciiLatin1Encoding
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait base64
    extends BufferEncoding
       with HexBase64BinaryEncoding
       with HexBase64Latin1Encoding
  
  @js.native
  sealed trait beforeExit extends js.Object
  
  @js.native
  sealed trait binary
    extends BufferEncoding
       with HexBase64BinaryEncoding
       with TranscodeEncoding
       with Utf8AsciiBinaryEncoding
  
  @js.native
  sealed trait buffer_ extends js.Object
  
  @js.native
  sealed trait `chacha20-poly1305` extends CipherCCMTypes
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait checkContinue extends js.Object
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait compressed extends ECDHKeyFormat
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait continue extends js.Object
  
  @js.native
  sealed trait cygwin extends Platform
  
  @js.native
  sealed trait darwin extends Platform
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait der extends KeyFormat
  
  @js.native
  sealed trait dir extends Type
  
  @js.native
  sealed trait disconnect extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait dsa extends KeyType
  
  @js.native
  sealed trait ec extends KeyType
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait exit extends js.Object
  
  @js.native
  sealed trait file extends Type
  
  @js.native
  sealed trait finish extends js.Object
  
  @js.native
  sealed trait fork extends js.Object
  
  @js.native
  sealed trait frameError extends js.Object
  
  @js.native
  sealed trait freebsd extends Platform
  
  @js.native
  sealed trait get extends js.Object
  
  @js.native
  sealed trait goaway extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait hex
    extends BufferEncoding
       with HexBase64BinaryEncoding
       with HexBase64Latin1Encoding
  
  @js.native
  sealed trait hybrid extends ECDHKeyFormat
  
  @js.native
  sealed trait ignore
    extends StdioNull
       with _StdioOptions
  
  @js.native
  sealed trait information extends js.Object
  
  @js.native
  sealed trait inherit
    extends StdioNull
       with _StdioOptions
  
  @js.native
  sealed trait inspectorNotification extends js.Object
  
  @js.native
  sealed trait ipc extends js.Object
  
  @js.native
  sealed trait json extends SerializationType
  
  @js.native
  sealed trait junction extends Type
  
  @js.native
  sealed trait keylog extends js.Object
  
  @js.native
  sealed trait latin1
    extends BufferEncoding
       with HexBase64Latin1Encoding
       with TranscodeEncoding
       with Utf8AsciiLatin1Encoding
  
  @js.native
  sealed trait line extends js.Object
  
  @js.native
  sealed trait linux extends Platform
  
  @js.native
  sealed trait listening extends js.Object
  
  @js.native
  sealed trait localSettings extends js.Object
  
  @js.native
  sealed trait lookup extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait multipleResolves extends js.Object
  
  @js.native
  sealed trait netbsd extends Platform
  
  @js.native
  sealed trait newListener extends js.Object
  
  @js.native
  sealed trait newSession extends js.Object
  
  @js.native
  sealed trait online extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait openbsd extends Platform
  
  @js.native
  sealed trait origin extends js.Object
  
  @js.native
  sealed trait pause extends js.Object
  
  @js.native
  sealed trait pem extends KeyFormat
  
  @js.native
  sealed trait ping extends js.Object
  
  @js.native
  sealed trait pipe extends _StdioOptions
  
  @js.native
  sealed trait pkcs1 extends js.Object
  
  @js.native
  sealed trait pkcs8 extends js.Object
  
  @js.native
  sealed trait `private` extends KeyObjectType
  
  @js.native
  sealed trait public extends KeyObjectType
  
  @js.native
  sealed trait push extends js.Object
  
  @js.native
  sealed trait readable extends js.Object
  
  @js.native
  sealed trait reject extends MultipleResolveType
  
  @js.native
  sealed trait rejectionHandled extends js.Object
  
  @js.native
  sealed trait remoteSettings extends js.Object
  
  @js.native
  sealed trait removeListener extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait resize extends js.Object
  
  @js.native
  sealed trait resolve extends MultipleResolveType
  
  @js.native
  sealed trait response extends js.Object
  
  @js.native
  sealed trait resume extends js.Object
  
  @js.native
  sealed trait resumeSession extends js.Object
  
  @js.native
  sealed trait rsa extends KeyType
  
  @js.native
  sealed trait sec1 extends js.Object
  
  @js.native
  sealed trait secret extends KeyObjectType
  
  @js.native
  sealed trait secureConnect extends js.Object
  
  @js.native
  sealed trait secureConnection extends js.Object
  
  @js.native
  sealed trait session extends js.Object
  
  @js.native
  sealed trait sessionError extends js.Object
  
  @js.native
  sealed trait set extends js.Object
  
  @js.native
  sealed trait setup extends js.Object
  
  @js.native
  sealed trait socket extends js.Object
  
  @js.native
  sealed trait spki extends js.Object
  
  @js.native
  sealed trait stream extends js.Object
  
  @js.native
  sealed trait streamClosed extends js.Object
  
  @js.native
  sealed trait sunos extends Platform
  
  @js.native
  sealed trait timeout extends js.Object
  
  @js.native
  sealed trait tlsClientError extends js.Object
  
  @js.native
  sealed trait trailers extends js.Object
  
  @js.native
  sealed trait `ucs-2` extends BufferEncoding
  
  @js.native
  sealed trait ucs2
    extends BufferEncoding
       with TranscodeEncoding
  
  @js.native
  sealed trait udp4 extends SocketType
  
  @js.native
  sealed trait udp6 extends SocketType
  
  @js.native
  sealed trait uncaughtException extends js.Object
  
  @js.native
  sealed trait uncompressed extends ECDHKeyFormat
  
  @js.native
  sealed trait unhandledRejection extends js.Object
  
  @js.native
  sealed trait unknownProtocol extends js.Object
  
  @js.native
  sealed trait unpipe extends js.Object
  
  @js.native
  sealed trait upgrade extends js.Object
  
  @js.native
  sealed trait `utf-8` extends BufferEncoding
  
  @js.native
  sealed trait utf16le
    extends BufferEncoding
       with TranscodeEncoding
  
  @js.native
  sealed trait utf8
    extends BufferEncoding
       with TranscodeEncoding
       with Utf8AsciiBinaryEncoding
       with Utf8AsciiLatin1Encoding
  
  @js.native
  sealed trait wantTrailers extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  @js.native
  sealed trait win32 extends Platform
  
  @scala.inline
  def A: A = "A".asInstanceOf[A]
  @scala.inline
  def AAAA: AAAA = "AAAA".asInstanceOf[AAAA]
  @scala.inline
  def ANY: ANY = "ANY".asInstanceOf[ANY]
  @scala.inline
  def BE: BE = "BE".asInstanceOf[BE]
  @scala.inline
  def Buffer: Buffer = "Buffer".asInstanceOf[Buffer]
  @scala.inline
  def CNAME: CNAME = "CNAME".asInstanceOf[CNAME]
  @scala.inline
  def ConsoleDotclearMessages: ConsoleDotclearMessages = "Console.clearMessages".asInstanceOf[ConsoleDotclearMessages]
  @scala.inline
  def ConsoleDotdisable: ConsoleDotdisable = "Console.disable".asInstanceOf[ConsoleDotdisable]
  @scala.inline
  def ConsoleDotenable: ConsoleDotenable = "Console.enable".asInstanceOf[ConsoleDotenable]
  @scala.inline
  def ConsoleDotmessageAdded: ConsoleDotmessageAdded = "Console.messageAdded".asInstanceOf[ConsoleDotmessageAdded]
  @scala.inline
  def DebuggerDotbreakpointResolved: DebuggerDotbreakpointResolved = "Debugger.breakpointResolved".asInstanceOf[DebuggerDotbreakpointResolved]
  @scala.inline
  def DebuggerDotcontinueToLocation: DebuggerDotcontinueToLocation = "Debugger.continueToLocation".asInstanceOf[DebuggerDotcontinueToLocation]
  @scala.inline
  def DebuggerDotdisable: DebuggerDotdisable = "Debugger.disable".asInstanceOf[DebuggerDotdisable]
  @scala.inline
  def DebuggerDotenable: DebuggerDotenable = "Debugger.enable".asInstanceOf[DebuggerDotenable]
  @scala.inline
  def DebuggerDotevaluateOnCallFrame: DebuggerDotevaluateOnCallFrame = "Debugger.evaluateOnCallFrame".asInstanceOf[DebuggerDotevaluateOnCallFrame]
  @scala.inline
  def DebuggerDotgetPossibleBreakpoints: DebuggerDotgetPossibleBreakpoints = "Debugger.getPossibleBreakpoints".asInstanceOf[DebuggerDotgetPossibleBreakpoints]
  @scala.inline
  def DebuggerDotgetScriptSource: DebuggerDotgetScriptSource = "Debugger.getScriptSource".asInstanceOf[DebuggerDotgetScriptSource]
  @scala.inline
  def DebuggerDotgetStackTrace: DebuggerDotgetStackTrace = "Debugger.getStackTrace".asInstanceOf[DebuggerDotgetStackTrace]
  @scala.inline
  def DebuggerDotpause: DebuggerDotpause = "Debugger.pause".asInstanceOf[DebuggerDotpause]
  @scala.inline
  def DebuggerDotpauseOnAsyncCall: DebuggerDotpauseOnAsyncCall = "Debugger.pauseOnAsyncCall".asInstanceOf[DebuggerDotpauseOnAsyncCall]
  @scala.inline
  def DebuggerDotpaused: DebuggerDotpaused = "Debugger.paused".asInstanceOf[DebuggerDotpaused]
  @scala.inline
  def DebuggerDotremoveBreakpoint: DebuggerDotremoveBreakpoint = "Debugger.removeBreakpoint".asInstanceOf[DebuggerDotremoveBreakpoint]
  @scala.inline
  def DebuggerDotrestartFrame: DebuggerDotrestartFrame = "Debugger.restartFrame".asInstanceOf[DebuggerDotrestartFrame]
  @scala.inline
  def DebuggerDotresume: DebuggerDotresume = "Debugger.resume".asInstanceOf[DebuggerDotresume]
  @scala.inline
  def DebuggerDotresumed: DebuggerDotresumed = "Debugger.resumed".asInstanceOf[DebuggerDotresumed]
  @scala.inline
  def DebuggerDotscheduleStepIntoAsync: DebuggerDotscheduleStepIntoAsync = "Debugger.scheduleStepIntoAsync".asInstanceOf[DebuggerDotscheduleStepIntoAsync]
  @scala.inline
  def DebuggerDotscriptFailedToParse: DebuggerDotscriptFailedToParse = "Debugger.scriptFailedToParse".asInstanceOf[DebuggerDotscriptFailedToParse]
  @scala.inline
  def DebuggerDotscriptParsed: DebuggerDotscriptParsed = "Debugger.scriptParsed".asInstanceOf[DebuggerDotscriptParsed]
  @scala.inline
  def DebuggerDotsearchInContent: DebuggerDotsearchInContent = "Debugger.searchInContent".asInstanceOf[DebuggerDotsearchInContent]
  @scala.inline
  def DebuggerDotsetAsyncCallStackDepth: DebuggerDotsetAsyncCallStackDepth = "Debugger.setAsyncCallStackDepth".asInstanceOf[DebuggerDotsetAsyncCallStackDepth]
  @scala.inline
  def DebuggerDotsetBlackboxPatterns: DebuggerDotsetBlackboxPatterns = "Debugger.setBlackboxPatterns".asInstanceOf[DebuggerDotsetBlackboxPatterns]
  @scala.inline
  def DebuggerDotsetBlackboxedRanges: DebuggerDotsetBlackboxedRanges = "Debugger.setBlackboxedRanges".asInstanceOf[DebuggerDotsetBlackboxedRanges]
  @scala.inline
  def DebuggerDotsetBreakpoint: DebuggerDotsetBreakpoint = "Debugger.setBreakpoint".asInstanceOf[DebuggerDotsetBreakpoint]
  @scala.inline
  def DebuggerDotsetBreakpointByUrl: DebuggerDotsetBreakpointByUrl = "Debugger.setBreakpointByUrl".asInstanceOf[DebuggerDotsetBreakpointByUrl]
  @scala.inline
  def DebuggerDotsetBreakpointsActive: DebuggerDotsetBreakpointsActive = "Debugger.setBreakpointsActive".asInstanceOf[DebuggerDotsetBreakpointsActive]
  @scala.inline
  def DebuggerDotsetPauseOnExceptions: DebuggerDotsetPauseOnExceptions = "Debugger.setPauseOnExceptions".asInstanceOf[DebuggerDotsetPauseOnExceptions]
  @scala.inline
  def DebuggerDotsetReturnValue: DebuggerDotsetReturnValue = "Debugger.setReturnValue".asInstanceOf[DebuggerDotsetReturnValue]
  @scala.inline
  def DebuggerDotsetScriptSource: DebuggerDotsetScriptSource = "Debugger.setScriptSource".asInstanceOf[DebuggerDotsetScriptSource]
  @scala.inline
  def DebuggerDotsetSkipAllPauses: DebuggerDotsetSkipAllPauses = "Debugger.setSkipAllPauses".asInstanceOf[DebuggerDotsetSkipAllPauses]
  @scala.inline
  def DebuggerDotsetVariableValue: DebuggerDotsetVariableValue = "Debugger.setVariableValue".asInstanceOf[DebuggerDotsetVariableValue]
  @scala.inline
  def DebuggerDotstepInto: DebuggerDotstepInto = "Debugger.stepInto".asInstanceOf[DebuggerDotstepInto]
  @scala.inline
  def DebuggerDotstepOut: DebuggerDotstepOut = "Debugger.stepOut".asInstanceOf[DebuggerDotstepOut]
  @scala.inline
  def DebuggerDotstepOver: DebuggerDotstepOver = "Debugger.stepOver".asInstanceOf[DebuggerDotstepOver]
  @scala.inline
  def ERR_ASSERTION: ERR_ASSERTION = "ERR_ASSERTION".asInstanceOf[ERR_ASSERTION]
  @scala.inline
  def HeapProfilerDotaddHeapSnapshotChunk: HeapProfilerDotaddHeapSnapshotChunk = "HeapProfiler.addHeapSnapshotChunk".asInstanceOf[HeapProfilerDotaddHeapSnapshotChunk]
  @scala.inline
  def HeapProfilerDotaddInspectedHeapObject: HeapProfilerDotaddInspectedHeapObject = "HeapProfiler.addInspectedHeapObject".asInstanceOf[HeapProfilerDotaddInspectedHeapObject]
  @scala.inline
  def HeapProfilerDotcollectGarbage: HeapProfilerDotcollectGarbage = "HeapProfiler.collectGarbage".asInstanceOf[HeapProfilerDotcollectGarbage]
  @scala.inline
  def HeapProfilerDotdisable: HeapProfilerDotdisable = "HeapProfiler.disable".asInstanceOf[HeapProfilerDotdisable]
  @scala.inline
  def HeapProfilerDotenable: HeapProfilerDotenable = "HeapProfiler.enable".asInstanceOf[HeapProfilerDotenable]
  @scala.inline
  def HeapProfilerDotgetHeapObjectId: HeapProfilerDotgetHeapObjectId = "HeapProfiler.getHeapObjectId".asInstanceOf[HeapProfilerDotgetHeapObjectId]
  @scala.inline
  def HeapProfilerDotgetObjectByHeapObjectId: HeapProfilerDotgetObjectByHeapObjectId = "HeapProfiler.getObjectByHeapObjectId".asInstanceOf[HeapProfilerDotgetObjectByHeapObjectId]
  @scala.inline
  def HeapProfilerDotgetSamplingProfile: HeapProfilerDotgetSamplingProfile = "HeapProfiler.getSamplingProfile".asInstanceOf[HeapProfilerDotgetSamplingProfile]
  @scala.inline
  def HeapProfilerDotheapStatsUpdate: HeapProfilerDotheapStatsUpdate = "HeapProfiler.heapStatsUpdate".asInstanceOf[HeapProfilerDotheapStatsUpdate]
  @scala.inline
  def HeapProfilerDotlastSeenObjectId: HeapProfilerDotlastSeenObjectId = "HeapProfiler.lastSeenObjectId".asInstanceOf[HeapProfilerDotlastSeenObjectId]
  @scala.inline
  def HeapProfilerDotreportHeapSnapshotProgress: HeapProfilerDotreportHeapSnapshotProgress = "HeapProfiler.reportHeapSnapshotProgress".asInstanceOf[HeapProfilerDotreportHeapSnapshotProgress]
  @scala.inline
  def HeapProfilerDotresetProfiles: HeapProfilerDotresetProfiles = "HeapProfiler.resetProfiles".asInstanceOf[HeapProfilerDotresetProfiles]
  @scala.inline
  def HeapProfilerDotstartSampling: HeapProfilerDotstartSampling = "HeapProfiler.startSampling".asInstanceOf[HeapProfilerDotstartSampling]
  @scala.inline
  def HeapProfilerDotstartTrackingHeapObjects: HeapProfilerDotstartTrackingHeapObjects = "HeapProfiler.startTrackingHeapObjects".asInstanceOf[HeapProfilerDotstartTrackingHeapObjects]
  @scala.inline
  def HeapProfilerDotstopSampling: HeapProfilerDotstopSampling = "HeapProfiler.stopSampling".asInstanceOf[HeapProfilerDotstopSampling]
  @scala.inline
  def HeapProfilerDotstopTrackingHeapObjects: HeapProfilerDotstopTrackingHeapObjects = "HeapProfiler.stopTrackingHeapObjects".asInstanceOf[HeapProfilerDotstopTrackingHeapObjects]
  @scala.inline
  def HeapProfilerDottakeHeapSnapshot: HeapProfilerDottakeHeapSnapshot = "HeapProfiler.takeHeapSnapshot".asInstanceOf[HeapProfilerDottakeHeapSnapshot]
  @scala.inline
  def IPv4: IPv4 = "IPv4".asInstanceOf[IPv4]
  @scala.inline
  def IPv6: IPv6 = "IPv6".asInstanceOf[IPv6]
  @scala.inline
  def LE: LE = "LE".asInstanceOf[LE]
  @scala.inline
  def MX: MX = "MX".asInstanceOf[MX]
  @scala.inline
  def NAPTR: NAPTR = "NAPTR".asInstanceOf[NAPTR]
  @scala.inline
  def NS: NS = "NS".asInstanceOf[NS]
  @scala.inline
  def NodeRuntimeDotnotifyWhenWaitingForDisconnect: NodeRuntimeDotnotifyWhenWaitingForDisconnect = "NodeRuntime.notifyWhenWaitingForDisconnect".asInstanceOf[NodeRuntimeDotnotifyWhenWaitingForDisconnect]
  @scala.inline
  def NodeRuntimeDotwaitingForDisconnect: NodeRuntimeDotwaitingForDisconnect = "NodeRuntime.waitingForDisconnect".asInstanceOf[NodeRuntimeDotwaitingForDisconnect]
  @scala.inline
  def NodeTracingDotdataCollected: NodeTracingDotdataCollected = "NodeTracing.dataCollected".asInstanceOf[NodeTracingDotdataCollected]
  @scala.inline
  def NodeTracingDotgetCategories: NodeTracingDotgetCategories = "NodeTracing.getCategories".asInstanceOf[NodeTracingDotgetCategories]
  @scala.inline
  def NodeTracingDotstart: NodeTracingDotstart = "NodeTracing.start".asInstanceOf[NodeTracingDotstart]
  @scala.inline
  def NodeTracingDotstop: NodeTracingDotstop = "NodeTracing.stop".asInstanceOf[NodeTracingDotstop]
  @scala.inline
  def NodeTracingDottracingComplete: NodeTracingDottracingComplete = "NodeTracing.tracingComplete".asInstanceOf[NodeTracingDottracingComplete]
  @scala.inline
  def NodeWorkerDotattachedToWorker: NodeWorkerDotattachedToWorker = "NodeWorker.attachedToWorker".asInstanceOf[NodeWorkerDotattachedToWorker]
  @scala.inline
  def NodeWorkerDotdetach: NodeWorkerDotdetach = "NodeWorker.detach".asInstanceOf[NodeWorkerDotdetach]
  @scala.inline
  def NodeWorkerDotdetachedFromWorker: NodeWorkerDotdetachedFromWorker = "NodeWorker.detachedFromWorker".asInstanceOf[NodeWorkerDotdetachedFromWorker]
  @scala.inline
  def NodeWorkerDotdisable: NodeWorkerDotdisable = "NodeWorker.disable".asInstanceOf[NodeWorkerDotdisable]
  @scala.inline
  def NodeWorkerDotenable: NodeWorkerDotenable = "NodeWorker.enable".asInstanceOf[NodeWorkerDotenable]
  @scala.inline
  def NodeWorkerDotreceivedMessageFromWorker: NodeWorkerDotreceivedMessageFromWorker = "NodeWorker.receivedMessageFromWorker".asInstanceOf[NodeWorkerDotreceivedMessageFromWorker]
  @scala.inline
  def NodeWorkerDotsendMessageToWorker: NodeWorkerDotsendMessageToWorker = "NodeWorker.sendMessageToWorker".asInstanceOf[NodeWorkerDotsendMessageToWorker]
  @scala.inline
  def OCSPRequest: OCSPRequest = "OCSPRequest".asInstanceOf[OCSPRequest]
  @scala.inline
  def OCSPResponse: OCSPResponse = "OCSPResponse".asInstanceOf[OCSPResponse]
  @scala.inline
  def PTR: PTR = "PTR".asInstanceOf[PTR]
  @scala.inline
  def ProfilerDotconsoleProfileFinished: ProfilerDotconsoleProfileFinished = "Profiler.consoleProfileFinished".asInstanceOf[ProfilerDotconsoleProfileFinished]
  @scala.inline
  def ProfilerDotconsoleProfileStarted: ProfilerDotconsoleProfileStarted = "Profiler.consoleProfileStarted".asInstanceOf[ProfilerDotconsoleProfileStarted]
  @scala.inline
  def ProfilerDotdisable: ProfilerDotdisable = "Profiler.disable".asInstanceOf[ProfilerDotdisable]
  @scala.inline
  def ProfilerDotenable: ProfilerDotenable = "Profiler.enable".asInstanceOf[ProfilerDotenable]
  @scala.inline
  def ProfilerDotgetBestEffortCoverage: ProfilerDotgetBestEffortCoverage = "Profiler.getBestEffortCoverage".asInstanceOf[ProfilerDotgetBestEffortCoverage]
  @scala.inline
  def ProfilerDotsetSamplingInterval: ProfilerDotsetSamplingInterval = "Profiler.setSamplingInterval".asInstanceOf[ProfilerDotsetSamplingInterval]
  @scala.inline
  def ProfilerDotstart: ProfilerDotstart = "Profiler.start".asInstanceOf[ProfilerDotstart]
  @scala.inline
  def ProfilerDotstartPreciseCoverage: ProfilerDotstartPreciseCoverage = "Profiler.startPreciseCoverage".asInstanceOf[ProfilerDotstartPreciseCoverage]
  @scala.inline
  def ProfilerDotstartTypeProfile: ProfilerDotstartTypeProfile = "Profiler.startTypeProfile".asInstanceOf[ProfilerDotstartTypeProfile]
  @scala.inline
  def ProfilerDotstop: ProfilerDotstop = "Profiler.stop".asInstanceOf[ProfilerDotstop]
  @scala.inline
  def ProfilerDotstopPreciseCoverage: ProfilerDotstopPreciseCoverage = "Profiler.stopPreciseCoverage".asInstanceOf[ProfilerDotstopPreciseCoverage]
  @scala.inline
  def ProfilerDotstopTypeProfile: ProfilerDotstopTypeProfile = "Profiler.stopTypeProfile".asInstanceOf[ProfilerDotstopTypeProfile]
  @scala.inline
  def ProfilerDottakePreciseCoverage: ProfilerDottakePreciseCoverage = "Profiler.takePreciseCoverage".asInstanceOf[ProfilerDottakePreciseCoverage]
  @scala.inline
  def ProfilerDottakeTypeProfile: ProfilerDottakeTypeProfile = "Profiler.takeTypeProfile".asInstanceOf[ProfilerDottakeTypeProfile]
  @scala.inline
  def RuntimeDotawaitPromise: RuntimeDotawaitPromise = "Runtime.awaitPromise".asInstanceOf[RuntimeDotawaitPromise]
  @scala.inline
  def RuntimeDotcallFunctionOn: RuntimeDotcallFunctionOn = "Runtime.callFunctionOn".asInstanceOf[RuntimeDotcallFunctionOn]
  @scala.inline
  def RuntimeDotcompileScript: RuntimeDotcompileScript = "Runtime.compileScript".asInstanceOf[RuntimeDotcompileScript]
  @scala.inline
  def RuntimeDotconsoleAPICalled: RuntimeDotconsoleAPICalled = "Runtime.consoleAPICalled".asInstanceOf[RuntimeDotconsoleAPICalled]
  @scala.inline
  def RuntimeDotdisable: RuntimeDotdisable = "Runtime.disable".asInstanceOf[RuntimeDotdisable]
  @scala.inline
  def RuntimeDotdiscardConsoleEntries: RuntimeDotdiscardConsoleEntries = "Runtime.discardConsoleEntries".asInstanceOf[RuntimeDotdiscardConsoleEntries]
  @scala.inline
  def RuntimeDotenable: RuntimeDotenable = "Runtime.enable".asInstanceOf[RuntimeDotenable]
  @scala.inline
  def RuntimeDotevaluate: RuntimeDotevaluate = "Runtime.evaluate".asInstanceOf[RuntimeDotevaluate]
  @scala.inline
  def RuntimeDotexceptionRevoked: RuntimeDotexceptionRevoked = "Runtime.exceptionRevoked".asInstanceOf[RuntimeDotexceptionRevoked]
  @scala.inline
  def RuntimeDotexceptionThrown: RuntimeDotexceptionThrown = "Runtime.exceptionThrown".asInstanceOf[RuntimeDotexceptionThrown]
  @scala.inline
  def RuntimeDotexecutionContextCreated: RuntimeDotexecutionContextCreated = "Runtime.executionContextCreated".asInstanceOf[RuntimeDotexecutionContextCreated]
  @scala.inline
  def RuntimeDotexecutionContextDestroyed: RuntimeDotexecutionContextDestroyed = "Runtime.executionContextDestroyed".asInstanceOf[RuntimeDotexecutionContextDestroyed]
  @scala.inline
  def RuntimeDotexecutionContextsCleared: RuntimeDotexecutionContextsCleared = "Runtime.executionContextsCleared".asInstanceOf[RuntimeDotexecutionContextsCleared]
  @scala.inline
  def RuntimeDotgetProperties: RuntimeDotgetProperties = "Runtime.getProperties".asInstanceOf[RuntimeDotgetProperties]
  @scala.inline
  def RuntimeDotglobalLexicalScopeNames: RuntimeDotglobalLexicalScopeNames = "Runtime.globalLexicalScopeNames".asInstanceOf[RuntimeDotglobalLexicalScopeNames]
  @scala.inline
  def RuntimeDotinspectRequested: RuntimeDotinspectRequested = "Runtime.inspectRequested".asInstanceOf[RuntimeDotinspectRequested]
  @scala.inline
  def RuntimeDotqueryObjects: RuntimeDotqueryObjects = "Runtime.queryObjects".asInstanceOf[RuntimeDotqueryObjects]
  @scala.inline
  def RuntimeDotreleaseObject: RuntimeDotreleaseObject = "Runtime.releaseObject".asInstanceOf[RuntimeDotreleaseObject]
  @scala.inline
  def RuntimeDotreleaseObjectGroup: RuntimeDotreleaseObjectGroup = "Runtime.releaseObjectGroup".asInstanceOf[RuntimeDotreleaseObjectGroup]
  @scala.inline
  def RuntimeDotrunIfWaitingForDebugger: RuntimeDotrunIfWaitingForDebugger = "Runtime.runIfWaitingForDebugger".asInstanceOf[RuntimeDotrunIfWaitingForDebugger]
  @scala.inline
  def RuntimeDotrunScript: RuntimeDotrunScript = "Runtime.runScript".asInstanceOf[RuntimeDotrunScript]
  @scala.inline
  def RuntimeDotsetCustomObjectFormatterEnabled: RuntimeDotsetCustomObjectFormatterEnabled = "Runtime.setCustomObjectFormatterEnabled".asInstanceOf[RuntimeDotsetCustomObjectFormatterEnabled]
  @scala.inline
  def SIGABRT: SIGABRT = "SIGABRT".asInstanceOf[SIGABRT]
  @scala.inline
  def SIGALRM: SIGALRM = "SIGALRM".asInstanceOf[SIGALRM]
  @scala.inline
  def SIGBREAK: SIGBREAK = "SIGBREAK".asInstanceOf[SIGBREAK]
  @scala.inline
  def SIGBUS: SIGBUS = "SIGBUS".asInstanceOf[SIGBUS]
  @scala.inline
  def SIGCHLD: SIGCHLD = "SIGCHLD".asInstanceOf[SIGCHLD]
  @scala.inline
  def SIGCONT: SIGCONT = "SIGCONT".asInstanceOf[SIGCONT]
  @scala.inline
  def SIGFPE: SIGFPE = "SIGFPE".asInstanceOf[SIGFPE]
  @scala.inline
  def SIGHUP: SIGHUP = "SIGHUP".asInstanceOf[SIGHUP]
  @scala.inline
  def SIGILL: SIGILL = "SIGILL".asInstanceOf[SIGILL]
  @scala.inline
  def SIGINFO: SIGINFO = "SIGINFO".asInstanceOf[SIGINFO]
  @scala.inline
  def SIGINT: SIGINT = "SIGINT".asInstanceOf[SIGINT]
  @scala.inline
  def SIGIO: SIGIO = "SIGIO".asInstanceOf[SIGIO]
  @scala.inline
  def SIGIOT: SIGIOT = "SIGIOT".asInstanceOf[SIGIOT]
  @scala.inline
  def SIGKILL: SIGKILL = "SIGKILL".asInstanceOf[SIGKILL]
  @scala.inline
  def SIGLOST: SIGLOST = "SIGLOST".asInstanceOf[SIGLOST]
  @scala.inline
  def SIGPIPE: SIGPIPE = "SIGPIPE".asInstanceOf[SIGPIPE]
  @scala.inline
  def SIGPOLL: SIGPOLL = "SIGPOLL".asInstanceOf[SIGPOLL]
  @scala.inline
  def SIGPROF: SIGPROF = "SIGPROF".asInstanceOf[SIGPROF]
  @scala.inline
  def SIGPWR: SIGPWR = "SIGPWR".asInstanceOf[SIGPWR]
  @scala.inline
  def SIGQUIT: SIGQUIT = "SIGQUIT".asInstanceOf[SIGQUIT]
  @scala.inline
  def SIGSEGV: SIGSEGV = "SIGSEGV".asInstanceOf[SIGSEGV]
  @scala.inline
  def SIGSTKFLT: SIGSTKFLT = "SIGSTKFLT".asInstanceOf[SIGSTKFLT]
  @scala.inline
  def SIGSTOP: SIGSTOP = "SIGSTOP".asInstanceOf[SIGSTOP]
  @scala.inline
  def SIGSYS: SIGSYS = "SIGSYS".asInstanceOf[SIGSYS]
  @scala.inline
  def SIGTERM: SIGTERM = "SIGTERM".asInstanceOf[SIGTERM]
  @scala.inline
  def SIGTRAP: SIGTRAP = "SIGTRAP".asInstanceOf[SIGTRAP]
  @scala.inline
  def SIGTSTP: SIGTSTP = "SIGTSTP".asInstanceOf[SIGTSTP]
  @scala.inline
  def SIGTTIN: SIGTTIN = "SIGTTIN".asInstanceOf[SIGTTIN]
  @scala.inline
  def SIGTTOU: SIGTTOU = "SIGTTOU".asInstanceOf[SIGTTOU]
  @scala.inline
  def SIGUNUSED: SIGUNUSED = "SIGUNUSED".asInstanceOf[SIGUNUSED]
  @scala.inline
  def SIGURG: SIGURG = "SIGURG".asInstanceOf[SIGURG]
  @scala.inline
  def SIGUSR1: SIGUSR1 = "SIGUSR1".asInstanceOf[SIGUSR1]
  @scala.inline
  def SIGUSR2: SIGUSR2 = "SIGUSR2".asInstanceOf[SIGUSR2]
  @scala.inline
  def SIGVTALRM: SIGVTALRM = "SIGVTALRM".asInstanceOf[SIGVTALRM]
  @scala.inline
  def SIGWINCH: SIGWINCH = "SIGWINCH".asInstanceOf[SIGWINCH]
  @scala.inline
  def SIGXCPU: SIGXCPU = "SIGXCPU".asInstanceOf[SIGXCPU]
  @scala.inline
  def SIGXFSZ: SIGXFSZ = "SIGXFSZ".asInstanceOf[SIGXFSZ]
  @scala.inline
  def SOA: SOA = "SOA".asInstanceOf[SOA]
  @scala.inline
  def SRV: SRV = "SRV".asInstanceOf[SRV]
  @scala.inline
  def SchemaDotgetDomains: SchemaDotgetDomains = "Schema.getDomains".asInstanceOf[SchemaDotgetDomains]
  @scala.inline
  def SignalConstants: SignalConstants = "SignalConstants".asInstanceOf[SignalConstants]
  @scala.inline
  def TLSv1: TLSv1 = "TLSv1".asInstanceOf[TLSv1]
  @scala.inline
  def TLSv1Dot1: TLSv1Dot1 = "TLSv1.1".asInstanceOf[TLSv1Dot1]
  @scala.inline
  def TLSv1Dot2: TLSv1Dot2 = "TLSv1.2".asInstanceOf[TLSv1Dot2]
  @scala.inline
  def TLSv1Dot3: TLSv1Dot3 = "TLSv1.3".asInstanceOf[TLSv1Dot3]
  @scala.inline
  def TXT: TXT = "TXT".asInstanceOf[TXT]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def advanced: advanced = "advanced".asInstanceOf[advanced]
  @scala.inline
  def `aes-128-ccm`: `aes-128-ccm` = "aes-128-ccm".asInstanceOf[`aes-128-ccm`]
  @scala.inline
  def `aes-128-gcm`: `aes-128-gcm` = "aes-128-gcm".asInstanceOf[`aes-128-gcm`]
  @scala.inline
  def `aes-192-ccm`: `aes-192-ccm` = "aes-192-ccm".asInstanceOf[`aes-192-ccm`]
  @scala.inline
  def `aes-192-gcm`: `aes-192-gcm` = "aes-192-gcm".asInstanceOf[`aes-192-gcm`]
  @scala.inline
  def `aes-256-ccm`: `aes-256-ccm` = "aes-256-ccm".asInstanceOf[`aes-256-ccm`]
  @scala.inline
  def `aes-256-gcm`: `aes-256-gcm` = "aes-256-gcm".asInstanceOf[`aes-256-gcm`]
  @scala.inline
  def aix: aix = "aix".asInstanceOf[aix]
  @scala.inline
  def altsvc: altsvc = "altsvc".asInstanceOf[altsvc]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def beforeExit: beforeExit = "beforeExit".asInstanceOf[beforeExit]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def buffer_ : buffer_ = "buffer".asInstanceOf[buffer_]
  @scala.inline
  def `chacha20-poly1305`: `chacha20-poly1305` = "chacha20-poly1305".asInstanceOf[`chacha20-poly1305`]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def checkContinue: checkContinue = "checkContinue".asInstanceOf[checkContinue]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def compressed: compressed = "compressed".asInstanceOf[compressed]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  @scala.inline
  def cygwin: cygwin = "cygwin".asInstanceOf[cygwin]
  @scala.inline
  def darwin: darwin = "darwin".asInstanceOf[darwin]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def der: der = "der".asInstanceOf[der]
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def dsa: dsa = "dsa".asInstanceOf[dsa]
  @scala.inline
  def ec: ec = "ec".asInstanceOf[ec]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def fork: fork = "fork".asInstanceOf[fork]
  @scala.inline
  def frameError: frameError = "frameError".asInstanceOf[frameError]
  @scala.inline
  def freebsd: freebsd = "freebsd".asInstanceOf[freebsd]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def goaway: goaway = "goaway".asInstanceOf[goaway]
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def information: information = "information".asInstanceOf[information]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def inspectorNotification: inspectorNotification = "inspectorNotification".asInstanceOf[inspectorNotification]
  @scala.inline
  def ipc: ipc = "ipc".asInstanceOf[ipc]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def junction: junction = "junction".asInstanceOf[junction]
  @scala.inline
  def keylog: keylog = "keylog".asInstanceOf[keylog]
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def listening: listening = "listening".asInstanceOf[listening]
  @scala.inline
  def localSettings: localSettings = "localSettings".asInstanceOf[localSettings]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def multipleResolves: multipleResolves = "multipleResolves".asInstanceOf[multipleResolves]
  @scala.inline
  def netbsd: netbsd = "netbsd".asInstanceOf[netbsd]
  @scala.inline
  def newListener: newListener = "newListener".asInstanceOf[newListener]
  @scala.inline
  def newSession: newSession = "newSession".asInstanceOf[newSession]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def pem: pem = "pem".asInstanceOf[pem]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  @scala.inline
  def pkcs1: pkcs1 = "pkcs1".asInstanceOf[pkcs1]
  @scala.inline
  def pkcs8: pkcs8 = "pkcs8".asInstanceOf[pkcs8]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def push: push = "push".asInstanceOf[push]
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  @scala.inline
  def reject: reject = "reject".asInstanceOf[reject]
  @scala.inline
  def rejectionHandled: rejectionHandled = "rejectionHandled".asInstanceOf[rejectionHandled]
  @scala.inline
  def remoteSettings: remoteSettings = "remoteSettings".asInstanceOf[remoteSettings]
  @scala.inline
  def removeListener: removeListener = "removeListener".asInstanceOf[removeListener]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def resolve: resolve = "resolve".asInstanceOf[resolve]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  @scala.inline
  def resumeSession: resumeSession = "resumeSession".asInstanceOf[resumeSession]
  @scala.inline
  def rsa: rsa = "rsa".asInstanceOf[rsa]
  @scala.inline
  def sec1: sec1 = "sec1".asInstanceOf[sec1]
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  @scala.inline
  def secureConnect: secureConnect = "secureConnect".asInstanceOf[secureConnect]
  @scala.inline
  def secureConnection: secureConnection = "secureConnection".asInstanceOf[secureConnection]
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  @scala.inline
  def sessionError: sessionError = "sessionError".asInstanceOf[sessionError]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def setup: setup = "setup".asInstanceOf[setup]
  @scala.inline
  def socket: socket = "socket".asInstanceOf[socket]
  @scala.inline
  def spki: spki = "spki".asInstanceOf[spki]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def streamClosed: streamClosed = "streamClosed".asInstanceOf[streamClosed]
  @scala.inline
  def sunos: sunos = "sunos".asInstanceOf[sunos]
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  @scala.inline
  def tlsClientError: tlsClientError = "tlsClientError".asInstanceOf[tlsClientError]
  @scala.inline
  def trailers: trailers = "trailers".asInstanceOf[trailers]
  @scala.inline
  def `ucs-2`: `ucs-2` = "ucs-2".asInstanceOf[`ucs-2`]
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  @scala.inline
  def udp4: udp4 = "udp4".asInstanceOf[udp4]
  @scala.inline
  def udp6: udp6 = "udp6".asInstanceOf[udp6]
  @scala.inline
  def uncaughtException: uncaughtException = "uncaughtException".asInstanceOf[uncaughtException]
  @scala.inline
  def uncompressed: uncompressed = "uncompressed".asInstanceOf[uncompressed]
  @scala.inline
  def unhandledRejection: unhandledRejection = "unhandledRejection".asInstanceOf[unhandledRejection]
  @scala.inline
  def unknownProtocol: unknownProtocol = "unknownProtocol".asInstanceOf[unknownProtocol]
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
  @scala.inline
  def upgrade: upgrade = "upgrade".asInstanceOf[upgrade]
  @scala.inline
  def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
  @scala.inline
  def wantTrailers: wantTrailers = "wantTrailers".asInstanceOf[wantTrailers]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  @scala.inline
  def win32: win32 = "win32".asInstanceOf[win32]
}

