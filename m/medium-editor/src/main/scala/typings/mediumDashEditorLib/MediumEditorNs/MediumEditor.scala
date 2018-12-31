package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediumEditor
  extends // Initialization Functions
org.scalablytyped.runtime.Instantiable1[/* elements */ elementType, MediumEditor]
     with org.scalablytyped.runtime.Instantiable2[/* elements */ elementType, /* options */ CoreOptions, MediumEditor] {
  // Properties
  var version: mediumDashEditorLib.Anon_Revision = js.native
  def addElements(elements: elementType): scala.Unit = js.native
  // Helper Functions
  def checkContentChanged(): scala.Unit = js.native
  def checkContentChanged(editable: stdLib.HTMLElement): scala.Unit = js.native
  // Selection Functions
  def checkSelection(): MediumEditor = js.native
  // Editor Action Functions
  def cleanPaste(text: java.lang.String): scala.Unit = js.native
  def createLink(opts: CreateLinkOptions): scala.Unit = js.native
  def delay(fn: js.Function0[_]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def execAction(action: java.lang.String): scala.Boolean = js.native
  def execAction(action: java.lang.String, opts: java.lang.String): scala.Boolean = js.native
  def execAction(action: java.lang.String, opts: CreateLinkOptions): scala.Boolean = js.native
  def exportSelection(): selectionObject = js.native
  def getContent(): java.lang.String = js.native
  def getContent(index: scala.Double): java.lang.String = js.native
  // Static Function
  def getEditorFromElement(element: stdLib.HTMLElement): MediumEditor = js.native
  def getExtensionByName(name: java.lang.String): js.Any = js.native
  def getFocusedElement(): stdLib.HTMLElement = js.native
  def getSelectedParentElement(): stdLib.HTMLElement = js.native
  def getSelectedParentElement(range: stdLib.Range): stdLib.HTMLElement = js.native
  def importSelection(selectionState: selectionObject, favorLaterSelectionAnchor: scala.Boolean): scala.Unit = js.native
  def off(
    targets: stdLib.HTMLElement,
    event: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    useCapture: scala.Boolean
  ): MediumEditor = js.native
  def off(
    targets: stdLib.NodeList,
    event: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    useCapture: scala.Boolean
  ): MediumEditor = js.native
  // Event Functions
  def on(
    targets: stdLib.HTMLElement,
    event: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    useCapture: scala.Boolean
  ): MediumEditor = js.native
  def on(
    targets: stdLib.NodeList,
    event: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    useCapture: scala.Boolean
  ): MediumEditor = js.native
  def pasteHTML(html: java.lang.String): scala.Unit = js.native
  def pasteHTML(html: java.lang.String, options: PasteHTMLOptions): scala.Unit = js.native
  def queryCommandState(action: java.lang.String): scala.Boolean = js.native
  def removeElements(elements: elementType): scala.Unit = js.native
  def resetContent(element: stdLib.HTMLElement): scala.Unit = js.native
  def restoreSelection(): scala.Unit = js.native
  def saveSelection(): scala.Unit = js.native
  def selectAllContents(): scala.Unit = js.native
  def selectElement(element: stdLib.HTMLElement): scala.Unit = js.native
  def serialize(): js.Any = js.native
  def setContent(html: java.lang.String): scala.Unit = js.native
  def setContent(html: java.lang.String, index: scala.Double): scala.Unit = js.native
  def setup(): scala.Unit = js.native
  def startSelectionUpdates(): scala.Unit = js.native
  def stopSelectionUpdates(): scala.Unit = js.native
  def subscribe(
    name: java.lang.String,
    listener: js.Function2[/* data */ js.Any, /* editable */ stdLib.HTMLElement, scala.Unit]
  ): MediumEditor = js.native
  def trigger(name: java.lang.String, data: js.Any, editable: stdLib.HTMLElement): MediumEditor = js.native
  def unsubscribe(
    name: java.lang.String,
    listener: js.Function2[/* data */ js.Any, /* editable */ stdLib.HTMLElement, scala.Unit]
  ): MediumEditor = js.native
}

