package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.semantic.ISort
import typings.openui5.sapMSemanticSemanticButtonMod.SemanticButtonSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSemanticSortActionMod {
  
  @JSImport("sap/m/semantic/SortAction", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SortAction.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.m.semantic.SemanticButton#constructor sap.m.semantic.SemanticButton }
    * can be used.
    */
  open class default () extends SortAction {
    def this(/**
      * Optional initial settings for the new control: a map/JSON-object with initial property values, event
      * listeners etc. for the new object
      */
    mSettings: SortActionSettings) = this()
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
      * Optional initial settings for the new control: a map/JSON-object with initial property values, event
      * listeners etc. for the new object
      */
    mSettings: SortActionSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Optional initial settings for the new control: a map/JSON-object with initial property values, event
      * listeners etc. for the new object
      */
    mSettings: SortActionSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_semantic_ISort: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/semantic/SortAction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.semantic.SortAction with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.semantic.SemanticButton.extend}.
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
    oClassInfo: ClassInfo[T, SortAction]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SortAction],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.semantic.SortAction.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SortAction
    extends typings.openui5.sapMSemanticSemanticButtonMod.default
       with ISort
  
  type SortActionSettings = SemanticButtonSettings
}
