package typings.pkginfo

import typings.node.NodeModule
import typings.pkginfo.mod.PkgInfo.FindResults
import typings.pkginfo.mod.PkgInfo.Options
import typings.pkginfo.mod.PkgInfo.PkgInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkginfo.pkginfo.PkgInfo.PkgInfo & {  version :string} */
object mod {
  
  inline def apply(pmodule: NodeModule, options: String, properties: String*): PkgInfo = (^.asInstanceOf[js.Dynamic].apply((scala.List(pmodule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(properties.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PkgInfo]
  inline def apply(pmodule: NodeModule, options: js.Array[String], properties: String*): PkgInfo = (^.asInstanceOf[js.Dynamic].apply((scala.List(pmodule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(properties.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PkgInfo]
  inline def apply(pmodule: NodeModule, options: Unit, properties: String*): PkgInfo = (^.asInstanceOf[js.Dynamic].apply((scala.List(pmodule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(properties.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PkgInfo]
  inline def apply(pmodule: NodeModule, options: Options, properties: String*): PkgInfo = (^.asInstanceOf[js.Dynamic].apply((scala.List(pmodule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(properties.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[PkgInfo]
  
  @JSImport("pkginfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(pmodule: NodeModule): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(pmodule.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def find(pmodule: NodeModule, dir: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(pmodule.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  //
  // ### function find (dir)
  // #### @pmodule {Module} Parent module to read from.
  // #### @dir {string} **Optional** Directory to start search from.
  // Searches up the directory tree from `dir` until it finds a directory
  // which contains a `package.json` file.
  //
  inline def read(pmodule: NodeModule): FindResults = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(pmodule.asInstanceOf[js.Any]).asInstanceOf[FindResults]
  inline def read(pmodule: NodeModule, dir: String): FindResults = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(pmodule.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[FindResults]
  
  @JSImport("pkginfo", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  object PkgInfo {
    
    trait FindResults extends StObject {
      
      @JSName("package")
      var _package: Record[String, Any]
      
      var dir: js.UndefOr[String] = js.undefined
    }
    object FindResults {
      
      inline def apply(_package: Record[String, Any]): FindResults = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindResults]
      }
      
      extension [Self <: FindResults](x: Self) {
        
        inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        inline def set_package(value: Record[String, Any]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var dir: js.UndefOr[String] = js.undefined
      
      var include: js.Array[String]
    }
    object Options {
      
      inline def apply(include: js.Array[String]): Options = {
        val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      }
    }
    
    @js.native
    trait PkgInfo extends StObject {
      
      def apply(pmodule: NodeModule, options: String, properties: String*): typings.pkginfo.mod.PkgInfo.PkgInfo = js.native
      def apply(pmodule: NodeModule, options: js.Array[String], properties: String*): typings.pkginfo.mod.PkgInfo.PkgInfo = js.native
      def apply(pmodule: NodeModule, options: Unit, properties: String*): typings.pkginfo.mod.PkgInfo.PkgInfo = js.native
      def apply(pmodule: NodeModule, options: Options, properties: String*): typings.pkginfo.mod.PkgInfo.PkgInfo = js.native
      
      def find(pmodule: NodeModule): Record[String, Any] = js.native
      def find(pmodule: NodeModule, dir: String): Record[String, Any] = js.native
      
      //
      // ### function find (dir)
      // #### @pmodule {Module} Parent module to read from.
      // #### @dir {string} **Optional** Directory to start search from.
      // Searches up the directory tree from `dir` until it finds a directory
      // which contains a `package.json` file.
      //
      def read(pmodule: NodeModule): FindResults = js.native
      def read(pmodule: NodeModule, dir: String): FindResults = js.native
    }
  }
}
