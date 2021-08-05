package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.overlayscrollbars.mod.ExtensionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictindex
  extends StObject
     with /* index */ NumberDictionary[ExtensionInfo] {
  
  var length: Double
}
object Dictindex {
  
  inline def apply(length: Double): Dictindex = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  
  extension [Self <: Dictindex](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
