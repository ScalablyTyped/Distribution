package typings.nodelibFsScandir

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.Encoding
import typings.node.anon.WithFileTypes
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import typings.nodelibFsScandir.anon.FnCall
import typings.nodelibFsScandir.anon.FnCallPathOptions
import typings.nodelibFsScandir.anon.PartialFileSystemAdapter
import typings.nodelibFsScandir.anon.Typeoflstat
import typings.nodelibFsScandir.anon.Typeofreaddir
import typings.nodelibFsScandir.anon.Typeofstat
import typings.nodelibFsScandir.nodelibFsScandirStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@nodelib/fs.scandir/out/adapters/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.scandir/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  @scala.inline
  def createFileSystemAdapter(): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")().asInstanceOf[FileSystemAdapter]
  @scala.inline
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemAdapter")(fsMethods.asInstanceOf[js.Any]).asInstanceOf[FileSystemAdapter]
  
  trait FileSystemAdapter extends StObject {
    
    var lstat: Typeoflstat
    
    def lstatSync(path: PathLike): Stats
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats]
    
    var readdir: Typeofreaddir
    
    def readdirSync(path: PathLike): js.Array[Buffer | String]
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String]
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String]
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent]
    def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer]
    def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String]
    @JSName("readdirSync")
    var readdirSync_Original: FnCallPathOptions
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer]
    
    var stat: Typeofstat
    
    def statSync(path: PathLike): Stats
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats
    @JSName("statSync")
    var statSync_Original: FnCall
  }
  object FileSystemAdapter {
    
    @scala.inline
    def apply(
      lstat: Typeoflstat,
      lstatSync: /* path */ PathLike => Stats,
      readdir: Typeofreaddir,
      readdirSync: FnCallPathOptions,
      stat: Typeofstat,
      statSync: FnCall
    ): FileSystemAdapter = {
      val __obj = js.Dynamic.literal(lstat = lstat.asInstanceOf[js.Any], lstatSync = js.Any.fromFunction1(lstatSync), readdir = readdir.asInstanceOf[js.Any], readdirSync = readdirSync.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], statSync = statSync.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemAdapter]
    }
    
    @scala.inline
    implicit class FileSystemAdapterMutableBuilder[Self <: FileSystemAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLstatSync(value: /* path */ PathLike => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReaddir(value: Typeofreaddir): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaddirSync(value: FnCallPathOptions): Self = StObject.set(x, "readdirSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatSync(value: FnCall): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
    }
  }
}
