package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapFCardBaseMod.CardBaseSettings
import typings.openui5.sapFLibraryMod.cards.HeaderPosition
import typings.openui5.sapFLibraryMod.cards.IHeader
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFCardMod {
  
  @JSImport("sap/f/Card", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Card`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Card {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CardSettings) = this()
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
    mSettings: CardSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CardSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.Card with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.f.CardBase.extend}.
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
    oClassInfo: ClassInfo[T, Card]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Card],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.Card.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Card
    extends typings.openui5.sapFCardBaseMod.default {
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content of the card.
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the header of the card.
      */
    def getHeader(): IHeader = js.native
    
    /**
      * @SINCE 1.65
      *
      * Gets current value of property {@link #getHeaderPosition headerPosition}.
      *
      * Defines the position of the Card Header.
      *
      * Default value is `Top`.
      *
      * @returns Value of property `headerPosition`
      */
    def getHeaderPosition(): HeaderPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.HeaderPosition * / any */ String) = js.native
    
    /**
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(/**
      * The header to set
      */
    oHeader: IHeader): this.type = js.native
    
    /**
      * @SINCE 1.65
      *
      * Sets a new value for property {@link #getHeaderPosition headerPosition}.
      *
      * Defines the position of the Card Header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Top`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderPosition(): this.type = js.native
    def setHeaderPosition(
      /**
      * New value for property `headerPosition`
      */
    sHeaderPosition: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.HeaderPosition * / any */ String
    ): this.type = js.native
    def setHeaderPosition(/**
      * New value for property `headerPosition`
      */
    sHeaderPosition: HeaderPosition): this.type = js.native
  }
  
  trait CardSettings
    extends StObject
       with CardBaseSettings {
    
    /**
      * Defines the content of the card.
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the header of the card.
      */
    var header: js.UndefOr[IHeader] = js.undefined
    
    /**
      * @SINCE 1.65
      *
      * Defines the position of the Card Header.
      */
    var headerPosition: js.UndefOr[
        HeaderPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.HeaderPosition * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object CardSettings {
    
    inline def apply(): CardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSettings]
    }
    
    extension [Self <: CardSettings](x: Self) {
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHeader(value: IHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderPosition(
        value: HeaderPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cards.HeaderPosition * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerPosition", value.asInstanceOf[js.Any])
      
      inline def setHeaderPositionUndefined: Self = StObject.set(x, "headerPosition", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
