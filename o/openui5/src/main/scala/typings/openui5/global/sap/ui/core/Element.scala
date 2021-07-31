package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.Element")
@js.native
/**
  * Constructs and initializes an UI Element with the given <code>sId</code> and settings.If the
  * optional <code>mSettings</code> are given, they must be a JSON-like object (object literal)that
  * defines values for properties, aggregations, associations or events keyed by their name.<b>Valid
  * Names:</b>The property (key) names supported in the object literal are exactly the (case
  * sensitive)names documented in the JSDoc for the properties, aggregations, associations and eventsof
  * the control and its base classes. Note that for  0..n aggregations and associations thisusually is
  * the plural name, whereas it is the singular name in case of 0..1 relations.If a key name is
  * ambiguous for a specific control class (e.g. a property has the samename as an event), then this
  * method prefers property, aggregation, association andevent in that order. To resolve such
  * ambiguities, the keys can be prefixed with<code>aggregation:</code>, <code>association:</code> or
  * <code>event:</code>.In that case the keys must be quoted due to the ':'.Each subclass should
  * document the set of supported names in its constructor documentation.<b>Valid Values:</b><ul><li>for
  * normal properties, the value has to be of the correct simple type (no type conversion occurs)<li>for
  * 0..1 aggregations, the value has to be an instance of the aggregated control or element type<li>for
  * 0..n aggregations, the value has to be an array of instances of the aggregated type<li>for 0..1
  * associations, an instance of the associated type or an id (string) is accepted<li>0..n associations
  * are not supported yet<li>for events either a function (event handler) is accepted or an array of
  * length 2    where the first element is a function and the 2nd element is an object to invoke the
  * method on.</ul>Special aggregation "dependents" is connected to the lifecycle management and
  * databinding,but not rendered automatically and can be used for popups or other dependent controls.
  * This allowsdefinition of popup controls in declarative views and enables propagation of model and
  * contextinformation to them.Accepts an object literal <code>mSettings</code> that defines
  * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
  * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
  * object.
  * @param sId id for the new control; generated automatically if no non-empty id is given     Note:
  * this can be omitted, no matter whether <code>mSettings</code> will be given or not!
  * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
  * the new element
  */
class Element ()
  extends StObject
     with typings.openui5.sap.ui.core.Element {
  def this(mSettings: js.Any) = this()
  /**
    * Constructs and initializes an UI Element with the given <code>sId</code> and settings.If the
    * optional <code>mSettings</code> are given, they must be a JSON-like object (object literal)that
    * defines values for properties, aggregations, associations or events keyed by their name.<b>Valid
    * Names:</b>The property (key) names supported in the object literal are exactly the (case
    * sensitive)names documented in the JSDoc for the properties, aggregations, associations and eventsof
    * the control and its base classes. Note that for  0..n aggregations and associations thisusually is
    * the plural name, whereas it is the singular name in case of 0..1 relations.If a key name is
    * ambiguous for a specific control class (e.g. a property has the samename as an event), then this
    * method prefers property, aggregation, association andevent in that order. To resolve such
    * ambiguities, the keys can be prefixed with<code>aggregation:</code>, <code>association:</code> or
    * <code>event:</code>.In that case the keys must be quoted due to the ':'.Each subclass should
    * document the set of supported names in its constructor documentation.<b>Valid Values:</b><ul><li>for
    * normal properties, the value has to be of the correct simple type (no type conversion occurs)<li>for
    * 0..1 aggregations, the value has to be an instance of the aggregated control or element type<li>for
    * 0..n aggregations, the value has to be an array of instances of the aggregated type<li>for 0..1
    * associations, an instance of the associated type or an id (string) is accepted<li>0..n associations
    * are not supported yet<li>for events either a function (event handler) is accepted or an array of
    * length 2    where the first element is a function and the 2nd element is an object to invoke the
    * method on.</ul>Special aggregation "dependents" is connected to the lifecycle management and
    * databinding,but not rendered automatically and can be used for popups or other dependent controls.
    * This allowsdefinition of popup controls in declarative views and enables propagation of model and
    * contextinformation to them.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control; generated automatically if no non-empty id is given     Note:
    * this can be omitted, no matter whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
    * the new element
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
}
