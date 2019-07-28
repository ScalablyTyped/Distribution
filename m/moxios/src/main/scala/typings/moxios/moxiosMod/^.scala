package typings.moxios.moxiosMod

import typings.axios.axiosMod.AxiosInstance
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moxios", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var delay: Double = js.native
  var requests: Tracker = js.native
  var stubs: Tracker = js.native
  var timeoutException: Error = js.native
  /**
    * Install the mock adapter for axios
    */
  def install(): Unit = js.native
  def install(instance: AxiosInstance): Unit = js.native
  /**
    * Stub a timed response to a request matching a method and a URL or RegExp. If
    * timer fires, reject with a TimeoutException for simple assertions. The goal is
    * to show that a certain request was not made.
    *
    * @param method An axios command
    * @param urlOrRegExp A URL or RegExp to test against
    * @param response The response to use when a match is made
    */
  def stubFailure(method: String, urlOrRegExp: String, response: Item): js.Promise[Unit] = js.native
  def stubFailure(method: String, urlOrRegExp: RegExp, response: Item): js.Promise[Unit] = js.native
  /**
    * Stub a response to be used one or more times to respond to a request matching a
    * method and a URL or RegExp.
    *
    * @param method An axios command
    * @param urlOrRegExp A URL or RegExp to test against
    * @param response The response to use when a match is made
    */
  def stubOnce(method: String, urlOrRegExp: String, response: Item): js.Promise[Unit] = js.native
  def stubOnce(method: String, urlOrRegExp: RegExp, response: Item): js.Promise[Unit] = js.native
  /**
    * Stub a response to be used to respond to a request matching a URL or RegExp
    *
    * @param urlOrRegExp A URL or RegExp to test against
    * @param response The response to use when a match is made
    */
  def stubRequest(urlOrRegExp: String, response: Item): Unit = js.native
  def stubRequest(urlOrRegExp: RegExp, response: Item): Unit = js.native
  /**
    * Stub a timeout to be used to respond to a request matching a URL or RegExp
    *
    * @param urlOrRegExp A URL or RegExp to test against
    */
  def stubTimeout(urlOrRegExp: String): String = js.native
  def stubTimeout(urlOrRegExp: RegExp): String = js.native
  /**
    * Uninstall the mock adapter and reset state
    */
  def uninstall(): Unit = js.native
  def uninstall(instance: AxiosInstance): Unit = js.native
  /**
    * Wait for request to be made before proceding.
    * This is naively using a `setTimeout`.
    * May need to beef this up a bit in the future.
    *
    * @param fn The function to execute once waiting is over
    * @param delay How much time in milliseconds to wait
    */
  def wait(fn: js.Function0[Unit]): Unit = js.native
  def wait(fn: js.Function0[Unit], delay: Double): Unit = js.native
  /**
    * Run a single test with mock adapter installed.
    * This will install the mock adapter, execute the function provided,
    * then uninstall the mock adapter once complete.
    *
    * @param fn The function to be executed
    */
  def withMock(fn: js.Function0[Unit]): Unit = js.native
}

