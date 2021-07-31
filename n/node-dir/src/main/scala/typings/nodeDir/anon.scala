package typings.nodeDir

import typings.nodeDir.nodeDirBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Sync extends StObject {
    
    var sync: `true`
  }
  object Sync {
    
    @scala.inline
    def apply(): Sync = {
      val __obj = js.Dynamic.literal(sync = true)
      __obj.asInstanceOf[Sync]
    }
    
    @scala.inline
    implicit class SyncMutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
}
