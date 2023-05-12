package typings.pixiExtensions

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ExtensionType
    extends StObject
       with ExtensionMetadata
  @JSImport("@pixi/extensions", "ExtensionType")
  @js.native
  object ExtensionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ExtensionType & String] = js.native
    
    @js.native
    sealed trait Application
      extends StObject
         with ExtensionType
    /* "application" */ val Application: typings.pixiExtensions.mod.ExtensionType.Application & String = js.native
    
    @js.native
    sealed trait Asset
      extends StObject
         with ExtensionType
    /* "asset" */ val Asset: typings.pixiExtensions.mod.ExtensionType.Asset & String = js.native
    
    @js.native
    sealed trait CacheParser
      extends StObject
         with ExtensionType
    /* "cache-parser" */ val CacheParser: typings.pixiExtensions.mod.ExtensionType.CacheParser & String = js.native
    
    @js.native
    sealed trait CanvasRendererPlugin
      extends StObject
         with ExtensionType
    /* "renderer-canvas-plugin" */ val CanvasRendererPlugin: typings.pixiExtensions.mod.ExtensionType.CanvasRendererPlugin & String = js.native
    
    @js.native
    sealed trait CanvasRendererSystem
      extends StObject
         with ExtensionType
    /* "renderer-canvas-system" */ val CanvasRendererSystem: typings.pixiExtensions.mod.ExtensionType.CanvasRendererSystem & String = js.native
    
    @js.native
    sealed trait DetectionParser
      extends StObject
         with ExtensionType
    /* "detection-parser" */ val DetectionParser: typings.pixiExtensions.mod.ExtensionType.DetectionParser & String = js.native
    
    @js.native
    sealed trait LoadParser
      extends StObject
         with ExtensionType
    /* "load-parser" */ val LoadParser: typings.pixiExtensions.mod.ExtensionType.LoadParser & String = js.native
    
    @js.native
    sealed trait Renderer
      extends StObject
         with ExtensionType
    /* "renderer" */ val Renderer: typings.pixiExtensions.mod.ExtensionType.Renderer & String = js.native
    
    @js.native
    sealed trait RendererPlugin
      extends StObject
         with ExtensionType
    /* "renderer-webgl-plugin" */ val RendererPlugin: typings.pixiExtensions.mod.ExtensionType.RendererPlugin & String = js.native
    
    @js.native
    sealed trait RendererSystem
      extends StObject
         with ExtensionType
    /* "renderer-webgl-system" */ val RendererSystem: typings.pixiExtensions.mod.ExtensionType.RendererSystem & String = js.native
    
    @js.native
    sealed trait ResolveParser
      extends StObject
         with ExtensionType
    /* "resolve-parser" */ val ResolveParser: typings.pixiExtensions.mod.ExtensionType.ResolveParser & String = js.native
  }
  
  /**
    * Global registration of all PixiJS extensions. One-stop-shop for extensibility.
    * @memberof PIXI
    * @namespace extensions
    */
  object extensions {
    
    @JSImport("@pixi/extensions", "extensions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Register new extensions with PixiJS.
      * @param extensions - The spread of extensions to add to PixiJS.
      * @returns {PIXI.extensions} For chaining.
      */
    inline def add(extensions: (ExtensionFormatLoose | Any)*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(extensions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /** @ignore */
    @JSImport("@pixi/extensions", "extensions._addHandlers")
    @js.native
    def addHandlers: Record[ExtensionType, ExtensionHandler] = js.native
    
    inline def addHandlers_=(x: Record[ExtensionType, ExtensionHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_addHandlers")(x.asInstanceOf[js.Any])
    
    /**
      * Internal method to handle extensions by name.
      * @param type - The extension type.
      * @param onAdd  - Function for handling when extensions are added/registered passes {@link PIXI.ExtensionFormat}.
      * @param onRemove  - Function for handling when extensions are removed/unregistered passes {@link PIXI.ExtensionFormat}.
      * @returns {PIXI.extensions} For chaining.
      */
    inline def handle(`type`: ExtensionType, onAdd: ExtensionHandler, onRemove: ExtensionHandler): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(`type`.asInstanceOf[js.Any], onAdd.asInstanceOf[js.Any], onRemove.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Handle a type, but using a list of extensions.
      * @param type - Type of extension to handle.
      * @param list - The list of extensions.
      * @param defaultPriority - The default priority to use if none is specified.
      * @returns {PIXI.extensions} For chaining.
      */
    inline def handleByList(`type`: ExtensionType, list: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handleByList")(`type`.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def handleByList(`type`: ExtensionType, list: js.Array[Any], defaultPriority: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handleByList")(`type`.asInstanceOf[js.Any], list.asInstanceOf[js.Any], defaultPriority.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Handle a type, but using a map by `name` property.
      * @param type - Type of extension to handle.
      * @param map - The object map of named extensions.
      * @returns {PIXI.extensions} For chaining.
      */
    inline def handleByMap(`type`: ExtensionType, map: Record[String, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handleByMap")(`type`.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** @ignore */
    @JSImport("@pixi/extensions", "extensions._queue")
    @js.native
    def queue: Record[ExtensionType, js.Array[ExtensionFormat]] = js.native
    
    inline def queue_=(x: Record[ExtensionType, js.Array[ExtensionFormat]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_queue")(x.asInstanceOf[js.Any])
    
    /**
      * Remove extensions from PixiJS.
      * @param extensions - Extensions to be removed.
      * @returns {PIXI.extensions} For chaining.
      */
    inline def remove(extensions: (ExtensionFormatLoose | Any)*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(extensions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /** @ignore */
    @JSImport("@pixi/extensions", "extensions._removeHandlers")
    @js.native
    def removeHandlers: Record[ExtensionType, ExtensionHandler] = js.native
    
    inline def removeHandlers_=(x: Record[ExtensionType, ExtensionHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_removeHandlers")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Strict extension format that is used internally for registrations.
    * @memberof PIXI
    */
  trait ExtensionFormat
    extends StObject
       with ExtensionFormatLoose {
    
    /** The extension type, always expressed as multiple, even if a single */
    @JSName("type")
    var type_ExtensionFormat: js.Array[ExtensionType]
  }
  object ExtensionFormat {
    
    inline def apply(ref: Any, `type`: js.Array[ExtensionType]): ExtensionFormat = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtensionFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtensionFormat] (val x: Self) extends AnyVal {
      
      inline def setType(value: js.Array[ExtensionType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: ExtensionType*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  /**
    * Format when registering an extension. Generally, the extension
    * should have these values as `extension` static property,
    * but you can override name or type by providing an object.
    * @memberof PIXI
    */
  trait ExtensionFormatLoose extends StObject {
    
    /** Optional. Some plugins provide an API name/property, such as Renderer plugins */
    var name: js.UndefOr[String] = js.undefined
    
    /** Optional, used for sorting the plugins in a particular order */
    var priority: js.UndefOr[Double] = js.undefined
    
    /** Reference to the plugin object/class */
    var ref: Any
    
    /** The extension type, can be multiple types */
    var `type`: ExtensionType | js.Array[ExtensionType]
  }
  object ExtensionFormatLoose {
    
    inline def apply(ref: Any, `type`: ExtensionType | js.Array[ExtensionType]): ExtensionFormatLoose = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtensionFormatLoose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtensionFormatLoose] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setType(value: ExtensionType | js.Array[ExtensionType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: ExtensionType*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  type ExtensionHandler = js.Function1[/* extension */ ExtensionFormat, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiExtensions.mod.ExtensionType
    - typings.pixiExtensions.mod.ExtensionMetadataDetails
  */
  trait ExtensionMetadata extends StObject
  
  trait ExtensionMetadataDetails
    extends StObject
       with ExtensionMetadata {
    
    var name: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var `type`: ExtensionType | js.Array[ExtensionType]
  }
  object ExtensionMetadataDetails {
    
    inline def apply(`type`: ExtensionType | js.Array[ExtensionType]): ExtensionMetadataDetails = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtensionMetadataDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtensionMetadataDetails] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setType(value: ExtensionType | js.Array[ExtensionType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: ExtensionType*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
}
