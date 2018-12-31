package typings
package nodeLib.inspectorMod

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
class Session ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Issued when new console message is added.
    */
  @JSName("addListener")
  def addListener_ConsolemessageAdded(
    event: nodeLib.nodeLibStrings.ConsoleDOTmessageAdded,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ConsoleNs.MessageAddedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("addListener")
  def addListener_DebuggerbreakpointResolved(
    event: nodeLib.nodeLibStrings.DebuggerDOTbreakpointResolved,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.BreakpointResolvedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("addListener")
  def addListener_Debuggerpaused(
    event: nodeLib.nodeLibStrings.DebuggerDOTpaused,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.PausedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("addListener")
  def addListener_Debuggerresumed(event: nodeLib.nodeLibStrings.DebuggerDOTresumed, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptFailedToParse(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptFailedToParse,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptFailedToParseEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptParsed(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptParsed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptParsedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfileraddHeapSnapshotChunk(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.AddHeapSnapshotChunkEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("addListener")
  def addListener_HeapProfilerheapStatsUpdate(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.HeapStatsUpdateEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last
    * seen object id and corresponding timestamp. If the were changes in the heap since last event
    * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("addListener")
  def addListener_HeapProfilerlastSeenObjectId(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.LastSeenObjectIdEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerreportHeapSnapshotProgress(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.ReportHeapSnapshotProgressEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerresetProfiles(event: nodeLib.nodeLibStrings.HeapProfilerDOTresetProfiles, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("addListener")
  def addListener_NodeTracingdataCollected(
    event: nodeLib.nodeLibStrings.NodeTracingDOTdataCollected,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeTracingNs.DataCollectedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("addListener")
  def addListener_NodeTracingtracingComplete(event: nodeLib.nodeLibStrings.NodeTracingDOTtracingComplete, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerattachedToWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTattachedToWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.AttachedToWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerdetachedFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.DetachedFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("addListener")
  def addListener_NodeWorkerreceivedMessageFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.ReceivedMessageFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileFinished(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileFinishedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileStarted(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileStartedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("addListener")
  def addListener_RuntimeconsoleAPICalled(
    event: nodeLib.nodeLibStrings.RuntimeDOTconsoleAPICalled,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ConsoleAPICalledEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionRevoked(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionRevoked,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionRevokedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionThrown(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionThrown,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionThrownEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextCreated(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextCreated,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextCreatedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextDestroyed(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextDestroyedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextsCleared(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextsCleared,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API
    * call).
    */
  @JSName("addListener")
  def addListener_RuntimeinspectRequested(
    event: nodeLib.nodeLibStrings.RuntimeDOTinspectRequested,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.InspectRequestedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("addListener")
  def addListener_inspectorNotification(
    event: nodeLib.nodeLibStrings.inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], scala.Unit]
  ): this.type = js.native
  /**
    * Connects a session to the inspector back-end.
    * An exception will be thrown if there is already a connected session established either
    * through the API or by a front-end connected to the Inspector WebSocket port.
    */
  def connect(): scala.Unit = js.native
  /**
    * Immediately close the session. All pending message callbacks will be called with an error.
    * session.connect() will need to be called to be able to send messages again.
    * Reconnected session will lose all inspector state, such as enabled agents or configured breakpoints.
    */
  def disconnect(): scala.Unit = js.native
  @JSName("emit")
  def emit_ConsolemessageAdded(
    event: nodeLib.nodeLibStrings.ConsoleDOTmessageAdded,
    message: InspectorNotification[nodeLib.inspectorMod.ConsoleNs.MessageAddedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_DebuggerbreakpointResolved(
    event: nodeLib.nodeLibStrings.DebuggerDOTbreakpointResolved,
    message: InspectorNotification[nodeLib.inspectorMod.DebuggerNs.BreakpointResolvedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_Debuggerpaused(
    event: nodeLib.nodeLibStrings.DebuggerDOTpaused,
    message: InspectorNotification[nodeLib.inspectorMod.DebuggerNs.PausedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_Debuggerresumed(event: nodeLib.nodeLibStrings.DebuggerDOTresumed): scala.Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptFailedToParse(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptFailedToParse,
    message: InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptFailedToParseEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptParsed(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptParsed,
    message: InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptParsedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_HeapProfileraddHeapSnapshotChunk(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTaddHeapSnapshotChunk,
    message: InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.AddHeapSnapshotChunkEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerheapStatsUpdate(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTheapStatsUpdate,
    message: InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.HeapStatsUpdateEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerlastSeenObjectId(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTlastSeenObjectId,
    message: InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.LastSeenObjectIdEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerreportHeapSnapshotProgress(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTreportHeapSnapshotProgress,
    message: InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.ReportHeapSnapshotProgressEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerresetProfiles(event: nodeLib.nodeLibStrings.HeapProfilerDOTresetProfiles): scala.Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingdataCollected(
    event: nodeLib.nodeLibStrings.NodeTracingDOTdataCollected,
    message: InspectorNotification[nodeLib.inspectorMod.NodeTracingNs.DataCollectedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingtracingComplete(event: nodeLib.nodeLibStrings.NodeTracingDOTtracingComplete): scala.Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerattachedToWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTattachedToWorker,
    message: InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.AttachedToWorkerEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerdetachedFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTdetachedFromWorker,
    message: InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.DetachedFromWorkerEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerreceivedMessageFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTreceivedMessageFromWorker,
    message: InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.ReceivedMessageFromWorkerEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileFinished(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileFinished,
    message: InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileFinishedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileStarted(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileStarted,
    message: InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileStartedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_RuntimeconsoleAPICalled(
    event: nodeLib.nodeLibStrings.RuntimeDOTconsoleAPICalled,
    message: InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ConsoleAPICalledEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionRevoked(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionRevoked,
    message: InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionRevokedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionThrown(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionThrown,
    message: InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionThrownEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextCreated(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextCreated,
    message: InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextCreatedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextDestroyed(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextDestroyed,
    message: InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextDestroyedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextsCleared(event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextsCleared): scala.Boolean = js.native
  @JSName("emit")
  def emit_RuntimeinspectRequested(
    event: nodeLib.nodeLibStrings.RuntimeDOTinspectRequested,
    message: InspectorNotification[nodeLib.inspectorMod.RuntimeNs.InspectRequestedEventDataType]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_inspectorNotification(event: nodeLib.nodeLibStrings.inspectorNotification, message: InspectorNotification[js.Object]): scala.Boolean = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  def on_ConsolemessageAdded(
    event: nodeLib.nodeLibStrings.ConsoleDOTmessageAdded,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ConsoleNs.MessageAddedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("on")
  def on_DebuggerbreakpointResolved(
    event: nodeLib.nodeLibStrings.DebuggerDOTbreakpointResolved,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.BreakpointResolvedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("on")
  def on_Debuggerpaused(
    event: nodeLib.nodeLibStrings.DebuggerDOTpaused,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.PausedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("on")
  def on_Debuggerresumed(event: nodeLib.nodeLibStrings.DebuggerDOTresumed, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("on")
  def on_DebuggerscriptFailedToParse(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptFailedToParse,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptFailedToParseEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("on")
  def on_DebuggerscriptParsed(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptParsed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptParsedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfileraddHeapSnapshotChunk(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.AddHeapSnapshotChunkEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("on")
  def on_HeapProfilerheapStatsUpdate(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.HeapStatsUpdateEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last
    * seen object id and corresponding timestamp. If the were changes in the heap since last event
    * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("on")
  def on_HeapProfilerlastSeenObjectId(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.LastSeenObjectIdEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerreportHeapSnapshotProgress(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.ReportHeapSnapshotProgressEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerresetProfiles(event: nodeLib.nodeLibStrings.HeapProfilerDOTresetProfiles, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("on")
  def on_NodeTracingdataCollected(
    event: nodeLib.nodeLibStrings.NodeTracingDOTdataCollected,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeTracingNs.DataCollectedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("on")
  def on_NodeTracingtracingComplete(event: nodeLib.nodeLibStrings.NodeTracingDOTtracingComplete, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("on")
  def on_NodeWorkerattachedToWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTattachedToWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.AttachedToWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("on")
  def on_NodeWorkerdetachedFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.DetachedFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("on")
  def on_NodeWorkerreceivedMessageFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.ReceivedMessageFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ProfilerconsoleProfileFinished(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileFinishedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("on")
  def on_ProfilerconsoleProfileStarted(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileStartedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("on")
  def on_RuntimeconsoleAPICalled(
    event: nodeLib.nodeLibStrings.RuntimeDOTconsoleAPICalled,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ConsoleAPICalledEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("on")
  def on_RuntimeexceptionRevoked(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionRevoked,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionRevokedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("on")
  def on_RuntimeexceptionThrown(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionThrown,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionThrownEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("on")
  def on_RuntimeexecutionContextCreated(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextCreated,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextCreatedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("on")
  def on_RuntimeexecutionContextDestroyed(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextDestroyedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("on")
  def on_RuntimeexecutionContextsCleared(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextsCleared,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API
    * call).
    */
  @JSName("on")
  def on_RuntimeinspectRequested(
    event: nodeLib.nodeLibStrings.RuntimeDOTinspectRequested,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.InspectRequestedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("on")
  def on_inspectorNotification(
    event: nodeLib.nodeLibStrings.inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], scala.Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("once")
  def once_ConsolemessageAdded(
    event: nodeLib.nodeLibStrings.ConsoleDOTmessageAdded,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ConsoleNs.MessageAddedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("once")
  def once_DebuggerbreakpointResolved(
    event: nodeLib.nodeLibStrings.DebuggerDOTbreakpointResolved,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.BreakpointResolvedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("once")
  def once_Debuggerpaused(
    event: nodeLib.nodeLibStrings.DebuggerDOTpaused,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.PausedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("once")
  def once_Debuggerresumed(event: nodeLib.nodeLibStrings.DebuggerDOTresumed, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("once")
  def once_DebuggerscriptFailedToParse(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptFailedToParse,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptFailedToParseEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("once")
  def once_DebuggerscriptParsed(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptParsed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptParsedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfileraddHeapSnapshotChunk(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.AddHeapSnapshotChunkEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("once")
  def once_HeapProfilerheapStatsUpdate(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.HeapStatsUpdateEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last
    * seen object id and corresponding timestamp. If the were changes in the heap since last event
    * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("once")
  def once_HeapProfilerlastSeenObjectId(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.LastSeenObjectIdEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerreportHeapSnapshotProgress(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.ReportHeapSnapshotProgressEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerresetProfiles(event: nodeLib.nodeLibStrings.HeapProfilerDOTresetProfiles, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("once")
  def once_NodeTracingdataCollected(
    event: nodeLib.nodeLibStrings.NodeTracingDOTdataCollected,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeTracingNs.DataCollectedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("once")
  def once_NodeTracingtracingComplete(event: nodeLib.nodeLibStrings.NodeTracingDOTtracingComplete, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("once")
  def once_NodeWorkerattachedToWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTattachedToWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.AttachedToWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("once")
  def once_NodeWorkerdetachedFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.DetachedFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("once")
  def once_NodeWorkerreceivedMessageFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.ReceivedMessageFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_ProfilerconsoleProfileFinished(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileFinishedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("once")
  def once_ProfilerconsoleProfileStarted(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileStartedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("once")
  def once_RuntimeconsoleAPICalled(
    event: nodeLib.nodeLibStrings.RuntimeDOTconsoleAPICalled,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ConsoleAPICalledEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("once")
  def once_RuntimeexceptionRevoked(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionRevoked,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionRevokedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("once")
  def once_RuntimeexceptionThrown(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionThrown,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionThrownEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("once")
  def once_RuntimeexecutionContextCreated(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextCreated,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextCreatedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("once")
  def once_RuntimeexecutionContextDestroyed(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextDestroyedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("once")
  def once_RuntimeexecutionContextsCleared(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextsCleared,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API
    * call).
    */
  @JSName("once")
  def once_RuntimeinspectRequested(
    event: nodeLib.nodeLibStrings.RuntimeDOTinspectRequested,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.InspectRequestedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("once")
  def once_inspectorNotification(
    event: nodeLib.nodeLibStrings.inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], scala.Unit]
  ): this.type = js.native
  /**
    * Posts a message to the inspector back-end. callback will be notified when a response is received.
    * callback is a function that accepts two optional arguments - error and message-specific result.
    */
  def post(method: java.lang.String): scala.Unit = js.native
  def post(
    method: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* params */ js.UndefOr[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def post(method: java.lang.String, params: js.Object): scala.Unit = js.native
  def post(
    method: java.lang.String,
    params: js.Object,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* params */ js.UndefOr[js.Object], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Does nothing.
    */
  @JSName("post")
  def post_ConsoleclearMessages(method: nodeLib.nodeLibStrings.ConsoleDOTclearMessages): scala.Unit = js.native
  @JSName("post")
  def post_ConsoleclearMessages(
    method: nodeLib.nodeLibStrings.ConsoleDOTclearMessages,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  @JSName("post")
  def post_Consoledisable(method: nodeLib.nodeLibStrings.ConsoleDOTdisable): scala.Unit = js.native
  @JSName("post")
  def post_Consoledisable(
    method: nodeLib.nodeLibStrings.ConsoleDOTdisable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the
    * `messageAdded` notification.
    */
  @JSName("post")
  def post_Consoleenable(method: nodeLib.nodeLibStrings.ConsoleDOTenable): scala.Unit = js.native
  @JSName("post")
  def post_Consoleenable(
    method: nodeLib.nodeLibStrings.ConsoleDOTenable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Continues execution until specific location is reached.
    */
  @JSName("post")
  def post_DebuggercontinueToLocation(method: nodeLib.nodeLibStrings.DebuggerDOTcontinueToLocation): scala.Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(
    method: nodeLib.nodeLibStrings.DebuggerDOTcontinueToLocation,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(
    method: nodeLib.nodeLibStrings.DebuggerDOTcontinueToLocation,
    params: nodeLib.inspectorMod.DebuggerNs.ContinueToLocationParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(
    method: nodeLib.nodeLibStrings.DebuggerDOTcontinueToLocation,
    params: nodeLib.inspectorMod.DebuggerNs.ContinueToLocationParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Disables debugger for given page.
    */
  @JSName("post")
  def post_Debuggerdisable(method: nodeLib.nodeLibStrings.DebuggerDOTdisable): scala.Unit = js.native
  @JSName("post")
  def post_Debuggerdisable(
    method: nodeLib.nodeLibStrings.DebuggerDOTdisable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been
    * enabled until the result for this command is received.
    */
  @JSName("post")
  def post_Debuggerenable(method: nodeLib.nodeLibStrings.DebuggerDOTenable): scala.Unit = js.native
  @JSName("post")
  def post_Debuggerenable(
    method: nodeLib.nodeLibStrings.DebuggerDOTenable,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.EnableReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Evaluates expression on a given call frame.
    */
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(method: nodeLib.nodeLibStrings.DebuggerDOTevaluateOnCallFrame): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: nodeLib.nodeLibStrings.DebuggerDOTevaluateOnCallFrame,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.EvaluateOnCallFrameReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: nodeLib.nodeLibStrings.DebuggerDOTevaluateOnCallFrame,
    params: nodeLib.inspectorMod.DebuggerNs.EvaluateOnCallFrameParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: nodeLib.nodeLibStrings.DebuggerDOTevaluateOnCallFrame,
    params: nodeLib.inspectorMod.DebuggerNs.EvaluateOnCallFrameParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.EvaluateOnCallFrameReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be
    * the same.
    */
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(method: nodeLib.nodeLibStrings.DebuggerDOTgetPossibleBreakpoints): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetPossibleBreakpoints,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.GetPossibleBreakpointsReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetPossibleBreakpoints,
    params: nodeLib.inspectorMod.DebuggerNs.GetPossibleBreakpointsParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetPossibleBreakpoints,
    params: nodeLib.inspectorMod.DebuggerNs.GetPossibleBreakpointsParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.GetPossibleBreakpointsReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns source for the script with given id.
    */
  @JSName("post")
  def post_DebuggergetScriptSource(method: nodeLib.nodeLibStrings.DebuggerDOTgetScriptSource): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetScriptSource,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.GetScriptSourceReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetScriptSource,
    params: nodeLib.inspectorMod.DebuggerNs.GetScriptSourceParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetScriptSource,
    params: nodeLib.inspectorMod.DebuggerNs.GetScriptSourceParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.GetScriptSourceReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns stack trace with given `stackTraceId`.
    * @experimental
    */
  @JSName("post")
  def post_DebuggergetStackTrace(method: nodeLib.nodeLibStrings.DebuggerDOTgetStackTrace): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetStackTrace,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.GetStackTraceReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetStackTrace,
    params: nodeLib.inspectorMod.DebuggerNs.GetStackTraceParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: nodeLib.nodeLibStrings.DebuggerDOTgetStackTrace,
    params: nodeLib.inspectorMod.DebuggerNs.GetStackTraceParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.GetStackTraceReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Stops on the next JavaScript statement.
    */
  @JSName("post")
  def post_Debuggerpause(method: nodeLib.nodeLibStrings.DebuggerDOTpause): scala.Unit = js.native
  @JSName("post")
  def post_Debuggerpause(
    method: nodeLib.nodeLibStrings.DebuggerDOTpause,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: nodeLib.nodeLibStrings.DebuggerDOTpauseOnAsyncCall): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(
    method: nodeLib.nodeLibStrings.DebuggerDOTpauseOnAsyncCall,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(
    method: nodeLib.nodeLibStrings.DebuggerDOTpauseOnAsyncCall,
    params: nodeLib.inspectorMod.DebuggerNs.PauseOnAsyncCallParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(
    method: nodeLib.nodeLibStrings.DebuggerDOTpauseOnAsyncCall,
    params: nodeLib.inspectorMod.DebuggerNs.PauseOnAsyncCallParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes JavaScript breakpoint.
    */
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: nodeLib.nodeLibStrings.DebuggerDOTremoveBreakpoint): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(
    method: nodeLib.nodeLibStrings.DebuggerDOTremoveBreakpoint,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(
    method: nodeLib.nodeLibStrings.DebuggerDOTremoveBreakpoint,
    params: nodeLib.inspectorMod.DebuggerNs.RemoveBreakpointParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(
    method: nodeLib.nodeLibStrings.DebuggerDOTremoveBreakpoint,
    params: nodeLib.inspectorMod.DebuggerNs.RemoveBreakpointParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Restarts particular call frame from the beginning.
    */
  @JSName("post")
  def post_DebuggerrestartFrame(method: nodeLib.nodeLibStrings.DebuggerDOTrestartFrame): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: nodeLib.nodeLibStrings.DebuggerDOTrestartFrame,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.RestartFrameReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: nodeLib.nodeLibStrings.DebuggerDOTrestartFrame,
    params: nodeLib.inspectorMod.DebuggerNs.RestartFrameParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: nodeLib.nodeLibStrings.DebuggerDOTrestartFrame,
    params: nodeLib.inspectorMod.DebuggerNs.RestartFrameParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.RestartFrameReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Resumes JavaScript execution.
    */
  @JSName("post")
  def post_Debuggerresume(method: nodeLib.nodeLibStrings.DebuggerDOTresume): scala.Unit = js.native
  @JSName("post")
  def post_Debuggerresume(
    method: nodeLib.nodeLibStrings.DebuggerDOTresume,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This method is deprecated - use Debugger.stepInto with breakOnAsyncCall and
    * Debugger.pauseOnAsyncTask instead. Steps into next scheduled async task if any is scheduled
    * before next pause. Returns success when async task is actually scheduled, returns error if no
    * task were scheduled or another scheduleStepIntoAsync was called.
    * @experimental
    */
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(method: nodeLib.nodeLibStrings.DebuggerDOTscheduleStepIntoAsync): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(
    method: nodeLib.nodeLibStrings.DebuggerDOTscheduleStepIntoAsync,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Searches for given string in script content.
    */
  @JSName("post")
  def post_DebuggersearchInContent(method: nodeLib.nodeLibStrings.DebuggerDOTsearchInContent): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: nodeLib.nodeLibStrings.DebuggerDOTsearchInContent,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SearchInContentReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: nodeLib.nodeLibStrings.DebuggerDOTsearchInContent,
    params: nodeLib.inspectorMod.DebuggerNs.SearchInContentParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: nodeLib.nodeLibStrings.DebuggerDOTsearchInContent,
    params: nodeLib.inspectorMod.DebuggerNs.SearchInContentParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SearchInContentReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Enables or disables async call stacks tracking.
    */
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: nodeLib.nodeLibStrings.DebuggerDOTsetAsyncCallStackDepth): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetAsyncCallStackDepth,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetAsyncCallStackDepth,
    params: nodeLib.inspectorMod.DebuggerNs.SetAsyncCallStackDepthParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetAsyncCallStackDepth,
    params: nodeLib.inspectorMod.DebuggerNs.SetAsyncCallStackDepthParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in
    * scripts with url matching one of the patterns. VM will try to leave blackboxed script by
    * performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxPatterns): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxPatterns,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxPatterns,
    params: nodeLib.inspectorMod.DebuggerNs.SetBlackboxPatternsParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxPatterns,
    params: nodeLib.inspectorMod.DebuggerNs.SetBlackboxPatternsParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted
    * scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * Positions array contains positions where blackbox state is changed. First interval isn't
    * blackboxed. Array should be sorted.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxedRanges): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxedRanges,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxedRanges,
    params: nodeLib.inspectorMod.DebuggerNs.SetBlackboxedRangesParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBlackboxedRanges,
    params: nodeLib.inspectorMod.DebuggerNs.SetBlackboxedRangesParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  @JSName("post")
  def post_DebuggersetBreakpoint(method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpoint): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpoint,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetBreakpointReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpoint,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpoint,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetBreakpointReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
    * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
    * `locations` property. Further matching script parsing will result in subsequent
    * `breakpointResolved` events issued. This logical breakpoint will survive page reloads.
    */
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointByUrl): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointByUrl,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetBreakpointByUrlReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointByUrl,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointByUrlParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointByUrl,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointByUrlParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetBreakpointByUrlReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Sets JavaScript breakpoint before each call to the given function.
    * If another function was created from the same source as a given one,
    * calling it will also trigger the breakpoint.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBreakpointOnFunctionCall(method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointOnFunctionCall): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointOnFunctionCall(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointOnFunctionCall,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetBreakpointOnFunctionCallReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointOnFunctionCall(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointOnFunctionCall,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointOnFunctionCallParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointOnFunctionCall(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointOnFunctionCall,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointOnFunctionCallParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetBreakpointOnFunctionCallReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointsActive): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointsActive,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointsActive,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointsActiveParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetBreakpointsActive,
    params: nodeLib.inspectorMod.DebuggerNs.SetBreakpointsActiveParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or
    * no exceptions. Initial pause on exceptions state is `none`.
    */
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: nodeLib.nodeLibStrings.DebuggerDOTsetPauseOnExceptions): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetPauseOnExceptions,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetPauseOnExceptions,
    params: nodeLib.inspectorMod.DebuggerNs.SetPauseOnExceptionsParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetPauseOnExceptions,
    params: nodeLib.inspectorMod.DebuggerNs.SetPauseOnExceptionsParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Changes return value in top frame. Available only at return break position.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetReturnValue(method: nodeLib.nodeLibStrings.DebuggerDOTsetReturnValue): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetReturnValue,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetReturnValue,
    params: nodeLib.inspectorMod.DebuggerNs.SetReturnValueParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetReturnValue,
    params: nodeLib.inspectorMod.DebuggerNs.SetReturnValueParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Edits JavaScript source live.
    */
  @JSName("post")
  def post_DebuggersetScriptSource(method: nodeLib.nodeLibStrings.DebuggerDOTsetScriptSource): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetScriptSource,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetScriptSourceReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetScriptSource,
    params: nodeLib.inspectorMod.DebuggerNs.SetScriptSourceParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetScriptSource,
    params: nodeLib.inspectorMod.DebuggerNs.SetScriptSourceParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.DebuggerNs.SetScriptSourceReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: nodeLib.nodeLibStrings.DebuggerDOTsetSkipAllPauses): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetSkipAllPauses,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetSkipAllPauses,
    params: nodeLib.inspectorMod.DebuggerNs.SetSkipAllPausesParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetSkipAllPauses,
    params: nodeLib.inspectorMod.DebuggerNs.SetSkipAllPausesParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be
    * mutated manually.
    */
  @JSName("post")
  def post_DebuggersetVariableValue(method: nodeLib.nodeLibStrings.DebuggerDOTsetVariableValue): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetVariableValue,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetVariableValue,
    params: nodeLib.inspectorMod.DebuggerNs.SetVariableValueParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(
    method: nodeLib.nodeLibStrings.DebuggerDOTsetVariableValue,
    params: nodeLib.inspectorMod.DebuggerNs.SetVariableValueParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Steps into the function call.
    */
  @JSName("post")
  def post_DebuggerstepInto(method: nodeLib.nodeLibStrings.DebuggerDOTstepInto): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(
    method: nodeLib.nodeLibStrings.DebuggerDOTstepInto,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(
    method: nodeLib.nodeLibStrings.DebuggerDOTstepInto,
    params: nodeLib.inspectorMod.DebuggerNs.StepIntoParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(
    method: nodeLib.nodeLibStrings.DebuggerDOTstepInto,
    params: nodeLib.inspectorMod.DebuggerNs.StepIntoParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Steps out of the function call.
    */
  @JSName("post")
  def post_DebuggerstepOut(method: nodeLib.nodeLibStrings.DebuggerDOTstepOut): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerstepOut(
    method: nodeLib.nodeLibStrings.DebuggerDOTstepOut,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Steps over the statement.
    */
  @JSName("post")
  def post_DebuggerstepOver(method: nodeLib.nodeLibStrings.DebuggerDOTstepOver): scala.Unit = js.native
  @JSName("post")
  def post_DebuggerstepOver(
    method: nodeLib.nodeLibStrings.DebuggerDOTstepOver,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details
    * $x functions).
    */
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(method: nodeLib.nodeLibStrings.HeapProfilerDOTaddInspectedHeapObject): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTaddInspectedHeapObject,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTaddInspectedHeapObject,
    params: nodeLib.inspectorMod.HeapProfilerNs.AddInspectedHeapObjectParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTaddInspectedHeapObject,
    params: nodeLib.inspectorMod.HeapProfilerNs.AddInspectedHeapObjectParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(method: nodeLib.nodeLibStrings.HeapProfilerDOTcollectGarbage): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTcollectGarbage,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(method: nodeLib.nodeLibStrings.HeapProfilerDOTdisable): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTdisable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(method: nodeLib.nodeLibStrings.HeapProfilerDOTenable): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTenable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(method: nodeLib.nodeLibStrings.HeapProfilerDOTgetHeapObjectId): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTgetHeapObjectId,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.HeapProfilerNs.GetHeapObjectIdReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTgetHeapObjectId,
    params: nodeLib.inspectorMod.HeapProfilerNs.GetHeapObjectIdParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTgetHeapObjectId,
    params: nodeLib.inspectorMod.HeapProfilerNs.GetHeapObjectIdParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.HeapProfilerNs.GetHeapObjectIdReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(method: nodeLib.nodeLibStrings.HeapProfilerDOTgetObjectByHeapObjectId): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTgetObjectByHeapObjectId,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.HeapProfilerNs.GetObjectByHeapObjectIdReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTgetObjectByHeapObjectId,
    params: nodeLib.inspectorMod.HeapProfilerNs.GetObjectByHeapObjectIdParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTgetObjectByHeapObjectId,
    params: nodeLib.inspectorMod.HeapProfilerNs.GetObjectByHeapObjectIdParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.HeapProfilerNs.GetObjectByHeapObjectIdReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(method: nodeLib.nodeLibStrings.HeapProfilerDOTgetSamplingProfile): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTgetSamplingProfile,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.HeapProfilerNs.GetSamplingProfileReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: nodeLib.nodeLibStrings.HeapProfilerDOTstartSampling): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstartSampling,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstartSampling,
    params: nodeLib.inspectorMod.HeapProfilerNs.StartSamplingParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstartSampling,
    params: nodeLib.inspectorMod.HeapProfilerNs.StartSamplingParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(method: nodeLib.nodeLibStrings.HeapProfilerDOTstartTrackingHeapObjects): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstartTrackingHeapObjects,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstartTrackingHeapObjects,
    params: nodeLib.inspectorMod.HeapProfilerNs.StartTrackingHeapObjectsParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstartTrackingHeapObjects,
    params: nodeLib.inspectorMod.HeapProfilerNs.StartTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(method: nodeLib.nodeLibStrings.HeapProfilerDOTstopSampling): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstopSampling,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.HeapProfilerNs.StopSamplingReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(method: nodeLib.nodeLibStrings.HeapProfilerDOTstopTrackingHeapObjects): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstopTrackingHeapObjects,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstopTrackingHeapObjects,
    params: nodeLib.inspectorMod.HeapProfilerNs.StopTrackingHeapObjectsParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTstopTrackingHeapObjects,
    params: nodeLib.inspectorMod.HeapProfilerNs.StopTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: nodeLib.nodeLibStrings.HeapProfilerDOTtakeHeapSnapshot): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTtakeHeapSnapshot,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTtakeHeapSnapshot,
    params: nodeLib.inspectorMod.HeapProfilerNs.TakeHeapSnapshotParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(
    method: nodeLib.nodeLibStrings.HeapProfilerDOTtakeHeapSnapshot,
    params: nodeLib.inspectorMod.HeapProfilerNs.TakeHeapSnapshotParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets supported tracing categories.
    */
  @JSName("post")
  def post_NodeTracinggetCategories(method: nodeLib.nodeLibStrings.NodeTracingDOTgetCategories): scala.Unit = js.native
  @JSName("post")
  def post_NodeTracinggetCategories(
    method: nodeLib.nodeLibStrings.NodeTracingDOTgetCategories,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.NodeTracingNs.GetCategoriesReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Start trace events collection.
    */
  @JSName("post")
  def post_NodeTracingstart(method: nodeLib.nodeLibStrings.NodeTracingDOTstart): scala.Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(
    method: nodeLib.nodeLibStrings.NodeTracingDOTstart,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(
    method: nodeLib.nodeLibStrings.NodeTracingDOTstart,
    params: nodeLib.inspectorMod.NodeTracingNs.StartParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(
    method: nodeLib.nodeLibStrings.NodeTracingDOTstart,
    params: nodeLib.inspectorMod.NodeTracingNs.StartParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Stop trace events collection. Remaining collected events will be sent as a sequence of
    * dataCollected events followed by tracingComplete event.
    */
  @JSName("post")
  def post_NodeTracingstop(method: nodeLib.nodeLibStrings.NodeTracingDOTstop): scala.Unit = js.native
  @JSName("post")
  def post_NodeTracingstop(
    method: nodeLib.nodeLibStrings.NodeTracingDOTstop,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Detaches from all running workers and disables attaching to new workers as they are started.
    */
  @JSName("post")
  def post_NodeWorkerdisable(method: nodeLib.nodeLibStrings.NodeWorkerDOTdisable): scala.Unit = js.native
  @JSName("post")
  def post_NodeWorkerdisable(
    method: nodeLib.nodeLibStrings.NodeWorkerDOTdisable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Instructs the inspector to attach to running workers. Will also attach to new workers
    * as they start
    */
  @JSName("post")
  def post_NodeWorkerenable(method: nodeLib.nodeLibStrings.NodeWorkerDOTenable): scala.Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(
    method: nodeLib.nodeLibStrings.NodeWorkerDOTenable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(
    method: nodeLib.nodeLibStrings.NodeWorkerDOTenable,
    params: nodeLib.inspectorMod.NodeWorkerNs.EnableParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(
    method: nodeLib.nodeLibStrings.NodeWorkerDOTenable,
    params: nodeLib.inspectorMod.NodeWorkerNs.EnableParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sends protocol message over session with given id.
    */
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: nodeLib.nodeLibStrings.NodeWorkerDOTsendMessageToWorker): scala.Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(
    method: nodeLib.nodeLibStrings.NodeWorkerDOTsendMessageToWorker,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(
    method: nodeLib.nodeLibStrings.NodeWorkerDOTsendMessageToWorker,
    params: nodeLib.inspectorMod.NodeWorkerNs.SendMessageToWorkerParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(
    method: nodeLib.nodeLibStrings.NodeWorkerDOTsendMessageToWorker,
    params: nodeLib.inspectorMod.NodeWorkerNs.SendMessageToWorkerParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_Profilerdisable(method: nodeLib.nodeLibStrings.ProfilerDOTdisable): scala.Unit = js.native
  @JSName("post")
  def post_Profilerdisable(
    method: nodeLib.nodeLibStrings.ProfilerDOTdisable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_Profilerenable(method: nodeLib.nodeLibStrings.ProfilerDOTenable): scala.Unit = js.native
  @JSName("post")
  def post_Profilerenable(
    method: nodeLib.nodeLibStrings.ProfilerDOTenable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to
    * garbage collection.
    */
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(method: nodeLib.nodeLibStrings.ProfilerDOTgetBestEffortCoverage): scala.Unit = js.native
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(
    method: nodeLib.nodeLibStrings.ProfilerDOTgetBestEffortCoverage,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.ProfilerNs.GetBestEffortCoverageReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: nodeLib.nodeLibStrings.ProfilerDOTsetSamplingInterval): scala.Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(
    method: nodeLib.nodeLibStrings.ProfilerDOTsetSamplingInterval,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(
    method: nodeLib.nodeLibStrings.ProfilerDOTsetSamplingInterval,
    params: nodeLib.inspectorMod.ProfilerNs.SetSamplingIntervalParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(
    method: nodeLib.nodeLibStrings.ProfilerDOTsetSamplingInterval,
    params: nodeLib.inspectorMod.ProfilerNs.SetSamplingIntervalParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_Profilerstart(method: nodeLib.nodeLibStrings.ProfilerDOTstart): scala.Unit = js.native
  @JSName("post")
  def post_Profilerstart(
    method: nodeLib.nodeLibStrings.ProfilerDOTstart,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code
    * coverage may be incomplete. Enabling prevents running optimized code and resets execution
    * counters.
    */
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: nodeLib.nodeLibStrings.ProfilerDOTstartPreciseCoverage): scala.Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(
    method: nodeLib.nodeLibStrings.ProfilerDOTstartPreciseCoverage,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(
    method: nodeLib.nodeLibStrings.ProfilerDOTstartPreciseCoverage,
    params: nodeLib.inspectorMod.ProfilerNs.StartPreciseCoverageParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(
    method: nodeLib.nodeLibStrings.ProfilerDOTstartPreciseCoverage,
    params: nodeLib.inspectorMod.ProfilerNs.StartPreciseCoverageParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enable type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstartTypeProfile(method: nodeLib.nodeLibStrings.ProfilerDOTstartTypeProfile): scala.Unit = js.native
  @JSName("post")
  def post_ProfilerstartTypeProfile(
    method: nodeLib.nodeLibStrings.ProfilerDOTstartTypeProfile,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_Profilerstop(method: nodeLib.nodeLibStrings.ProfilerDOTstop): scala.Unit = js.native
  @JSName("post")
  def post_Profilerstop(
    method: nodeLib.nodeLibStrings.ProfilerDOTstop,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.ProfilerNs.StopReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows
    * executing optimized code.
    */
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(method: nodeLib.nodeLibStrings.ProfilerDOTstopPreciseCoverage): scala.Unit = js.native
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(
    method: nodeLib.nodeLibStrings.ProfilerDOTstopPreciseCoverage,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Disable type profile. Disabling releases type profile data collected so far.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstopTypeProfile(method: nodeLib.nodeLibStrings.ProfilerDOTstopTypeProfile): scala.Unit = js.native
  @JSName("post")
  def post_ProfilerstopTypeProfile(
    method: nodeLib.nodeLibStrings.ProfilerDOTstopTypeProfile,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code
    * coverage needs to have started.
    */
  @JSName("post")
  def post_ProfilertakePreciseCoverage(method: nodeLib.nodeLibStrings.ProfilerDOTtakePreciseCoverage): scala.Unit = js.native
  @JSName("post")
  def post_ProfilertakePreciseCoverage(
    method: nodeLib.nodeLibStrings.ProfilerDOTtakePreciseCoverage,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.ProfilerNs.TakePreciseCoverageReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Collect type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilertakeTypeProfile(method: nodeLib.nodeLibStrings.ProfilerDOTtakeTypeProfile): scala.Unit = js.native
  @JSName("post")
  def post_ProfilertakeTypeProfile(
    method: nodeLib.nodeLibStrings.ProfilerDOTtakeTypeProfile,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.ProfilerNs.TakeTypeProfileReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Add handler to promise with given promise object id.
    */
  @JSName("post")
  def post_RuntimeawaitPromise(method: nodeLib.nodeLibStrings.RuntimeDOTawaitPromise): scala.Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: nodeLib.nodeLibStrings.RuntimeDOTawaitPromise,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.AwaitPromiseReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: nodeLib.nodeLibStrings.RuntimeDOTawaitPromise,
    params: nodeLib.inspectorMod.RuntimeNs.AwaitPromiseParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: nodeLib.nodeLibStrings.RuntimeDOTawaitPromise,
    params: nodeLib.inspectorMod.RuntimeNs.AwaitPromiseParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.AwaitPromiseReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Calls function with given declaration on the given object. Object group of the result is
    * inherited from the target object.
    */
  @JSName("post")
  def post_RuntimecallFunctionOn(method: nodeLib.nodeLibStrings.RuntimeDOTcallFunctionOn): scala.Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: nodeLib.nodeLibStrings.RuntimeDOTcallFunctionOn,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.CallFunctionOnReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: nodeLib.nodeLibStrings.RuntimeDOTcallFunctionOn,
    params: nodeLib.inspectorMod.RuntimeNs.CallFunctionOnParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: nodeLib.nodeLibStrings.RuntimeDOTcallFunctionOn,
    params: nodeLib.inspectorMod.RuntimeNs.CallFunctionOnParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.CallFunctionOnReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Compiles expression.
    */
  @JSName("post")
  def post_RuntimecompileScript(method: nodeLib.nodeLibStrings.RuntimeDOTcompileScript): scala.Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: nodeLib.nodeLibStrings.RuntimeDOTcompileScript,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.CompileScriptReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: nodeLib.nodeLibStrings.RuntimeDOTcompileScript,
    params: nodeLib.inspectorMod.RuntimeNs.CompileScriptParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: nodeLib.nodeLibStrings.RuntimeDOTcompileScript,
    params: nodeLib.inspectorMod.RuntimeNs.CompileScriptParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.CompileScriptReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Disables reporting of execution contexts creation.
    */
  @JSName("post")
  def post_Runtimedisable(method: nodeLib.nodeLibStrings.RuntimeDOTdisable): scala.Unit = js.native
  @JSName("post")
  def post_Runtimedisable(
    method: nodeLib.nodeLibStrings.RuntimeDOTdisable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Discards collected exceptions and console API calls.
    */
  @JSName("post")
  def post_RuntimediscardConsoleEntries(method: nodeLib.nodeLibStrings.RuntimeDOTdiscardConsoleEntries): scala.Unit = js.native
  @JSName("post")
  def post_RuntimediscardConsoleEntries(
    method: nodeLib.nodeLibStrings.RuntimeDOTdiscardConsoleEntries,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables reporting of execution contexts creation by means of `executionContextCreated` event.
    * When the reporting gets enabled the event will be sent immediately for each existing execution
    * context.
    */
  @JSName("post")
  def post_Runtimeenable(method: nodeLib.nodeLibStrings.RuntimeDOTenable): scala.Unit = js.native
  @JSName("post")
  def post_Runtimeenable(
    method: nodeLib.nodeLibStrings.RuntimeDOTenable,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Evaluates expression on global object.
    */
  @JSName("post")
  def post_Runtimeevaluate(method: nodeLib.nodeLibStrings.RuntimeDOTevaluate): scala.Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: nodeLib.nodeLibStrings.RuntimeDOTevaluate,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.EvaluateReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: nodeLib.nodeLibStrings.RuntimeDOTevaluate,
    params: nodeLib.inspectorMod.RuntimeNs.EvaluateParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: nodeLib.nodeLibStrings.RuntimeDOTevaluate,
    params: nodeLib.inspectorMod.RuntimeNs.EvaluateParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.EvaluateReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns the JavaScript heap usage.
    * It is the total usage of the corresponding isolate not scoped to a particular Runtime.
    * @experimental
    */
  @JSName("post")
  def post_RuntimegetHeapUsage(method: nodeLib.nodeLibStrings.RuntimeDOTgetHeapUsage): scala.Unit = js.native
  @JSName("post")
  def post_RuntimegetHeapUsage(
    method: nodeLib.nodeLibStrings.RuntimeDOTgetHeapUsage,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.GetHeapUsageReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns the isolate id.
    * @experimental
    */
  @JSName("post")
  def post_RuntimegetIsolateId(method: nodeLib.nodeLibStrings.RuntimeDOTgetIsolateId): scala.Unit = js.native
  @JSName("post")
  def post_RuntimegetIsolateId(
    method: nodeLib.nodeLibStrings.RuntimeDOTgetIsolateId,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.GetIsolateIdReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns properties of a given object. Object group of the result is inherited from the target
    * object.
    */
  @JSName("post")
  def post_RuntimegetProperties(method: nodeLib.nodeLibStrings.RuntimeDOTgetProperties): scala.Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: nodeLib.nodeLibStrings.RuntimeDOTgetProperties,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.GetPropertiesReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: nodeLib.nodeLibStrings.RuntimeDOTgetProperties,
    params: nodeLib.inspectorMod.RuntimeNs.GetPropertiesParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: nodeLib.nodeLibStrings.RuntimeDOTgetProperties,
    params: nodeLib.inspectorMod.RuntimeNs.GetPropertiesParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.GetPropertiesReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns all let, const and class variables from global scope.
    */
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(method: nodeLib.nodeLibStrings.RuntimeDOTglobalLexicalScopeNames): scala.Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: nodeLib.nodeLibStrings.RuntimeDOTglobalLexicalScopeNames,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.GlobalLexicalScopeNamesReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: nodeLib.nodeLibStrings.RuntimeDOTglobalLexicalScopeNames,
    params: nodeLib.inspectorMod.RuntimeNs.GlobalLexicalScopeNamesParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: nodeLib.nodeLibStrings.RuntimeDOTglobalLexicalScopeNames,
    params: nodeLib.inspectorMod.RuntimeNs.GlobalLexicalScopeNamesParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.GlobalLexicalScopeNamesReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(method: nodeLib.nodeLibStrings.RuntimeDOTqueryObjects): scala.Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: nodeLib.nodeLibStrings.RuntimeDOTqueryObjects,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.QueryObjectsReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: nodeLib.nodeLibStrings.RuntimeDOTqueryObjects,
    params: nodeLib.inspectorMod.RuntimeNs.QueryObjectsParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: nodeLib.nodeLibStrings.RuntimeDOTqueryObjects,
    params: nodeLib.inspectorMod.RuntimeNs.QueryObjectsParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.QueryObjectsReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Releases remote object with given id.
    */
  @JSName("post")
  def post_RuntimereleaseObject(method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObject): scala.Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(
    method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObject,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(
    method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObject,
    params: nodeLib.inspectorMod.RuntimeNs.ReleaseObjectParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(
    method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObject,
    params: nodeLib.inspectorMod.RuntimeNs.ReleaseObjectParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Releases all remote objects that belong to a given group.
    */
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObjectGroup): scala.Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(
    method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObjectGroup,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(
    method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObjectGroup,
    params: nodeLib.inspectorMod.RuntimeNs.ReleaseObjectGroupParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(
    method: nodeLib.nodeLibStrings.RuntimeDOTreleaseObjectGroup,
    params: nodeLib.inspectorMod.RuntimeNs.ReleaseObjectGroupParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Tells inspected instance to run if it was waiting for debugger to attach.
    */
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(method: nodeLib.nodeLibStrings.RuntimeDOTrunIfWaitingForDebugger): scala.Unit = js.native
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(
    method: nodeLib.nodeLibStrings.RuntimeDOTrunIfWaitingForDebugger,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Runs script with given id in a given context.
    */
  @JSName("post")
  def post_RuntimerunScript(method: nodeLib.nodeLibStrings.RuntimeDOTrunScript): scala.Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: nodeLib.nodeLibStrings.RuntimeDOTrunScript,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.RunScriptReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: nodeLib.nodeLibStrings.RuntimeDOTrunScript,
    params: nodeLib.inspectorMod.RuntimeNs.RunScriptParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: nodeLib.nodeLibStrings.RuntimeDOTrunScript,
    params: nodeLib.inspectorMod.RuntimeNs.RunScriptParameterType,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.RuntimeNs.RunScriptReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(method: nodeLib.nodeLibStrings.RuntimeDOTsetCustomObjectFormatterEnabled): scala.Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: nodeLib.nodeLibStrings.RuntimeDOTsetCustomObjectFormatterEnabled,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: nodeLib.nodeLibStrings.RuntimeDOTsetCustomObjectFormatterEnabled,
    params: nodeLib.inspectorMod.RuntimeNs.SetCustomObjectFormatterEnabledParameterType
  ): scala.Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: nodeLib.nodeLibStrings.RuntimeDOTsetCustomObjectFormatterEnabled,
    params: nodeLib.inspectorMod.RuntimeNs.SetCustomObjectFormatterEnabledParameterType,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Terminate current or next JavaScript execution.
    * Will cancel the termination when the outer-most script execution ends.
    * @experimental
    */
  @JSName("post")
  def post_RuntimeterminateExecution(method: nodeLib.nodeLibStrings.RuntimeDOTterminateExecution): scala.Unit = js.native
  @JSName("post")
  def post_RuntimeterminateExecution(
    method: nodeLib.nodeLibStrings.RuntimeDOTterminateExecution,
    callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns supported domains.
    */
  @JSName("post")
  def post_SchemagetDomains(method: nodeLib.nodeLibStrings.SchemaDOTgetDomains): scala.Unit = js.native
  @JSName("post")
  def post_SchemagetDomains(
    method: nodeLib.nodeLibStrings.SchemaDOTgetDomains,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* params */ nodeLib.inspectorMod.SchemaNs.GetDomainsReturnType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependListener")
  def prependListener_ConsolemessageAdded(
    event: nodeLib.nodeLibStrings.ConsoleDOTmessageAdded,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ConsoleNs.MessageAddedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependListener")
  def prependListener_DebuggerbreakpointResolved(
    event: nodeLib.nodeLibStrings.DebuggerDOTbreakpointResolved,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.BreakpointResolvedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependListener")
  def prependListener_Debuggerpaused(
    event: nodeLib.nodeLibStrings.DebuggerDOTpaused,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.PausedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependListener")
  def prependListener_Debuggerresumed(event: nodeLib.nodeLibStrings.DebuggerDOTresumed, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptFailedToParse(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptFailedToParse,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptFailedToParseEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptParsed(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptParsed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptParsedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfileraddHeapSnapshotChunk(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.AddHeapSnapshotChunkEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerheapStatsUpdate(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.HeapStatsUpdateEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last
    * seen object id and corresponding timestamp. If the were changes in the heap since last event
    * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerlastSeenObjectId(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.LastSeenObjectIdEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerreportHeapSnapshotProgress(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.ReportHeapSnapshotProgressEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerresetProfiles(event: nodeLib.nodeLibStrings.HeapProfilerDOTresetProfiles, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingdataCollected(
    event: nodeLib.nodeLibStrings.NodeTracingDOTdataCollected,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeTracingNs.DataCollectedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingtracingComplete(event: nodeLib.nodeLibStrings.NodeTracingDOTtracingComplete, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerattachedToWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTattachedToWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.AttachedToWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerdetachedFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.DetachedFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerreceivedMessageFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.ReceivedMessageFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileFinished(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileFinishedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileStarted(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileStartedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependListener")
  def prependListener_RuntimeconsoleAPICalled(
    event: nodeLib.nodeLibStrings.RuntimeDOTconsoleAPICalled,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ConsoleAPICalledEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionRevoked(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionRevoked,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionRevokedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionThrown(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionThrown,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionThrownEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextCreated(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextCreated,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextCreatedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextDestroyed(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextDestroyedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextsCleared(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextsCleared,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API
    * call).
    */
  @JSName("prependListener")
  def prependListener_RuntimeinspectRequested(
    event: nodeLib.nodeLibStrings.RuntimeDOTinspectRequested,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.InspectRequestedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependListener")
  def prependListener_inspectorNotification(
    event: nodeLib.nodeLibStrings.inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], scala.Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ConsolemessageAdded(
    event: nodeLib.nodeLibStrings.ConsoleDOTmessageAdded,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ConsoleNs.MessageAddedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerbreakpointResolved(
    event: nodeLib.nodeLibStrings.DebuggerDOTbreakpointResolved,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.BreakpointResolvedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerpaused(
    event: nodeLib.nodeLibStrings.DebuggerDOTpaused,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.PausedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerresumed(event: nodeLib.nodeLibStrings.DebuggerDOTresumed, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptFailedToParse(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptFailedToParse,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptFailedToParseEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptParsed(
    event: nodeLib.nodeLibStrings.DebuggerDOTscriptParsed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.DebuggerNs.ScriptParsedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfileraddHeapSnapshotChunk(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.AddHeapSnapshotChunkEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerheapStatsUpdate(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.HeapStatsUpdateEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last
    * seen object id and corresponding timestamp. If the were changes in the heap since last event
    * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerlastSeenObjectId(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.LastSeenObjectIdEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerreportHeapSnapshotProgress(
    event: nodeLib.nodeLibStrings.HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.HeapProfilerNs.ReportHeapSnapshotProgressEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerresetProfiles(event: nodeLib.nodeLibStrings.HeapProfilerDOTresetProfiles, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingdataCollected(
    event: nodeLib.nodeLibStrings.NodeTracingDOTdataCollected,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeTracingNs.DataCollectedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingtracingComplete(event: nodeLib.nodeLibStrings.NodeTracingDOTtracingComplete, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerattachedToWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTattachedToWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.AttachedToWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerdetachedFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.DetachedFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerreceivedMessageFromWorker(
    event: nodeLib.nodeLibStrings.NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.NodeWorkerNs.ReceivedMessageFromWorkerEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileFinished(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileFinishedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileStarted(
    event: nodeLib.nodeLibStrings.ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.ProfilerNs.ConsoleProfileStartedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeconsoleAPICalled(
    event: nodeLib.nodeLibStrings.RuntimeDOTconsoleAPICalled,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ConsoleAPICalledEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionRevoked(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionRevoked,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionRevokedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionThrown(
    event: nodeLib.nodeLibStrings.RuntimeDOTexceptionThrown,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExceptionThrownEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextCreated(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextCreated,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextCreatedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextDestroyed(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.ExecutionContextDestroyedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextsCleared(
    event: nodeLib.nodeLibStrings.RuntimeDOTexecutionContextsCleared,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API
    * call).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeinspectRequested(
    event: nodeLib.nodeLibStrings.RuntimeDOTinspectRequested,
    listener: js.Function1[
      /* message */ InspectorNotification[nodeLib.inspectorMod.RuntimeNs.InspectRequestedEventDataType], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_inspectorNotification(
    event: nodeLib.nodeLibStrings.inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], scala.Unit]
  ): this.type = js.native
}

