package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsAccordionMod {
  
  @JSImport("sap/ui/commons/Accordion", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Accordion.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Accordion {
    def this(/**
      * initial settings for the new control
      */
    mSettings: AccordionSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: AccordionSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: AccordionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Accordion with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Accordion]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Accordion],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Accordion.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Accordion
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some section to the aggregation {@link #getSections sections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSection(
      /**
      * The section to add; if empty, nothing is inserted
      */
    oSection: typings.openui5.sapUiCommonsAccordionSectionMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sectionClose sectionClose} event of this `sap.ui.commons.Accordion`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Accordion` itself.
      *
      * Event is triggered when the user closes a section.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionCloseEvent, Unit]
    ): this.type = js.native
    def attachSectionClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Accordion` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sectionClose sectionClose} event of this `sap.ui.commons.Accordion`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Accordion` itself.
      *
      * Event is triggered when the user closes a section.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionCloseEvent, Unit]
    ): this.type = js.native
    def attachSectionClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Accordion` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sectionOpen sectionOpen} event of this `sap.ui.commons.Accordion`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Accordion` itself.
      *
      * Event is triggered when the user opens a section.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionOpenEvent, Unit]
    ): this.type = js.native
    def attachSectionOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Accordion` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sectionOpen sectionOpen} event of this `sap.ui.commons.Accordion`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Accordion` itself.
      *
      * Event is triggered when the user opens a section.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionOpenEvent, Unit]
    ): this.type = js.native
    def attachSectionOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Accordion` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sectionsReorder sectionsReorder} event of this
      * `sap.ui.commons.Accordion`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Accordion` itself.
      *
      * Event is triggered when the user changes the position of a section.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionsReorder(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionsReorderEvent, Unit]
    ): this.type = js.native
    def attachSectionsReorder(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionsReorderEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Accordion` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sectionsReorder sectionsReorder} event of this
      * `sap.ui.commons.Accordion`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Accordion` itself.
      *
      * Event is triggered when the user changes the position of a section.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionsReorder(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionsReorderEvent, Unit]
    ): this.type = js.native
    def attachSectionsReorder(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionsReorderEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Accordion` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes a section and opens the default one
      */
    def closeSection(/**
      * Id of the section that is being closed
      */
    sSectionId: String): Unit = js.native
    
    /**
      * Destroys all the sections in the aggregation {@link #getSections sections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySections(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:sectionClose sectionClose} event of this `sap.ui.commons.Accordion`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSectionClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionCloseEvent, Unit]
    ): this.type = js.native
    def detachSectionClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionCloseEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:sectionOpen sectionOpen} event of this `sap.ui.commons.Accordion`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSectionOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionOpenEvent, Unit]
    ): this.type = js.native
    def detachSectionOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:sectionsReorder sectionsReorder} event of
      * this `sap.ui.commons.Accordion`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSectionsReorder(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionsReorderEvent, Unit]
    ): this.type = js.native
    def detachSectionsReorder(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AccordionSectionsReorderEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:sectionClose sectionClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSectionClose(): this.type = js.native
    def fireSectionClose(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Accordion$SectionCloseEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:sectionOpen sectionOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSectionOpen(): this.type = js.native
    def fireSectionOpen(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Accordion$SectionOpenEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:sectionsReorder sectionsReorder} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSectionsReorder(): this.type = js.native
    def fireSectionsReorder(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Accordion$SectionsReorderEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getOpenedSectionsId openedSectionsId}.
      *
      * Section IDs that are opened by default at application start
      *
      * @returns Value of property `openedSectionsId`
      */
    def getOpenedSectionsId(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSections sections}.
      *
      * Empty container used to display any library control
      */
    def getSections(): js.Array[typings.openui5.sapUiCommonsAccordionSectionMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * When the specified width is less than the width of a section content, a horizontal scroll bar is provided.
      *
      * Default value is `'200px'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.AccordionSection` in the aggregation {@link #getSections sections}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSection(
      /**
      * The section whose index is looked for
      */
    oSection: typings.openui5.sapUiCommonsAccordionSectionMod.default
    ): int = js.native
    
    /**
      * Inserts a section into the aggregation {@link #getSections sections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSection(
      /**
      * The section to insert; if empty, nothing is inserted
      */
    oSection: typings.openui5.sapUiCommonsAccordionSectionMod.default,
      /**
      * The `0`-based index the section should be inserted at; for a negative value of `iIndex`, the section
      * is inserted at position 0; for a value greater than the current size of the aggregation, the section
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens a section
      */
    def openSection(/**
      * Id of the section that is being opened
      */
    sSectionId: String): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSections sections}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSections(): js.Array[typings.openui5.sapUiCommonsAccordionSectionMod.default] = js.native
    
    def removeSection(/**
      * The section to remove or its index or id
      */
    vSection: String): typings.openui5.sapUiCommonsAccordionSectionMod.default | Null = js.native
    /**
      * Removes a section from the aggregation {@link #getSections sections}.
      *
      * @returns The removed section or `null`
      */
    def removeSection(/**
      * The section to remove or its index or id
      */
    vSection: int): typings.openui5.sapUiCommonsAccordionSectionMod.default | Null = js.native
    def removeSection(
      /**
      * The section to remove or its index or id
      */
    vSection: typings.openui5.sapUiCommonsAccordionSectionMod.default
    ): typings.openui5.sapUiCommonsAccordionSectionMod.default | Null = js.native
    
    /**
      * Redefinition of the method to add additional handling
      *
      * @returns 'this' to allow method chaining
      */
    def setOpenedSectionsId(/**
      * New value for property openedSectionsId
      */
    sOpenedSectionsId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * When the specified width is less than the width of a section content, a horizontal scroll bar is provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'200px'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait Accordion$SectionCloseEventParameters extends StObject {
    
    /**
      * ID of the closed section
      */
    var closeSectionId: js.UndefOr[String] = js.undefined
  }
  object Accordion$SectionCloseEventParameters {
    
    inline def apply(): Accordion$SectionCloseEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accordion$SectionCloseEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accordion$SectionCloseEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCloseSectionId(value: String): Self = StObject.set(x, "closeSectionId", value.asInstanceOf[js.Any])
      
      inline def setCloseSectionIdUndefined: Self = StObject.set(x, "closeSectionId", js.undefined)
    }
  }
  
  trait Accordion$SectionOpenEventParameters extends StObject {
    
    /**
      * IDs of the sections to be closed. Can be initial in the case of no previously opened section.
      */
    var closeSectionIds: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * ID of the opened section
      */
    var openSectionId: js.UndefOr[String] = js.undefined
  }
  object Accordion$SectionOpenEventParameters {
    
    inline def apply(): Accordion$SectionOpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accordion$SectionOpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accordion$SectionOpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCloseSectionIds(value: js.Array[String]): Self = StObject.set(x, "closeSectionIds", value.asInstanceOf[js.Any])
      
      inline def setCloseSectionIdsUndefined: Self = StObject.set(x, "closeSectionIds", js.undefined)
      
      inline def setCloseSectionIdsVarargs(value: String*): Self = StObject.set(x, "closeSectionIds", js.Array(value*))
      
      inline def setOpenSectionId(value: String): Self = StObject.set(x, "openSectionId", value.asInstanceOf[js.Any])
      
      inline def setOpenSectionIdUndefined: Self = StObject.set(x, "openSectionId", js.undefined)
    }
  }
  
  trait Accordion$SectionsReorderEventParameters extends StObject {
    
    /**
      * ID of the moved section
      */
    var movedSectionId: js.UndefOr[String] = js.undefined
    
    /**
      * New index of the moved section
      */
    var newIndex: js.UndefOr[int] = js.undefined
  }
  object Accordion$SectionsReorderEventParameters {
    
    inline def apply(): Accordion$SectionsReorderEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accordion$SectionsReorderEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accordion$SectionsReorderEventParameters] (val x: Self) extends AnyVal {
      
      inline def setMovedSectionId(value: String): Self = StObject.set(x, "movedSectionId", value.asInstanceOf[js.Any])
      
      inline def setMovedSectionIdUndefined: Self = StObject.set(x, "movedSectionId", js.undefined)
      
      inline def setNewIndex(value: int): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    }
  }
  
  type AccordionSectionCloseEvent = typings.openui5.sapUiBaseEventMod.default[Accordion$SectionCloseEventParameters]
  
  type AccordionSectionCloseEventParameters = Accordion$SectionCloseEventParameters
  
  type AccordionSectionOpenEvent = typings.openui5.sapUiBaseEventMod.default[Accordion$SectionOpenEventParameters]
  
  type AccordionSectionOpenEventParameters = Accordion$SectionOpenEventParameters
  
  type AccordionSectionsReorderEvent = typings.openui5.sapUiBaseEventMod.default[Accordion$SectionsReorderEventParameters]
  
  type AccordionSectionsReorderEventParameters = Accordion$SectionsReorderEventParameters
  
  trait AccordionSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Section IDs that are opened by default at application start
      */
    var openedSectionsId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is triggered when the user closes a section.
      */
    var sectionClose: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Accordion$SectionCloseEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event is triggered when the user opens a section.
      */
    var sectionOpen: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Accordion$SectionOpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Empty container used to display any library control
      */
    var sections: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsAccordionSectionMod.default] | typings.openui5.sapUiCommonsAccordionSectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is triggered when the user changes the position of a section.
      */
    var sectionsReorder: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Accordion$SectionsReorderEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * When the specified width is less than the width of a section content, a horizontal scroll bar is provided.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object AccordionSettings {
    
    inline def apply(): AccordionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccordionSettings] (val x: Self) extends AnyVal {
      
      inline def setOpenedSectionsId(value: String | PropertyBindingInfo): Self = StObject.set(x, "openedSectionsId", value.asInstanceOf[js.Any])
      
      inline def setOpenedSectionsIdUndefined: Self = StObject.set(x, "openedSectionsId", js.undefined)
      
      inline def setSectionClose(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Accordion$SectionCloseEventParameters] => Unit
      ): Self = StObject.set(x, "sectionClose", js.Any.fromFunction1(value))
      
      inline def setSectionCloseUndefined: Self = StObject.set(x, "sectionClose", js.undefined)
      
      inline def setSectionOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Accordion$SectionOpenEventParameters] => Unit
      ): Self = StObject.set(x, "sectionOpen", js.Any.fromFunction1(value))
      
      inline def setSectionOpenUndefined: Self = StObject.set(x, "sectionOpen", js.undefined)
      
      inline def setSections(
        value: js.Array[typings.openui5.sapUiCommonsAccordionSectionMod.default] | typings.openui5.sapUiCommonsAccordionSectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsReorder(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Accordion$SectionsReorderEventParameters] => Unit
      ): Self = StObject.set(x, "sectionsReorder", js.Any.fromFunction1(value))
      
      inline def setSectionsReorderUndefined: Self = StObject.set(x, "sectionsReorder", js.undefined)
      
      inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
      
      inline def setSectionsVarargs(value: typings.openui5.sapUiCommonsAccordionSectionMod.default*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
