package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTestActionsActionMod.ActionSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestActionsDropMod {
  
  @JSImport("sap/ui/test/actions/Drop", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Drop {
    def this(/**
      * Optional object with initial settings for the new instance
      */
    mSettings: DropSettings) = this()
    def this(/**
      * Optional ID for the new instance; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new instance; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: String,
      /**
      * Optional object with initial settings for the new instance
      */
    mSettings: DropSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new instance; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: Unit,
      /**
      * Optional object with initial settings for the new instance
      */
    mSettings: DropSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/actions/Drop", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.actions.Drop with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.test.actions.Action.extend}.
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
    oClassInfo: ClassInfo[T, Drop]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Drop],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.actions.Drop.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait Drop
    extends typings.openui5.sapUiTestActionsActionMod.default {
    
    /**
      * Gets current value of property {@link #getAfter after}.
      *
      * Set `after` to true, to drop the source immediately before the target element.
      *
      * @returns Value of property `after`
      */
    def getAfter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAggregationName aggregationName}.
      *
      * name of the droppable aggregation, whose root to use as drop target. This makes sense only for some controls,
      * where this root DOM element is droppable.
      *
      * @returns Value of property `aggregationName`
      */
    def getAggregationName(): String = js.native
    
    /**
      * Gets current value of property {@link #getBefore before}.
      *
      * specify a position for the drop event, relative to the position of the control's representative DOM element.
      * This makes sense only for the case when dropping right on top of the DOM element makes no sense, and
      * instead, the drop should happen right before or after the element. e.g. sap.m.IconTabBar. Default position
      * is "center", meaning the drop will be directly on the element. Set `before` to true, to drop the source
      * immediately before the target element.
      *
      * @returns Value of property `before`
      */
    def getBefore(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getAfter after}.
      *
      * Set `after` to true, to drop the source immediately before the target element.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAfter(/**
      * New value for property `after`
      */
    bAfter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAggregationName aggregationName}.
      *
      * name of the droppable aggregation, whose root to use as drop target. This makes sense only for some controls,
      * where this root DOM element is droppable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAggregationName(/**
      * New value for property `aggregationName`
      */
    sAggregationName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBefore before}.
      *
      * specify a position for the drop event, relative to the position of the control's representative DOM element.
      * This makes sense only for the case when dropping right on top of the DOM element makes no sense, and
      * instead, the drop should happen right before or after the element. e.g. sap.m.IconTabBar. Default position
      * is "center", meaning the drop will be directly on the element. Set `before` to true, to drop the source
      * immediately before the target element.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBefore(/**
      * New value for property `before`
      */
    bBefore: Boolean): this.type = js.native
  }
  
  trait DropSettings
    extends StObject
       with ActionSettings {
    
    /**
      * Set `after` to true, to drop the source immediately before the target element.
      */
    var after: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * name of the droppable aggregation, whose root to use as drop target. This makes sense only for some controls,
      * where this root DOM element is droppable.
      */
    var aggregationName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * specify a position for the drop event, relative to the position of the control's representative DOM element.
      * This makes sense only for the case when dropping right on top of the DOM element makes no sense, and
      * instead, the drop should happen right before or after the element. e.g. sap.m.IconTabBar. Default position
      * is "center", meaning the drop will be directly on the element. Set `before` to true, to drop the source
      * immediately before the target element.
      */
    var before: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DropSettings {
    
    inline def apply(): DropSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropSettings]
    }
    
    extension [Self <: DropSettings](x: Self) {
      
      inline def setAfter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAggregationName(value: String | PropertyBindingInfo): Self = StObject.set(x, "aggregationName", value.asInstanceOf[js.Any])
      
      inline def setAggregationNameUndefined: Self = StObject.set(x, "aggregationName", js.undefined)
      
      inline def setBefore(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
}
