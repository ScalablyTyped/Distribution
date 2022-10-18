package typings.openui5

import typings.openui5.QUnit.Assert
import typings.openui5.anon.AsyncPolling
import typings.openui5.jQuery.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestOpaMod {
  
  @JSImport("sap/ui/test/Opa", JSImport.Default)
  @js.native
  /**
    * This class will help you write acceptance tests in one page or single page applications. You can wait
    * for certain conditions to be met.
    */
  open class default ()
    extends StObject
       with Opa {
    def this(/**
      * An object containing properties and functions. The newly created Opa will be extended by these properties
      * and functions using jQuery.extend.
      */
    extensionObject: js.Object) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/Opa", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A map of QUnit-style assertions to be used in an opaTest. Contains all methods available on QUnit.assert
      * for the running QUnit version. Available assertions are: ok, equal, propEqual, deepEqual, strictEqual
      * and their negative counterparts.
      *
      * For more information, see {@link module:sap/ui/test/opaQunit}.
      */
    @JSImport("sap/ui/test/Opa", "default.assert")
    @js.native
    def assert: Assert = js.native
    inline def assert_=(x: Assert): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assert")(x.asInstanceOf[js.Any])
    
    /**
      * The global configuration of Opa. All of the global values can be overwritten in an individual `waitFor`
      * call. The default values are:
      * 	 - arrangements: A new Opa instance
      * 	 - actions: A new Opa instance
      * 	 - assertions: A new Opa instance
      * 	 - timeout : 15 seconds, 0 for infinite timeout
      * 	 - pollingInterval: 400 milliseconds
      * 	 - debugTimeout: 0 seconds, infinite timeout by default. This will be used instead of timeout if running
      * 			in debug mode.
      * 	 - asyncPolling: false  You can either directly manipulate the config, or extend it using {@link
      * 			sap.ui.test.Opa.extendConfig}.
      */
    @JSImport("sap/ui/test/Opa", "default.config")
    @js.native
    def config: /* undefined */ Any = js.native
    inline def config_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
    
    /**
      * Waits until all waitFor calls are done.
      *
      * @returns If the waiting was successful, the promise will be resolved. If not it will be rejected
      */
    inline def emptyQueue(): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyQueue")().asInstanceOf[Promise[Any]]
    
    /**
      * @SINCE 1.48
      *
      * Extends and overwrites default values of the {@link sap.ui.test.Opa sap.ui.test.Opa.config} field. Sample
      * usage:
      * ```javascript
      *
      *
      *         var oOpa = new Opa();
      *
      *         // this statement will time out after 15 seconds and poll every 400ms
      *         // those two values come from the defaults of sap.ui.test.Opa.config
      *         oOpa.waitFor({
      *         });
      *
      *         // All wait for statements added after this will take other defaults
      *         Opa.extendConfig({
      *             timeout: 10,
      *             pollingInterval: 100
      *         });
      *
      *         // this statement will time out after 10 seconds and poll every 100 ms
      *         oOpa.waitFor({
      *         });
      *
      *         // this statement will time out after 20 seconds and poll every 100 ms
      *         oOpa.waitFor({
      *             timeout: 20;
      *         });
      *
      * ```
      */
    inline def extendConfig(/**
      * The values to be added to the existing config
      */
    options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @SINCE 1.29.0
      *
      * Gives access to a singleton object you can save values in. Same as {@link sap.ui.test.Opa#getContext}
      *
      * @returns the context object
      */
    inline def getContext(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[js.Object]
    
    /**
      * @SINCE 1.25
      *
      * Reset Opa.config to its default values. All of the global values can be overwritten in an individual
      * waitFor call.
      *
      * The default values are:
      * 	 - arrangements: A new Opa instance
      * 	 - actions: A new Opa instance
      * 	 - assertions: A new Opa instance
      * 	 - timeout : 15 seconds, 0 for infinite timeout
      * 	 - pollingInterval: 400 milliseconds
      * 	 - debugTimeout: 0 seconds, infinite timeout by default. This will be used instead of timeout if running
      * 			in debug mode.
      * 	 -  executionDelay: 0 or 50 (depending on the browser). The value is a number representing milliseconds.
      * 			The executionDelay will slow down the execution of every single waitFor statement to be delayed by the
      * 			number of milliseconds. This does not effect the polling interval it just adds an initial pause. Use
      * 			this parameter to slow down OPA when you want to watch your test during development or checking the UI
      * 			of your app. It is not recommended to use this parameter in any automated test executions.
      * 	 - asyncPolling: false
      */
    inline def resetConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfig")().asInstanceOf[Unit]
    
    /**
      * @SINCE 1.40.1
      *
      * Clears the queue and stops running tests so that new tests can be run. This means all waitFor statements
      * registered by {@link sap.ui.test.Opa#waitFor} will not be invoked anymore and the promise returned by
      * {@link sap.ui.test.Opa.emptyQueue} will be rejected When it is called inside of a check in {@link sap.ui.test.Opa#waitFor}
      * the success function of this waitFor will not be called.
      */
    inline def stopQueue(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopQueue")().asInstanceOf[Unit]
  }
  
  @js.native
  trait Opa extends StObject {
    
    /**
      * Calls the static emptyQueue function in the Opa namespace {@link sap.ui.test.Opa.emptyQueue}
      */
    def emptyQueue(): Unit = js.native
    
    /**
      * Calls the static extendConfig function in the Opa namespace {@link sap.ui.test.Opa.extendConfig}
      */
    def extendConfig(): Unit = js.native
    
    /**
      * Gives access to a singleton object you can save values in. This object will only be created once and
      * it will never be destroyed. That means you can use it to save values you need in multiple separated tests.
      *
      * @returns the context object
      */
    def getContext(): js.Object = js.native
    
    def iWaitForPromise(/**
      * promise to schedule on the OPA queue
      */
    oPromise: js.Promise[Any]): Promise[Any] = js.native
    /**
      * Schedule a promise on the OPA queue.The promise will be executed in order with all waitFors - any subsequent
      * waitFor will be executed after the promise is done. The promise is not directly chained, but instead
      * its result is awaited in a new waitFor statement. This means that any "thenable" should be acceptable.
      *
      * @returns promise which is the result of a {@link sap.ui.test.Opa#waitFor}
      */
    def iWaitForPromise(/**
      * promise to schedule on the OPA queue
      */
    oPromise: Promise[Any]): Promise[Any] = js.native
    
    /**
      * Queues up a waitFor command for Opa. The Queue will not be emptied until {@link sap.ui.test.Opa.emptyQueue}
      * is called. If you are using {@link module:sap/ui/test/opaQunit}, emptyQueue will be called by the wrapped
      * tests.
      *
      * If you are using Opa5, waitFor takes additional parameters. They can be found here: {@link sap.ui.test.Opa5#waitFor}.
      * Waits for a check condition to return true, in which case a success function will be called. If the timeout
      * is reached before the check returns true, an error function will be called.
      *
      * @returns an object extending a jQuery promise. The object is essentially a jQuery promise with an additional
      * "and" method that can be used for chaining waitFor statements. The promise is resolved when the waitFor
      * completes successfully. The promise is rejected with the options object, if an error occurs. In this
      * case, options.errorMessage will contain a detailed error message containing the stack trace and Opa logs.
      */
    def waitFor(/**
      * These contain check, success and error functions
      */
    options: AsyncPolling): js.Object = js.native
  }
}
