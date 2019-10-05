package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.EventHandler
  * @classdesc Abstract base class that implements functionality for event handling.
  * @description Create a new event handler.
  * @example
  * var obj = new EventHandlerSubclass();
  *
  * // subscribe to an event
  * obj.on('hello', function(str) {
  *     console.log('event hello is fired', str);
  * });
  *
  * // fire event
  * obj.fire('hello', 'world');
  */
@JSImport("playcanvas", "EventHandler")
@js.native
class EventHandler ()
  extends typings.playcanvas.pc.EventHandler

