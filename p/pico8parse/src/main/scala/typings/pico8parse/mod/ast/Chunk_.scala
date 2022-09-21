package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.Chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk_
  extends StObject
     with Base[Chunk]
     with _Node {
  
  var body: js.Array[Statement]
  
  var comments: js.UndefOr[js.Array[Comment_]] = js.undefined
  
  var globals: js.UndefOr[js.Array[Identifier_]] = js.undefined
}
object Chunk_ {
  
  inline def apply(body: js.Array[Statement]): Chunk_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Chunk")
    __obj.asInstanceOf[Chunk_]
  }
  
  extension [Self <: Chunk_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setComments(value: js.Array[Comment_]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: Comment_ *): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setGlobals(value: js.Array[Identifier_]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setGlobalsVarargs(value: Identifier_ *): Self = StObject.set(x, "globals", js.Array(value*))
  }
}
