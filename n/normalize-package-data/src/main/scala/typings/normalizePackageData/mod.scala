package typings.normalizePackageData

import org.scalablytyped.runtime.StringDictionary
import typings.normalizePackageData.anon.Email
import typings.normalizePackageData.anon.Type
import typings.normalizePackageData.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: Input): Unit = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(data: Input, strict: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(data: Input, warn: Unit, strict: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(data: Input, warn: WarnFn): Unit = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(data: Input, warn: WarnFn, strict: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("normalize-package-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Input = StringDictionary[js.Any]
  
  trait Package
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var _id: String
    
    var author: js.UndefOr[Person] = js.undefined
    
    var bin: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var bugs: js.UndefOr[Email | Url] = js.undefined
    
    var bundleDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var contributors: js.UndefOr[js.Array[Person]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var engines: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var license: js.UndefOr[String] = js.undefined
    
    var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
    
    var man: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var optionalDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var readme: String
    
    var repository: js.UndefOr[Type] = js.undefined
    
    var scripts: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var version: String
  }
  object Package {
    
    inline def apply(_id: String, name: String, readme: String, version: String): Package = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    extension [Self <: Package](x: Self) {
      
      inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBin(value: StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBugs(value: Email | Url): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      inline def setBundleDependencies(value: StringDictionary[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
      inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setEngines(value: StringDictionary[String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      inline def setMan(value: js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependencies(value: StringDictionary[String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setScripts(value: StringDictionary[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Person extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Person {
    
    inline def apply(): Person = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Person]
    }
    
    extension [Self <: Person](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type WarnFn = js.Function1[/* msg */ String, Unit]
}
