package typings.openui5

import typings.openui5.anon.ItemContext
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListBaseMod.ListBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTreeMod {
  
  @JSImport("sap/m/Tree", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Tree.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:/tree/ Tree}
    */
  open class default () extends Tree {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TreeSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: TreeSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TreeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Tree with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListBase.extend}.
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
    oClassInfo: ClassInfo[T, Tree]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Tree],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Tree.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Tree
    extends typings.openui5.sapMListBaseMod.default {
    
    /**
      * @SINCE 1.50
      *
      * Attaches event handler `fnFunction` to the {@link #event:toggleOpenState toggleOpenState} event of this
      * `sap.m.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tree` itself.
      *
      * Fired when an item has been expanded or collapsed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleOpenState(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggleOpenState(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.50
      *
      * Attaches event handler `fnFunction` to the {@link #event:toggleOpenState toggleOpenState} event of this
      * `sap.m.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Tree` itself.
      *
      * Fired when an item has been expanded or collapsed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleOpenState(
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
    def attachToggleOpenState(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    def collapse(/**
      * The index or indices of the tree items to be collapsed
      */
    vParam: js.Array[int]): this.type = js.native
    /**
      * @SINCE 1.56.0
      *
      * Collapses one or multiple items.
      *
      * @returns A reference to the Tree control
      */
    def collapse(/**
      * The index or indices of the tree items to be collapsed
      */
    vParam: int): this.type = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Collapses all nodes.
      *
      * @returns A reference to the Tree control
      */
    def collapseAll(): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Detaches event handler `fnFunction` from the {@link #event:toggleOpenState toggleOpenState} event of
      * this `sap.m.Tree`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleOpenState(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggleOpenState(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    def expand(/**
      * The index or indices of the item to be expanded
      */
    vParam: js.Array[int]): this.type = js.native
    /**
      * @SINCE 1.56.0
      *
      * Expands one or multiple items. Note that items that are hidden at the time of calling this API can't
      * be expanded.
      *
      * @returns A reference to the Tree control
      */
    def expand(/**
      * The index or indices of the item to be expanded
      */
    vParam: int): this.type = js.native
    
    /**
      * @SINCE 1.48.0
      *
      * Defines the level to which the tree is expanded. The function can be used to define the initial expanding
      * state. An alternative way to define the initial expanding state is to set the parameter `numberOfExpandedLevels`
      * of the binding.
      *
      * Example:
      * ```javascript
      *
      *   oTree.bindItems({
      *      path: "...",
      *      parameters: {
      *         numberOfExpandedLevels: 1
      *      }
      *   });
      * ```
      *
      *
      * @returns Returns `this` to allow method chaining
      */
    def expandToLevel(/**
      * The level to which the data is expanded
      */
    iLevel: int): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Fires event {@link #event:toggleOpenState toggleOpenState} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleOpenState(): this.type = js.native
    def fireToggleOpenState(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemContext): this.type = js.native
  }
  
  trait TreeSettings
    extends StObject
       with ListBaseSettings {
    
    /**
      * @SINCE 1.50
      *
      * Fired when an item has been expanded or collapsed by user interaction.
      */
    var toggleOpenState: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object TreeSettings {
    
    inline def apply(): TreeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSettings]
    }
    
    extension [Self <: TreeSettings](x: Self) {
      
      inline def setToggleOpenState(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggleOpenState", js.Any.fromFunction1(value))
      
      inline def setToggleOpenStateUndefined: Self = StObject.set(x, "toggleOpenState", js.undefined)
    }
  }
}
