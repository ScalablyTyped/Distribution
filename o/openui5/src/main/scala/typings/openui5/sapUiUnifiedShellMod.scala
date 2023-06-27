package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUnifiedShellLayoutMod.ShellLayoutSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedShellMod {
  
  @JSImport("sap/ui/unified/Shell", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Shell.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Shell {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ShellSettings) = this()
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
    mSettings: ShellSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ShellSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/Shell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.Shell with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.unified.ShellLayout.extend}.
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
    oClassInfo: ClassInfo[T, Shell]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Shell],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.Shell.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Shell
    extends typings.openui5.sapUiUnifiedShellLayoutMod.default {
    
    /**
      * Adds some curtainContent to the aggregation {@link #getCurtainContent curtainContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCurtainContent(
      /**
      * The curtainContent to add; if empty, nothing is inserted
      */
    oCurtainContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some curtainPaneContent to the aggregation {@link #getCurtainPaneContent curtainPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCurtainPaneContent(
      /**
      * The curtainPaneContent to add; if empty, nothing is inserted
      */
    oCurtainPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some headEndItem to the aggregation {@link #getHeadEndItems headEndItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeadEndItem(
      /**
      * The headEndItem to add; if empty, nothing is inserted
      */
    oHeadEndItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some headItem to the aggregation {@link #getHeadItems headItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeadItem(
      /**
      * The headItem to add; if empty, nothing is inserted
      */
    oHeadItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the curtainContent in the aggregation {@link #getCurtainContent curtainContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCurtainContent(): this.type = js.native
    
    /**
      * Destroys all the curtainPaneContent in the aggregation {@link #getCurtainPaneContent curtainPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCurtainPaneContent(): this.type = js.native
    
    /**
      * Destroys all the headEndItems in the aggregation {@link #getHeadEndItems headEndItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeadEndItems(): this.type = js.native
    
    /**
      * Destroys all the headItems in the aggregation {@link #getHeadItems headItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeadItems(): this.type = js.native
    
    /**
      * Destroys the search in the aggregation {@link #getSearch search}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySearch(): this.type = js.native
    
    /**
      * @since 1.22.0
      *
      * Destroys the user in the aggregation {@link #getUser user}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyUser(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCurtainContent curtainContent}.
      *
      * The content to appear in the curtain area.
      */
    def getCurtainContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getCurtainPaneContent curtainPaneContent}.
      *
      * The content to appear in the pane area of the curtain.
      */
    def getCurtainPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeadEndItems headEndItems}.
      *
      * The buttons shown in the end (right in left-to-right case) of the Shell header. Currently max. 3 visible
      * buttons are supported (when user is set only 1). If a custom header is set this aggregation has no effect.
      */
    def getHeadEndItems(): js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeadItems headItems}.
      *
      * The buttons shown in the begin (left in left-to-right case) of the Shell header. Currently max. 3 visible
      * buttons are supported. If a custom header is set this aggregation has no effect.
      */
    def getHeadItems(): js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * The application icon. If a custom header is set this property has no effect.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getSearch search}.
      *
      * Experimental (This aggregation might change in future!): The search control which should be displayed
      * in the shell header. If a custom header is set this aggregation has no effect.
      */
    def getSearch(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @since 1.18
      *
      * Gets current value of property {@link #getSearchVisible searchVisible}.
      *
      * If set to false, the search area (aggregation 'search') is hidden. If a custom header is set this property
      * has no effect.
      *
      * Default value is `true`.
      *
      * @returns Value of property `searchVisible`
      */
    def getSearchVisible(): Boolean = js.native
    
    /**
      * @deprecated (since 1.16.3) - Curtain is deprecated and replaced by ShellOverlay mechanism.
      *
      * Gets current value of property {@link #getShowCurtain showCurtain}.
      *
      * Shows / Hides the curtain.
      *
      * @returns Value of property `showCurtain`
      */
    def getShowCurtain(): Boolean = js.native
    
    /**
      * @deprecated (since 1.16.3) - Curtain is deprecated and replaced by ShellOverlay mechanism.
      *
      * Gets current value of property {@link #getShowCurtainPane showCurtainPane}.
      *
      * Shows / Hides the side pane on the curtain.
      *
      * @returns Value of property `showCurtainPane`
      */
    def getShowCurtainPane(): Boolean = js.native
    
    /**
      * @since 1.22.0
      *
      * Gets content of aggregation {@link #getUser user}.
      *
      * The user item which is rendered in the shell header beside the items. If a custom header is set this
      * aggregation has no effect.
      */
    def getUser(): typings.openui5.sapUiUnifiedShellHeadUserItemMod.default = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getCurtainContent curtainContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCurtainContent(
      /**
      * The curtainContent whose index is looked for
      */
    oCurtainContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getCurtainPaneContent curtainPaneContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCurtainPaneContent(
      /**
      * The curtainPaneContent whose index is looked for
      */
    oCurtainPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.ShellHeadItem` in the aggregation {@link #getHeadEndItems headEndItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeadEndItem(
      /**
      * The headEndItem whose index is looked for
      */
    oHeadEndItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.ShellHeadItem` in the aggregation {@link #getHeadItems headItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeadItem(
      /**
      * The headItem whose index is looked for
      */
    oHeadItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default
    ): int = js.native
    
    /**
      * Inserts a curtainContent into the aggregation {@link #getCurtainContent curtainContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCurtainContent(
      /**
      * The curtainContent to insert; if empty, nothing is inserted
      */
    oCurtainContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the curtainContent should be inserted at; for a negative value of `iIndex`, the curtainContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the curtainContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a curtainPaneContent into the aggregation {@link #getCurtainPaneContent curtainPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCurtainPaneContent(
      /**
      * The curtainPaneContent to insert; if empty, nothing is inserted
      */
    oCurtainPaneContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the curtainPaneContent should be inserted at; for a negative value of `iIndex`, the
      * curtainPaneContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the curtainPaneContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a headEndItem into the aggregation {@link #getHeadEndItems headEndItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeadEndItem(
      /**
      * The headEndItem to insert; if empty, nothing is inserted
      */
    oHeadEndItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default,
      /**
      * The `0`-based index the headEndItem should be inserted at; for a negative value of `iIndex`, the headEndItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headEndItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a headItem into the aggregation {@link #getHeadItems headItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeadItem(
      /**
      * The headItem to insert; if empty, nothing is inserted
      */
    oHeadItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default,
      /**
      * The `0`-based index the headItem should be inserted at; for a negative value of `iIndex`, the headItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCurtainContent curtainContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCurtainContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCurtainPaneContent curtainPaneContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCurtainPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeadEndItems headEndItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeadEndItems(): js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeadItems headItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeadItems(): js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] = js.native
    
    def removeCurtainContent(/**
      * The curtainContent to remove or its index or id
      */
    vCurtainContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a curtainContent from the aggregation {@link #getCurtainContent curtainContent}.
      *
      * @returns The removed curtainContent or `null`
      */
    def removeCurtainContent(/**
      * The curtainContent to remove or its index or id
      */
    vCurtainContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeCurtainContent(
      /**
      * The curtainContent to remove or its index or id
      */
    vCurtainContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeCurtainPaneContent(/**
      * The curtainPaneContent to remove or its index or id
      */
    vCurtainPaneContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a curtainPaneContent from the aggregation {@link #getCurtainPaneContent curtainPaneContent}.
      *
      * @returns The removed curtainPaneContent or `null`
      */
    def removeCurtainPaneContent(/**
      * The curtainPaneContent to remove or its index or id
      */
    vCurtainPaneContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeCurtainPaneContent(
      /**
      * The curtainPaneContent to remove or its index or id
      */
    vCurtainPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeHeadEndItem(/**
      * The headEndItem to remove or its index or id
      */
    vHeadEndItem: String): typings.openui5.sapUiUnifiedShellHeadItemMod.default | Null = js.native
    /**
      * Removes a headEndItem from the aggregation {@link #getHeadEndItems headEndItems}.
      *
      * @returns The removed headEndItem or `null`
      */
    def removeHeadEndItem(/**
      * The headEndItem to remove or its index or id
      */
    vHeadEndItem: int): typings.openui5.sapUiUnifiedShellHeadItemMod.default | Null = js.native
    def removeHeadEndItem(
      /**
      * The headEndItem to remove or its index or id
      */
    vHeadEndItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default
    ): typings.openui5.sapUiUnifiedShellHeadItemMod.default | Null = js.native
    
    def removeHeadItem(/**
      * The headItem to remove or its index or id
      */
    vHeadItem: String): typings.openui5.sapUiUnifiedShellHeadItemMod.default | Null = js.native
    /**
      * Removes a headItem from the aggregation {@link #getHeadItems headItems}.
      *
      * @returns The removed headItem or `null`
      */
    def removeHeadItem(/**
      * The headItem to remove or its index or id
      */
    vHeadItem: int): typings.openui5.sapUiUnifiedShellHeadItemMod.default | Null = js.native
    def removeHeadItem(
      /**
      * The headItem to remove or its index or id
      */
    vHeadItem: typings.openui5.sapUiUnifiedShellHeadItemMod.default
    ): typings.openui5.sapUiUnifiedShellHeadItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * The application icon. If a custom header is set this property has no effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSearch search}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSearch(/**
      * The search to set
      */
    oSearch: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @since 1.18
      *
      * Sets a new value for property {@link #getSearchVisible searchVisible}.
      *
      * If set to false, the search area (aggregation 'search') is hidden. If a custom header is set this property
      * has no effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSearchVisible(): this.type = js.native
    def setSearchVisible(/**
      * New value for property `searchVisible`
      */
    bSearchVisible: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.16.3) - Curtain is deprecated and replaced by ShellOverlay mechanism.
      *
      * Sets a new value for property {@link #getShowCurtain showCurtain}.
      *
      * Shows / Hides the curtain.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCurtain(): this.type = js.native
    def setShowCurtain(/**
      * New value for property `showCurtain`
      */
    bShowCurtain: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.16.3) - Curtain is deprecated and replaced by ShellOverlay mechanism.
      *
      * Sets a new value for property {@link #getShowCurtainPane showCurtainPane}.
      *
      * Shows / Hides the side pane on the curtain.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCurtainPane(): this.type = js.native
    def setShowCurtainPane(/**
      * New value for property `showCurtainPane`
      */
    bShowCurtainPane: Boolean): this.type = js.native
    
    /**
      * @since 1.22.0
      *
      * Sets the aggregated {@link #getUser user}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUser(/**
      * The user to set
      */
    oUser: typings.openui5.sapUiUnifiedShellHeadUserItemMod.default): this.type = js.native
  }
  
  trait ShellSettings
    extends StObject
       with ShellLayoutSettings {
    
    /**
      * The content to appear in the curtain area.
      */
    var curtainContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content to appear in the pane area of the curtain.
      */
    var curtainPaneContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The buttons shown in the end (right in left-to-right case) of the Shell header. Currently max. 3 visible
      * buttons are supported (when user is set only 1). If a custom header is set this aggregation has no effect.
      */
    var headEndItems: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] | typings.openui5.sapUiUnifiedShellHeadItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The buttons shown in the begin (left in left-to-right case) of the Shell header. Currently max. 3 visible
      * buttons are supported. If a custom header is set this aggregation has no effect.
      */
    var headItems: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] | typings.openui5.sapUiUnifiedShellHeadItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The application icon. If a custom header is set this property has no effect.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Experimental (This aggregation might change in future!): The search control which should be displayed
      * in the shell header. If a custom header is set this aggregation has no effect.
      */
    var search: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @since 1.18
      *
      * If set to false, the search area (aggregation 'search') is hidden. If a custom header is set this property
      * has no effect.
      */
    var searchVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.16.3) - Curtain is deprecated and replaced by ShellOverlay mechanism.
      *
      * Shows / Hides the curtain.
      */
    var showCurtain: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.16.3) - Curtain is deprecated and replaced by ShellOverlay mechanism.
      *
      * Shows / Hides the side pane on the curtain.
      */
    var showCurtainPane: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.22.0
      *
      * The user item which is rendered in the shell header beside the items. If a custom header is set this
      * aggregation has no effect.
      */
    var user: js.UndefOr[typings.openui5.sapUiUnifiedShellHeadUserItemMod.default] = js.undefined
  }
  object ShellSettings {
    
    inline def apply(): ShellSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellSettings] (val x: Self) extends AnyVal {
      
      inline def setCurtainContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "curtainContent", value.asInstanceOf[js.Any])
      
      inline def setCurtainContentUndefined: Self = StObject.set(x, "curtainContent", js.undefined)
      
      inline def setCurtainContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "curtainContent", js.Array(value*))
      
      inline def setCurtainPaneContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "curtainPaneContent", value.asInstanceOf[js.Any])
      
      inline def setCurtainPaneContentUndefined: Self = StObject.set(x, "curtainPaneContent", js.undefined)
      
      inline def setCurtainPaneContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "curtainPaneContent", js.Array(value*))
      
      inline def setHeadEndItems(
        value: js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] | typings.openui5.sapUiUnifiedShellHeadItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headEndItems", value.asInstanceOf[js.Any])
      
      inline def setHeadEndItemsUndefined: Self = StObject.set(x, "headEndItems", js.undefined)
      
      inline def setHeadEndItemsVarargs(value: typings.openui5.sapUiUnifiedShellHeadItemMod.default*): Self = StObject.set(x, "headEndItems", js.Array(value*))
      
      inline def setHeadItems(
        value: js.Array[typings.openui5.sapUiUnifiedShellHeadItemMod.default] | typings.openui5.sapUiUnifiedShellHeadItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headItems", value.asInstanceOf[js.Any])
      
      inline def setHeadItemsUndefined: Self = StObject.set(x, "headItems", js.undefined)
      
      inline def setHeadItemsVarargs(value: typings.openui5.sapUiUnifiedShellHeadItemMod.default*): Self = StObject.set(x, "headItems", js.Array(value*))
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSearch(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSearchVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "searchVisible", value.asInstanceOf[js.Any])
      
      inline def setSearchVisibleUndefined: Self = StObject.set(x, "searchVisible", js.undefined)
      
      inline def setShowCurtain(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCurtain", value.asInstanceOf[js.Any])
      
      inline def setShowCurtainPane(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCurtainPane", value.asInstanceOf[js.Any])
      
      inline def setShowCurtainPaneUndefined: Self = StObject.set(x, "showCurtainPane", js.undefined)
      
      inline def setShowCurtainUndefined: Self = StObject.set(x, "showCurtain", js.undefined)
      
      inline def setUser(value: typings.openui5.sapUiUnifiedShellHeadUserItemMod.default): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
