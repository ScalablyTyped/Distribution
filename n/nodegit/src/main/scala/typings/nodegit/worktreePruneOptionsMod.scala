package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worktreePruneOptionsMod {
  
  trait WorktreePruneOptions extends StObject {
    
    /**
      * A combination of Worktree.PRUNE
      */
    var flags: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object WorktreePruneOptions {
    
    inline def apply(): WorktreePruneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorktreePruneOptions]
    }
    
    extension [Self <: WorktreePruneOptions](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
