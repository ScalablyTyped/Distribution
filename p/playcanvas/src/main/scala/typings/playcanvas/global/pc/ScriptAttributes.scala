package typings.playcanvas.global.pc

import typings.playcanvas.anon.Array
import typings.playcanvas.anon.TypeofScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container of Script Attribute definitions. Implements an interface to add/remove attributes and store their definition for a {@link pc.ScriptType}.
  Note: An instance of pc.ScriptAttributes is created automatically by each {@link pc.ScriptType}.
  * @param scriptType - Script Type that attributes relate to.
  */
@JSGlobal("pc.ScriptAttributes")
@js.native
class ScriptAttributes protected ()
  extends typings.playcanvas.pc.ScriptAttributes {
  def this(scriptType: TypeofScriptType) = this()
  /**
    * Add Attribute.
    * @example
    * PlayerController.attributes.add('fullName', {
    type: 'string'
    });
    * @example
    * PlayerController.attributes.add('speed', {
    type: 'number',
    title: 'Speed',
    placeholder: 'km/h',
    default: 22.2
    });
    * @example
    * PlayerController.attributes.add('resolution', {
    type: 'number',
    default: 32,
    enum: [
    { '32x32': 32 },
    { '64x64': 64 },
    { '128x128': 128 }
    ]
    });
    * @param name - Name of an attribute.
    * @param args - Object with Arguments for an attribute.
    * @param args.type - Type of an attribute value.
    * @param [args.default] - Default attribute value.
    * @param [args.title] - Title for Editor's for field UI.
    * @param [args.description] - Description for Editor's for field UI.
    * @param [args.placeholder] - Placeholder for Editor's for field UI.
    For multi-field types, such as vec2, vec3, and others use array of strings.
    * @param [args.array] - If attribute can hold single or multiple values.
    * @param [args.size] - If attribute is array, maximum number of values can be set.
    * @param [args.min] - Minimum value for type 'number', if max and min defined, slider will be rendered in Editor's UI.
    * @param [args.max] - Maximum value for type 'number', if max and min defined, slider will be rendered in Editor's UI.
    * @param [args.precision] - Level of precision for field type 'number' with floating values.
    * @param [args.step] - Step value for type 'number'. The amount used to increment the value when using the arrow keys in the Editor's UI.
    * @param [args.assetType] - Name of asset type to be used in 'asset' type attribute picker in Editor's UI, defaults to '*' (all).
    * @param [args.curves] - List of names for Curves for field type 'curve'.
    * @param [args.color] - String of color channels for Curves for field type 'curve', can be any combination of `rgba` characters.
    Defining this property will render Gradient in Editor's field UI.
    * @param [args.enum] - List of fixed choices for field, defined as array of objects, where key in object is a title of an option.
    */
  /* CompleteClass */
  override def add(name: String, args: Array): Unit = js.native
  /**
    * Get object with attribute arguments.
    Note: Changing argument properties will not affect existing Script Instances.
    * @example
    * // changing default value for an attribute 'fullName'
    var attr = PlayerController.attributes.get('fullName');
    if (attr) attr.default = 'Unknown';
    * @param name - Name of an attribute.
    * @returns Arguments with attribute properties.
    */
  /* CompleteClass */
  override def get(name: String): js.Any = js.native
  /**
    * Detect if Attribute is added.
    * @example
    * if (PlayerController.attributes.has('fullName')) {
    // attribute fullName is defined
    }
    * @param name - Name of an attribute.
    * @returns True if Attribute is defined.
    */
  /* CompleteClass */
  override def has(name: String): Boolean = js.native
  /**
    * Remove Attribute.
    * @example
    * PlayerController.attributes.remove('fullName');
    * @param name - Name of an attribute.
    * @returns True if removed or false if not defined.
    */
  /* CompleteClass */
  override def remove(name: String): Boolean = js.native
}

