package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreInvisibleTextMod {
  
  @JSImport("sap/ui/core/InvisibleText", JSImport.Default)
  @js.native
  /**
    * Constructor for a new InvisibleText.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends InvisibleText {
    def this(/**
      * initial settings for the new control
      */
    mSettings: InvisibleTextSettings) = this()
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
    mSettings: InvisibleTextSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: InvisibleTextSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/InvisibleText", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.InvisibleText with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, InvisibleText]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, InvisibleText],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.InvisibleText.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * Returns the ID of a shared `InvisibleText` instance whose `text` property is retrieved from the given
      * library resource bundle and text key.
      *
      * Calls with the same library and text key will return the same instance. The instance will be rendered
      * statically.
      *
      * When accessibility has been switched off by configuration or when the text key is empty or falsy, no
      * ID will be returned.
      *
      * @returns ID of the shared control
      */
    inline def getStaticId(/**
      * Name of the library to load the resource bundle for
      */
    sLibrary: String): ID = ^.asInstanceOf[js.Dynamic].applyDynamic("getStaticId")(sLibrary.asInstanceOf[js.Any]).asInstanceOf[ID]
    inline def getStaticId(
      /**
      * Name of the library to load the resource bundle for
      */
    sLibrary: String,
      /**
      * Key of the text to retrieve from the resource bundle
      */
    sTextKey: String
    ): ID = (^.asInstanceOf[js.Dynamic].applyDynamic("getStaticId")(sLibrary.asInstanceOf[js.Any], sTextKey.asInstanceOf[js.Any])).asInstanceOf[ID]
  }
  
  @js.native
  trait InvisibleText
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The text of the InvisibleText.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * @deprecated (since 1.27) - local BusyIndicator is not supported by control.
      *
      *
      * @returns Returns `this` to allow method chaining
      */
    def setBusy(): this.type = js.native
    
    /**
      * @deprecated (since 1.27) - local BusyIndicator is not supported by control.
      *
      *
      * @returns Returns `this` to allow method chaining
      */
    def setBusyIndicatorDelay(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The text of the InvisibleText.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * @deprecated (since 1.27) - tooltip is not supported by control.
      *
      *
      * @returns Returns `this` to allow method chaining
      */
    def setTooltip(): this.type = js.native
    
    /**
      * Adds `this` control into the static, hidden area UI area container.
      * See:
      * 	sap.ui.core.Control#placeAt
      *
      * @returns Returns `this` to allow method chaining
      */
    def toStatic(): this.type = js.native
  }
  
  trait InvisibleTextSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The text of the InvisibleText.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object InvisibleTextSettings {
    
    inline def apply(): InvisibleTextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvisibleTextSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvisibleTextSettings] (val x: Self) extends AnyVal {
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
