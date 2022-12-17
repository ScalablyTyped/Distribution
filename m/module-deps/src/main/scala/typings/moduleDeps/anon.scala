package typings.moduleDeps

import org.scalablytyped.runtime.StringDictionary
import typings.moduleDeps.mod.PackageObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basedir extends StObject {
    
    var basedir: js.UndefOr[String] = js.undefined
  }
  object Basedir {
    
    inline def apply(): Basedir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basedir]
    }
    
    extension [Self <: Basedir](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
    }
  }
  
  trait Builtin extends StObject {
    
    var builtin: js.UndefOr[Boolean] = js.undefined
    
    var inNodeModules: js.UndefOr[Boolean] = js.undefined
  }
  object Builtin {
    
    inline def apply(): Builtin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Builtin]
    }
    
    extension [Self <: Builtin](x: Self) {
      
      inline def setBuiltin(value: Boolean): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      inline def setBuiltinUndefined: Self = StObject.set(x, "builtin", js.undefined)
      
      inline def setInNodeModules(value: Boolean): Self = StObject.set(x, "inNodeModules", value.asInstanceOf[js.Any])
      
      inline def setInNodeModulesUndefined: Self = StObject.set(x, "inNodeModules", js.undefined)
    }
  }
  
  trait Dictprop
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var filename: String
    
    var id: String
  }
  object Dictprop {
    
    inline def apply(filename: String, id: String): Dictprop = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictprop]
    }
    
    extension [Self <: Dictprop](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entry extends StObject {
    
    var entry: js.UndefOr[Boolean] = js.undefined
    
    var expose: js.UndefOr[String] = js.undefined
    
    var file: String
    
    var id: String
    
    var noparse: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object Entry {
    
    inline def apply(file: String, id: String): Entry = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNoparse(value: Boolean): Self = StObject.set(x, "noparse", value.asInstanceOf[js.Any])
      
      inline def setNoparseUndefined: Self = StObject.set(x, "noparse", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Modules extends StObject {
    
    var modules: Any
  }
  object Modules {
    
    inline def apply(modules: Any): Modules = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modules]
    }
    
    extension [Self <: Modules](x: Self) {
      
      inline def setModules(value: Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined module-deps.module-deps.PackageObject & {  __dirname :string} */
  trait PackageObjectdirnamestrin
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var __dirname: String
  }
  object PackageObjectdirnamestrin {
    
    inline def apply(__dirname: String): PackageObjectdirnamestrin = {
      val __obj = js.Dynamic.literal(__dirname = __dirname.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageObjectdirnamestrin]
    }
    
    extension [Self <: PackageObjectdirnamestrin](x: Self) {
      
      inline def set__dirname(value: String): Self = StObject.set(x, "__dirname", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<module-deps.module-deps.ParentObject> & {  id :string, [name: string] : any} */
  trait PartialParentObjectidstri
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    @JSName("package")
    var _package: js.UndefOr[Any] = js.undefined
    
    var basedir: js.UndefOr[String] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inNodeModules: js.UndefOr[Boolean] = js.undefined
    
    var modules: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var packageFilter: js.UndefOr[js.Function2[/* p */ PackageObject, /* x */ String, PackageObjectdirnamestrin]] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialParentObjectidstri {
    
    inline def apply(): PartialParentObjectidstri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParentObjectidstri]
    }
    
    extension [Self <: PartialParentObjectidstri](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInNodeModules(value: Boolean): Self = StObject.set(x, "inNodeModules", value.asInstanceOf[js.Any])
      
      inline def setInNodeModulesUndefined: Self = StObject.set(x, "inNodeModules", js.undefined)
      
      inline def setModules(value: StringDictionary[Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setPackageFilter(value: (/* p */ PackageObject, /* x */ String) => PackageObjectdirnamestrin): Self = StObject.set(x, "packageFilter", js.Any.fromFunction2(value))
      
      inline def setPackageFilterUndefined: Self = StObject.set(x, "packageFilter", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def set_package(value: Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
}
