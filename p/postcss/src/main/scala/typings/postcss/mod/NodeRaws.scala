package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRaws extends js.Object {
  
  /**
    * The space symbols after the last child of the node to the end of
    * the node.
    */
  var after: js.UndefOr[String] = js.native
  
  /**
    * The space between the at-rule's name and parameters.
    */
  var afterName: js.UndefOr[String] = js.native
  
  /**
    * The space symbols before the node. It also stores `*` and `_`
    * symbols before the declaration (IE hack).
    */
  var before: js.UndefOr[String] = js.native
  
  /**
    * The symbols between the property and value for declarations,
    * selector and "{" for rules, last parameter and "{" for at-rules.
    */
  var between: js.UndefOr[String] = js.native
  
  /**
    * The content of important statement, if it is not just "!important".
    */
  var important: js.UndefOr[String] = js.native
  
  /**
    * The space symbols between "/ *" and comment's text.
    */
  var left: js.UndefOr[String] = js.native
  
  /**
    * The space symbols between comment's text and "*\/".
    */
  var right: js.UndefOr[String] = js.native
  
  /**
    * True if last child has (optional) semicolon.
    */
  var semicolon: js.UndefOr[Boolean] = js.native
}
object NodeRaws {
  
  @scala.inline
  def apply(): NodeRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeRaws]
  }
  
  @scala.inline
  implicit class NodeRawsOps[Self <: NodeRaws] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterName(value: String): Self = this.set("afterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterName: Self = this.set("afterName", js.undefined)
    
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBetween(value: String): Self = this.set("between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetween: Self = this.set("between", js.undefined)
    
    @scala.inline
    def setImportant(value: String): Self = this.set("important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportant: Self = this.set("important", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setSemicolon(value: Boolean): Self = this.set("semicolon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemicolon: Self = this.set("semicolon", js.undefined)
  }
}
