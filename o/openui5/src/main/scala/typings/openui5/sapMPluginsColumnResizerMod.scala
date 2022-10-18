package typings.openui5

import typings.openui5.anon.ColumnWidth
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPluginsColumnResizerMod {
  
  @JSImport("sap/m/plugins/ColumnResizer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ColumnResizer plugin.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColumnResizer {
    def this(/**
      * Initial settings for the `ColumnResizer`
      */
    mSettings: ColumnResizerSettings) = this()
    def this(/**
      * ID for the new `ColumnResizer`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `ColumnResizer`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the `ColumnResizer`
      */
    mSettings: ColumnResizerSettings
    ) = this()
    def this(
      /**
      * ID for the new `ColumnResizer`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the `ColumnResizer`
      */
    mSettings: ColumnResizerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/plugins/ColumnResizer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.plugins.ColumnResizer with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, ColumnResizer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColumnResizer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.plugins.ColumnResizer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColumnResizer
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:columnResize columnResize} event of this `sap.m.plugins.ColumnResizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.ColumnResizer` itself.
      *
      * This event is fired when the column is resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachColumnResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.ColumnResizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:columnResize columnResize} event of this `sap.m.plugins.ColumnResizer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.ColumnResizer` itself.
      *
      * This event is fired when the column is resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnResize(
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
    def attachColumnResize(
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
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.ColumnResizer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:columnResize columnResize} event of this `sap.m.plugins.ColumnResizer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachColumnResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachColumnResize(
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
      * Fires event {@link #event:columnResize columnResize} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireColumnResize(): Boolean = js.native
    def fireColumnResize(/**
      * Parameters to pass along with the event
      */
    mParameters: ColumnWidth): Boolean = js.native
    
    /**
      * Displays the resize handle for the provided column `DOM` reference.
      */
    def startResizing(/**
      * column DOM reference
      */
    oDomRef: HTMLElement): Unit = js.native
  }
  
  trait ColumnResizerSettings
    extends StObject
       with ElementSettings {
    
    /**
      * This event is fired when the column is resized.
      */
    var columnResize: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object ColumnResizerSettings {
    
    inline def apply(): ColumnResizerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnResizerSettings]
    }
    
    extension [Self <: ColumnResizerSettings](x: Self) {
      
      inline def setColumnResize(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
      
      inline def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    }
  }
}
