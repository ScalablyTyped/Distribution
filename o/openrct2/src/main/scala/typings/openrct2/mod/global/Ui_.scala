package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Interface APIs
  * These will only be available to servers and clients that are not running headless mode.
  * Plugin writers should check if ui is available using `typeof ui !== 'undefined'`.
  */
@js.native
trait Ui_ extends StObject {
  
  /**
    * Begins a new tool session. The cursor will change to the style specified by the
    * given tool descriptor and cursor events will be provided.
    * @param tool The properties and event handlers for the tool.
    */
  def activateTool(tool: ToolDesc): Unit = js.native
  
  def closeAllWindows(): Unit = js.native
  
  def closeWindows(classification: String): Unit = js.native
  def closeWindows(classification: String, id: Double): Unit = js.native
  
  def getWindow(classification: String): Window = js.native
  def getWindow(id: Double): Window = js.native
  
  val height: Double = js.native
  
  val mainViewport: Viewport = js.native
  
  def openWindow(desc: WindowDesc): Window = js.native
  
  def registerMenuItem(text: String, callback: js.Function0[Unit]): Unit = js.native
  
  def registerShortcut(desc: ShortcutDesc): Unit = js.native
  
  /**
    * Show a red error box.
    * @param title The title / first line of the box.
    * @param message The message / second line of the box.
    */
  def showError(title: String, message: String): Unit = js.native
  
  /**
    * Shows the window for loading or saving a file and calls the given callback when a file
    * is selected.
    * @param desc The parameters for the file browse window.
    */
  def showFileBrowse(desc: FileBrowseDesc): Unit = js.native
  
  /**
    * Shows the scenario select window and calls the given callback when a scenario is
    * selected.
    */
  def showScenarioSelect(desc: ScenarioSelectDesc): Unit = js.native
  
  /**
    * Shows a text input prompt and calls the given callback when entered.
    * @param desc The parameters for the text input window.
    */
  def showTextInput(desc: TextInputDesc): Unit = js.native
  
  val tileSelection: TileSelection = js.native
  
  val tool: Tool | Null = js.native
  
  val width: Double = js.native
  
  val windows: Double = js.native
}
