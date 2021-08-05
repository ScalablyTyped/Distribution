package typings.nightwatch

import org.scalablytyped.runtime.StringDictionary
import typings.nightwatch.mod.EnhancedElementInstance
import typings.nightwatch.mod.EnhancedPageObjectSections
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arch extends StObject {
    
    var arch: String
    
    var name: String
    
    var version: String
  }
  object Arch {
    
    inline def apply(arch: String, name: String, version: String): Arch = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arch]
    }
    
    extension [Self <: Arch](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var driver: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
  }
  object Browser {
    
    inline def apply(): Browser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait Build extends StObject {
    
    var build: Revision
    
    var status: Arch
  }
  object Build {
    
    inline def apply(build: Revision, status: Arch): Build = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Build]
    }
    
    extension [Self <: Build](x: Self) {
      
      inline def setBuild(value: Revision): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Arch): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Class extends StObject {
    
    var `class`: String
    
    var message: String
    
    var screen: String
    
    var stackTrace: js.Array[ClassName]
  }
  object Class {
    
    inline def apply(`class`: String, message: String, screen: String, stackTrace: js.Array[ClassName]): Class = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setStackTrace(value: js.Array[ClassName]): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
      
      inline def setStackTraceVarargs(value: ClassName*): Self = StObject.set(x, "stackTrace", js.Array(value :_*))
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
    
    var fileName: String
    
    var lineNumber: Double
    
    var methodName: String
  }
  object ClassName {
    
    inline def apply(className: String, fileName: String, lineNumber: Double, methodName: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cliargs extends StObject {
    
    var cli_args: js.Array[String]
    
    var port: Double
    
    var server_path: String
    
    var start_process: Boolean
  }
  object Cliargs {
    
    inline def apply(cli_args: js.Array[String], port: Double, server_path: String, start_process: Boolean): Cliargs = {
      val __obj = js.Dynamic.literal(cli_args = cli_args.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], server_path = server_path.asInstanceOf[js.Any], start_process = start_process.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cliargs]
    }
    
    extension [Self <: Cliargs](x: Self) {
      
      inline def setCli_args(value: js.Array[String]): Self = StObject.set(x, "cli_args", value.asInstanceOf[js.Any])
      
      inline def setCli_argsVarargs(value: String*): Self = StObject.set(x, "cli_args", js.Array(value :_*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setServer_path(value: String): Self = StObject.set(x, "server_path", value.asInstanceOf[js.Any])
      
      inline def setStart_process(value: Boolean): Self = StObject.set(x, "start_process", value.asInstanceOf[js.Any])
    }
  }
  
  trait ELEMENT extends StObject {
    
    var ELEMENT: String
  }
  object ELEMENT {
    
    inline def apply(ELEMENT: String): ELEMENT = {
      val __obj = js.Dynamic.literal(ELEMENT = ELEMENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ELEMENT]
    }
    
    extension [Self <: ELEMENT](x: Self) {
      
      inline def setELEMENT(value: String): Self = StObject.set(x, "ELEMENT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Elements[Sections /* <: EnhancedPageObjectSections */] extends StObject {
    
    /**
      * A map of Element objects (see [Enhanced Element Instances](https://github.com/nightwatchjs/nightwatch/wiki/Page-Object-API#enhanced-element-instances)) used by element selectors.
      */
    var elements: StringDictionary[
        EnhancedElementInstance[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object
        ]
      ] = js.native
    
    /**
      * The name of the page object as defined by its module name (not including the extension).
      * This is the same name used to access the `page` object factory from the page reference in the command API.
      */
    var name: String = js.native
    
    /**
      * This command is an alias to url and also a convenience method because when called without any arguments
      *  it performs a call to .url() with passing the value of `url` property on the page object.
      * Uses `url` protocol command.
      */
    def navigate(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
    def navigate(url: String): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
    def navigate(url: String, callback: js.Function0[Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
    def navigate(url: Unit, callback: js.Function0[Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
    
    var section: Sections = js.native
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Revision extends StObject {
    
    var revision: String
    
    var time: String
    
    var version: String
  }
  object Revision {
    
    inline def apply(revision: String, time: String, version: String): Revision = {
      val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Revision]
    }
    
    extension [Self <: Revision](x: Self) {
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ui extends StObject {
    
    var ui: js.UndefOr[String] = js.undefined
  }
  object Ui {
    
    inline def apply(): Ui = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ui]
    }
    
    extension [Self <: Ui](x: Self) {
      
      inline def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
