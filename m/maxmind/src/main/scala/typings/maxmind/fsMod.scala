package typings.maxmind

import typings.maxmind.anon.FnCall
import typings.node.anon.Interval
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind/lib/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def existsSync(path: PathLike): Boolean = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    
    var readFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ js.Any = js.native
    
    def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
    def watchFile(
      filename: PathLike,
      options: js.UndefOr[scala.Nothing],
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): Unit = js.native
    def watchFile(
      filename: PathLike,
      options: Interval,
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): Unit = js.native
    @JSName("watchFile")
    var watchFile_Original: FnCall = js.native
  }
}
