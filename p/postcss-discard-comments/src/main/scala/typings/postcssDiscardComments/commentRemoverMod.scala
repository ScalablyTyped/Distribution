package typings.postcssDiscardComments

import typings.postcssDiscardComments.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentRemoverMod {
  
  /** @param {import('../index.js').Options} options */
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("postcss-discard-comments/types/lib/commentRemover", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CommentRemover {
    /** @param {import('../index.js').Options} options */
    def this(options: Options) = this()
    
    /**
      * @param {string} comment
      * @return {boolean | undefined}
      */
    /* CompleteClass */
    override def canRemove(comment: String): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    var options: Options = js.native
  }
  @JSImport("postcss-discard-comments/types/lib/commentRemover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CommentRemover extends StObject {
    
    var _hasFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @param {string} comment
      * @return {boolean | undefined}
      */
    def canRemove(comment: String): js.UndefOr[Boolean]
    
    var options: Options
  }
  object CommentRemover {
    
    inline def apply(canRemove: String => js.UndefOr[Boolean], options: Options): CommentRemover = {
      val __obj = js.Dynamic.literal(canRemove = js.Any.fromFunction1(canRemove), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentRemover]
    }
    
    extension [Self <: CommentRemover](x: Self) {
      
      inline def setCanRemove(value: String => js.UndefOr[Boolean]): Self = StObject.set(x, "canRemove", js.Any.fromFunction1(value))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def set_hasFirst(value: Boolean): Self = StObject.set(x, "_hasFirst", value.asInstanceOf[js.Any])
      
      inline def set_hasFirstUndefined: Self = StObject.set(x, "_hasFirst", js.undefined)
    }
  }
}
