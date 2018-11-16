package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @name ScriptType
    * @class Represents the type of a script. It is returned by {@link pc.createScript}. Also referred to as Script Type.<br />
    * The type is to be extended using its JavaScript prototype. There is a <strong>list of methods</strong>
    * that will be executed by the engine on instances of this type, such as: <ul><li>initialize</li><li>postInitialize</li><li>update</li><li>postUpdate</li><li>swap</li></ul>
    * <strong>initialize</strong> and <strong>postInitialize</strong> - are called if defined when script is about to run for the first time - postInitialize will run after all initialize methods are executed in the same tick or enabling chain of actions.<br />
    * <strong>update</strong> and <strong>postUpdate</strong> - methods are called if defined for enabled (running state) scripts on each tick.<br />
    * <strong>swap</strong> - This method will be called when a {@link ScriptType} that already exists in the registry gets redefined.
    * If the new {@link ScriptType} has a `swap` method in its prototype, then it will be executed to perform hot-reload at runtime.
    * @property {pc.Application} app The {@link pc.Application} that the instance of this type belongs to.
    * @property {pc.Entity} entity The {@link pc.Entity} that the instance of this type belongs to.
    * @property {Boolean} enabled True if the instance of this type is in running state. False when script is not running,
    * because the Entity or any of its parents are disabled or the Script Component is disabled or the Script Instance is disabled.
    * When disabled no update methods will be called on each tick.
    * initialize and postInitialize methods will run once when the script instance is in `enabled` state during app tick.
    */
@js.native
trait ScriptTypeConstructor[S /* <: ScriptType */]
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any]
     with ScalablyTyped.runtime.Instantiable1[/* args */ playcanvasLib.Anon_Entity, S] {
  /**
           * @private
           * @readonly
           * @static
           * @name ScriptType.__name
           * @type String
           * @description Name of a Script Type.
           */
  var __name: java.lang.String = js.native
  /**
           * @field
           * @static
           * @readonly
           * @type pc.ScriptAttributes
           * @name ScriptType.attributes
           * @description The interface to define attributes for Script Types. Refer to {@link pc.ScriptAttributes}
           * @example
           * var PlayerController = pc.createScript('playerController');
           *
           * PlayerController.attributes.add('speed', {
           *     type: 'number',
           *     title: 'Speed',
           *     placeholder: 'km/h',
           *     default: 22.2
           * });
           */
  var attributes: ScriptAttributes = js.native
  /**
           * @readonly
           * @static
           * @function
           * @name ScriptType.extend
           * @param {Object} methods Object with methods, where key - is name of method, and value - is function.
           * @description Shorthand function to extend Script Type prototype with list of methods.
           * @example
           * var PlayerController = pc.createScript('playerController');
           *
           * PlayerController.extend({
           *     initialize: function() {
           *         // called once on initialize
           *     },
           *     update: function(dt) {
           *         // called each tick
           *     }
           * })
           */
  var extend: js.UndefOr[
    js.Function1[/* methods */ ScalablyTyped.runtime.StringDictionary[js.Function0[_]], scala.Unit]
  ] = js.native
}

