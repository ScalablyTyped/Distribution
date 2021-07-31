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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpenJsCad {
  
  @JSGlobal("OpenJsCad")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def AlertUserOfUncaughtExceptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertUserOfUncaughtExceptions")().asInstanceOf[Unit]
  
  @scala.inline
  def FileSystemApiErrorHandler(fileError: js.Any, operation: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FileSystemApiErrorHandler")(fileError.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("OpenJsCad.Processor")
  @js.native
  class Processor protected ()
    extends StObject
       with typings.openjscad.OpenJsCad.Processor {
    def this(containerdiv: HTMLDivElement) = this()
    def this(containerdiv: HTMLDivElement, options: ProcessorOptions) = this()
    def this(containerdiv: HTMLDivElement, options: Unit, onchange: EventHandler) = this()
    def this(containerdiv: HTMLDivElement, options: ProcessorOptions, onchange: EventHandler) = this()
  }
  object Processor {
    
    @JSGlobal("OpenJsCad.Processor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def convertToSolid(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToSolid")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    extends StObject
       with typings.openjscad.OpenJsCad.Viewer {
    def this(containerElm: js.Any, size: js.Any, options: IViewerOptions) = this()
  }
  
  @scala.inline
  def checkResult(result: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResult")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def expandResultObjectArray(result: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expandResultObjectArray")(result.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getParamDefinitions(script: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParamDefinitions")(script.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def getWindowURL(): URL = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowURL")().asInstanceOf[URL]
  
  @scala.inline
  def isChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")().asInstanceOf[Boolean]
  
  @JSGlobal("OpenJsCad.log")
  @js.native
  def log: ILog = js.native
  @scala.inline
  def log_=(x: ILog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def makeAbsoluteUrl(url: js.Any, baseurl: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsoluteUrl")(url.asInstanceOf[js.Any], baseurl.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def parseJsCadScriptASync(script: js.Any, mainParameters: js.Any, options: js.Any, callback: js.Any): Worker = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsCadScriptASync")(script.asInstanceOf[js.Any], mainParameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Worker]
  
  @scala.inline
  def parseJsCadScriptSync(script: js.Any, mainParameters: js.Any, debugging: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsCadScriptSync")(script.asInstanceOf[js.Any], mainParameters.asInstanceOf[js.Any], debugging.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def resultFromCompactBinary(resultin: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resultFromCompactBinary")(resultin.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def resultToCompactBinary(resultin: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resultToCompactBinary")(resultin.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def revokeBlobUrl(url: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeBlobUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def runMainInWorker(mainParameters: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runMainInWorker")(mainParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def textToBlobUrl(txt: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textToBlobUrl")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
}
