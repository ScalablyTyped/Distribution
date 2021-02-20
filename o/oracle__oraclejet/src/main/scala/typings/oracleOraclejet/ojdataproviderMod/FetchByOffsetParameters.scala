package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchByOffsetParameters[D] extends FetchListParameters[D] {
  
  var offset: Double = js.native
}
object FetchByOffsetParameters {
  
  @scala.inline
  def apply[D](offset: Double, size: Double): FetchByOffsetParameters[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetParameters[D]]
  }
  
  @scala.inline
  implicit class FetchByOffsetParametersMutableBuilder[Self <: FetchByOffsetParameters[_], D] (val x: Self with FetchByOffsetParameters[D]) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
