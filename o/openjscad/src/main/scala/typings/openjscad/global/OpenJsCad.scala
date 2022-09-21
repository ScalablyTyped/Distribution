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
  
  inline def AlertUserOfUncaughtExceptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertUserOfUncaughtExceptions")().asInstanceOf[Unit]
  
  inline def FileSystemApiErrorHandler(fileError: Any, operation: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FileSystemApiErrorHandler")(fileError.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("OpenJsCad.Processor")
  @js.native
  open class Processor protected ()
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
    inline def convertToSolid(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToSolid")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* static member */
    @JSGlobal("OpenJsCad.Processor.heightDefault")
    @js.native
    def heightDefault: Any = js.native
    inline def heightDefault_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heightDefault")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("OpenJsCad.Processor.widthDefault")
    @js.native
    def widthDefault: Any = js.native
    inline def widthDefault_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("widthDefault")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("OpenJsCad.Viewer")
  @js.native
  open class Viewer protected ()
    extends StObject
       with typings.openjscad.OpenJsCad.Viewer {
    def this(containerElm: Any, size: Any, options: IViewerOptions) = this()
  }
  
  inline def checkResult(result: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResult")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def expandResultObjectArray(result: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("expandResultObjectArray")(result.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getParamDefinitions(script: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParamDefinitions")(script.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getWindowURL(): URL = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowURL")().asInstanceOf[URL]
  
  inline def isChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")().asInstanceOf[Boolean]
  
  @JSGlobal("OpenJsCad.log")
  @js.native
  def log: ILog = js.native
  inline def log_=(x: ILog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  
  inline def makeAbsoluteUrl(url: Any, baseurl: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAbsoluteUrl")(url.asInstanceOf[js.Any], baseurl.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseJsCadScriptASync(script: Any, mainParameters: Any, options: Any, callback: Any): Worker = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsCadScriptASync")(script.asInstanceOf[js.Any], mainParameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Worker]
  
  inline def parseJsCadScriptSync(script: Any, mainParameters: Any, debugging: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsCadScriptSync")(script.asInstanceOf[js.Any], mainParameters.asInstanceOf[js.Any], debugging.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resultFromCompactBinary(resultin: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resultFromCompactBinary")(resultin.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resultToCompactBinary(resultin: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resultToCompactBinary")(resultin.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def revokeBlobUrl(url: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeBlobUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runMainInWorker(mainParameters: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runMainInWorker")(mainParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def textToBlobUrl(txt: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textToBlobUrl")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
}
