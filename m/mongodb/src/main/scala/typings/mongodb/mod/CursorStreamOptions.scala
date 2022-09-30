package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorStreamOptions extends StObject {
  
  /** A transformation method applied to each document emitted by the stream */
  var transform: js.UndefOr[js.ThisFunction1[/* this */ Unit, /* doc */ Document, Document]] = js.undefined
}
object CursorStreamOptions {
  
  inline def apply(): CursorStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorStreamOptions]
  }
  
  extension [Self <: CursorStreamOptions](x: Self) {
    
    inline def setTransform(value: js.ThisFunction1[/* this */ Unit, /* doc */ Document, Document]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
