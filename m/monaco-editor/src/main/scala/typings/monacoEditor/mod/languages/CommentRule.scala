package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentRule extends StObject {
  
  /**
    * The block comment character pair, like `/ * block comment *&#47;`
    */
  var blockComment: js.UndefOr[CharacterPair | Null] = js.undefined
  
  /**
    * The line comment token, like `// this is a comment`
    */
  var lineComment: js.UndefOr[String | Null] = js.undefined
}
object CommentRule {
  
  @scala.inline
  def apply(): CommentRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentRule]
  }
  
  @scala.inline
  implicit class CommentRuleMutableBuilder[Self <: CommentRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockComment(value: CharacterPair): Self = StObject.set(x, "blockComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentNull: Self = StObject.set(x, "blockComment", null)
    
    @scala.inline
    def setBlockCommentUndefined: Self = StObject.set(x, "blockComment", js.undefined)
    
    @scala.inline
    def setLineComment(value: String): Self = StObject.set(x, "lineComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCommentNull: Self = StObject.set(x, "lineComment", null)
    
    @scala.inline
    def setLineCommentUndefined: Self = StObject.set(x, "lineComment", js.undefined)
  }
}
