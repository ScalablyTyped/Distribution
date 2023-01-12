package typings.npmKeyword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Get a list of npm packages with certain keywords.
    	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords.
    	@returns A list of packages having the specified keywords in their package.json `keyword` property.
    	@example
    	```
    	import npmKeyword from 'npm-keyword';
    	console.log(await npmKeyword('gulpplugin'));
    	//=> [{name: 'gulp-autoprefixer', description: '…'}, …]
    	```
    	*/
    inline def apply(keyword: String): js.Promise[js.Array[PackageDescriptor]] = ^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
    inline def apply(keyword: String, options: Options): js.Promise[js.Array[PackageDescriptor]] = (^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
    inline def apply(keyword: js.Array[String]): js.Promise[js.Array[PackageDescriptor]] = ^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
    inline def apply(keyword: js.Array[String], options: Options): js.Promise[js.Array[PackageDescriptor]] = (^.asInstanceOf[js.Dynamic].apply(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PackageDescriptor]]]
    
    @JSImport("npm-keyword", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Get the count of npm packages names with certain keywords.
    	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
    	@returns The count of packages.
    	@example
    	```
    	import npmKeyword from 'npm-keyword';
    	console.log(await npmKeyword.count('gulpplugin'));
    	//=> 3457
    	```
    	*/
    inline def count(keyword: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def count(keyword: js.Array[String]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    
    /**
    	Get a list of npm package names with certain keywords.
    	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
    	@returns A list of package names. Use this if you don't need the description as it's faster.
    	@example
    	```
    	import npmKeyword from 'npm-keyword';
    	console.log(await npmKeyword.names('gulpplugin'));
    	//=> ['gulp-autoprefixer', …]
    	```
    	*/
    inline def names(keyword: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def names(keyword: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    inline def names(keyword: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def names(keyword: js.Array[String], options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("names")(keyword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  }
  
  trait Options extends StObject {
    
    /**
    	Limits the amount of results.
    	@default 250
    	*/
    val size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PackageDescriptor extends StObject {
    
    val description: String
    
    val name: String
  }
  object PackageDescriptor {
    
    inline def apply(description: String, name: String): PackageDescriptor = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageDescriptor] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
