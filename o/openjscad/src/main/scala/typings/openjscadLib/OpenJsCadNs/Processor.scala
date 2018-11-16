package typings
package openjscadLib.OpenJsCadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OpenJsCad.Processor")
@js.native
class Processor protected () extends js.Object {
  def this(containerdiv: stdLib.HTMLDivElement) = this()
  def this(containerdiv: stdLib.HTMLDivElement, options: ProcessorOptions) = this()
  def this(containerdiv: stdLib.HTMLDivElement, options: ProcessorOptions, onchange: EventHandler) = this()
  var abortbutton: js.Any = js.native
  var containerdiv: js.Any = js.native
  var controldiv: js.Any = js.native
  var currentFormat: js.Any = js.native
  var currentObject: js.Any = js.native
  var currentObjectIndex: js.Any = js.native
  var currentObjects: js.Any = js.native
  var debugging: js.Any = js.native
  var downloadOutputFileLink: js.Any = js.native
  var errordiv: js.Any = js.native
  var errorpre: js.Any = js.native
  var filename: js.Any = js.native
  var formatDropdown: js.Any = js.native
  var generateOutputFileButton: js.Any = js.native
  var hasError: js.Any = js.native
  var hasOutputFile: js.Any = js.native
  var hasValidCurrentObject: js.Any = js.native
  var `isFirstRender_`: js.Any = js.native
  var onchange: js.Any = js.native
  var options: js.Any = js.native
  var outputFileBlobUrl: js.Any = js.native
  var outputFileDirEntry: js.Any = js.native
  var paramControls: js.Any = js.native
  var paramDefinitions: js.Any = js.native
  var parametersdiv: js.Any = js.native
  var parameterstable: js.Any = js.native
  var processing: js.Any = js.native
  var renderedElementDropdown: js.Any = js.native
  var script: js.Any = js.native
  var statusbuttons: js.Any = js.native
  var statusdiv: js.Any = js.native
  var statusspan: js.Any = js.native
  var viewer: js.Any = js.native
  var viewerSize: js.Any = js.native
  var viewerdiv: js.Any = js.native
  var worker: js.Any = js.native
  def abort(): scala.Unit = js.native
  def addLibrary(lib: js.Any): scala.Unit = js.native
  def cleanOption(option: js.Any, deflt: js.Any): js.Any = js.native
  def clearOutputFile(): scala.Unit = js.native
  def clearViewer(): scala.Unit = js.native
  def createElements(): scala.Unit = js.native
  def createParamControls(): scala.Unit = js.native
  def currentObjectToBlob(): js.Any = js.native
  def downloadLinkTextForCurrentObject(): java.lang.String = js.native
  def enableItems(): scala.Unit = js.native
  def formatInfo(format: js.Any): js.Any = js.native
  def generateOutputFile(): scala.Unit = js.native
  def generateOutputFileBlobUrl(): scala.Unit = js.native
  def generateOutputFileFileSystem(): scala.Unit = js.native
  def getFilenameForRenderedObject(): java.lang.String = js.native
  def getParamValues(): js.Object = js.native
  def handleResize(): scala.Unit = js.native
  def hasSolid(): scala.Boolean = js.native
  def isProcessing(): scala.Boolean = js.native
  def rebuildSolid(): scala.Unit = js.native
  def selectedFormat(): js.Any = js.native
  def selectedFormatInfo(): js.Any = js.native
  def setDebugging(debugging: scala.Boolean): scala.Unit = js.native
  def setDrawOption(str: js.Any, bool: js.Any): scala.Unit = js.native
  def setError(txt: java.lang.String): scala.Unit = js.native
  def setJsCad(script: java.lang.String): scala.Unit = js.native
  def setJsCad(script: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  def setOpenJsCadPath(path: java.lang.String): scala.Unit = js.native
  def setRenderedObjects(obj: js.Any): scala.Unit = js.native
  def setSelectedObjectIndex(index: scala.Double): scala.Unit = js.native
  def supportedFormatsForCurrentObject(): js.Array[java.lang.String] = js.native
  def toggleDrawOption(str: js.Any): scala.Boolean = js.native
  def updateDownloadLink(): scala.Unit = js.native
}

@JSGlobal("OpenJsCad.Processor")
@js.native
object Processor extends js.Object {
  var heightDefault: js.Any = js.native
  var widthDefault: js.Any = js.native
  def convertToSolid(obj: js.Any): js.Any = js.native
}

