package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsAreaMod {
  
  @JSImport("sap/ui/commons/Area", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Area.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Area {
    def this(/**
      * initial settings for the new control
      */
    mSettings: AreaSettings) = this()
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
    mSettings: AreaSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: AreaSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Area", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Area with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, Area]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Area],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Area.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Area
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getAlt alt}.
      *
      * Alternative text that is displayed in the case the image is not available
      *
      * @returns Value of property `alt`
      */
    def getAlt(): String = js.native
    
    /**
      * Gets current value of property {@link #getCoords coords}.
      *
      * Coordinates of the area
      *
      * @returns Value of property `coords`
      */
    def getCoords(): String = js.native
    
    /**
      * Gets current value of property {@link #getHref href}.
      *
      * Hyper link that is executed when the area is clicked
      *
      * @returns Value of property `href`
      */
    def getHref(): URI = js.native
    
    /**
      * Gets current value of property {@link #getShape shape}.
      *
      * The value is a string and can be 'rect' for rectangle, 'poly' for poligon, 'circle', or default.
      *
      * @returns Value of property `shape`
      */
    def getShape(): String = js.native
    
    /**
      * Sets a new value for property {@link #getAlt alt}.
      *
      * Alternative text that is displayed in the case the image is not available
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlt(): this.type = js.native
    def setAlt(/**
      * New value for property `alt`
      */
    sAlt: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCoords coords}.
      *
      * Coordinates of the area
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCoords(): this.type = js.native
    def setCoords(/**
      * New value for property `coords`
      */
    sCoords: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHref href}.
      *
      * Hyper link that is executed when the area is clicked
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHref(): this.type = js.native
    def setHref(/**
      * New value for property `href`
      */
    sHref: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShape shape}.
      *
      * The value is a string and can be 'rect' for rectangle, 'poly' for poligon, 'circle', or default.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShape(): this.type = js.native
    def setShape(/**
      * New value for property `shape`
      */
    sShape: String): this.type = js.native
  }
  
  trait AreaSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Alternative text that is displayed in the case the image is not available
      */
    var alt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Coordinates of the area
      */
    var coords: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Hyper link that is executed when the area is clicked
      */
    var href: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The value is a string and can be 'rect' for rectangle, 'poly' for poligon, 'circle', or default.
      */
    var shape: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object AreaSettings {
    
    inline def apply(): AreaSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AreaSettings] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCoords(value: String | PropertyBindingInfo): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setHref(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setShape(value: String | PropertyBindingInfo): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    }
  }
}
