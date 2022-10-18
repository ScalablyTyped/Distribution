package typings.ngtoolsWebpack

import typings.ngtoolsWebpack.anon.IsDirectory
import typings.node.bufferMod.global.Buffer
import typings.typescript.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvySystemMod {
  
  @JSImport("@ngtools/webpack/src/ivy/system", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWebpackSystem(input: InputFileSystemSync, currentDirectory: String): System = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebpackSystem")(input.asInstanceOf[js.Any], currentDirectory.asInstanceOf[js.Any])).asInstanceOf[System]
  
  /* Inlined webpack.webpack.Compiler['inputFileSystem'] */
  /* Rewritten from type alias, can be one of: 
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.readlink
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.realpath
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.join
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.dirname
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.readFile
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.purge
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.lstat
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.stat
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.readJson
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.readdir
    - typings.ngtoolsWebpack.ngtoolsWebpackStrings.relative
  */
  trait InputFileSystem extends StObject
  object InputFileSystem {
    
    inline def dirname: typings.ngtoolsWebpack.ngtoolsWebpackStrings.dirname = "dirname".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.dirname]
    
    inline def join: typings.ngtoolsWebpack.ngtoolsWebpackStrings.join = "join".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.join]
    
    inline def lstat: typings.ngtoolsWebpack.ngtoolsWebpackStrings.lstat = "lstat".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.lstat]
    
    inline def purge: typings.ngtoolsWebpack.ngtoolsWebpackStrings.purge = "purge".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.purge]
    
    inline def readFile: typings.ngtoolsWebpack.ngtoolsWebpackStrings.readFile = "readFile".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.readFile]
    
    inline def readJson: typings.ngtoolsWebpack.ngtoolsWebpackStrings.readJson = "readJson".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.readJson]
    
    inline def readdir: typings.ngtoolsWebpack.ngtoolsWebpackStrings.readdir = "readdir".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.readdir]
    
    inline def readlink: typings.ngtoolsWebpack.ngtoolsWebpackStrings.readlink = "readlink".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.readlink]
    
    inline def realpath: typings.ngtoolsWebpack.ngtoolsWebpackStrings.realpath = "realpath".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.realpath]
    
    inline def relative: typings.ngtoolsWebpack.ngtoolsWebpackStrings.relative = "relative".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.relative]
    
    inline def stat: typings.ngtoolsWebpack.ngtoolsWebpackStrings.stat = "stat".asInstanceOf[typings.ngtoolsWebpack.ngtoolsWebpackStrings.stat]
  }
  
  @js.native
  trait InputFileSystemSync
    extends StObject
       with InputFileSystem {
    
    def readFileSync(path: String): Buffer = js.native
    
    def statSync(path: String): IsDirectory = js.native
  }
}
