package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMLightBoxMod {
  
  @JSImport("sap/m/LightBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new LightBox.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/lightbox/ Light Box}
    */
  open class default () extends LightBox {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: LightBoxSettings) = this()
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
    mSettings: LightBoxSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: LightBoxSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/LightBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.LightBox with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, LightBox]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, LightBox],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.LightBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait LightBox
    extends typings.openui5.sapUiCoreControlMod.default
       with PopupInterface {
    
    /**
      * Adds some imageContent to the aggregation {@link #getImageContent imageContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addImageContent(
      /**
      * The imageContent to add; if empty, nothing is inserted
      */
    oImageContent: typings.openui5.sapMLightBoxItemMod.default
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getImageContent imageContent} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindImageContent(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Closes the LightBox.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def close(): this.type = js.native
    
    /**
      * Destroys all the imageContent in the aggregation {@link #getImageContent imageContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyImageContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getImageContent imageContent}.
      *
      * Aggregation which holds data about the image and its description. Although multiple LightBoxItems may
      * be added to this aggregation only the first one in the list will be taken into account.
      */
    def getImageContent(): js.Array[typings.openui5.sapMLightBoxItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.m.LightBoxItem` in the aggregation {@link #getImageContent imageContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfImageContent(
      /**
      * The imageContent whose index is looked for
      */
    oImageContent: typings.openui5.sapMLightBoxItemMod.default
    ): int = js.native
    
    /**
      * Inserts a imageContent into the aggregation {@link #getImageContent imageContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertImageContent(
      /**
      * The imageContent to insert; if empty, nothing is inserted
      */
    oImageContent: typings.openui5.sapMLightBoxItemMod.default,
      /**
      * The `0`-based index the imageContent should be inserted at; for a negative value of `iIndex`, the imageContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the imageContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Returns if the LightBox is open.
      *
      * @returns Is the LightBox open
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Overwrites the onAfterRendering.
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * Overwrites the onBeforeRendering.
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * Opens the LightBox.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def open(): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getImageContent imageContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllImageContent(): js.Array[typings.openui5.sapMLightBoxItemMod.default] = js.native
    
    def removeImageContent(/**
      * The imageContent to remove or its index or id
      */
    vImageContent: String): typings.openui5.sapMLightBoxItemMod.default | Null = js.native
    /**
      * Removes a imageContent from the aggregation {@link #getImageContent imageContent}.
      *
      * @returns The removed imageContent or `null`
      */
    def removeImageContent(/**
      * The imageContent to remove or its index or id
      */
    vImageContent: int): typings.openui5.sapMLightBoxItemMod.default | Null = js.native
    def removeImageContent(
      /**
      * The imageContent to remove or its index or id
      */
    vImageContent: typings.openui5.sapMLightBoxItemMod.default
    ): typings.openui5.sapMLightBoxItemMod.default | Null = js.native
    
    /**
      * Unbinds aggregation {@link #getImageContent imageContent} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindImageContent(): this.type = js.native
  }
  
  trait LightBoxSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Aggregation which holds data about the image and its description. Although multiple LightBoxItems may
      * be added to this aggregation only the first one in the list will be taken into account.
      */
    var imageContent: js.UndefOr[
        js.Array[typings.openui5.sapMLightBoxItemMod.default] | typings.openui5.sapMLightBoxItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object LightBoxSettings {
    
    inline def apply(): LightBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LightBoxSettings]
    }
    
    extension [Self <: LightBoxSettings](x: Self) {
      
      inline def setImageContent(
        value: js.Array[typings.openui5.sapMLightBoxItemMod.default] | typings.openui5.sapMLightBoxItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "imageContent", value.asInstanceOf[js.Any])
      
      inline def setImageContentUndefined: Self = StObject.set(x, "imageContent", js.undefined)
      
      inline def setImageContentVarargs(value: typings.openui5.sapMLightBoxItemMod.default*): Self = StObject.set(x, "imageContent", js.Array(value*))
    }
  }
}
