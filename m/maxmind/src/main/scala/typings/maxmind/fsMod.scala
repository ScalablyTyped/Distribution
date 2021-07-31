package typings.maxmind

import typings.maxmind.anon.FnCall
import typings.node.anon.Interval
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  object default {
    
    @JSImport("maxmind/lib/fs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("maxmind/lib/fs", "default.existsSync")
    @js.native
    def existsSync: js.Function1[/* path */ PathLike, Boolean] = js.native
    @scala.inline
    def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def existsSync_=(x: js.Function1[/* path */ PathLike, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("existsSync")(x.asInstanceOf[js.Any])
    
    @JSImport("maxmind/lib/fs", "default.readFile")
    @js.native
    def readFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ js.Any = js.native
    @scala.inline
    def readFile_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFile")(x.asInstanceOf[js.Any])
    
    @JSImport("maxmind/lib/fs", "default.watchFile")
    @js.native
    def watchFile: FnCall = js.native
    @scala.inline
    def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def watchFile(
      filename: PathLike,
      options: Unit,
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def watchFile(
      filename: PathLike,
      options: Interval,
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def watchFile_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watchFile")(x.asInstanceOf[js.Any])
  }
}
