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
    
    @scala.inline
    def apply(arch: String, name: String, version: String): Arch = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arch]
    }
    
    @scala.inline
    implicit class ArchMutableBuilder[Self <: Arch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var driver: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
  }
  object Browser {
    
    @scala.inline
    def apply(): Browser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait Build extends StObject {
    
    var build: Revision
    
    var status: Arch
  }
  object Build {
    
    @scala.inline
    def apply(build: Revision, status: Arch): Build = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Build]
    }
    
    @scala.inline
    implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: Revision): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Arch): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Class extends StObject {
    
    var `class`: String
    
    var message: String
    
    var screen: String
    
    var stackTrace: js.Array[ClassName]
  }
  object Class {
    
    @scala.inline
    def apply(`class`: String, message: String, screen: String, stackTrace: js.Array[ClassName]): Class = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    @scala.inline
    implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackTrace(value: js.Array[ClassName]): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackTraceVarargs(value: ClassName*): Self = StObject.set(x, "stackTrace", js.Array(value :_*))
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
    
    var fileName: String
    
    var lineNumber: Double
    
    var methodName: String
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String, fileName: String, lineNumber: Double, methodName: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cliargs extends StObject {
    
    var cli_args: js.Array[String]
    
    var port: Double
    
    var server_path: String
    
    var start_process: Boolean
  }
  object Cliargs {
    
    @scala.inline
    def apply(cli_args: js.Array[String], port: Double, server_path: String, start_process: Boolean): Cliargs = {
      val __obj = js.Dynamic.literal(cli_args = cli_args.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], server_path = server_path.asInstanceOf[js.Any], start_process = start_process.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cliargs]
    }
    
    @scala.inline
    implicit class CliargsMutableBuilder[Self <: Cliargs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCli_args(value: js.Array[String]): Self = StObject.set(x, "cli_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCli_argsVarargs(value: String*): Self = StObject.set(x, "cli_args", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer_path(value: String): Self = StObject.set(x, "server_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_process(value: Boolean): Self = StObject.set(x, "start_process", value.asInstanceOf[js.Any])
    }
  }
  
  trait ELEMENT extends StObject {
    
    var ELEMENT: String
  }
  object ELEMENT {
    
    @scala.inline
    def apply(ELEMENT: String): ELEMENT = {
      val __obj = js.Dynamic.literal(ELEMENT = ELEMENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ELEMENT]
    }
    
    @scala.inline
    implicit class ELEMENTMutableBuilder[Self <: ELEMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setELEMENT(value: String): Self = StObject.set(x, "ELEMENT", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Revision extends StObject {
    
    var revision: String
    
    var time: String
    
    var version: String
  }
  object Revision {
    
    @scala.inline
    def apply(revision: String, time: String, version: String): Revision = {
      val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Revision]
    }
    
    @scala.inline
    implicit class RevisionMutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ui extends StObject {
    
    var ui: js.UndefOr[String] = js.undefined
  }
  object Ui {
    
    @scala.inline
    def apply(): Ui = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ui]
    }
    
    @scala.inline
    implicit class UiMutableBuilder[Self <: Ui] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
