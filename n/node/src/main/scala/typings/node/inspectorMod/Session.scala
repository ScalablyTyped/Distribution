package typings.node.inspectorMod

import typings.node.inspectorMod.Console.MessageAddedEventDataType
import typings.node.inspectorMod.Debugger.BreakpointResolvedEventDataType
import typings.node.inspectorMod.Debugger.ContinueToLocationParameterType
import typings.node.inspectorMod.Debugger.EnableReturnType
import typings.node.inspectorMod.Debugger.EvaluateOnCallFrameParameterType
import typings.node.inspectorMod.Debugger.EvaluateOnCallFrameReturnType
import typings.node.inspectorMod.Debugger.GetPossibleBreakpointsParameterType
import typings.node.inspectorMod.Debugger.GetPossibleBreakpointsReturnType
import typings.node.inspectorMod.Debugger.GetScriptSourceParameterType
import typings.node.inspectorMod.Debugger.GetScriptSourceReturnType
import typings.node.inspectorMod.Debugger.GetStackTraceParameterType
import typings.node.inspectorMod.Debugger.GetStackTraceReturnType
import typings.node.inspectorMod.Debugger.PauseOnAsyncCallParameterType
import typings.node.inspectorMod.Debugger.PausedEventDataType
import typings.node.inspectorMod.Debugger.RemoveBreakpointParameterType
import typings.node.inspectorMod.Debugger.RestartFrameParameterType
import typings.node.inspectorMod.Debugger.RestartFrameReturnType
import typings.node.inspectorMod.Debugger.ScriptFailedToParseEventDataType
import typings.node.inspectorMod.Debugger.ScriptParsedEventDataType
import typings.node.inspectorMod.Debugger.SearchInContentParameterType
import typings.node.inspectorMod.Debugger.SearchInContentReturnType
import typings.node.inspectorMod.Debugger.SetAsyncCallStackDepthParameterType
import typings.node.inspectorMod.Debugger.SetBlackboxPatternsParameterType
import typings.node.inspectorMod.Debugger.SetBlackboxedRangesParameterType
import typings.node.inspectorMod.Debugger.SetBreakpointByUrlParameterType
import typings.node.inspectorMod.Debugger.SetBreakpointByUrlReturnType
import typings.node.inspectorMod.Debugger.SetBreakpointParameterType
import typings.node.inspectorMod.Debugger.SetBreakpointReturnType
import typings.node.inspectorMod.Debugger.SetBreakpointsActiveParameterType
import typings.node.inspectorMod.Debugger.SetPauseOnExceptionsParameterType
import typings.node.inspectorMod.Debugger.SetReturnValueParameterType
import typings.node.inspectorMod.Debugger.SetScriptSourceParameterType
import typings.node.inspectorMod.Debugger.SetScriptSourceReturnType
import typings.node.inspectorMod.Debugger.SetSkipAllPausesParameterType
import typings.node.inspectorMod.Debugger.SetVariableValueParameterType
import typings.node.inspectorMod.Debugger.StepIntoParameterType
import typings.node.inspectorMod.HeapProfiler.AddHeapSnapshotChunkEventDataType
import typings.node.inspectorMod.HeapProfiler.AddInspectedHeapObjectParameterType
import typings.node.inspectorMod.HeapProfiler.GetHeapObjectIdParameterType
import typings.node.inspectorMod.HeapProfiler.GetHeapObjectIdReturnType
import typings.node.inspectorMod.HeapProfiler.GetObjectByHeapObjectIdParameterType
import typings.node.inspectorMod.HeapProfiler.GetObjectByHeapObjectIdReturnType
import typings.node.inspectorMod.HeapProfiler.GetSamplingProfileReturnType
import typings.node.inspectorMod.HeapProfiler.HeapStatsUpdateEventDataType
import typings.node.inspectorMod.HeapProfiler.LastSeenObjectIdEventDataType
import typings.node.inspectorMod.HeapProfiler.ReportHeapSnapshotProgressEventDataType
import typings.node.inspectorMod.HeapProfiler.StartSamplingParameterType
import typings.node.inspectorMod.HeapProfiler.StartTrackingHeapObjectsParameterType
import typings.node.inspectorMod.HeapProfiler.StopSamplingReturnType
import typings.node.inspectorMod.HeapProfiler.StopTrackingHeapObjectsParameterType
import typings.node.inspectorMod.HeapProfiler.TakeHeapSnapshotParameterType
import typings.node.inspectorMod.NodeRuntime.NotifyWhenWaitingForDisconnectParameterType
import typings.node.inspectorMod.NodeTracing.DataCollectedEventDataType
import typings.node.inspectorMod.NodeTracing.GetCategoriesReturnType
import typings.node.inspectorMod.NodeTracing.StartParameterType
import typings.node.inspectorMod.NodeWorker.AttachedToWorkerEventDataType
import typings.node.inspectorMod.NodeWorker.DetachParameterType
import typings.node.inspectorMod.NodeWorker.DetachedFromWorkerEventDataType
import typings.node.inspectorMod.NodeWorker.EnableParameterType
import typings.node.inspectorMod.NodeWorker.ReceivedMessageFromWorkerEventDataType
import typings.node.inspectorMod.NodeWorker.SendMessageToWorkerParameterType
import typings.node.inspectorMod.Profiler.ConsoleProfileFinishedEventDataType
import typings.node.inspectorMod.Profiler.ConsoleProfileStartedEventDataType
import typings.node.inspectorMod.Profiler.GetBestEffortCoverageReturnType
import typings.node.inspectorMod.Profiler.SetSamplingIntervalParameterType
import typings.node.inspectorMod.Profiler.StartPreciseCoverageParameterType
import typings.node.inspectorMod.Profiler.StopReturnType
import typings.node.inspectorMod.Profiler.TakePreciseCoverageReturnType
import typings.node.inspectorMod.Profiler.TakeTypeProfileReturnType
import typings.node.inspectorMod.Runtime.AwaitPromiseParameterType
import typings.node.inspectorMod.Runtime.AwaitPromiseReturnType
import typings.node.inspectorMod.Runtime.CallFunctionOnParameterType
import typings.node.inspectorMod.Runtime.CallFunctionOnReturnType
import typings.node.inspectorMod.Runtime.CompileScriptParameterType
import typings.node.inspectorMod.Runtime.CompileScriptReturnType
import typings.node.inspectorMod.Runtime.ConsoleAPICalledEventDataType
import typings.node.inspectorMod.Runtime.EvaluateParameterType
import typings.node.inspectorMod.Runtime.EvaluateReturnType
import typings.node.inspectorMod.Runtime.ExceptionRevokedEventDataType
import typings.node.inspectorMod.Runtime.ExceptionThrownEventDataType
import typings.node.inspectorMod.Runtime.ExecutionContextCreatedEventDataType
import typings.node.inspectorMod.Runtime.ExecutionContextDestroyedEventDataType
import typings.node.inspectorMod.Runtime.GetPropertiesParameterType
import typings.node.inspectorMod.Runtime.GetPropertiesReturnType
import typings.node.inspectorMod.Runtime.GlobalLexicalScopeNamesParameterType
import typings.node.inspectorMod.Runtime.GlobalLexicalScopeNamesReturnType
import typings.node.inspectorMod.Runtime.InspectRequestedEventDataType
import typings.node.inspectorMod.Runtime.QueryObjectsParameterType
import typings.node.inspectorMod.Runtime.QueryObjectsReturnType
import typings.node.inspectorMod.Runtime.ReleaseObjectGroupParameterType
import typings.node.inspectorMod.Runtime.ReleaseObjectParameterType
import typings.node.inspectorMod.Runtime.RunScriptParameterType
import typings.node.inspectorMod.Runtime.RunScriptReturnType
import typings.node.inspectorMod.Runtime.SetCustomObjectFormatterEnabledParameterType
import typings.node.inspectorMod.Schema.GetDomainsReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `inspector.Session` is used for dispatching messages to the V8 inspector
  * back-end and receiving message responses and notifications.
  */
@JSImport("inspector", "Session")
@js.native
/**
  * Create a new instance of the inspector.Session class.
  * The inspector session needs to be connected through session.connect() before the messages can be dispatched to the inspector backend.
  */
open class Session () extends StObject {
  
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_NodeTracingtracingComplete")
  def addListener(event: "NodeTracing.tracingComplete", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_HeapProfilerresetProfiles")
  def addListener(event: "HeapProfiler.resetProfiles", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_RuntimeexecutionContextsCleared")
  def addListener(event: "Runtime.executionContextsCleared", listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_NodeRuntimewaitingForDisconnect")
  def addListener(event: "NodeRuntime.waitingForDisconnect", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_Debuggerresumed")
  def addListener(event: "Debugger.resumed", listener: js.Function0[Unit]): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_HeapProfilerlastSeenObjectId")
  def addListener(
    event: "HeapProfiler.lastSeenObjectId",
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ConsolemessageAdded")
  def addListener(
    event: "Console.messageAdded",
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_NodeTracingdataCollected")
  def addListener(
    event: "NodeTracing.dataCollected",
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_RuntimeexceptionThrown")
  def addListener(
    event: "Runtime.exceptionThrown",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_RuntimeexecutionContextDestroyed")
  def addListener(
    event: "Runtime.executionContextDestroyed",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_DebuggerscriptFailedToParse")
  def addListener(
    event: "Debugger.scriptFailedToParse",
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_RuntimeexceptionRevoked")
  def addListener(
    event: "Runtime.exceptionRevoked",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_RuntimeexecutionContextCreated")
  def addListener(
    event: "Runtime.executionContextCreated",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ProfilerconsoleProfileFinished")
  def addListener(
    event: "Profiler.consoleProfileFinished",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_HeapProfileraddHeapSnapshotChunk")
  def addListener(
    event: "HeapProfiler.addHeapSnapshotChunk",
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_DebuggerbreakpointResolved")
  def addListener(
    event: "Debugger.breakpointResolved",
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_Debuggerpaused")
  def addListener(
    event: "Debugger.paused",
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_DebuggerscriptParsed")
  def addListener(
    event: "Debugger.scriptParsed",
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_NodeWorkerattachedToWorker")
  def addListener(
    event: "NodeWorker.attachedToWorker",
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_RuntimeconsoleAPICalled")
  def addListener(
    event: "Runtime.consoleAPICalled",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_RuntimeinspectRequested")
  def addListener(
    event: "Runtime.inspectRequested",
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ProfilerconsoleProfileStarted")
  def addListener(
    event: "Profiler.consoleProfileStarted",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_HeapProfilerreportHeapSnapshotProgress")
  def addListener(
    event: "HeapProfiler.reportHeapSnapshotProgress",
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_HeapProfilerheapStatsUpdate")
  def addListener(
    event: "HeapProfiler.heapStatsUpdate",
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_NodeWorkerdetachedFromWorker")
  def addListener(
    event: "NodeWorker.detachedFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_NodeWorkerreceivedMessageFromWorker")
  def addListener(
    event: "NodeWorker.receivedMessageFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("addListener")
  @scala.annotation.targetName("addListener_inspectorNotification")
  def addListener(
    event: "inspectorNotification",
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  // Events
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Connects a session to the inspector back-end.
    * @since v8.0.0
    */
  def connect(): Unit = js.native
  
  /**
    * Immediately close the session. All pending message callbacks will be called
    * with an error. `session.connect()` will need to be called to be able to send
    * messages again. Reconnected session will lose all inspector state, such as
    * enabled agents or configured breakpoints.
    * @since v8.0.0
    */
  def disconnect(): Unit = js.native
  
  @JSName("emit")
  @scala.annotation.targetName("emit_NodeRuntimewaitingForDisconnect")
  def emit(event: "NodeRuntime.waitingForDisconnect"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_Debuggerresumed")
  def emit(event: "Debugger.resumed"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_RuntimeexecutionContextsCleared")
  def emit(event: "Runtime.executionContextsCleared"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_HeapProfilerresetProfiles")
  def emit(event: "HeapProfiler.resetProfiles"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_NodeTracingtracingComplete")
  def emit(event: "NodeTracing.tracingComplete"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_Debuggerpaused")
  def emit(event: "Debugger.paused", message: InspectorNotification[PausedEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_HeapProfilerheapStatsUpdate")
  def emit(
    event: "HeapProfiler.heapStatsUpdate",
    message: InspectorNotification[HeapStatsUpdateEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_RuntimeexceptionRevoked")
  def emit(event: "Runtime.exceptionRevoked", message: InspectorNotification[ExceptionRevokedEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_RuntimeexceptionThrown")
  def emit(event: "Runtime.exceptionThrown", message: InspectorNotification[ExceptionThrownEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_inspectorNotification")
  def emit(event: "inspectorNotification", message: InspectorNotification[js.Object]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_RuntimeexecutionContextCreated")
  def emit(
    event: "Runtime.executionContextCreated",
    message: InspectorNotification[ExecutionContextCreatedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_ProfilerconsoleProfileFinished")
  def emit(
    event: "Profiler.consoleProfileFinished",
    message: InspectorNotification[ConsoleProfileFinishedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_HeapProfilerreportHeapSnapshotProgress")
  def emit(
    event: "HeapProfiler.reportHeapSnapshotProgress",
    message: InspectorNotification[ReportHeapSnapshotProgressEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_ConsolemessageAdded")
  def emit(event: "Console.messageAdded", message: InspectorNotification[MessageAddedEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_DebuggerscriptParsed")
  def emit(event: "Debugger.scriptParsed", message: InspectorNotification[ScriptParsedEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_HeapProfileraddHeapSnapshotChunk")
  def emit(
    event: "HeapProfiler.addHeapSnapshotChunk",
    message: InspectorNotification[AddHeapSnapshotChunkEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_RuntimeexecutionContextDestroyed")
  def emit(
    event: "Runtime.executionContextDestroyed",
    message: InspectorNotification[ExecutionContextDestroyedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_RuntimeconsoleAPICalled")
  def emit(event: "Runtime.consoleAPICalled", message: InspectorNotification[ConsoleAPICalledEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_NodeWorkerattachedToWorker")
  def emit(
    event: "NodeWorker.attachedToWorker",
    message: InspectorNotification[AttachedToWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_NodeWorkerreceivedMessageFromWorker")
  def emit(
    event: "NodeWorker.receivedMessageFromWorker",
    message: InspectorNotification[ReceivedMessageFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_NodeTracingdataCollected")
  def emit(event: "NodeTracing.dataCollected", message: InspectorNotification[DataCollectedEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_DebuggerbreakpointResolved")
  def emit(
    event: "Debugger.breakpointResolved",
    message: InspectorNotification[BreakpointResolvedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_RuntimeinspectRequested")
  def emit(event: "Runtime.inspectRequested", message: InspectorNotification[InspectRequestedEventDataType]): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_NodeWorkerdetachedFromWorker")
  def emit(
    event: "NodeWorker.detachedFromWorker",
    message: InspectorNotification[DetachedFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_DebuggerscriptFailedToParse")
  def emit(
    event: "Debugger.scriptFailedToParse",
    message: InspectorNotification[ScriptFailedToParseEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_ProfilerconsoleProfileStarted")
  def emit(
    event: "Profiler.consoleProfileStarted",
    message: InspectorNotification[ConsoleProfileStartedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_HeapProfilerlastSeenObjectId")
  def emit(
    event: "HeapProfiler.lastSeenObjectId",
    message: InspectorNotification[LastSeenObjectIdEventDataType]
  ): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("on")
  @scala.annotation.targetName("on_RuntimeexecutionContextsCleared")
  def on(event: "Runtime.executionContextsCleared", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("on")
  @scala.annotation.targetName("on_Debuggerresumed")
  def on(event: "Debugger.resumed", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("on")
  @scala.annotation.targetName("on_NodeTracingtracingComplete")
  def on(event: "NodeTracing.tracingComplete", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_HeapProfilerresetProfiles")
  def on(event: "HeapProfiler.resetProfiles", listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("on")
  @scala.annotation.targetName("on_NodeRuntimewaitingForDisconnect")
  def on(event: "NodeRuntime.waitingForDisconnect", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("on")
  @scala.annotation.targetName("on_NodeTracingdataCollected")
  def on(
    event: "NodeTracing.dataCollected",
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_HeapProfilerreportHeapSnapshotProgress")
  def on(
    event: "HeapProfiler.reportHeapSnapshotProgress",
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("on")
  @scala.annotation.targetName("on_RuntimeconsoleAPICalled")
  def on(
    event: "Runtime.consoleAPICalled",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("on")
  @scala.annotation.targetName("on_DebuggerscriptParsed")
  def on(
    event: "Debugger.scriptParsed",
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("on")
  @scala.annotation.targetName("on_Debuggerpaused")
  def on(
    event: "Debugger.paused",
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("on")
  @scala.annotation.targetName("on_NodeWorkerdetachedFromWorker")
  def on(
    event: "NodeWorker.detachedFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_ProfilerconsoleProfileFinished")
  def on(
    event: "Profiler.consoleProfileFinished",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  @scala.annotation.targetName("on_ConsolemessageAdded")
  def on(
    event: "Console.messageAdded",
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("on")
  @scala.annotation.targetName("on_RuntimeexceptionRevoked")
  def on(
    event: "Runtime.exceptionRevoked",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("on")
  @scala.annotation.targetName("on_DebuggerbreakpointResolved")
  def on(
    event: "Debugger.breakpointResolved",
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("on")
  @scala.annotation.targetName("on_inspectorNotification")
  def on(
    event: "inspectorNotification",
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("on")
  @scala.annotation.targetName("on_ProfilerconsoleProfileStarted")
  def on(
    event: "Profiler.consoleProfileStarted",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("on")
  @scala.annotation.targetName("on_RuntimeexceptionThrown")
  def on(
    event: "Runtime.exceptionThrown",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("on")
  @scala.annotation.targetName("on_HeapProfilerheapStatsUpdate")
  def on(
    event: "HeapProfiler.heapStatsUpdate",
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_RuntimeexecutionContextDestroyed")
  def on(
    event: "Runtime.executionContextDestroyed",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("on")
  @scala.annotation.targetName("on_NodeWorkerreceivedMessageFromWorker")
  def on(
    event: "NodeWorker.receivedMessageFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("on")
  @scala.annotation.targetName("on_DebuggerscriptFailedToParse")
  def on(
    event: "Debugger.scriptFailedToParse",
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("on")
  @scala.annotation.targetName("on_NodeWorkerattachedToWorker")
  def on(
    event: "NodeWorker.attachedToWorker",
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("on")
  @scala.annotation.targetName("on_RuntimeinspectRequested")
  def on(
    event: "Runtime.inspectRequested",
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("on")
  @scala.annotation.targetName("on_HeapProfilerlastSeenObjectId")
  def on(
    event: "HeapProfiler.lastSeenObjectId",
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_HeapProfileraddHeapSnapshotChunk")
  def on(
    event: "HeapProfiler.addHeapSnapshotChunk",
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("on")
  @scala.annotation.targetName("on_RuntimeexecutionContextCreated")
  def on(
    event: "Runtime.executionContextCreated",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_HeapProfilerresetProfiles")
  def once(event: "HeapProfiler.resetProfiles", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("once")
  @scala.annotation.targetName("once_RuntimeexecutionContextsCleared")
  def once(event: "Runtime.executionContextsCleared", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("once")
  @scala.annotation.targetName("once_Debuggerresumed")
  def once(event: "Debugger.resumed", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("once")
  @scala.annotation.targetName("once_NodeTracingtracingComplete")
  def once(event: "NodeTracing.tracingComplete", listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("once")
  @scala.annotation.targetName("once_NodeRuntimewaitingForDisconnect")
  def once(event: "NodeRuntime.waitingForDisconnect", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_ProfilerconsoleProfileFinished")
  def once(
    event: "Profiler.consoleProfileFinished",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("once")
  @scala.annotation.targetName("once_DebuggerscriptParsed")
  def once(
    event: "Debugger.scriptParsed",
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("once")
  @scala.annotation.targetName("once_Debuggerpaused")
  def once(
    event: "Debugger.paused",
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("once")
  @scala.annotation.targetName("once_RuntimeinspectRequested")
  def once(
    event: "Runtime.inspectRequested",
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_HeapProfileraddHeapSnapshotChunk")
  def once(
    event: "HeapProfiler.addHeapSnapshotChunk",
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("once")
  @scala.annotation.targetName("once_RuntimeexecutionContextDestroyed")
  def once(
    event: "Runtime.executionContextDestroyed",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("once")
  @scala.annotation.targetName("once_NodeTracingdataCollected")
  def once(
    event: "NodeTracing.dataCollected",
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("once")
  @scala.annotation.targetName("once_RuntimeexecutionContextCreated")
  def once(
    event: "Runtime.executionContextCreated",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("once")
  @scala.annotation.targetName("once_RuntimeexceptionThrown")
  def once(
    event: "Runtime.exceptionThrown",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("once")
  @scala.annotation.targetName("once_ProfilerconsoleProfileStarted")
  def once(
    event: "Profiler.consoleProfileStarted",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("once")
  @scala.annotation.targetName("once_ConsolemessageAdded")
  def once(
    event: "Console.messageAdded",
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("once")
  @scala.annotation.targetName("once_NodeWorkerreceivedMessageFromWorker")
  def once(
    event: "NodeWorker.receivedMessageFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("once")
  @scala.annotation.targetName("once_HeapProfilerlastSeenObjectId")
  def once(
    event: "HeapProfiler.lastSeenObjectId",
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("once")
  @scala.annotation.targetName("once_NodeWorkerdetachedFromWorker")
  def once(
    event: "NodeWorker.detachedFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("once")
  @scala.annotation.targetName("once_RuntimeexceptionRevoked")
  def once(
    event: "Runtime.exceptionRevoked",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("once")
  @scala.annotation.targetName("once_DebuggerscriptFailedToParse")
  def once(
    event: "Debugger.scriptFailedToParse",
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("once")
  @scala.annotation.targetName("once_DebuggerbreakpointResolved")
  def once(
    event: "Debugger.breakpointResolved",
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("once")
  @scala.annotation.targetName("once_HeapProfilerheapStatsUpdate")
  def once(
    event: "HeapProfiler.heapStatsUpdate",
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("once")
  @scala.annotation.targetName("once_RuntimeconsoleAPICalled")
  def once(
    event: "Runtime.consoleAPICalled",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_HeapProfilerreportHeapSnapshotProgress")
  def once(
    event: "HeapProfiler.reportHeapSnapshotProgress",
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("once")
  @scala.annotation.targetName("once_NodeWorkerattachedToWorker")
  def once(
    event: "NodeWorker.attachedToWorker",
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("once")
  @scala.annotation.targetName("once_inspectorNotification")
  def once(
    event: "inspectorNotification",
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecallFunctionOn")
  def post(method: "Runtime.callFunctionOn"): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimesetCustomObjectFormatterEnabled")
  def post(method: "Runtime.setCustomObjectFormatterEnabled"): Unit = js.native
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetPauseOnExceptions")
  def post(method: "Debugger.setPauseOnExceptions"): Unit = js.native
  /**
    * Returns source for the script with given id.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetScriptSource")
  def post(method: "Debugger.getScriptSource"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerstop")
  def post(method: "Profiler.stop"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilercollectGarbage")
  def post(method: "HeapProfiler.collectGarbage"): Unit = js.native
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilersetSamplingInterval")
  def post(method: "Profiler.setSamplingInterval"): Unit = js.native
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerenable")
  def post(method: "Debugger.enable"): Unit = js.native
  /**
    * Gets supported tracing categories.
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracinggetCategories")
  def post(method: "NodeTracing.getCategories"): Unit = js.native
  /**
    * Detached from the worker with given sessionId.
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerdetach")
  def post(method: "NodeWorker.detach"): Unit = js.native
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Consoledisable")
  def post(method: "Console.disable"): Unit = js.native
  /**
    * Detaches from all running workers and disables attaching to new workers as they are started.
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerdisable")
  def post(method: "NodeWorker.disable"): Unit = js.native
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointByUrl")
  def post(method: "Debugger.setBreakpointByUrl"): Unit = js.native
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetSkipAllPauses")
  def post(method: "Debugger.setSkipAllPauses"): Unit = js.native
  /**
    * Edits JavaScript source live.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetScriptSource")
  def post(method: "Debugger.setScriptSource"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerenable")
  def post(method: "HeapProfiler.enable"): Unit = js.native
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful. Positions array contains positions where blackbox state is changed. First interval isn't blackboxed. Array should be sorted.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxedRanges")
  def post(method: "Debugger.setBlackboxedRanges"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartTrackingHeapObjects")
  def post(method: "HeapProfiler.startTrackingHeapObjects"): Unit = js.native
  /**
    * Sends protocol message over session with given id.
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkersendMessageToWorker")
  def post(method: "NodeWorker.sendMessageToWorker"): Unit = js.native
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointsActive")
  def post(method: "Debugger.setBreakpointsActive"): Unit = js.native
  /**
    * Resumes JavaScript execution.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerresume")
  def post(method: "Debugger.resume"): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerpauseOnAsyncCall")
  def post(method: "Debugger.pauseOnAsyncCall"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetObjectByHeapObjectId")
  def post(method: "HeapProfiler.getObjectByHeapObjectId"): Unit = js.native
  /**
    * Returns properties of a given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimegetProperties")
  def post(method: "Runtime.getProperties"): Unit = js.native
  /**
    * Evaluates expression on a given call frame.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerevaluateOnCallFrame")
  def post(method: "Debugger.evaluateOnCallFrame"): Unit = js.native
  /**
    * Enables reporting of execution contexts creation by means of <code>executionContextCreated</code> event. When the reporting gets enabled the event will be sent immediately for each existing execution context.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Runtimeenable")
  def post(method: "Runtime.enable"): Unit = js.native
  /**
    * Instructs the inspector to attach to running workers. Will also attach to new workers
    * as they start
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerenable")
  def post(method: "NodeWorker.enable"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetSamplingProfile")
  def post(method: "HeapProfiler.getSamplingProfile"): Unit = js.native
  /**
    * Collect type profile.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilertakeTypeProfile")
  def post(method: "Profiler.takeTypeProfile"): Unit = js.native
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code coverage may be incomplete. Enabling prevents running optimized code and resets execution counters.
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstartPreciseCoverage")
  def post(method: "Profiler.startPreciseCoverage"): Unit = js.native
  /**
    * Steps over the statement.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepOver")
  def post(method: "Debugger.stepOver"): Unit = js.native
  /**
    * Discards collected exceptions and console API calls.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimediscardConsoleEntries")
  def post(method: "Runtime.discardConsoleEntries"): Unit = js.native
  /**
    * Steps into the function call.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepInto")
  def post(method: "Debugger.stepInto"): Unit = js.native
  /**
    * Stop trace events collection. Remaining collected events will be sent as a sequence of
    * dataCollected events followed by tracingComplete event.
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracingstop")
  def post(method: "NodeTracing.stop"): Unit = js.native
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in scripts with url matching one of the patterns. VM will try to leave blackboxed script by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxPatterns")
  def post(method: "Debugger.setBlackboxPatterns"): Unit = js.native
  /**
    * Enable type profile.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstartTypeProfile")
  def post(method: "Profiler.startTypeProfile"): Unit = js.native
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows executing optimized code.
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstopPreciseCoverage")
  def post(method: "Profiler.stopPreciseCoverage"): Unit = js.native
  /**
    * This method is deprecated - use Debugger.stepInto with breakOnAsyncCall and Debugger.pauseOnAsyncTask instead. Steps into next scheduled async task if any is scheduled before next pause. Returns success when async task is actually scheduled, returns error if no task were scheduled or another scheduleStepIntoAsync was called.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerscheduleStepIntoAsync")
  def post(method: "Debugger.scheduleStepIntoAsync"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetHeapObjectId")
  def post(method: "HeapProfiler.getHeapObjectId"): Unit = js.native
  /**
    * Releases remote object with given id.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObject")
  def post(method: "Runtime.releaseObject"): Unit = js.native
  /**
    * Removes JavaScript breakpoint.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerremoveBreakpoint")
  def post(method: "Debugger.removeBreakpoint"): Unit = js.native
  /**
    * Enable the `NodeRuntime.waitingForDisconnect`.
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeRuntimenotifyWhenWaitingForDisconnect")
  def post(method: "NodeRuntime.notifyWhenWaitingForDisconnect"): Unit = js.native
  /**
    * Enables or disables async call stacks tracking.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetAsyncCallStackDepth")
  def post(method: "Debugger.setAsyncCallStackDepth"): Unit = js.native
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the <code>messageAdded</code> notification.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Consoleenable")
  def post(method: "Console.enable"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstopTrackingHeapObjects")
  def post(method: "HeapProfiler.stopTrackingHeapObjects"): Unit = js.native
  /**
    * Returns supported domains.
    */
  @JSName("post")
  @scala.annotation.targetName("post_SchemagetDomains")
  def post(method: "Schema.getDomains"): Unit = js.native
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpoint")
  def post(method: "Debugger.setBreakpoint"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerdisable")
  def post(method: "HeapProfiler.disable"): Unit = js.native
  /**
    * Runs script with given id in a given context.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimerunScript")
  def post(method: "Runtime.runScript"): Unit = js.native
  /**
    * Does nothing.
    */
  @JSName("post")
  @scala.annotation.targetName("post_ConsoleclearMessages")
  def post(method: "Console.clearMessages"): Unit = js.native
  /**
    * Disable type profile. Disabling releases type profile data collected so far.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstopTypeProfile")
  def post(method: "Profiler.stopTypeProfile"): Unit = js.native
  /**
    * Changes return value in top frame. Available only at return break position.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetReturnValue")
  def post(method: "Debugger.setReturnValue"): Unit = js.native
  /**
    * Stops on the next JavaScript statement.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerpause")
  def post(method: "Debugger.pause"): Unit = js.native
  /**
    * Returns all let, const and class variables from global scope.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeglobalLexicalScopeNames")
  def post(method: "Runtime.globalLexicalScopeNames"): Unit = js.native
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code coverage needs to have started.
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilertakePreciseCoverage")
  def post(method: "Profiler.takePreciseCoverage"): Unit = js.native
  /**
    * Add handler to promise with given promise object id.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeawaitPromise")
  def post(method: "Runtime.awaitPromise"): Unit = js.native
  /**
    * Evaluates expression on global object.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Runtimeevaluate")
  def post(method: "Runtime.evaluate"): Unit = js.native
  /**
    * Tells inspected instance to run if it was waiting for debugger to attach.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimerunIfWaitingForDebugger")
  def post(method: "Runtime.runIfWaitingForDebugger"): Unit = js.native
  /**
    * Searches for given string in script content.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersearchInContent")
  def post(method: "Debugger.searchInContent"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartSampling")
  def post(method: "HeapProfiler.startSampling"): Unit = js.native
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be mutated manually.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetVariableValue")
  def post(method: "Debugger.setVariableValue"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerdisable")
  def post(method: "Profiler.disable"): Unit = js.native
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetPossibleBreakpoints")
  def post(method: "Debugger.getPossibleBreakpoints"): Unit = js.native
  /**
    * Restarts particular call frame from the beginning.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerrestartFrame")
  def post(method: "Debugger.restartFrame"): Unit = js.native
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
    */
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfileraddInspectedHeapObject")
  def post(method: "HeapProfiler.addInspectedHeapObject"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimequeryObjects")
  def post(method: "Runtime.queryObjects"): Unit = js.native
  /**
    * Compiles expression.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecompileScript")
  def post(method: "Runtime.compileScript"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerenable")
  def post(method: "Profiler.enable"): Unit = js.native
  /**
    * Returns stack trace with given <code>stackTraceId</code>.
    * @experimental
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetStackTrace")
  def post(method: "Debugger.getStackTrace"): Unit = js.native
  /**
    * Steps out of the function call.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepOut")
  def post(method: "Debugger.stepOut"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerstart")
  def post(method: "Profiler.start"): Unit = js.native
  /**
    * Disables reporting of execution contexts creation.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Runtimedisable")
  def post(method: "Runtime.disable"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilertakeHeapSnapshot")
  def post(method: "HeapProfiler.takeHeapSnapshot"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstopSampling")
  def post(method: "HeapProfiler.stopSampling"): Unit = js.native
  /**
    * Releases all remote objects that belong to a given group.
    */
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObjectGroup")
  def post(method: "Runtime.releaseObjectGroup"): Unit = js.native
  /**
    * Disables debugger for given page.
    */
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerdisable")
  def post(method: "Debugger.disable"): Unit = js.native
  /**
    * Continues execution until specific location is reached.
    */
  @JSName("post")
  @scala.annotation.targetName("post_DebuggercontinueToLocation")
  def post(method: "Debugger.continueToLocation"): Unit = js.native
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to garbage collection.
    */
  @JSName("post")
  @scala.annotation.targetName("post_ProfilergetBestEffortCoverage")
  def post(method: "Profiler.getBestEffortCoverage"): Unit = js.native
  /**
    * Start trace events collection.
    */
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracingstart")
  def post(method: "NodeTracing.start"): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerpause")
  def post(method: "Debugger.pause", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointsActive")
  def post(method: "Debugger.setBreakpointsActive", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObjectGroup")
  def post(method: "Runtime.releaseObjectGroup", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerdisable")
  def post(method: "Profiler.disable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerdetach")
  def post(method: "NodeWorker.detach", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerstart")
  def post(method: "Profiler.start", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimesetCustomObjectFormatterEnabled")
  def post(
    method: "Runtime.setCustomObjectFormatterEnabled",
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerenable")
  def post(method: "Profiler.enable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartTrackingHeapObjects")
  def post(
    method: "HeapProfiler.startTrackingHeapObjects",
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilertakeHeapSnapshot")
  def post(method: "HeapProfiler.takeHeapSnapshot", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracingstart")
  def post(method: "NodeTracing.start", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerdisable")
  def post(method: "Debugger.disable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartSampling")
  def post(method: "HeapProfiler.startSampling", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetVariableValue")
  def post(method: "Debugger.setVariableValue", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObject")
  def post(method: "Runtime.releaseObject", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxedRanges")
  def post(method: "Debugger.setBlackboxedRanges", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggercontinueToLocation")
  def post(method: "Debugger.continueToLocation", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerenable")
  def post(method: "NodeWorker.enable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ConsoleclearMessages")
  def post(method: "Console.clearMessages", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfileraddInspectedHeapObject")
  def post(
    method: "HeapProfiler.addInspectedHeapObject",
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerremoveBreakpoint")
  def post(method: "Debugger.removeBreakpoint", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimerunIfWaitingForDebugger")
  def post(method: "Runtime.runIfWaitingForDebugger", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerdisable")
  def post(method: "HeapProfiler.disable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerresume")
  def post(method: "Debugger.resume", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimediscardConsoleEntries")
  def post(method: "Runtime.discardConsoleEntries", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkersendMessageToWorker")
  def post(method: "NodeWorker.sendMessageToWorker", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetAsyncCallStackDepth")
  def post(method: "Debugger.setAsyncCallStackDepth", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxPatterns")
  def post(method: "Debugger.setBlackboxPatterns", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilercollectGarbage")
  def post(method: "HeapProfiler.collectGarbage", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Consoledisable")
  def post(method: "Console.disable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerscheduleStepIntoAsync")
  def post(method: "Debugger.scheduleStepIntoAsync", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstartPreciseCoverage")
  def post(method: "Profiler.startPreciseCoverage", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepInto")
  def post(method: "Debugger.stepInto", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepOut")
  def post(method: "Debugger.stepOut", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerenable")
  def post(method: "HeapProfiler.enable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Runtimedisable")
  def post(method: "Runtime.disable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstartTypeProfile")
  def post(method: "Profiler.startTypeProfile", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetSkipAllPauses")
  def post(method: "Debugger.setSkipAllPauses", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Consoleenable")
  def post(method: "Console.enable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerdisable")
  def post(method: "NodeWorker.disable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeRuntimenotifyWhenWaitingForDisconnect")
  def post(
    method: "NodeRuntime.notifyWhenWaitingForDisconnect",
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilersetSamplingInterval")
  def post(method: "Profiler.setSamplingInterval", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstopTrackingHeapObjects")
  def post(
    method: "HeapProfiler.stopTrackingHeapObjects",
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepOver")
  def post(method: "Debugger.stepOver", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Runtimeenable")
  def post(method: "Runtime.enable", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerpauseOnAsyncCall")
  def post(method: "Debugger.pauseOnAsyncCall", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstopTypeProfile")
  def post(method: "Profiler.stopTypeProfile", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetReturnValue")
  def post(method: "Debugger.setReturnValue", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstopPreciseCoverage")
  def post(method: "Profiler.stopPreciseCoverage", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracingstop")
  def post(method: "NodeTracing.stop", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetPauseOnExceptions")
  def post(method: "Debugger.setPauseOnExceptions", callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_SchemagetDomains")
  def post(
    method: "Schema.getDomains",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetDomainsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerevaluateOnCallFrame")
  def post(
    method: "Debugger.evaluateOnCallFrame",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetScriptSource")
  def post(
    method: "Debugger.getScriptSource",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilertakeTypeProfile")
  def post(
    method: "Profiler.takeTypeProfile",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ TakeTypeProfileReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilergetBestEffortCoverage")
  def post(
    method: "Profiler.getBestEffortCoverage",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetBestEffortCoverageReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Profilerstop")
  def post(
    method: "Profiler.stop",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ StopReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeawaitPromise")
  def post(
    method: "Runtime.awaitPromise",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetScriptSource")
  def post(
    method: "Debugger.setScriptSource",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetHeapObjectId")
  def post(
    method: "HeapProfiler.getHeapObjectId",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimegetProperties")
  def post(
    method: "Runtime.getProperties",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerrestartFrame")
  def post(
    method: "Debugger.restartFrame",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstopSampling")
  def post(
    method: "HeapProfiler.stopSampling",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ StopSamplingReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersearchInContent")
  def post(
    method: "Debugger.searchInContent",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracinggetCategories")
  def post(
    method: "NodeTracing.getCategories",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetCategoriesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimequeryObjects")
  def post(
    method: "Runtime.queryObjects",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointByUrl")
  def post(
    method: "Debugger.setBreakpointByUrl",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetPossibleBreakpoints")
  def post(
    method: "Debugger.getPossibleBreakpoints",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilertakePreciseCoverage")
  def post(
    method: "Profiler.takePreciseCoverage",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ TakePreciseCoverageReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetStackTrace")
  def post(
    method: "Debugger.getStackTrace",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecompileScript")
  def post(
    method: "Runtime.compileScript",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Runtimeevaluate")
  def post(
    method: "Runtime.evaluate",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Debuggerenable")
  def post(
    method: "Debugger.enable",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EnableReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimerunScript")
  def post(
    method: "Runtime.runScript",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpoint")
  def post(
    method: "Debugger.setBreakpoint",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeglobalLexicalScopeNames")
  def post(
    method: "Runtime.globalLexicalScopeNames",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecallFunctionOn")
  def post(
    method: "Runtime.callFunctionOn",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetObjectByHeapObjectId")
  def post(
    method: "HeapProfiler.getObjectByHeapObjectId",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetSamplingProfile")
  def post(
    method: "HeapProfiler.getSamplingProfile",
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetSamplingProfileReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetReturnValue")
  def post(
    method: "Debugger.setReturnValue",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObject")
  def post(
    method: "Runtime.releaseObject",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilersetSamplingInterval")
  def post(
    method: "Profiler.setSamplingInterval",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointsActive")
  def post(
    method: "Debugger.setBreakpointsActive",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObjectGroup")
  def post(
    method: "Runtime.releaseObjectGroup",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetSkipAllPauses")
  def post(
    method: "Debugger.setSkipAllPauses",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfileraddInspectedHeapObject")
  def post(
    method: "HeapProfiler.addInspectedHeapObject",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimesetCustomObjectFormatterEnabled")
  def post(
    method: "Runtime.setCustomObjectFormatterEnabled",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerpauseOnAsyncCall")
  def post(
    method: "Debugger.pauseOnAsyncCall",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkersendMessageToWorker")
  def post(
    method: "NodeWorker.sendMessageToWorker",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxedRanges")
  def post(
    method: "Debugger.setBlackboxedRanges",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerremoveBreakpoint")
  def post(
    method: "Debugger.removeBreakpoint",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetAsyncCallStackDepth")
  def post(
    method: "Debugger.setAsyncCallStackDepth",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepInto")
  def post(method: "Debugger.stepInto", params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerdetach")
  def post(method: "NodeWorker.detach", params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilertakeHeapSnapshot")
  def post(
    method: "HeapProfiler.takeHeapSnapshot",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartSampling")
  def post(
    method: "HeapProfiler.startSampling",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxPatterns")
  def post(
    method: "Debugger.setBlackboxPatterns",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstartPreciseCoverage")
  def post(
    method: "Profiler.startPreciseCoverage",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeRuntimenotifyWhenWaitingForDisconnect")
  def post(
    method: "NodeRuntime.notifyWhenWaitingForDisconnect",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerenable")
  def post(method: "NodeWorker.enable", params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracingstart")
  def post(method: "NodeTracing.start", params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetVariableValue")
  def post(
    method: "Debugger.setVariableValue",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstopTrackingHeapObjects")
  def post(
    method: "HeapProfiler.stopTrackingHeapObjects",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggercontinueToLocation")
  def post(
    method: "Debugger.continueToLocation",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetPauseOnExceptions")
  def post(
    method: "Debugger.setPauseOnExceptions",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartTrackingHeapObjects")
  def post(
    method: "HeapProfiler.startTrackingHeapObjects",
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimegetProperties")
  def post(
    method: "Runtime.getProperties",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersearchInContent")
  def post(
    method: "Debugger.searchInContent",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerevaluateOnCallFrame")
  def post(
    method: "Debugger.evaluateOnCallFrame",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimequeryObjects")
  def post(
    method: "Runtime.queryObjects",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecallFunctionOn")
  def post(
    method: "Runtime.callFunctionOn",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetScriptSource")
  def post(
    method: "Debugger.setScriptSource",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Runtimeevaluate")
  def post(
    method: "Runtime.evaluate",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetStackTrace")
  def post(
    method: "Debugger.getStackTrace",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetScriptSource")
  def post(
    method: "Debugger.getScriptSource",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetPossibleBreakpoints")
  def post(
    method: "Debugger.getPossibleBreakpoints",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecompileScript")
  def post(
    method: "Runtime.compileScript",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeglobalLexicalScopeNames")
  def post(
    method: "Runtime.globalLexicalScopeNames",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpoint")
  def post(
    method: "Debugger.setBreakpoint",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerrestartFrame")
  def post(
    method: "Debugger.restartFrame",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimerunScript")
  def post(
    method: "Runtime.runScript",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeawaitPromise")
  def post(
    method: "Runtime.awaitPromise",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetHeapObjectId")
  def post(
    method: "HeapProfiler.getHeapObjectId",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetObjectByHeapObjectId")
  def post(
    method: "HeapProfiler.getObjectByHeapObjectId",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointByUrl")
  def post(
    method: "Debugger.setBreakpointByUrl",
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggercontinueToLocation")
  def post(method: "Debugger.continueToLocation", params: ContinueToLocationParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggercontinueToLocation")
  def post(
    method: "Debugger.continueToLocation",
    params: ContinueToLocationParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerevaluateOnCallFrame")
  def post(method: "Debugger.evaluateOnCallFrame", params: EvaluateOnCallFrameParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerevaluateOnCallFrame")
  def post(
    method: "Debugger.evaluateOnCallFrame",
    params: EvaluateOnCallFrameParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetPossibleBreakpoints")
  def post(method: "Debugger.getPossibleBreakpoints", params: GetPossibleBreakpointsParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetPossibleBreakpoints")
  def post(
    method: "Debugger.getPossibleBreakpoints",
    params: GetPossibleBreakpointsParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetScriptSource")
  def post(method: "Debugger.getScriptSource", params: GetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetScriptSource")
  def post(
    method: "Debugger.getScriptSource",
    params: GetScriptSourceParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetStackTrace")
  def post(method: "Debugger.getStackTrace", params: GetStackTraceParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggergetStackTrace")
  def post(
    method: "Debugger.getStackTrace",
    params: GetStackTraceParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerpauseOnAsyncCall")
  def post(method: "Debugger.pauseOnAsyncCall", params: PauseOnAsyncCallParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerpauseOnAsyncCall")
  def post(
    method: "Debugger.pauseOnAsyncCall",
    params: PauseOnAsyncCallParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerremoveBreakpoint")
  def post(method: "Debugger.removeBreakpoint", params: RemoveBreakpointParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerremoveBreakpoint")
  def post(
    method: "Debugger.removeBreakpoint",
    params: RemoveBreakpointParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerrestartFrame")
  def post(method: "Debugger.restartFrame", params: RestartFrameParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerrestartFrame")
  def post(
    method: "Debugger.restartFrame",
    params: RestartFrameParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersearchInContent")
  def post(method: "Debugger.searchInContent", params: SearchInContentParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersearchInContent")
  def post(
    method: "Debugger.searchInContent",
    params: SearchInContentParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetAsyncCallStackDepth")
  def post(method: "Debugger.setAsyncCallStackDepth", params: SetAsyncCallStackDepthParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetAsyncCallStackDepth")
  def post(
    method: "Debugger.setAsyncCallStackDepth",
    params: SetAsyncCallStackDepthParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxPatterns")
  def post(method: "Debugger.setBlackboxPatterns", params: SetBlackboxPatternsParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxPatterns")
  def post(
    method: "Debugger.setBlackboxPatterns",
    params: SetBlackboxPatternsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxedRanges")
  def post(method: "Debugger.setBlackboxedRanges", params: SetBlackboxedRangesParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBlackboxedRanges")
  def post(
    method: "Debugger.setBlackboxedRanges",
    params: SetBlackboxedRangesParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointByUrl")
  def post(method: "Debugger.setBreakpointByUrl", params: SetBreakpointByUrlParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointByUrl")
  def post(
    method: "Debugger.setBreakpointByUrl",
    params: SetBreakpointByUrlParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpoint")
  def post(method: "Debugger.setBreakpoint", params: SetBreakpointParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpoint")
  def post(
    method: "Debugger.setBreakpoint",
    params: SetBreakpointParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointsActive")
  def post(method: "Debugger.setBreakpointsActive", params: SetBreakpointsActiveParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetBreakpointsActive")
  def post(
    method: "Debugger.setBreakpointsActive",
    params: SetBreakpointsActiveParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetPauseOnExceptions")
  def post(method: "Debugger.setPauseOnExceptions", params: SetPauseOnExceptionsParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetPauseOnExceptions")
  def post(
    method: "Debugger.setPauseOnExceptions",
    params: SetPauseOnExceptionsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetReturnValue")
  def post(method: "Debugger.setReturnValue", params: SetReturnValueParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetReturnValue")
  def post(
    method: "Debugger.setReturnValue",
    params: SetReturnValueParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetScriptSource")
  def post(method: "Debugger.setScriptSource", params: SetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetScriptSource")
  def post(
    method: "Debugger.setScriptSource",
    params: SetScriptSourceParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetSkipAllPauses")
  def post(method: "Debugger.setSkipAllPauses", params: SetSkipAllPausesParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetSkipAllPauses")
  def post(
    method: "Debugger.setSkipAllPauses",
    params: SetSkipAllPausesParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetVariableValue")
  def post(method: "Debugger.setVariableValue", params: SetVariableValueParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggersetVariableValue")
  def post(
    method: "Debugger.setVariableValue",
    params: SetVariableValueParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepInto")
  def post(method: "Debugger.stepInto", params: StepIntoParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_DebuggerstepInto")
  def post(
    method: "Debugger.stepInto",
    params: StepIntoParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfileraddInspectedHeapObject")
  def post(method: "HeapProfiler.addInspectedHeapObject", params: AddInspectedHeapObjectParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfileraddInspectedHeapObject")
  def post(
    method: "HeapProfiler.addInspectedHeapObject",
    params: AddInspectedHeapObjectParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetHeapObjectId")
  def post(method: "HeapProfiler.getHeapObjectId", params: GetHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetHeapObjectId")
  def post(
    method: "HeapProfiler.getHeapObjectId",
    params: GetHeapObjectIdParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetObjectByHeapObjectId")
  def post(method: "HeapProfiler.getObjectByHeapObjectId", params: GetObjectByHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilergetObjectByHeapObjectId")
  def post(
    method: "HeapProfiler.getObjectByHeapObjectId",
    params: GetObjectByHeapObjectIdParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartSampling")
  def post(method: "HeapProfiler.startSampling", params: StartSamplingParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartSampling")
  def post(
    method: "HeapProfiler.startSampling",
    params: StartSamplingParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartTrackingHeapObjects")
  def post(method: "HeapProfiler.startTrackingHeapObjects", params: StartTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstartTrackingHeapObjects")
  def post(
    method: "HeapProfiler.startTrackingHeapObjects",
    params: StartTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstopTrackingHeapObjects")
  def post(method: "HeapProfiler.stopTrackingHeapObjects", params: StopTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilerstopTrackingHeapObjects")
  def post(
    method: "HeapProfiler.stopTrackingHeapObjects",
    params: StopTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilertakeHeapSnapshot")
  def post(method: "HeapProfiler.takeHeapSnapshot", params: TakeHeapSnapshotParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_HeapProfilertakeHeapSnapshot")
  def post(
    method: "HeapProfiler.takeHeapSnapshot",
    params: TakeHeapSnapshotParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeRuntimenotifyWhenWaitingForDisconnect")
  def post(
    method: "NodeRuntime.notifyWhenWaitingForDisconnect",
    params: NotifyWhenWaitingForDisconnectParameterType
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeRuntimenotifyWhenWaitingForDisconnect")
  def post(
    method: "NodeRuntime.notifyWhenWaitingForDisconnect",
    params: NotifyWhenWaitingForDisconnectParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracingstart")
  def post(method: "NodeTracing.start", params: StartParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeTracingstart")
  def post(
    method: "NodeTracing.start",
    params: StartParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerdetach")
  def post(method: "NodeWorker.detach", params: DetachParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerdetach")
  def post(
    method: "NodeWorker.detach",
    params: DetachParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerenable")
  def post(method: "NodeWorker.enable", params: EnableParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkerenable")
  def post(
    method: "NodeWorker.enable",
    params: EnableParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkersendMessageToWorker")
  def post(method: "NodeWorker.sendMessageToWorker", params: SendMessageToWorkerParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_NodeWorkersendMessageToWorker")
  def post(
    method: "NodeWorker.sendMessageToWorker",
    params: SendMessageToWorkerParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilersetSamplingInterval")
  def post(method: "Profiler.setSamplingInterval", params: SetSamplingIntervalParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilersetSamplingInterval")
  def post(
    method: "Profiler.setSamplingInterval",
    params: SetSamplingIntervalParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstartPreciseCoverage")
  def post(method: "Profiler.startPreciseCoverage", params: StartPreciseCoverageParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_ProfilerstartPreciseCoverage")
  def post(
    method: "Profiler.startPreciseCoverage",
    params: StartPreciseCoverageParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeawaitPromise")
  def post(method: "Runtime.awaitPromise", params: AwaitPromiseParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeawaitPromise")
  def post(
    method: "Runtime.awaitPromise",
    params: AwaitPromiseParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecallFunctionOn")
  def post(method: "Runtime.callFunctionOn", params: CallFunctionOnParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecallFunctionOn")
  def post(
    method: "Runtime.callFunctionOn",
    params: CallFunctionOnParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecompileScript")
  def post(method: "Runtime.compileScript", params: CompileScriptParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimecompileScript")
  def post(
    method: "Runtime.compileScript",
    params: CompileScriptParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Runtimeevaluate")
  def post(method: "Runtime.evaluate", params: EvaluateParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_Runtimeevaluate")
  def post(
    method: "Runtime.evaluate",
    params: EvaluateParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimegetProperties")
  def post(method: "Runtime.getProperties", params: GetPropertiesParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimegetProperties")
  def post(
    method: "Runtime.getProperties",
    params: GetPropertiesParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeglobalLexicalScopeNames")
  def post(method: "Runtime.globalLexicalScopeNames", params: GlobalLexicalScopeNamesParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimeglobalLexicalScopeNames")
  def post(
    method: "Runtime.globalLexicalScopeNames",
    params: GlobalLexicalScopeNamesParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimequeryObjects")
  def post(method: "Runtime.queryObjects", params: QueryObjectsParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimequeryObjects")
  def post(
    method: "Runtime.queryObjects",
    params: QueryObjectsParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObjectGroup")
  def post(method: "Runtime.releaseObjectGroup", params: ReleaseObjectGroupParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObjectGroup")
  def post(
    method: "Runtime.releaseObjectGroup",
    params: ReleaseObjectGroupParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObject")
  def post(method: "Runtime.releaseObject", params: ReleaseObjectParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimereleaseObject")
  def post(
    method: "Runtime.releaseObject",
    params: ReleaseObjectParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimerunScript")
  def post(method: "Runtime.runScript", params: RunScriptParameterType): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimerunScript")
  def post(
    method: "Runtime.runScript",
    params: RunScriptParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimesetCustomObjectFormatterEnabled")
  def post(
    method: "Runtime.setCustomObjectFormatterEnabled",
    params: SetCustomObjectFormatterEnabledParameterType
  ): Unit = js.native
  @JSName("post")
  @scala.annotation.targetName("post_RuntimesetCustomObjectFormatterEnabled")
  def post(
    method: "Runtime.setCustomObjectFormatterEnabled",
    params: SetCustomObjectFormatterEnabledParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Posts a message to the inspector back-end. `callback` will be notified when
    * a response is received. `callback` is a function that accepts two optional
    * arguments: error and message-specific result.
    *
    * ```js
    * session.post('Runtime.evaluate', { expression: '2 + 2' },
    *              (error, { result }) => console.log(result));
    * // Output: { type: 'number', value: 4, description: '4' }
    * ```
    *
    * The latest version of the V8 inspector protocol is published on the [Chrome DevTools Protocol Viewer](https://chromedevtools.github.io/devtools-protocol/v8/).
    *
    * Node.js inspector supports all the Chrome DevTools Protocol domains declared
    * by V8\. Chrome DevTools Protocol domain provides an interface for interacting
    * with one of the runtime agents used to inspect the application state and listen
    * to the run-time events.
    *
    * ## Example usage
    *
    * Apart from the debugger, various V8 Profilers are available through the DevTools
    * protocol.
    * @since v8.0.0
    */
  def post(method: String): Unit = js.native
  def post(
    method: String,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def post(method: String, params: js.Object): Unit = js.native
  def post(
    method: String,
    params: js.Object,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def post(
    method: String,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_HeapProfilerresetProfiles")
  def prependListener(event: "HeapProfiler.resetProfiles", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_RuntimeexecutionContextsCleared")
  def prependListener(event: "Runtime.executionContextsCleared", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_NodeTracingtracingComplete")
  def prependListener(event: "NodeTracing.tracingComplete", listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_NodeRuntimewaitingForDisconnect")
  def prependListener(event: "NodeRuntime.waitingForDisconnect", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_Debuggerresumed")
  def prependListener(event: "Debugger.resumed", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_RuntimeexecutionContextDestroyed")
  def prependListener(
    event: "Runtime.executionContextDestroyed",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_HeapProfileraddHeapSnapshotChunk")
  def prependListener(
    event: "HeapProfiler.addHeapSnapshotChunk",
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_DebuggerscriptParsed")
  def prependListener(
    event: "Debugger.scriptParsed",
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_RuntimeinspectRequested")
  def prependListener(
    event: "Runtime.inspectRequested",
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_ProfilerconsoleProfileFinished")
  def prependListener(
    event: "Profiler.consoleProfileFinished",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_HeapProfilerheapStatsUpdate")
  def prependListener(
    event: "HeapProfiler.heapStatsUpdate",
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_RuntimeexecutionContextCreated")
  def prependListener(
    event: "Runtime.executionContextCreated",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_HeapProfilerreportHeapSnapshotProgress")
  def prependListener(
    event: "HeapProfiler.reportHeapSnapshotProgress",
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_RuntimeexceptionRevoked")
  def prependListener(
    event: "Runtime.exceptionRevoked",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_RuntimeexceptionThrown")
  def prependListener(
    event: "Runtime.exceptionThrown",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_ProfilerconsoleProfileStarted")
  def prependListener(
    event: "Profiler.consoleProfileStarted",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_DebuggerbreakpointResolved")
  def prependListener(
    event: "Debugger.breakpointResolved",
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_NodeWorkerattachedToWorker")
  def prependListener(
    event: "NodeWorker.attachedToWorker",
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_DebuggerscriptFailedToParse")
  def prependListener(
    event: "Debugger.scriptFailedToParse",
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_Debuggerpaused")
  def prependListener(
    event: "Debugger.paused",
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_NodeTracingdataCollected")
  def prependListener(
    event: "NodeTracing.dataCollected",
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_RuntimeconsoleAPICalled")
  def prependListener(
    event: "Runtime.consoleAPICalled",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_ConsolemessageAdded")
  def prependListener(
    event: "Console.messageAdded",
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_NodeWorkerdetachedFromWorker")
  def prependListener(
    event: "NodeWorker.detachedFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_inspectorNotification")
  def prependListener(
    event: "inspectorNotification",
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_NodeWorkerreceivedMessageFromWorker")
  def prependListener(
    event: "NodeWorker.receivedMessageFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_HeapProfilerlastSeenObjectId")
  def prependListener(
    event: "HeapProfiler.lastSeenObjectId",
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_NodeTracingtracingComplete")
  def prependOnceListener(event: "NodeTracing.tracingComplete", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_RuntimeexecutionContextsCleared")
  def prependOnceListener(event: "Runtime.executionContextsCleared", listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_Debuggerresumed")
  def prependOnceListener(event: "Debugger.resumed", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_HeapProfilerresetProfiles")
  def prependOnceListener(event: "HeapProfiler.resetProfiles", listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_NodeRuntimewaitingForDisconnect")
  def prependOnceListener(event: "NodeRuntime.waitingForDisconnect", listener: js.Function0[Unit]): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_HeapProfilerheapStatsUpdate")
  def prependOnceListener(
    event: "HeapProfiler.heapStatsUpdate",
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_RuntimeexceptionThrown")
  def prependOnceListener(
    event: "Runtime.exceptionThrown",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_ProfilerconsoleProfileFinished")
  def prependOnceListener(
    event: "Profiler.consoleProfileFinished",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_HeapProfilerreportHeapSnapshotProgress")
  def prependOnceListener(
    event: "HeapProfiler.reportHeapSnapshotProgress",
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_RuntimeinspectRequested")
  def prependOnceListener(
    event: "Runtime.inspectRequested",
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_HeapProfilerlastSeenObjectId")
  def prependOnceListener(
    event: "HeapProfiler.lastSeenObjectId",
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_Debuggerpaused")
  def prependOnceListener(
    event: "Debugger.paused",
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_RuntimeconsoleAPICalled")
  def prependOnceListener(
    event: "Runtime.consoleAPICalled",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_NodeWorkerreceivedMessageFromWorker")
  def prependOnceListener(
    event: "NodeWorker.receivedMessageFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_NodeTracingdataCollected")
  def prependOnceListener(
    event: "NodeTracing.dataCollected",
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_inspectorNotification")
  def prependOnceListener(
    event: "inspectorNotification",
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_ConsolemessageAdded")
  def prependOnceListener(
    event: "Console.messageAdded",
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_NodeWorkerattachedToWorker")
  def prependOnceListener(
    event: "NodeWorker.attachedToWorker",
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_RuntimeexecutionContextCreated")
  def prependOnceListener(
    event: "Runtime.executionContextCreated",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_HeapProfileraddHeapSnapshotChunk")
  def prependOnceListener(
    event: "HeapProfiler.addHeapSnapshotChunk",
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_NodeWorkerdetachedFromWorker")
  def prependOnceListener(
    event: "NodeWorker.detachedFromWorker",
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_RuntimeexecutionContextDestroyed")
  def prependOnceListener(
    event: "Runtime.executionContextDestroyed",
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_RuntimeexceptionRevoked")
  def prependOnceListener(
    event: "Runtime.exceptionRevoked",
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_ProfilerconsoleProfileStarted")
  def prependOnceListener(
    event: "Profiler.consoleProfileStarted",
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_DebuggerscriptFailedToParse")
  def prependOnceListener(
    event: "Debugger.scriptFailedToParse",
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_DebuggerscriptParsed")
  def prependOnceListener(
    event: "Debugger.scriptParsed",
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_DebuggerbreakpointResolved")
  def prependOnceListener(
    event: "Debugger.breakpointResolved",
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
}
