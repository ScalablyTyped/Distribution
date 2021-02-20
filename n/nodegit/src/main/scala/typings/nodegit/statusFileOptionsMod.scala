package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.statusEntryMod.StatusEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusFileOptionsMod {
  
  @js.native
  trait StatusFileOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var entry: js.UndefOr[StatusEntry] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[Double] = js.native
  }
  object StatusFileOptions {
    
    @scala.inline
    def apply(): StatusFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusFileOptions]
    }
    
    @scala.inline
    implicit class StatusFileOptionsMutableBuilder[Self <: StatusFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: StatusEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
