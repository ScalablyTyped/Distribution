package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestActionsActionMod {
  
  @JSImport("sap/ui/test/actions/Action", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Action
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/actions/Action", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.actions.Action with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, Action]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Action],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.actions.Action.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait Action
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Checks if the matcher is matching - will get an instance of sap.ui.core.Control as parameter Should be
      * overwritten by subclasses
      */
    def executeOn(
      /**
      * the {@link sap.ui.core.Element} or a control (extends element) the action will be executed on
      */
    element: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * @SINCE 1.38
      *
      * Gets current value of property {@link #getIdSuffix idSuffix}.
      *
      * Use this only if the target property or the default of the action does not work for your control. The
      * id suffix of the DOM Element the press action will be executed on. For most of the controls you do not
      * have to specify this, since the Control Adapters will find the correct DOM Element. But some controls
      * have multiple DOM elements that could be target of your Action. Then you should set this property. For
      * a detailed documentation of the suffix see {@link sap.ui.core.Element#$}
      *
      * @returns Value of property `idSuffix`
      */
    def getIdSuffix(): String = js.native
    
    /**
      * @SINCE 1.38
      *
      * Sets a new value for property {@link #getIdSuffix idSuffix}.
      *
      * Use this only if the target property or the default of the action does not work for your control. The
      * id suffix of the DOM Element the press action will be executed on. For most of the controls you do not
      * have to specify this, since the Control Adapters will find the correct DOM Element. But some controls
      * have multiple DOM elements that could be target of your Action. Then you should set this property. For
      * a detailed documentation of the suffix see {@link sap.ui.core.Element#$}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIdSuffix(/**
      * New value for property `idSuffix`
      */
    sIdSuffix: String): this.type = js.native
  }
  
  trait ActionSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * @SINCE 1.38
      *
      * Use this only if the target property or the default of the action does not work for your control. The
      * id suffix of the DOM Element the press action will be executed on. For most of the controls you do not
      * have to specify this, since the Control Adapters will find the correct DOM Element. But some controls
      * have multiple DOM elements that could be target of your Action. Then you should set this property. For
      * a detailed documentation of the suffix see {@link sap.ui.core.Element#$}
      */
    var idSuffix: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ActionSettings {
    
    inline def apply(): ActionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSettings]
    }
    
    extension [Self <: ActionSettings](x: Self) {
      
      inline def setIdSuffix(value: String | PropertyBindingInfo): Self = StObject.set(x, "idSuffix", value.asInstanceOf[js.Any])
      
      inline def setIdSuffixUndefined: Self = StObject.set(x, "idSuffix", js.undefined)
    }
  }
}
