package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionThrownEvent
import typings.nightwatch.anon.Accuracy
import typings.nightwatch.anon.Body
import typings.nightwatch.anon.DeviceScaleFactor
import typings.nightwatch.anon.PickConsoleAPICalledEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromiumClientCommands extends StObject {
  
  /**
    * Listen to the `console` events (ex. `console.log` event) and
    * register callback to process the same.
    *
    * @example
    *  describe('capture console events', function() {
    *    it('captures and logs console.log event', function() {
    *      browser
    *        .captureBrowserConsoleLogs((event) => {
    *          console.log(event.type, event.timestamp, event.args[0].value);
    *        })
    *        .navigateTo('https://www.google.com')
    *        .executeScript(function() {
    *          console.log('here');
    *        }, []);
    *    });
    *  });
    *
    * @see https://nightwatchjs.org/guide/running-tests/capture-console-messages.html
    */
  def captureBrowserConsoleLogs(onEventCallback: js.Function1[/* event */ PickConsoleAPICalledEvent, Unit]): Awaitable[this.type, Null] = js.native
  def captureBrowserConsoleLogs(
    onEventCallback: js.Function1[/* event */ PickConsoleAPICalledEvent, Unit],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Catch the JavaScript exceptions thrown in the browser.
    *
    * @example
    *  describe('catch browser exceptions', function() {
    *    it('captures the js exceptions thrown in the browser', async function() {
    *      await browser.captureBrowserExceptions((event) => {
    *        console.log('>>> Exception:', event);
    *      });
    *
    *      await browser.navigateTo('https://duckduckgo.com/');
    *
    *      const searchBoxElement = await browser.findElement('input[name=q]');
    *      await browser.executeScript(function(_searchBoxElement) {
    *        _searchBoxElement.setAttribute('onclick', 'throw new Error("Hello world!")');
    *      }, [searchBoxElement]);
    *
    *      await browser.elementIdClick(searchBoxElement.getId());
    *    });
    *  });
    *
    * @see https://nightwatchjs.org/guide/running-tests/catch-js-exceptions.html
    */
  def captureBrowserExceptions(onExceptionCallback: js.Function1[/* event */ ExceptionThrownEvent, Unit]): Awaitable[this.type, Null] = js.native
  def captureBrowserExceptions(
    onExceptionCallback: js.Function1[/* event */ ExceptionThrownEvent, Unit],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Capture outgoing network calls from the browser.
    *
    * @example
    *  describe('capture network requests', function() {
    *    it('captures and logs network requests as they occur', function(this: ExtendDescribeThis<{requestCount: number}>) {
    *      this.requestCount = 1;
    *      browser
    *        .captureNetworkRequests((requestParams) => {
    *          console.log('Request Number:', this.requestCount!++);
    *          console.log('Request URL:', requestParams.request.url);
    *          console.log('Request method:', requestParams.request.method);
    *          console.log('Request headers:', requestParams.request.headers);
    *        })
    *        .navigateTo('https://www.google.com');
    *    });
    *  });
    *
    * @see https://nightwatchjs.org/guide/network-requests/capture-network-calls.html
    */
  def captureNetworkRequests(onRequestCallback: js.Function1[/* requestParams */ RequestWillBeSentEvent, Unit]): Awaitable[this.type, Null] = js.native
  def captureNetworkRequests(
    onRequestCallback: js.Function1[/* requestParams */ RequestWillBeSentEvent, Unit],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Enable/disable the collection of performance metrics in the browser. Metrics
    * collection only begin after this command is called.
    *
    * @example
    *  describe('collect performance metrics', function() {
    *    it('enables the metrics collection, does some stuff and collects the metrics', function() {
    *      browser
    *        .enablePerformanceMetrics()
    *        .navigateTo('https://www.google.com')
    *        .getPerformanceMetrics((result) => {
    *          if (result.status === 0) {
    *            const metrics = result.value;
    *            console.log(metrics);
    *          }
    *        });
    *    });
    *  });
    *
    * @see https://web.dev/metrics/
    * @see https://pptr.dev/api/puppeteer.page.metrics/
    */
  def enablePerformanceMetrics(): Awaitable[this.type, Null] = js.native
  def enablePerformanceMetrics(enable: Boolean): Awaitable[this.type, Null] = js.native
  def enablePerformanceMetrics(
    enable: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def enablePerformanceMetrics(
    enable: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Get the performance metrics from the browser. Metrics collection
    * only begin after `enablePerformanceMetrics()` command is called.
    *
    * @returns A promise that contains metrics collected between the
    * last call to `enablePerformanceMetrics()` command and this command.
    *
    * @example
    *  describe('collect performance metrics', function() {
    *    it('enables the metrics collection, does some stuff and collects the metrics', function() {
    *      browser
    *        .enablePerformanceMetrics()
    *        .navigateTo('https://www.google.com')
    *        .getPerformanceMetrics((result) => {
    *          if (result.status === 0) {
    *            const metrics = result.value;
    *            console.log(metrics);
    *          }
    *        });
    *    });
    *  });
    *
    * @see https://web.dev/metrics/
    * @see https://pptr.dev/api/puppeteer.page.metrics/
    */
  def getPerformanceMetrics(): Awaitable[this.type, StringDictionary[Double]] = js.native
  def getPerformanceMetrics(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[StringDictionary[Double]], 
      Unit
    ]
  ): Awaitable[this.type, StringDictionary[Double]] = js.native
  
  /**
    * Intercept the request made on a particular URL and mock the response.
    *
    * @example
    *  describe('mock network response', function() {
    *    it('intercepts the request made to Google search and mocks its response', function() {
    *      browser
    *        .mockNetworkResponse('https://www.google.com/', {
    *          status: 200,
    *          headers: {
    *            'Content-Type': 'UTF-8'
    *          },
    *          body: 'Hello there!'
    *        })
    *        .navigateTo('https://www.google.com/')
    *        .pause(2000);
    *    });
    *  });
    *
    * @see https://nightwatchjs.org/guide/network-requests/mock-network-response.html
    */
  def mockNetworkResponse(urlToIntercept: String): Awaitable[this.type, Null] = js.native
  def mockNetworkResponse(
    urlToIntercept: String,
    response: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def mockNetworkResponse(urlToIntercept: String, response: Body): Awaitable[this.type, Null] = js.native
  def mockNetworkResponse(
    urlToIntercept: String,
    response: Body,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Override device mode/dimensions.
    *
    * @example
    *  describe('modify device dimensions', function() {
    *    it('modifies the device dimensions and then resets it', function() {
    *      browser
    *        .setDeviceDimensions({
    *          width: 400,
    *          height: 600,
    *          deviceScaleFactor: 50,
    *          mobile: true
    *        })
    *        .navigateTo('https://www.google.com')
    *        .pause(1000)
    *        .setDeviceDimensions()  // resets the device dimensions
    *        .navigateTo('https://www.google.com')
    *        .pause(1000);
    *    });
    *  });
    *
    * @see https://nightwatchjs.org/guide/mobile-web-testing/override-device-dimensions.html
    */
  def setDeviceDimensions(): Awaitable[this.type, Null] = js.native
  def setDeviceDimensions(
    metrics: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setDeviceDimensions(metrics: DeviceScaleFactor): Awaitable[this.type, Null] = js.native
  def setDeviceDimensions(
    metrics: DeviceScaleFactor,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Mock the geolocation of the browser.
    *
    * Call without any arguments to reset the geolocation.
    *
    * @example
    *  describe('mock geolocation', function() {
    *    it('sets the geolocation to Tokyo, Japan and then resets it', () => {
    *      browser
    *        .setGeolocation({
    *          latitude: 35.689487,
    *          longitude: 139.691706,
    *          accuracy: 100
    *        })  // sets the geolocation to Tokyo, Japan
    *        .navigateTo('https://www.gps-coordinates.net/my-location')
    *        .pause(3000)
    *        .setGeolocation()  // resets the geolocation
    *        .navigateTo('https://www.gps-coordinates.net/my-location')
    *        .pause(3000);
    *    });
    *  });
    *
    * @see https://nightwatchjs.org/guide/network-requests/mock-geolocation.html
    */
  def setGeolocation(): Awaitable[this.type, Null] = js.native
  def setGeolocation(
    coordinates: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def setGeolocation(coordinates: Accuracy): Awaitable[this.type, Null] = js.native
  def setGeolocation(
    coordinates: Accuracy,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Take heap snapshot and save it as a `.heapsnapshot` file.
    * The saved snapshot file can then be loaded into Chrome
    * DevTools' Memory tab for inspection.
    *
    * The contents of the heap snapshot are also available in the `value`
    * property of the `result` argument passed to the callback, in
    * string-serialized JSON format.
    *
    * @returns A promise that contains heap snapshot in string-serialized
    * JSON format.
    *
    * @example
    *  describe('take heap snapshot', function() {
    *    it('takes heap snapshot and saves it as snap.heapsnapshot file', function() {
    *      browser
    *        .navigateTo('https://www.google.com')
    *        .takeHeapSnapshot('./snap.heapsnapshot');
    *    });
    *  });
    *
    * @see https://nightwatchjs.org/guide/running-tests/take-heap-snapshot.html
    */
  def takeHeapSnapshot(): Awaitable[this.type, String] = js.native
  def takeHeapSnapshot(heapSnapshotLocation: String): Awaitable[this.type, String] = js.native
  def takeHeapSnapshot(
    heapSnapshotLocation: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def takeHeapSnapshot(
    heapSnapshotLocation: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
}
