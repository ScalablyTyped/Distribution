package typings
package moxiosLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Delay extends js.Object {
  var delay: scala.Double = js.native
  var requests: moxiosLib.moxiosMod.Tracker = js.native
  var stubs: moxiosLib.moxiosMod.Tracker = js.native
  var timeoutException: stdLib.Error = js.native
  /**
       * Install the mock adapter for axios
       */
  def install(): scala.Unit = js.native
  /**
       * Install the mock adapter for axios
       */
  def install(instance: axiosLib.axiosMod.AxiosInstance): scala.Unit = js.native
  /**
       * Stub a timed response to a request matching a method and a URL or RegExp. If
       * timer fires, reject with a TimeoutException for simple assertions. The goal is
       * to show that a certain request was not made.
       *
       * @param method An axios command
       * @param urlOrRegExp A URL or RegExp to test against
       * @param response The response to use when a match is made
       */
  def stubFailure(method: java.lang.String, urlOrRegExp: java.lang.String, response: moxiosLib.moxiosMod.Item): stdLib.Promise[scala.Unit] = js.native
  /**
       * Stub a timed response to a request matching a method and a URL or RegExp. If
       * timer fires, reject with a TimeoutException for simple assertions. The goal is
       * to show that a certain request was not made.
       *
       * @param method An axios command
       * @param urlOrRegExp A URL or RegExp to test against
       * @param response The response to use when a match is made
       */
  def stubFailure(method: java.lang.String, urlOrRegExp: stdLib.RegExp, response: moxiosLib.moxiosMod.Item): stdLib.Promise[scala.Unit] = js.native
  /**
       * Stub a response to be used one or more times to respond to a request matching a
       * method and a URL or RegExp.
       *
       * @param method An axios command
       * @param urlOrRegExp A URL or RegExp to test against
       * @param response The response to use when a match is made
       */
  def stubOnce(method: java.lang.String, urlOrRegExp: java.lang.String, response: moxiosLib.moxiosMod.Item): stdLib.Promise[scala.Unit] = js.native
  /**
       * Stub a response to be used one or more times to respond to a request matching a
       * method and a URL or RegExp.
       *
       * @param method An axios command
       * @param urlOrRegExp A URL or RegExp to test against
       * @param response The response to use when a match is made
       */
  def stubOnce(method: java.lang.String, urlOrRegExp: stdLib.RegExp, response: moxiosLib.moxiosMod.Item): stdLib.Promise[scala.Unit] = js.native
  /**
       * Stub a response to be used to respond to a request matching a URL or RegExp
       *
       * @param urlOrRegExp A URL or RegExp to test against
       * @param response The response to use when a match is made
       */
  def stubRequest(urlOrRegExp: java.lang.String, response: moxiosLib.moxiosMod.Item): scala.Unit = js.native
  /**
       * Stub a response to be used to respond to a request matching a URL or RegExp
       *
       * @param urlOrRegExp A URL or RegExp to test against
       * @param response The response to use when a match is made
       */
  def stubRequest(urlOrRegExp: stdLib.RegExp, response: moxiosLib.moxiosMod.Item): scala.Unit = js.native
  /**
       * Stub a timeout to be used to respond to a request matching a URL or RegExp
       *
       * @param urlOrRegExp A URL or RegExp to test against
       */
  def stubTimeout(urlOrRegExp: java.lang.String): java.lang.String = js.native
  /**
       * Stub a timeout to be used to respond to a request matching a URL or RegExp
       *
       * @param urlOrRegExp A URL or RegExp to test against
       */
  def stubTimeout(urlOrRegExp: stdLib.RegExp): java.lang.String = js.native
  /**
       * Uninstall the mock adapter and reset state
       */
  def uninstall(): scala.Unit = js.native
  /**
       * Uninstall the mock adapter and reset state
       */
  def uninstall(instance: axiosLib.axiosMod.AxiosInstance): scala.Unit = js.native
  /**
       * Wait for request to be made before proceding.
       * This is naively using a `setTimeout`.
       * May need to beef this up a bit in the future.
       *
       * @param fn The function to execute once waiting is over
       * @param delay How much time in milliseconds to wait
       */
  def wait(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Wait for request to be made before proceding.
       * This is naively using a `setTimeout`.
       * May need to beef this up a bit in the future.
       *
       * @param fn The function to execute once waiting is over
       * @param delay How much time in milliseconds to wait
       */
  def wait(fn: js.Function0[scala.Unit], delay: scala.Double): scala.Unit = js.native
  /**
       * Run a single test with mock adapter installed.
       * This will install the mock adapter, execute the function provided,
       * then uninstall the mock adapter once complete.
       *
       * @param fn The function to be executed
       */
  def withMock(fn: js.Function0[scala.Unit]): scala.Unit = js.native
}

