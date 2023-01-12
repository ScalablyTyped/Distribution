package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMSemanticSemanticPageMod.SemanticPageSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSemanticShareMenuPageMod {
  
  @JSImport("sap/m/semantic/ShareMenuPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ShareMenuPage
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ShareMenuPage {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ShareMenuPageSettings) = this()
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
    mSettings: ShareMenuPageSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ShareMenuPageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/semantic/ShareMenuPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.semantic.ShareMenuPage with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.semantic.SemanticPage.extend}.
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
    oClassInfo: ClassInfo[T, ShareMenuPage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ShareMenuPage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.semantic.ShareMenuPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ShareMenuPage
    extends typings.openui5.sapMSemanticSemanticPageMod.default {
    
    /**
      * Adds some customShareMenuContent to the aggregation {@link #getCustomShareMenuContent customShareMenuContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCustomShareMenuContent(
      /**
      * The customShareMenuContent to add; if empty, nothing is inserted
      */
    oCustomShareMenuContent: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the customShareMenuContent in the aggregation {@link #getCustomShareMenuContent customShareMenuContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomShareMenuContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomShareMenuContent customShareMenuContent}.
      *
      * Custom share menu buttons
      */
    def getCustomShareMenuContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getCustomShareMenuContent customShareMenuContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomShareMenuContent(
      /**
      * The customShareMenuContent whose index is looked for
      */
    oCustomShareMenuContent: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Inserts a customShareMenuContent into the aggregation {@link #getCustomShareMenuContent customShareMenuContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomShareMenuContent(
      /**
      * The customShareMenuContent to insert; if empty, nothing is inserted
      */
    oCustomShareMenuContent: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the customShareMenuContent should be inserted at; for a negative value of `iIndex`,
      * the customShareMenuContent is inserted at position 0; for a value greater than the current size of the
      * aggregation, the customShareMenuContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCustomShareMenuContent customShareMenuContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomShareMenuContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    def removeCustomShareMenuContent(
      /**
      * The customShareMenuContent to remove or its index or id
      */
    vCustomShareMenuContent: String
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a customShareMenuContent from the aggregation {@link #getCustomShareMenuContent customShareMenuContent}.
      *
      * @returns The removed customShareMenuContent or `null`
      */
    def removeCustomShareMenuContent(/**
      * The customShareMenuContent to remove or its index or id
      */
    vCustomShareMenuContent: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeCustomShareMenuContent(
      /**
      * The customShareMenuContent to remove or its index or id
      */
    vCustomShareMenuContent: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
  }
  
  trait ShareMenuPageSettings
    extends StObject
       with SemanticPageSettings {
    
    /**
      * Custom share menu buttons
      */
    var customShareMenuContent: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ShareMenuPageSettings {
    
    inline def apply(): ShareMenuPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareMenuPageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShareMenuPageSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomShareMenuContent(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customShareMenuContent", value.asInstanceOf[js.Any])
      
      inline def setCustomShareMenuContentUndefined: Self = StObject.set(x, "customShareMenuContent", js.undefined)
      
      inline def setCustomShareMenuContentVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "customShareMenuContent", js.Array(value*))
    }
  }
}
