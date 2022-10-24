package typings.pdfjsDist

import typings.pdfjsDist.anon.Cmd
import typings.pdfjsDist.anon.PageNumber
import typings.std.KeyboardEvent
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorToolsMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "AnnotationEditorUIManager")
  @js.native
  open class AnnotationEditorUIManager protected () extends StObject {
    def this(container: Any, eventBus: Any) = this()
    
    /**
      * Add a command to execute (cmd) and another one to undo it.
      * @param {Object} params
      */
    def addCommands(params: js.Object): Unit = js.native
    
    /**
      * Add a new editor.
      * @param {AnnotationEditor} editor
      */
    def addEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add a new layer for a page which will contains the editors.
      * @param {AnnotationEditorLayer} layer
      */
    def addLayer(layer: AnnotationEditorLayer): Unit = js.native
    
    /**
      * Copy the selected editor.
      */
    def copy(): Unit = js.native
    
    /**
      * Cut the selected editor.
      */
    def cut(): Unit = js.native
    
    /**
      * Delete the current editor or all.
      */
    def delete(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def focusMainContainer(): Unit = js.native
    
    /**
      * Get the current active editor.
      * @returns {AnnotationEditor|null}
      */
    def getActive(): AnnotationEditor | Null = js.native
    
    /**
      * Get an editor with the given id.
      * @param {string} id
      * @returns {AnnotationEditor}
      */
    def getEditor(id: String): AnnotationEditor = js.native
    
    /**
      * Get all the editors belonging to a give page.
      * @param {number} pageIndex
      * @returns {Array<AnnotationEditor>}
      */
    def getEditors(pageIndex: Double): js.Array[AnnotationEditor] = js.native
    
    /**
      * Get an id.
      * @returns {string}
      */
    def getId(): String = js.native
    
    /**
      * Get the current editor mode.
      * @returns {number}
      */
    def getMode(): Double = js.native
    
    def hasSelection: Boolean = js.native
    
    /**
      * Is the current editor the one passed as argument?
      * @param {AnnotationEditor} editor
      * @returns
      */
    def isActive(editor: AnnotationEditor): Boolean = js.native
    
    /**
      * Check if the editor is selected.
      * @param {AnnotationEditor} editor
      */
    def isSelected(editor: AnnotationEditor): Boolean = js.native
    
    /**
      * Keydown callback.
      * @param {KeyboardEvent} event
      */
    def keydown(event: KeyboardEvent): Unit = js.native
    
    /**
      * Execute an action for a given name.
      * For example, the user can click on the "Undo" entry in the context menu
      * and it'll trigger the undo action.
      * @param {Object} details
      */
    def onEditingAction(details: js.Object): Unit = js.native
    
    def onPageChanging(param0: PageNumber): Unit = js.native
    
    /**
      * Paste a previously copied editor.
      * @returns {undefined}
      */
    def paste(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Redo the last undoed command.
      */
    def redo(): Unit = js.native
    
    def registerEditorTypes(types: Any): Unit = js.native
    
    /**
      * Remove an editor.
      * @param {AnnotationEditor} editor
      */
    def removeEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Remove a layer.
      * @param {AnnotationEditorLayer} layer
      */
    def removeLayer(layer: AnnotationEditorLayer): Unit = js.native
    
    /**
      * Select all the editors.
      */
    def selectAll(): Unit = js.native
    
    /**
      * Set the given editor as the active one.
      * @param {AnnotationEditor} editor
      */
    def setActiveEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Set the editing state.
      * It can be useful to temporarily disable it when the user is editing a
      * FreeText annotation.
      * @param {boolean} isEditing
      */
    def setEditingState(isEditing: Boolean): Unit = js.native
    
    /**
      * Set the last selected editor.
      * @param {AnnotationEditor} editor
      */
    def setSelected(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add or remove an editor the current selection.
      * @param {AnnotationEditor} editor
      */
    def toggleSelected(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Undo the last command.
      */
    def undo(): Unit = js.native
    
    /**
      * Unselect an editor.
      * @param {AnnotationEditor} editor
      */
    def unselect(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Unselect all the selected editors.
      */
    def unselectAll(): Unit = js.native
    
    /**
      * Change the editor mode (None, FreeText, Ink, ...)
      * @param {number} mode
      */
    def updateMode(mode: Double): Unit = js.native
    
    /**
      * Update a parameter in the current editor or globally.
      * @param {number} type
      * @param {*} value
      */
    def updateParams(`type`: Double, value: Any): Unit = js.native
    
    /**
      * Update the toolbar if it's required to reflect the tool currently used.
      * @param {number} mode
      * @returns {undefined}
      */
    def updateToolbar(mode: Double): Unit = js.native
  }
  /* static members */
  object AnnotationEditorUIManager {
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "AnnotationEditorUIManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "AnnotationEditorUIManager._keyboardManager")
    @js.native
    def _keyboardManager: KeyboardManager = js.native
    inline def _keyboardManager_=(x: KeyboardManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_keyboardManager")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "ColorManager")
  @js.native
  open class ColorManager () extends StObject {
    
    def _colors: Any = js.native
    
    /**
      * In High Contrast Mode, the color on the screen is not always the
      * real color used in the pdf.
      * For example in some cases white can appear to be black but when saving
      * we want to have white.
      * @param {string} color
      * @returns {Array<number>}
      */
    def convert(color: String): js.Array[Double] = js.native
    
    /**
      * An input element must have its color value as a hex string
      * and not as color name.
      * So this function converts a name into an hex string.
      * @param {string} name
      * @returns {string}
      */
    def getHexCode(name: String): String = js.native
  }
  /* static members */
  object ColorManager {
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "ColorManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/tools", "ColorManager._colorsMapping")
    @js.native
    def _colorsMapping: Map[String, js.Array[Double]] = js.native
    inline def _colorsMapping_=(x: Map[String, js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_colorsMapping")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "CommandManager")
  @js.native
  open class CommandManager () extends StObject {
    def this(maxSize: Double) = this()
    
    /**
      * @typedef {Object} addOptions
      * @property {function} cmd
      * @property {function} undo
      * @property {boolean} mustExec
      * @property {number} type
      * @property {boolean} overwriteIfSameType
      * @property {boolean} keepUndo
      */
    /**
      * Add a new couple of commands to be used in case of redo/undo.
      * @param {addOptions} options
      */
    def add(param0: Cmd): Unit = js.native
    
    def destroy(): Unit = js.native
    
    /**
      * Check if there is something to redo.
      * @returns {boolean}
      */
    def hasSomethingToRedo(): Boolean = js.native
    
    /**
      * Check if there is something to undo.
      * @returns {boolean}
      */
    def hasSomethingToUndo(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Redo the last command.
      */
    def redo(): Unit = js.native
    
    /**
      * Undo the last command.
      */
    def undo(): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/editor/tools", "KeyboardManager")
  @js.native
  open class KeyboardManager protected () extends StObject {
    /**
      * Create a new keyboard manager class.
      * @param {Array<Array>} callbacks - an array containing an array of shortcuts
      * and a callback to call.
      * A shortcut is a string like `ctrl+c` or `mac+ctrl+c` for mac OS.
      */
    def this(callbacks: js.Array[js.Array[Any]]) = this()
    
    var allKeys: Set[Any] = js.native
    
    var buffer: js.Array[Any] = js.native
    
    var callbacks: Map[Any, Any] = js.native
    
    /**
      * Execute a callback, if any, for a given keyboard event.
      * The self is used as `this` in the callback.
      * @param {Object} self.
      * @param {KeyboardEvent} event
      * @returns
      */
    def exec(self: Any, event: KeyboardEvent): Unit = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  inline def bindEvents(obj: Any, element: Any, names: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindEvents")(obj.asInstanceOf[js.Any], element.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def opacityToHex(opacity: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("opacityToHex")(opacity.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AnnotationEditor = typings.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
  
  type AnnotationEditorLayer = typings.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer
}
