package typings.npmLicenseCrawler

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-license-crawler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dumpLicenses(args: CrawlerOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dumpLicenses")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* licenses */ Licenses, Unit]
  
  trait CrawlerOptions extends StObject {
    
    /** export the data as comma-separated values to the given file. The path will be created if it does not exist. */
    var csv: js.UndefOr[String] = js.undefined
    
    /** show only third-party licenses, i.e., only list the dependencies defined in package.json. */
    var dependencies: js.UndefOr[Boolean] = js.undefined
    
    /** show only development dependencies */
    var development: js.UndefOr[Boolean] = js.undefined
    
    /** path to a directory to be excluded (and its subdirectories) from the search. */
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** export data as JSON to the given file. The path will be created if it does not exist. */
    var json: js.UndefOr[String] = js.undefined
    
    /** don't show colors in the console output */
    var noColor: js.UndefOr[Boolean] = js.undefined
    
    /** omit version numbers in result (e.g. "npm-license-crawler@0.1.5" becomes "npm-license-crawler") */
    var omitVersion: js.UndefOr[Boolean] = js.undefined
    
    /** show only direct dependencies licenses, i.e., don't list dependencies of dependencies. */
    var onlyDirectDependencies: js.UndefOr[Boolean] = js.undefined
    
    /** show only production dependencies */
    var production: js.UndefOr[Boolean] = js.undefined
    
    /** output the relative file path for license files. */
    var relativeLicensePath: js.UndefOr[Boolean] = js.undefined
    
    /** path to the directory the license search should start from. If omitted the current working directory is assumed. */
    var start: String | js.Array[String]
    
    /** show only licenses that can't be determined or have been guessed. */
    var unknown: js.UndefOr[Boolean] = js.undefined
  }
  object CrawlerOptions {
    
    inline def apply(start: String | js.Array[String]): CrawlerOptions = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrawlerOptions]
    }
    
    extension [Self <: CrawlerOptions](x: Self) {
      
      inline def setCsv(value: String): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
      
      inline def setDependencies(value: Boolean): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setNoColor(value: Boolean): Self = StObject.set(x, "noColor", value.asInstanceOf[js.Any])
      
      inline def setNoColorUndefined: Self = StObject.set(x, "noColor", js.undefined)
      
      inline def setOmitVersion(value: Boolean): Self = StObject.set(x, "omitVersion", value.asInstanceOf[js.Any])
      
      inline def setOmitVersionUndefined: Self = StObject.set(x, "omitVersion", js.undefined)
      
      inline def setOnlyDirectDependencies(value: Boolean): Self = StObject.set(x, "onlyDirectDependencies", value.asInstanceOf[js.Any])
      
      inline def setOnlyDirectDependenciesUndefined: Self = StObject.set(x, "onlyDirectDependencies", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setRelativeLicensePath(value: Boolean): Self = StObject.set(x, "relativeLicensePath", value.asInstanceOf[js.Any])
      
      inline def setRelativeLicensePathUndefined: Self = StObject.set(x, "relativeLicensePath", js.undefined)
      
      inline def setStart(value: String | js.Array[String]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartVarargs(value: String*): Self = StObject.set(x, "start", js.Array(value*))
      
      inline def setUnknown(value: Boolean): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait License extends StObject {
    
    var licenseUrl: String
    
    var licenses: String
    
    var parents: String
    
    var repository: String
  }
  object License {
    
    inline def apply(licenseUrl: String, licenses: String, parents: String, repository: String): License = {
      val __obj = js.Dynamic.literal(licenseUrl = licenseUrl.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[License]
    }
    
    extension [Self <: License](x: Self) {
      
      inline def setLicenseUrl(value: String): Self = StObject.set(x, "licenseUrl", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: String): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setParents(value: String): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  type Licenses = StringDictionary[License]
}
