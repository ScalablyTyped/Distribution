package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPluginsPasteProviderMod {
  
  @JSImport("sap/m/plugins/PasteProvider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new PasteProvider plugin.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends PasteProvider {
    def this(/**
      * Initial settings for the `PasteProvider`
      */
    mSettings: PasteProviderSettings) = this()
    def this(/**
      * ID for the new `PasteProvider`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `PasteProvider`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the `PasteProvider`
      */
    mSettings: PasteProviderSettings
    ) = this()
    def this(
      /**
      * ID for the new `PasteProvider`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the `PasteProvider`
      */
    mSettings: PasteProviderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/plugins/PasteProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.plugins.PasteProvider with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, PasteProvider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PasteProvider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.plugins.PasteProvider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PasteProvider
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.m.plugins.PasteProvider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.PasteProvider` itself.
      *
      * This event gets fired when the user pastes content from the clipboard or when the Paste button is pressed
      * if the clipboard access has already been granted. Pasting can be done via the paste feature of the mobile
      * device or the standard paste keyboard shortcut while the popover is open. By default, a synthetic `Clipboard`
      * event that represents the paste data gets dispatched for the control defined in the `pasteFor` association.
      * To avoid this, call `preventDefault` on the event instance.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaste(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PasteProviderPasteEvent, Unit]
    ): this.type = js.native
    def attachPaste(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PasteProviderPasteEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.PasteProvider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.m.plugins.PasteProvider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.PasteProvider` itself.
      *
      * This event gets fired when the user pastes content from the clipboard or when the Paste button is pressed
      * if the clipboard access has already been granted. Pasting can be done via the paste feature of the mobile
      * device or the standard paste keyboard shortcut while the popover is open. By default, a synthetic `Clipboard`
      * event that represents the paste data gets dispatched for the control defined in the `pasteFor` association.
      * To avoid this, call `preventDefault` on the event instance.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaste(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PasteProviderPasteEvent, Unit]
    ): this.type = js.native
    def attachPaste(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PasteProviderPasteEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.PasteProvider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:paste paste} event of this `sap.m.plugins.PasteProvider`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPaste(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PasteProviderPasteEvent, Unit]
    ): this.type = js.native
    def detachPaste(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ PasteProviderPasteEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:paste paste} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def firePaste(): Boolean = js.native
    def firePaste(
      /**
      * Parameters to pass along with the event
      */
    mParameters: PasteProvider$PasteEventParameters
    ): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getPasteFor pasteFor}, or `null`.
      */
    def getPasteFor(): ID = js.native
    
    def setPasteFor(
      /**
      * ID of an element which becomes the new target of this pasteFor association; alternatively, an element
      * instance may be given
      */
    oPasteFor: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getPasteFor pasteFor}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPasteFor(
      /**
      * ID of an element which becomes the new target of this pasteFor association; alternatively, an element
      * instance may be given
      */
    oPasteFor: ID
    ): this.type = js.native
  }
  
  trait PasteProvider$PasteEventParameters extends StObject {
    
    /**
      * Two-dimentional array of strings with data from the clipboard. The first dimension represents the rows,
      * and the second dimension represents the cells of the tabular data.
      */
    var data: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    /**
      * The text data, with all special characters, from the clipboard.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object PasteProvider$PasteEventParameters {
    
    inline def apply(): PasteProvider$PasteEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteProvider$PasteEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasteProvider$PasteEventParameters] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type PasteProviderPasteEvent = typings.openui5.sapUiBaseEventMod.default[PasteProvider$PasteEventParameters]
  
  type PasteProviderPasteEventParameters = PasteProvider$PasteEventParameters
  
  trait PasteProviderSettings
    extends StObject
       with ElementSettings {
    
    /**
      * This event gets fired when the user pastes content from the clipboard or when the Paste button is pressed
      * if the clipboard access has already been granted. Pasting can be done via the paste feature of the mobile
      * device or the standard paste keyboard shortcut while the popover is open. By default, a synthetic `Clipboard`
      * event that represents the paste data gets dispatched for the control defined in the `pasteFor` association.
      * To avoid this, call `preventDefault` on the event instance.
      */
    var paste: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[PasteProvider$PasteEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the control which the paste is associated with.
      */
    var pasteFor: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
  }
  object PasteProviderSettings {
    
    inline def apply(): PasteProviderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteProviderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasteProviderSettings] (val x: Self) extends AnyVal {
      
      inline def setPaste(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[PasteProvider$PasteEventParameters] => Unit
      ): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      inline def setPasteFor(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "pasteFor", value.asInstanceOf[js.Any])
      
      inline def setPasteForUndefined: Self = StObject.set(x, "pasteFor", js.undefined)
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    }
  }
}
