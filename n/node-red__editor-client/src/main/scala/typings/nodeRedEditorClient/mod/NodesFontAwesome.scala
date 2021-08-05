package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesFontAwesome extends StObject {
  
  def getIconList(): js.Array[String]
  
  def getIconUnicode(name: String): String
}
object NodesFontAwesome {
  
  inline def apply(getIconList: () => js.Array[String], getIconUnicode: String => String): NodesFontAwesome = {
    val __obj = js.Dynamic.literal(getIconList = js.Any.fromFunction0(getIconList), getIconUnicode = js.Any.fromFunction1(getIconUnicode))
    __obj.asInstanceOf[NodesFontAwesome]
  }
  
  extension [Self <: NodesFontAwesome](x: Self) {
    
    inline def setGetIconList(value: () => js.Array[String]): Self = StObject.set(x, "getIconList", js.Any.fromFunction0(value))
    
    inline def setGetIconUnicode(value: String => String): Self = StObject.set(x, "getIconUnicode", js.Any.fromFunction1(value))
  }
}
