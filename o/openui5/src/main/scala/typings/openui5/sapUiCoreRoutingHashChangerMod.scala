package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingHashChangerMod {
  
  @JSImport("sap/ui/core/routing/HashChanger", JSImport.Default)
  @js.native
  open class default () extends HashChanger
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/HashChanger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.routing.HashChanger with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, HashChanger]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HashChanger],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Gets a global singleton of the HashChanger. The singleton will get created when this function is invoked
      * for the first time.
      *
      * @returns The global HashChanger
      */
    inline def getInstance(): HashChanger = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[HashChanger]
    
    /**
      * Returns a metadata object for class sap.ui.core.routing.HashChanger.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the hashChanger to a new instance, destroys the old one and copies all its event listeners to the
      * new one
      */
    inline def replaceHashChanger(/**
      * the new instance for the global singleton
      */
    oHashChanger: HashChanger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceHashChanger")(oHashChanger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait HashChanger
    extends typings.openui5.sapUiCoreRoutingHashChangerBaseMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires the hashchanged event, may be extended to modify the hash before fireing the event
      */
    def fireHashChanged(
      /**
      * the new hash of the browser
      */
    sNewHash: String,
      /**
      * the previous hash
      */
    sOldHash: String
    ): Unit = js.native
    
    /**
      * Gets the current hash
      *
      * @returns the current hash
      */
    def getHash(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Defines the events and its parameters which should be used for tracking the hash changes
      *
      * @returns The array containing the events info
      */
    def getRelevantEventsInfo(): js.Array[HashChangerEventInfo] = js.native
    
    /**
      * Will start listening to hashChanges with the parseHash function. This will also fire a hashchanged event
      * with the initial hash.
      *
      * @returns false if it was initialized before, true if it was initialized the first time
      */
    def init(): Boolean = js.native
    
    /**
      * Replaces the hash with a certain value. When using the replace function, no browser history entry is
      * written. If you want to have an entry in the browser history, please use the {@link #setHash} function.
      */
    def replaceHash(/**
      * New hash
      */
    sHash: String): Unit = js.native
  }
  
  trait HashChanger$HashSetEventParameters extends StObject {
    
    /**
      * The relevant hash segment
      */
    var hash: js.UndefOr[String] = js.undefined
  }
  object HashChanger$HashSetEventParameters {
    
    inline def apply(): HashChanger$HashSetEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashChanger$HashSetEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashChanger$HashSetEventParameters] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    }
  }
  
  trait HashChangerEventInfo extends StObject {
    
    /**
      * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * The name of the event that is fired by the HashChanger and should be forwarded to the RouterHashChanger
      */
    var name: String
    
    /**
      * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * The optional defined parameter name mapping that is used for forwarding the event to the {@link sap.ui.core.routing.RouterHashChanger}.
      */
    var paramMapping: js.UndefOr[HashChangerEventParameterMapping] = js.undefined
    
    /**
      * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Indicates whether the event is ignored by every RouterHashChanger instance and is only relevant for the
      * other routing classes, for example {@link sap.ui.core.routing.History}.
      */
    var updateHashOnly: Boolean
  }
  object HashChangerEventInfo {
    
    inline def apply(name: String, updateHashOnly: Boolean): HashChangerEventInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], updateHashOnly = updateHashOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashChangerEventInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashChangerEventInfo] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParamMapping(value: HashChangerEventParameterMapping): Self = StObject.set(x, "paramMapping", value.asInstanceOf[js.Any])
      
      inline def setParamMappingUndefined: Self = StObject.set(x, "paramMapping", js.undefined)
      
      inline def setUpdateHashOnly(value: Boolean): Self = StObject.set(x, "updateHashOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashChangerEventParameterMapping extends StObject {
    
    /**
      * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * The name of the parameter whose value is used as the `fullHash` parameter in the event that is forwarded
      * to the {@link sap.ui.core.routing.RouterHashChanger}. If this isn't set, the value is taken from the
      * property `fullHash`.
      */
    var fullHash: js.UndefOr[String] = js.undefined
    
    /**
      * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * The name of the parameter whose value is used as the `newHash` parameter in the event that is forwarded
      * to the {@link sap.ui.core.routing.RouterHashChanger}. If this isn't set, the value is taken from the
      * property `newHash`.
      */
    var newHash: js.UndefOr[String] = js.undefined
    
    /**
      * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * The name of the parameter whose value is used as the `oldHash` parameter in the event that is forwarded
      * to the {@link sap.ui.core.routing.RouterHashChanger}. If this isn't set, the value is taken from the
      * property `oldHash`.
      */
    var oldHash: js.UndefOr[String] = js.undefined
  }
  object HashChangerEventParameterMapping {
    
    inline def apply(): HashChangerEventParameterMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashChangerEventParameterMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashChangerEventParameterMapping] (val x: Self) extends AnyVal {
      
      inline def setFullHash(value: String): Self = StObject.set(x, "fullHash", value.asInstanceOf[js.Any])
      
      inline def setFullHashUndefined: Self = StObject.set(x, "fullHash", js.undefined)
      
      inline def setNewHash(value: String): Self = StObject.set(x, "newHash", value.asInstanceOf[js.Any])
      
      inline def setNewHashUndefined: Self = StObject.set(x, "newHash", js.undefined)
      
      inline def setOldHash(value: String): Self = StObject.set(x, "oldHash", value.asInstanceOf[js.Any])
      
      inline def setOldHashUndefined: Self = StObject.set(x, "oldHash", js.undefined)
    }
  }
  
  type HashChangerHashSetEvent = typings.openui5.sapUiBaseEventMod.default[HashChanger$HashSetEventParameters]
  
  type HashChangerHashSetEventParameters = HashChanger$HashSetEventParameters
}
