package typings.openui5

import typings.openui5.anon.ContainingView
import typings.openui5.anon.Init
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreFragmentMod {
  
  @JSImport("sap/ui/core/Fragment", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Fragment
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Fragment", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an Element/Control by its ID in the context of the Fragment with the given ID
      *
      * @returns Element by its ID and Fragment ID
      */
    inline def byId(
      /**
      * ID of the Fragment from which to retrieve the Control
      */
    sFragmentId: String,
      /**
      * ID of the Element/Control to retrieve
      */
    sId: String
    ): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("byId")(sFragmentId.asInstanceOf[js.Any], sId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.openui5.sapUiCoreElementMod.default]]
    
    /**
      * Returns the ID which a Control with the given ID in the context of the Fragment with the given ID would
      * have.
      *
      * @returns the prefixed ID
      */
    inline def createId(
      /**
      * ID of the Fragment for which to calculate the Control ID
      */
    sFragmentId: String,
      /**
      * Fragment-local ID of the Control to calculate the ID for
      */
    sId: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createId")(sFragmentId.asInstanceOf[js.Any], sId.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Creates a new subclass of class sap.ui.core.Fragment with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Fragment]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Fragment],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.Fragment.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
    
    /**
      * @SINCE 1.58
      *
      * Loads and instantiates a Fragment. A Promise is returned, which resolves with the Fragments content.
      *
      * The Fragment object itself is not an entity with significance beyond this factory.
      *
      * The Fragment types "XML", "JS" and "HTML" are available by default; additional Fragment types can be
      * added using the sap.ui.core.Fragment.registerType() function.
      *
      * Further properties may be supported by future or custom Fragment types. Any given properties will be
      * forwarded to the Fragment implementation.
      *
      * If no fixed ID is given, the Fragment ID is generated. In any case, the Fragment ID will be used as prefix
      * for the IDs of all contained controls.
      *
      * @returns a `Promise` resolving with the resulting control (array) after fragment parsing and instantiation
      */
    inline def load(/**
      * options map
      */
    mOptions: ContainingView): js.Promise[
        typings.openui5.sapUiCoreControlMod.default | js.Array[typings.openui5.sapUiCoreControlMod.default]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        typings.openui5.sapUiCoreControlMod.default | js.Array[typings.openui5.sapUiCoreControlMod.default]
      ]]
    
    /**
      * Registers a new Fragment type
      */
    inline def registerType(
      /**
      * the Fragment type. Types "XML", "HTML" and JS" are built-in and always available.
      */
    sType: String,
      /**
      * an object having the properties "init" and "load".
      */
    oFragmentImpl: Init
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(sType.asInstanceOf[js.Any], oFragmentImpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait Fragment
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(/**
      * New value for property `type`
      */
    sType: String): this.type = js.native
  }
  
  trait FragmentSettings
    extends StObject
       with ManagedObjectSettings {
    
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FragmentSettings {
    
    inline def apply(): FragmentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FragmentSettings]
    }
    
    extension [Self <: FragmentSettings](x: Self) {
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
