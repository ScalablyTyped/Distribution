package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Global context for accessing all other APIs.
  */
/** APIs for cheats. */
inline def cheats: Cheats_ = js.Dynamic.global.selectDynamic("cheats").asInstanceOf[Cheats_]
inline def cheats_=(x: Cheats_): Unit = js.Dynamic.global.updateDynamic("cheats")(x.asInstanceOf[js.Any])

/** APIs for interacting with the stdout console. */
inline def console: Console_ = js.Dynamic.global.selectDynamic("console").asInstanceOf[Console_]
inline def console_=(x: Console_): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])

/** Core APIs for plugins. */
inline def context: Context_ = js.Dynamic.global.selectDynamic("context").asInstanceOf[Context_]
inline def context_=(x: Context_): Unit = js.Dynamic.global.updateDynamic("context")(x.asInstanceOf[js.Any])

/** APIs for getting or setting the in-game date. */
inline def date: GameDate = js.Dynamic.global.selectDynamic("date").asInstanceOf[GameDate]
inline def date_=(x: GameDate): Unit = js.Dynamic.global.updateDynamic("date")(x.asInstanceOf[js.Any])

/** APIs for manipulating the map. */
inline def map: GameMap = js.Dynamic.global.selectDynamic("map").asInstanceOf[GameMap]
inline def map_=(x: GameMap): Unit = js.Dynamic.global.updateDynamic("map")(x.asInstanceOf[js.Any])

/** APIs for managing the server or interacting with the server or clients. */
inline def network: Network_ = js.Dynamic.global.selectDynamic("network").asInstanceOf[Network_]
inline def network_=(x: Network_): Unit = js.Dynamic.global.updateDynamic("network")(x.asInstanceOf[js.Any])

/** APIs for the park and management of it. */
inline def park: Park_ = js.Dynamic.global.selectDynamic("park").asInstanceOf[Park_]
inline def park_=(x: Park_): Unit = js.Dynamic.global.updateDynamic("park")(x.asInstanceOf[js.Any])

/**
  * Registers the plugin. This may only be called once.
  * @param metadata Information about the plugin and the entry point.
  */
inline def registerPlugin(metadata: PluginMetadata): Unit = js.Dynamic.global.applyDynamic("registerPlugin")(metadata.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** APIs for the current scenario. */
inline def scenario: Scenario_ = js.Dynamic.global.selectDynamic("scenario").asInstanceOf[Scenario_]
inline def scenario_=(x: Scenario_): Unit = js.Dynamic.global.updateDynamic("scenario")(x.asInstanceOf[js.Any])

/**
  * APIs for creating and editing title sequences.
  * These will only be available to clients that are not running headless mode.
  */
inline def titleSequenceManager: TitleSequenceManager_ = js.Dynamic.global.selectDynamic("titleSequenceManager").asInstanceOf[TitleSequenceManager_]
inline def titleSequenceManager_=(x: TitleSequenceManager_): Unit = js.Dynamic.global.updateDynamic("titleSequenceManager")(x.asInstanceOf[js.Any])

/**
  * APIs for controlling the user interface.
  * These will only be available to servers and clients that are not running headless mode.
  * Plugin writers should check if ui is available using `typeof ui !== 'undefined'`.
  */
inline def ui: Ui_ = js.Dynamic.global.selectDynamic("ui").asInstanceOf[Ui_]
inline def ui_=(x: Ui_): Unit = js.Dynamic.global.updateDynamic("ui")(x.asInstanceOf[js.Any])

type CorruptElement = BaseTileElement

type ListViewItem = ListViewItemSeperator | js.Array[String]
