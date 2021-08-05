package typings.pdfjsDist.mod

import typings.pdfjsDist.anon.CMapData
import typings.pdfjsDist.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMapReader extends StObject {
  
  def fetch(params: Name): js.Promise[CMapData]
}
object CMapReader {
  
  inline def apply(fetch: Name => js.Promise[CMapData]): CMapReader = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[CMapReader]
  }
  
  extension [Self <: CMapReader](x: Self) {
    
    inline def setFetch(value: Name => js.Promise[CMapData]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
  }
}
