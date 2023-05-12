package typings.openui5

import typings.openui5.anon.Text
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUx3LibraryMod.FeederType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3FeederMod {
  
  @JSImport("sap/ui/ux3/Feeder", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Feeder.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Feeder {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FeederSettings) = this()
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
    mSettings: FeederSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FeederSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/Feeder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.Feeder with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Feeder]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Feeder],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.Feeder.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Feeder
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:submit submit} event of this `sap.ui.ux3.Feeder`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feeder` itself.
      *
      * Event is fired when the entered text is submitted
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feeder` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:submit submit} event of this `sap.ui.ux3.Feeder`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feeder` itself.
      *
      * Event is fired when the entered text is submitted
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feeder` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:submit submit} event of this `sap.ui.ux3.Feeder`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:submit submit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSubmit(): this.type = js.native
    def fireSubmit(/**
      * Parameters to pass along with the event
      */
    mParameters: Text): this.type = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholderText placeholderText}.
      *
      * This property could be used for costum placeholder. If it is not set, the default text is used.
      *
      * @returns Value of property `placeholderText`
      */
    def getPlaceholderText(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The text for the Feeder. @References are supported.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getThumbnailSrc thumbnailSrc}.
      *
      * URL to the thumb nail image This property is optional if the feeder is a sub-control of a feed or a feedChunk
      * control. In this case the value of the feed or feddChunk control is used if it's not set. So it must
      * be only set once on the feed or feedChunk control.
      *
      * @returns Value of property `thumbnailSrc`
      */
    def getThumbnailSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Type and size of the Feeder
      *
      * Default value is `Large`.
      *
      * @returns Value of property `type`
      */
    def getType(): FeederType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeederType * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholderText placeholderText}.
      *
      * This property could be used for costum placeholder. If it is not set, the default text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholderText(): this.type = js.native
    def setPlaceholderText(/**
      * New value for property `placeholderText`
      */
    sPlaceholderText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The text for the Feeder. @References are supported.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getThumbnailSrc thumbnailSrc}.
      *
      * URL to the thumb nail image This property is optional if the feeder is a sub-control of a feed or a feedChunk
      * control. In this case the value of the feed or feddChunk control is used if it's not set. So it must
      * be only set once on the feed or feedChunk control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThumbnailSrc(): this.type = js.native
    def setThumbnailSrc(/**
      * New value for property `thumbnailSrc`
      */
    sThumbnailSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Type and size of the Feeder
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Large`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeederType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: FeederType): this.type = js.native
  }
  
  trait FeederSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This property could be used for costum placeholder. If it is not set, the default text is used.
      */
    var placeholderText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the entered text is submitted
      */
    var submit: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The text for the Feeder. @References are supported.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * URL to the thumb nail image This property is optional if the feeder is a sub-control of a feed or a feedChunk
      * control. In this case the value of the feed or feddChunk control is used if it's not set. So it must
      * be only set once on the feed or feedChunk control.
      */
    var thumbnailSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Type and size of the Feeder
      */
    var `type`: js.UndefOr[
        FeederType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeederType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object FeederSettings {
    
    inline def apply(): FeederSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeederSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeederSettings] (val x: Self) extends AnyVal {
      
      inline def setPlaceholderText(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setSubmit(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setThumbnailSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "thumbnailSrc", value.asInstanceOf[js.Any])
      
      inline def setThumbnailSrcUndefined: Self = StObject.set(x, "thumbnailSrc", js.undefined)
      
      inline def setType(
        value: FeederType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeederType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
