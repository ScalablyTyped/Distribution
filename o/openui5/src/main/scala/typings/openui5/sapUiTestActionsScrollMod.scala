package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTestActionsActionMod.ActionSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestActionsScrollMod {
  
  @JSImport("sap/ui/test/actions/Scroll", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Scroll {
    def this(/**
      * Optional object with initial settings for the new instance
      */
    mSettings: ScrollSettings) = this()
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
    mSettings: ScrollSettings
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
    mSettings: ScrollSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/actions/Scroll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.actions.Scroll with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, Scroll]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Scroll],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.actions.Scroll.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait Scroll
    extends typings.openui5.sapUiTestActionsActionMod.default {
    
    /**
      * Gets current value of property {@link #getX x}.
      *
      * Default value is `0`.
      *
      * @returns Value of property `x`
      */
    def getX(): int = js.native
    
    /**
      * Gets current value of property {@link #getY y}.
      *
      * Default value is `0`.
      *
      * @returns Value of property `y`
      */
    def getY(): int = js.native
    
    /**
      * Sets a new value for property {@link #getX x}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setX(): this.type = js.native
    def setX(/**
      * New value for property `x`
      */
    iX: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getY y}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setY(): this.type = js.native
    def setY(/**
      * New value for property `y`
      */
    iY: int): this.type = js.native
  }
  
  trait ScrollSettings
    extends StObject
       with ActionSettings {
    
    var x: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    var y: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object ScrollSettings {
    
    inline def apply(): ScrollSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSettings]
    }
    
    extension [Self <: ScrollSettings](x: Self) {
      
      inline def setX(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
