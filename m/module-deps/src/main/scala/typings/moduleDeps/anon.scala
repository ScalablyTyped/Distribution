package typings.moduleDeps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Builtin extends StObject {
    
    var builtin: js.UndefOr[Boolean] = js.native
    
    var inNodeModules: js.UndefOr[Boolean] = js.native
  }
  object Builtin {
    
    @scala.inline
    def apply(): Builtin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Builtin]
    }
    
    @scala.inline
    implicit class BuiltinMutableBuilder[Self <: Builtin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuiltin(value: Boolean): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinUndefined: Self = StObject.set(x, "builtin", js.undefined)
      
      @scala.inline
      def setInNodeModules(value: Boolean): Self = StObject.set(x, "inNodeModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInNodeModulesUndefined: Self = StObject.set(x, "inNodeModules", js.undefined)
    }
  }
  
  @js.native
  trait Deps extends StObject {
    
    @JSName("package")
    var _package: js.Any = js.native
    
    var deps: StringDictionary[Boolean] = js.native
    
    var source: String = js.native
  }
  object Deps {
    
    @scala.inline
    def apply(_package: js.Any, deps: StringDictionary[Boolean], source: String): Deps = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deps]
    }
    
    @scala.inline
    implicit class DepsMutableBuilder[Self <: Deps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: StringDictionary[Boolean]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: js.Any): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictprop
    extends /* prop */ StringDictionary[js.Any] {
    
    var filename: String = js.native
    
    var id: String = js.native
  }
  object Dictprop {
    
    @scala.inline
    def apply(filename: String, id: String): Dictprop = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictprop]
    }
    
    @scala.inline
    implicit class DictpropMutableBuilder[Self <: Dictprop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entry extends StObject {
    
    var entry: js.UndefOr[Boolean] = js.native
    
    var expose: js.UndefOr[String] = js.native
    
    var file: String = js.native
    
    var id: String = js.native
    
    var noparse: js.UndefOr[Boolean] = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(file: String, id: String): Entry = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoparse(value: Boolean): Self = StObject.set(x, "noparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoparseUndefined: Self = StObject.set(x, "noparse", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Modules extends StObject {
    
    var modules: js.Any = js.native
  }
  object Modules {
    
    @scala.inline
    def apply(modules: js.Any): Modules = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modules]
    }
    
    @scala.inline
    implicit class ModulesMutableBuilder[Self <: Modules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModules(value: js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    }
  }
}
