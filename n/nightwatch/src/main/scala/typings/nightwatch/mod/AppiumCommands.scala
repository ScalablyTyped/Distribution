package typings.nightwatch.mod

import typings.nightwatch.anon.AppActivity
import typings.nightwatch.anon.AwaitableNightwatchAPIApp
import typings.nightwatch.anon.AwaitableNightwatchAPIArr
import typings.nightwatch.anon.AwaitableNightwatchAPILAN
import typings.nightwatch.anon.AwaitableNightwatchAPIboo
import typings.nightwatch.anon.AwaitableNightwatchAPInul
import typings.nightwatch.anon.AwaitableNightwatchAPIstr
import typings.nightwatch.anon.AwaitableNightwatchAPIstrAcceptAlert
import typings.nightwatch.nightwatchStrings.LANDSCAPE
import typings.nightwatch.nightwatchStrings.PORTRAIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppiumCommands extends StObject {
  
  /**
    * Get the current context in which Appium is running. Used when testing hybrid mobile apps using Appium.
    *
    * More info here: https://appium.io/docs/en/commands/context/get-context/
    *
    * @example
    * module.exports = {
    *   'get current context': function (app) {
    *     app
    *       .appium.getContext(function (result) {
    *         console.log('the current context is:', result.value);
    *       });
    *   },
    *
    *   'get current context with ES6 async/await': async function (app) {
    *     const context = await app.appium.getContext();
    *     console.log('the current context is:', context);
    *   }
    * };
    */
  def getContext(): AwaitableNightwatchAPIstr = js.native
  def getContext(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): AwaitableNightwatchAPIstr = js.native
  
  /**
    * Get a list of the available contexts. Used when testing hybrid mobile apps using Appium.
    *
    * More info here: https://appium.io/docs/en/commands/context/get-contexts/
    *
    * @example
    * module.exports = {
    *   'get available contexts': function (app) {
    *     app
    *       .appium.getContexts(function (result) {
    *         console.log('the available contexts are:', result.value);
    *       });
    *   },
    *
    *   'get available contexts with ES6 async/await': async function (app) {
    *     const contexts = await app.appium.getContexts();
    *     console.log('the available contexts are:', contexts);
    *   }
    * };
    */
  def getContexts(): AwaitableNightwatchAPIArr = js.native
  def getContexts(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[String]], 
      Unit
    ]
  ): AwaitableNightwatchAPIArr = js.native
  
  /**
    * Get the name of the current Android activity.
    *
    * @example
    * module.exports = {
    *   'get current activity name': function (app) {
    *     app
    *       .appium.getCurrentActivity(function (result) {
    *         console.log('current android activity is:', result.value);
    *       });
    *   },
    *
    *   'get current activity name with ES6 async/await': async function (app) {
    *     const activity = await app.appium.getCurrentActivity();
    *     console.log('current android activity is:', activity);
    *   }
    * };
    */
  def getCurrentActivity(): AwaitableNightwatchAPIstrAcceptAlert = js.native
  def getCurrentActivity(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): AwaitableNightwatchAPIstrAcceptAlert = js.native
  
  /**
    * Get the name of the current Android package.
    *
    * @example
    * module.exports = {
    *   'get current package name': function (app) {
    *     app
    *       .appium.getCurrentPackage(function (result) {
    *         console.log('current android package is:', result.value);
    *       });
    *   },
    *
    *   'get current package name with ES6 async/await': async function (app) {
    *     const packageName = await app.appium.getCurrentPackage();
    *     console.log('current android package is:', packageName);
    *   }
    * };
    */
  def getCurrentPackage(): AwaitableNightwatchAPIstrAcceptAlert = js.native
  def getCurrentPackage(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): AwaitableNightwatchAPIstrAcceptAlert = js.native
  
  /**
    * Get the current geolocation of the mobile device.
    *
    * @example
    * module.exports = {
    *   'get device geolocation': function (app) {
    *     app
    *       .appium.getGeolocation(function (result) {
    *         console.log('current device geolocation is:', result.value);
    *       });
    *   },
    *
    *   'get device geolocation with ES6 async/await': async function (app) {
    *     const location = await app.appium.getGeolocation();
    *     console.log('current device geolocation is:', location);
    *   }
    * };
    */
  def getGeolocation(): AwaitableNightwatchAPIApp = js.native
  def getGeolocation(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[AppiumGeolocation], 
      Unit
    ]
  ): AwaitableNightwatchAPIApp = js.native
  
  /**
    * Get the current device orientation.
    *
    * @example
    * module.exports = {
    *   'get current device orientation': function (app) {
    *     app
    *       .appium.getOrientation(function (result) {
    *         console.log('current device orientation is:', result.value);
    *       });
    *   },
    *
    *   'get current device orientation with ES6 async/await': async function (app) {
    *     const orientation = await app.appium.getOrientation();
    *     console.log('current device orientation is:', orientation);
    *   }
    * };
    */
  def getOrientation(): AwaitableNightwatchAPILAN = js.native
  def getOrientation(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
      Unit
    ]
  ): AwaitableNightwatchAPILAN = js.native
  
  /**
    * Hide soft keyboard.
    *
    * @example
    * module.exports = {
    *   'hide device soft keyboard': function (app) {
    *     app
    *       .appium.hideKeyboard();
    *   },
    *
    *   'hide device soft keyboard with ES6 async/await': async function (app) {
    *     await app.appium.hideKeyboard();
    *   }
    * };
    */
  def hideKeyboard(): AwaitableNightwatchAPIboo = js.native
  def hideKeyboard(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): AwaitableNightwatchAPIboo = js.native
  
  /**
    * Whether or not the soft keyboard is shown.
    *
    * @example
    * module.exports = {
    *   'whether keyboard is shown': function (app) {
    *     app
    *       .appium.isKeyboardShown(function (result) {
    *         console.log('result value of whether keyboard is shown:', result.value);
    *       });
    *   },
    *
    *   'whether keyboard is shown with ES6 async/await': async function (app) {
    *     const result = await app.appium.isKeyboardShown();
    *     console.log('result value of whether keyboard is shown:', result);
    *   }
    * };
    */
  def isKeyboardShown(): AwaitableNightwatchAPIboo = js.native
  def isKeyboardShown(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): AwaitableNightwatchAPIboo = js.native
  
  /**
    * Press and hold a particular key on an Android Device.
    *
    * See [official Android Developers docs](https://developer.android.com/reference/android/view/KeyEvent.html) for reference of available Android key code values.
    *
    * @example
    * module.exports = {
    *   'long press e with caps lock on (keycode 33 and metastate 1048576)': function (app) {
    *     app
    *       .appium.longPressKeyCode(33, 1048576);
    *   },
    *
    *   'long press g (keycode 35) with ES6 async/await': async function (app) {
    *     await app.appium.longPressKeyCode(35);
    *   }
    * };
    */
  def longPressKeyCode(keycode: Double): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(
    keycode: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(keycode: Double, metastate: Double): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(keycode: Double, metastate: Double, flags: Double): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(
    keycode: Double,
    metastate: Double,
    flags: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(
    keycode: Double,
    metastate: Double,
    flags: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(keycode: Double, metastate: Unit, flags: Double): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(
    keycode: Double,
    metastate: Unit,
    flags: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def longPressKeyCode(
    keycode: Double,
    metastate: Unit,
    flags: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  
  /**
    * Press a particular key on an Android Device.
    *
    * See [official Android Developers docs](https://developer.android.com/reference/android/view/KeyEvent.html) for reference of available Android key code values.
    *
    * @example
    * module.exports = {
    *   'press e with caps lock on (keycode 33 and metastate 1048576)': function (app) {
    *     app
    *       .appium.pressKeyCode(33, 1048576);
    *   },
    *
    *   'press g (keycode 35) with ES6 async/await': async function (app) {
    *     await app.appium.pressKeyCode(35);
    *   }
    * };
    */
  def pressKeyCode(keycode: Double): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(
    keycode: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(keycode: Double, metastate: Double): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(keycode: Double, metastate: Double, flags: Double): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(
    keycode: Double,
    metastate: Double,
    flags: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(
    keycode: Double,
    metastate: Double,
    flags: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(keycode: Double, metastate: Unit, flags: Double): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(
    keycode: Double,
    metastate: Unit,
    flags: Double,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  def pressKeyCode(
    keycode: Double,
    metastate: Unit,
    flags: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  
  /**
    * Set the context to be automated. Used when testing hybrid mobile apps using Appium.
    *
    * More info here: https://appium.io/docs/en/commands/context/set-context/
    *
    * @example
    * module.exports = {
    *   'switch to webview context': async function (app) {
    *     app
    *       .waitUntil(async function() {
    *         // wait for webview context to be available
    *         // initially, this.getContexts() only returns ['NATIVE_APP']
    *         const contexts = await this.appium.getContexts();
    *
    *         return contexts.length > 1;
    *       })
    *       .perform(async function() {
    *         // switch to webview context
    *         const contexts = await this.appium.getContexts();  // contexts: ['NATIVE_APP', 'WEBVIEW_<id>']
    *         await this.appium.setContext(contexts[1]);
    *       });
    *   },
    *
    *   'switch to native context': function (app) {
    *     app.appium.setContext('NATIVE_APP');
    *   }
    * };
    */
  def setContext(context: String): AwaitableNightwatchAPInul = js.native
  def setContext(
    context: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
  
  /**
    * Set the current geolocation of the mobile device.
    *
    * @example
    * module.exports = {
    *   'set geolocation to Tokyo, Japan': function (app) {
    *     app
    *       .appium.setGeolocation({latitude: 35.689487, longitude: 139.691706, altitude: 5});
    *   },
    *
    *   'set geolocation to Tokyo, Japan with ES6 async/await': async function (app) {
    *     await app.appium.setGeolocation({latitude: 35.689487, longitude: 139.691706});
    *   }
    * };
    */
  def setGeolocation(coordinates: AppiumGeolocation): AwaitableNightwatchAPIApp = js.native
  def setGeolocation(
    coordinates: AppiumGeolocation,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[AppiumGeolocation], 
      Unit
    ]
  ): AwaitableNightwatchAPIApp = js.native
  
  /**
    * Set the current device orientation.
    *
    * @example
    * module.exports = {
    *   'set orientation to LANDSCAPE': function (app) {
    *     app
    *       .appium.setOrientation('LANDSCAPE');
    *   }
    * };
    */
  def setOrientation(orientation: LANDSCAPE | PORTRAIT): AwaitableNightwatchAPILAN = js.native
  def setOrientation(
    orientation: LANDSCAPE | PORTRAIT,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
      Unit
    ]
  ): AwaitableNightwatchAPILAN = js.native
  
  /**
    * Start an Android activity by providing package name, activity name and other optional parameters.
    *
    * More info here: https://appium.io/docs/en/commands/device/activity/start-activity/
    *
    * @example
    * module.exports = {
    *   'start an android activity': function (app) {
    *     app
    *       .appium.startActivity({
    *         appPackage: 'com.android.chrome',
    *         appActivity: 'com.google.android.apps.chrome.Main'
    *       });
    *   },
    *
    *   'start the main Android activity and wait for onboarding activity to start': function (app) {
    *     app
    *       .appium.startActivity({
    *         appPackage: 'org.wikipedia',
    *         appActivity: 'org.wikipedia.main.MainActivity',
    *         appWaitActivity: 'org.wikipedia.onboarding.InitialOnboardingActivity'
    *       });
    *   }
    * };
    */
  def startActivity(opts: AppActivity): AwaitableNightwatchAPInul = js.native
  def startActivity(
    opts: AppActivity,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): AwaitableNightwatchAPInul = js.native
}
