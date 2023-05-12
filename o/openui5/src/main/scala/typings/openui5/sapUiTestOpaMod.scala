package typings.openui5

import typings.openui5.QUnit.Assert
import typings.openui5.jQuery.Promise
import typings.std.Record
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
      * The global configuration of Opa. The subset of the global values defined in {@link sap.ui.test.Opa.BaseParameters}.can
      * be overwritten in an individual `waitFor` call. The default values for the global configuration are:
      *
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
    def config: Config = js.native
    inline def config_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
    
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
    options: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @SINCE 1.29.0
      *
      * Gives access to a singleton object you can save values in. Same as {@link sap.ui.test.Opa#getContext}
      *
      * @returns the context object
      */
    inline def getContext(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[Record[String, Any]]
    
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
  
  trait BaseParameters extends StObject {
    
    /**
      * @since 1.55 Enable asynchronous polling after success() call. This allows more stable autoWaiter synchronization
      * with event flows originating from within success(). Especially useful to stabilize synchronization with
      * overflow toolbars. False by default.
      */
    var asyncPolling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (seconds) @since 1.47 Specifies how long the waitFor function polls before it fails in debug mode. 0
      * means it will wait forever.
      */
    var debugTimeout: js.UndefOr[int] = js.undefined
    
    /**
      * (milliseconds) Specifies how often the waitFor function polls. The default is 400ms.
      */
    var pollingInterval: js.UndefOr[int] = js.undefined
    
    /**
      * (seconds) Specifies how long the waitFor function polls before it fails. The default value is 15 seconds,
      * 0 means it will wait forever.
      */
    var timeout: js.UndefOr[int] = js.undefined
  }
  object BaseParameters {
    
    inline def apply(): BaseParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseParameters] (val x: Self) extends AnyVal {
      
      inline def setAsyncPolling(value: Boolean): Self = StObject.set(x, "asyncPolling", value.asInstanceOf[js.Any])
      
      inline def setAsyncPollingUndefined: Self = StObject.set(x, "asyncPolling", js.undefined)
      
      inline def setDebugTimeout(value: int): Self = StObject.set(x, "debugTimeout", value.asInstanceOf[js.Any])
      
      inline def setDebugTimeoutUndefined: Self = StObject.set(x, "debugTimeout", js.undefined)
      
      inline def setPollingInterval(value: int): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      inline def setTimeout(value: int): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Chain
    extends StObject
       with Opa {
    
    /**
      * A reference to the same `sap.ui.test.Opa` instance that can be used for chaining statements
      */
    var and: Opa = js.native
  }
  
  trait Config
    extends StObject
       with BaseParameters {
    
    /**
      * A new Opa instance
      */
    var actions: js.UndefOr[Opa] = js.undefined
    
    /**
      * A new Opa instance
      */
    var arrangements: js.UndefOr[Opa] = js.undefined
    
    /**
      * A new Opa instance
      */
    var assertions: js.UndefOr[Opa] = js.undefined
    
    /**
      * The value is a number representing milliseconds. The default values are 0 or 50 (depending on the browser).
      * The executionDelay will slow down the execution of every single waitFor statement to be delayed by the
      * number of milliseconds. This does not effect the polling interval it just adds an initial pause. Use
      * this parameter to slow down OPA when you want to watch your test during development or checking the UI
      * of your app. It is not recommended to use this parameter in any automated test executions.
      */
    var executionDelay: js.UndefOr[int] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Opa): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setArrangements(value: Opa): Self = StObject.set(x, "arrangements", value.asInstanceOf[js.Any])
      
      inline def setArrangementsUndefined: Self = StObject.set(x, "arrangements", js.undefined)
      
      inline def setAssertions(value: Opa): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
      
      inline def setExecutionDelay(value: int): Self = StObject.set(x, "executionDelay", value.asInstanceOf[js.Any])
      
      inline def setExecutionDelayUndefined: Self = StObject.set(x, "executionDelay", js.undefined)
    }
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
      * configuration options
      */
    options: WaitForOptions): Chain = js.native
  }
  
  trait WaitForOptions
    extends StObject
       with BaseParameters {
    
    /**
      * Will get invoked in every polling interval. If it returns true, the check is successful and the polling
      * will stop. The first parameter passed into the function is the same value that gets passed to the success
      * function. Returning something other than boolean in the check will not change the first parameter of
      * success.
      */
    var check: js.UndefOr[js.Function1[/* p1 */ Any, Boolean]] = js.undefined
    
    /**
      * Will be displayed as an errorMessage depending on your unit test framework. Currently the only adapter
      * for Opa is QUnit. This message is displayed there if Opa has reached its timeout but QUnit has not yet
      * reached it.
      */
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Will get invoked after the check function returns true. If there is no check function defined, it will
      * be directly invoked. waitFor statements added in the success handler will be executed before previously
      * added waitFor statements.
      */
    var success: js.UndefOr[js.Function] = js.undefined
  }
  object WaitForOptions {
    
    inline def apply(): WaitForOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitForOptions] (val x: Self) extends AnyVal {
      
      inline def setCheck(value: /* p1 */ Any => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
