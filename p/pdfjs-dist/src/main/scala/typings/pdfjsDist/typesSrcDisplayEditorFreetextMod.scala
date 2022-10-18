package typings.pdfjsDist

import typings.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import typings.pdfjsDist.typesSrcDisplayEditorToolsMod.KeyboardManager
import typings.std.HTMLDivElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorFreetextMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor")
  @js.native
  open class FreeTextEditor protected () extends AnnotationEditor {
    def this(params: Any) = this()
    
    /**
      * ondblclick callback.
      * @param {MouseEvent} event
      */
    def dblclick(event: MouseEvent): Unit = js.native
    
    var editorDiv: js.UndefOr[HTMLDivElement] = js.native
    
    def editorDivBlur(event: Any): Unit = js.native
    
    def editorDivFocus(event: Any): Unit = js.native
    
    def editorDivKeydown(event: Any): Unit = js.native
    
    /**
      * onkeydown callback.
      * @param {KeyboardEvent} event
      */
    def keydown(event: KeyboardEvent): Unit = js.native
    
    var overlayDiv: js.UndefOr[HTMLDivElement] = js.native
    
    /** @inheritdoc */
    def updateParams(`type`: Any, value: Any): Unit = js.native
  }
  /* static members */
  object FreeTextEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._defaultColor")
    @js.native
    def _defaultColor: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _defaultColor_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultColor")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._defaultFontSize")
    @js.native
    def _defaultFontSize: Double = js.native
    inline def _defaultFontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._freeTextDefaultContent")
    @js.native
    def _freeTextDefaultContent: String = js.native
    inline def _freeTextDefaultContent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_freeTextDefaultContent")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._internalPadding")
    @js.native
    def _internalPadding: Double = js.native
    inline def _internalPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_internalPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._keyboardManager")
    @js.native
    def _keyboardManager: KeyboardManager = js.native
    inline def _keyboardManager_=(x: KeyboardManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_keyboardManager")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._l10nPromise")
    @js.native
    def _l10nPromise: Any = js.native
    inline def _l10nPromise_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_l10nPromise")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/freetext", "FreeTextEditor._type")
    @js.native
    def _type: String = js.native
    inline def _type_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_type")(x.asInstanceOf[js.Any])
    
    /** @inheritdoc */
    inline def deserialize(data: Any, parent: Any): AnnotationEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[AnnotationEditor]
    
    inline def initialize(l10n: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def updateDefaultParams(`type`: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDefaultParams")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type AnnotationEditorLayer = typings.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayer
}
