package typings.meteorCollectionHooks

import typings.meteorCollectionHooks.CollectionHooks.GlobalHookOptions
import typings.meteorCollectionHooks.anon.Insert
import typings.meteorCollectionHooks.anon.Remove
import typings.meteorCollectionHooks.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mongo {
  
  trait Collection[T] extends StObject {
    
    var after: Update[T]
    
    var before: Remove[T]
    
    var direct: Insert[T]
    
    var hookOptions: GlobalHookOptions
  }
  object Collection {
    
    @scala.inline
    def apply[T](after: Update[T], before: Remove[T], direct: Insert[T], hookOptions: GlobalHookOptions): Collection[T] = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], direct = direct.asInstanceOf[js.Any], hookOptions = hookOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collection[T]]
    }
    
    @scala.inline
    implicit class CollectionMutableBuilder[Self <: Collection[?], T] (val x: Self & Collection[T]) extends AnyVal {
      
      @scala.inline
      def setAfter(value: Update[T]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: Remove[T]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirect(value: Insert[T]): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookOptions(value: GlobalHookOptions): Self = StObject.set(x, "hookOptions", value.asInstanceOf[js.Any])
    }
  }
}
