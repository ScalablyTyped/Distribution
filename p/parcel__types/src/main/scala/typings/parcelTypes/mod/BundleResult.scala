package typings.parcelTypes.mod

import typings.parcelSourceMap.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleResult extends StObject {
  
  val ast: js.UndefOr[AST] = js.undefined
  
  val contents: Blob
  
  val map: js.UndefOr[default | Null] = js.undefined
  
  val `type`: js.UndefOr[String] = js.undefined
}
object BundleResult {
  
  inline def apply(contents: Blob): BundleResult = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleResult] (val x: Self) extends AnyVal {
    
    inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setContents(value: Blob): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setMap(value: default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
