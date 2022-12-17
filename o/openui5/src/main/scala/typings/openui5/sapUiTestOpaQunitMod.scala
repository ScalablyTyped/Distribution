package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestOpaQunitMod {
  
  @JSImport("sap/ui/test/opaQunit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * name of the QUnit test.
    */
  testName: String,
    /**
    * the test function. Expects 3 arguments, in order: {@link sap.ui.test.Opa.config}.arrangements, {@link
    * sap.ui.test.Opa.config}.actions, {@link sap.ui.test.Opa.config}.assertions. These arguments will be prefilled
    * by OPA
    */
  callback: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(testName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    /**
    * name of the QUnit test.
    */
  testName: String,
    /**
    * the test function. Expects 3 arguments, in order: {@link sap.ui.test.Opa.config}.arrangements, {@link
    * sap.ui.test.Opa.config}.actions, {@link sap.ui.test.Opa.config}.assertions. These arguments will be prefilled
    * by OPA
    */
  callback: js.Function,
    /**
    * available only in QUnit v1.x. Indicates whether the test is asynchronous. False by default.
    */
  async: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(testName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    /**
    * name of the QUnit test.
    */
  testName: String,
    /**
    * only supported in QUnit v1.x: denotes how many assertions are expected to be made in the test.
    */
  expected: int,
    /**
    * the test function. Expects 3 arguments, in order: {@link sap.ui.test.Opa.config}.arrangements, {@link
    * sap.ui.test.Opa.config}.actions, {@link sap.ui.test.Opa.config}.assertions. These arguments will be prefilled
    * by OPA
    */
  callback: js.Function
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(testName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    /**
    * name of the QUnit test.
    */
  testName: String,
    /**
    * only supported in QUnit v1.x: denotes how many assertions are expected to be made in the test.
    */
  expected: int,
    /**
    * the test function. Expects 3 arguments, in order: {@link sap.ui.test.Opa.config}.arrangements, {@link
    * sap.ui.test.Opa.config}.actions, {@link sap.ui.test.Opa.config}.assertions. These arguments will be prefilled
    * by OPA
    */
  callback: js.Function,
    /**
    * available only in QUnit v1.x. Indicates whether the test is asynchronous. False by default.
    */
  async: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(testName.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], async.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
