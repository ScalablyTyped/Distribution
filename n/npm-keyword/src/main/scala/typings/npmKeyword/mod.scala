package typings.npmKeyword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get a list of npm packages with a certain keyword.
  	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
  	@returns A list of packages having the specified keyword in their package.json `keyword` property.
  	@example
  	```
  	import npmKeyword = require('npm-keyword');
  	(async () => {
  		console.log(await npmKeyword('gulpplugin'));
  		//=> [{name: 'gulp-autoprefixer', description: '…'}, …]
  	})();
  	```
  	*/
  @scala.inline
  def apply(keyword: String): js.Promise[js.Array[PackageDescriptor]] = ^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
  @scala.inline
  def apply(keyword: String, options: Options): js.Promise[js.Array[PackageDescriptor]] = (^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
  @scala.inline
  def apply(keyword: js.Array[String]): js.Promise[js.Array[PackageDescriptor]] = ^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
  @scala.inline
  def apply(keyword: js.Array[String], options: Options): js.Promise[js.Array[PackageDescriptor]] = (^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
  
  @JSImport("npm-keyword", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("npm-keyword", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmKeyword */ js.Any = js.native
  
  /**
  	Get the count of npm packages names with a certain keyword.
  	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
  	@returns The count of packages.
  	@example
  	```
  	import npmKeyword = require('npm-keyword');
  	(async () => {
  		console.log(await npmKeyword.count('gulpplugin'));
  		//=> 3457
  	})();
  	```
  	*/
  @scala.inline
  def count(keyword: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def count(keyword: js.Array[String]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmKeyword */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Get a list of npm package names with a certain keyword.
  	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
  	@returns A list of package names. Use this if you don't need the description as it's faster.
  	@example
  	```
  	import npmKeyword = require('npm-keyword');
  	(async () => {
  		console.log(await npmKeyword.names('gulpplugin'));
  		//=> ['gulp-autoprefixer', …]
  	})();
  	```
  	*/
  @scala.inline
  def names(keyword: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def names(keyword: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def names(keyword: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def names(keyword: js.Array[String], options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  trait Options extends StObject {
    
    /**
    		Limits the amount of results.
    		@default 250
    		*/
    val size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PackageDescriptor extends StObject {
    
    val description: String
    
    val name: String
  }
  object PackageDescriptor {
    
    @scala.inline
    def apply(description: String, name: String): PackageDescriptor = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageDescriptor]
    }
    
    @scala.inline
    implicit class PackageDescriptorMutableBuilder[Self <: PackageDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
