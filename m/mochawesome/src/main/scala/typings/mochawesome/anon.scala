package typings.mochawesome

import typings.mochawesome.mod.Config
import typings.mochawesome.mod.ReporterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Options extends StObject {
    
    var options: Config
    
    var version: String
  }
  object Options {
    
    inline def apply(options: Config, version: String): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Config): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsVersion extends StObject {
    
    var options: ReporterOptions
    
    var version: String
  }
  object OptionsVersion {
    
    inline def apply(options: ReporterOptions, version: String): OptionsVersion = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsVersion] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: ReporterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<mochawesome.mochawesome.ReporterOptions> */
  trait PartialReporterOptions extends StObject {
    
    var code: js.UndefOr[Boolean] = js.undefined
    
    var consoleReporter: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var `no-code`: js.UndefOr[Boolean] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var reportFilename: js.UndefOr[String] = js.undefined
  }
  object PartialReporterOptions {
    
    inline def apply(): PartialReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialReporterOptions] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setConsoleReporter(value: String): Self = StObject.set(x, "consoleReporter", value.asInstanceOf[js.Any])
      
      inline def setConsoleReporterUndefined: Self = StObject.set(x, "consoleReporter", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def `setNo-code`(value: Boolean): Self = StObject.set(x, "no-code", value.asInstanceOf[js.Any])
      
      inline def `setNo-codeUndefined`: Self = StObject.set(x, "no-code", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setReportFilename(value: String): Self = StObject.set(x, "reportFilename", value.asInstanceOf[js.Any])
      
      inline def setReportFilenameUndefined: Self = StObject.set(x, "reportFilename", js.undefined)
    }
  }
  
  trait Version extends StObject {
    
    var version: String
  }
  object Version {
    
    inline def apply(version: String): Version = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
