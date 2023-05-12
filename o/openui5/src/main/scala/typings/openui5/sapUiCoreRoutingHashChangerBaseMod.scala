package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreLibraryMod.routing.HistoryDirection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingHashChangerBaseMod {
  
  @JSImport("sap/ui/core/routing/HashChangerBase", JSImport.Default)
  @js.native
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    */
  open class default () extends HashChangerBase
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/HashChangerBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates a new subclass of class sap.ui.core.routing.HashChangerBase with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, HashChangerBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HashChangerBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns a metadata object for class sap.ui.core.routing.HashChangerBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait HashChangerBase
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for this hash replacement
      */
    sDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof routing.HistoryDirection * / any */ String
    ): Unit = js.native
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Replaces the hash with a certain value. When using the replace function, no browser history entry is
      * written. If you want to have an entry in the browser history, please use the {@link #setHash} function.
      *
      * The `sDirection` parameter can be used to provide direction information on the navigation which leads
      * to this hash replacement. This is typically used when synchronizing the hashes between multiple frames
      * to provide information to the frame where the hash is replaced with the navigation direction in the other
      * frame where the navigation occurs.
      */
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for this hash replacement
      */
    sDirection: HistoryDirection
    ): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the hash to a certain value. When using this function, a browser history entry is written. If you
      * do not want to have an entry in the browser history, please use the {@link #replaceHash} function.
      */
    def setHash(/**
      * New hash
      */
    sHash: String): Unit = js.native
  }
}
