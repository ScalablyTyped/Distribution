package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreLibraryMod.routing.HistoryDirection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingRouterHashChangerMod {
  
  @JSImport("sap/ui/core/routing/RouterHashChanger", JSImport.Default)
  @js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    */
  open class default () extends RouterHashChanger
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/RouterHashChanger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a new subclass of class sap.ui.core.routing.RouterHashChanger with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.routing.HashChangerBase.extend}.
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
    oClassInfo: ClassInfo[T, RouterHashChanger]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RouterHashChanger],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a metadata object for class sap.ui.core.routing.RouterHashChanger.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait RouterHashChanger
    extends typings.openui5.sapUiCoreRoutingHashChangerBaseMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Save the given hash and potentially fires a "hashChanged" event; may be extended to modify the hash before
      * firing the event.
      */
    def fireHashChanged(
      /**
      * the new hash of the browser
      */
    sHash: String,
      /**
      * the prefixes and hashes for the child RouterHashChangers
      */
    oSubHashMap: js.Object,
      /**
      * if this parameter is set to true, the given sHash is saved in the instance but no "hashChanged" event
      * is fired.
      */
    bUpdateHashOnly: Boolean
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the current hash
      *
      * @returns the current hash
      */
    def getHash(): String = js.native
    
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for the hash replacement
      */
    sDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof routing.HistoryDirection * / any */ String,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashReplaced"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: js.Promise[Any]
    ): js.UndefOr[js.Promise[Any]] = js.native
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for the hash replacement
      */
    sDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof routing.HistoryDirection * / any */ String,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashReplaced"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: js.Promise[Any],
      /**
      * Whether this RouterHashChanger shouldn't collect the prefixes from its active child RouterHashChanger(s)
      * and forward them as delete prefixes within the next "hashReplaced" event
      */
    bSuppressActiveHashCollect: Boolean
    ): js.UndefOr[js.Promise[Any]] = js.native
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for the hash replacement
      */
    sDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof routing.HistoryDirection * / any */ String,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashReplaced"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: Unit,
      /**
      * Whether this RouterHashChanger shouldn't collect the prefixes from its active child RouterHashChanger(s)
      * and forward them as delete prefixes within the next "hashReplaced" event
      */
    bSuppressActiveHashCollect: Boolean
    ): js.UndefOr[js.Promise[Any]] = js.native
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for the hash replacement
      */
    sDirection: HistoryDirection,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashReplaced"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: js.Promise[Any]
    ): js.UndefOr[js.Promise[Any]] = js.native
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for the hash replacement
      */
    sDirection: HistoryDirection,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashReplaced"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: js.Promise[Any],
      /**
      * Whether this RouterHashChanger shouldn't collect the prefixes from its active child RouterHashChanger(s)
      * and forward them as delete prefixes within the next "hashReplaced" event
      */
    bSuppressActiveHashCollect: Boolean
    ): js.UndefOr[js.Promise[Any]] = js.native
    def replaceHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * The direction information for the hash replacement
      */
    sDirection: HistoryDirection,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashReplaced"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: Unit,
      /**
      * Whether this RouterHashChanger shouldn't collect the prefixes from its active child RouterHashChanger(s)
      * and forward them as delete prefixes within the next "hashReplaced" event
      */
    bSuppressActiveHashCollect: Boolean
    ): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Reset the hash if the given router is the active router that is saved in this RouterHashChanger
      *
      * This is needed for allowing to fire the hashChanged event with the previous hash again after displaying
      * a Target without involving a Router.
      *
      * @returns The current RouterHashChanger for chaining the method
      */
    def resetHash(
      /**
      * the router from which the resetHash is started
      */
    oRouter: typings.openui5.sapUiCoreRoutingRouterMod.default
    ): this.type = js.native
    
    def setHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashSet"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: js.Promise[Any]
    ): js.UndefOr[js.Promise[Any]] = js.native
    def setHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashSet"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: js.Promise[Any],
      /**
      * Whether this RouterHashChanger shouldn't collect the prefixes from its active child RouterHashChanger(s)
      * and forward them as delete prefixes within the next "hashSet" event
      */
    bSuppressActiveHashCollect: Boolean
    ): js.UndefOr[js.Promise[Any]] = js.native
    def setHash(
      /**
      * New hash
      */
    sHash: String,
      /**
      * When this parameter is given, this RouterHashChanger switchs to collect mode and all hash changes from
      * its children will be collected. When this promise resolves, this RouterHashChanger fires a "hashSet"
      * event with its own hash and the hashes which are collected from the child RouterHashChanger(s).
      */
    pNestedHashChange: Unit,
      /**
      * Whether this RouterHashChanger shouldn't collect the prefixes from its active child RouterHashChanger(s)
      * and forward them as delete prefixes within the next "hashSet" event
      */
    bSuppressActiveHashCollect: Boolean
    ): js.UndefOr[js.Promise[Any]] = js.native
  }
}
