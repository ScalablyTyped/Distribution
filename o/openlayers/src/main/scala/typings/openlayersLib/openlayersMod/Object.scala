package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Object")
@js.native
class Object () extends Observable {
  /**
       * @classdesc
       * Abstract base class; normally only used for creating subclasses and not
       * instantiated in apps.
       * Most non-trivial classes inherit from this.
       *
       * This extends {@link ol.Observable} with observable properties, where each
       * property is observable as well as the object as a whole.
       *
       * Classes that inherit from this have pre-defined properties, to which you can
       * add your owns. The pre-defined properties are listed in this documentation as
       * 'Observable Properties', and have their own accessors; for example,
       * {@link ol.Map} has a `target` property, accessed with `getTarget()`  and
       * changed with `setTarget()`. Not all properties are however settable. There
       * are also general-purpose accessors `get()` and `set()`. For example,
       * `get('target')` is equivalent to `getTarget()`.
       *
       * The `set` accessors trigger a change event, and you can monitor this by
       * registering a listener. For example, {@link ol.View} has a `center`
       * property, so `view.on('change:center', function(evt) {...});` would call the
       * function whenever the value of the center property changes. Within the
       * function, `evt.target` would be the view, so `evt.target.getCenter()` would
       * return the new center.
       *
       * You can add your own observable properties with
       * `object.set('prop', 'value')`, and retrieve that with `object.get('prop')`.
       * You can listen for changes on that property value with
       * `object.on('change:prop', listener)`. You can get a list of all
       * properties with {@link ol.Object#getProperties object.getProperties()}.
       *
       * Note that the observable properties are separate from standard JS properties.
       * You can, for example, give your map object a title with
       * `map.title='New title'` and with `map.set('title', 'Another title')`. The
       * first will be a `hasOwnProperty`; the second will appear in
       * `getProperties()`. Only the second is observable.
       *
       * Properties can be deleted by using the unset method. E.g.
       * object.unset('foo').
       *
       * @param opt_values An object with key-value pairs.
       * @fires ol.ObjectEvent
       * @api
       */
  def this(opt_values: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Gets a value.
       * @param key Key name.
       * @return Value.
       * @api stable
       */
  def get(key: java.lang.String): js.Any = js.native
  /**
       * Get a list of object property names.
       * @return List of property names.
       * @api stable
       */
  def getKeys(): js.Array[java.lang.String] = js.native
  /**
       * Get an object of all property names and values.
       * @return Object.
       * @api stable
       */
  def getProperties(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Sets a value.
       * @param key Key name.
       * @param value Value.
       * @param opt_silent Update without triggering an event.
       * @api stable
       */
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
       * Sets a value.
       * @param key Key name.
       * @param value Value.
       * @param opt_silent Update without triggering an event.
       * @api stable
       */
  def set(key: java.lang.String, value: js.Any, opt_silent: scala.Boolean): scala.Unit = js.native
  /**
       * Sets a collection of key-value pairs.  Note that this changes any existing
       * properties and adds new ones (it does not remove any existing properties).
       * @param values Values.
       * @param opt_silent Update without triggering an event.
       * @api stable
       */
  def setProperties(values: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /**
       * Sets a collection of key-value pairs.  Note that this changes any existing
       * properties and adds new ones (it does not remove any existing properties).
       * @param values Values.
       * @param opt_silent Update without triggering an event.
       * @api stable
       */
  def setProperties(values: ScalablyTyped.runtime.StringDictionary[js.Any], opt_silent: scala.Boolean): scala.Unit = js.native
  /**
       * Unsets a property.
       * @param key Key name.
       * @param opt_silent Unset without triggering an event.
       * @api stable
       */
  def unset(key: java.lang.String): scala.Unit = js.native
  /**
       * Unsets a property.
       * @param key Key name.
       * @param opt_silent Unset without triggering an event.
       * @api stable
       */
  def unset(key: java.lang.String, opt_silent: scala.Boolean): scala.Unit = js.native
}

