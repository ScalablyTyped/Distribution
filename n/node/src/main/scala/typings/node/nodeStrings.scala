package typings.node

import typings.node.NodeJS.MultipleResolveType
import typings.node.NodeJS.Platform
import typings.node.NodeJS.Signals
import typings.node.bufferMod.TranscodeEncoding
import typings.node.childUnderscoreProcessMod.StdioNull
import typings.node.childUnderscoreProcessMod._StdioOptions
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
  sealed trait `/` extends js.Object
  
  @js.native
  sealed trait `:` extends js.Object
  
  @js.native
  sealed trait `;` extends js.Object
  
  @js.native
  sealed trait A extends js.Object
  
  @js.native
  sealed trait AAAA extends js.Object
  
  @js.native
  sealed trait ANY extends js.Object
  
  @js.native
  sealed trait BACKSLASHBACKSLASH extends js.Object
  
  @js.native
  sealed trait BE extends js.Object
  
  @js.native
  sealed trait Buffer extends js.Object
  
  @js.native
  sealed trait CNAME extends js.Object
  
  @js.native
  sealed trait ConsoleDOTclearMessages extends js.Object
  
  @js.native
  sealed trait ConsoleDOTdisable extends js.Object
  
  @js.native
  sealed trait ConsoleDOTenable extends js.Object
  
  @js.native
  sealed trait ConsoleDOTmessageAdded extends js.Object
  
  @js.native
  sealed trait DebuggerDOTbreakpointResolved extends js.Object
  
  @js.native
  sealed trait DebuggerDOTcontinueToLocation extends js.Object
  
  @js.native
  sealed trait DebuggerDOTdisable extends js.Object
  
  @js.native
  sealed trait DebuggerDOTenable extends js.Object
  
  @js.native
  sealed trait DebuggerDOTevaluateOnCallFrame extends js.Object
  
  @js.native
  sealed trait DebuggerDOTgetPossibleBreakpoints extends js.Object
  
  @js.native
  sealed trait DebuggerDOTgetScriptSource extends js.Object
  
  @js.native
  sealed trait DebuggerDOTgetStackTrace extends js.Object
  
  @js.native
  sealed trait DebuggerDOTpause extends js.Object
  
  @js.native
  sealed trait DebuggerDOTpauseOnAsyncCall extends js.Object
  
  @js.native
  sealed trait DebuggerDOTpaused extends js.Object
  
  @js.native
  sealed trait DebuggerDOTremoveBreakpoint extends js.Object
  
  @js.native
  sealed trait DebuggerDOTrestartFrame extends js.Object
  
  @js.native
  sealed trait DebuggerDOTresume extends js.Object
  
  @js.native
  sealed trait DebuggerDOTresumed extends js.Object
  
  @js.native
  sealed trait DebuggerDOTscheduleStepIntoAsync extends js.Object
  
  @js.native
  sealed trait DebuggerDOTscriptFailedToParse extends js.Object
  
  @js.native
  sealed trait DebuggerDOTscriptParsed extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsearchInContent extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetAsyncCallStackDepth extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetBlackboxPatterns extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetBlackboxedRanges extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetBreakpoint extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetBreakpointByUrl extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetBreakpointsActive extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetPauseOnExceptions extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetReturnValue extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetScriptSource extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetSkipAllPauses extends js.Object
  
  @js.native
  sealed trait DebuggerDOTsetVariableValue extends js.Object
  
  @js.native
  sealed trait DebuggerDOTstepInto extends js.Object
  
  @js.native
  sealed trait DebuggerDOTstepOut extends js.Object
  
  @js.native
  sealed trait DebuggerDOTstepOver extends js.Object
  
  @js.native
  sealed trait ERR_ASSERTION extends js.Object
  
  @js.native
  sealed trait Empty extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTaddHeapSnapshotChunk extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTaddInspectedHeapObject extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTcollectGarbage extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTdisable extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTenable extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTgetHeapObjectId extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTgetObjectByHeapObjectId extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTgetSamplingProfile extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTheapStatsUpdate extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTlastSeenObjectId extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTreportHeapSnapshotProgress extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTresetProfiles extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTstartSampling extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTstartTrackingHeapObjects extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTstopSampling extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTstopTrackingHeapObjects extends js.Object
  
  @js.native
  sealed trait HeapProfilerDOTtakeHeapSnapshot extends js.Object
  
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
  sealed trait NodeRuntimeDOTnotifyWhenWaitingForDisconnect extends js.Object
  
  @js.native
  sealed trait NodeRuntimeDOTwaitingForDisconnect extends js.Object
  
  @js.native
  sealed trait NodeTracingDOTdataCollected extends js.Object
  
  @js.native
  sealed trait NodeTracingDOTgetCategories extends js.Object
  
  @js.native
  sealed trait NodeTracingDOTstart extends js.Object
  
  @js.native
  sealed trait NodeTracingDOTstop extends js.Object
  
  @js.native
  sealed trait NodeTracingDOTtracingComplete extends js.Object
  
  @js.native
  sealed trait NodeWorkerDOTattachedToWorker extends js.Object
  
  @js.native
  sealed trait NodeWorkerDOTdetach extends js.Object
  
  @js.native
  sealed trait NodeWorkerDOTdetachedFromWorker extends js.Object
  
  @js.native
  sealed trait NodeWorkerDOTdisable extends js.Object
  
  @js.native
  sealed trait NodeWorkerDOTenable extends js.Object
  
  @js.native
  sealed trait NodeWorkerDOTreceivedMessageFromWorker extends js.Object
  
  @js.native
  sealed trait NodeWorkerDOTsendMessageToWorker extends js.Object
  
  @js.native
  sealed trait OCSPRequest extends js.Object
  
  @js.native
  sealed trait OCSPResponse extends js.Object
  
  @js.native
  sealed trait PTR extends js.Object
  
  @js.native
  sealed trait ProfilerDOTconsoleProfileFinished extends js.Object
  
  @js.native
  sealed trait ProfilerDOTconsoleProfileStarted extends js.Object
  
  @js.native
  sealed trait ProfilerDOTdisable extends js.Object
  
  @js.native
  sealed trait ProfilerDOTenable extends js.Object
  
  @js.native
  sealed trait ProfilerDOTgetBestEffortCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDOTsetSamplingInterval extends js.Object
  
  @js.native
  sealed trait ProfilerDOTstart extends js.Object
  
  @js.native
  sealed trait ProfilerDOTstartPreciseCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDOTstartTypeProfile extends js.Object
  
  @js.native
  sealed trait ProfilerDOTstop extends js.Object
  
  @js.native
  sealed trait ProfilerDOTstopPreciseCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDOTstopTypeProfile extends js.Object
  
  @js.native
  sealed trait ProfilerDOTtakePreciseCoverage extends js.Object
  
  @js.native
  sealed trait ProfilerDOTtakeTypeProfile extends js.Object
  
  @js.native
  sealed trait RuntimeDOTawaitPromise extends js.Object
  
  @js.native
  sealed trait RuntimeDOTcallFunctionOn extends js.Object
  
  @js.native
  sealed trait RuntimeDOTcompileScript extends js.Object
  
  @js.native
  sealed trait RuntimeDOTconsoleAPICalled extends js.Object
  
  @js.native
  sealed trait RuntimeDOTdisable extends js.Object
  
  @js.native
  sealed trait RuntimeDOTdiscardConsoleEntries extends js.Object
  
  @js.native
  sealed trait RuntimeDOTenable extends js.Object
  
  @js.native
  sealed trait RuntimeDOTevaluate extends js.Object
  
  @js.native
  sealed trait RuntimeDOTexceptionRevoked extends js.Object
  
  @js.native
  sealed trait RuntimeDOTexceptionThrown extends js.Object
  
  @js.native
  sealed trait RuntimeDOTexecutionContextCreated extends js.Object
  
  @js.native
  sealed trait RuntimeDOTexecutionContextDestroyed extends js.Object
  
  @js.native
  sealed trait RuntimeDOTexecutionContextsCleared extends js.Object
  
  @js.native
  sealed trait RuntimeDOTgetProperties extends js.Object
  
  @js.native
  sealed trait RuntimeDOTglobalLexicalScopeNames extends js.Object
  
  @js.native
  sealed trait RuntimeDOTinspectRequested extends js.Object
  
  @js.native
  sealed trait RuntimeDOTqueryObjects extends js.Object
  
  @js.native
  sealed trait RuntimeDOTreleaseObject extends js.Object
  
  @js.native
  sealed trait RuntimeDOTreleaseObjectGroup extends js.Object
  
  @js.native
  sealed trait RuntimeDOTrunIfWaitingForDebugger extends js.Object
  
  @js.native
  sealed trait RuntimeDOTrunScript extends js.Object
  
  @js.native
  sealed trait RuntimeDOTsetCustomObjectFormatterEnabled extends js.Object
  
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
  sealed trait SchemaDOTgetDomains extends js.Object
  
  @js.native
  sealed trait TLSv1 extends SecureVersion
  
  @js.native
  sealed trait TLSv1DOT1 extends SecureVersion
  
  @js.native
  sealed trait TLSv1DOT2 extends SecureVersion
  
  @js.native
  sealed trait TLSv1DOT3 extends SecureVersion
  
  @js.native
  sealed trait TXT extends js.Object
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait aborted extends js.Object
  
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
  sealed trait buffer extends js.Object
  
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
  def `/`: `/` = "/".asInstanceOf[`/`]
  @scala.inline
  def `:`: `:` = ":".asInstanceOf[`:`]
  @scala.inline
  def `;`: `;` = ";".asInstanceOf[`;`]
  @scala.inline
  def A: A = "A".asInstanceOf[A]
  @scala.inline
  def AAAA: AAAA = "AAAA".asInstanceOf[AAAA]
  @scala.inline
  def ANY: ANY = "ANY".asInstanceOf[ANY]
  @scala.inline
  def BACKSLASHBACKSLASH: BACKSLASHBACKSLASH = "\\".asInstanceOf[BACKSLASHBACKSLASH]
  @scala.inline
  def BE: BE = "BE".asInstanceOf[BE]
  @scala.inline
  def Buffer: Buffer = "Buffer".asInstanceOf[Buffer]
  @scala.inline
  def CNAME: CNAME = "CNAME".asInstanceOf[CNAME]
  @scala.inline
  def ConsoleDOTclearMessages: ConsoleDOTclearMessages = "Console.clearMessages".asInstanceOf[ConsoleDOTclearMessages]
  @scala.inline
  def ConsoleDOTdisable: ConsoleDOTdisable = "Console.disable".asInstanceOf[ConsoleDOTdisable]
  @scala.inline
  def ConsoleDOTenable: ConsoleDOTenable = "Console.enable".asInstanceOf[ConsoleDOTenable]
  @scala.inline
  def ConsoleDOTmessageAdded: ConsoleDOTmessageAdded = "Console.messageAdded".asInstanceOf[ConsoleDOTmessageAdded]
  @scala.inline
  def DebuggerDOTbreakpointResolved: DebuggerDOTbreakpointResolved = "Debugger.breakpointResolved".asInstanceOf[DebuggerDOTbreakpointResolved]
  @scala.inline
  def DebuggerDOTcontinueToLocation: DebuggerDOTcontinueToLocation = "Debugger.continueToLocation".asInstanceOf[DebuggerDOTcontinueToLocation]
  @scala.inline
  def DebuggerDOTdisable: DebuggerDOTdisable = "Debugger.disable".asInstanceOf[DebuggerDOTdisable]
  @scala.inline
  def DebuggerDOTenable: DebuggerDOTenable = "Debugger.enable".asInstanceOf[DebuggerDOTenable]
  @scala.inline
  def DebuggerDOTevaluateOnCallFrame: DebuggerDOTevaluateOnCallFrame = "Debugger.evaluateOnCallFrame".asInstanceOf[DebuggerDOTevaluateOnCallFrame]
  @scala.inline
  def DebuggerDOTgetPossibleBreakpoints: DebuggerDOTgetPossibleBreakpoints = "Debugger.getPossibleBreakpoints".asInstanceOf[DebuggerDOTgetPossibleBreakpoints]
  @scala.inline
  def DebuggerDOTgetScriptSource: DebuggerDOTgetScriptSource = "Debugger.getScriptSource".asInstanceOf[DebuggerDOTgetScriptSource]
  @scala.inline
  def DebuggerDOTgetStackTrace: DebuggerDOTgetStackTrace = "Debugger.getStackTrace".asInstanceOf[DebuggerDOTgetStackTrace]
  @scala.inline
  def DebuggerDOTpause: DebuggerDOTpause = "Debugger.pause".asInstanceOf[DebuggerDOTpause]
  @scala.inline
  def DebuggerDOTpauseOnAsyncCall: DebuggerDOTpauseOnAsyncCall = "Debugger.pauseOnAsyncCall".asInstanceOf[DebuggerDOTpauseOnAsyncCall]
  @scala.inline
  def DebuggerDOTpaused: DebuggerDOTpaused = "Debugger.paused".asInstanceOf[DebuggerDOTpaused]
  @scala.inline
  def DebuggerDOTremoveBreakpoint: DebuggerDOTremoveBreakpoint = "Debugger.removeBreakpoint".asInstanceOf[DebuggerDOTremoveBreakpoint]
  @scala.inline
  def DebuggerDOTrestartFrame: DebuggerDOTrestartFrame = "Debugger.restartFrame".asInstanceOf[DebuggerDOTrestartFrame]
  @scala.inline
  def DebuggerDOTresume: DebuggerDOTresume = "Debugger.resume".asInstanceOf[DebuggerDOTresume]
  @scala.inline
  def DebuggerDOTresumed: DebuggerDOTresumed = "Debugger.resumed".asInstanceOf[DebuggerDOTresumed]
  @scala.inline
  def DebuggerDOTscheduleStepIntoAsync: DebuggerDOTscheduleStepIntoAsync = "Debugger.scheduleStepIntoAsync".asInstanceOf[DebuggerDOTscheduleStepIntoAsync]
  @scala.inline
  def DebuggerDOTscriptFailedToParse: DebuggerDOTscriptFailedToParse = "Debugger.scriptFailedToParse".asInstanceOf[DebuggerDOTscriptFailedToParse]
  @scala.inline
  def DebuggerDOTscriptParsed: DebuggerDOTscriptParsed = "Debugger.scriptParsed".asInstanceOf[DebuggerDOTscriptParsed]
  @scala.inline
  def DebuggerDOTsearchInContent: DebuggerDOTsearchInContent = "Debugger.searchInContent".asInstanceOf[DebuggerDOTsearchInContent]
  @scala.inline
  def DebuggerDOTsetAsyncCallStackDepth: DebuggerDOTsetAsyncCallStackDepth = "Debugger.setAsyncCallStackDepth".asInstanceOf[DebuggerDOTsetAsyncCallStackDepth]
  @scala.inline
  def DebuggerDOTsetBlackboxPatterns: DebuggerDOTsetBlackboxPatterns = "Debugger.setBlackboxPatterns".asInstanceOf[DebuggerDOTsetBlackboxPatterns]
  @scala.inline
  def DebuggerDOTsetBlackboxedRanges: DebuggerDOTsetBlackboxedRanges = "Debugger.setBlackboxedRanges".asInstanceOf[DebuggerDOTsetBlackboxedRanges]
  @scala.inline
  def DebuggerDOTsetBreakpoint: DebuggerDOTsetBreakpoint = "Debugger.setBreakpoint".asInstanceOf[DebuggerDOTsetBreakpoint]
  @scala.inline
  def DebuggerDOTsetBreakpointByUrl: DebuggerDOTsetBreakpointByUrl = "Debugger.setBreakpointByUrl".asInstanceOf[DebuggerDOTsetBreakpointByUrl]
  @scala.inline
  def DebuggerDOTsetBreakpointsActive: DebuggerDOTsetBreakpointsActive = "Debugger.setBreakpointsActive".asInstanceOf[DebuggerDOTsetBreakpointsActive]
  @scala.inline
  def DebuggerDOTsetPauseOnExceptions: DebuggerDOTsetPauseOnExceptions = "Debugger.setPauseOnExceptions".asInstanceOf[DebuggerDOTsetPauseOnExceptions]
  @scala.inline
  def DebuggerDOTsetReturnValue: DebuggerDOTsetReturnValue = "Debugger.setReturnValue".asInstanceOf[DebuggerDOTsetReturnValue]
  @scala.inline
  def DebuggerDOTsetScriptSource: DebuggerDOTsetScriptSource = "Debugger.setScriptSource".asInstanceOf[DebuggerDOTsetScriptSource]
  @scala.inline
  def DebuggerDOTsetSkipAllPauses: DebuggerDOTsetSkipAllPauses = "Debugger.setSkipAllPauses".asInstanceOf[DebuggerDOTsetSkipAllPauses]
  @scala.inline
  def DebuggerDOTsetVariableValue: DebuggerDOTsetVariableValue = "Debugger.setVariableValue".asInstanceOf[DebuggerDOTsetVariableValue]
  @scala.inline
  def DebuggerDOTstepInto: DebuggerDOTstepInto = "Debugger.stepInto".asInstanceOf[DebuggerDOTstepInto]
  @scala.inline
  def DebuggerDOTstepOut: DebuggerDOTstepOut = "Debugger.stepOut".asInstanceOf[DebuggerDOTstepOut]
  @scala.inline
  def DebuggerDOTstepOver: DebuggerDOTstepOver = "Debugger.stepOver".asInstanceOf[DebuggerDOTstepOver]
  @scala.inline
  def ERR_ASSERTION: ERR_ASSERTION = "ERR_ASSERTION".asInstanceOf[ERR_ASSERTION]
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def HeapProfilerDOTaddHeapSnapshotChunk: HeapProfilerDOTaddHeapSnapshotChunk = "HeapProfiler.addHeapSnapshotChunk".asInstanceOf[HeapProfilerDOTaddHeapSnapshotChunk]
  @scala.inline
  def HeapProfilerDOTaddInspectedHeapObject: HeapProfilerDOTaddInspectedHeapObject = "HeapProfiler.addInspectedHeapObject".asInstanceOf[HeapProfilerDOTaddInspectedHeapObject]
  @scala.inline
  def HeapProfilerDOTcollectGarbage: HeapProfilerDOTcollectGarbage = "HeapProfiler.collectGarbage".asInstanceOf[HeapProfilerDOTcollectGarbage]
  @scala.inline
  def HeapProfilerDOTdisable: HeapProfilerDOTdisable = "HeapProfiler.disable".asInstanceOf[HeapProfilerDOTdisable]
  @scala.inline
  def HeapProfilerDOTenable: HeapProfilerDOTenable = "HeapProfiler.enable".asInstanceOf[HeapProfilerDOTenable]
  @scala.inline
  def HeapProfilerDOTgetHeapObjectId: HeapProfilerDOTgetHeapObjectId = "HeapProfiler.getHeapObjectId".asInstanceOf[HeapProfilerDOTgetHeapObjectId]
  @scala.inline
  def HeapProfilerDOTgetObjectByHeapObjectId: HeapProfilerDOTgetObjectByHeapObjectId = "HeapProfiler.getObjectByHeapObjectId".asInstanceOf[HeapProfilerDOTgetObjectByHeapObjectId]
  @scala.inline
  def HeapProfilerDOTgetSamplingProfile: HeapProfilerDOTgetSamplingProfile = "HeapProfiler.getSamplingProfile".asInstanceOf[HeapProfilerDOTgetSamplingProfile]
  @scala.inline
  def HeapProfilerDOTheapStatsUpdate: HeapProfilerDOTheapStatsUpdate = "HeapProfiler.heapStatsUpdate".asInstanceOf[HeapProfilerDOTheapStatsUpdate]
  @scala.inline
  def HeapProfilerDOTlastSeenObjectId: HeapProfilerDOTlastSeenObjectId = "HeapProfiler.lastSeenObjectId".asInstanceOf[HeapProfilerDOTlastSeenObjectId]
  @scala.inline
  def HeapProfilerDOTreportHeapSnapshotProgress: HeapProfilerDOTreportHeapSnapshotProgress = "HeapProfiler.reportHeapSnapshotProgress".asInstanceOf[HeapProfilerDOTreportHeapSnapshotProgress]
  @scala.inline
  def HeapProfilerDOTresetProfiles: HeapProfilerDOTresetProfiles = "HeapProfiler.resetProfiles".asInstanceOf[HeapProfilerDOTresetProfiles]
  @scala.inline
  def HeapProfilerDOTstartSampling: HeapProfilerDOTstartSampling = "HeapProfiler.startSampling".asInstanceOf[HeapProfilerDOTstartSampling]
  @scala.inline
  def HeapProfilerDOTstartTrackingHeapObjects: HeapProfilerDOTstartTrackingHeapObjects = "HeapProfiler.startTrackingHeapObjects".asInstanceOf[HeapProfilerDOTstartTrackingHeapObjects]
  @scala.inline
  def HeapProfilerDOTstopSampling: HeapProfilerDOTstopSampling = "HeapProfiler.stopSampling".asInstanceOf[HeapProfilerDOTstopSampling]
  @scala.inline
  def HeapProfilerDOTstopTrackingHeapObjects: HeapProfilerDOTstopTrackingHeapObjects = "HeapProfiler.stopTrackingHeapObjects".asInstanceOf[HeapProfilerDOTstopTrackingHeapObjects]
  @scala.inline
  def HeapProfilerDOTtakeHeapSnapshot: HeapProfilerDOTtakeHeapSnapshot = "HeapProfiler.takeHeapSnapshot".asInstanceOf[HeapProfilerDOTtakeHeapSnapshot]
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
  def NodeRuntimeDOTnotifyWhenWaitingForDisconnect: NodeRuntimeDOTnotifyWhenWaitingForDisconnect = "NodeRuntime.notifyWhenWaitingForDisconnect".asInstanceOf[NodeRuntimeDOTnotifyWhenWaitingForDisconnect]
  @scala.inline
  def NodeRuntimeDOTwaitingForDisconnect: NodeRuntimeDOTwaitingForDisconnect = "NodeRuntime.waitingForDisconnect".asInstanceOf[NodeRuntimeDOTwaitingForDisconnect]
  @scala.inline
  def NodeTracingDOTdataCollected: NodeTracingDOTdataCollected = "NodeTracing.dataCollected".asInstanceOf[NodeTracingDOTdataCollected]
  @scala.inline
  def NodeTracingDOTgetCategories: NodeTracingDOTgetCategories = "NodeTracing.getCategories".asInstanceOf[NodeTracingDOTgetCategories]
  @scala.inline
  def NodeTracingDOTstart: NodeTracingDOTstart = "NodeTracing.start".asInstanceOf[NodeTracingDOTstart]
  @scala.inline
  def NodeTracingDOTstop: NodeTracingDOTstop = "NodeTracing.stop".asInstanceOf[NodeTracingDOTstop]
  @scala.inline
  def NodeTracingDOTtracingComplete: NodeTracingDOTtracingComplete = "NodeTracing.tracingComplete".asInstanceOf[NodeTracingDOTtracingComplete]
  @scala.inline
  def NodeWorkerDOTattachedToWorker: NodeWorkerDOTattachedToWorker = "NodeWorker.attachedToWorker".asInstanceOf[NodeWorkerDOTattachedToWorker]
  @scala.inline
  def NodeWorkerDOTdetach: NodeWorkerDOTdetach = "NodeWorker.detach".asInstanceOf[NodeWorkerDOTdetach]
  @scala.inline
  def NodeWorkerDOTdetachedFromWorker: NodeWorkerDOTdetachedFromWorker = "NodeWorker.detachedFromWorker".asInstanceOf[NodeWorkerDOTdetachedFromWorker]
  @scala.inline
  def NodeWorkerDOTdisable: NodeWorkerDOTdisable = "NodeWorker.disable".asInstanceOf[NodeWorkerDOTdisable]
  @scala.inline
  def NodeWorkerDOTenable: NodeWorkerDOTenable = "NodeWorker.enable".asInstanceOf[NodeWorkerDOTenable]
  @scala.inline
  def NodeWorkerDOTreceivedMessageFromWorker: NodeWorkerDOTreceivedMessageFromWorker = "NodeWorker.receivedMessageFromWorker".asInstanceOf[NodeWorkerDOTreceivedMessageFromWorker]
  @scala.inline
  def NodeWorkerDOTsendMessageToWorker: NodeWorkerDOTsendMessageToWorker = "NodeWorker.sendMessageToWorker".asInstanceOf[NodeWorkerDOTsendMessageToWorker]
  @scala.inline
  def OCSPRequest: OCSPRequest = "OCSPRequest".asInstanceOf[OCSPRequest]
  @scala.inline
  def OCSPResponse: OCSPResponse = "OCSPResponse".asInstanceOf[OCSPResponse]
  @scala.inline
  def PTR: PTR = "PTR".asInstanceOf[PTR]
  @scala.inline
  def ProfilerDOTconsoleProfileFinished: ProfilerDOTconsoleProfileFinished = "Profiler.consoleProfileFinished".asInstanceOf[ProfilerDOTconsoleProfileFinished]
  @scala.inline
  def ProfilerDOTconsoleProfileStarted: ProfilerDOTconsoleProfileStarted = "Profiler.consoleProfileStarted".asInstanceOf[ProfilerDOTconsoleProfileStarted]
  @scala.inline
  def ProfilerDOTdisable: ProfilerDOTdisable = "Profiler.disable".asInstanceOf[ProfilerDOTdisable]
  @scala.inline
  def ProfilerDOTenable: ProfilerDOTenable = "Profiler.enable".asInstanceOf[ProfilerDOTenable]
  @scala.inline
  def ProfilerDOTgetBestEffortCoverage: ProfilerDOTgetBestEffortCoverage = "Profiler.getBestEffortCoverage".asInstanceOf[ProfilerDOTgetBestEffortCoverage]
  @scala.inline
  def ProfilerDOTsetSamplingInterval: ProfilerDOTsetSamplingInterval = "Profiler.setSamplingInterval".asInstanceOf[ProfilerDOTsetSamplingInterval]
  @scala.inline
  def ProfilerDOTstart: ProfilerDOTstart = "Profiler.start".asInstanceOf[ProfilerDOTstart]
  @scala.inline
  def ProfilerDOTstartPreciseCoverage: ProfilerDOTstartPreciseCoverage = "Profiler.startPreciseCoverage".asInstanceOf[ProfilerDOTstartPreciseCoverage]
  @scala.inline
  def ProfilerDOTstartTypeProfile: ProfilerDOTstartTypeProfile = "Profiler.startTypeProfile".asInstanceOf[ProfilerDOTstartTypeProfile]
  @scala.inline
  def ProfilerDOTstop: ProfilerDOTstop = "Profiler.stop".asInstanceOf[ProfilerDOTstop]
  @scala.inline
  def ProfilerDOTstopPreciseCoverage: ProfilerDOTstopPreciseCoverage = "Profiler.stopPreciseCoverage".asInstanceOf[ProfilerDOTstopPreciseCoverage]
  @scala.inline
  def ProfilerDOTstopTypeProfile: ProfilerDOTstopTypeProfile = "Profiler.stopTypeProfile".asInstanceOf[ProfilerDOTstopTypeProfile]
  @scala.inline
  def ProfilerDOTtakePreciseCoverage: ProfilerDOTtakePreciseCoverage = "Profiler.takePreciseCoverage".asInstanceOf[ProfilerDOTtakePreciseCoverage]
  @scala.inline
  def ProfilerDOTtakeTypeProfile: ProfilerDOTtakeTypeProfile = "Profiler.takeTypeProfile".asInstanceOf[ProfilerDOTtakeTypeProfile]
  @scala.inline
  def RuntimeDOTawaitPromise: RuntimeDOTawaitPromise = "Runtime.awaitPromise".asInstanceOf[RuntimeDOTawaitPromise]
  @scala.inline
  def RuntimeDOTcallFunctionOn: RuntimeDOTcallFunctionOn = "Runtime.callFunctionOn".asInstanceOf[RuntimeDOTcallFunctionOn]
  @scala.inline
  def RuntimeDOTcompileScript: RuntimeDOTcompileScript = "Runtime.compileScript".asInstanceOf[RuntimeDOTcompileScript]
  @scala.inline
  def RuntimeDOTconsoleAPICalled: RuntimeDOTconsoleAPICalled = "Runtime.consoleAPICalled".asInstanceOf[RuntimeDOTconsoleAPICalled]
  @scala.inline
  def RuntimeDOTdisable: RuntimeDOTdisable = "Runtime.disable".asInstanceOf[RuntimeDOTdisable]
  @scala.inline
  def RuntimeDOTdiscardConsoleEntries: RuntimeDOTdiscardConsoleEntries = "Runtime.discardConsoleEntries".asInstanceOf[RuntimeDOTdiscardConsoleEntries]
  @scala.inline
  def RuntimeDOTenable: RuntimeDOTenable = "Runtime.enable".asInstanceOf[RuntimeDOTenable]
  @scala.inline
  def RuntimeDOTevaluate: RuntimeDOTevaluate = "Runtime.evaluate".asInstanceOf[RuntimeDOTevaluate]
  @scala.inline
  def RuntimeDOTexceptionRevoked: RuntimeDOTexceptionRevoked = "Runtime.exceptionRevoked".asInstanceOf[RuntimeDOTexceptionRevoked]
  @scala.inline
  def RuntimeDOTexceptionThrown: RuntimeDOTexceptionThrown = "Runtime.exceptionThrown".asInstanceOf[RuntimeDOTexceptionThrown]
  @scala.inline
  def RuntimeDOTexecutionContextCreated: RuntimeDOTexecutionContextCreated = "Runtime.executionContextCreated".asInstanceOf[RuntimeDOTexecutionContextCreated]
  @scala.inline
  def RuntimeDOTexecutionContextDestroyed: RuntimeDOTexecutionContextDestroyed = "Runtime.executionContextDestroyed".asInstanceOf[RuntimeDOTexecutionContextDestroyed]
  @scala.inline
  def RuntimeDOTexecutionContextsCleared: RuntimeDOTexecutionContextsCleared = "Runtime.executionContextsCleared".asInstanceOf[RuntimeDOTexecutionContextsCleared]
  @scala.inline
  def RuntimeDOTgetProperties: RuntimeDOTgetProperties = "Runtime.getProperties".asInstanceOf[RuntimeDOTgetProperties]
  @scala.inline
  def RuntimeDOTglobalLexicalScopeNames: RuntimeDOTglobalLexicalScopeNames = "Runtime.globalLexicalScopeNames".asInstanceOf[RuntimeDOTglobalLexicalScopeNames]
  @scala.inline
  def RuntimeDOTinspectRequested: RuntimeDOTinspectRequested = "Runtime.inspectRequested".asInstanceOf[RuntimeDOTinspectRequested]
  @scala.inline
  def RuntimeDOTqueryObjects: RuntimeDOTqueryObjects = "Runtime.queryObjects".asInstanceOf[RuntimeDOTqueryObjects]
  @scala.inline
  def RuntimeDOTreleaseObject: RuntimeDOTreleaseObject = "Runtime.releaseObject".asInstanceOf[RuntimeDOTreleaseObject]
  @scala.inline
  def RuntimeDOTreleaseObjectGroup: RuntimeDOTreleaseObjectGroup = "Runtime.releaseObjectGroup".asInstanceOf[RuntimeDOTreleaseObjectGroup]
  @scala.inline
  def RuntimeDOTrunIfWaitingForDebugger: RuntimeDOTrunIfWaitingForDebugger = "Runtime.runIfWaitingForDebugger".asInstanceOf[RuntimeDOTrunIfWaitingForDebugger]
  @scala.inline
  def RuntimeDOTrunScript: RuntimeDOTrunScript = "Runtime.runScript".asInstanceOf[RuntimeDOTrunScript]
  @scala.inline
  def RuntimeDOTsetCustomObjectFormatterEnabled: RuntimeDOTsetCustomObjectFormatterEnabled = "Runtime.setCustomObjectFormatterEnabled".asInstanceOf[RuntimeDOTsetCustomObjectFormatterEnabled]
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
  def SchemaDOTgetDomains: SchemaDOTgetDomains = "Schema.getDomains".asInstanceOf[SchemaDOTgetDomains]
  @scala.inline
  def TLSv1: TLSv1 = "TLSv1".asInstanceOf[TLSv1]
  @scala.inline
  def TLSv1DOT1: TLSv1DOT1 = "TLSv1.1".asInstanceOf[TLSv1DOT1]
  @scala.inline
  def TLSv1DOT2: TLSv1DOT2 = "TLSv1.2".asInstanceOf[TLSv1DOT2]
  @scala.inline
  def TLSv1DOT3: TLSv1DOT3 = "TLSv1.3".asInstanceOf[TLSv1DOT3]
  @scala.inline
  def TXT: TXT = "TXT".asInstanceOf[TXT]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
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
  def buffer: buffer = "buffer".asInstanceOf[buffer]
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

