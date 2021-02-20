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
import scala.scalajs.js.`|`
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
    def load(
      testNode: TestNodeInitializer,
      testFlows: TestFlows,
      testCredentials: js.UndefOr[scala.Nothing],
      cb: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: js.Object): js.Promise[Unit] = js.native
    def load(
      testNode: TestNodeInitializer,
      testFlows: TestFlows,
      testCredentials: js.Object,
      cb: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    
    /**
      * Return a spy on the logs to look for events from the node under test. For example:
      * ```
      * const logEvents = helper.log().args.filter((evt) => {
      *     return evt[0].type === "batch";
      * });
      * ```
      */
    def log(): SinonSpy[js.Array[_], _] = js.native
    
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
  
  @JSImport("node-red-node-test-helper", "addListener")
  @js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("node-red-node-test-helper", "addListener")
  @js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  /**
    * Stop all flows.
    */
  @JSImport("node-red-node-test-helper", "clearFlows")
  @js.native
  def clearFlows(): js.Promise[Unit] = js.native
  
  @JSImport("node-red-node-test-helper", "constructor")
  @js.native
  def constructor(): js.Any = js.native
  @JSImport("node-red-node-test-helper", "constructor")
  @js.native
  def constructor(options: EventEmitterOptions): js.Any = js.native
  
  @JSImport("node-red-node-test-helper", "emit")
  @js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  @JSImport("node-red-node-test-helper", "emit")
  @js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  
  @JSImport("node-red-node-test-helper", "eventNames")
  @js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  
  @JSImport("node-red-node-test-helper", "getMaxListeners")
  @js.native
  def getMaxListeners(): Double = js.native
  
  /**
    * Returns a node instance by id in the testFlow. Any node that is defined in testFlows
    * can be retrieved, including any helper node added to the flow.
    * @param id Node id
    */
  @JSImport("node-red-node-test-helper", "getNode")
  @js.native
  def getNode(id: String): Node = js.native
  
  @JSImport("node-red-node-test-helper", "init")
  @js.native
  def init(nodeRedRuntime: String): Unit = js.native
  @JSImport("node-red-node-test-helper", "init")
  @js.native
  def init(nodeRedRuntime: String, userSettings: LocalSettings): Unit = js.native
  
  @JSImport("node-red-node-test-helper", "listenerCount")
  @js.native
  def listenerCount(event: String): Double = js.native
  @JSImport("node-red-node-test-helper", "listenerCount")
  @js.native
  def listenerCount(event: js.Symbol): Double = js.native
  
  @JSImport("node-red-node-test-helper", "listeners")
  @js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  @JSImport("node-red-node-test-helper", "listeners")
  @js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  
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
  @JSImport("node-red-node-test-helper", "load")
  @js.native
  def load(testNode: TestNodeInitializer, testFlows: TestFlows): js.Promise[Unit] = js.native
  @JSImport("node-red-node-test-helper", "load")
  @js.native
  def load(
    testNode: TestNodeInitializer,
    testFlows: TestFlows,
    testCredentials: js.UndefOr[scala.Nothing],
    cb: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("node-red-node-test-helper", "load")
  @js.native
  def load(testNode: TestNodeInitializer, testFlows: TestFlows, testCredentials: js.Object): js.Promise[Unit] = js.native
  @JSImport("node-red-node-test-helper", "load")
  @js.native
  def load(
    testNode: TestNodeInitializer,
    testFlows: TestFlows,
    testCredentials: js.Object,
    cb: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  
  /**
    * Return a spy on the logs to look for events from the node under test. For example:
    * ```
    * const logEvents = helper.log().args.filter((evt) => {
    *     return evt[0].type === "batch";
    * });
    * ```
    */
  @JSImport("node-red-node-test-helper", "log")
  @js.native
  def log(): SinonSpy[js.Array[_], _] = js.native
  
  @JSImport("node-red-node-test-helper", "off")
  @js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("node-red-node-test-helper", "off")
  @js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  @JSImport("node-red-node-test-helper", "on")
  @js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("node-red-node-test-helper", "on")
  @js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  @JSImport("node-red-node-test-helper", "once")
  @js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("node-red-node-test-helper", "once")
  @js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  // Added in Node 6...
  @JSImport("node-red-node-test-helper", "prependListener")
  @js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("node-red-node-test-helper", "prependListener")
  @js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  @JSImport("node-red-node-test-helper", "prependOnceListener")
  @js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("node-red-node-test-helper", "prependOnceListener")
  @js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  @JSImport("node-red-node-test-helper", "rawListeners")
  @js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  @JSImport("node-red-node-test-helper", "rawListeners")
  @js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  
  @JSImport("node-red-node-test-helper", "removeAllListeners")
  @js.native
  def removeAllListeners(): this.type = js.native
  @JSImport("node-red-node-test-helper", "removeAllListeners")
  @js.native
  def removeAllListeners(event: String): this.type = js.native
  @JSImport("node-red-node-test-helper", "removeAllListeners")
  @js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  
  @JSImport("node-red-node-test-helper", "removeListener")
  @js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSImport("node-red-node-test-helper", "removeListener")
  @js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  
  /**
    * Create http (supertest) request to the editor/admin url.
    * @example
    * ```
    * helper.request().post('/inject/invalid').expect(404).end(done);
    * ```
    */
  @JSImport("node-red-node-test-helper", "request")
  @js.native
  def request(): SuperTest[Test] = js.native
  
  @JSImport("node-red-node-test-helper", "setMaxListeners")
  @js.native
  def setMaxListeners(n: Double): this.type = js.native
  
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
  @JSImport("node-red-node-test-helper", "settings")
  @js.native
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
  @JSImport("node-red-node-test-helper", "startServer")
  @js.native
  def startServer(): Unit = js.native
  @JSImport("node-red-node-test-helper", "startServer")
  @js.native
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
  @JSImport("node-red-node-test-helper", "stopServer")
  @js.native
  def stopServer(): Unit = js.native
  @JSImport("node-red-node-test-helper", "stopServer")
  @js.native
  def stopServer(done: js.Function0[Unit]): Unit = js.native
  
  /**
    * Returns promise to stop all flows, clean up test runtime.
    */
  @JSImport("node-red-node-test-helper", "unload")
  @js.native
  def unload(): js.Promise[Unit] = js.native
  
  /**
    * Return the URL of the helper server including the ephemeral port used when starting the server.
    */
  @JSImport("node-red-node-test-helper", "url")
  @js.native
  def url(): String = js.native
  
  type TestCredentials[TCred] = NodeCredentials[TCred]
  
  type TestFlows = js.Array[TestFlowsItemNodeDef]
  
  type TestFlowsItem[TNodeDef /* <: NodeDef */] = Partial[TNodeDef] with Id
  
  type TestNodeInitializer = NodeInitializer[NodeAPISettingsWithData] | js.Array[NodeInitializer[NodeAPISettingsWithData]]
}
