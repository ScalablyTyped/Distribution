package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionFormat
import typings.pixiExtensions.mod.ExtensionFormatLoose
import typings.pixiExtensions.mod.ExtensionHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensions {
  
  @JSImport("pixi.js", "extensions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Register new extensions with PixiJS.
    * @param extensions - The spread of extensions to add to PixiJS.
    * @returns {PIXI.extensions} For chaining.
    */
  inline def add(extensions: (ExtensionFormatLoose | Any)*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(extensions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /** @ignore */
  @JSImport("pixi.js", "extensions._addHandlers")
  @js.native
  def addHandlers: Record[typings.pixiExtensions.mod.ExtensionType, ExtensionHandler] = js.native
  
  inline def addHandlers_=(x: Record[typings.pixiExtensions.mod.ExtensionType, ExtensionHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_addHandlers")(x.asInstanceOf[js.Any])
  
  /**
    * Internal method to handle extensions by name.
    * @param type - The extension type.
    * @param onAdd  - Function for handling when extensions are added/registered passes {@link PIXI.ExtensionFormat}.
    * @param onRemove  - Function for handling when extensions are removed/unregistered passes {@link PIXI.ExtensionFormat}.
    * @returns {PIXI.extensions} For chaining.
    */
  inline def handle(
    `type`: typings.pixiExtensions.mod.ExtensionType,
    onAdd: ExtensionHandler,
    onRemove: ExtensionHandler
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(`type`.asInstanceOf[js.Any], onAdd.asInstanceOf[js.Any], onRemove.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Handle a type, but using a list of extensions.
    * @param type - Type of extension to handle.
    * @param list - The list of extensions.
    * @returns {PIXI.extensions} For chaining.
    */
  inline def handleByList(`type`: typings.pixiExtensions.mod.ExtensionType, list: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handleByList")(`type`.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Handle a type, but using a map by `name` property.
    * @param type - Type of extension to handle.
    * @param map - The object map of named extensions.
    * @returns {PIXI.extensions} For chaining.
    */
  inline def handleByMap(`type`: typings.pixiExtensions.mod.ExtensionType, map: Record[String, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handleByMap")(`type`.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** @ignore */
  @JSImport("pixi.js", "extensions._queue")
  @js.native
  def queue: Record[typings.pixiExtensions.mod.ExtensionType, js.Array[ExtensionFormat]] = js.native
  
  inline def queue_=(x: Record[typings.pixiExtensions.mod.ExtensionType, js.Array[ExtensionFormat]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_queue")(x.asInstanceOf[js.Any])
  
  /**
    * Remove extensions from PixiJS.
    * @param extensions - Extensions to be removed.
    * @returns {PIXI.extensions} For chaining.
    */
  inline def remove(extensions: (ExtensionFormatLoose | Any)*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(extensions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /** @ignore */
  @JSImport("pixi.js", "extensions._removeHandlers")
  @js.native
  def removeHandlers: Record[typings.pixiExtensions.mod.ExtensionType, ExtensionHandler] = js.native
  
  inline def removeHandlers_=(x: Record[typings.pixiExtensions.mod.ExtensionType, ExtensionHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_removeHandlers")(x.asInstanceOf[js.Any])
}
