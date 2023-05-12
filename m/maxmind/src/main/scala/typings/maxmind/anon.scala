package typings.maxmind

import typings.node.anon.WatchFileOptionsbigintfal
import typings.node.anon.WatchFileOptionsbiginttru
import typings.node.fsMod.BigIntStatsListener
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatWatcher
import typings.node.fsMod.StatsListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(filename: PathLike, listener: StatsListener): StatWatcher = js.native
    def apply(filename: PathLike, options: Unit, listener: BigIntStatsListener | StatsListener): StatWatcher = js.native
    def apply(filename: PathLike, options: WatchFileOptionsbigintfal, listener: StatsListener): StatWatcher = js.native
    def apply(filename: PathLike, options: WatchFileOptionsbiginttru, listener: BigIntStatsListener): StatWatcher = js.native
  }
  
  trait Max extends StObject {
    
    var max: Double
  }
  object Max {
    
    inline def apply(max: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
}
