package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeFileOptionsMod {
  
  trait MergeFileOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var ancestorLabel: js.UndefOr[String] = js.undefined
    
    var favor: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var ourLabel: js.UndefOr[String] = js.undefined
    
    var theirLabel: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object MergeFileOptions {
    
    @scala.inline
    def apply(): MergeFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeFileOptions]
    }
    
    @scala.inline
    implicit class MergeFileOptionsMutableBuilder[Self <: MergeFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAncestorLabel(value: String): Self = StObject.set(x, "ancestorLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAncestorLabelUndefined: Self = StObject.set(x, "ancestorLabel", js.undefined)
      
      @scala.inline
      def setFavor(value: Double): Self = StObject.set(x, "favor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFavorUndefined: Self = StObject.set(x, "favor", js.undefined)
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setOurLabel(value: String): Self = StObject.set(x, "ourLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOurLabelUndefined: Self = StObject.set(x, "ourLabel", js.undefined)
      
      @scala.inline
      def setTheirLabel(value: String): Self = StObject.set(x, "theirLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheirLabelUndefined: Self = StObject.set(x, "theirLabel", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
