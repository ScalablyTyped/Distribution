package typings.openui5

import typings.openui5.anon.Columns
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreDndDropInfoMod.DropInfoSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFDndGridDropInfoMod {
  
  @JSImport("sap/f/dnd/GridDropInfo", JSImport.Default)
  @js.native
  /**
    * Constructor for a new GridDropInfo.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridDropInfo {
    def this(/**
      * Initial settings for the GridDropInfo
      */
    mSettings: GridDropInfoSettings) = this()
    def this(/**
      * ID for the new DropInfo, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new DropInfo, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the GridDropInfo
      */
    mSettings: GridDropInfoSettings
    ) = this()
    def this(
      /**
      * ID for the new DropInfo, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the GridDropInfo
      */
    mSettings: GridDropInfoSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/dnd/GridDropInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.dnd.GridDropInfo with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.dnd.DropInfo.extend}.
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
    oClassInfo: ClassInfo[T, GridDropInfo]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridDropInfo],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.dnd.GridDropInfo.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridDropInfo
    extends typings.openui5.sapUiCoreDndDropInfoMod.default {
    
    /**
      * Gets current value of property {@link #getDropIndicatorSize dropIndicatorSize}.
      *
      * A function which will define the desired drop indicator size. The drop indicator shows the user how the
      * grid will rearrange after drop. Use when custom size needs to be defined. For example, when an item is
      * dragged from outside a grid and is dropped over the grid.
      *
      * If not specified or if the function returns `null`, the indicator size will be calculated automatically.
      *
      * This callback will be called when the indicator is displayed, which happens during the drag over movement.
      *
      * The callback receives `draggedControl` as parameter and must return an object of type `{rows: int, columns:
      * int}` or `null`.
      *
      * @returns Value of property `dropIndicatorSize`
      */
    def getDropIndicatorSize(): js.UndefOr[
        js.Function1[/* p1 */ typings.openui5.sapUiCoreControlMod.default, Columns | Null]
      ] = js.native
    
    /**
      * Sets a new value for property {@link #setDropIndicatorSize dropIndicatorSize}.
      *
      * A function which will define the desired drop indicator size. The drop indicator shows the user how the
      * grid will rearrange after drop. Use when custom size needs to be defined. For example when an item is
      * dragged from outside a grid and is dropped over the grid.
      *
      * If not specified or if the function returns `null`, the indicator size will be calculated automatically.
      *
      * This callback will be called when the indicator is displayed, which happens during the drag over movement.
      *
      * The callback receives `draggedControl` as parameter and must return an object of type `{rows: int, columns:
      * int}` or `null`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDropIndicatorSize(): this.type = js.native
    def setDropIndicatorSize(
      /**
      * New value for property `dropIndicatorSize`
      */
    fnDropIndicatorSize: js.Function1[/* p1 */ typings.openui5.sapUiCoreControlMod.default, Columns | Null]
    ): this.type = js.native
  }
  
  trait GridDropInfoSettings
    extends StObject
       with DropInfoSettings {
    
    /**
      * A function which will define the desired drop indicator size. The drop indicator shows the user how the
      * grid will rearrange after drop.
      *
      * Use when custom size needs to be defined. For example when an item is dragged from outside a grid and
      * is dropped over the grid.
      *
      * If not specified or if the function returns `null`, the indicator size will be calculated automatically.
      *
      * This callback will be called when the indicator is displayed, which happens during the drag over movement.
      *
      * The callback receives `draggedControl` as parameter and must return an object of type `{rows: int, columns:
      * int}` or `null`.
      */
    var dropIndicatorSize: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridDropInfoSettings {
    
    inline def apply(): GridDropInfoSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridDropInfoSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridDropInfoSettings] (val x: Self) extends AnyVal {
      
      inline def setDropIndicatorSize(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "dropIndicatorSize", value.asInstanceOf[js.Any])
      
      inline def setDropIndicatorSizeUndefined: Self = StObject.set(x, "dropIndicatorSize", js.undefined)
    }
  }
}
