package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable1
import typings.playcanvas.anon.App
import typings.playcanvas.anon.Array
import typings.playcanvas.anon.TypeofScriptType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container of Script Attribute definitions. Implements an interface to add/remove attributes and
  * store their definition for a {@link ScriptType}. Note: An instance of ScriptAttributes is
  * created automatically by each {@link ScriptType}.
  */
trait ScriptAttributes extends StObject {
  
  /**
    * Add Attribute.
    *
    * @param {string} name - Name of an attribute.
    * @param {object} args - Object with Arguments for an attribute.
    * @param {("boolean"|"number"|"string"|"json"|"asset"|"entity"|"rgb"|"rgba"|"vec2"|"vec3"|"vec4"|"curve")} args.type - Type
    * of an attribute value.  Can be:
    *
    * - "asset"
    * - "boolean"
    * - "curve"
    * - "entity"
    * - "json"
    * - "number"
    * - "rgb"
    * - "rgba"
    * - "string"
    * - "vec2"
    * - "vec3"
    * - "vec4"
    *
    * @param {*} [args.default] - Default attribute value.
    * @param {string} [args.title] - Title for Editor's for field UI.
    * @param {string} [args.description] - Description for Editor's for field UI.
    * @param {string|string[]} [args.placeholder] - Placeholder for Editor's for field UI.
    * For multi-field types, such as vec2, vec3, and others use array of strings.
    * @param {boolean} [args.array] - If attribute can hold single or multiple values.
    * @param {number} [args.size] - If attribute is array, maximum number of values can be set.
    * @param {number} [args.min] - Minimum value for type 'number', if max and min defined, slider
    * will be rendered in Editor's UI.
    * @param {number} [args.max] - Maximum value for type 'number', if max and min defined, slider
    * will be rendered in Editor's UI.
    * @param {number} [args.precision] - Level of precision for field type 'number' with floating
    * values.
    * @param {number} [args.step] - Step value for type 'number'. The amount used to increment the
    * value when using the arrow keys in the Editor's UI.
    * @param {string} [args.assetType] - Name of asset type to be used in 'asset' type attribute
    * picker in Editor's UI, defaults to '*' (all).
    * @param {string[]} [args.curves] - List of names for Curves for field type 'curve'.
    * @param {string} [args.color] - String of color channels for Curves for field type 'curve',
    * can be any combination of `rgba` characters. Defining this property will render Gradient in
    * Editor's field UI.
    * @param {object[]} [args.enum] - List of fixed choices for field, defined as array of objects,
    * where key in object is a title of an option.
    * @param {object[]} [args.schema] - List of attributes for type 'json'. Each attribute
    * description is an object with the same properties as regular script attributes but with an
    * added 'name' field to specify the name of each attribute in the JSON.
    * @example
    * PlayerController.attributes.add('fullName', {
    *     type: 'string'
    * });
    * @example
    * PlayerController.attributes.add('speed', {
    *     type: 'number',
    *     title: 'Speed',
    *     placeholder: 'km/h',
    *     default: 22.2
    * });
    * @example
    * PlayerController.attributes.add('resolution', {
    *     type: 'number',
    *     default: 32,
    *     enum: [
    *         { '32x32': 32 },
    *         { '64x64': 64 },
    *         { '128x128': 128 }
    *     ]
    * });
    * @example
    * PlayerController.attributes.add('config', {
    *     type: 'json',
    *     schema: [{
    *         name: 'speed',
    *         type: 'number',
    *         title: 'Speed',
    *         placeholder: 'km/h',
    *         default: 22.2
    *     }, {
    *         name: 'resolution',
    *         type: 'number',
    *         default: 32,
    *         enum: [
    *             { '32x32': 32 },
    *             { '64x64': 64 },
    *             { '128x128': 128 }
    *         ]
    *     }]
    * });
    */
  def add(name: String, args: Array): Unit
  
  /**
    * Get object with attribute arguments. Note: Changing argument properties will not affect
    * existing Script Instances.
    *
    * @param {string} name - Name of an attribute.
    * @returns {?object} Arguments with attribute properties.
    * @example
    * // changing default value for an attribute 'fullName'
    * var attr = PlayerController.attributes.get('fullName');
    * if (attr) attr.default = 'Unknown';
    */
  def get(name: String): js.Object | Null
  
  /**
    * Detect if Attribute is added.
    *
    * @param {string} name - Name of an attribute.
    * @returns {boolean} True if Attribute is defined.
    * @example
    * if (PlayerController.attributes.has('fullName')) {
    *     // attribute fullName is defined
    * }
    */
  def has(name: String): Boolean
  
  /**
    * Remove Attribute.
    *
    * @param {string} name - Name of an attribute.
    * @returns {boolean} True if removed or false if not defined.
    * @example
    * PlayerController.attributes.remove('fullName');
    */
  def remove(name: String): Boolean
  
  var scriptType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])
}
object ScriptAttributes {
  
  inline def apply(
    add: (String, Array) => Unit,
    get: String => js.Object | Null,
    has: String => Boolean,
    remove: String => Boolean,
    scriptType: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])
  ): ScriptAttributes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), scriptType = scriptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptAttributes]
  }
  
  extension [Self <: ScriptAttributes](x: Self) {
    
    inline def setAdd(value: (String, Array) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setGet(value: String => js.Object | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setScriptType(value: TypeofScriptType & (Instantiable1[/* args */ App, ScriptType])): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
  }
}
