package typings.mediumEditor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.mediumEditor.anon.Major
import typings.mediumEditor.anon.Prop
import typings.std.Document
import typings.std.Element
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import typings.std.NodeListOf
import typings.std.Range
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediumEditor {
  
  trait AnchorFormOptions extends StObject {
    
    var customClassOption: js.UndefOr[String] = js.undefined
    
    var customClassOptionText: js.UndefOr[String] = js.undefined
    
    var linkValidation: js.UndefOr[Boolean] = js.undefined
    
    var placeholderText: js.UndefOr[String] = js.undefined
    
    var targetCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var targetCheckboxText: js.UndefOr[String] = js.undefined
  }
  object AnchorFormOptions {
    
    inline def apply(): AnchorFormOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorFormOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorFormOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomClassOption(value: String): Self = StObject.set(x, "customClassOption", value.asInstanceOf[js.Any])
      
      inline def setCustomClassOptionText(value: String): Self = StObject.set(x, "customClassOptionText", value.asInstanceOf[js.Any])
      
      inline def setCustomClassOptionTextUndefined: Self = StObject.set(x, "customClassOptionText", js.undefined)
      
      inline def setCustomClassOptionUndefined: Self = StObject.set(x, "customClassOption", js.undefined)
      
      inline def setLinkValidation(value: Boolean): Self = StObject.set(x, "linkValidation", value.asInstanceOf[js.Any])
      
      inline def setLinkValidationUndefined: Self = StObject.set(x, "linkValidation", js.undefined)
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setTargetCheckbox(value: Boolean): Self = StObject.set(x, "targetCheckbox", value.asInstanceOf[js.Any])
      
      inline def setTargetCheckboxText(value: String): Self = StObject.set(x, "targetCheckboxText", value.asInstanceOf[js.Any])
      
      inline def setTargetCheckboxTextUndefined: Self = StObject.set(x, "targetCheckboxText", js.undefined)
      
      inline def setTargetCheckboxUndefined: Self = StObject.set(x, "targetCheckbox", js.undefined)
    }
  }
  
  trait AnchorPreviewOptions extends StObject {
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var previewValueSelector: js.UndefOr[String] = js.undefined
    
    var showOnEmptyLinks: js.UndefOr[Boolean] = js.undefined
    
    var showWhenToolbarIsVisible: js.UndefOr[Boolean] = js.undefined
  }
  object AnchorPreviewOptions {
    
    inline def apply(): AnchorPreviewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorPreviewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorPreviewOptions] (val x: Self) extends AnyVal {
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setPreviewValueSelector(value: String): Self = StObject.set(x, "previewValueSelector", value.asInstanceOf[js.Any])
      
      inline def setPreviewValueSelectorUndefined: Self = StObject.set(x, "previewValueSelector", js.undefined)
      
      inline def setShowOnEmptyLinks(value: Boolean): Self = StObject.set(x, "showOnEmptyLinks", value.asInstanceOf[js.Any])
      
      inline def setShowOnEmptyLinksUndefined: Self = StObject.set(x, "showOnEmptyLinks", js.undefined)
      
      inline def setShowWhenToolbarIsVisible(value: Boolean): Self = StObject.set(x, "showWhenToolbarIsVisible", value.asInstanceOf[js.Any])
      
      inline def setShowWhenToolbarIsVisibleUndefined: Self = StObject.set(x, "showWhenToolbarIsVisible", js.undefined)
    }
  }
  
  type Button = String | ButtonOptions
  
  trait ButtonOptions extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var aria: js.UndefOr[String] = js.undefined
    
    var attrs: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var classList: js.UndefOr[js.Array[String]] = js.undefined
    
    var contentDefault: js.UndefOr[String] = js.undefined
    
    var contentFA: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Prop] = js.undefined
    
    var tagNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var useQueryState: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonOptions {
    
    inline def apply(): ButtonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAria(value: String): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setClassList(value: js.Array[String]): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
      
      inline def setClassListUndefined: Self = StObject.set(x, "classList", js.undefined)
      
      inline def setClassListVarargs(value: String*): Self = StObject.set(x, "classList", js.Array(value*))
      
      inline def setContentDefault(value: String): Self = StObject.set(x, "contentDefault", value.asInstanceOf[js.Any])
      
      inline def setContentDefaultUndefined: Self = StObject.set(x, "contentDefault", js.undefined)
      
      inline def setContentFA(value: String): Self = StObject.set(x, "contentFA", value.asInstanceOf[js.Any])
      
      inline def setContentFAUndefined: Self = StObject.set(x, "contentFA", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStyle(value: Prop): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTagNames(value: js.Array[String]): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
      
      inline def setTagNamesUndefined: Self = StObject.set(x, "tagNames", js.undefined)
      
      inline def setTagNamesVarargs(value: String*): Self = StObject.set(x, "tagNames", js.Array(value*))
      
      inline def setUseQueryState(value: Boolean): Self = StObject.set(x, "useQueryState", value.asInstanceOf[js.Any])
      
      inline def setUseQueryStateUndefined: Self = StObject.set(x, "useQueryState", js.undefined)
    }
  }
  
  trait CoreOptions extends StObject {
    
    var activeButtonClass: js.UndefOr[String] = js.undefined
    
    var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined
    
    var anchor: js.UndefOr[AnchorFormOptions] = js.undefined
    
    var anchorPreview: js.UndefOr[AnchorPreviewOptions | Boolean] = js.undefined
    
    var autoLink: js.UndefOr[Boolean] = js.undefined
    
    var buttonLabels: js.UndefOr[String | Boolean] = js.undefined
    
    var contentWindow: js.UndefOr[Window] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var disableDoubleReturn: js.UndefOr[Boolean] = js.undefined
    
    var disableEditing: js.UndefOr[Boolean] = js.undefined
    
    var disableExtraSpaces: js.UndefOr[Boolean] = js.undefined
    
    var disableReturn: js.UndefOr[Boolean] = js.undefined
    
    var elementsContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var extensions: js.UndefOr[Any] = js.undefined
    
    var imageDragging: js.UndefOr[Boolean] = js.undefined
    
    var keyboardCommands: js.UndefOr[KeyboardCommandsOptions | Boolean] = js.undefined
    
    var ownerDocument: js.UndefOr[Document] = js.undefined
    
    var paste: js.UndefOr[PasteOptions] = js.undefined
    
    var placeholder: js.UndefOr[PlaceholderOptions | Boolean] = js.undefined
    
    var spellcheck: js.UndefOr[Boolean] = js.undefined
    
    var targetBlank: js.UndefOr[Boolean] = js.undefined
    
    var toolbar: js.UndefOr[ToolbarOptions | Boolean] = js.undefined
  }
  object CoreOptions {
    
    inline def apply(): CoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoreOptions] (val x: Self) extends AnyVal {
      
      inline def setActiveButtonClass(value: String): Self = StObject.set(x, "activeButtonClass", value.asInstanceOf[js.Any])
      
      inline def setActiveButtonClassUndefined: Self = StObject.set(x, "activeButtonClass", js.undefined)
      
      inline def setAllowMultiParagraphSelection(value: Boolean): Self = StObject.set(x, "allowMultiParagraphSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiParagraphSelectionUndefined: Self = StObject.set(x, "allowMultiParagraphSelection", js.undefined)
      
      inline def setAnchor(value: AnchorFormOptions): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorPreview(value: AnchorPreviewOptions | Boolean): Self = StObject.set(x, "anchorPreview", value.asInstanceOf[js.Any])
      
      inline def setAnchorPreviewUndefined: Self = StObject.set(x, "anchorPreview", js.undefined)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAutoLink(value: Boolean): Self = StObject.set(x, "autoLink", value.asInstanceOf[js.Any])
      
      inline def setAutoLinkUndefined: Self = StObject.set(x, "autoLink", js.undefined)
      
      inline def setButtonLabels(value: String | Boolean): Self = StObject.set(x, "buttonLabels", value.asInstanceOf[js.Any])
      
      inline def setButtonLabelsUndefined: Self = StObject.set(x, "buttonLabels", js.undefined)
      
      inline def setContentWindow(value: Window): Self = StObject.set(x, "contentWindow", value.asInstanceOf[js.Any])
      
      inline def setContentWindowUndefined: Self = StObject.set(x, "contentWindow", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisableDoubleReturn(value: Boolean): Self = StObject.set(x, "disableDoubleReturn", value.asInstanceOf[js.Any])
      
      inline def setDisableDoubleReturnUndefined: Self = StObject.set(x, "disableDoubleReturn", js.undefined)
      
      inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
      
      inline def setDisableEditingUndefined: Self = StObject.set(x, "disableEditing", js.undefined)
      
      inline def setDisableExtraSpaces(value: Boolean): Self = StObject.set(x, "disableExtraSpaces", value.asInstanceOf[js.Any])
      
      inline def setDisableExtraSpacesUndefined: Self = StObject.set(x, "disableExtraSpaces", js.undefined)
      
      inline def setDisableReturn(value: Boolean): Self = StObject.set(x, "disableReturn", value.asInstanceOf[js.Any])
      
      inline def setDisableReturnUndefined: Self = StObject.set(x, "disableReturn", js.undefined)
      
      inline def setElementsContainer(value: HTMLElement): Self = StObject.set(x, "elementsContainer", value.asInstanceOf[js.Any])
      
      inline def setElementsContainerUndefined: Self = StObject.set(x, "elementsContainer", js.undefined)
      
      inline def setExtensions(value: Any): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setImageDragging(value: Boolean): Self = StObject.set(x, "imageDragging", value.asInstanceOf[js.Any])
      
      inline def setImageDraggingUndefined: Self = StObject.set(x, "imageDragging", js.undefined)
      
      inline def setKeyboardCommands(value: KeyboardCommandsOptions | Boolean): Self = StObject.set(x, "keyboardCommands", value.asInstanceOf[js.Any])
      
      inline def setKeyboardCommandsUndefined: Self = StObject.set(x, "keyboardCommands", js.undefined)
      
      inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
      
      inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
      
      inline def setPaste(value: PasteOptions): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPlaceholder(value: PlaceholderOptions | Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      inline def setTargetBlank(value: Boolean): Self = StObject.set(x, "targetBlank", value.asInstanceOf[js.Any])
      
      inline def setTargetBlankUndefined: Self = StObject.set(x, "targetBlank", js.undefined)
      
      inline def setToolbar(value: ToolbarOptions | Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
  
  trait CreateLinkOptions extends StObject {
    
    var buttonClass: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object CreateLinkOptions {
    
    inline def apply(value: String): CreateLinkOptions = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateLinkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateLinkOptions] (val x: Self) extends AnyVal {
      
      inline def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
      
      inline def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyboardCommandOptions extends StObject {
    
    var alt: Boolean
    
    var command: String
    
    var key: String
    
    var meta: Boolean
    
    var shift: Boolean
  }
  object KeyboardCommandOptions {
    
    inline def apply(alt: Boolean, command: String, key: String, meta: Boolean, shift: Boolean): KeyboardCommandOptions = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardCommandOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardCommandOptions] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyboardCommandsOptions extends StObject {
    
    var commands: js.UndefOr[js.Array[KeyboardCommandOptions]] = js.undefined
  }
  object KeyboardCommandsOptions {
    
    inline def apply(): KeyboardCommandsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardCommandsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardCommandsOptions] (val x: Self) extends AnyVal {
      
      inline def setCommands(value: js.Array[KeyboardCommandOptions]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: KeyboardCommandOptions*): Self = StObject.set(x, "commands", js.Array(value*))
    }
  }
  
  @js.native
  trait MediumEditor
    extends StObject
       with // Initialization Functions
  Instantiable1[/* elements */ elementType, typings.mediumEditor.MediumEditor.MediumEditor]
       with Instantiable2[
          /* elements */ elementType, 
          /* options */ CoreOptions, 
          typings.mediumEditor.MediumEditor.MediumEditor
        ] {
    
    def addElements(elements: elementType): Unit = js.native
    
    // Helper Functions
    def checkContentChanged(): Unit = js.native
    def checkContentChanged(editable: HTMLElement): Unit = js.native
    
    // Selection Functions
    def checkSelection(): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    
    // Editor Action Functions
    def cleanPaste(text: String): Unit = js.native
    
    def createLink(opts: CreateLinkOptions): Unit = js.native
    
    def delay(fn: js.Function0[Any]): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def execAction(action: String): Boolean = js.native
    def execAction(action: String, opts: String): Boolean = js.native
    def execAction(action: String, opts: CreateLinkOptions): Boolean = js.native
    
    def exportSelection(): selectionObject = js.native
    
    def getContent(): String = js.native
    def getContent(index: Double): String = js.native
    
    // Static Function
    def getEditorFromElement(element: HTMLElement): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    
    def getExtensionByName(name: String): Any = js.native
    
    def getFocusedElement(): HTMLElement = js.native
    
    def getSelectedParentElement(): HTMLElement = js.native
    def getSelectedParentElement(range: Range): HTMLElement = js.native
    
    def importSelection(selectionState: selectionObject, favorLaterSelectionAnchor: Boolean): Unit = js.native
    
    def off(
      targets: HTMLElement,
      event: String,
      listener: EventListenerOrEventListenerObject,
      useCapture: Boolean
    ): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    def off(
      targets: NodeList,
      event: String,
      listener: EventListenerOrEventListenerObject,
      useCapture: Boolean
    ): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    
    // Event Functions
    def on(
      targets: HTMLElement,
      event: String,
      listener: EventListenerOrEventListenerObject,
      useCapture: Boolean
    ): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    def on(
      targets: NodeList,
      event: String,
      listener: EventListenerOrEventListenerObject,
      useCapture: Boolean
    ): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    
    def pasteHTML(html: String): Unit = js.native
    def pasteHTML(html: String, options: PasteHTMLOptions): Unit = js.native
    
    def queryCommandState(action: String): Boolean = js.native
    
    def removeElements(elements: elementType): Unit = js.native
    
    def resetContent(element: HTMLElement): Unit = js.native
    
    def restoreSelection(): Unit = js.native
    
    def saveSelection(): Unit = js.native
    
    def selectAllContents(): Unit = js.native
    
    def selectElement(element: HTMLElement): Unit = js.native
    
    def serialize(): Any = js.native
    
    def setContent(html: String): Unit = js.native
    def setContent(html: String, index: Double): Unit = js.native
    
    def setup(): Unit = js.native
    
    def startSelectionUpdates(): Unit = js.native
    
    def stopSelectionUpdates(): Unit = js.native
    
    def subscribe(name: String, listener: js.Function2[/* data */ Any, /* editable */ HTMLElement, Unit]): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    
    def trigger(name: String, data: Any, editable: HTMLElement): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    
    def unsubscribe(name: String, listener: js.Function2[/* data */ Any, /* editable */ HTMLElement, Unit]): typings.mediumEditor.MediumEditor.MediumEditor = js.native
    
    // Properties
    var version: Major = js.native
  }
  
  trait PasteHTMLOptions extends StObject {
    
    var cleanAttrs: js.UndefOr[js.Array[String]] = js.undefined
    
    var cleanTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var unwrapTags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PasteHTMLOptions {
    
    inline def apply(): PasteHTMLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteHTMLOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasteHTMLOptions] (val x: Self) extends AnyVal {
      
      inline def setCleanAttrs(value: js.Array[String]): Self = StObject.set(x, "cleanAttrs", value.asInstanceOf[js.Any])
      
      inline def setCleanAttrsUndefined: Self = StObject.set(x, "cleanAttrs", js.undefined)
      
      inline def setCleanAttrsVarargs(value: String*): Self = StObject.set(x, "cleanAttrs", js.Array(value*))
      
      inline def setCleanTags(value: js.Array[String]): Self = StObject.set(x, "cleanTags", value.asInstanceOf[js.Any])
      
      inline def setCleanTagsUndefined: Self = StObject.set(x, "cleanTags", js.undefined)
      
      inline def setCleanTagsVarargs(value: String*): Self = StObject.set(x, "cleanTags", js.Array(value*))
      
      inline def setUnwrapTags(value: js.Array[String]): Self = StObject.set(x, "unwrapTags", value.asInstanceOf[js.Any])
      
      inline def setUnwrapTagsUndefined: Self = StObject.set(x, "unwrapTags", js.undefined)
      
      inline def setUnwrapTagsVarargs(value: String*): Self = StObject.set(x, "unwrapTags", js.Array(value*))
    }
  }
  
  trait PasteOptions extends StObject {
    
    var cleanAttrs: js.UndefOr[js.Array[String]] = js.undefined
    
    var cleanPastedHTML: js.UndefOr[Boolean] = js.undefined
    
    var cleanReplacements: js.UndefOr[js.Array[Any]] = js.undefined
    
    var cleanTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var forcePlainText: js.UndefOr[Boolean] = js.undefined
    
    var preCleanReplacements: js.UndefOr[js.Array[Any]] = js.undefined
    
    var unwrapTags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PasteOptions {
    
    inline def apply(): PasteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasteOptions] (val x: Self) extends AnyVal {
      
      inline def setCleanAttrs(value: js.Array[String]): Self = StObject.set(x, "cleanAttrs", value.asInstanceOf[js.Any])
      
      inline def setCleanAttrsUndefined: Self = StObject.set(x, "cleanAttrs", js.undefined)
      
      inline def setCleanAttrsVarargs(value: String*): Self = StObject.set(x, "cleanAttrs", js.Array(value*))
      
      inline def setCleanPastedHTML(value: Boolean): Self = StObject.set(x, "cleanPastedHTML", value.asInstanceOf[js.Any])
      
      inline def setCleanPastedHTMLUndefined: Self = StObject.set(x, "cleanPastedHTML", js.undefined)
      
      inline def setCleanReplacements(value: js.Array[Any]): Self = StObject.set(x, "cleanReplacements", value.asInstanceOf[js.Any])
      
      inline def setCleanReplacementsUndefined: Self = StObject.set(x, "cleanReplacements", js.undefined)
      
      inline def setCleanReplacementsVarargs(value: Any*): Self = StObject.set(x, "cleanReplacements", js.Array(value*))
      
      inline def setCleanTags(value: js.Array[String]): Self = StObject.set(x, "cleanTags", value.asInstanceOf[js.Any])
      
      inline def setCleanTagsUndefined: Self = StObject.set(x, "cleanTags", js.undefined)
      
      inline def setCleanTagsVarargs(value: String*): Self = StObject.set(x, "cleanTags", js.Array(value*))
      
      inline def setForcePlainText(value: Boolean): Self = StObject.set(x, "forcePlainText", value.asInstanceOf[js.Any])
      
      inline def setForcePlainTextUndefined: Self = StObject.set(x, "forcePlainText", js.undefined)
      
      inline def setPreCleanReplacements(value: js.Array[Any]): Self = StObject.set(x, "preCleanReplacements", value.asInstanceOf[js.Any])
      
      inline def setPreCleanReplacementsUndefined: Self = StObject.set(x, "preCleanReplacements", js.undefined)
      
      inline def setPreCleanReplacementsVarargs(value: Any*): Self = StObject.set(x, "preCleanReplacements", js.Array(value*))
      
      inline def setUnwrapTags(value: js.Array[String]): Self = StObject.set(x, "unwrapTags", value.asInstanceOf[js.Any])
      
      inline def setUnwrapTagsUndefined: Self = StObject.set(x, "unwrapTags", js.undefined)
      
      inline def setUnwrapTagsVarargs(value: String*): Self = StObject.set(x, "unwrapTags", js.Array(value*))
    }
  }
  
  trait PlaceholderOptions extends StObject {
    
    var hideOnClick: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object PlaceholderOptions {
    
    inline def apply(): PlaceholderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlaceholderOptions] (val x: Self) extends AnyVal {
      
      inline def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ToolbarOptions extends StObject {
    
    var align: js.UndefOr[String] = js.undefined
    
    var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[Button]] = js.undefined
    
    var diffLeft: js.UndefOr[Double] = js.undefined
    
    var diffTop: js.UndefOr[Double] = js.undefined
    
    var firstButtonClass: js.UndefOr[String] = js.undefined
    
    var lastButtonClass: js.UndefOr[String] = js.undefined
    
    var relativeContainer: js.UndefOr[Node] = js.undefined
    
    var standardizeSelectionStart: js.UndefOr[Boolean] = js.undefined
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var sticky: js.UndefOr[Boolean] = js.undefined
    
    var stickyTopOffset: js.UndefOr[Double] = js.undefined
    
    var updateOnEmptySelection: js.UndefOr[Boolean] = js.undefined
  }
  object ToolbarOptions {
    
    inline def apply(): ToolbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllowMultiParagraphSelection(value: Boolean): Self = StObject.set(x, "allowMultiParagraphSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiParagraphSelectionUndefined: Self = StObject.set(x, "allowMultiParagraphSelection", js.undefined)
      
      inline def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setDiffLeft(value: Double): Self = StObject.set(x, "diffLeft", value.asInstanceOf[js.Any])
      
      inline def setDiffLeftUndefined: Self = StObject.set(x, "diffLeft", js.undefined)
      
      inline def setDiffTop(value: Double): Self = StObject.set(x, "diffTop", value.asInstanceOf[js.Any])
      
      inline def setDiffTopUndefined: Self = StObject.set(x, "diffTop", js.undefined)
      
      inline def setFirstButtonClass(value: String): Self = StObject.set(x, "firstButtonClass", value.asInstanceOf[js.Any])
      
      inline def setFirstButtonClassUndefined: Self = StObject.set(x, "firstButtonClass", js.undefined)
      
      inline def setLastButtonClass(value: String): Self = StObject.set(x, "lastButtonClass", value.asInstanceOf[js.Any])
      
      inline def setLastButtonClassUndefined: Self = StObject.set(x, "lastButtonClass", js.undefined)
      
      inline def setRelativeContainer(value: Node): Self = StObject.set(x, "relativeContainer", value.asInstanceOf[js.Any])
      
      inline def setRelativeContainerUndefined: Self = StObject.set(x, "relativeContainer", js.undefined)
      
      inline def setStandardizeSelectionStart(value: Boolean): Self = StObject.set(x, "standardizeSelectionStart", value.asInstanceOf[js.Any])
      
      inline def setStandardizeSelectionStartUndefined: Self = StObject.set(x, "standardizeSelectionStart", js.undefined)
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyTopOffset(value: Double): Self = StObject.set(x, "stickyTopOffset", value.asInstanceOf[js.Any])
      
      inline def setStickyTopOffsetUndefined: Self = StObject.set(x, "stickyTopOffset", js.undefined)
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setUpdateOnEmptySelection(value: Boolean): Self = StObject.set(x, "updateOnEmptySelection", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnEmptySelectionUndefined: Self = StObject.set(x, "updateOnEmptySelection", js.undefined)
    }
  }
  
  type elementType = String | HTMLElement | js.Array[HTMLElement] | NodeList | NodeListOf[Element] | HTMLCollection
  
  trait selectionObject extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object selectionObject {
    
    inline def apply(end: Double, start: Double): selectionObject = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[selectionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: selectionObject] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
