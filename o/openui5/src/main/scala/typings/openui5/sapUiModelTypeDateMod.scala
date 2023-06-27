package typings.openui5

import typings.openui5.anon.MaximumMinimum
import typings.openui5.anon.`13`
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTypeDateMod {
  
  @JSImport("sap/ui/model/type/Date", JSImport.Default)
  @js.native
  /**
    * Constructor for a Date type.
    */
  open class default () extends Date1 {
    def this(/**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.DateFormat.getDateInstance DateFormat}.
      */
    oFormatOptions: `13`) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.DateFormat.getDateInstance DateFormat}.
      */
    oFormatOptions: Unit,
      /**
      * Value constraints
      */
    oConstraints: MaximumMinimum
    ) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.DateFormat.getDateInstance DateFormat}.
      */
    oFormatOptions: `13`,
      /**
      * Value constraints
      */
    oConstraints: MaximumMinimum
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/type/Date", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.type.Date with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.SimpleType.extend}.
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
    oClassInfo: ClassInfo[T, Date1]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Date1],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.type.Date.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Date1
    extends typings.openui5.sapUiModelSimpleTypeMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the output pattern.
      * See:
      * 	sap.ui.core.format.DateFormat.getDateInstance
      *
      * @returns The output pattern
      */
    def getOutputPattern(): String = js.native
    
    /**
      * @experimental (since 1.114.0)
      *
      * Returns a language-dependent placeholder text such as "e.g. " where  is formatted
      * using this type.
      *
      * @returns The language-dependent placeholder text or `undefined` if the type does not offer a placeholder
      */
    def getPlaceholderText(): js.UndefOr[String] = js.native
  }
}
