package typings.playcanvas.pc

import typings.playcanvas.Anon_Array
import typings.playcanvas.ScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptAttributes
  * @classdesc Container of Script Attribute definitions. Implements an interface to add/remove attributes and store their definition for a {@link ScriptType}.
  * Note: An instance of pc.ScriptAttributes is created automatically by each {@link ScriptType}.
  * @param {ScriptType} scriptType Script Type that attributes relate to.
  */
@JSGlobal("pc.ScriptAttributes")
@js.native
class ScriptAttributes protected () extends js.Object {
  def this(scriptType: ScriptType) = this()
  /**
    * @function
    * @name pc.ScriptAttributes#add
    * @description Add Attribute
    * @param {String} name Name of an attribute
    * @param {Object} args Object with Arguments for an attribute
    * @param {String} args.type Type of an attribute value, list of possible types:
    * boolean, number, string, json, asset, entity, rgb, rgba, vec2, vec3, vec4, curve
    * @param {*} [args.default] Default attribute value
    * @param {String} [args.title] Title for Editor's for field UI
    * @param {String} [args.description] Description for Editor's for field UI
    * @param {String|String[]} [args.placeholder] Placeholder for Editor's for field UI.
    * For multi-field types, such as vec2, vec3, and others use array of strings.
    * @param {Boolean} [args.array] If attribute can hold single or multiple values
    * @param {Number} [args.size] If attribute is array, maximum number of values can be set
    * @param {Number} [args.min] Minimum value for type 'number', if max and min defined, slider will be rendered in Editor's UI
    * @param {Number} [args.max] Maximum value for type 'number', if max and min defined, slider will be rendered in Editor's UI
    * @param {Number} [args.precision] Level of precision for field type 'number' with floating values
    * @param {Number} [args.step] Step value for type 'number'. The amount used to increment the value when using the arrow keys in the Editor's UI.
    * @param {String} [args.assetType] Name of asset type to be used in 'asset' type attribute picker in Editor's UI, defaults to '*' (all)
    * @param {String[]} [args.curves] List of names for Curves for field type 'curve'
    * @param {String} [args.color] String of color channels for Curves for field type 'curve', can be any combination of `rgba` characters.
    * Defining this property will render Gradient in Editor's field UI
    * @param {Object[]} [args.enum] List of fixed choices for field, defined as array of objects, where key in object is a title of an option
    * @example
    * PlayerController.attributes.add('fullName', {
    *     type: 'string',
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
    *        { '32x32': 32 },
    *        { '64x64': 64 },
    *        { '128x128': 128 }
    *     ]
    * });
    */
  def add(name: String, args: Anon_Array): Unit = js.native
  /**
    * @function
    * @name pc.ScriptAttributes#get
    * @description Get object with attribute arguments.
    * Note: Changing argument properties will not affect existing Script Instances.
    * @param {String} name Name of an attribute
    * @returns {?Object} Arguments with attribute properties
    * @example
    * // changing default value for an attribute 'fullName'
    * var attr = PlayerController.attributes.get('fullName');
    * if (attr) attr.default = 'Unknown';
    */
  def get(name: String): js.Any = js.native
  /**
    * @function
    * @name pc.ScriptAttributes#has
    * @description Detect if Attribute is added.
    * @param {String} name Name of an attribute
    * @returns {Boolean} True if Attribute is defined
    * @example
    * if (PlayerController.attributes.has('fullName')) {
    *     // attribute `fullName` is defined
    * });
    */
  def has(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.ScriptAttributes#remove
    * @description Remove Attribute.
    * @param {String} name Name of an attribute
    * @returns {Boolean} True if removed or false if not defined
    * @example
    * PlayerController.attributes.remove('fullName');
    */
  def remove(name: String): Boolean = js.native
}

