package typings.node.inspectorMod

import typings.node.eventsMod.EventEmitter
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
import typings.node.nodeStrings.ConsoleDotclearMessages
import typings.node.nodeStrings.ConsoleDotdisable
import typings.node.nodeStrings.ConsoleDotenable
import typings.node.nodeStrings.ConsoleDotmessageAdded
import typings.node.nodeStrings.DebuggerDotbreakpointResolved
import typings.node.nodeStrings.DebuggerDotcontinueToLocation
import typings.node.nodeStrings.DebuggerDotdisable
import typings.node.nodeStrings.DebuggerDotenable
import typings.node.nodeStrings.DebuggerDotevaluateOnCallFrame
import typings.node.nodeStrings.DebuggerDotgetPossibleBreakpoints
import typings.node.nodeStrings.DebuggerDotgetScriptSource
import typings.node.nodeStrings.DebuggerDotgetStackTrace
import typings.node.nodeStrings.DebuggerDotpause
import typings.node.nodeStrings.DebuggerDotpauseOnAsyncCall
import typings.node.nodeStrings.DebuggerDotpaused
import typings.node.nodeStrings.DebuggerDotremoveBreakpoint
import typings.node.nodeStrings.DebuggerDotrestartFrame
import typings.node.nodeStrings.DebuggerDotresume
import typings.node.nodeStrings.DebuggerDotresumed
import typings.node.nodeStrings.DebuggerDotscheduleStepIntoAsync
import typings.node.nodeStrings.DebuggerDotscriptFailedToParse
import typings.node.nodeStrings.DebuggerDotscriptParsed
import typings.node.nodeStrings.DebuggerDotsearchInContent
import typings.node.nodeStrings.DebuggerDotsetAsyncCallStackDepth
import typings.node.nodeStrings.DebuggerDotsetBlackboxPatterns
import typings.node.nodeStrings.DebuggerDotsetBlackboxedRanges
import typings.node.nodeStrings.DebuggerDotsetBreakpoint
import typings.node.nodeStrings.DebuggerDotsetBreakpointByUrl
import typings.node.nodeStrings.DebuggerDotsetBreakpointsActive
import typings.node.nodeStrings.DebuggerDotsetPauseOnExceptions
import typings.node.nodeStrings.DebuggerDotsetReturnValue
import typings.node.nodeStrings.DebuggerDotsetScriptSource
import typings.node.nodeStrings.DebuggerDotsetSkipAllPauses
import typings.node.nodeStrings.DebuggerDotsetVariableValue
import typings.node.nodeStrings.DebuggerDotstepInto
import typings.node.nodeStrings.DebuggerDotstepOut
import typings.node.nodeStrings.DebuggerDotstepOver
import typings.node.nodeStrings.HeapProfilerDotaddHeapSnapshotChunk
import typings.node.nodeStrings.HeapProfilerDotaddInspectedHeapObject
import typings.node.nodeStrings.HeapProfilerDotcollectGarbage
import typings.node.nodeStrings.HeapProfilerDotdisable
import typings.node.nodeStrings.HeapProfilerDotenable
import typings.node.nodeStrings.HeapProfilerDotgetHeapObjectId
import typings.node.nodeStrings.HeapProfilerDotgetObjectByHeapObjectId
import typings.node.nodeStrings.HeapProfilerDotgetSamplingProfile
import typings.node.nodeStrings.HeapProfilerDotheapStatsUpdate
import typings.node.nodeStrings.HeapProfilerDotlastSeenObjectId
import typings.node.nodeStrings.HeapProfilerDotreportHeapSnapshotProgress
import typings.node.nodeStrings.HeapProfilerDotresetProfiles
import typings.node.nodeStrings.HeapProfilerDotstartSampling
import typings.node.nodeStrings.HeapProfilerDotstartTrackingHeapObjects
import typings.node.nodeStrings.HeapProfilerDotstopSampling
import typings.node.nodeStrings.HeapProfilerDotstopTrackingHeapObjects
import typings.node.nodeStrings.HeapProfilerDottakeHeapSnapshot
import typings.node.nodeStrings.NodeRuntimeDotnotifyWhenWaitingForDisconnect
import typings.node.nodeStrings.NodeRuntimeDotwaitingForDisconnect
import typings.node.nodeStrings.NodeTracingDotdataCollected
import typings.node.nodeStrings.NodeTracingDotgetCategories
import typings.node.nodeStrings.NodeTracingDotstart
import typings.node.nodeStrings.NodeTracingDotstop
import typings.node.nodeStrings.NodeTracingDottracingComplete
import typings.node.nodeStrings.NodeWorkerDotattachedToWorker
import typings.node.nodeStrings.NodeWorkerDotdetach
import typings.node.nodeStrings.NodeWorkerDotdetachedFromWorker
import typings.node.nodeStrings.NodeWorkerDotdisable
import typings.node.nodeStrings.NodeWorkerDotenable
import typings.node.nodeStrings.NodeWorkerDotreceivedMessageFromWorker
import typings.node.nodeStrings.NodeWorkerDotsendMessageToWorker
import typings.node.nodeStrings.ProfilerDotconsoleProfileFinished
import typings.node.nodeStrings.ProfilerDotconsoleProfileStarted
import typings.node.nodeStrings.ProfilerDotdisable
import typings.node.nodeStrings.ProfilerDotenable
import typings.node.nodeStrings.ProfilerDotgetBestEffortCoverage
import typings.node.nodeStrings.ProfilerDotsetSamplingInterval
import typings.node.nodeStrings.ProfilerDotstart
import typings.node.nodeStrings.ProfilerDotstartPreciseCoverage
import typings.node.nodeStrings.ProfilerDotstartTypeProfile
import typings.node.nodeStrings.ProfilerDotstop
import typings.node.nodeStrings.ProfilerDotstopPreciseCoverage
import typings.node.nodeStrings.ProfilerDotstopTypeProfile
import typings.node.nodeStrings.ProfilerDottakePreciseCoverage
import typings.node.nodeStrings.ProfilerDottakeTypeProfile
import typings.node.nodeStrings.RuntimeDotawaitPromise
import typings.node.nodeStrings.RuntimeDotcallFunctionOn
import typings.node.nodeStrings.RuntimeDotcompileScript
import typings.node.nodeStrings.RuntimeDotconsoleAPICalled
import typings.node.nodeStrings.RuntimeDotdisable
import typings.node.nodeStrings.RuntimeDotdiscardConsoleEntries
import typings.node.nodeStrings.RuntimeDotenable
import typings.node.nodeStrings.RuntimeDotevaluate
import typings.node.nodeStrings.RuntimeDotexceptionRevoked
import typings.node.nodeStrings.RuntimeDotexceptionThrown
import typings.node.nodeStrings.RuntimeDotexecutionContextCreated
import typings.node.nodeStrings.RuntimeDotexecutionContextDestroyed
import typings.node.nodeStrings.RuntimeDotexecutionContextsCleared
import typings.node.nodeStrings.RuntimeDotgetProperties
import typings.node.nodeStrings.RuntimeDotglobalLexicalScopeNames
import typings.node.nodeStrings.RuntimeDotinspectRequested
import typings.node.nodeStrings.RuntimeDotqueryObjects
import typings.node.nodeStrings.RuntimeDotreleaseObject
import typings.node.nodeStrings.RuntimeDotreleaseObjectGroup
import typings.node.nodeStrings.RuntimeDotrunIfWaitingForDebugger
import typings.node.nodeStrings.RuntimeDotrunScript
import typings.node.nodeStrings.RuntimeDotsetCustomObjectFormatterEnabled
import typings.node.nodeStrings.SchemaDotgetDomains
import typings.node.nodeStrings.inspectorNotification
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The inspector.Session is used for dispatching messages to the V8 inspector back-end and receiving message responses and notifications.
  */
@JSImport("inspector", "Session")
@js.native
/**
  * Create a new instance of the inspector.Session class.
  * The inspector session needs to be connected through session.connect() before the messages can be dispatched to the inspector backend.
  */
class Session () extends EventEmitter {
  /**
    * Issued when new console message is added.
    */
  @JSName("addListener")
  def addListener_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("addListener")
  def addListener_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("addListener")
  def addListener_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("addListener")
  def addListener_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("addListener")
  def addListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("addListener")
  def addListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("addListener")
  def addListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("addListener")
  def addListener_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("addListener")
  def addListener_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("addListener")
  def addListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("addListener")
  def addListener_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("addListener")
  def addListener_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("addListener")
  def addListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Connects a session to the inspector back-end.
    * An exception will be thrown if there is already a connected session established either
    * through the API or by a front-end connected to the Inspector WebSocket port.
    */
  def connect(): Unit = js.native
  /**
    * Immediately close the session. All pending message callbacks will be called with an error.
    * session.connect() will need to be called to be able to send messages again.
    * Reconnected session will lose all inspector state, such as enabled agents or configured breakpoints.
    */
  def disconnect(): Unit = js.native
  @JSName("emit")
  def emit_ConsolemessageAdded(event: ConsoleDotmessageAdded, message: InspectorNotification[MessageAddedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    message: InspectorNotification[BreakpointResolvedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_Debuggerpaused(event: DebuggerDotpaused, message: InspectorNotification[PausedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_Debuggerresumed(event: DebuggerDotresumed): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    message: InspectorNotification[ScriptFailedToParseEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptParsed(event: DebuggerDotscriptParsed, message: InspectorNotification[ScriptParsedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    message: InspectorNotification[AddHeapSnapshotChunkEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    message: InspectorNotification[HeapStatsUpdateEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    message: InspectorNotification[LastSeenObjectIdEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    message: InspectorNotification[ReportHeapSnapshotProgressEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles): Boolean = js.native
  @JSName("emit")
  def emit_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect): Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingdataCollected(event: NodeTracingDotdataCollected, message: InspectorNotification[DataCollectedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingtracingComplete(event: NodeTracingDottracingComplete): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    message: InspectorNotification[AttachedToWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    message: InspectorNotification[DetachedFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    message: InspectorNotification[ReceivedMessageFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    message: InspectorNotification[ConsoleProfileFinishedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    message: InspectorNotification[ConsoleProfileStartedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeconsoleAPICalled(event: RuntimeDotconsoleAPICalled, message: InspectorNotification[ConsoleAPICalledEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionRevoked(event: RuntimeDotexceptionRevoked, message: InspectorNotification[ExceptionRevokedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionThrown(event: RuntimeDotexceptionThrown, message: InspectorNotification[ExceptionThrownEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    message: InspectorNotification[ExecutionContextCreatedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    message: InspectorNotification[ExecutionContextDestroyedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeinspectRequested(event: RuntimeDotinspectRequested, message: InspectorNotification[InspectRequestedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_inspectorNotification(event: inspectorNotification, message: InspectorNotification[js.Object]): Boolean = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  def on_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("on")
  def on_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("on")
  def on_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("on")
  def on_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("on")
  def on_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("on")
  def on_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("on")
  def on_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("on")
  def on_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("on")
  def on_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("on")
  def on_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("on")
  def on_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("on")
  def on_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("on")
  def on_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("on")
  def on_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("on")
  def on_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("on")
  def on_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("on")
  def on_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("on")
  def on_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("on")
  def on_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("on")
  def on_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("on")
  def on_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("on")
  def on_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("on")
  def on_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("once")
  def once_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("once")
  def once_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("once")
  def once_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("once")
  def once_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("once")
  def once_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("once")
  def once_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("once")
  def once_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("once")
  def once_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("once")
  def once_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("once")
  def once_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("once")
  def once_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("once")
  def once_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("once")
  def once_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("once")
  def once_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("once")
  def once_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("once")
  def once_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("once")
  def once_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("once")
  def once_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("once")
  def once_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("once")
  def once_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("once")
  def once_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("once")
  def once_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("once")
  def once_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Posts a message to the inspector back-end. callback will be notified when a response is received.
    * callback is a function that accepts two optional arguments - error and message-specific result.
    */
  def post(method: String): Unit = js.native
  def post(
    method: String,
    callback: js.Function2[/* err */ Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def post(method: String, params: js.Object): Unit = js.native
  def post(
    method: String,
    params: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  /**
    * Does nothing.
    */
  @JSName("post")
  def post_ConsoleclearMessages(method: ConsoleDotclearMessages): Unit = js.native
  @JSName("post")
  def post_ConsoleclearMessages(method: ConsoleDotclearMessages, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  @JSName("post")
  def post_Consoledisable(method: ConsoleDotdisable): Unit = js.native
  @JSName("post")
  def post_Consoledisable(method: ConsoleDotdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the <code>messageAdded</code> notification.
    */
  @JSName("post")
  def post_Consoleenable(method: ConsoleDotenable): Unit = js.native
  @JSName("post")
  def post_Consoleenable(method: ConsoleDotenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Continues execution until specific location is reached.
    */
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDotcontinueToLocation): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDotcontinueToLocation, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDotcontinueToLocation, params: ContinueToLocationParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(
    method: DebuggerDotcontinueToLocation,
    params: ContinueToLocationParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Disables debugger for given page.
    */
  @JSName("post")
  def post_Debuggerdisable(method: DebuggerDotdisable): Unit = js.native
  @JSName("post")
  def post_Debuggerdisable(method: DebuggerDotdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
    */
  @JSName("post")
  def post_Debuggerenable(method: DebuggerDotenable): Unit = js.native
  @JSName("post")
  def post_Debuggerenable(
    method: DebuggerDotenable,
    callback: js.Function2[/* err */ Error | Null, /* params */ EnableReturnType, Unit]
  ): Unit = js.native
  /**
    * Evaluates expression on a given call frame.
    */
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(method: DebuggerDotevaluateOnCallFrame): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: DebuggerDotevaluateOnCallFrame,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(method: DebuggerDotevaluateOnCallFrame, params: EvaluateOnCallFrameParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: DebuggerDotevaluateOnCallFrame,
    params: EvaluateOnCallFrameParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
    */
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(method: DebuggerDotgetPossibleBreakpoints): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: DebuggerDotgetPossibleBreakpoints,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(method: DebuggerDotgetPossibleBreakpoints, params: GetPossibleBreakpointsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: DebuggerDotgetPossibleBreakpoints,
    params: GetPossibleBreakpointsParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns source for the script with given id.
    */
  @JSName("post")
  def post_DebuggergetScriptSource(method: DebuggerDotgetScriptSource): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: DebuggerDotgetScriptSource,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(method: DebuggerDotgetScriptSource, params: GetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: DebuggerDotgetScriptSource,
    params: GetScriptSourceParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns stack trace with given <code>stackTraceId</code>.
    * @experimental
    */
  @JSName("post")
  def post_DebuggergetStackTrace(method: DebuggerDotgetStackTrace): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: DebuggerDotgetStackTrace,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(method: DebuggerDotgetStackTrace, params: GetStackTraceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: DebuggerDotgetStackTrace,
    params: GetStackTraceParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  /**
    * Stops on the next JavaScript statement.
    */
  @JSName("post")
  def post_Debuggerpause(method: DebuggerDotpause): Unit = js.native
  @JSName("post")
  def post_Debuggerpause(method: DebuggerDotpause, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDotpauseOnAsyncCall): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDotpauseOnAsyncCall, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDotpauseOnAsyncCall, params: PauseOnAsyncCallParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(
    method: DebuggerDotpauseOnAsyncCall,
    params: PauseOnAsyncCallParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Removes JavaScript breakpoint.
    */
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDotremoveBreakpoint): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDotremoveBreakpoint, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDotremoveBreakpoint, params: RemoveBreakpointParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(
    method: DebuggerDotremoveBreakpoint,
    params: RemoveBreakpointParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Restarts particular call frame from the beginning.
    */
  @JSName("post")
  def post_DebuggerrestartFrame(method: DebuggerDotrestartFrame): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: DebuggerDotrestartFrame,
    callback: js.Function2[/* err */ Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(method: DebuggerDotrestartFrame, params: RestartFrameParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: DebuggerDotrestartFrame,
    params: RestartFrameParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  /**
    * Resumes JavaScript execution.
    */
  @JSName("post")
  def post_Debuggerresume(method: DebuggerDotresume): Unit = js.native
  @JSName("post")
  def post_Debuggerresume(method: DebuggerDotresume, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * This method is deprecated - use Debugger.stepInto with breakOnAsyncCall and Debugger.pauseOnAsyncTask instead. Steps into next scheduled async task if any is scheduled before next pause. Returns success when async task is actually scheduled, returns error if no task were scheduled or another scheduleStepIntoAsync was called.
    * @experimental
    */
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(method: DebuggerDotscheduleStepIntoAsync): Unit = js.native
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(method: DebuggerDotscheduleStepIntoAsync, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Searches for given string in script content.
    */
  @JSName("post")
  def post_DebuggersearchInContent(method: DebuggerDotsearchInContent): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: DebuggerDotsearchInContent,
    callback: js.Function2[/* err */ Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(method: DebuggerDotsearchInContent, params: SearchInContentParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: DebuggerDotsearchInContent,
    params: SearchInContentParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  /**
    * Enables or disables async call stacks tracking.
    */
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDotsetAsyncCallStackDepth): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDotsetAsyncCallStackDepth, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDotsetAsyncCallStackDepth, params: SetAsyncCallStackDepthParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(
    method: DebuggerDotsetAsyncCallStackDepth,
    params: SetAsyncCallStackDepthParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in scripts with url matching one of the patterns. VM will try to leave blackboxed script by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDotsetBlackboxPatterns): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDotsetBlackboxPatterns, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDotsetBlackboxPatterns, params: SetBlackboxPatternsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(
    method: DebuggerDotsetBlackboxPatterns,
    params: SetBlackboxPatternsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful. Positions array contains positions where blackbox state is changed. First interval isn't blackboxed. Array should be sorted.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDotsetBlackboxedRanges): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDotsetBlackboxedRanges, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDotsetBlackboxedRanges, params: SetBlackboxedRangesParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(
    method: DebuggerDotsetBlackboxedRanges,
    params: SetBlackboxedRangesParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  @JSName("post")
  def post_DebuggersetBreakpoint(method: DebuggerDotsetBreakpoint): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: DebuggerDotsetBreakpoint,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(method: DebuggerDotsetBreakpoint, params: SetBreakpointParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: DebuggerDotsetBreakpoint,
    params: SetBreakpointParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
    */
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(method: DebuggerDotsetBreakpointByUrl): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: DebuggerDotsetBreakpointByUrl,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(method: DebuggerDotsetBreakpointByUrl, params: SetBreakpointByUrlParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: DebuggerDotsetBreakpointByUrl,
    params: SetBreakpointByUrlParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDotsetBreakpointsActive): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDotsetBreakpointsActive, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDotsetBreakpointsActive, params: SetBreakpointsActiveParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(
    method: DebuggerDotsetBreakpointsActive,
    params: SetBreakpointsActiveParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
    */
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDotsetPauseOnExceptions): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDotsetPauseOnExceptions, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDotsetPauseOnExceptions, params: SetPauseOnExceptionsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(
    method: DebuggerDotsetPauseOnExceptions,
    params: SetPauseOnExceptionsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Changes return value in top frame. Available only at return break position.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDotsetReturnValue): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDotsetReturnValue, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDotsetReturnValue, params: SetReturnValueParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(
    method: DebuggerDotsetReturnValue,
    params: SetReturnValueParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Edits JavaScript source live.
    */
  @JSName("post")
  def post_DebuggersetScriptSource(method: DebuggerDotsetScriptSource): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: DebuggerDotsetScriptSource,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(method: DebuggerDotsetScriptSource, params: SetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: DebuggerDotsetScriptSource,
    params: SetScriptSourceParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDotsetSkipAllPauses): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDotsetSkipAllPauses, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDotsetSkipAllPauses, params: SetSkipAllPausesParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(
    method: DebuggerDotsetSkipAllPauses,
    params: SetSkipAllPausesParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be mutated manually.
    */
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDotsetVariableValue): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDotsetVariableValue, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDotsetVariableValue, params: SetVariableValueParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(
    method: DebuggerDotsetVariableValue,
    params: SetVariableValueParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Steps into the function call.
    */
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDotstepInto): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDotstepInto, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDotstepInto, params: StepIntoParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(
    method: DebuggerDotstepInto,
    params: StepIntoParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Steps out of the function call.
    */
  @JSName("post")
  def post_DebuggerstepOut(method: DebuggerDotstepOut): Unit = js.native
  @JSName("post")
  def post_DebuggerstepOut(method: DebuggerDotstepOut, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Steps over the statement.
    */
  @JSName("post")
  def post_DebuggerstepOver(method: DebuggerDotstepOver): Unit = js.native
  @JSName("post")
  def post_DebuggerstepOver(method: DebuggerDotstepOver, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
    */
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(method: HeapProfilerDotaddInspectedHeapObject): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: HeapProfilerDotaddInspectedHeapObject,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(method: HeapProfilerDotaddInspectedHeapObject, params: AddInspectedHeapObjectParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: HeapProfilerDotaddInspectedHeapObject,
    params: AddInspectedHeapObjectParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(method: HeapProfilerDotcollectGarbage): Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(method: HeapProfilerDotcollectGarbage, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(method: HeapProfilerDotdisable): Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(method: HeapProfilerDotdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(method: HeapProfilerDotenable): Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(method: HeapProfilerDotenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(method: HeapProfilerDotgetHeapObjectId): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: HeapProfilerDotgetHeapObjectId,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(method: HeapProfilerDotgetHeapObjectId, params: GetHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: HeapProfilerDotgetHeapObjectId,
    params: GetHeapObjectIdParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(method: HeapProfilerDotgetObjectByHeapObjectId): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: HeapProfilerDotgetObjectByHeapObjectId,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(method: HeapProfilerDotgetObjectByHeapObjectId, params: GetObjectByHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: HeapProfilerDotgetObjectByHeapObjectId,
    params: GetObjectByHeapObjectIdParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(method: HeapProfilerDotgetSamplingProfile): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(
    method: HeapProfilerDotgetSamplingProfile,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetSamplingProfileReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDotstartSampling): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDotstartSampling, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDotstartSampling, params: StartSamplingParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(
    method: HeapProfilerDotstartSampling,
    params: StartSamplingParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(method: HeapProfilerDotstartTrackingHeapObjects): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: HeapProfilerDotstartTrackingHeapObjects,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(method: HeapProfilerDotstartTrackingHeapObjects, params: StartTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: HeapProfilerDotstartTrackingHeapObjects,
    params: StartTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(method: HeapProfilerDotstopSampling): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(
    method: HeapProfilerDotstopSampling,
    callback: js.Function2[/* err */ Error | Null, /* params */ StopSamplingReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(method: HeapProfilerDotstopTrackingHeapObjects): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: HeapProfilerDotstopTrackingHeapObjects,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(method: HeapProfilerDotstopTrackingHeapObjects, params: StopTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: HeapProfilerDotstopTrackingHeapObjects,
    params: StopTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDottakeHeapSnapshot): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDottakeHeapSnapshot, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDottakeHeapSnapshot, params: TakeHeapSnapshotParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(
    method: HeapProfilerDottakeHeapSnapshot,
    params: TakeHeapSnapshotParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Enable the `NodeRuntime.waitingForDisconnect`.
    */
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(method: NodeRuntimeDotnotifyWhenWaitingForDisconnect): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDotnotifyWhenWaitingForDisconnect,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDotnotifyWhenWaitingForDisconnect,
    params: NotifyWhenWaitingForDisconnectParameterType
  ): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDotnotifyWhenWaitingForDisconnect,
    params: NotifyWhenWaitingForDisconnectParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Gets supported tracing categories.
    */
  @JSName("post")
  def post_NodeTracinggetCategories(method: NodeTracingDotgetCategories): Unit = js.native
  @JSName("post")
  def post_NodeTracinggetCategories(
    method: NodeTracingDotgetCategories,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetCategoriesReturnType, Unit]
  ): Unit = js.native
  /**
    * Start trace events collection.
    */
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDotstart): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDotstart, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDotstart, params: StartParameterType): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(
    method: NodeTracingDotstart,
    params: StartParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Stop trace events collection. Remaining collected events will be sent as a sequence of
    * dataCollected events followed by tracingComplete event.
    */
  @JSName("post")
  def post_NodeTracingstop(method: NodeTracingDotstop): Unit = js.native
  @JSName("post")
  def post_NodeTracingstop(method: NodeTracingDotstop, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Detached from the worker with given sessionId.
    */
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDotdetach): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDotdetach, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDotdetach, params: DetachParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(
    method: NodeWorkerDotdetach,
    params: DetachParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Detaches from all running workers and disables attaching to new workers as they are started.
    */
  @JSName("post")
  def post_NodeWorkerdisable(method: NodeWorkerDotdisable): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdisable(method: NodeWorkerDotdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Instructs the inspector to attach to running workers. Will also attach to new workers
    * as they start
    */
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDotenable): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDotenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDotenable, params: EnableParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(
    method: NodeWorkerDotenable,
    params: EnableParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Sends protocol message over session with given id.
    */
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDotsendMessageToWorker): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDotsendMessageToWorker, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDotsendMessageToWorker, params: SendMessageToWorkerParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(
    method: NodeWorkerDotsendMessageToWorker,
    params: SendMessageToWorkerParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Profilerdisable(method: ProfilerDotdisable): Unit = js.native
  @JSName("post")
  def post_Profilerdisable(method: ProfilerDotdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_Profilerenable(method: ProfilerDotenable): Unit = js.native
  @JSName("post")
  def post_Profilerenable(method: ProfilerDotenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to garbage collection.
    */
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(method: ProfilerDotgetBestEffortCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(
    method: ProfilerDotgetBestEffortCoverage,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetBestEffortCoverageReturnType, Unit]
  ): Unit = js.native
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDotsetSamplingInterval): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDotsetSamplingInterval, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDotsetSamplingInterval, params: SetSamplingIntervalParameterType): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(
    method: ProfilerDotsetSamplingInterval,
    params: SetSamplingIntervalParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Profilerstart(method: ProfilerDotstart): Unit = js.native
  @JSName("post")
  def post_Profilerstart(method: ProfilerDotstart, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code coverage may be incomplete. Enabling prevents running optimized code and resets execution counters.
    */
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDotstartPreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDotstartPreciseCoverage, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDotstartPreciseCoverage, params: StartPreciseCoverageParameterType): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(
    method: ProfilerDotstartPreciseCoverage,
    params: StartPreciseCoverageParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Enable type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstartTypeProfile(method: ProfilerDotstartTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilerstartTypeProfile(method: ProfilerDotstartTypeProfile, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_Profilerstop(method: ProfilerDotstop): Unit = js.native
  @JSName("post")
  def post_Profilerstop(
    method: ProfilerDotstop,
    callback: js.Function2[/* err */ Error | Null, /* params */ StopReturnType, Unit]
  ): Unit = js.native
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows executing optimized code.
    */
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(method: ProfilerDotstopPreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(method: ProfilerDotstopPreciseCoverage, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Disable type profile. Disabling releases type profile data collected so far.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstopTypeProfile(method: ProfilerDotstopTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilerstopTypeProfile(method: ProfilerDotstopTypeProfile, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code coverage needs to have started.
    */
  @JSName("post")
  def post_ProfilertakePreciseCoverage(method: ProfilerDottakePreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilertakePreciseCoverage(
    method: ProfilerDottakePreciseCoverage,
    callback: js.Function2[/* err */ Error | Null, /* params */ TakePreciseCoverageReturnType, Unit]
  ): Unit = js.native
  /**
    * Collect type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilertakeTypeProfile(method: ProfilerDottakeTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilertakeTypeProfile(
    method: ProfilerDottakeTypeProfile,
    callback: js.Function2[/* err */ Error | Null, /* params */ TakeTypeProfileReturnType, Unit]
  ): Unit = js.native
  /**
    * Add handler to promise with given promise object id.
    */
  @JSName("post")
  def post_RuntimeawaitPromise(method: RuntimeDotawaitPromise): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: RuntimeDotawaitPromise,
    callback: js.Function2[/* err */ Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(method: RuntimeDotawaitPromise, params: AwaitPromiseParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: RuntimeDotawaitPromise,
    params: AwaitPromiseParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  /**
    * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  def post_RuntimecallFunctionOn(method: RuntimeDotcallFunctionOn): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: RuntimeDotcallFunctionOn,
    callback: js.Function2[/* err */ Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(method: RuntimeDotcallFunctionOn, params: CallFunctionOnParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: RuntimeDotcallFunctionOn,
    params: CallFunctionOnParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  /**
    * Compiles expression.
    */
  @JSName("post")
  def post_RuntimecompileScript(method: RuntimeDotcompileScript): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: RuntimeDotcompileScript,
    callback: js.Function2[/* err */ Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(method: RuntimeDotcompileScript, params: CompileScriptParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: RuntimeDotcompileScript,
    params: CompileScriptParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  /**
    * Disables reporting of execution contexts creation.
    */
  @JSName("post")
  def post_Runtimedisable(method: RuntimeDotdisable): Unit = js.native
  @JSName("post")
  def post_Runtimedisable(method: RuntimeDotdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Discards collected exceptions and console API calls.
    */
  @JSName("post")
  def post_RuntimediscardConsoleEntries(method: RuntimeDotdiscardConsoleEntries): Unit = js.native
  @JSName("post")
  def post_RuntimediscardConsoleEntries(method: RuntimeDotdiscardConsoleEntries, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables reporting of execution contexts creation by means of <code>executionContextCreated</code> event. When the reporting gets enabled the event will be sent immediately for each existing execution context.
    */
  @JSName("post")
  def post_Runtimeenable(method: RuntimeDotenable): Unit = js.native
  @JSName("post")
  def post_Runtimeenable(method: RuntimeDotenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Evaluates expression on global object.
    */
  @JSName("post")
  def post_Runtimeevaluate(method: RuntimeDotevaluate): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: RuntimeDotevaluate,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(method: RuntimeDotevaluate, params: EvaluateParameterType): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: RuntimeDotevaluate,
    params: EvaluateParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns properties of a given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  def post_RuntimegetProperties(method: RuntimeDotgetProperties): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: RuntimeDotgetProperties,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(method: RuntimeDotgetProperties, params: GetPropertiesParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: RuntimeDotgetProperties,
    params: GetPropertiesParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns all let, const and class variables from global scope.
    */
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(method: RuntimeDotglobalLexicalScopeNames): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: RuntimeDotglobalLexicalScopeNames,
    callback: js.Function2[/* err */ Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(method: RuntimeDotglobalLexicalScopeNames, params: GlobalLexicalScopeNamesParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: RuntimeDotglobalLexicalScopeNames,
    params: GlobalLexicalScopeNamesParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(method: RuntimeDotqueryObjects): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: RuntimeDotqueryObjects,
    callback: js.Function2[/* err */ Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(method: RuntimeDotqueryObjects, params: QueryObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: RuntimeDotqueryObjects,
    params: QueryObjectsParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  /**
    * Releases remote object with given id.
    */
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDotreleaseObject): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDotreleaseObject, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDotreleaseObject, params: ReleaseObjectParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(
    method: RuntimeDotreleaseObject,
    params: ReleaseObjectParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Releases all remote objects that belong to a given group.
    */
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDotreleaseObjectGroup): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDotreleaseObjectGroup, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDotreleaseObjectGroup, params: ReleaseObjectGroupParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(
    method: RuntimeDotreleaseObjectGroup,
    params: ReleaseObjectGroupParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Tells inspected instance to run if it was waiting for debugger to attach.
    */
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(method: RuntimeDotrunIfWaitingForDebugger): Unit = js.native
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(method: RuntimeDotrunIfWaitingForDebugger, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Runs script with given id in a given context.
    */
  @JSName("post")
  def post_RuntimerunScript(method: RuntimeDotrunScript): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: RuntimeDotrunScript,
    callback: js.Function2[/* err */ Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(method: RuntimeDotrunScript, params: RunScriptParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: RuntimeDotrunScript,
    params: RunScriptParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(method: RuntimeDotsetCustomObjectFormatterEnabled): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDotsetCustomObjectFormatterEnabled,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDotsetCustomObjectFormatterEnabled,
    params: SetCustomObjectFormatterEnabledParameterType
  ): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDotsetCustomObjectFormatterEnabled,
    params: SetCustomObjectFormatterEnabledParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Returns supported domains.
    */
  @JSName("post")
  def post_SchemagetDomains(method: SchemaDotgetDomains): Unit = js.native
  @JSName("post")
  def post_SchemagetDomains(
    method: SchemaDotgetDomains,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetDomainsReturnType, Unit]
  ): Unit = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependListener")
  def prependListener_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependListener")
  def prependListener_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependListener")
  def prependListener_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependListener")
  def prependListener_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependListener")
  def prependListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependListener")
  def prependListener_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependListener")
  def prependListener_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependListener")
  def prependListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
}

