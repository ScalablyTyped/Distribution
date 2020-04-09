package typings.playcanvas

import org.scalablytyped.runtime.Instantiable1
import typings.playcanvas.pc.ScriptAttributes
import typings.playcanvas.pc.ScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofScriptType extends Instantiable1[/* args */ AnonApp, ScriptType] {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.ScriptType.attributes
    * @type {pc.ScriptAttributes}
    * @description The interface to define attributes for Script Types. Refer to {@link pc.ScriptAttributes}.
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
  val attributes: ScriptAttributes = js.native
  /**
    * @readonly
    * @static
    * @function
    * @name pc.ScriptType.extend
    * @param {object} methods - Object with methods, where key - is name of method, and value - is function.
    * @description Shorthand function to extend Script Type prototype with list of methods.
    * @example
    * var PlayerController = pc.createScript('playerController');
    *
    * PlayerController.extend({
    *     initialize: function () {
    *         // called once on initialize
    *     },
    *     update: function (dt) {
    *         // called each tick
    *     }
    * });
    */
  def extend(methods: js.Any): Unit = js.native
}

