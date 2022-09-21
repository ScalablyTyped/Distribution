package typings.nodegit

import typings.nodegit.referenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worktreeAddOptionsMod {
  
  trait WorktreeAddOptions extends StObject {
    
    var lock: js.UndefOr[Double] = js.undefined
    
    /**
      * reference to use for the new worktree HEAD
      */
    var ref: js.UndefOr[Reference] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object WorktreeAddOptions {
    
    inline def apply(): WorktreeAddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorktreeAddOptions]
    }
    
    extension [Self <: WorktreeAddOptions](x: Self) {
      
      inline def setLock(value: Double): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
