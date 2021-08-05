package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRaws extends StObject {
  
  /**
    * The space symbols after the last child of the node to the end of
    * the node.
    */
  var after: js.UndefOr[String] = js.undefined
  
  /**
    * The space between the at-rule's name and parameters.
    */
  var afterName: js.UndefOr[String] = js.undefined
  
  /**
    * The space symbols before the node. It also stores `*` and `_`
    * symbols before the declaration (IE hack).
    */
  var before: js.UndefOr[String] = js.undefined
  
  /**
    * The symbols between the property and value for declarations,
    * selector and "{" for rules, last parameter and "{" for at-rules.
    */
  var between: js.UndefOr[String] = js.undefined
  
  /**
    * The content of important statement, if it is not just "!important".
    */
  var important: js.UndefOr[String] = js.undefined
  
  /**
    * The space symbols between "/ *" and comment's text.
    */
  var left: js.UndefOr[String] = js.undefined
  
  /**
    * The space symbols between comment's text and "*\/".
    */
  var right: js.UndefOr[String] = js.undefined
  
  /**
    * True if last child has (optional) semicolon.
    */
  var semicolon: js.UndefOr[Boolean] = js.undefined
}
object NodeRaws {
  
  inline def apply(): NodeRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeRaws]
  }
  
  extension [Self <: NodeRaws](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterName(value: String): Self = StObject.set(x, "afterName", value.asInstanceOf[js.Any])
    
    inline def setAfterNameUndefined: Self = StObject.set(x, "afterName", js.undefined)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBetween(value: String): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setImportant(value: String): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setSemicolon(value: Boolean): Self = StObject.set(x, "semicolon", value.asInstanceOf[js.Any])
    
    inline def setSemicolonUndefined: Self = StObject.set(x, "semicolon", js.undefined)
  }
}
