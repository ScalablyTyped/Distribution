package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScriptType extends StObject {
  
  /**
    * @param {*} constructorFn - The constructor function of the script type.
    * @returns {string} The script name.
    * @private
    */
  /* static member */
  var __getScriptName: Any
  
  /**
    * Name of a Script Type.
    *
    * @type {string}
    * @private
    */
  /* static member */
  var __name: Any
  
  /**
    * Shorthand function to extend Script Type prototype with list of methods.
    *
    * @param {object} methods - Object with methods, where key - is name of method, and value - is function.
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
  /* static member */
  def extend(methods: js.Object): Unit
}
object TypeofScriptType {
  
  inline def apply(__getScriptName: Any, __name: Any, extend: js.Object => Unit): TypeofScriptType = {
    val __obj = js.Dynamic.literal(__getScriptName = __getScriptName.asInstanceOf[js.Any], __name = __name.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend))
    __obj.asInstanceOf[TypeofScriptType]
  }
  
  extension [Self <: TypeofScriptType](x: Self) {
    
    inline def setExtend(value: js.Object => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def set__getScriptName(value: Any): Self = StObject.set(x, "__getScriptName", value.asInstanceOf[js.Any])
    
    inline def set__name(value: Any): Self = StObject.set(x, "__name", value.asInstanceOf[js.Any])
  }
}
