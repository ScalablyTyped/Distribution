package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.semantic.IFilter
import typings.openui5.sapMLibraryMod.semantic.IGroup
import typings.openui5.sapMLibraryMod.semantic.ISort
import typings.openui5.sapMSemanticSemanticPageMod.SemanticPageSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSemanticMasterPageMod {
  
  @JSImport("sap/m/semantic/MasterPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MasterPage
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MasterPage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MasterPageSettings) = this()
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
    mSettings: MasterPageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MasterPageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/semantic/MasterPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.semantic.MasterPage with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, MasterPage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MasterPage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.semantic.MasterPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MasterPage
    extends typings.openui5.sapMSemanticSemanticPageMod.default {
    
    /**
      * Destroys the addAction in the aggregation {@link #getAddAction addAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAddAction(): this.type = js.native
    
    /**
      * Destroys the cancelAction in the aggregation {@link #getCancelAction cancelAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCancelAction(): this.type = js.native
    
    /**
      * Destroys the deleteAction in the aggregation {@link #getDeleteAction deleteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDeleteAction(): this.type = js.native
    
    /**
      * Destroys the editAction in the aggregation {@link #getEditAction editAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEditAction(): this.type = js.native
    
    /**
      * Destroys the filter in the aggregation {@link #getFilter filter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilter(): this.type = js.native
    
    /**
      * Destroys the forwardAction in the aggregation {@link #getForwardAction forwardAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyForwardAction(): this.type = js.native
    
    /**
      * Destroys the group in the aggregation {@link #getGroup group}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyGroup(): this.type = js.native
    
    /**
      * Destroys the mainAction in the aggregation {@link #getMainAction mainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMainAction(): this.type = js.native
    
    /**
      * Destroys the messagesIndicator in the aggregation {@link #getMessagesIndicator messagesIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMessagesIndicator(): this.type = js.native
    
    /**
      * Destroys the multiSelectAction in the aggregation {@link #getMultiSelectAction multiSelectAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMultiSelectAction(): this.type = js.native
    
    /**
      * Destroys the negativeAction in the aggregation {@link #getNegativeAction negativeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNegativeAction(): this.type = js.native
    
    /**
      * Destroys the positiveAction in the aggregation {@link #getPositiveAction positiveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPositiveAction(): this.type = js.native
    
    /**
      * Destroys the saveAction in the aggregation {@link #getSaveAction saveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySaveAction(): this.type = js.native
    
    /**
      * Destroys the sort in the aggregation {@link #getSort sort}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySort(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAddAction addAction}.
      *
      * Add action
      */
    def getAddAction(): typings.openui5.sapMSemanticAddActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getCancelAction cancelAction}.
      *
      * Cancel action
      */
    def getCancelAction(): typings.openui5.sapMSemanticCancelActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getDeleteAction deleteAction}.
      *
      * Delete action
      */
    def getDeleteAction(): typings.openui5.sapMSemanticDeleteActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getEditAction editAction}.
      *
      * Edit action
      */
    def getEditAction(): typings.openui5.sapMSemanticEditActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFilter filter}.
      *
      * Filter action
      */
    def getFilter(): IFilter = js.native
    
    /**
      * Gets content of aggregation {@link #getForwardAction forwardAction}.
      *
      * Forward action
      */
    def getForwardAction(): typings.openui5.sapMSemanticForwardActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getGroup group}.
      *
      * Group action
      */
    def getGroup(): IGroup = js.native
    
    /**
      * Gets content of aggregation {@link #getMainAction mainAction}.
      *
      * Main action
      */
    def getMainAction(): typings.openui5.sapMSemanticMainActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getMessagesIndicator messagesIndicator}.
      *
      * MessagesIndicator
      */
    def getMessagesIndicator(): typings.openui5.sapMSemanticMessagesIndicatorMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getMultiSelectAction multiSelectAction}.
      *
      * MultiSelect action
      */
    def getMultiSelectAction(): typings.openui5.sapMSemanticMultiSelectActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getNegativeAction negativeAction}.
      *
      * Negative action
      */
    def getNegativeAction(): typings.openui5.sapMSemanticNegativeActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getPositiveAction positiveAction}.
      *
      * Positive action
      */
    def getPositiveAction(): typings.openui5.sapMSemanticPositiveActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSaveAction saveAction}.
      *
      * Save action
      */
    def getSaveAction(): typings.openui5.sapMSemanticSaveActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSort sort}.
      *
      * Sort action
      */
    def getSort(): ISort = js.native
    
    /**
      * Sets the aggregated {@link #getAddAction addAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAddAction(/**
      * The addAction to set
      */
    oAddAction: typings.openui5.sapMSemanticAddActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCancelAction cancelAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCancelAction(
      /**
      * The cancelAction to set
      */
    oCancelAction: typings.openui5.sapMSemanticCancelActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDeleteAction deleteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDeleteAction(
      /**
      * The deleteAction to set
      */
    oDeleteAction: typings.openui5.sapMSemanticDeleteActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getEditAction editAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditAction(/**
      * The editAction to set
      */
    oEditAction: typings.openui5.sapMSemanticEditActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFilter filter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilter(/**
      * The filter to set
      */
    oFilter: IFilter): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getForwardAction forwardAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setForwardAction(
      /**
      * The forwardAction to set
      */
    oForwardAction: typings.openui5.sapMSemanticForwardActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getGroup group}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroup(/**
      * The group to set
      */
    oGroup: IGroup): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMainAction mainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMainAction(/**
      * The mainAction to set
      */
    oMainAction: typings.openui5.sapMSemanticMainActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMessagesIndicator messagesIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMessagesIndicator(
      /**
      * The messagesIndicator to set
      */
    oMessagesIndicator: typings.openui5.sapMSemanticMessagesIndicatorMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMultiSelectAction multiSelectAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiSelectAction(
      /**
      * The multiSelectAction to set
      */
    oMultiSelectAction: typings.openui5.sapMSemanticMultiSelectActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getNegativeAction negativeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNegativeAction(
      /**
      * The negativeAction to set
      */
    oNegativeAction: typings.openui5.sapMSemanticNegativeActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getPositiveAction positiveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPositiveAction(
      /**
      * The positiveAction to set
      */
    oPositiveAction: typings.openui5.sapMSemanticPositiveActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSaveAction saveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSaveAction(/**
      * The saveAction to set
      */
    oSaveAction: typings.openui5.sapMSemanticSaveActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSort sort}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSort(/**
      * The sort to set
      */
    oSort: ISort): this.type = js.native
  }
  
  trait MasterPageSettings
    extends StObject
       with SemanticPageSettings {
    
    /**
      * Add action
      */
    var addAction: js.UndefOr[typings.openui5.sapMSemanticAddActionMod.default] = js.undefined
    
    /**
      * Cancel action
      */
    var cancelAction: js.UndefOr[typings.openui5.sapMSemanticCancelActionMod.default] = js.undefined
    
    /**
      * Delete action
      */
    var deleteAction: js.UndefOr[typings.openui5.sapMSemanticDeleteActionMod.default] = js.undefined
    
    /**
      * Edit action
      */
    var editAction: js.UndefOr[typings.openui5.sapMSemanticEditActionMod.default] = js.undefined
    
    /**
      * Filter action
      */
    var filter: js.UndefOr[IFilter] = js.undefined
    
    /**
      * Forward action
      */
    var forwardAction: js.UndefOr[typings.openui5.sapMSemanticForwardActionMod.default] = js.undefined
    
    /**
      * Group action
      */
    var group: js.UndefOr[IGroup] = js.undefined
    
    /**
      * Main action
      */
    var mainAction: js.UndefOr[typings.openui5.sapMSemanticMainActionMod.default] = js.undefined
    
    /**
      * MessagesIndicator
      */
    var messagesIndicator: js.UndefOr[typings.openui5.sapMSemanticMessagesIndicatorMod.default] = js.undefined
    
    /**
      * MultiSelect action
      */
    var multiSelectAction: js.UndefOr[typings.openui5.sapMSemanticMultiSelectActionMod.default] = js.undefined
    
    /**
      * Negative action
      */
    var negativeAction: js.UndefOr[typings.openui5.sapMSemanticNegativeActionMod.default] = js.undefined
    
    /**
      * Positive action
      */
    var positiveAction: js.UndefOr[typings.openui5.sapMSemanticPositiveActionMod.default] = js.undefined
    
    /**
      * Save action
      */
    var saveAction: js.UndefOr[typings.openui5.sapMSemanticSaveActionMod.default] = js.undefined
    
    /**
      * Sort action
      */
    var sort: js.UndefOr[ISort] = js.undefined
  }
  object MasterPageSettings {
    
    inline def apply(): MasterPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MasterPageSettings]
    }
    
    extension [Self <: MasterPageSettings](x: Self) {
      
      inline def setAddAction(value: typings.openui5.sapMSemanticAddActionMod.default): Self = StObject.set(x, "addAction", value.asInstanceOf[js.Any])
      
      inline def setAddActionUndefined: Self = StObject.set(x, "addAction", js.undefined)
      
      inline def setCancelAction(value: typings.openui5.sapMSemanticCancelActionMod.default): Self = StObject.set(x, "cancelAction", value.asInstanceOf[js.Any])
      
      inline def setCancelActionUndefined: Self = StObject.set(x, "cancelAction", js.undefined)
      
      inline def setDeleteAction(value: typings.openui5.sapMSemanticDeleteActionMod.default): Self = StObject.set(x, "deleteAction", value.asInstanceOf[js.Any])
      
      inline def setDeleteActionUndefined: Self = StObject.set(x, "deleteAction", js.undefined)
      
      inline def setEditAction(value: typings.openui5.sapMSemanticEditActionMod.default): Self = StObject.set(x, "editAction", value.asInstanceOf[js.Any])
      
      inline def setEditActionUndefined: Self = StObject.set(x, "editAction", js.undefined)
      
      inline def setFilter(value: IFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setForwardAction(value: typings.openui5.sapMSemanticForwardActionMod.default): Self = StObject.set(x, "forwardAction", value.asInstanceOf[js.Any])
      
      inline def setForwardActionUndefined: Self = StObject.set(x, "forwardAction", js.undefined)
      
      inline def setGroup(value: IGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setMainAction(value: typings.openui5.sapMSemanticMainActionMod.default): Self = StObject.set(x, "mainAction", value.asInstanceOf[js.Any])
      
      inline def setMainActionUndefined: Self = StObject.set(x, "mainAction", js.undefined)
      
      inline def setMessagesIndicator(value: typings.openui5.sapMSemanticMessagesIndicatorMod.default): Self = StObject.set(x, "messagesIndicator", value.asInstanceOf[js.Any])
      
      inline def setMessagesIndicatorUndefined: Self = StObject.set(x, "messagesIndicator", js.undefined)
      
      inline def setMultiSelectAction(value: typings.openui5.sapMSemanticMultiSelectActionMod.default): Self = StObject.set(x, "multiSelectAction", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectActionUndefined: Self = StObject.set(x, "multiSelectAction", js.undefined)
      
      inline def setNegativeAction(value: typings.openui5.sapMSemanticNegativeActionMod.default): Self = StObject.set(x, "negativeAction", value.asInstanceOf[js.Any])
      
      inline def setNegativeActionUndefined: Self = StObject.set(x, "negativeAction", js.undefined)
      
      inline def setPositiveAction(value: typings.openui5.sapMSemanticPositiveActionMod.default): Self = StObject.set(x, "positiveAction", value.asInstanceOf[js.Any])
      
      inline def setPositiveActionUndefined: Self = StObject.set(x, "positiveAction", js.undefined)
      
      inline def setSaveAction(value: typings.openui5.sapMSemanticSaveActionMod.default): Self = StObject.set(x, "saveAction", value.asInstanceOf[js.Any])
      
      inline def setSaveActionUndefined: Self = StObject.set(x, "saveAction", js.undefined)
      
      inline def setSort(value: ISort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
