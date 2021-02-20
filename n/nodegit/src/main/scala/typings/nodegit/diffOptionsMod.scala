package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffOptionsMod {
  
  @js.native
  trait DiffOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var contextLines: js.UndefOr[Double] = js.native
    
    var flags: js.UndefOr[Double] = js.native
    
    var idAbbrev: js.UndefOr[Double] = js.native
    
    var ignoreSubmodules: js.UndefOr[Double] = js.native
    
    var interhunkLines: js.UndefOr[Double] = js.native
    
    var maxSize: js.UndefOr[Double] = js.native
    
    var newPrefix: js.UndefOr[String] = js.native
    
    var notifyCb: js.UndefOr[js.Function] = js.native
    
    var oldPrefix: js.UndefOr[String] = js.native
    
    var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.native
    
    var payload: js.UndefOr[js.Any] = js.native
    
    var progressCb: js.UndefOr[js.Any] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object DiffOptions {
    
    @scala.inline
    def apply(): DiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffOptions]
    }
    
    @scala.inline
    implicit class DiffOptionsMutableBuilder[Self <: DiffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextLines(value: Double): Self = StObject.set(x, "contextLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextLinesUndefined: Self = StObject.set(x, "contextLines", js.undefined)
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setIdAbbrev(value: Double): Self = StObject.set(x, "idAbbrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdAbbrevUndefined: Self = StObject.set(x, "idAbbrev", js.undefined)
      
      @scala.inline
      def setIgnoreSubmodules(value: Double): Self = StObject.set(x, "ignoreSubmodules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSubmodulesUndefined: Self = StObject.set(x, "ignoreSubmodules", js.undefined)
      
      @scala.inline
      def setInterhunkLines(value: Double): Self = StObject.set(x, "interhunkLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterhunkLinesUndefined: Self = StObject.set(x, "interhunkLines", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setNewPrefix(value: String): Self = StObject.set(x, "newPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPrefixUndefined: Self = StObject.set(x, "newPrefix", js.undefined)
      
      @scala.inline
      def setNotifyCb(value: js.Function): Self = StObject.set(x, "notifyCb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyCbUndefined: Self = StObject.set(x, "notifyCb", js.undefined)
      
      @scala.inline
      def setOldPrefix(value: String): Self = StObject.set(x, "oldPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPrefixUndefined: Self = StObject.set(x, "oldPrefix", js.undefined)
      
      @scala.inline
      def setPathspec(value: Strarray | String | js.Array[String]): Self = StObject.set(x, "pathspec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathspecUndefined: Self = StObject.set(x, "pathspec", js.undefined)
      
      @scala.inline
      def setPathspecVarargs(value: String*): Self = StObject.set(x, "pathspec", js.Array(value :_*))
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setProgressCb(value: js.Any): Self = StObject.set(x, "progressCb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressCbUndefined: Self = StObject.set(x, "progressCb", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
