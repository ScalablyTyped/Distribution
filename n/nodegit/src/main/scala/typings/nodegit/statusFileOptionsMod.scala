package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.statusEntryMod.StatusEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusFileOptionsMod {
  
  trait StatusFileOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var entry: js.UndefOr[StatusEntry] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object StatusFileOptions {
    
    inline def apply(): StatusFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusFileOptions] (val x: Self) extends AnyVal {
      
      inline def setEntry(value: StatusEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
