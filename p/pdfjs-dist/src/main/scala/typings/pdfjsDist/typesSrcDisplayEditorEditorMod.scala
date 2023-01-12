package typings.pdfjsDist

import typings.pdfjsDist.typesSrcDisplayEditorToolsMod.ColorManager
import typings.std.DragEvent
import typings.std.FocusEvent
import typings.std.HTMLDivElement
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorEditorMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor")
  @js.native
  open class AnnotationEditor protected () extends StObject {
    /**
      * @param {AnnotationEditorParameters} parameters
      */
    def this(parameters: AnnotationEditorParameters) = this()
    
    /**
      * Commit the data contained in this editor.
      */
    def commit(): Unit = js.native
    
    def commitOrRemove(): Unit = js.native
    
    /**
      * Get the div which really contains the displayed content.
      */
    def contentDiv: HTMLDivElement | Null = js.native
    
    /**
      * Disable edit mode.
      */
    def disableEditMode(): Unit = js.native
    
    /**
      * When the user disables the editing mode some editors can change some of
      * their properties.
      */
    def disableEditing(): Unit = js.native
    
    var div: HTMLDivElement | Null = js.native
    
    /**
      * We use drag-and-drop in order to move an editor on a page.
      * @param {DragEvent} event
      */
    def dragstart(event: DragEvent): Unit = js.native
    
    /**
      * Enable edit mode.
      */
    def enableEditMode(): Unit = js.native
    
    /**
      * When the user enables the editing mode some editors can change some of
      * their properties.
      */
    def enableEditing(): Unit = js.native
    
    def fixDims(): Unit = js.native
    
    /**
      * onfocus callback.
      */
    def focusin(event: Any): Unit = js.native
    
    /**
      * onblur callback.
      * @param {FocusEvent} event
      */
    def focusout(event: FocusEvent): Unit = js.native
    
    /**
      * Get the translation used to position this editor when it's created.
      * @returns {Array<number>}
      */
    def getInitialTranslation(): js.Array[Double] = js.native
    
    def getRect(tx: Any, ty: Any): js.Array[Double] = js.native
    
    def getRectInCurrentCoords(rect: Any, pageHeight: Any): js.Array[Any] = js.native
    
    var height: Any = js.native
    
    var id: String = js.native
    
    var isAttachedToDOM: Boolean = js.native
    
    /**
      * If true then the editor is currently edited.
      * @type {boolean}
      */
    def isEditing: Boolean = js.native
    /**
      * When set to true, it means that this editor is currently edited.
      * @param {boolean} value
      */
    def isEditing_=(arg: Boolean): Unit = js.native
    
    /**
      * Check if the editor contains something.
      * @returns {boolean}
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Check if the editor is edited.
      * @returns {boolean}
      */
    def isInEditMode(): Boolean = js.native
    
    var name: Any = js.native
    
    /**
      * Check if this editor needs to be rebuilt or not.
      * @returns {boolean}
      */
    def needsToBeRebuilt(): Boolean = js.native
    
    /**
      * Executed once this editor has been rendered.
      */
    def onceAdded(): Unit = js.native
    
    var pageIndex: Double = js.native
    
    var parent: typings.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer = js.native
    
    /**
      * Onpointerdown callback.
      * @param {PointerEvent} event
      */
    def pointerdown(event: PointerEvent): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Get some properties to update in the UI.
      * @returns {Object}
      */
    def propertiesToUpdate: js.Object = js.native
    
    /**
      * Rebuild the editor in case it has been removed on undo.
      *
      * To implement in subclasses.
      */
    def rebuild(): Unit = js.native
    
    /**
      * Remove this editor.
      * It's used on ctrl+backspace action.
      */
    def remove(): Unit = js.native
    
    /**
      * Render this editor in a div.
      * @returns {HTMLDivElement}
      */
    def render(): HTMLDivElement = js.native
    
    var rotation: Any = js.native
    
    /**
      * Convert a screen translation into a page one.
      * @param {number} x
      * @param {number} y
      */
    def screenToPageTranslation(x: Double, y: Double): js.Array[Double] = js.native
    
    /**
      * Select this editor.
      */
    def select(): Unit = js.native
    
    /**
      * Serialize the editor.
      * The result of the serialization will be used to construct a
      * new annotation to add to the pdf document.
      *
      * To implement in subclasses.
      */
    def serialize(): Unit = js.native
    
    /**
      * Set the editor position within its parent.
      * @param {number} x
      * @param {number} y
      * @param {number} tx - x-translation in screen coordinates.
      * @param {number} ty - y-translation in screen coordinates.
      */
    def setAt(x: Double, y: Double, tx: Double, ty: Double): Unit = js.native
    
    /**
      * Set the dimensions of this editor.
      * @param {number} width
      * @param {number} height
      */
    def setDims(width: Double, height: Double): Unit = js.native
    
    /**
      * This editor will be behind the others.
      */
    def setInBackground(): Unit = js.native
    
    /**
      * This editor will be in the foreground.
      */
    def setInForeground(): Unit = js.native
    
    /**
      * If it returns true, then this editor handle the keyboard
      * events itself.
      * @returns {boolean}
      */
    def shouldGetKeyboardEvents(): Boolean = js.native
    
    var startX: js.UndefOr[Double] = js.native
    
    var startY: js.UndefOr[Double] = js.native
    
    /**
      * Translate the editor position within its parent.
      * @param {number} x - x-translation in screen coordinates.
      * @param {number} y - y-translation in screen coordinates.
      */
    def translate(x: Double, y: Double): Unit = js.native
    
    /**
      * Unselect this editor.
      */
    def unselect(): Unit = js.native
    
    /**
      * Update some parameters which have been changed through the UI.
      * @param {number} type
      * @param {*} value
      */
    def updateParams(`type`: Double, value: Any): Unit = js.native
    
    var width: Any = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object AnnotationEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._colorManager")
    @js.native
    def _colorManager: ColorManager = js.native
    inline def _colorManager_=(x: ColorManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_colorManager")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/editor", "AnnotationEditor._zIndex")
    @js.native
    def _zIndex: Double = js.native
    inline def _zIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_zIndex")(x.asInstanceOf[js.Any])
    
    /**
      * Deserialize the editor.
      * The result of the deserialization is a new editor.
      *
      * @param {Object} data
      * @param {AnnotationEditorLayer} parent
      * @returns {AnnotationEditor}
      */
    inline def deserialize(data: js.Object, parent: AnnotationEditorLayer): AnnotationEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[AnnotationEditor]
  }
  
  type AnnotationEditorLayer = typings.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer
  
  trait AnnotationEditorParameters extends StObject {
    
    /**
      * - editor id
      */
    var id: String
    
    /**
      * - the layer containing this editor
      */
    var parent: AnnotationEditorLayer
    
    /**
      * - x-coordinate
      */
    var x: Double
    
    /**
      * - y-coordinate
      */
    var y: Double
  }
  object AnnotationEditorParameters {
    
    inline def apply(id: String, parent: AnnotationEditorLayer, x: Double, y: Double): AnnotationEditorParameters = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationEditorParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationEditorParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: AnnotationEditorLayer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
