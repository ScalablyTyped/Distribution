package typings.maxmind

import typings.node.anon.WatchFileOptionsbigintfal
import typings.node.anon.WatchFileOptionsbiginttru
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatWatcher
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): StatWatcher = js.native
    def apply(
      filename: PathLike,
      options: Unit,
      listener: js.Function2[
          (/* curr */ BigIntStats) | (/* curr */ Stats), 
          (/* prev */ BigIntStats) | (/* prev */ Stats), 
          Unit
        ]
    ): StatWatcher = js.native
    def apply(
      filename: PathLike,
      options: WatchFileOptionsbigintfal,
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): StatWatcher = js.native
    def apply(
      filename: PathLike,
      options: WatchFileOptionsbiginttru,
      listener: js.Function2[/* curr */ BigIntStats, /* prev */ BigIntStats, Unit]
    ): StatWatcher = js.native
  }
  
  trait Max extends StObject {
    
    var max: Double
  }
  object Max {
    
    inline def apply(max: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
}
