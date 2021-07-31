package typings.nodeRedNodeTestHelper

import org.scalablytyped.runtime.Instantiable0
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.nodeRed.mod.NodeAPISettingsWithData
import typings.nodeRed.mod.NodeCredentials
import typings.nodeRed.mod.NodeDef
import typings.nodeRed.mod.NodeInitializer
import typings.nodeRedNodeTestHelper.anon.Id
import typings.nodeRedNodeTestHelper.anon.PartialLocalSettings
import typings.nodeRedNodeTestHelper.anon.TestFlowsItemNodeDef
import typings.nodeRedRuntime.mod.LocalSettings
import typings.sinon.mod.SinonSpy
import typings.std.Node
import typings.std.Partial
import typings.supertest.mod.SuperTest
import typings.supertest.mod.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node-red-node-test-helper.node-red-node-test-helper.NodeTestHelper & {  NodeTestHelper :new (): node-red-node-test-helper.node-red-node-test-helper.NodeTestHelper} */
object mod {
  
  @JSImport("node-red-node-test-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait NodeTestHelper extends EventEmitter {
    
    /**
      * Stop all flows.
      */
    def clearFlows(): js.Promise[Unit] = js.native
    
    /**
      * Returns a node instance by id in the testFlow. Any node that is defined in testFlows
      * can be retrieved, including any helper node added to the flow.
      * @param id Node id
      */
    def getNode(id: String): Node = js.native
    
    def init(nodeRedRuntime: String): Unit = js.native
    def init(nodeRedRuntime: String, userSettings: LocalSettings): Unit = js.native
    
    /**
      * Loads a flow then starts the flow.
      * @param testNode Initializer function of a node to be tested. This node will be
      * registered, and can be used in testFlows.
      * @param testFlows Flow data to test a node. If you want to use flow data exported
      * from Node-RED editor, export the flow to the clipboard and paste the content into
      * your test scripts.
      * @param testCredentials Optional node credentials.
      * @param cb Function to call back when testFlows has been started.
      */
    def load(testNode: TestNodeInitializer, testFlows: TestFlows): js.Promise[Unit] = js.native
    def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: js.Object): js.Promise[Unit] = js.native
    def load(
      testNode: TestNodeInitializer,
      testFlows: TestFlows,
      testCredentials: js.Object,
      cb: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: Unit, cb: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Return a spy on the logs to look for events from the node under test. For example:
      * ```
      * const logEvents = helper.log().args.filter((evt) => {
      *     return evt[0].type === "batch";
      * });
      * ```
      */
    def log(): SinonSpy[js.Array[js.Any], js.Any] = js.native
    
    /**
      * Create http (supertest) request to the editor/admin url.
      * @example
      * ```
      * helper.request().post('/inject/invalid').expect(404).end(done);
      * ```
      */
    def request(): SuperTest[Test] = js.native
    
    /**
      * Merges any userSettings with the defaults returned by `RED.settings`. Each
      * invocation of this method will overwrite the previous userSettings to prevent
      * unexpected problems in your tests.
      *
      * This will enable you to replicate your production environment within your tests,
      * for example where you're using the `functionGlobalContext` to enable extra node
      * modules within your functions.
      * @example
      * ```
      * // functions can now access os via global.get('os')
      * helper.settings({ functionGlobalContext: { os:require('os') } });
      *
      * // reset back to defaults
      * helper.settings({ });
      * ```
      * @param userSettings - an object containing the runtime settings
      * @returns custom userSettings merged with default RED.settings
      */
    def settings(userSettings: PartialLocalSettings): LocalSettings = js.native
    
    /**
      * Starts a Node-RED server for testing nodes that depend on http or web sockets endpoints
      * like the debug node. To start a Node-RED server before all test cases:
      * ```
      * before((done) => {
      *     helper.startServer(done);
      * });
      * ```
      * @param done callback
      */
    def startServer(): Unit = js.native
    def startServer(done: js.Function0[Unit]): Unit = js.native
    
    /**
      * Stop server. Generally called after unload() complete. For example, to unload a flow then
      * stop a server after each test:
      * ```
      * afterEach((done) => {
      *     helper.unload().then(() => {
      *         helper.stopServer(done);
      *     });
      * });
      * ```
      * @param done callback
      */
    def stopServer(): Unit = js.native
    def stopServer(done: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns promise to stop all flows, clean up test runtime.
      */
    def unload(): js.Promise[Unit] = js.native
    
    /**
      * Return the URL of the helper server including the ephemeral port used when starting the server.
      */
    def url(): String = js.native
  }
  @JSImport("node-red-node-test-helper", "NodeTestHelper")
  @js.native
  def NodeTestHelper: Instantiable0[NodeTestHelper] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node-red-node-test-helper", "NodeTestHelper")
  @js.native
  class NodeTestHelperCls () extends NodeTestHelper
  
  @scala.inline
  def NodeTestHelper_=(x: Instantiable0[NodeTestHelper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeTestHelper")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  /**
    * Stop all flows.
    */
  @scala.inline
  def clearFlows(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearFlows")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
  @scala.inline
  def constructor(options: EventEmitterOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def emit(event: String, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def emit(event: js.Symbol, args: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def eventNames(): js.Array[String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNames")().asInstanceOf[js.Array[String | js.Symbol]]
  
  @scala.inline
  def getMaxListeners(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxListeners")().asInstanceOf[Double]
  
  /**
    * Returns a node instance by id in the testFlow. Any node that is defined in testFlows
    * can be retrieved, including any helper node added to the flow.
    * @param id Node id
    */
  @scala.inline
  def getNode(id: String): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(id.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  @scala.inline
  def init(nodeRedRuntime: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(nodeRedRuntime.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def init(nodeRedRuntime: String, userSettings: LocalSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(nodeRedRuntime.asInstanceOf[js.Any], userSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def listenerCount(event: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def listenerCount(event: js.Symbol): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def listeners(event: String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def listeners(event: js.Symbol): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("listeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  
  /**
    * Loads a flow then starts the flow.
    * @param testNode Initializer function of a node to be tested. This node will be
    * registered, and can be used in testFlows.
    * @param testFlows Flow data to test a node. If you want to use flow data exported
    * from Node-RED editor, export the flow to the clipboard and paste the content into
    * your test scripts.
    * @param testCredentials Optional node credentials.
    * @param cb Function to call back when testFlows has been started.
    */
  @scala.inline
  def load(testNode: TestNodeInitializer, testFlows: TestFlows): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(testNode.asInstanceOf[js.Any], testFlows.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(testNode.asInstanceOf[js.Any], testFlows.asInstanceOf[js.Any], testCredentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def load(
    testNode: TestNodeInitializer,
    testFlows: TestFlows,
    testCredentials: js.Object,
    cb: js.Function0[Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(testNode.asInstanceOf[js.Any], testFlows.asInstanceOf[js.Any], testCredentials.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: Unit, cb: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(testNode.asInstanceOf[js.Any], testFlows.asInstanceOf[js.Any], testCredentials.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Return a spy on the logs to look for events from the node under test. For example:
    * ```
    * const logEvents = helper.log().args.filter((evt) => {
    *     return evt[0].type === "batch";
    * });
    * ```
    */
  @scala.inline
  def log(): SinonSpy[js.Array[js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[SinonSpy[js.Array[js.Any], js.Any]]
  
  @scala.inline
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  // Added in Node 6...
  @scala.inline
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("prependOnceListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  @scala.inline
  def rawListeners(event: String): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawListeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def rawListeners(event: js.Symbol): js.Array[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawListeners")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function]]
  
  @scala.inline
  def removeAllListeners(): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[this.type]
  @scala.inline
  def removeAllListeners(event: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[this.type]
  @scala.inline
  def removeAllListeners(event: js.Symbol): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @scala.inline
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  @scala.inline
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  /**
    * Create http (supertest) request to the editor/admin url.
    * @example
    * ```
    * helper.request().post('/inject/invalid').expect(404).end(done);
    * ```
    */
  @scala.inline
  def request(): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[SuperTest[Test]]
  
  @scala.inline
  def setMaxListeners(n: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(n.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  /**
    * Merges any userSettings with the defaults returned by `RED.settings`. Each
    * invocation of this method will overwrite the previous userSettings to prevent
    * unexpected problems in your tests.
    *
    * This will enable you to replicate your production environment within your tests,
    * for example where you're using the `functionGlobalContext` to enable extra node
    * modules within your functions.
    * @example
    * ```
    * // functions can now access os via global.get('os')
    * helper.settings({ functionGlobalContext: { os:require('os') } });
    *
    * // reset back to defaults
    * helper.settings({ });
    * ```
    * @param userSettings - an object containing the runtime settings
    * @returns custom userSettings merged with default RED.settings
    */
  @scala.inline
  def settings(userSettings: PartialLocalSettings): LocalSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(userSettings.asInstanceOf[js.Any]).asInstanceOf[LocalSettings]
  
  /**
    * Starts a Node-RED server for testing nodes that depend on http or web sockets endpoints
    * like the debug node. To start a Node-RED server before all test cases:
    * ```
    * before((done) => {
    *     helper.startServer(done);
    * });
    * ```
    * @param done callback
    */
  @scala.inline
  def startServer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startServer")().asInstanceOf[Unit]
  @scala.inline
  def startServer(done: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startServer")(done.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Stop server. Generally called after unload() complete. For example, to unload a flow then
    * stop a server after each test:
    * ```
    * afterEach((done) => {
    *     helper.unload().then(() => {
    *         helper.stopServer(done);
    *     });
    * });
    * ```
    * @param done callback
    */
  @scala.inline
  def stopServer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopServer")().asInstanceOf[Unit]
  @scala.inline
  def stopServer(done: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopServer")(done.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns promise to stop all flows, clean up test runtime.
    */
  @scala.inline
  def unload(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Return the URL of the helper server including the ephemeral port used when starting the server.
    */
  @scala.inline
  def url(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[String]
  
  type TestCredentials[TCred] = NodeCredentials[TCred]
  
  type TestFlows = js.Array[TestFlowsItemNodeDef]
  
  type TestFlowsItem[TNodeDef /* <: NodeDef */] = Partial[TNodeDef] & Id
  
  type TestNodeInitializer = NodeInitializer[NodeAPISettingsWithData] | js.Array[NodeInitializer[NodeAPISettingsWithData]]
}
