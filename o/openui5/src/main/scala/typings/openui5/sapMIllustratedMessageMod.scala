package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMIllustratedMessageSizeMod.IllustratedMessageSize
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIllustratedMessageMod {
  
  @JSImport("sap/m/IllustratedMessage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `IllustratedMessage`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends IllustratedMessage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IllustratedMessageSettings) = this()
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
    mSettings: IllustratedMessageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IllustratedMessageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/IllustratedMessage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.IllustratedMessage with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, IllustratedMessage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, IllustratedMessage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.IllustratedMessage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait IllustratedMessage
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @SINCE 1.98
      *
      * Adds some additionalContent to the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAdditionalContent(
      /**
      * The additionalContent to add; if empty, nothing is inserted
      */
    oAdditionalContent: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    def addIllustrationAriaLabelledBy(
      /**
      * The illustrationAriaLabelledBy to add; if empty, nothing is inserted
      */
    vIllustrationAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.106.0
      *
      * Adds some illustrationAriaLabelledBy into the association {@link #getIllustrationAriaLabelledBy illustrationAriaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addIllustrationAriaLabelledBy(
      /**
      * The illustrationAriaLabelledBy to add; if empty, nothing is inserted
      */
    vIllustrationAriaLabelledBy: ID
    ): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Destroys all the additionalContent in the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAdditionalContent(): this.type = js.native
    
    /**
      * @SINCE 1.98.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns object with ID references of the title and description containers.
      *
      * **Note:** Changing the value of the `enableFormattedText` property changes the references of of title
      * and description containers.
      *
      * @returns Object with 2 fields representing the ID references of the title and description in the IllustratedMessage
      */
    def getAccessibilityReferences(): js.Object = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets content of aggregation {@link #getAdditionalContent additionalContent}.
      *
      * Defines the controls placed below the description as additional content.
      *
      * **Note:** Not displayed when `illustrationSize` is set to `Base`.
      */
    def getAdditionalContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * @SINCE 1.111
      *
      * Gets current value of property {@link #getAriaTitleLevel ariaTitleLevel}.
      *
      * Defines the semantic level of the title. When using `Auto`, no explicit level information is written.
      *
      * **Note:** Used for accessibility purposes only.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `ariaTitleLevel`
      */
    def getAriaTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getDescription description}.
      *
      * Defines the description displayed below the title.
      *
      * If there is no initial input from the app developer, `enableDefaultTitleAndDescription` is `true` and
      * the default illustration set is being used, a default description for the current illustration type is
      * going to be displayed. The default description is stored in the `sap.m` resource bundle.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * @SINCE 1.111
      *
      * Gets current value of property {@link #getEnableDefaultTitleAndDescription enableDefaultTitleAndDescription}.
      *
      * Defines whether the default title and description should be used when the input for their respective
      * part is empty and the default illustration set is being used. Title and description are stored in the
      * `sap.m` resource bundle.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableDefaultTitleAndDescription`
      */
    def getEnableDefaultTitleAndDescription(): Boolean = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getEnableFormattedText enableFormattedText}.
      *
      * Defines whether the value set in the `description` property is displayed as formatted text in HTML format.
      *
      * For details regarding supported HTML tags, see {@link sap.m.FormattedText}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableFormattedText`
      */
    def getEnableFormattedText(): Boolean = js.native
    
    /**
      * @SINCE 1.104
      *
      * Gets current value of property {@link #getEnableVerticalResponsiveness enableVerticalResponsiveness}.
      *
      * Defines whether the `IllustratedMessage` would resize itself according to it's height if `illustrationSize`
      * property is set to `IllustratedMessageSize.Auto`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableVerticalResponsiveness`
      */
    def getEnableVerticalResponsiveness(): Boolean = js.native
    
    /**
      * @SINCE 1.106.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getIllustrationAriaLabelledBy
      * illustrationAriaLabelledBy}.
      */
    def getIllustrationAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getIllustrationSize illustrationSize}.
      *
      * Determines which illustration breakpoint variant is used.
      *
      * As `IllustratedMessage` adapts itself around the `Illustration`, the other elements of the control are
      * displayed differently on the different breakpoints/illustration sizes.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `illustrationSize`
      */
    def getIllustrationSize(): IllustratedMessageSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustratedMessageSize * / any */ String) = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getIllustrationType illustrationType}.
      *
      * Determines which illustration type is displayed.
      *
      * **Note:** The {@link sap.m.IllustratedMessageType} enumeration contains a default illustration set. If
      * you want to use another illustration set, you have to register it in the {@link sap.m.IllustrationPool}.
      *
      * Example input for the `illustrationType` property is `sapIllus-UnableToLoad`. The logic behind this format
      * is as follows:
      * 	 - First is the the illustration set - sapIllus
      * 	 - Second is the illustration type - UnableToLoad
      *
      * Default value is `IllustratedMessageType.NoSearchResults`.
      *
      * @returns Value of property `illustrationType`
      */
    def getIllustrationType(): String = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title that is displayed below the illustration.
      *
      * If there is no initial input from the app developer, `enableDefaultTitleAndDescription` is `true` and
      * the default illustration set is being used, a default title is displayed corresponding to the current
      * `illustrationType`. The default title is stored in the `sap.m` resource bundle.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.98
      *
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getAdditionalContent additionalContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAdditionalContent(
      /**
      * The additionalContent whose index is looked for
      */
    oAdditionalContent: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.98
      *
      * Inserts a additionalContent into the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAdditionalContent(
      /**
      * The additionalContent to insert; if empty, nothing is inserted
      */
    oAdditionalContent: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the additionalContent should be inserted at; for a negative value of `iIndex`, the
      * additionalContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the additionalContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAdditionalContent(/**
      * The additionalContent to remove or its index or id
      */
    vAdditionalContent: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * @SINCE 1.98
      *
      * Removes a additionalContent from the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * @returns The removed additionalContent or `null`
      */
    def removeAdditionalContent(/**
      * The additionalContent to remove or its index or id
      */
    vAdditionalContent: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeAdditionalContent(
      /**
      * The additionalContent to remove or its index or id
      */
    vAdditionalContent: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * @SINCE 1.98
      *
      * Removes all the controls from the aggregation {@link #getAdditionalContent additionalContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAdditionalContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * @SINCE 1.106.0
      *
      * Removes all the controls in the association named {@link #getIllustrationAriaLabelledBy illustrationAriaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllIllustrationAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.106.0
      *
      * Removes an illustrationAriaLabelledBy from the association named {@link #getIllustrationAriaLabelledBy
      * illustrationAriaLabelledBy}.
      *
      * @returns The removed illustrationAriaLabelledBy or `null`
      */
    def removeIllustrationAriaLabelledBy(
      /**
      * The illustrationAriaLabelledBy to be removed or its index or ID
      */
    vIllustrationAriaLabelledBy: int
    ): ID | Null = js.native
    def removeIllustrationAriaLabelledBy(
      /**
      * The illustrationAriaLabelledBy to be removed or its index or ID
      */
    vIllustrationAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeIllustrationAriaLabelledBy(
      /**
      * The illustrationAriaLabelledBy to be removed or its index or ID
      */
    vIllustrationAriaLabelledBy: ID
    ): ID | Null = js.native
    
    /**
      * @SINCE 1.111
      *
      * Sets a new value for property {@link #getAriaTitleLevel ariaTitleLevel}.
      *
      * Defines the semantic level of the title. When using `Auto`, no explicit level information is written.
      *
      * **Note:** Used for accessibility purposes only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaTitleLevel(): this.type = js.native
    def setAriaTitleLevel(
      /**
      * New value for property `ariaTitleLevel`
      */
    sAriaTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setAriaTitleLevel(/**
      * New value for property `ariaTitleLevel`
      */
    sAriaTitleLevel: TitleLevel): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getDescription description}.
      *
      * Defines the description displayed below the title.
      *
      * If there is no initial input from the app developer, `enableDefaultTitleAndDescription` is `true` and
      * the default illustration set is being used, a default description for the current illustration type is
      * going to be displayed. The default description is stored in the `sap.m` resource bundle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * @SINCE 1.111
      *
      * Sets a new value for property {@link #getEnableDefaultTitleAndDescription enableDefaultTitleAndDescription}.
      *
      * Defines whether the default title and description should be used when the input for their respective
      * part is empty and the default illustration set is being used. Title and description are stored in the
      * `sap.m` resource bundle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableDefaultTitleAndDescription(): this.type = js.native
    def setEnableDefaultTitleAndDescription(
      /**
      * New value for property `enableDefaultTitleAndDescription`
      */
    bEnableDefaultTitleAndDescription: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getEnableFormattedText enableFormattedText}.
      *
      * Defines whether the value set in the `description` property is displayed as formatted text in HTML format.
      *
      * For details regarding supported HTML tags, see {@link sap.m.FormattedText}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFormattedText(): this.type = js.native
    def setEnableFormattedText(/**
      * New value for property `enableFormattedText`
      */
    bEnableFormattedText: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.104
      *
      * Sets a new value for property {@link #getEnableVerticalResponsiveness enableVerticalResponsiveness}.
      *
      * Defines whether the `IllustratedMessage` would resize itself according to it's height if `illustrationSize`
      * property is set to `IllustratedMessageSize.Auto`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableVerticalResponsiveness(): this.type = js.native
    def setEnableVerticalResponsiveness(
      /**
      * New value for property `enableVerticalResponsiveness`
      */
    bEnableVerticalResponsiveness: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getIllustrationSize illustrationSize}.
      *
      * Determines which illustration breakpoint variant is used.
      *
      * As `IllustratedMessage` adapts itself around the `Illustration`, the other elements of the control are
      * displayed differently on the different breakpoints/illustration sizes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIllustrationSize(): this.type = js.native
    def setIllustrationSize(
      /**
      * New value for property `illustrationSize`
      */
    sIllustrationSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustratedMessageSize * / any */ String
    ): this.type = js.native
    def setIllustrationSize(/**
      * New value for property `illustrationSize`
      */
    sIllustrationSize: IllustratedMessageSize): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title that is displayed below the illustration.
      *
      * If there is no initial input from the app developer, `enableDefaultTitleAndDescription` is `true` and
      * the default illustration set is being used, a default title is displayed corresponding to the current
      * `illustrationType`. The default title is stored in the `sap.m` resource bundle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait IllustratedMessageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.98
      *
      * Defines the controls placed below the description as additional content.
      *
      * **Note:** Not displayed when `illustrationSize` is set to `Base`.
      */
    var additionalContent: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.111
      *
      * Defines the semantic level of the title. When using `Auto`, no explicit level information is written.
      *
      * **Note:** Used for accessibility purposes only.
      */
    var ariaTitleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Defines the description displayed below the title.
      *
      * If there is no initial input from the app developer, `enableDefaultTitleAndDescription` is `true` and
      * the default illustration set is being used, a default description for the current illustration type is
      * going to be displayed. The default description is stored in the `sap.m` resource bundle.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.111
      *
      * Defines whether the default title and description should be used when the input for their respective
      * part is empty and the default illustration set is being used. Title and description are stored in the
      * `sap.m` resource bundle.
      */
    var enableDefaultTitleAndDescription: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Defines whether the value set in the `description` property is displayed as formatted text in HTML format.
      *
      * For details regarding supported HTML tags, see {@link sap.m.FormattedText}.
      */
    var enableFormattedText: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.104
      *
      * Defines whether the `IllustratedMessage` would resize itself according to it's height if `illustrationSize`
      * property is set to `IllustratedMessageSize.Auto`.
      */
    var enableVerticalResponsiveness: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.106.0
      *
      * Association to controls / IDs which label those controls (see WAI-ARIA attribute aria-labelledBy).
      */
    var illustrationAriaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Determines which illustration breakpoint variant is used.
      *
      * As `IllustratedMessage` adapts itself around the `Illustration`, the other elements of the control are
      * displayed differently on the different breakpoints/illustration sizes.
      */
    var illustrationSize: js.UndefOr[
        IllustratedMessageSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustratedMessageSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Determines which illustration type is displayed.
      *
      * **Note:** The {@link sap.m.IllustratedMessageType} enumeration contains a default illustration set. If
      * you want to use another illustration set, you have to register it in the {@link sap.m.IllustrationPool}.
      *
      * Example input for the `illustrationType` property is `sapIllus-UnableToLoad`. The logic behind this format
      * is as follows:
      * 	 - First is the the illustration set - sapIllus
      * 	 - Second is the illustration type - UnableToLoad
      */
    var illustrationType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Defines the title that is displayed below the illustration.
      *
      * If there is no initial input from the app developer, `enableDefaultTitleAndDescription` is `true` and
      * the default illustration set is being used, a default title is displayed corresponding to the current
      * `illustrationType`. The default title is stored in the `sap.m` resource bundle.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object IllustratedMessageSettings {
    
    inline def apply(): IllustratedMessageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IllustratedMessageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IllustratedMessageSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalContent(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "additionalContent", value.asInstanceOf[js.Any])
      
      inline def setAdditionalContentUndefined: Self = StObject.set(x, "additionalContent", js.undefined)
      
      inline def setAdditionalContentVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "additionalContent", js.Array(value*))
      
      inline def setAriaTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "ariaTitleLevel", value.asInstanceOf[js.Any])
      
      inline def setAriaTitleLevelUndefined: Self = StObject.set(x, "ariaTitleLevel", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnableDefaultTitleAndDescription(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableDefaultTitleAndDescription", value.asInstanceOf[js.Any])
      
      inline def setEnableDefaultTitleAndDescriptionUndefined: Self = StObject.set(x, "enableDefaultTitleAndDescription", js.undefined)
      
      inline def setEnableFormattedText(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFormattedText", value.asInstanceOf[js.Any])
      
      inline def setEnableFormattedTextUndefined: Self = StObject.set(x, "enableFormattedText", js.undefined)
      
      inline def setEnableVerticalResponsiveness(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableVerticalResponsiveness", value.asInstanceOf[js.Any])
      
      inline def setEnableVerticalResponsivenessUndefined: Self = StObject.set(x, "enableVerticalResponsiveness", js.undefined)
      
      inline def setIllustrationAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "illustrationAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setIllustrationAriaLabelledByUndefined: Self = StObject.set(x, "illustrationAriaLabelledBy", js.undefined)
      
      inline def setIllustrationAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "illustrationAriaLabelledBy", js.Array(value*))
      
      inline def setIllustrationSize(
        value: IllustratedMessageSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IllustratedMessageSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "illustrationSize", value.asInstanceOf[js.Any])
      
      inline def setIllustrationSizeUndefined: Self = StObject.set(x, "illustrationSize", js.undefined)
      
      inline def setIllustrationType(value: String | PropertyBindingInfo): Self = StObject.set(x, "illustrationType", value.asInstanceOf[js.Any])
      
      inline def setIllustrationTypeUndefined: Self = StObject.set(x, "illustrationType", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
