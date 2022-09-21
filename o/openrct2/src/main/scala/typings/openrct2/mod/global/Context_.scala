package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.actionDotexecute
import typings.openrct2.openrct2Strings.actionDotlocation
import typings.openrct2.openrct2Strings.actionDotquery
import typings.openrct2.openrct2Strings.intervalDotday
import typings.openrct2.openrct2Strings.intervalDottick
import typings.openrct2.openrct2Strings.networkDotauthenticate
import typings.openrct2.openrct2Strings.networkDotchat
import typings.openrct2.openrct2Strings.networkDotjoin
import typings.openrct2.openrct2Strings.networkDotleave
import typings.openrct2.openrct2Strings.ride
import typings.openrct2.openrct2Strings.rideDotratingsDotcalculate
import typings.openrct2.openrct2Strings.small_scenery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Core APIs for storage and subscriptions.
  */
@js.native
trait Context_ extends StObject {
  
  /**
    * Render the current state of the map and save to disc.
    * Useful for server administration and timelapse creation.
    * @param options Options that control the capture and output file.
    */
  def captureImage(options: CaptureOptions): Unit = js.native
  
  /**
    * Removes the registered interval specified by the numeric handle. The handles
    * are shared with `setTimeout`.
    * @param handle
    */
  def clearInterval(handle: Double): Unit = js.native
  
  /**
    * Removes the registered timeout specified by the numeric handle. The handles
    * are shared with `setInterval`.
    * @param handle The numerical handle of the registered timeout to remove.
    */
  def clearTimeout(handle: Double): Unit = js.native
  
  /**
    * The user's current configuration.
    */
  var configuration: Configuration = js.native
  
  def executeAction(action: String, args: js.Object, callback: js.Function1[/* result */ GameActionResult, Unit]): Unit = js.native
  /**
    * Executes a game action. In a network game, this will send a request to the server and wait
    * for the server to reply.
    * @param action The name of the action.
    * @param args The action parameters.
    * @param callback The function to be called with the result of the action.
    */
  def executeAction(action: ActionType, args: js.Object, callback: js.Function1[/* result */ GameActionResult, Unit]): Unit = js.native
  
  /**
    * Formats a new string using the given format string and the arguments.
    * @param fmt The format string, e.g. "Guests: {COMMA16}"
    * @param args The arguments to insert into the string.
    */
  def formatString(fmt: String, args: Any*): String = js.native
  
  def getAllObjects(`type`: ObjectType): js.Array[Object] = js.native
  @JSName("getAllObjects")
  def getAllObjects_ride(`type`: ride): js.Array[RideObject] = js.native
  
  /**
    * Gets the loaded object at the given index.
    * @param type The object type.
    * @param index The index.
    */
  def getObject(`type`: ObjectType, index: Double): Object = js.native
  @JSName("getObject")
  def getObject_ride(`type`: ride, index: Double): RideObject = js.native
  @JSName("getObject")
  def getObject_smallscenery(`type`: small_scenery, index: Double): SmallSceneryObject = js.native
  
  /**
    * Gets a random integer within the specified range using the game's pseudo-
    * random number generator. This is part of the game state and shared across
    * all clients, you therefore must be in a context that can mutate the game
    * state. Use this to generate random numbers instead of Math.Random during
    * game logic routines such as hooks and game actions.
    * @param min The minimum value inclusive.
    * @param max The maximum value exclusive.
    */
  def getRandom(min: Double, max: Double): Double = js.native
  
  def queryAction(action: String, args: js.Object, callback: js.Function1[/* result */ GameActionResult, Unit]): Unit = js.native
  /**
    * Query the result of running a game action. This allows you to check the outcome and validity of
    * an action without actually executing it.
    * @param action The name of the action.
    * @param args The action parameters.
    * @param callback The function to be called with the result of the action.
    */
  def queryAction(action: ActionType, args: js.Object, callback: js.Function1[/* result */ GameActionResult, Unit]): Unit = js.native
  
  /**
    * Registers a new game action that allows clients to interact with the game.
    * @param action The unique name of the action.
    * @param query Logic for validating and returning a price for an action.
    * @param execute Logic for validating and executing the action.
    * @throws An error if the action has already been registered by this or another plugin.
    */
  def registerAction(
    action: String,
    query: js.Function1[/* args */ js.Object, GameActionResult],
    execute: js.Function1[/* args */ js.Object, GameActionResult]
  ): Unit = js.native
  
  /**
    * Registers a function to be called every so often in realtime, specified by the given delay.
    * @param callback The function to call every time the delay has elapsed.
    * @param delay The number of milliseconds to wait between each call to the given function.
    */
  def setInterval(callback: js.Function, delay: Double): Double = js.native
  
  /**
    * Like `setInterval`, except the callback will only execute once after the given delay.
    * @param callback The function to call after the given delay has elapsed.
    * @param delay The number of milliseconds to wait for before calling the given function.
    */
  def setTimeout(callback: js.Function, delay: Double): Double = js.native
  
  /**
    * Shared generic storage for all plugins. Data is persistent across instances
    * of OpenRCT2 and is stored externally as a single JSON file in the OpenRCT2
    * user directory. Internally it is a JavaScript object. Objects and arrays
    * are only copied by reference. The external file is only written when using
    * the `set` method, do not rely on the file being saved by modifying your own
    * objects. Functions and other internal structures will not be persisted.
    */
  var sharedStorage: Configuration = js.native
  
  /**
    * Subscribes to the given hook.
    */
  def subscribe(hook: HookType, callback: js.Function): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_actionexecute(hook: actionDotexecute, callback: js.Function1[/* e */ GameActionEventArgs, Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_actionlocation(hook: actionDotlocation, callback: js.Function1[/* e */ ActionLocationArgs, Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_actionquery(hook: actionDotquery, callback: js.Function1[/* e */ GameActionEventArgs, Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_intervalday(hook: intervalDotday, callback: js.Function0[Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_intervaltick(hook: intervalDottick, callback: js.Function0[Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_networkauthenticate(hook: networkDotauthenticate, callback: js.Function1[/* e */ NetworkAuthenticateEventArgs, Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_networkchat(hook: networkDotchat, callback: js.Function1[/* e */ NetworkChatEventArgs, Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_networkjoin(hook: networkDotjoin, callback: js.Function1[/* e */ NetworkEventArgs, Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_networkleave(hook: networkDotleave, callback: js.Function1[/* e */ NetworkEventArgs, Unit]): IDisposable = js.native
  @JSName("subscribe")
  def subscribe_rideratingscalculate(hook: rideDotratingsDotcalculate, callback: js.Function1[/* e */ RideRatingsCalculateArgs, Unit]): IDisposable = js.native
}
