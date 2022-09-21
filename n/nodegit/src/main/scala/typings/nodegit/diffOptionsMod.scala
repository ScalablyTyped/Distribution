package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffOptionsMod {
  
  trait DiffOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var contextLines: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var idAbbrev: js.UndefOr[Double] = js.undefined
    
    var ignoreSubmodules: js.UndefOr[Double] = js.undefined
    
    var interhunkLines: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var newPrefix: js.UndefOr[String] = js.undefined
    
    var notifyCb: js.UndefOr[js.Function] = js.undefined
    
    var oldPrefix: js.UndefOr[String] = js.undefined
    
    var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.undefined
    
    var payload: js.UndefOr[Any] = js.undefined
    
    var progressCb: js.UndefOr[Any] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object DiffOptions {
    
    inline def apply(): DiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffOptions]
    }
    
    extension [Self <: DiffOptions](x: Self) {
      
      inline def setContextLines(value: Double): Self = StObject.set(x, "contextLines", value.asInstanceOf[js.Any])
      
      inline def setContextLinesUndefined: Self = StObject.set(x, "contextLines", js.undefined)
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setIdAbbrev(value: Double): Self = StObject.set(x, "idAbbrev", value.asInstanceOf[js.Any])
      
      inline def setIdAbbrevUndefined: Self = StObject.set(x, "idAbbrev", js.undefined)
      
      inline def setIgnoreSubmodules(value: Double): Self = StObject.set(x, "ignoreSubmodules", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSubmodulesUndefined: Self = StObject.set(x, "ignoreSubmodules", js.undefined)
      
      inline def setInterhunkLines(value: Double): Self = StObject.set(x, "interhunkLines", value.asInstanceOf[js.Any])
      
      inline def setInterhunkLinesUndefined: Self = StObject.set(x, "interhunkLines", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setNewPrefix(value: String): Self = StObject.set(x, "newPrefix", value.asInstanceOf[js.Any])
      
      inline def setNewPrefixUndefined: Self = StObject.set(x, "newPrefix", js.undefined)
      
      inline def setNotifyCb(value: js.Function): Self = StObject.set(x, "notifyCb", value.asInstanceOf[js.Any])
      
      inline def setNotifyCbUndefined: Self = StObject.set(x, "notifyCb", js.undefined)
      
      inline def setOldPrefix(value: String): Self = StObject.set(x, "oldPrefix", value.asInstanceOf[js.Any])
      
      inline def setOldPrefixUndefined: Self = StObject.set(x, "oldPrefix", js.undefined)
      
      inline def setPathspec(value: Strarray | String | js.Array[String]): Self = StObject.set(x, "pathspec", value.asInstanceOf[js.Any])
      
      inline def setPathspecUndefined: Self = StObject.set(x, "pathspec", js.undefined)
      
      inline def setPathspecVarargs(value: String*): Self = StObject.set(x, "pathspec", js.Array(value*))
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setProgressCb(value: Any): Self = StObject.set(x, "progressCb", value.asInstanceOf[js.Any])
      
      inline def setProgressCbUndefined: Self = StObject.set(x, "progressCb", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
