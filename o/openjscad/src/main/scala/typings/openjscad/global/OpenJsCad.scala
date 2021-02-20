package typings.openjscad.global

import typings.openjscad.OpenJsCad.EventHandler
import typings.openjscad.OpenJsCad.ILog
import typings.openjscad.OpenJsCad.IViewerOptions
import typings.openjscad.OpenJsCad.ProcessorOptions
import typings.std.HTMLDivElement
import typings.std.URL
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpenJsCad {
  
  @JSGlobal("OpenJsCad")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("OpenJsCad.AlertUserOfUncaughtExceptions")
  @js.native
  def AlertUserOfUncaughtExceptions(): Unit = js.native
  
  @JSGlobal("OpenJsCad.FileSystemApiErrorHandler")
  @js.native
  def FileSystemApiErrorHandler(fileError: js.Any, operation: js.Any): Unit = js.native
  
  @JSGlobal("OpenJsCad.Processor")
  @js.native
  class Processor protected ()
    extends typings.openjscad.OpenJsCad.Processor {
    def this(containerdiv: HTMLDivElement) = this()
    def this(containerdiv: HTMLDivElement, options: ProcessorOptions) = this()
    def this(containerdiv: HTMLDivElement, options: js.UndefOr[scala.Nothing], onchange: EventHandler) = this()
    def this(containerdiv: HTMLDivElement, options: ProcessorOptions, onchange: EventHandler) = this()
  }
  object Processor {
    
    @JSGlobal("OpenJsCad.Processor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("OpenJsCad.Processor.convertToSolid")
    @js.native
    def convertToSolid(obj: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("OpenJsCad.Processor.heightDefault")
    @js.native
    def heightDefault: js.Any = js.native
    @scala.inline
    def heightDefault_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heightDefault")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OpenJsCad.Processor.widthDefault")
    @js.native
    def widthDefault: js.Any = js.native
    @scala.inline
    def widthDefault_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("widthDefault")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("OpenJsCad.Viewer")
  @js.native
  class Viewer protected ()
    extends typings.openjscad.OpenJsCad.Viewer {
    def this(containerElm: js.Any, size: js.Any, options: IViewerOptions) = this()
  }
  
  @JSGlobal("OpenJsCad.checkResult")
  @js.native
  def checkResult(result: js.Any): Unit = js.native
  
  @JSGlobal("OpenJsCad.expandResultObjectArray")
  @js.native
  def expandResultObjectArray(result: js.Any): js.Any = js.native
  
  @JSGlobal("OpenJsCad.getParamDefinitions")
  @js.native
  def getParamDefinitions(script: js.Any): js.Array[_] = js.native
  
  @JSGlobal("OpenJsCad.getWindowURL")
  @js.native
  def getWindowURL(): URL = js.native
  
  @JSGlobal("OpenJsCad.isChrome")
  @js.native
  def isChrome(): Boolean = js.native
  
  @JSGlobal("OpenJsCad.log")
  @js.native
  def log: ILog = js.native
  @scala.inline
  def log_=(x: ILog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  @JSGlobal("OpenJsCad.makeAbsoluteUrl")
  @js.native
  def makeAbsoluteUrl(url: js.Any, baseurl: js.Any): js.Any = js.native
  
  @JSGlobal("OpenJsCad.parseJsCadScriptASync")
  @js.native
  def parseJsCadScriptASync(script: js.Any, mainParameters: js.Any, options: js.Any, callback: js.Any): Worker = js.native
  
  @JSGlobal("OpenJsCad.parseJsCadScriptSync")
  @js.native
  def parseJsCadScriptSync(script: js.Any, mainParameters: js.Any, debugging: js.Any): js.Any = js.native
  
  @JSGlobal("OpenJsCad.resultFromCompactBinary")
  @js.native
  def resultFromCompactBinary(resultin: js.Any): js.Any = js.native
  
  @JSGlobal("OpenJsCad.resultToCompactBinary")
  @js.native
  def resultToCompactBinary(resultin: js.Any): js.Any = js.native
  
  @JSGlobal("OpenJsCad.revokeBlobUrl")
  @js.native
  def revokeBlobUrl(url: js.Any): Unit = js.native
  
  @JSGlobal("OpenJsCad.runMainInWorker")
  @js.native
  def runMainInWorker(mainParameters: js.Any): Unit = js.native
  
  @JSGlobal("OpenJsCad.textToBlobUrl")
  @js.native
  def textToBlobUrl(txt: js.Any): String = js.native
}
