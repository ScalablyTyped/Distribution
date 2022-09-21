package typings.postcss

import typings.postcss.anon.PartialCommentProps
import typings.postcss.nodeMod.AnyNode
import typings.postcss.nodeMod.ChildNode
import typings.postcss.nodeMod.ChildProps
import typings.postcss.nodeMod.NodeProps
import typings.postcss.postcssStrings.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentMod {
  
  @JSImport("postcss/lib/comment", JSImport.Default)
  @js.native
  open class default ()
    extends Comment
       with AnyNode
       with ChildNode {
    def this(defaults: CommentProps) = this()
  }
  
  @js.native
  trait Comment
    extends typings.postcss.nodeMod.default {
    
    def assign(overrides: CommentProps): this.type = js.native
    
    def clone(overrides: PartialCommentProps): this.type = js.native
    
    def cloneAfter(overrides: PartialCommentProps): this.type = js.native
    
    def cloneBefore(overrides: PartialCommentProps): this.type = js.native
    
    @JSName("parent")
    var parent_Comment: js.UndefOr[typings.postcss.containerMod.default[ChildNode]] = js.native
    
    @JSName("raws")
    var raws_Comment: CommentRaws = js.native
    
    /**
      * The comment's text.
      */
    var text: String = js.native
    
    @JSName("type")
    var type_Comment: comment = js.native
  }
  
  trait CommentProps
    extends StObject
       with NodeProps
       with ChildProps {
    
    /** Information used to generate byte-to-byte equal node string as it was in the origin input. */
    var raws: js.UndefOr[CommentRaws] = js.undefined
    
    /** Content of the comment. */
    var text: String
  }
  object CommentProps {
    
    inline def apply(text: String): CommentProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentProps]
    }
    
    extension [Self <: CommentProps](x: Self) {
      
      inline def setRaws(value: CommentRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait CommentRaws extends StObject {
    
    /**
      * The space symbols before the node.
      */
    var before: js.UndefOr[String] = js.undefined
    
    /**
      * The space symbols between `/ *` and the comment’s text.
      */
    var left: js.UndefOr[String] = js.undefined
    
    /**
      * The space symbols between the comment’s text.
      */
    var right: js.UndefOr[String] = js.undefined
  }
  object CommentRaws {
    
    inline def apply(): CommentRaws = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentRaws]
    }
    
    extension [Self <: CommentRaws](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
}
