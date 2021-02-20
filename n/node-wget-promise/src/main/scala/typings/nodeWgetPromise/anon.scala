package typings.nodeWgetPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait OnProgress extends StObject {
    
    var onProgress: js.UndefOr[js.Any] = js.native
    
    var onStart: js.UndefOr[js.Any] = js.native
    
    var output: js.UndefOr[String] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object OnProgress {
    
    @scala.inline
    def apply(): OnProgress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnProgress]
    }
    
    @scala.inline
    implicit class OnProgressMutableBuilder[Self <: OnProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnProgress(value: js.Any): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnStart(value: js.Any): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
