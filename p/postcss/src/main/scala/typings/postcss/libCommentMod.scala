package typings.postcss

import typings.postcss.anon.PartialCommentProps
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.libNodeMod.ChildProps
import typings.postcss.libNodeMod.NodeProps
import typings.postcss.postcssStrings.comment
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommentMod {
  
  @JSImport("postcss/lib/comment", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Comment_
  
  /**
    * Represents a comment between declarations or statements (rule and at-rules).
    *
    * ```js
    * Once (root, { Comment }) {
    *   let note = new Comment({ text: 'Note: …' })
    *   root.append(note)
    * }
    * ```
    *
    * Comments inside selectors, at-rule parameters, or declaration values
    * will be stored in the `raws` properties explained above.
    */
  @JSImport("postcss/lib/comment", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Comment_
       with AnyNode
       with ChildNode {
    def this(defaults: CommentProps) = this()
  }
  
  type Comment = Comment_
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentRaws] (val x: Self) extends AnyVal {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  /**
    * Represents a comment between declarations or statements (rule and at-rules).
    *
    * ```js
    * Once (root, { Comment }) {
    *   let note = new Comment({ text: 'Note: …' })
    *   root.append(note)
    * }
    * ```
    *
    * Comments inside selectors, at-rule parameters, or declaration values
    * will be stored in the `raws` properties explained above.
    */
  @js.native
  trait Comment_
    extends StObject
       with Node {
    
    def assign(overrides: js.Object): this.type = js.native
    def assign(overrides: CommentProps): this.type = js.native
    
    def clone(overrides: PartialCommentProps): this.type = js.native
    
    def cloneAfter(): this.type = js.native
    def cloneAfter(overrides: PartialCommentProps): this.type = js.native
    
    def cloneBefore(): this.type = js.native
    def cloneBefore(overrides: PartialCommentProps): this.type = js.native
    
    var parent: js.UndefOr[typings.postcss.libContainerMod.default[typings.std.ChildNode]] = js.native
    
    var raws: CommentRaws = js.native
    
    /**
      * The comment's text.
      */
    var text: String = js.native
    
    var `type`: comment = js.native
  }
}
