package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.overlayscrollbars.mod.ExtensionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictindex extends /* index */ NumberDictionary[ExtensionInfo] {
  
  var length: Double = js.native
}
object Dictindex {
  
  @scala.inline
  def apply(length: Double): Dictindex = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  
  @scala.inline
  implicit class DictindexMutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
