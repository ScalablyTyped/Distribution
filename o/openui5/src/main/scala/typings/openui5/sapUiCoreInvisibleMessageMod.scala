package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiCoreLibraryMod.InvisibleMessageMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreInvisibleMessageMod {
  
  @JSImport("sap/ui/core/InvisibleMessage", JSImport.Default)
  @js.native
  open class default () extends InvisibleMessage
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/InvisibleMessage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.InvisibleMessage with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, InvisibleMessage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, InvisibleMessage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns the instance of the class.
      *
      * @returns oInstance
      */
    inline def getInstance(): InvisibleMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[InvisibleMessage]
    
    /**
      * Returns a metadata object for class sap.ui.core.InvisibleMessage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait InvisibleMessage
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    def announce(
      /**
      * String to be announced by the screen reader.
      */
    sText: String,
      /**
      * The mode to be inserted in the aria-live attribute.
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InvisibleMessageMode * / any */ String
    ): Unit = js.native
    /**
      * Inserts the string into the respective span, depending on the mode provided.
      */
    def announce(
      /**
      * String to be announced by the screen reader.
      */
    sText: String,
      /**
      * The mode to be inserted in the aria-live attribute.
      */
    sMode: InvisibleMessageMode
    ): Unit = js.native
  }
  
  type InvisibleMessageSettings = ManagedObjectSettings
}
