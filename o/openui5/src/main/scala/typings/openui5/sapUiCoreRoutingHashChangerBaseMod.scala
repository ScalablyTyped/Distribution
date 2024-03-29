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
    * Protected:  Do not call from applications (only from related classes in the framework)
    */
  open class default () extends HashChangerBase
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/HashChangerBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
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
      * Protected:  Do not call from applications (only from related classes in the framework)
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
      * Protected:  Do not call from applications (only from related classes in the framework)
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the hash to a certain value. When using this function, a browser history entry is written. If you
      * do not want to have an entry in the browser history, please use the {@link #replaceHash} function.
      */
    def setHash(/**
      * New hash
      */
    sHash: String): Unit = js.native
  }
  
  trait HashChangerBase$HashChangedEventParameters extends StObject {
    
    /**
      * The full format of the hash if the newHash only contains part of the relevant hash
      */
    var fullHash: js.UndefOr[String] = js.undefined
    
    /**
      * The new hash segment
      */
    var newHash: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The hash segment before it's changed
      */
    var oldHash: js.UndefOr[String] = js.undefined
  }
  object HashChangerBase$HashChangedEventParameters {
    
    inline def apply(): HashChangerBase$HashChangedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashChangerBase$HashChangedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashChangerBase$HashChangedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setFullHash(value: String): Self = StObject.set(x, "fullHash", value.asInstanceOf[js.Any])
      
      inline def setFullHashUndefined: Self = StObject.set(x, "fullHash", js.undefined)
      
      inline def setNewHash(value: js.Object): Self = StObject.set(x, "newHash", value.asInstanceOf[js.Any])
      
      inline def setNewHashUndefined: Self = StObject.set(x, "newHash", js.undefined)
      
      inline def setOldHash(value: String): Self = StObject.set(x, "oldHash", value.asInstanceOf[js.Any])
      
      inline def setOldHashUndefined: Self = StObject.set(x, "oldHash", js.undefined)
    }
  }
  
  trait HashChangerBase$HashReplacedEventParameters extends StObject {
    
    /**
      * The relevant hash segment
      */
    var hash: js.UndefOr[String] = js.undefined
  }
  object HashChangerBase$HashReplacedEventParameters {
    
    inline def apply(): HashChangerBase$HashReplacedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashChangerBase$HashReplacedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashChangerBase$HashReplacedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    }
  }
  
  type HashChangerBaseHashChangedEvent = typings.openui5.sapUiBaseEventMod.default[HashChangerBase$HashChangedEventParameters]
  
  type HashChangerBaseHashChangedEventParameters = HashChangerBase$HashChangedEventParameters
  
  type HashChangerBaseHashReplacedEvent = typings.openui5.sapUiBaseEventMod.default[HashChangerBase$HashReplacedEventParameters]
  
  type HashChangerBaseHashReplacedEventParameters = HashChangerBase$HashReplacedEventParameters
}
