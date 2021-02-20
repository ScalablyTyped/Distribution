package typings.playcanvas.anon

import typings.playcanvas.pc.ScriptAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofScriptType extends StObject {
  
  /**
    * The interface to define attributes for Script Types. Refer to {@link pc.ScriptAttributes}.
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
  /* static member */
  val attributes: ScriptAttributes = js.native
  
  /**
    * Shorthand function to extend Script Type prototype with list of methods.
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
    * @param methods - Object with methods, where key - is name of method, and value - is function.
    */
  /* static member */
  def extend(methods: js.Any): Unit = js.native
  
  /**
    * Name of a Script Type
    */
  /* static member */
  val scriptName: String | Null = js.native
}
object TypeofScriptType {
  
  @scala.inline
  def apply(attributes: ScriptAttributes, extend: js.Any => Unit): TypeofScriptType = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend))
    __obj.asInstanceOf[TypeofScriptType]
  }
  
  @scala.inline
  implicit class TypeofScriptTypeMutableBuilder[Self <: TypeofScriptType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: ScriptAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: js.Any => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptNameNull: Self = StObject.set(x, "scriptName", null)
  }
}
