package typings.moduleDeps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
  
  trait Deps extends StObject {
    
    @JSName("package")
    var _package: js.Any
    
    var deps: StringDictionary[Boolean]
    
    var source: String
  }
  object Deps {
    
    inline def apply(_package: js.Any, deps: StringDictionary[Boolean], source: String): Deps = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deps]
    }
    
    extension [Self <: Deps](x: Self) {
      
      inline def setDeps(value: StringDictionary[Boolean]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def set_package(value: js.Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictprop
    extends StObject
       with /* prop */ StringDictionary[js.Any] {
    
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
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Modules extends StObject {
    
    var modules: js.Any
  }
  object Modules {
    
    inline def apply(modules: js.Any): Modules = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modules]
    }
    
    extension [Self <: Modules](x: Self) {
      
      inline def setModules(value: js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    }
  }
}
