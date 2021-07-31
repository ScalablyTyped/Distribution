package typings.npmLicenseCrawler

import org.scalablytyped.runtime.StringDictionary
import typings.npmLicenseCrawler.anon.LicenseUrl
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-license-crawler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dumpLicenses(args: CrawlerOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dumpLicenses")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function2[/* error */ Error | Null, /* licenses */ Licenses, Unit]
  
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
    
    @scala.inline
    def apply(start: String | js.Array[String]): CrawlerOptions = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrawlerOptions]
    }
    
    @scala.inline
    implicit class CrawlerOptionsMutableBuilder[Self <: CrawlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsv(value: String): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
      
      @scala.inline
      def setDependencies(value: Boolean): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      @scala.inline
      def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setOmitVersion(value: Boolean): Self = StObject.set(x, "omitVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitVersionUndefined: Self = StObject.set(x, "omitVersion", js.undefined)
      
      @scala.inline
      def setOnlyDirectDependencies(value: Boolean): Self = StObject.set(x, "onlyDirectDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyDirectDependenciesUndefined: Self = StObject.set(x, "onlyDirectDependencies", js.undefined)
      
      @scala.inline
      def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      @scala.inline
      def setRelativeLicensePath(value: Boolean): Self = StObject.set(x, "relativeLicensePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeLicensePathUndefined: Self = StObject.set(x, "relativeLicensePath", js.undefined)
      
      @scala.inline
      def setStart(value: String | js.Array[String]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVarargs(value: String*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setUnknown(value: Boolean): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  type Licenses = StringDictionary[LicenseUrl]
}
