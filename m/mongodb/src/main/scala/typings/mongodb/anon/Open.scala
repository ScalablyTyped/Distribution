package typings.mongodb.anon

import typings.mongodb.mod.MongoClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  def open(mongoClient: MongoClient): Unit
}
object Open {
  
  inline def apply(open: MongoClient => Unit): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setOpen(value: MongoClient => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
