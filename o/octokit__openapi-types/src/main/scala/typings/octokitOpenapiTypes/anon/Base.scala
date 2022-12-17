package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  /** @description The name of the base branch that the head will be merged into. */
  var base: String
  
  /** @description Commit message to use for the merge commit. If omitted, a default message will be used. */
  var commit_message: js.UndefOr[String] = js.undefined
  
  /** @description The head to merge. This can be a branch name or a commit SHA1. */
  var head: String
}
object Base {
  
  inline def apply(base: String, head: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
    
    inline def setCommit_messageUndefined: Self = StObject.set(x, "commit_message", js.undefined)
    
    inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
  }
}
