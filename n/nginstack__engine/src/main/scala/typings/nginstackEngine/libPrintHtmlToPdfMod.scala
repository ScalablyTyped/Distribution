package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPrintHtmlToPdfMod {
  
  inline def apply(canSendToServer: Boolean): Unit = ^.asInstanceOf[js.Dynamic].apply(canSendToServer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/print/HtmlToPdf", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HtmlToPdf {
    def this(canSendToServer: Boolean) = this()
  }
  @JSImport("@nginstack/engine/lib/print/HtmlToPdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait HtmlToPdf extends StObject {
    
    /* private */ var addFileByContent_ : Any = js.native
    
    /* private */ var addFileByPath_ : Any = js.native
    
    def addPage(inputFilePath: String): Unit = js.native
    
    def addPageContent(fileName: String, fileContent: String): Unit = js.native
    def addPageContent(fileName: String, fileContent: String, opt_transferEncoding: String): Unit = js.native
    
    def addResource(inputFilePath: String): Unit = js.native
    
    def addResourceContent(fileName: String, fileContent: String): Unit = js.native
    def addResourceContent(fileName: String, fileContent: String, opt_transferEncoding: String): Unit = js.native
    
    /* private */ var buildCommand_ : Any = js.native
    
    /* private */ var buildRemotePayload_ : Any = js.native
    
    var captureOutput: Boolean = js.native
    
    var copies: Double = js.native
    
    /* private */ var decode_ : Any = js.native
    
    /* private */ var encode_ : Any = js.native
    
    var extraArguments: String = js.native
    
    /* private */ var getCopies: Any = js.native
    
    /* private */ var getExtraArguments: Any = js.native
    
    /* private */ var getGrayScale: Any = js.native
    
    /* private */ var getOrientation: Any = js.native
    
    def getOutput(): String = js.native
    
    /* private */ var getPageSize: Any = js.native
    
    def getPages(): js.Array[Any] = js.native
    
    /* private */ var getTitle: Any = js.native
    
    var grayScale: Boolean = js.native
    
    /* private */ var htmlToPdfExec_ : Any = js.native
    
    /* private */ var htmlToPdfPath_ : Any = js.native
    
    /* private */ var isAppAvailableOnEnvironment_ : Any = js.native
    
    var localFileAction: String = js.native
    
    /* private */ var logger_ : Any = js.native
    
    /* private */ var operationType_ : Any = js.native
    
    var orientation: String = js.native
    
    /* private */ var outputMessage_ : Any = js.native
    
    var pageSize: String = js.native
    
    /* private */ var pages_ : Any = js.native
    
    def print(outputFileName: String): Double = js.native
    def print(outputFileName: String, generateLog: Boolean): Double = js.native
    
    /* private */ var printWithEmbeddedApp_ : Any = js.native
    
    /* private */ var printWithEnvironmentApp_ : Any = js.native
    
    /* private */ var printWithRemoteServer_ : Any = js.native
    
    /* private */ var printWithWebService_ : Any = js.native
    
    /* private */ var remotePayload_ : Any = js.native
    
    /* private */ var resources_ : Any = js.native
    
    /* private */ var setCopies: Any = js.native
    
    /* private */ var setExtraArguments: Any = js.native
    
    /* private */ var setGrayScale: Any = js.native
    
    /* private */ var setOrientation: Any = js.native
    
    def setPageExtraArguments(index: Double, params: String): Unit = js.native
    
    /* private */ var setPageSize: Any = js.native
    
    /* private */ var setTitle: Any = js.native
    
    var timeout: Double = js.native
    
    var title: String = js.native
    
    var transferEncoding: String = js.native
    
    /* private */ var tryExecuteApp_ : Any = js.native
    
    /* private */ var updateAppPackage_ : Any = js.native
    
    /* private */ var workDir_ : Any = js.native
  }
  
  object prototype {
    
    type localFileAction = String
  }
}
