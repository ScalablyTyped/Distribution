package typings.openui5.sapNs.uiNs.testNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.Opa")
@js.native
class Opa protected () extends js.Object {
  /**
    * This class will help you write acceptance tests in one page or single page applications.You can wait
    * for certain conditions to be met.
    * @param extensionObject An object containing properties and functions. The newly created Opa will be
    * extended by these properties and functions using jQuery.extend.
    */
  def this(extensionObject: js.Any) = this()
  /**
    * the global configuration of Opa.All of the global values can be overwritten in an individual waitFor
    * call.The default values are:<ul>		<li>arrangements: A new Opa instance</li>		<li>actions: A new Opa
    * instance</li>		<li>assertions: A new Opa instance</li>		<li>timeout : 15 seconds, is increased to 5
    * minutes if running in debug mode e.g. with URL parameter sap-ui-debug=true</li>	
    * <li>pollingInterval: 400 milliseconds</li></ul>You can either directly manipulate the config, or
    * extend it using {@link sap.ui.test.Opa#.extendConfig}
    */
  var config: js.Any = js.native
  /**
    * Calls the static emptyQueue function in the Opa namespace {@link sap.ui.test.Opa#.emptyQueue}
    */
  def emptyQueue(): Unit = js.native
  /**
    * Waits until all waitFor calls are done.
    * @returns If the waiting was successful, the promise will be resolved. If not it will be rejected
    */
  @JSName("emptyQueue")
  def emptyQueue_Any(): js.Any = js.native
  /**
    * Calls the static extendConfig function in the Opa namespace {@link sap.ui.test.Opa#.extendConfig}
    */
  def extendConfig(): Unit = js.native
  /**
    * Extends and overwrites default values of the {@link sap.ui.test.Opa#.config}.Sample usage:<pre>   
    * <code>        var oOpa = new Opa();        // this statement will  will time out after 15 seconds
    * and poll every 400ms.        // those two values come from the defaults of {@link
    * sap.ui.test.Opa#.config}.        oOpa.waitFor({        });        // All wait for statements added
    * after this will take other defaults        Opa.extendConfig({            timeout: 10,           
    * pollingInterval: 100        });        // this statement will time out after 10 seconds and poll
    * every 100 ms        oOpa.waitFor({        });        // this statement will time out after 20
    * seconds and poll every 100 ms        oOpa.waitFor({            timeout: 20;        });   
    * </code></pre>
    * @since 1.40
    * @param options The values to be added to the existing config
    */
  def extendConfig(options: js.Any): Unit = js.native
  /**
    * Gives access to a singleton object you can save values in.This object will only be created once and
    * it will never be destroyed.That means you can use it to save values you need in multiple separated
    * tests.
    * @returns the context object
    */
  def getContext(): js.Any = js.native
  /**
    * Reset Opa.config to its default values.All of the global values can be overwritten in an individual
    * waitFor call.The default values are:<ul>		<li>arrangements: A new Opa instance</li>		<li>actions: A
    * new Opa instance</li>		<li>assertions: A new Opa instance</li>		<li>timeout : 15 seconds, is
    * increased to 5 minutes if running in debug mode e.g. with URL parameter sap-ui-debug=true</li>	
    * <li>pollingInterval: 400 milliseconds</li></ul>
    * @since 1.25
    */
  def resetConfig(): Unit = js.native
  /**
    * Clears the queue and stops running tests so that new tests can be run.This means all waitFor
    * statements registered by {@link sap.ui.test.Opa#waitFor} will not be invoked anymore andthe promise
    * returned by {@link sap.ui.test.Opa#.emptyQueue}will be rejected or resolved depending on the
    * failTest parameter.When its called inside of a check in {@link sap.ui.test.Opa#waitFor}the success
    * function of this waitFor will not be called.
    * @since 1.40.1
    * @param boolean failTest If true is passed or the parameter is omited,the promise of {@link
    * sap.ui.test.Opa#.emptyQueue} is rejected. If false is passed the promis is resolved.
    */
  def stopQueue(boolean: js.Any): Unit = js.native
  /**
    * Queues up a waitFor command for Opa.The Queue will not be emptied until {@link
    * sap.ui.test.Opa#.emptyQueue} is called.If you are using {@link sap.ui.test.opaQunit}, emptyQueue
    * will be called by the wrapped tests.If you are using Opa5, waitFor takes additional parameters.They
    * can be found here: {@link sap.ui.test.Opa5#waitFor}.Waits for a check condition to return true, in
    * which case a success function will be called.If the timeout is reached before the check returns
    * true, an error function will be called.
    * @param options These contain check, success and error functions
    * @returns A promise that gets resolved on success
    */
  def waitFor(options: js.Any): js.Any = js.native
}

