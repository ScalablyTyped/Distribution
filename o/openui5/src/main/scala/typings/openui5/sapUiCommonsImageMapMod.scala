package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsImageMapMod {
  
  @JSImport("sap/ui/commons/ImageMap", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ImageMap.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ImageMap {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ImageMapSettings) = this()
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
    mSettings: ImageMapSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ImageMapSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ImageMap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ImageMap with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ImageMap]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ImageMap],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ImageMap.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ImageMap
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some area to the aggregation {@link #getAreas areas}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addArea(
      /**
      * The area to add; if empty, nothing is inserted
      */
    oArea: typings.openui5.sapUiCommonsAreaMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.ImageMap`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ImageMap` itself.
      *
      * Event for the areas that can be clicked in an ImageMap
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ImageMapPressEvent, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ImageMapPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ImageMap` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.ImageMap`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ImageMap` itself.
      *
      * Event for the areas that can be clicked in an ImageMap
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ImageMapPressEvent, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ImageMapPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ImageMap` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Adds areas to the Image Map.
      *
      * Each argument must be either a JSon object or a list of objects or the area element or elements.
      *
      * @returns `this` to allow method chaining
      */
    def createArea(/**
      * Area content to add
      */
    content: Any): this.type = js.native
    
    /**
      * Destroys all the areas in the aggregation {@link #getAreas areas}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAreas(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.ui.commons.ImageMap`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ImageMapPressEvent, Unit]
    ): this.type = js.native
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ImageMapPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: ImageMap$PressEventParameters): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAreas areas}.
      *
      * Area representing the reference to the target location
      */
    def getAreas(): js.Array[typings.openui5.sapUiCommonsAreaMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Name for the image that serves as reference
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.Area` in the aggregation {@link #getAreas areas}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfArea(/**
      * The area whose index is looked for
      */
    oArea: typings.openui5.sapUiCommonsAreaMod.default): int = js.native
    
    /**
      * Inserts a area into the aggregation {@link #getAreas areas}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertArea(
      /**
      * The area to insert; if empty, nothing is inserted
      */
    oArea: typings.openui5.sapUiCommonsAreaMod.default,
      /**
      * The `0`-based index the area should be inserted at; for a negative value of `iIndex`, the area is inserted
      * at position 0; for a value greater than the current size of the aggregation, the area is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAreas areas}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAreas(): js.Array[typings.openui5.sapUiCommonsAreaMod.default] = js.native
    
    def removeArea(/**
      * The area to remove or its index or id
      */
    vArea: String): typings.openui5.sapUiCommonsAreaMod.default | Null = js.native
    /**
      * Removes a area from the aggregation {@link #getAreas areas}.
      *
      * @returns The removed area or `null`
      */
    def removeArea(/**
      * The area to remove or its index or id
      */
    vArea: int): typings.openui5.sapUiCommonsAreaMod.default | Null = js.native
    def removeArea(
      /**
      * The area to remove or its index or id
      */
    vArea: typings.openui5.sapUiCommonsAreaMod.default
    ): typings.openui5.sapUiCommonsAreaMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Name for the image that serves as reference
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
  }
  
  trait ImageMap$PressEventParameters extends StObject {
    
    /**
      * Id of clicked Area.
      */
    var areaId: js.UndefOr[String] = js.undefined
  }
  object ImageMap$PressEventParameters {
    
    inline def apply(): ImageMap$PressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageMap$PressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageMap$PressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAreaId(value: String): Self = StObject.set(x, "areaId", value.asInstanceOf[js.Any])
      
      inline def setAreaIdUndefined: Self = StObject.set(x, "areaId", js.undefined)
    }
  }
  
  type ImageMapPressEvent = typings.openui5.sapUiBaseEventMod.default[ImageMap$PressEventParameters]
  
  type ImageMapPressEventParameters = ImageMap$PressEventParameters
  
  trait ImageMapSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Area representing the reference to the target location
      */
    var areas: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsAreaMod.default] | typings.openui5.sapUiCommonsAreaMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Name for the image that serves as reference
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event for the areas that can be clicked in an ImageMap
      */
    var press: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ImageMap$PressEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object ImageMapSettings {
    
    inline def apply(): ImageMapSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageMapSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageMapSettings] (val x: Self) extends AnyVal {
      
      inline def setAreas(
        value: js.Array[typings.openui5.sapUiCommonsAreaMod.default] | typings.openui5.sapUiCommonsAreaMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
      
      inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
      
      inline def setAreasVarargs(value: typings.openui5.sapUiCommonsAreaMod.default*): Self = StObject.set(x, "areas", js.Array(value*))
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ImageMap$PressEventParameters] => Unit
      ): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
    }
  }
}
