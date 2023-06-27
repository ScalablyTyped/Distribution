package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIllustrationMod {
  
  @JSImport("sap/m/Illustration", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Illustration`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Illustration {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IllustrationSettings) = this()
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
    mSettings: IllustrationSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IllustrationSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Illustration", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Illustration with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Illustration]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Illustration],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Illustration.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Illustration
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @since 1.106.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * @since 1.106.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @since 1.98
      *
      * Gets current value of property {@link #getMedia media}.
      *
      * Defines which media/breakpoint should be used when building the Symbol ID.
      *
      * @returns Value of property `media`
      */
    def getMedia(): String = js.native
    
    /**
      * @since 1.98
      *
      * Gets current value of property {@link #getSet set}.
      *
      * Defines which illustration set should be used when building the Symbol ID.
      *
      * @returns Value of property `set`
      */
    def getSet(): String = js.native
    
    /**
      * @since 1.98
      *
      * Gets current value of property {@link #getType type}.
      *
      * Defines which illustration type should be used when building the Symbol ID.
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * @since 1.106.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @since 1.106.0
      *
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    /**
      * @since 1.98
      *
      * Sets a new value for property {@link #getMedia media}.
      *
      * Defines which media/breakpoint should be used when building the Symbol ID.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMedia(): this.type = js.native
    def setMedia(/**
      * New value for property `media`
      */
    sMedia: String): this.type = js.native
    
    /**
      * @since 1.98
      *
      * Sets a new value for property {@link #getSet set}.
      *
      * Defines which illustration set should be used when building the Symbol ID.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSet(): this.type = js.native
    def setSet(/**
      * New value for property `set`
      */
    sSet: String): this.type = js.native
    
    /**
      * @since 1.98
      *
      * Sets a new value for property {@link #getType type}.
      *
      * Defines which illustration type should be used when building the Symbol ID.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: String): this.type = js.native
  }
  
  trait IllustrationSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.106.0
      *
      * Association to controls / IDs which label those controls (see WAI-ARIA attribute aria-labelledBy).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @since 1.98
      *
      * Defines which media/breakpoint should be used when building the Symbol ID.
      */
    var media: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.98
      *
      * Defines which illustration set should be used when building the Symbol ID.
      */
    var set: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.98
      *
      * Defines which illustration type should be used when building the Symbol ID.
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object IllustrationSettings {
    
    inline def apply(): IllustrationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IllustrationSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IllustrationSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setMedia(value: String | PropertyBindingInfo): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setSet(value: String | PropertyBindingInfo): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
