package typings.pouchdbCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends StObject {
  
  var map: String = js.native
  
  var reduce: js.UndefOr[String] = js.native
}
object Map {
  
  @scala.inline
  def apply(map: String): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduce(value: String): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
  }
}
