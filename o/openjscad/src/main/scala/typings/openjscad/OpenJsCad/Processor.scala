package typings.openjscad.OpenJsCad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Processor extends js.Object {
  
  def abort(): Unit = js.native
  
  var abortbutton: js.Any = js.native
  
  def addLibrary(lib: js.Any): Unit = js.native
  
  def cleanOption(option: js.Any, deflt: js.Any): js.Any = js.native
  
  def clearOutputFile(): Unit = js.native
  
  def clearViewer(): Unit = js.native
  
  var containerdiv: js.Any = js.native
  
  var controldiv: js.Any = js.native
  
  def createElements(): Unit = js.native
  
  def createParamControls(): Unit = js.native
  
  var currentFormat: js.Any = js.native
  
  var currentObject: js.Any = js.native
  
  var currentObjectIndex: js.Any = js.native
  
  def currentObjectToBlob(): js.Any = js.native
  
  var currentObjects: js.Any = js.native
  
  var debugging: js.Any = js.native
  
  def downloadLinkTextForCurrentObject(): String = js.native
  
  var downloadOutputFileLink: js.Any = js.native
  
  def enableItems(): Unit = js.native
  
  var errordiv: js.Any = js.native
  
  var errorpre: js.Any = js.native
  
  var filename: js.Any = js.native
  
  var formatDropdown: js.Any = js.native
  
  def formatInfo(format: js.Any): js.Any = js.native
  
  def generateOutputFile(): Unit = js.native
  
  def generateOutputFileBlobUrl(): Unit = js.native
  
  var generateOutputFileButton: js.Any = js.native
  
  def generateOutputFileFileSystem(): Unit = js.native
  
  def getFilenameForRenderedObject(): String = js.native
  
  def getParamValues(): js.Object = js.native
  
  def handleResize(): Unit = js.native
  
  var hasError: js.Any = js.native
  
  var hasOutputFile: js.Any = js.native
  
  def hasSolid(): Boolean = js.native
  
  var hasValidCurrentObject: js.Any = js.native
  
  var isFirstRender_ : js.Any = js.native
  
  def isProcessing(): Boolean = js.native
  
  var onchange: js.Any = js.native
  
  var options: js.Any = js.native
  
  var outputFileBlobUrl: js.Any = js.native
  
  var outputFileDirEntry: js.Any = js.native
  
  var paramControls: js.Any = js.native
  
  var paramDefinitions: js.Any = js.native
  
  var parametersdiv: js.Any = js.native
  
  var parameterstable: js.Any = js.native
  
  var processing: js.Any = js.native
  
  def rebuildSolid(): Unit = js.native
  
  var renderedElementDropdown: js.Any = js.native
  
  var script: js.Any = js.native
  
  def selectedFormat(): js.Any = js.native
  
  def selectedFormatInfo(): js.Any = js.native
  
  def setDebugging(debugging: Boolean): Unit = js.native
  
  def setDrawOption(str: js.Any, bool: js.Any): Unit = js.native
  
  def setError(txt: String): Unit = js.native
  
  def setJsCad(script: String): Unit = js.native
  def setJsCad(script: String, filename: String): Unit = js.native
  
  def setOpenJsCadPath(path: String): Unit = js.native
  
  def setRenderedObjects(obj: js.Any): Unit = js.native
  
  def setSelectedObjectIndex(index: Double): Unit = js.native
  
  var statusbuttons: js.Any = js.native
  
  var statusdiv: js.Any = js.native
  
  var statusspan: js.Any = js.native
  
  def supportedFormatsForCurrentObject(): js.Array[String] = js.native
  
  def toggleDrawOption(str: js.Any): Boolean = js.native
  
  def updateDownloadLink(): Unit = js.native
  
  var viewer: js.Any = js.native
  
  var viewerSize: js.Any = js.native
  
  var viewerdiv: js.Any = js.native
  
  var worker: js.Any = js.native
}
