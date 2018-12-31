package typings
package mochaLib.libInterfacesCommonMod.commonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonFunctions extends js.Object {
  var suite: SuiteFunctions = js.native
  var test: TestFunctions = js.native
  /**
    * Execute after running tests.
    */
  def after(): scala.Unit = js.native
  def after(fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def after(fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * Execute after running tests.
    */
  def after(name: java.lang.String): scala.Unit = js.native
  def after(name: java.lang.String, fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def after(name: java.lang.String, fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * Execute after each test case.
    */
  def afterEach(): scala.Unit = js.native
  def afterEach(fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def afterEach(fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * Execute after each test case.
    */
  def afterEach(name: java.lang.String): scala.Unit = js.native
  def afterEach(name: java.lang.String, fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def afterEach(name: java.lang.String, fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * Execute before running tests.
    */
  def before(): scala.Unit = js.native
  def before(fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def before(fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * Execute before running tests.
    */
  def before(name: java.lang.String): scala.Unit = js.native
  def before(name: java.lang.String, fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def before(name: java.lang.String, fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * Execute before each test case.
    */
  def beforeEach(): scala.Unit = js.native
  def beforeEach(fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def beforeEach(fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * Execute before each test case.
    */
  def beforeEach(name: java.lang.String): scala.Unit = js.native
  def beforeEach(name: java.lang.String, fn: mochaLib.MochaNs.AsyncFunc): scala.Unit = js.native
  def beforeEach(name: java.lang.String, fn: mochaLib.MochaNs.Func): scala.Unit = js.native
  /**
    * This is only present if flag --delay is passed into Mocha. It triggers
    * root suite execution.
    */
  def runWithSuite(suite: mochaLib.MochaNs.Suite): js.Function0[scala.Unit] = js.native
}

