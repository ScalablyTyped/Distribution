package typings.openui5

import typings.openui5.anon.Metadata
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Aggregation
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Association
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Event
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Property
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseManagedObjectMetadataMod {
  
  @JSImport("sap/ui/base/ManagedObjectMetadata", JSImport.Default)
  @js.native
  open class default protected () extends ManagedObjectMetadata {
    /**
      * Creates a new metadata object that describes a subclass of ManagedObject.
      *
      * **Note:** Code outside the `sap.ui.base` namespace must not call this constructor directly. Instances
      * will be created automatically when a new class is defined with one of the {@link sap.ui.base.ManagedObject.extend SomeClass.extend }
      * methods.
      *
      * **Note**: throughout this class documentation, the described subclass of ManagedObject is referenced
      * as the described class.
      */
    def this(
      /**
      * fully qualified name of the described class
      */
    sClassName: String,
      /**
      * static info to construct the metadata from
      */
    oClassInfo: Metadata
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/base/ManagedObjectMetadata", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Adds information to the given oAggregatedObject about its original API parent (or a subsequent API parent
      * in case of multiple forwarding). MUST be called before an element is forwarded to another internal aggregation
      * (in case forwarding is done explicitly/manually without using the declarative mechanism introduced in
      * UI5 1.56).
      *
      * CAUTION: ManagedObjectMetadata.addAPIParentInfoEnd(...) MUST be called AFTER the element has been forwarded
      * (set to an aggregation of an internal control). These two calls must wrap the forwarding.
      */
    inline def addAPIParentInfoBegin(
      /**
      * Object to which the new API parent info should be added
      */
    oAggregatedObject: typings.openui5.sapUiBaseManagedObjectMod.default,
      /**
      * Object that is a new API parent
      */
    oParent: typings.openui5.sapUiBaseManagedObjectMod.default,
      /**
      * the name of the aggregation under which oAggregatedObject is aggregated by the API parent
      */
    sAggregationName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAPIParentInfoBegin")(oAggregatedObject.asInstanceOf[js.Any], oParent.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Completes the information about the original API parent of the given element. MUST be called after an
      * element is forwarded to another internal aggregation. For every call to ManagedObjectMetadata.addAPIParentInfoBegin(...)
      * this method here must be called as well.
      */
    inline def addAPIParentInfoEnd(
      /**
      * Object to which the new API parent info should be added
      */
    oAggregatedObject: typings.openui5.sapUiBaseManagedObjectMod.default
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAPIParentInfoEnd")(oAggregatedObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Test whether a given ID looks like it was automatically generated.
      *
      * Examples:
      * ```javascript
      *
      * True for:
      *   "foo--__bar04--baz"
      *   "foo--__bar04"
      *   "__bar04--baz"
      *   "__bar04"
      *   "__bar04--"
      *   "__bar04--foo"
      * False for:
      *   "foo__bar04"
      *   "foo__bar04--baz"
      * ```
      *
      *
      * See {@link sap.ui.base.ManagedObjectMetadata.prototype.uid} for details on ID generation.
      *
      * @returns whether the ID is likely to be generated
      */
    inline def isGeneratedId(/**
      * the ID that should be tested
      */
    sId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratedId")(sId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Calculates a new ID based on a prefix.
      *
      * To guarantee uniqueness of the generated IDs across all ID prefixes, prefixes must not end with digits.
      *
      * @returns A (hopefully unique) control id
      */
    inline def uid(/**
      * prefix for the new ID
      */
    sIdPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")(sIdPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait ManagedObjectMetadata
    extends typings.openui5.sapUiBaseMetadataMod.default {
    
    /**
      * @since 1.27.0
      *
      * Returns an info object for the named public aggregation of the described class no matter whether the
      * aggregation was defined by the class itself or by one of its ancestor classes.
      *
      * If neither the class nor its ancestor classes define a public aggregation with the given name, `undefined`
      * is returned.
      *
      * If the name is not given (or has a falsy value), then it is substituted by the name of the default aggregation
      * of the 'described class' (if any).
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns An info object describing the aggregation or `undefined`
      */
    def getAggregation(): js.UndefOr[Aggregation] = js.native
    def getAggregation(/**
      * name of the aggregation or empty
      */
    sName: String): js.UndefOr[Aggregation] = js.native
    
    /**
      * Returns a map of info objects for the public aggregations of the described class. Aggregations declared
      * by ancestor classes are not included.
      *
      * The returned map keys the aggregation info objects by their name. In case of 0..1 aggregations this is
      * the singular name, otherwise it is the plural name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of aggregation info objects keyed by aggregation names
      */
    def getAggregations(): Record[String, Aggregation] = js.native
    
    /**
      * Returns a map of info objects for all public aggregations of the described class, including public aggregations
      * form the ancestor classes.
      *
      * The returned map keys the aggregation info objects by their name. In case of 0..1 aggregations this is
      * the singular name, otherwise it is the plural name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of aggregation info objects keyed by aggregation names
      */
    def getAllAggregations(): Record[String, Aggregation] = js.native
    
    /**
      * Returns a map of info objects for all public associations of the described class, including public associations
      * form the ancestor classes.
      *
      * The returned map keys the association info objects by their name. In case of 0..1 associations this is
      * the singular name, otherwise it is the plural name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of association info objects keyed by association names
      */
    def getAllAssociations(): Record[String, Association] = js.native
    
    /**
      * Returns a map of info objects for all public events of the described class, including public events form
      * the ancestor classes.
      *
      * The returned map keys the event info objects by their name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of event info objects keyed by event names
      */
    def getAllEvents(): Record[String, Event] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a map of info objects for all private (hidden) aggregations of the described class, including
      * private aggregations from the ancestor classes.
      *
      * The returned map contains aggregation info objects keyed by the aggregation name. In case of 0..1 aggregations
      * this is the singular name, otherwise it is the plural name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of aggregation info objects keyed by aggregation names
      */
    def getAllPrivateAggregations(): Record[String, Aggregation] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a map of info objects for all private (hidden) associations of the described class, including
      * private associations from the ancestor classes.
      *
      * The returned map contains association info objects keyed by the association name. In case of 0..1 associations
      * this is the singular name, otherwise it is the plural name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of association info objects keyed by association names
      */
    def getAllPrivateAssociations(): Record[String, Association] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a map of info objects for all private (hidden) properties of the described class, including private
      * properties from the ancestor classes.
      *
      * The returned map contains property info objects keyed by the property name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of property info objects keyed by property names
      */
    def getAllPrivateProperties(): Record[String, Property] = js.native
    
    /**
      * Returns a map of info objects for all public properties of the described class, including public properties
      * from the ancestor classes.
      *
      * The returned map keys the property info objects by their name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of property info objects keyed by the property names
      */
    def getAllProperties(): Record[String, Property] = js.native
    
    /**
      * @since 1.27.0
      *
      * Returns an info object for the named public association of the described class, no matter whether the
      * association was defined by the class itself or by one of its ancestor classes.
      *
      * If neither the described class nor its ancestor classes define an association with the given name, `undefined`
      * is returned.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns An info object describing the association or `undefined`
      */
    def getAssociation(/**
      * name of the association
      */
    sName: String): js.UndefOr[Association] = js.native
    
    /**
      * Returns a map of info objects for all public associations of the described class. Associations declared
      * by ancestor classes are not included.
      *
      * The returned map keys the association info objects by their name. In case of 0..1 associations this is
      * the singular name, otherwise it is the plural name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of association info objects keyed by association names
      */
    def getAssociations(): Record[String, Association] = js.native
    
    /**
      * @since 1.73
      *
      * Returns an info object for the default aggregation of the described class.
      *
      * If the class itself does not define a default aggregation, then the info object for the default aggregation
      * of the parent class is returned.
      *
      * @returns An info object for the default aggregation
      */
    def getDefaultAggregation(): Aggregation = js.native
    
    /**
      * @since 1.73
      *
      * Returns the name of the default aggregation of the described class.
      *
      * If the class itself does not define a default aggregation, then the default aggregation of the parent
      * is returned. If no class in the hierarchy defines a default aggregation, `undefined` is returned.
      *
      * @returns Name of the default aggregation
      */
    def getDefaultAggregationName(): String = js.native
    
    /**
      * @since 1.27.0
      *
      * Returns an info object for the named public event of the described class, no matter whether the event
      * was defined by the class itself or by one of its ancestor classes.
      *
      * If neither the described class nor its ancestor classes define an event with the given name, `undefined`
      * is returned.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns An info object describing the event or `undefined`
      */
    def getEvent(/**
      * name of the event
      */
    sName: String): js.UndefOr[Event] = js.native
    
    /**
      * Returns a map of info objects for the public events of the described class. Events declared by ancestor
      * classes are not included.
      *
      * The returned map keys the event info objects by their name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of event info objects keyed by event names
      */
    def getEvents(): Record[String, Event] = js.native
    
    /**
      * Returns the name of the library that contains the described UIElement.
      *
      * @returns the name of the library
      */
    def getLibraryName(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the info object for the named public or private aggregation declared by the described class or
      * by any of its ancestors.
      *
      * If the name is not given (or has a falsy value), then it is substituted by the name of the default aggregation
      * of the described class (if it is defined).
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns aggregation info object or `undefined`
      */
    def getManagedAggregation(/**
      * name of the aggregation to be retrieved or empty
      */
    sAggregationName: String): js.UndefOr[Aggregation] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the info object for the named public or private association declared by the described class or
      * by any of its ancestors.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns association info object or `undefined`
      */
    def getManagedAssociation(/**
      * name of the association to be retrieved
      */
    sName: String): js.UndefOr[Association] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the info object for the named public or private property declared by the described class or by
      * any of its ancestors.
      *
      * If the name is not given (or has a falsy value), then it is substituted by the name of the default property
      * of the described class (if it is defined).
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns property info object or `undefined`
      */
    def getManagedProperty(/**
      * name of the property to be retrieved or empty
      */
    sName: String): js.UndefOr[Property] = js.native
    
    /**
      * Returns a map of info objects for the public properties of the described class. Properties declared by
      * ancestor classes are not included.
      *
      * The returned map keys the property info objects by their name.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns Map of property info objects keyed by the property names
      */
    def getProperties(): Record[String, Property] = js.native
    
    /**
      * @since 1.27.0
      *
      * Returns an info object for the named public property of the described class, no matter whether the property
      * was defined by the class itself or by one of its ancestor classes.
      *
      * If neither the described class nor its ancestor classes define a property with the given name, `undefined`
      * is returned.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns An info object describing the property or `undefined`
      */
    def getProperty(/**
      * name of the property
      */
    sName: String): js.UndefOr[Property] = js.native
    
    /**
      * Returns a map of default values for all properties declared by the described class and its ancestors,
      * keyed by the property name.
      *
      * @returns Map of default values keyed by property names
      */
    def getPropertyDefaults(): Record[String, Any] = js.native
    
    /**
      * @since 1.27.0
      *
      * Returns an info object for a public setting with the given name that either is a public property or a
      * public aggregation of cardinality 0..1 and with at least one simple alternative type. The setting can
      * be defined by the class itself or by one of its ancestor classes.
      *
      * If neither the described class nor its ancestor classes define a suitable setting with the given name,
      * `undefined` is returned.
      *
      * **Warning:** Type, structure and behavior of the returned info objects is not documented and therefore
      * not part of the API. See the {@link #constructor Notes about Info objects} in the constructor documentation
      * of this class.
      *
      * @returns An info object describing the property or aggregation or `undefined`
      */
    def getPropertyLikeSetting(/**
      * name of the property like setting
      */
    sName: String): js.UndefOr[Property | Aggregation] = js.native
    
    /**
      * Checks the existence of the given public aggregation by its name.
      *
      * @returns true, if the aggregation exists
      */
    def hasAggregation(/**
      * name of the aggregation
      */
    sName: String): Boolean = js.native
    
    /**
      * Checks the existence of the given public association by its name
      *
      * @returns true, if the association exists
      */
    def hasAssociation(/**
      * name of the association
      */
    sName: String): Boolean = js.native
    
    /**
      * Checks the existence of the given event by its name
      *
      * @returns true, if the event exists
      */
    def hasEvent(/**
      * name of the event
      */
    sName: String): Boolean = js.native
    
    /**
      * Checks the existence of the given public property by its name
      *
      * @returns true, if the property exists
      */
    def hasProperty(/**
      * name of the property
      */
    sName: String): Boolean = js.native
    
    /**
      * Calculates a new ID for an instance of this class.
      *
      * Note that the calculated short name part is usually not unique across all classes, but doesn't have to
      * be. It might even be empty when the class name consists of invalid characters only.
      *
      * @returns A (hopefully unique) control ID
      */
    def uid(): String = js.native
  }
}
