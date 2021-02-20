package typings.openui5.global.sap.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base {
  
  @JSGlobal("sap.ui.base.Event")
  @js.native
  class Event protected ()
    extends typings.openui5.sap.ui.base.Event {
    /**
      * Creates an event with the given <code>sId</code>, linked to the provided <code>oSource</code> and
      * enriched with the <code>mParameters</code>.
      * @param sId The id of the event
      * @param oSource The source of the event
      * @param mParameters A map of parameters for this event
      */
    def this(sId: String, oSource: typings.openui5.sap.ui.base.EventProvider, mParameters: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.base.EventProvider")
  @js.native
  /**
    * Creates an instance of EventProvider.
    */
  abstract class EventProvider ()
    extends typings.openui5.sap.ui.base.EventProvider
  
  @JSGlobal("sap.ui.base.Interface")
  @js.native
  class Interface protected ()
    extends typings.openui5.sap.ui.base.Interface {
    /**
      * Constructs an instance of sap.ui.base.Interface which restricts access to methods marked as public.
      * @param oObject the instance that needs an interface created
      * @param aMethods the names of the methods, that should be available on this interface
      */
    def this(oObject: typings.openui5.sap.ui.base.Object, aMethods: js.Array[String]) = this()
  }
  
  @JSGlobal("sap.ui.base.ManagedObject")
  @js.native
  class ManagedObject protected ()
    extends typings.openui5.sap.ui.base.ManagedObject {
    /**
      * Constructs and initializes a managed object with the given <code>sId</code> and settings.If the
      * optional <code>mSettings</code> are given, they must be a simple objectthat defines values for
      * properties, aggregations, associations or events keyed by their name.<b>Valid Names and Value
      * Ranges:</b>The property (key) names supported in the object literal are exactly the (case
      * sensitive)names documented in the JSDoc for the properties, aggregations, associations and eventsof
      * the current class and its base classes. Note that for 0..n aggregations and associations thisname
      * usually is the plural name, whereas it is the singular name in case of 0..1 relations.If a key name
      * is ambiguous for a specific managed object class (e.g. a property has the samename as an event),
      * then this method prefers property, aggregation, association andevent in that order. To resolve such
      * ambiguities, the keys can be prefixed with<code>aggregation:</code>, <code>association:</code> or
      * <code>event:</code>(such keys containing a colon (':') must be quoted to be valid Javascript).The
      * possible values for a setting depend on its kind:<ul><li>for simple properties, the value has to
      * match the documented type of the property (no type conversion occurs)<li>for 0..1 aggregations, the
      * value has to be an instance of the aggregated type<li>for 0..n aggregations, the value has to be an
      * array of instances of the aggregated type or a single instance<li>for 0..1 associations, an instance
      * of the associated type or an id (string) is accepted<li>for 0..n associations, an array of instances
      * of the associated type or of Ids is accepted<li>for events either a function (event handler) is
      * accepted or an array of length 2    where the first element is a function and the 2nd element is an
      * object to invoke the method on.</ul>Each subclass should document the name and type of its supported
      * settings in its constructor documentation.Besides the settings documented below, ManagedObject
      * itself supports the following special settings:<ul><li><code>id : <i>any</i></code> an ID
      * for the new instance. Some subclasses (Element, Component) require the id  to be unique in a
      * specific scope (e.g. an Element Id must be unique across all Elements, a Component id must  be
      * unique across all Components).<li><code>models : <i>object</i></code> a map of {@link
      * sap.ui.model.Model} instances keyed by their model name (alias).  Each entry with key <i>k</i> in
      * this object has the same effect as a call <code>this.setModel(models[k],
      * k);</code>.</li><li><code>bindingContexts : <i>object</i></code> a map of {@link
      * sap.ui.model.Context} instances keyed by their model name.  Each entry with key <i>k</i> in this
      * object has the same effect as a call <code>this.setBindingContext(bindingContexts[k],
      * k);</code></li><li><code>objectBindings : <i>object</i></code>  a map of binding paths keyed by the
      * corresponding model name.  Each entry with key <i>k</i> in this object has the same effect as a call
      * <code>this.bindObject(objectBindings[k], k);</code></li></ul>
      * @param sId id for the new managed object; generated automatically if no non-empty id is given    
      * Note: this can be omitted, no matter whether <code>mSettings</code> will be given or not!
      * @param mSettings Optional map/JSON-object with initial property values, aggregated objects etc. for
      * the new object
      * @param oScope Scope object for resolving string based type and formatter references in bindings.    
      * When a scope object is given, <code>mSettings</code> cannot be omitted, at least <code>null</code>
      * or an empty object literal must be given.
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    def this(sId: String, mSettings: js.UndefOr[scala.Nothing], oScope: js.Any) = this()
    def this(sId: String, mSettings: js.Any, oScope: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.base.Metadata")
  @js.native
  class Metadata protected ()
    extends typings.openui5.sap.ui.base.Metadata {
    /**
      * Creates a new metadata object from the given static infos.Note: throughout this class documentation,
      * the described subclass of Objectis referenced as <i>the described class</i>.
      * @param sClassName fully qualified name of the described class
      * @param oClassInfo info to construct the class and its metadata from
      */
    def this(sClassName: String, oClassInfo: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.base.Object")
  @js.native
  /**
    * Constructor for a sap.ui.base.Object.
    */
  abstract class Object ()
    extends typings.openui5.sap.ui.base.Object
  
  @JSGlobal("sap.ui.base.ObjectPool")
  @js.native
  class ObjectPool protected ()
    extends typings.openui5.sap.ui.base.ObjectPool {
    /**
      * Creates an ObjectPool instance based on the given oObjectClass.&lt;br/&gt;If there is a free pooled
      * instance, returns that one, otherwise creates a new one.&lt;br/&gt;In order to be maintained by the
      * ObjectPool, oObjectClass must implementmethods described in the class description.
      * @param oObjectClass constructor for the class of objects that this pool should manage
      */
    def this(oObjectClass: js.Any) = this()
  }
}
