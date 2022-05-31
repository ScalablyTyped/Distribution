package typings.openlayers.global.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Object")
@js.native
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
class Object ()
  extends typings.openlayers.mod.Object {
  def this(opt_values: StringDictionary[js.Any]) = this()
}
