package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUxapObjectPageSectionBaseMod.ObjectPageSectionBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageSectionMod {
  
  @JSImport("sap/uxap/ObjectPageSection", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageSection`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectPageSection {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageSectionSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageSectionSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageSectionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageSection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageSection with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.uxap.ObjectPageSectionBase.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageSection]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageSection],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageSection.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageSection
    extends typings.openui5.sapUxapObjectPageSectionBaseMod.default {
    
    /**
      * Adds some subSection to the aggregation {@link #getSubSections subSections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSubSection(
      /**
      * The subSection to add; if empty, nothing is inserted
      */
    oSubSection: typings.openui5.sapUxapObjectPageSubSectionMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.106
      *
      * Destroys the heading in the aggregation {@link #getHeading heading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeading(): this.type = js.native
    
    /**
      * Destroys all the subSections in the aggregation {@link #getSubSections subSections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubSections(): this.type = js.native
    
    /**
      * @SINCE 1.106
      *
      * Gets content of aggregation {@link #getHeading heading}.
      *
      * Section heading content.
      *
      * Note: For some accessibility concerns we encourage you to use non-focusable elements.
      */
    def getHeading(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedSubSection selectedSubSection},
      * or `null`.
      */
    def getSelectedSubSection(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowTitle showTitle}.
      *
      * Determines whether to display the Section title or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showTitle`
      */
    def getShowTitle(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSubSections subSections}.
      *
      * The list of Subsections.
      */
    def getSubSections(): js.Array[typings.openui5.sapUxapObjectPageSubSectionMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getTitleUppercase titleUppercase}.
      *
      * Determines whether the Section title is displayed in upper case.
      *
      * Default value is `true`.
      *
      * @returns Value of property `titleUppercase`
      */
    def getTitleUppercase(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWrapTitle wrapTitle}.
      *
      * Determines whether the Section title wraps on multiple lines, when the available space is not enough.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wrapTitle`
      */
    def getWrapTitle(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.uxap.ObjectPageSubSection` in the aggregation {@link #getSubSections subSections}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSubSection(
      /**
      * The subSection whose index is looked for
      */
    oSubSection: typings.openui5.sapUxapObjectPageSubSectionMod.default
    ): int = js.native
    
    /**
      * Inserts a subSection into the aggregation {@link #getSubSections subSections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSubSection(
      /**
      * The subSection to insert; if empty, nothing is inserted
      */
    oSubSection: typings.openui5.sapUxapObjectPageSubSectionMod.default,
      /**
      * The `0`-based index the subSection should be inserted at; for a negative value of `iIndex`, the subSection
      * is inserted at position 0; for a value greater than the current size of the aggregation, the subSection
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSubSections subSections}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSubSections(): js.Array[typings.openui5.sapUxapObjectPageSubSectionMod.default] = js.native
    
    def removeSubSection(/**
      * The subSection to remove or its index or id
      */
    vSubSection: String): typings.openui5.sapUxapObjectPageSubSectionMod.default | Null = js.native
    /**
      * Removes a subSection from the aggregation {@link #getSubSections subSections}.
      *
      * @returns The removed subSection or `null`
      */
    def removeSubSection(/**
      * The subSection to remove or its index or id
      */
    vSubSection: int): typings.openui5.sapUxapObjectPageSubSectionMod.default | Null = js.native
    def removeSubSection(
      /**
      * The subSection to remove or its index or id
      */
    vSubSection: typings.openui5.sapUxapObjectPageSubSectionMod.default
    ): typings.openui5.sapUxapObjectPageSubSectionMod.default | Null = js.native
    
    /**
      * @SINCE 1.106
      *
      * Sets the aggregated {@link #getHeading heading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeading(/**
      * The heading to set
      */
    oHeading: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the associated {@link #getSelectedSubSection selectedSubSection}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedSubSection(
      /**
      * ID of an element which becomes the new target of this selectedSubSection association; alternatively,
      * an element instance may be given
      */
    oSelectedSubSection: ID
    ): this.type = js.native
    def setSelectedSubSection(
      /**
      * ID of an element which becomes the new target of this selectedSubSection association; alternatively,
      * an element instance may be given
      */
    oSelectedSubSection: typings.openui5.sapUxapObjectPageSubSectionMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowTitle showTitle}.
      *
      * Determines whether to display the Section title or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTitle(): this.type = js.native
    def setShowTitle(/**
      * New value for property `showTitle`
      */
    bShowTitle: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleUppercase titleUppercase}.
      *
      * Determines whether the Section title is displayed in upper case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleUppercase(): this.type = js.native
    def setTitleUppercase(/**
      * New value for property `titleUppercase`
      */
    bTitleUppercase: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWrapTitle wrapTitle}.
      *
      * Determines whether the Section title wraps on multiple lines, when the available space is not enough.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapTitle(): this.type = js.native
    def setWrapTitle(/**
      * New value for property `wrapTitle`
      */
    bWrapTitle: Boolean): this.type = js.native
  }
  
  trait ObjectPageSectionSettings
    extends StObject
       with ObjectPageSectionBaseSettings {
    
    /**
      * @SINCE 1.106
      *
      * Section heading content.
      *
      * Note: For some accessibility concerns we encourage you to use non-focusable elements.
      */
    var heading: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The most recently selected Subsection by the user.
      */
    var selectedSubSection: js.UndefOr[typings.openui5.sapUxapObjectPageSubSectionMod.default | String] = js.undefined
    
    /**
      * Determines whether to display the Section title or not.
      */
    var showTitle: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The list of Subsections.
      */
    var subSections: js.UndefOr[
        js.Array[typings.openui5.sapUxapObjectPageSubSectionMod.default] | typings.openui5.sapUxapObjectPageSubSectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the Section title is displayed in upper case.
      */
    var titleUppercase: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the Section title wraps on multiple lines, when the available space is not enough.
      */
    var wrapTitle: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ObjectPageSectionSettings {
    
    inline def apply(): ObjectPageSectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageSectionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPageSectionSettings] (val x: Self) extends AnyVal {
      
      inline def setHeading(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setSelectedSubSection(value: typings.openui5.sapUxapObjectPageSubSectionMod.default | String): Self = StObject.set(x, "selectedSubSection", value.asInstanceOf[js.Any])
      
      inline def setSelectedSubSectionUndefined: Self = StObject.set(x, "selectedSubSection", js.undefined)
      
      inline def setShowTitle(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      inline def setSubSections(
        value: js.Array[typings.openui5.sapUxapObjectPageSubSectionMod.default] | typings.openui5.sapUxapObjectPageSubSectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "subSections", value.asInstanceOf[js.Any])
      
      inline def setSubSectionsUndefined: Self = StObject.set(x, "subSections", js.undefined)
      
      inline def setSubSectionsVarargs(value: typings.openui5.sapUxapObjectPageSubSectionMod.default*): Self = StObject.set(x, "subSections", js.Array(value*))
      
      inline def setTitleUppercase(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "titleUppercase", value.asInstanceOf[js.Any])
      
      inline def setTitleUppercaseUndefined: Self = StObject.set(x, "titleUppercase", js.undefined)
      
      inline def setWrapTitle(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapTitle", value.asInstanceOf[js.Any])
      
      inline def setWrapTitleUndefined: Self = StObject.set(x, "wrapTitle", js.undefined)
    }
  }
}
