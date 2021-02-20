package typings.maxmind

import typings.node.anon.Interval
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
    def apply(
      filename: PathLike,
      options: js.UndefOr[scala.Nothing],
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): Unit = js.native
    def apply(
      filename: PathLike,
      options: Interval,
      listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: Double = js.native
  }
  object Max {
    
    @scala.inline
    def apply(max: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
}
